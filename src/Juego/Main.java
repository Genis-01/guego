package Juego;



public class Main {

  

    public static void main(String[] args) {

        

        Personajes.Jugador J1 = new Personajes.Jugador();
        Personajes.Jugador J2 = new Personajes.Jugador();

        J1.ElejirPersonaje();
        J2.ElejirPersonaje();

        System.out.println("jugador uno id de personaje: " + J1.idPersonaje);
        System.out.println("jugador dos id de personaje: " + J2.idPersonaje);
        
        
    }
    
}
