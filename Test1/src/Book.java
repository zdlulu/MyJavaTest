/**
 * Created by Administrator on 2017/6/28.
 */
public class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return  author;
    }

    public double getPrice(){
        return price;
    }
}
