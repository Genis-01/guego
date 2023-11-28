package Personajes;

public class Jugador {


        public int idPersonaje;
        public int nCartas;
        public String[] Cartas;
        

       
        
        //metodos

        //el usuario elije su personaje
        public void ElejirPersonaje(){
                idPersonaje = Funciones.Basicas.PideYScaneaintPositivo("elije un personaje\n1.Genis\n2.Julen\n");
        }
}
