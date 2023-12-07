package fin3busongan_d;


public class LocalBranch extends Group {
    private final String state;

    public LocalBranch(String groupName, int accountNumber, String state) {
        super(groupName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Account Number:"  + accountNumber);
        System.out.println("State:" + state);
    }
}
