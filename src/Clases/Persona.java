package Clases;

import java.util.Scanner;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int Edad;
    protected String Direccion;
    protected String Dui;
    protected String usuario;
    protected String correo;
    protected String Contra;
    
   //Constructor 
    public Persona(){
     
    }
     public Persona(String nomb,String ape,String Dire,String user,String CorrEle,String pass,int edad,String dui ){
         this.Dui=null;
        this.nombre=null;
        this.apellidos=null;
        this.Direccion=null;
        this.correo=null;
        this.usuario=null;
        this.Contra=null;
        this.Edad=0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setDui(String Dui) {
        this.Dui = Dui;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }
     public String getnombre(){
        return nombre;
        }
     public String getdui(){
        return Dui;
        }
     public String getapellidos(){
        return apellidos;
        }
     public String getDireccion(){
        return Direccion;
        }
     public String getcorreo(){
        return correo;
        }
     public String getusuario(){
        return usuario;
        }
     public int getedad(){
        return Edad;
        }
     public String getcontra(){
        return Contra;
        }
     public String getDatos(){
        return "Dui: "+Dui +
                "\nNombre "+nombre +
                "\nApellido "+apellidos+
                "\nEdad "+Edad+
                "\nDireccion "+Direccion+
                "\nCorreo "+correo+
                "\nUusario "+usuario+
                "\nContrase??a "+Contra
                ;
    }
}



/**
 *
 * 
 
     public void registrarUsuario(){
         int men1;
         men1=1;
         int reswhi;
         int confir;
         Scanner nombre1=new Scanner(System.in);
         Scanner res1=new Scanner(System.in);
         Scanner res2=new Scanner(System.in);
         Scanner apellidos1=new Scanner(System.in);
         Scanner Direccion1=new Scanner(System.in);
         Scanner correo1=new Scanner(System.in);
         Scanner edad1=new Scanner(System.in);
         Scanner usuario1=new Scanner(System.in);
         Scanner contra1=new Scanner(System.in);
          Scanner dui1=new Scanner(System.in);
         while(men1==1) { 
         System.out.println("BIENVENIDO");
          System.out.println("INGRESE SU DUI FORMATO 12345678-9");
         this.Dui=dui1.nextLine();
         System.out.println("INGRESE SUS DOS NOMBRES");
         this.nombre=nombre1.nextLine();
         System.out.println("INGRESE SUS DOS APELLIDOS");
         this.apellidos=apellidos1.nextLine();
         System.out.println("INGRESE SU EDAD");
         this.Edad=edad1.nextInt();
         System.out.println("INGRESE SU DIRECCION");
         this.Direccion=Direccion1.nextLine();
          System.out.println("INGRESE SU CORREO");
         this.correo=correo1.nextLine();
           System.out.println("INGRESE SU USUARIO");
         this.usuario=usuario1.nextLine();
           System.out.println("INGRESE SU CONTRASE??A");
         this.Contra=contra1.nextLine();
         System.out.println("1-Registrar  2-Cancelar");
         reswhi=res1.nextInt();
         if (reswhi==1){
             System.out.println("REGISTRO GUARDADO");
             men1=2;
         }else if (reswhi==2){
            System.out.println("DESEA SALIR 1-SI 2-NO");
            confir=res2.nextInt();
            if (confir==1){
            System.out.println("GRACIAS");
            men1=2;
            } else {
            men1=1;
            } 
         }
         }
     }
}
*/