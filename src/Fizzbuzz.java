//import java.util.Random;
public class Fizzbuzz {
    /*Random rand = new Random();
    public int num = rand.nextInt();*/
    public String fizzBuzz(int num){
        String answer = "ERROR";
        if (num%3 != 0 && num%5 != 0){
            answer = Integer.toString(num);
        }
        else if (num%3 == 0 && num%5 != 0){
            answer = "fizz";
        }
        else if (num%3 != 0 && num%5 == 0){
            answer = "buzz";
        }
        else if (num%3 == 0 && num%5 == 0){
            answer = "fizzbuzz";
        }
        return answer;
    }
}
