package Medium;
import java.util.*;
public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String intToRoman(int num) {
        int[] numbers={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1000,"M");
        hm.put(900,"CM");
        hm.put(500,"D");
        hm.put(400,"CD");
        hm.put(100,"C");
        hm.put(90,"XC");
        hm.put(50,"L");
        hm.put(40,"XL");
        hm.put(10,"X");
        hm.put(9,"IX");
        hm.put(5,"V");
        hm.put(4,"IV");
        hm.put(1,"I");
        StringBuilder str=new StringBuilder();
          int i=0;
            while(num>0){
                if(num>=numbers[i]){
                    num=num-numbers[i];
                    str.append(hm.get(numbers[i]));
                }
                else{
                    i++;
                }
              
            }
        return str.toString();
    }
}
