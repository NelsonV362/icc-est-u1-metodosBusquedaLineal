import java.util.Scanner;
public class Main{
public static void main(String[]arg){
    Persona[]personas={
        new Persona("Pablo",4),
        new Persona("Juana",5),
        new Persona("Pedro", 18),
        new Persona("Felipe", 60),
        new Persona("Oliver", 25),
        new Persona("Diego",12),
        new Persona("Teresa", 8),
        new Persona("Lili",9),
        new Persona("Joaquin", 40)
    };
    Seleccion(personas);
    for(Persona p:personas){
        System.out.println(p.edad+"");
    }
    System.out.println()
    ;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la edad de la persona a buscar");
    int edadBuscar=scanner.nextInt();
    int bajo=0, alto=personas.length-1;
    boolean encontrado=false;
    while(bajo<=alto){
        int centro=(bajo+alto
        )/2;
        int valorMedio=personas[centro].edad;
        System.out.println("bajo="+bajo+"alto"+alto+"cetro"+centro);
        System.out.println("valor del medio"+valorMedio);
        if (edadBuscar==valorMedio) {
            System.out.println("--<> Encontrado");
            System.out.println("La persona con la edad"+edadBuscar+"es"+personas[centro].nombre);
            encontrado=true;
            break;
        }else if(edadBuscar>valorMedio){
            System.out.println("--<Derecha");
            bajo=centro-1;
        }
        for(int i= bajo; i<=alto && i<personas.length; i++){
            System.out.println(personas[i].edad+"()");
        }
        System.out.println();
    }
    if (!encontrado){
        System.out.println("No se encontro una persona con la edad "+edadBuscar);
    }
}   
public static void Seleccion(Persona[]arr){
    int num= arr.length;
    for(int i=0; i<num-1; i++){
        int minimo=i;
        for(int j= i+1; j<num; j++){
            if (arr[j].edad<arr[minimo].edad) {
                minimo=j;            
            }
    }
    Persona configuracion=arr[i];
    arr[i]= arr[minimo];
    arr[minimo]=configuracion;
}
}}