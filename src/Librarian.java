import java.awt.print.Book;

public class Librarian extends User{

    private final String employeeNumber;

    // 1. Default Constructor
    public Librarian() {
        super();
        this.employeeNumber = "";
    }

    // 2. Parameterized Constructor
    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    // 3. Copy Constructor
    public Librarian(Librarian other) {
        super(other);
        this.employeeNumber = other.employeeNumber;
    }

    // Getter
    public String getEmployeeNumber() {
        return employeeNumber;
    }


    @Override
    public void displayDashboard() {
        System.out.println("-----Librarian DashBoard-----");
        System.out.println("Name " + getName());
        System.out.println("User Id " +getUserId());
        System.out.println("Employee Number " + employeeNumber);

    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    void addNewBook(Book book) {}

    void removeBook(Book book) {}
}
