package part2.water.model;

public class LargeFamilyOneType extends Invoice{
    private static final int DISCOUNT_BY_CONSUMPTION = 25;
    private static final int DISCOUNT_BY_RESIDUAL = 25;

    public LargeFamilyOneType(float amountByConsumption, float amountBySanitation, float amountByResidual) {
        super(amountByConsumption, amountBySanitation, amountByResidual,DISCOUNT_BY_CONSUMPTION ,DISCOUNT_BY_RESIDUAL);
    }

    @Override
    public float getAmountInvoice() {
        return getAmountByConsumption() + (getAmountBySanitation() * ((float) getDiscountByConsumption() /100)) + (getAmountByResidual()*((float) getDiscountByResidual() /100));
    }

    @Override
    public void showInvoice() {
    }
}
