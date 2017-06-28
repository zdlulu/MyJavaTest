/*程序建立时间:2017/06/28
  主题：类
  输出：强化类的概念和正确的使用类
*/


import org.omg.CORBA.TypeCodePackage.BadKind;

public class Main {

    public static void main(String[] args) {
        Book book  = new Book("《Java从入门到精通》","出版社",59.8);
        System.out.println("书名:"+ book.getTitle());
        System.out.println("作者:"+book.getAuthor());
        System.out.println("价格:"+book.getPrice());
    }
}
