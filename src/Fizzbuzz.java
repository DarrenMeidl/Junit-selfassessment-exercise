//import java.util.Random;
public class Fizzbuzz {
    /*Random rand = new Random();
    public int num = rand.nextInt();*/
    public String fizzBuzz(int num){
        if (num/3 != 0 && num/5 != 0){
            return Integer.toString(num);
        }
        else if (num/3 == 0 && num/5 != 0){
            String answer = "fizz";
            return answer;
        }
        else if (num/3 != 0 && num/5 == 0){
            String answer = "buzz";
            return answer;
        }
        else if (num/3 == 0 && num/5 == 0){
            String answer = "fizzbuzz";
            return answer;
        }
    }
}
