public class Curso {
    private float nota1;
    private float nota2;
    private float nota3;
    private String NombreMateria;

    //Constructores

    public Curso(){
    }

    public Curso(float nota1){
        this.nota1 = nota1;
    }
    public Curso(float nota1, float nota2) {
        this(nota1);
        this.nota2 = nota2;
    }

    public Curso(float nota1, float nota2, float nota3) {
        this(nota1, nota2);
        this.nota3= nota3;
    }

    public Curso(float nota1, float nota2, float nota3, String NombreMateria) {
        this(nota1, nota2, nota3);
        this.NombreMateria = NombreMateria;
    }

    //Getter y setter

    public String getNombreMateria() {
        return NombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        NombreMateria = nombreMateria;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    //metodos propios

    public String mostrarNotas(){
        String dv= nota1 + "--" + nota2 + "--" + nota3;
        return dv;
    }
}
