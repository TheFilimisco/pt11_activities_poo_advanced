package part2.water.model;

public abstract class Invoice {
    private float amountByConsumption;
    private float amountBySanitation;
    private float amountByResidual;
    private int discountByConsumption;
    private int discountByResidual;

    protected Invoice(float amountByConsumption, float amountBySanitation, float amountByResidual, int discountByConsumption, int discountByResidual) {
        this.amountByConsumption = amountByConsumption;
        this.amountBySanitation = amountBySanitation;
        this.amountByResidual = amountByResidual;
        this.discountByConsumption = discountByConsumption;
        this.discountByResidual = discountByResidual;
    }

    protected float getAmountByConsumption() {
        return amountByConsumption;
    }

    protected void setAmountByConsumption(float amountByConsumption) {
        this.amountByConsumption = amountByConsumption;
    }

    protected float getAmountBySanitation() {
        return amountBySanitation;
    }

    protected void setAmountBySanitation(float amountBySanitation) {
        this.amountBySanitation = amountBySanitation;
    }

    protected float getAmountByResidual() {
        return amountByResidual;
    }

    protected void setAmountByResidual(float amountByResidual) {
        this.amountByResidual = amountByResidual;
    }

    protected int getDiscountByConsumption() {
        return discountByConsumption;
    }

    protected void setDiscountByConsumption(int discountByConsumption) {
        this.discountByConsumption = discountByConsumption;
    }

    protected int getDiscountByResidual() {
        return discountByResidual;
    }

    protected void setDiscountByResidual(int discountByResidual) {
        this.discountByResidual = discountByResidual;
    }

    protected float getAmountInvoiceWithDiscount() {
        return getAmountByConsumption()+getAmountBySanitation()+getAmountByResidual();
    }

    protected abstract float getAmountInvoice();

    public abstract void showInvoice();

    @Override
    public String toString() {
        return "Invoice{" +
                "amountByConsumption=" + amountByConsumption +
                ", amountBySanitation=" + amountBySanitation +
                ", amountByResidual=" + amountByResidual +
                ", discountByConsumption=" + discountByConsumption +
                ", discountByResidual=" + discountByResidual +
                '}';
    }
}
