package BREAK;
public class BusquedaCodigoProducto {

    public static void main(String[] args) {

        String[] codigos = {
            "XYZ111",
            "DEF456",
            "LMN789",
            "ABC123",
            "QWE222"
        };

        int revisados = 0;

        for (int i = 0; i < codigos.length; i++) {

            revisados++;

            if (codigos[i].equals("ABC123")) {

                System.out.println("Código encontrado.");
                System.out.println("Posición: " + i);
                System.out.println("Cantidad de códigos revisados: " + revisados);

                break;
            }
        }
    }
}
