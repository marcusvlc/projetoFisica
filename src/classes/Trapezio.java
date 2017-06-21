
package classes;
public class Trapezio {
    private static double soma;

   static double f1(double x) {
	   // funcao utilizada no calculo corrente
       return Math.pow(x, 2);
   }
   
   static double f2(double x) {
       return 1;
   }
   
   static double f3(double x) {
       return Math.sin(x);
   }
   
   static double f4(double x) {
       return Math.cos(x);
   }

  /**********************************************************************
   * Integra f de a a b usando a regra do trapezio.
   * Quanto maior o valor de qntDeTrapezios maior a precisao.
   **********************************************************************/
   public static double integracaoPorTrapezio(double a, double b, int qntDeTrapezios, int indicador) {
      // define a altura do trapezio baseado no intervalo de integracao
	  double altura = (b - a) / qntDeTrapezios;
	  // variavel para calcular a area do trapezio para todos os elementos dentro do intervalo
	  double x;
	  // acumulador das medias das bases de trapezios
      if(indicador == 0) {
          soma = 0.5 * (f1(a) + f1(b));
      }
      if(indicador == 1) {
           soma = 0.5 * (f2(a) + f2(b));
      }
      if(indicador == 2) {
           soma = 0.5 * (f3(a) + f3(b));
      }
      if(indicador == 3) {
           soma = 0.5 * (f4(a) + f4(b));
      }
      
      // calcula qntDeTrapezios -1 medias de base de trapezios e acumula em "soma"
      for (int i = 1; i < qntDeTrapezios; i++) {
         x = a + altura * i;
         if(indicador == 0) {
           soma += f1(x);
         }
         if(indicador == 1) {
             soma += f2(x);
         }
         if(indicador == 2) {
           soma += f3(x);
        }
         if(indicador == 3) {
           soma += f4(x);
        }
      }
      //multiplica a soma das bases pela altura, terminando o calculo da area do trapezio
      return soma * altura;
   }

   

}