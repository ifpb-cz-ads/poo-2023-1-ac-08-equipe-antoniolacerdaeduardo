public class TestaEquipamento {
    public static void main(String[] args){
        Equipamento novoEquip = new Equipamento();
        novoEquip.setNome("Fonte");
        novoEquip.setValor(150);

        Computador pcGamer = new Computador();
        pcGamer.setNome("Nitro 5");
        pcGamer.setValor(4500);
        pcGamer.setPlacaDeVideo("RTX 1650");
        pcGamer.setProcessador("i5");

        System.out.println("EQUIPAMENTO: " + novoEquip.getNome() + "\n" + "VALOR: R$" + novoEquip.getValor() + "\n");
        System.out.println("COMPUTADOR: " + pcGamer.getNome() + "\n" + "VALOR: R$" + pcGamer.getValor() + "\n" + "PLACA DE VÍDEO: " + pcGamer.getPlacaDeVideo() + "\n" + "PROCESSADOR: " + pcGamer.getProcessador());
    }
}
