import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book("Sherlock Homes"));
        printables.add(new Magazine(" New Time"));
        printables.add(new Book("Harry Potter"));
        printables.add(new Magazine("National Geographic"));
for (Printable printable : printables ){
    printable.print();
}
        System.out.println("""
                
                
                
                """);
        System.out.println("|||||     Magazines titles     |||||");
        System.out.println("""
                """);

        Magazine.printMagazines(printables.toArray(new Printable[0]));
        System.out.println("""
                """);        System.out.println("""
                """);

        System.out.println("|||||     Books titles         |||||");
        System.out.println("""
                """);

        Book.printBooks(printables.toArray(new Printable[0]));
    }
}