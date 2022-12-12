package AbstracoesEexibicao;

public class Abs5Bicicleta {
    static void atributos() {

        int tamanhoAro = 26;
        System.out.println("Tamanho do Aro: " + tamanhoAro);
        int quadro = 20;
        System.out.println("Tamanho do Quadro: " + quadro);
        int pesoAproximado = 15; // Kg
        System.out.println("Peso Aproximado da Bicicleta: " + pesoAproximado + " Kg ");
        String fabricadoGarfoEQradro = "Aço Carbono";
        System.out.println("Quadro e Garfo frabricados em " + fabricadoGarfoEQradro);
        String tipoDeAro = "Alumínio";
        System.out.println("Aro fabricado em " + tipoDeAro);
        String tipoAdesivo = "Alto Brilho";
        System.out.println("Adesivo: " + tipoAdesivo);
        int quantasMarchas = 18;
        System.out.println("Quantidade de Marchas: " + quantasMarchas);
        String cambio = "Yamada";
        System.out.println("Câmbio dianteiro: " + cambio);
        String cambioTraseiro = "Yamada";
        System.out.println("Câmbio Traseiro: " + cambioTraseiro);
        String tipoDeMarcha = "Alavanca";
        System.out.println("Tipo de Trocador de Marchas: " + tipoDeMarcha);
        String freios = "V-Brake";
        System.out.println("Tipo de Freios: " + freios);
        String raio = "Aço";
        float raio02 = 2.0f; // X
        int raio03 = 185; // mm
        System.out.println("Especificações do Raio: " + raio + "," + raio02 + "X" + raio03);
        String manopla = "PVC Shimano Simples";
        System.out.println("Manopla em " + manopla);
        String tipoGarfo = "Standard Rígido";
        System.out.println("Tipo de Garfo: " + tipoGarfo);
        float movimentoCentral = 4.5f; // cm
        System.out.println("Movimentação Central: " + movimentoCentral + " cm ");
        String caixaDirecao = "Standard";
        System.out.println("Tipo de Caixa de Direção: " + caixaDirecao);
        String pedais = "Plástico com refletor laranja metálico";
        System.out.println("Tipo de Pedais: " + pedais);
        String selim = "Cairu";
        System.out.println("Tipo de Selim: " + selim);
        String canote = "Aço Carbono";
        System.out.println("Canote do Selim: " + canote);
        String pedivela = "Monobloco";
        int pedivela02 = 165; // mm
        System.out.println("Pedivela: " + pedivela + ", " + pedivela02 + " mm ");
        int pneus = 20;
        float pneus02 = 1.75f;
        System.out.println("Pneus: " + pneus + "X" + pneus02);
        int pesoSuportado = 90; // Kg
        System.out.println("Peso Suportado: " + "Até " + pesoSuportado + " Kg ");
        int altura = 100;
        System.out.println("Altura do Chão ao Guidão: " + altura + " cm ");
        int largura = 60;
        System.out.println("Largura do Guidão: " + largura + " cm ");
        int comprimento = 170;
        System.out.println("Comprimento Total: " + comprimento + " cm ");
        int comprimentoRodas = 40;
        System.out.println("Comprimento entre Rodas: " + comprimentoRodas + " cm ");
    }

    public static void main(String[] Args) {
        atributos();
    }
}
