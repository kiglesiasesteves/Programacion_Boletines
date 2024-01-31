public class Main {

        public static void main(String[] args) {
            // 1. Mostrar la longitud del texto
            String texto1 = "Esto é Java!";
            System.out.println("1. Longitud del texto: " + texto1.length());

            // 2. Desmenuzar el String "Java" caracter a caracter
            String texto2 = "Java";
            System.out.println("2. Desmenuzar el String \"Java\":");
            for (char c : texto2.toCharArray()) {
                System.out.println("   - " + c);
            }

            // 3. Invertir el texto "Java desde 0"
            String texto3 = "Java desde 0";
            StringBuilder textoInvertido = new StringBuilder(texto3).reverse();
            System.out.println("3. Texto invertido: " + textoInvertido);

            // 4. Eliminar espacios del texto "James Gosling Created Xava"
            String texto4 = "James Gosling Created Xava";
            String textoSinEspacios = texto4.replaceAll("\\s", "");
            System.out.println("4. Texto sin espacios: " + textoSinEspacios);

            // 5. Contar vocales y consonantes en "java java java"
            String texto5 = "java java java";
            int vocales = 0;
            int consonantes = 0;
            for (char c : texto5.toCharArray()) {
                if ("aeiouAEIOU".contains(String.valueOf(c))) {
                    vocales++;
                } else if (Character.isLetter(c)) {
                    consonantes++;
                }
            }
            System.out.println("5. Vocales: " + vocales);
            System.out.println("   Consonantes: " + consonantes);

            // 6. Dividir la cadena "www. javadesde0. com" en dos partes
            String texto6 = "www. javadesde0. com";
            String parte1 = texto6.substring(0, 11);
            String parte2 = texto6.substring(12);
            String concatenado = parte1.concat(parte2);
            System.out.println("6. Parte 1: " + parte1);
            System.out.println("   Parte 2: " + parte2);
            System.out.println("   Concatenado: " + concatenado);

            // 7. Transformar "javeros" a mayúsculas y luego a minúsculas
            String texto7 = "javeros";
            String mayusculas = texto7.toUpperCase();
            String minusculas = mayusculas.toLowerCase();
            System.out.println("7. Mayúsculas: " + mayusculas);
            System.out.println("   Minúsculas: " + minusculas);

            // 8. Comparar si "Java" es igual a "JavaScript"
            String texto8a = "Java";
            String texto8b = "JavaScript";
            boolean sonIguales = texto8a.equals(texto8b);
            System.out.println("8. ¿Son iguales? " + sonIguales);

            // 9. Reemplazar vocales en "Jeve jeve jeve" por 'a'
            String texto9 = "Jeve jeve jeve";
            String reemplazado = texto9.replaceAll("[aeiouAEIOU]", "a");
            System.out.println("9. Reemplazado: " + reemplazado);

            // 10. Transformar caracteres de "ABCD" a ASCII
            String texto10 = "ABCD";
            System.out.println("10. Transformación a ASCII:");
            for (char c : texto10.toCharArray()) {
                System.out.println("   " + c + ": " + (int) c);
            }

            // 11. Contar letras, dígitos y espacios en blanco
            String texto11 = "Ola, son alumno de DAM1, e son programador desde o 2021";
            contarCaracteres(texto11);
        }

        public static void contarCaracteres(String texto) {
            int letras = 0;
            int digitos = 0;
            int espacos = 0;

            for (char c : texto.toCharArray()) {
                if (Character.isLetter(c)) {
                    letras++;
                } else if (Character.isDigit(c)) {
                    digitos++;
                } else if (Character.isWhitespace(c)) {
                    espacos++;
                }
            }

            System.out.println("11. Conteo de caracteres:");
            System.out.println("   Letras: " + letras);
            System.out.println("   Dígitos: " + digitos);
            System.out.println("   Espacios en blanco: " + espacos);
        }
    }



