/*程序建立时间:2017/06/28
  主题：继承与重写
  输出：继承遵循父类的规则，重写后按照重写后的方法内容执行
*/

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.print("Dog的结果:");
        dog.cry();
        dog.name();
        System.out.println("/.../.../.../.../");
        Sheep sheep = new Sheep();
        System.out.print("Sheep的结果:");
        sheep.cry();
        sheep.name();
    }
}
