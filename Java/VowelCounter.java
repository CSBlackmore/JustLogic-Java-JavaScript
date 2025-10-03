public class VowelCounter {
    public static int countVowels(String text) {
        int totalVocales = 0;

        for (int indice = 0; indice < text.length(); indice++) {
            char caracterActual = text.charAt(indice);

            switch (caracterActual) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                totalVocales++;
            }
        }
        return totalVocales;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("hello world")); // esperado: 3 (e, o, o)
    }
}

