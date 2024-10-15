public class Universidad {
    private String NombreUniversidad;

    //Constructor

    public Universidad(){
    }

    public Universidad (String NombreUniversidad){
        this.NombreUniversidad = NombreUniversidad;
    }

    //Getter y setter

    public String getNombreUniversidad() {
        return NombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        NombreUniversidad = nombreUniversidad;
    }


}
