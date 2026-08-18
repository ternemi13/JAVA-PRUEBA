public class Celular {

    String marca;
    String modelo;
    int bateria;
    boolean encendido;

    public Celular(String marca, String modelo, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.encendido = false;
    }

    public void encender() {
        encendido = true;
        System.out.println(modelo + " se ha encendido");
    }

    public void apagar() {
        encendido = false;
        System.out.println(modelo + " se ha apagado");
    }

    public void usar(int minutos) {
        if (encendido) {
            bateria = bateria - minutos;

            if (bateria < 0) {
                bateria = 0;
            }

            System.out.println("Usaste el celular durante " + minutos + " minutos");
        } else {
            System.out.println("El celular está apagado");
        }
    }

    public void cargar(int porcentaje) {
        bateria = bateria + porcentaje;

        if (bateria > 100) {
            bateria = 100;
        }

        System.out.println("Celular cargado");
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Batería: " + bateria);
        System.out.println("Encendido: " + encendido);
        System.out.println("-------------------------");
    }
}

  






