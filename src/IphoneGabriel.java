public class IphoneGabriel {
    
    public static void main(String[] args) {
        
        SistemaOperacionalIphone iphone = new SistemaOperacionalIphone();

        // Testando as Funcionalidades do iphone

        iphone.ligar("1234-5678");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.desligar();
    
        System.out.println("=================================");

        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("=================================");

        iphone.selecionarMusica("End of Beginning");
        iphone.tocar();
        iphone.pausar();
    }
}
