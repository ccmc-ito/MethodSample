public class Main {

    public static void main(String[] args) {
        System.out.println(" -- Start --");

        // コマンドライン引数の利用
        for (String str : args) {
            System.out.println(str);
        }

        System.out.println(" -- Finish --");
        
    }

    // 整数の累乗を返すメソッド
    static int power(int base, int exp) {
        if (exp == 0) return 1;
        if (exp < 0) return 0;

        exp--;
        return base * power(base, exp);
    }

    // 実数の累乗を返すメソッド
    static double power(double base, int exp) {
        if (exp == 0) return 1;

        if (exp < 0) exp++;
        else exp--;
        return base * power(base, exp);
    }

    // 整数の総和を返すメソッド
    static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 実数の総和を返すメソッド
    static double sum(double... numbers) {
        double total = 0;
        for (double n : numbers) {
            total += n;
        }
        return total;
    }
}