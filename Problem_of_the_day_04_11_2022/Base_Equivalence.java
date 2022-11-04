package Problem_of_the_day_04_11_2022;

public class Base_Equivalence {
    static String baseEquiv(int n, int m){   

        String str = String.valueOf(n);

        for(int i=2;i<=32;i++){

            String a = Integer.toString( Integer.parseInt(str), i);

            if(a.length() == m){

                return "Yes";

            }

        }

        return "No";

    }
    public static void main(String[] args) {
        System.out.println(baseEquiv(8,2));
    }
}
