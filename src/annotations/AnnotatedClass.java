package annotations;

@Author(name = "John Doe", date = "2023-06-15")
public class AnnotatedClass {
    
    public void afficherInfo() {
        System.out.println("Classe annotée avec @Author");
    }
    
    public static void main(String[] args) {
        AnnotatedClass obj = new AnnotatedClass();
        obj.afficherInfo();
        
        // Nous verrons comment accéder à l'annotation dans la partie suivante
    }
}
