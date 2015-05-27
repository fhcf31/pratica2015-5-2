/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

public class Pratica52 {
    public static void main(String[] args) {
        Equacao2Grau eq1 = new Equacao2Grau(1,3,2);
        Equacao2Grau eq2 = new Equacao2Grau(2,2,7);
        Equacao2Grau eq3 = new Equacao2Grau(1,-4,4);
        
        try{
            System.out.println(String.format(eq1.toString()+" raiz1 %.2f e raiz2 %.2f", 
                eq1.getRaiz1(),eq1.getRaiz2()));
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            System.out.println(String.format(eq2.toString()+" raiz1 %.2f e raiz2 %.2f", 
                eq2.getRaiz1(),eq2.getRaiz2()));
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            System.out.println(String.format(eq3.toString()+" raiz1 %.2f e raiz2 %.2f", 
                eq3.getRaiz1(),eq3.getRaiz2()));
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
