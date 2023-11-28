package EnDesuso;







public class Genis {
    public static final int vida = 10;
    public static int energia = 12;
    public static int danyoBestia = 1;
    public static int danyoBestiaMax = 5;
    public static int apetitoInsaciableCoste = 3;

    public static int ApetitoInsaciable() {
        int danyo;
        char opcion;
        energia = energia - apetitoInsaciableCoste; 


        do {

            System.out.println(Funciones.Basicas.CajaDeHastag("quieres alimentar a la bestia o liberarla (A/L)"));// le pregunta al usuario que quiere hacer
            opcion = Funciones.Basicas.LeerCharMin("para alimentar (A) para liberar (L)");

            switch (opcion) {
                case 'a':
                    if (danyoBestia < danyoBestiaMax) { // si el daño no esta al maximo se incrementa en uno
                        danyoBestia++;
                    }

                    return 0;

                case 'l':
                    danyo = danyoBestia;
                    danyoBestia = 1;
                    return danyo;

                default:
                    opcion = 'n';
                    break;
            }
        } while (opcion == 'n');
        return -1;
    }

    


}