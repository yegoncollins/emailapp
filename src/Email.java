import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //constructor to receive firstname and lastname
    public Email(String firstName, String lastName){
              this.firstName = firstName;
              this.lastName = lastName;

              System.out.println("Email Created:" + this.firstName + " " + this.lastName);
              this.department = setDepartment();
              System.out.println("Department: " + this.department);
    }
    //ask for the department
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {return "sales";}
        else if (depChoice == 2) { return "dev";}
        else if (depChoice == 3) { return "acc";}
        else  {return "";}
    }
    //generate random password

    //set mailbox capacity

    //set alternate email

    //change the password
}
