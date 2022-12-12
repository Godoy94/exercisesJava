package AbstracoesEexibicao;

public class Abs7CadeiraGamer {
    static void atributos() {

        String marca = "XZONE";
        System.out.println("Marca da Cadeira Gamer: " + marca);
        int dimensaoDaCadeira01 = 50;
        int dimensaoDaCadeira02 = 52;
        int dimensaoDaCadeira03 = 118;
        System.out.println("Dimensão da Cadeira: " + dimensaoDaCadeira01 + " X " + dimensaoDaCadeira02 + " X "
                + dimensaoDaCadeira03);
        String caracteristica = "Couro Estofado";
        System.out.println("Caracteristica de Estofado: " + caracteristica);
        String caracteristica_02 = "Apoio de braço";
        System.out.println("Caracteristica segundaria: " + caracteristica_02);
        String caracteristica_03 = "Altura ajustável";
        System.out.println("Ajustes da cadeira: " + caracteristica_03);
        String caracteristica_04 = "Giratório";
        System.out.println("Caracteristica de Movimento: " + caracteristica_04);
        String material = "Nylon";
        System.out.println("Material de Composição: " + material);
        String material_02 = "Couro sintético";
        System.out.println("Material de Composição do assento: " + material_02);
        String materialDaMoldura = "Metal";
        System.out.println("Material da Moldura: " + materialDaMoldura);
        String estiloDeBraço = "Almofada superior";
        System.out.println("Estilo de Braço: " + estiloDeBraço);
        String movimentoDebaseDeMóveis = "Girar";
        System.out.println("Movimento de Base de Móveis: " + movimentoDebaseDeMóveis);
        int alturaDoProduto = 128; // <- centimetros
        System.out.println("Altura do Produto: " + alturaDoProduto + " cm ");
        int larguraDoProduto = 62; // <- centímetros
        System.out.println("Largura do Produto: " + larguraDoProduto + " cm ");
        int pesoDoProduto = 14; // <- KG
        System.out.println("Peso do Produto: " + pesoDoProduto + " Kg ");
        String cor = "Preta";
        System.out.println("Variedade de cores: " + cor);
        String formato = "reclinável";
        System.out.println("Formato do Material: " + formato);
    }

    public static void main(String[] Args) {

        atributos();

    }
}
