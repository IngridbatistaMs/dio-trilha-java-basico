public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

       /*  System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual? " + smartTv.canal);
        System.out.println("Qual o volume atual? " + smartTv.volume);*/

        smartTv.ligar();
        System.out.println("Novo status -> a TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> a TV está ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Qual o volume atual? " + smartTv.volume);

        System.out.println("O canal atual é: " + smartTv.canal);
        smartTv.mudarCanal(20);
        System.out.println("O canal atual é: " + smartTv.canal);
    }
}
