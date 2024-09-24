import java.util.Arrays;

//Principio DRY 
void verificarEmail(String email1){
    if(!email1.contains("@") || !email1.contains(".")){
        System.out.println("Email inválido");
    }
}

verificarEmail("jassym.peream@autonoma.edu")


//Principio KISS
public static String invertirCadena(String cadena) {
    StringBuilder sb = new StringBuilder(cadena);
    return sb.reverse().toString();
}

public static int encontrarMayor(int[] numeros) {
    return Arrays.stream(numeros).max().getAsInt();
}


//Principio YAGNI
class Libro {
    String titulo; 
    String autor; 
    int añoPublicacion; 
    //Constructor y getters
}

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>(); 

    public void AgregarLibro(Libro libro){
        libros.add(libro); 
    }

    public List<Libro> getLibros(){
        return libros; 
    }
}