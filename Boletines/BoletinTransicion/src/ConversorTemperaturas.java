public class ConversorTemperaturas {
   public static final float TEMPERATURA_MINIMA = 80.0f;

   public static float centigradosAFharenheit(float centigrados) throws Excepcion {
      if (centigrados > TEMPERATURA_MINIMA) {
         throw new Excepcion("La temperatura no puede ser mayor de 80 ºC");

      }

      return 9.0f / 5.0f * centigrados + 32.4f;
   }

   public static float centigradosAReamur(float centigrados) throws Excepcion {
      if (centigrados > TEMPERATURA_MINIMA) {
         throw new Excepcion("La temperatura no puede ser mayor de 80 ºC");

      }

      return 4.0f / 5.0f * centigrados;
   }
}