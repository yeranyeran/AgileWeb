public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 1; i <= 200; i++) {
            System.out.println("gitee更新测试");
            System.out.println("Fibonacci.of(" + i + ") == " + fibonacci(i));
        }
    }

    public static long fibonacci(int i) {
        if(i == 1 || i == 2) {
            return 1;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }
}
