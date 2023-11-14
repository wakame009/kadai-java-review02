
public class Review02 {
    public static void main(String[] args) {
        // 1から100までの連続した整数を表示
        for (int i=1; i<=100; i++) {
         // ３でも５でも割り切れないなら "Fizz Buzz"を表示する
            if (i%3==0 && i%5==0) {
                System.out.println("Fizz Buzz");
        //3で割り切れる数なら “Fizz” と表示する
            } else if (i%3==0) {
                System.out.println("Fizz");
        //5で割り切れる数なら “Buzz” と表示する
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }    }
}
        


