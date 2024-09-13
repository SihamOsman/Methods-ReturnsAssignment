public class Main2 {
    public static void main(String[] args) {
    Users user1= new Users("Siham","Osman","Siham@gmail.com","Home1234");
    Users user2= new Users("Bob","James","bob@gmail.com","bob1234");
        System.out.println(user1.getFirstName());
        System.out.println(user1.getLastName());
        System.out.println(user1.getEmail());
        System.out.println(user1.getPassword());
        user1.setPassword("Siham1234");


    }
}
