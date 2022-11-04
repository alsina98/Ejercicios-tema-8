public class main {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.setEdat(24);
        person1.setNombre("Jordi");
        person1.setTelefono(555555555);
    
        System.out.println("Nombre: " + person1.getNombre());
        System.out.println("Telefono: " + person1.getTelefono());
        System.out.println("Edad: " + person1.getEdat());
    }
}

class Persona{

    private int edat;
    private String nombre;
    private int telefono;

    public int getEdat() {return edat;}
    public void setEdat(int edat) {this.edat = edat;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getTelefono() {return telefono;}
    public void setTelefono(int telefono) {this.telefono = telefono;}

}
