public class ReverseString {
    public static String reverse(String text) {
        if (text == null || text.isEmpty()) {
            return "ritrevni euq sarbalap yah on";
        }

        String [] palabrasDeTexto = text.split("\\s+");
    /*
    "\\s+": Es el separador, conocido como expresión regular (regex).
    \\s: Representa cualquier carácter de espacio en blanco (un espacio normal, una tabulación, un salto de línea, etc.).
    +: Significa "uno o más" del elemento anterior. 
    */
        StringBuilder textoInvertido = new StringBuilder();

        for (String palabra : palabrasDeTexto) {
            StringBuilder palabraNueva = new StringBuilder(palabra);
            textoInvertido.append(palabraNueva.reverse().toString()).append(" ");
        }
        return textoInvertido.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // esperado: "olleh"
    }
}
