package fin3busongan_d;

public abstract class Group {
    protected String groupName;
    protected int accountNumber;

    public Group(String groupName, int accountNumber) {
        this.groupName = groupName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}