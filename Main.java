public class Main {

    public static void main(String[] args) {

        Celular celular1 = new Celular("Apple", "iPhone 15", 80);
        Celular celular2 = new Celular("Samsung", "Galaxy S24", 50);

        celular1.encender();
        celular1.usar(20);
        celular1.mostrarInformacion();

        celular2.encender();
        celular2.usar(10);
        celular2.mostrarInformacion();
    }
}