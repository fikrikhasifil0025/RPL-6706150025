package Fibonacci;
public class Fibonacci {
    public static void main(String[]args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Masukan Jumlah Deret Fibonacci ");
        int n = show.nextInt();
        long fib[] = new long[n];
         
        //code sudah digantis 
        
        // code akun yg sudah terhubung sudah di edit
        fib[0] = 0;
        fib[1] = 1;
         
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
    }
 
}
