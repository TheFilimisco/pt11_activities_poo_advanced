package part2.water.model;

public class LargeFamilyOneType extends Invoice{
    private static final int DISCOUNT_BY_SANITATION = 25;
    private static final int DISCOUNT_BY_RESIDUAL = 25;

    public LargeFamilyOneType(float amountByConsumption, float amountBySanitation, float amountByResidual) {
        super(amountByConsumption, amountBySanitation, amountByResidual,DISCOUNT_BY_SANITATION ,DISCOUNT_BY_RESIDUAL);
    }

    @Override
    public float getAmountInvoice() {
        return getAmountByConsumption() + (getAmountBySanitation() * (1 + ((float) getDiscountByConsumption() /100))) + (getAmountByResidual()*(1 + ((float) getDiscountByResidual() /100)));
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
}
