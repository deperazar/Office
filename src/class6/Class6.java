
package class6;
//Class6=Oficina

public class Class6{

    
     public static void main(String []arg){
      Oficina f=new Oficina("Bag");
      Persona p=new Persona ("FA");
      p.trabaja=f; //relacion
         System.out.println(p.dardireccion());
      }
}