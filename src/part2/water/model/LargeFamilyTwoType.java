package part2.water.model;

public class LargeFamilyTwoType extends Invoice{
    private static final int DISCOUNT_BY_SANITATION = 75;
    private static final int DISCOUNT_BY_RESIDUAL = 50;
    private static final float MAX_DISCOUNT = 16;

    public LargeFamilyTwoType(float amountByConsumption, float amountBySanitation, float amountByResidual) {
        super(amountByConsumption, amountBySanitation, amountByResidual,DISCOUNT_BY_SANITATION, DISCOUNT_BY_RESIDUAL);
    }

    @Override
    public float getAmountInvoice() {
        return getAmountByConsumption() + checkDiscount(getAmountBySanitation() *(1 + ((float) getDiscountByConsumption()/100))) + checkDiscount(1 + (getAmountByResidual()*((float) getDiscountByResidual() /100)));
    }

    private float checkDiscount(float inputAmount){
        if (inputAmount > MAX_DISCOUNT){
            inputAmount = MAX_DISCOUNT;
            return inputAmount;
        }
        return inputAmount;
    }

    @Override
    public void showInvoice() {
        System.out.printf("""
                DETAIL INVOICE
                ==============
                Consumption: %.1f
                Sanitation: %.1f
                Residuals: %.1f
                Discount to Sanitation: %d.0
                Discount to Residuals: %d.0
                SUBTOTAL: %.1f
                TOTAL: %.1f
                """,getAmountByConsumption(),getAmountBySanitation(),getAmountByResidual(),DISCOUNT_BY_SANITATION,DISCOUNT_BY_RESIDUAL,getAmountInvoiceWithDiscount(),getAmountInvoice());
    }

    public static void main(String[] args) {
        Invoice invoice = new LargeFamilyTwoType(30.0f,100.0f,110.0f);
        invoice.showInvoice();
    }
}
