public class IPhone implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet {

    private String modelo;
    private String sistemaOperacional;

    public IPhone(String modelo, String sistemaOperacional) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    // Métodos do AparelhoTelefonico

    @Override
    public void ligar(String numero) {

        System.out.println("Ligando..." + numero);
    }

    @Override
    public void atender() {

        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {

        System.out.println("Inciando correio de voz...");
    }

    // Médotos do NavegadorInternet

    @Override
    public void exibirPagina(String url) {

        System.out.println("Abrindo página..." + url);
    }

    @Override
    public void atualizarPagina() {

        System.out.println("Atualizando página...");
    }

    @Override
    public void adicionarNovaAba() {

        System.out.println("Adicionando nova aba...");
    }

    // Métodos do ReprodutorMusical

    @Override
    public void tocarMusica() {

        System.out.println("Tocando música...");

    }

    @Override
    public void pausarMusica() {

        System.out.println("Música pausada.");

    }

    @Override
    public void selecionaMusica(String musica) {

        System.out.println("Selecionando música:" + musica);

    }
}
