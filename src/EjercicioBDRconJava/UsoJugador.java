package EjercicioBDRconJava;

public class UsoJugador {
    public static void main(String[] args) {
        ImportarJugador gestor = new ImportarJugador("furbitoespañol");

        gestor.crearBaseDeDatosYTabla("furbitoespañol");
        gestor.conectar();

        Jugador j1 = new Jugador(0, "Lionel Ronaldo", 21, "Lateral", "Los Diozes", "España", 2, 13, 77);
        gestor.crearJugador(j1);

        for (Jugador j : gestor.obtenerJugadores()) {
            System.out.println(j);
        }

        // vamos a actualizar al jugador para utilizar el metodo
        Jugador actualizado = gestor.obtenerJugadores().get(0);
        actualizado.setGoles(99);
        gestor.actualizarJugador(actualizado);

        for (Jugador i : gestor.obtenerJugadores()) {
            System.out.println(i);
        }
    }
}
