package class6;

class Persona{
    private String nombre;
    public Oficina trabaja;
    public String dardireccion(){
        return (this.trabaja.dardireccion());
    }
    
    public Persona(String nombre){
        this.nombre=nombre;
}
}

