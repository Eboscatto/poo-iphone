public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao desafio de projeto do Módulo de POO iPhone!");

        // Criando um objeto iPhone

        IPhone meuiPhone = new IPhone("iPhone Original", "iOS 3.1");

        // Reproduzindo música
        meuiPhone.selecionaMusica("imagine - Jhon Lennon");
        meuiPhone.tocarMusica();
        meuiPhone.pausarMusica();

        // Aparelho telefônico
        meuiPhone.ligar("99-99999-9999");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        // Navegador de internet
        meuiPhone.exibirPagina("www.dio.com.br");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();

    }
}