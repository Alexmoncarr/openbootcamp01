public class EjercicioTema3 {

    public static void main(String[] args) {
        String[] textos = {"texto1", "texto2", "texto3"};
        String resultado = "";

        for (int i = 0; i < textos.length; i++){
            resultado+=textos[i];
        }

        System.out.println(resultado);

    }
}