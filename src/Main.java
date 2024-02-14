public class Main {
    public static void main(String[] args) {
        Customer jane = new Customer("Jane",400000,"Jane@gmail.com");
        System.out.println(jane.getName());
        System.out.println(jane.getCreditLimit());
        System.out.println(jane.getEmailAddress());

        Customer lenny = new Customer("lenny","lenny@gmail.com");
        System.out.println(lenny.getEmailAddress());
        System.out.println(lenny.getName());
        System.out.println(lenny.getCreditLimit());

        Customer joe= new Customer();
        System.out.println(joe.getEmailAddress());
        System.out.println(joe.getName());
        System.out.println(joe.getCreditLimit());
    }
}