import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class book {
    int price;
    String name;
    book(int price,String name){
        this.price=price;
        this.name=name;
    }
}
class runner{
    static void sort(book record[]){
        //code of sorting
        for(int i=0;i<)
    }
    void ppp(book record[]){
        //print
    }

    public static void main (String[]agrs) throws IOException {

        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("enter no of entry");
        int cp=Integer.parseInt(br.readLine());

        book record[]=new book[cp];
        for (int i=0;i<cp;i++) {
            System.out.println("enter prize and name of book " + i);
            int pr=Integer.parseInt(br.readLine());
            String nm=br.readLine();
            book Book = new book(pr,nm);
            record[i].price=Book.price;
            record[i].name=Book.name;
        }

    }
}