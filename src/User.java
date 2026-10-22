public abstract class User {

     private final String  userId;
     private String name;
     private String contactInfo;

     public static int idCounter = 0;
     public static int totalUser = 0;

 //Default Constructor
    public User(){
        this.userId = generateUniqueId();
        totalUser++;
    }

    //Parameterize Constructor
    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUser++;
    }

    //Copy Constructor
    public User(User other){
        this.userId = generateUniqueId();
        this.name = other.getName();
        this.contactInfo = other.getContactInfo();
        totalUser++;
    }

    public static String generateUniqueId(){
        return "U-" +(++idCounter);
    }

    public String getName() {
          return name;
     }

     public String getContactInfo() {
          return contactInfo;
     }

     public void setName(String name) {
          this.name = name;
     }

     public void setContactInfo(String contactInfo) {
          this.contactInfo = contactInfo;
     }

    public String getUserId() {
        return userId;
    }

    public static  int getTotalUser(){
        return totalUser;
    }

    //Abstract Method
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}
