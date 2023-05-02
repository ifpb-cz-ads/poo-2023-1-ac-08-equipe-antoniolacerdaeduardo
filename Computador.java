public class Computador extends Equipamento {
    private String placaDeVideo;
    private String processador;

    public void setPlacaDeVideo(String placaDeVideo){
        this.placaDeVideo = placaDeVideo;
    }
    public void setProcessador(String processador){
        this.processador = processador;
    }

    public String getPlacaDeVideo(){
        return this.placaDeVideo;
    }
    public String getProcessador(){
        return this.processador;
    }
}
