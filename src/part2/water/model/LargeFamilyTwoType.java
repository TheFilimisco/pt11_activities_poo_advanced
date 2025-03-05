package part2.water.model;

public class LargeFamilyTwoType extends Invoice{
    private static final int DISCOUNT_BY_CONSUMPTION = 75;
    private static final int DISCOUNT_BY_RESIDUAL = 50;

    public LargeFamilyTwoType(float amountByConsumption, float amountBySanitation, float amountByResidual) {
        super(amountByConsumption, amountBySanitation, amountByResidual, DISCOUNT_BY_CONSUMPTION, DISCOUNT_BY_RESIDUAL);
    }

    @Override
    protected float getAmountInvoice() {
        return getAmountByConsumption() + (getAmountBySanitation() * ((float) getDiscountByConsumption() /100)) + (getAmountByResidual()*((float) getDiscountByResidual() /100));
    }

    @Override
    protected void showInvoice() {

    }
}
