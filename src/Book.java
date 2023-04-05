public class Book implements Printable {
    private String title;

    @Override

    public void print() {
        System.out.println("Book title - "+title);

    }


    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public static void printBooks(Printable[] printable){
        for(Printable p : printable){
            if(p instanceof Book){
                p.print();
            }
        }
    }
}
