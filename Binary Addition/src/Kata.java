public class Kata {
    public static void main(String[] args) {
        System.out.println(binaryAddition(5,9));
    }
    public static String binaryAddition(int a, int b){

        String bin = "";
        int resto =0;
        int num = a+b;

        do {
            resto =  num % 2;
            System.out.println(num);
            if (resto==0)
                bin += "0";
            else
                bin +=1;
            num /= 2;
        }while (num != 0);
        return new StringBuilder(bin).reverse().toString();
    }

    
}
