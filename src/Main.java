public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 26;
        cliente.nombre = "Pepa";
        cliente.telefono = 123456789;
        System.out.println(cliente.getInfo());
    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;

    public String getInfo() {
        return ("Este cliente con " + edad +" anos, con nombre " + nombre +" y telefono " + telefono + " tiene " + credito + " creditos.");
    }
}

class Trabajador extends Persona {
    int salario;

    public String getInfo() {
        return ("Este trabajador con " + edad +" anos, con nombre " + nombre +" y telefono " + telefono + " tiene " + salario + " euros.");
    }
}
