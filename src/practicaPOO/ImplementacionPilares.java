package practicaPOO;

import java.util.Scanner;

public class ImplementacionPilares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Futbolista
        System.out.println("Ingrese los datos del Futbolista:");
        System.out.print("Nombre: ");
        String nombreFutbolista = entrada.nextLine();
        System.out.print("Apellidos: ");
        String apellidosFutbolista = entrada.nextLine();
        System.out.print("Edad: ");
        int edadFutbolista = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Dorsal: ");
        String dorsal = entrada.nextLine();
        System.out.print("Demarcación: ");
        String demarcacion = entrada.nextLine();

        Futbolista futbolista = new Futbolista(nombreFutbolista, apellidosFutbolista, edadFutbolista, dorsal, demarcacion);

        // Entrenador
        System.out.println("Ingrese los datos del Entrenador:");
        System.out.print("Nombre: ");
        String nombreEntrenador = entrada.nextLine();
        System.out.print("Apellidos: ");
        String apellidosEntrenador = entrada.nextLine();
        System.out.print("Edad: ");
        int edadEntrenador = entrada.nextInt();
        entrada.nextLine();
        System.out.print("ID de Federación: ");
        String idFederacion = entrada.nextLine();

        Entrenador entrenador = new Entrenador(nombreEntrenador, apellidosEntrenador, edadEntrenador, idFederacion);

        // Masajista
        System.out.println("Ingrese los datos del Masajista:");
        System.out.print("Nombre: ");
        String nombreMasajista = entrada.nextLine();
        System.out.print("Apellidos: ");
        String apellidosMasajista = entrada.nextLine();
        System.out.print("Edad: ");
        int edadMasajista = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Titulación: ");
        String titulacion = entrada.nextLine();
        System.out.print("Años de experiencia: ");
        int aniosExperiencia = entrada.nextInt();

        Masajista masajista = new Masajista(nombreMasajista, apellidosMasajista, edadMasajista, titulacion, aniosExperiencia);


        futbolista.Concentrarse();
        futbolista.Viajar();
        futbolista.JugarPartido();
        futbolista.Entrenador();

        entrenador.Concentrarse();
        entrenador.Viajar();
        entrenador.DirigirPartido();
        entrenador.DirigirEntrenamiento();

        masajista.Concentrarse();
        masajista.Viajar();
        masajista.DarMasaje();

    }
}

class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(){ }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void Concentrarse(){
        System.out.println(nombre + " " + apellidos + " está concentrado.");
    }

    public void Viajar(){
        System.out.println(nombre + " " + apellidos + " está viajando.");
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

// Clase futbolista
class Futbolista extends Persona{
    private String dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(String nombre, String apellidos, int edad, String dorsal, String demarcacion) {
        super(nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void Viajar() {
        System.out.println("FUTBOLISTA");
        System.out.println(getNombre() + " " + getApellidos() + " está viajando para jugar un partido.");
    }

    public void JugarPartido(){
        System.out.println(getNombre() + " " + getApellidos() + " está jugando un partido.");
    }

    public  void Entrenador(){
        System.out.println(getNombre() + " " + getApellidos() + " está entrenando.");
    }
}

// Clase entrenador

class Entrenador extends Persona{
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String nombre, String apellidos, int edad, String idFederacion) {
        super(nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void Viajar() {
        System.out.println("ENTRENADOR");
        System.out.println(getNombre() + " " + getApellidos() + " está viajando para dirigir un partido.");
    }

    public void DirigirPartido(){
        System.out.println(getNombre() + " " + getApellidos() + " está dirigiendo un partido.");
    }

    public void DirigirEntrenamiento(){
        System.out.println(getNombre() + " " + getApellidos() + " está dirigiendo un entrenamiento.");
    }
}

// Clase masajista
class Masajista extends  Persona{
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(){

    }

    public Masajista(String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void Viajar(){
        System.out.println("MASAJISTA");
        System.out.println(getNombre() + "" + getApellidos() + " está viajando para asistir a un partido.");
    }

    public void DarMasaje() {
        System.out.println(getNombre() + " " + getApellidos() + " está dando un masaje.");
    }
}
