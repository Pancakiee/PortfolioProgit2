package fin5busongan_d;

class Life extends Insurance {
    public Life() {
        super("Life");
        setCost();
    }

    @Override
    public void setCost() {
        this.monthlyPrice = 3800;
    }

    @Override
    public void display() {
        System.out.println("Insurance Type: " + getType());
        System.out.println("Monthly Price: $" + getMonthlyPrice());
    }
}