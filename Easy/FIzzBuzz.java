package Easy;

import java.util.*;

public class FIzzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(10));
	}
	public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for(int i=1;i<=n;i++){
            answer.add(
                (i%3 == 0 && i%5 == 0)?"FizzBuzz"
                    :(i%3 == 0)?"Fizz"
                    :(i%5 == 0)?"Buzz"
                    :i+""
            );
        }
        return answer;
    }
}
