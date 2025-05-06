package EjemplosHashMap;
import java.util.*;
public class HashMapEjemplo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> lhm_integer= new HashMap<>();
        lhm_integer.put(1,35);
        lhm_integer.put(2,45);
        lhm_integer.put(3,100);
        lhm_integer.put(7,100);
        lhm_integer.put(4,58);
        System.out.println("tamaño del map: " +lhm_integer.size());
        System.out.println(lhm_integer.values());
        // esto borra la key numero 3
        lhm_integer.remove(3);
        System.out.println("tamaño del map: "+lhm_integer.size());
        System.out.println(lhm_integer.values());
        //esto reemplaza el valor antiguo de la clave principal, por uno nuevo
        lhm_integer.replace(1,35,55);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        HashMap<PersonaProf,String> PersonaProfesion= new HashMap<>();
        PersonaProf person1 = new PersonaProf("andres","12314123T",33);
        PersonaProfesion.put(new PersonaProf("Ivan","4100123Z",30),"medico");
        PersonaProfesion.put(new PersonaProf("Lara","5912045I",30),"policia");
        PersonaProfesion.put(new PersonaProf("Pedro","5912581A",30),"Barrendero");
        PersonaProfesion.put(person1,"bombero");
        System.out.println("tamaño del map: " +PersonaProfesion.size());
        System.out.println(PersonaProfesion.values());


    }

}
