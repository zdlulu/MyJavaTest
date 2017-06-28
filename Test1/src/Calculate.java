/**
 * Created by Administrator on 2017/6/28.
 */
public class Calculate {
    final float PI = 3.14159f;

    public float getArea(float r){
        float area = PI*r*r;
        return area;
    }

    public float getArea(float l,float w){
        float area = l*w;
        return area;
    }

    public void draw(int num){
        System.out.println("画num个图形:"+num);
    }

    public void draw(String shape){
        System.out.println("画一个shape:"+shape);
    }
}
