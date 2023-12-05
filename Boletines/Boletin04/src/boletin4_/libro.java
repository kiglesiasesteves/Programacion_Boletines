/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin4_;

/**
 *
 * @author dam1
 */
public class libro {
 //atributos
   private String titulo;
   private String autor;
   private int ano;
   private short numPaginas;
   private float valoracion;
   //Constructor por defecto 
   public libro(){
}
   //constructor para inicalizar
   public libro(String ti, String aut, int an, int num) {
       titulo=ti;
       autor=aut;
       ano=an;
       numPaginas=(short) num;
}
   //metodo de acceso 
    // Setter para el atributo "titulo"
    public void setTitulo(String ti) {
      titulo= ti;
   
    }
   
   public String getTitulo() {
        return titulo;
    }
// Setter para el atributo "autor"
    public void setAutor(String aut) {
   autor = aut;
    }
 
    // Getter para el atributo "autor"
    public String getAutor() {
        return autor;
    }
 // Setter para el atributo "ano"
    public void setAno(int an) {
    ano = an;
    }
    // Getter para el atributo "ano"
    public int getAno() {
        return ano;
    }
  // Setter para el atributo "numPaginas"
    public void setNumPaginas(int num) {
       numPaginas = (short) num;

}
    // Getter para el atributo "numPaginas"
    public short getNumPaginas() {
        return numPaginas;
    }
    
    //metodo
    public void mostrar() {
      System.out.println();

}
    

   
   
   
   
   
   
   
   
   
   
   
   
   }