
public class Carro {
	private String marca;
    private String modelo;
    private int año;
    private boolean encendido;
    
    // Constructor
    public Carro(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.encendido = false;
    }
    
    // Métodos
    
    // Encender el carro
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El carro se ha encendido.");
        } else {
            System.out.println("El carro ya está encendido.");
        }
    }
    
    // Apagar el carro
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El carro se ha apagado.");
        } else {
            System.out.println("El carro ya está apagado.");
        }
    }
    
    // Obtener información del carro
    public void obtenerInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
    }
}
