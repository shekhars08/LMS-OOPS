//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Member member = new Member("Shekhar", "ss123@gmail.com");
        Librarian librarian = new Librarian("Messi", "goat@gmail.com", "EMP-10");


        member.displayDashboard();
        librarian.displayDashboard();

        System.out.println("Member ID: " + member.getUserId());
        System.out.println("Librarian ID: " + librarian.getUserId());

        System.out.println("Total Users: " + User.getTotalUser());

    }
}
