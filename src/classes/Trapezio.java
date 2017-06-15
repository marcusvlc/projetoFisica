
package classes;
public class Trapezio {

  /**********************************************************************
   * Standard normal distribution density function1
   * Replace with any sufficiently smooth function.
   **********************************************************************/
   static double f(double x) {
	   // funcao utilizada no calculo corrente
       return Math.pow(x, 2);
   }

  /**********************************************************************
   * Integra f de a a b usando a regra do trapezio.
   * Quanto maior o valor de qntDeTrapezios maior a precisao.
   **********************************************************************/
   static double integracaoPorTrapezio(double a, double b, int qntDeTrapezios) {
      // define a altura do trapezio baseado no intervalo de integracao
	  double altura = (b - a) / qntDeTrapezios;
	  // variavel para calcular a area do trapezio para todos os elementos dentro do intervalo
	  double x;
	  // acumulador das medias das bases de trapezios
      double soma = 0.5 * (f(a) + f(b));
      // calcula qntDeTrapezios -1 medias de base de trapezios e acumula em "soma"
      for (int i = 1; i < qntDeTrapezios; i++) {
         x = a + altura * i;
         soma += f(x);
      }
      //multiplica a soma das bases pela altura, terminando o calculo da area do trapezio
      return soma * altura;
   }



   /*
    * Metodo principal para a execucao do programa
    */
   public static void main(String[] args) { 
      double a = Double.parseDouble("0");
      double b = Double.parseDouble("6");
      System.out.println(integracaoPorTrapezio(a, b, 100000));
   }

}