public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }    
    public void aumentarVolume(){
        volume ++;
    }
    public void diminuirVolume(){
        volume --;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void avancarCanal(){
        System.out.println("Canal atual: " + canal);
        canal ++;
    }
    public void voltarCanal(){
        System.out.println("Canal atual: " + canal);
        canal --;
    }
    
}