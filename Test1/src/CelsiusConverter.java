import java.util.Date;

/**
 * Created by Administrator on 2017/6/28.
 */
public class CelsiusConverter {
    private double celsius,fahrenheit;

    public CelsiusConverter(double  celsius){
        this.celsius = celsius;
        cel_to_fah(celsius);
    }

    public void setFahrenheit(double fahrenheit){
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit(){
        return fahrenheit;
    }


    public void cel_to_fah(double celsius){
        fahrenheit = celsius*1.8 +32;
        setFahrenheit(fahrenheit);
    }

}
