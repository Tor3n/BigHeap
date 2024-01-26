package commonProblems.fizzBuzz;

public class FizzBuzz {
    public static void main(String[] args){
        for(int i =1; i<=25; i++){
            //3 == fizz ; 5 == buzz
            String res = ((i%3 == 0)&&(i%5 == 0)) ? "fizzBuzz" : ((i%3 == 0) ? "fizz" : ((i%5 == 0) ? "buzz" : String.valueOf(i)));
            System.out.println(i+" : "+res);
        }
    }
}
