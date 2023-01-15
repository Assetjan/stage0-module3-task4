package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double pow = Math.pow(a,2);
        double res = ((9*pow-5*b+2+a-7)*((a+b-4*a*b)/2));
        System.out.println(res);

    }
}
