package part2.water.model;

public class NormalClient extends Invoice{

    public NormalClient(float amountByConsumption, float amountBySanitation, float amountByResidual, int discountByConsumption, int discountByResidual) {
        super(amountByConsumption, amountBySanitation, amountByResidual, discountByConsumption, discountByResidual);
    }

    @Override
    protected float getAmountInvoice() {
        return getAmountByConsumption()+getAmountBySanitation()+getAmountByResidual();
    }

    @Override
    protected void showInvoice() {

    }


}
