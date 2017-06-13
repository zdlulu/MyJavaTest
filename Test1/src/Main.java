/*程序建立时间:2017/06/13
  主题：在控制台显示乘法表*/


public class Main {

    public static void main(String[] args) {
        int[] arr_multi_first  = {1,2,3,4,5,6,7,8,9};
        int[] arr_multi_second = {1,2,3,4,5,6,7,8,9};

        for(int int_first:arr_multi_first){
            String s = "";
            for(int int_second:arr_multi_second){
                if(int_second<=int_first){
                    int result = int_first*int_second;
                    s += int_first+"*"+int_second+"="+result+",";
                    if(int_second==int_first){
                        System.out.println(s);
                    }
                }
            }

        }
    }
}
