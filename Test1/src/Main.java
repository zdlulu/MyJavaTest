/*程序建立时间:2017/06/28
  主题：重载
  输出：是指一个类中出现多个方法名相同，但参数个数或参数类型不同的方法
       称之为方法的重载
*/
public class Main {

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        float l = 20;
        float w = 30;
        float a_r = calculate.getArea(l,w);
        System.out.println("求长为:"+l+"宽为"+w+"的矩形面积是:"+a_r);

        float r =7;
        float a_c = calculate.getArea(r);
        System.out.println("求半径为:"+r+"的圆形面积是:"+a_c);

        int num = 7;
        calculate.draw(num);
        calculate.draw("三角形");
    }
}
