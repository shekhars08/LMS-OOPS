public class Member extends User {
    private int borrowedBooksCount;
    private static final  int MAX_BORROWED_BOOKS = 5;

    public Member(){
        super();
        this.borrowedBooksCount = 0;
    }

    public Member(String name, String contactInfo){
        super(name, contactInfo);
        this.borrowedBooksCount = 0;
    }

    public Member(Member other){
        super(other);
        this.borrowedBooksCount = 0;
    }

    @Override
    public void displayDashboard() {
        System.out.println("-----Member DashBoard-----");
        System.out.println("Name " + getName());
        System.out.println("User Id " +getUserId());
        System.out.println("Borrowed Books Count " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks() {
        return borrowedBooksCount < MAX_BORROWED_BOOKS;
    }

    public void borrowBooks(){
        if(canBorrowBooks()){
            borrowedBooksCount++;
            System.out.println(getName() + " borrowed a book.");
        }
        else {
            System.out.println("Borrow Limit Reached!");
        }
    }

    public void returnBooks(){
        if(borrowedBooksCount > 0){
            borrowedBooksCount--;
            System.out.println(getName() + " returned a book.");
        }
        else {
            System.out.println("No borrowed book to return");
        }
    }

    public  int getBorrowedBooksCount(){
        return borrowedBooksCount;
    }
}
