package AbstracoesEexibicao;

public class Abs2Computador {
    static void atributos() {
        String marca = "Acer";
        System.out.println("Marca do notBook: " + marca);
        String[] cor = { "Preto", "Cinza", "Branco" };
        System.out.println("Cor do NotBook: " + cor);
        float alturaDoProduto = 24.35f;
        System.out.println("Altura do Produto: " + alturaDoProduto);
        float larguraDoProduto = 36.3f;
        System.out.println("Largura do NotBook: " + larguraDoProduto);
        float tamanhoDeTelaVertical = 15.6F; // <- Polegadas
        System.out.println("Tamanho de Tela Vertical: " + tamanhoDeTelaVertical + " Polegadas");
        float resoluçãoDaTela = 1920; // X
        float resoluçãoDaTela02 = 1080; // Pixels
        System.out.println("Resolução maxima do Notebook: " + resoluçãoDaTela + " X " + resoluçãoDaTela02);
        String marcaDoProcessador = "Intel";
        System.out.println("Marca do Processador: " + marcaDoProcessador);
        String tipoDeProcessador = "Intel Core i5";
        System.out.println("Tipo de Processador: " + tipoDeProcessador);
        float velocidadeDoProcessador = 4.5f; // GHz
        System.out.println("Velocidade do Processador: " + velocidadeDoProcessador + " GHz ");
        int numeroDeProcessadores = 1;
        System.out.println("Numero de Processador: " + numeroDeProcessadores);
        int tamanhoDaMemóriaExterna = 512;
        System.out.println("Tamanho da memoria Externa: " + tamanhoDaMemóriaExterna + "GB");
        int tamanhoDaMemoria = 8;
        System.out.println("Tamanho da memoria RAM: " + tamanhoDaMemoria + " GB ");
        String tipoDeMemória = "DDR4 SDRAM";
        System.out.println("Tipo de Memoria: " + tipoDeMemória);
        int maximoDeMemoriaCompatível = 32; // GB
        System.out.println("Maximo de Memoria Compativel: " + maximoDeMemoriaCompatível + " GB ");
        int velocidadeDoRelogioDeMemoria = 2666; // MHz
        System.out.println("Velocidade do Relogio de Memoria: " + velocidadeDoRelogioDeMemoria + " MHz ");
        int entradasParaMemoria = 2;
        System.out.println("Entrada para Memoria: " + entradasParaMemoria);
        String modeloDePlacaDeVideo = "NVIDIA GeForce GTX 1650";
        System.out.println("Modelo de Placa de Video: " + modeloDePlacaDeVideo);
        String tipoDeConexao = "Bluetooth";
        System.out.println("Tipo de Conexão: " + tipoDeConexao);
        String tipoDeConexao02 = "Wi-fi";
        System.out.println("Tipo de Conexão com a Internet: " + tipoDeConexao02);
        String sistemaOperacional = "Windows 11";
        System.out.println("Sistema Operacional: " + sistemaOperacional);
        float pesoDoProduto = 3.19f;
        System.out.println("Peso do Produto: " + pesoDoProduto);
        float voltagem = 110.22f; // Volts
        System.out.println("Voltagem: " + voltagem + " Volts ");
    }

    public static void main(String[] Args) {
        atributos();
    }
}
