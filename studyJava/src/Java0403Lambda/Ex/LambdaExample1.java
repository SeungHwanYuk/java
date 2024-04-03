package Java0403Lambda.Ex;

interface IntCalculator {
    int calculate(int a, int b);

}
public class LambdaExample1 {
    public static void main(String[] args) {
        // calculate 함수의 정의 = 두개의 매개변수의 덧셈 (제한된 옛날 람다식)
        IntCalculator adder = (a,b) -> a+b;
        int result = adder.calculate(5,3);
        System.out.println(result);

        printResult(4,6,(x,y)-> x*y*10);
        printResult(7,8,(x,y)-> x*y/10); // 사용자 정의 계산식
    }

    public static void printResult(int x,int y,IntCalculator calculator) {  // 기존의 (int x, int y, String str) 자리에 계산식이 들어감
        /*if (str.equals("plus")) {     // printResult()를 건들지 않고
            System.out.println(x+y);*/  // 람다식의 IntCalculator(계산식)을 던져줄 수 있다 (옛날 람다식에 비해 사용범위가 좋음)
        System.out.println("Result : "+ calculator.calculate(x,y));
        }
    }

