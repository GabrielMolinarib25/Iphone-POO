public class SistemaOperacionalIphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    
    // Implementação dos métodos de AparelhoTelefonico

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " usando o iPhone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada no iPhone.");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o iPhone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz no iPhone.");
    }

    // Implementação dos métodos de NavegadorInternet

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url + " no navegador do iPhone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador do iPhone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual no navegador do iPhone.");
    }

    // Implementação dos métodos de ReprodutorMusical

    @Override
    public void tocar() {
        System.out.println("Tocando música no reprodutor do iPhone.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música no reprodutor do iPhone.");
    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionando a música: " + nomeMusica + " no reprodutor do iPhone.");
    }
   
}
