package fin5busongan_d;

class Health extends Insurance {
    public Health() {
        super("Health");
        setCost();
    }

    @Override
   public void setCost() {
        this.monthlyPrice = 5000;
    }

    @Override
    public void display() {
        System.out.println("Insurance Type: " + getType());
        System.out.println("Monthly Price: $:" + getMonthlyPrice());
    }
}