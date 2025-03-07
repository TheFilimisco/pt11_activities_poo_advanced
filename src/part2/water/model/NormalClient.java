package part2.water.model;

public class NormalClient extends Invoice{

    public NormalClient(float amountByConsumption, float amountBySanitation, float amountByResidual) {
        super(amountByConsumption, amountBySanitation, amountByResidual, 0, 0);
    }

    @Override
    public float getAmountInvoice() {
        return getAmountByConsumption()+getAmountBySanitation()+getAmountByResidual();
    }

    @Override
    public void showInvoice() {
            System.out.printf("""
                DETAIL INVOICE
                ==============
                Consumption: %.1f
                Sanitation: %.1f
                Residuals: %.1f
                Discount to Sanitation: 0.00
                Discount to Residuals: 0.00
                SUBTOTAL: %.1f
                TOTAL: %.1f
                """,getAmountByConsumption(),getAmountBySanitation(),getAmountByResidual(),getAmountInvoiceWithDiscount(),getAmountInvoice());
    }


}
