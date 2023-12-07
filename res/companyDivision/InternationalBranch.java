package fin3busongan_d;


public class InternationalBranch extends Group {
    private String country;
    private String languageSpoken;

    public InternationalBranch(String groupName, int accountNumber, String country, String languageSpoken) {
        super(groupName, accountNumber);
        this.country = country;
        this.languageSpoken = languageSpoken;
    }

    
    public void display() {
        System.out.println("Group Name:" + groupName);
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Country:" + country);
        System.out.println("Language Spoken:" + languageSpoken);
    }
}

