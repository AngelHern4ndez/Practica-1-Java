package alumnos;

public class alumno {

    private String nombre;
    private String apaterno;
    private String amaterno;
    private String CURP;
    private String telefono;
    private String correo;
    private String sexo;
    private boolean discapacidad;
    private int edad;

    public alumno(String nombre,String apaterno,String amaterno,String CURP,String telefono,String correo,boolean discapacidad, String sexo, int edad)
    {
        this.nombre=nombre;
        this.apaterno=apaterno;
        this.amaterno=amaterno;
        this.CURP=CURP;
        this.telefono=telefono;
        this.correo=correo;
        this.discapacidad=discapacidad;
        this.sexo = sexo;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getAPaterno() {
        return apaterno;
    }
    public String getAMaterno(){return amaterno;}
    public String getCURP(){return CURP;}
    public String getTelefono(){return telefono;}
    public String getCorreo(){return correo;}
    public String getDiscapacidad(){
        if(discapacidad == true)
            return "Si";
        else
            return "No";
    }
    public String getSexo(){return sexo;}

    public int getEdad(){


        return edad;}
}
