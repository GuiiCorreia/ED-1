import java.text.DecimalFormat;
import java.util.Scanner;

public class atvPortugol {
        public static void main(String[] args) {

                try (Scanner scan = new Scanner(System.in)) {
                        double a, b;
                        System.out.println("Digite um numero: ");
                        a = scan.nextDouble();

                        b = Math.sqrt(a);
                        System.out.println("A raiz de " + a + " e: " + b);

                        b = Math.cbrt(a);
                        System.out.println("O valor(raiz cubica) e: " + b);

                        b = (Math.exp(1 / 2 * Math.log(a)));
                        DecimalFormat formatador = new DecimalFormat(".0");
                        System.out.println("O valor (int de exp, log) de " + a + " e: " + formatador.format(b));

                        b = (Math.exp(1 / 2 * Math.log(a)));
                        System.out.println("O valor de (exp, log) " + a + " e: " + b);

                        b = (float) (Math.sin(45 * Math.PI / 180) + 0.00013);
                        System.out.println("O valor((sen(45*pi/180)+0.0001,3) e: " + formatador.format(b));

                        b = (Math.exp(3 * Math.log(8)) + 0.0013);
                        System.out.println("O valor(potencia com exp e log) e: " + formatador.format(b));

                        b = (Math.exp(3 * Math.log(8)) + 0.0013);
                        System.out.println("O valor(potencia com exp e log) e: " + b);

                        b = Math.exp(3 * Math.log(8));
                        System.out.println("O valor(potencia com exp e log) e: " + b);

                        b = Math.abs(-8);
                        System.out.println("O valor(absoluto) e: " + b);

                        System.out.println("O valor em float e: " + a);

                        int c = (int) Math.round(a);
                        System.out.println("O valor em int e: " + c);
                        System.exit(0);
                }
        }
}