public class Magazine implements Printable{
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Magazine title - "+title);

    }
    public static void printMagazines(Printable[] printable){
        for(Printable pr : printable){
            if(pr instanceof Magazine ){
                pr.print();
            }

        }
    }
}
