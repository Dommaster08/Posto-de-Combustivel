public class App {
    public static void main(String[] args) throws Exception {
        int limiteEstoque = 10000;
        Combustivel gasolina = new Combustivel(limiteEstoque);
        int qtdAposReposicao = gasolina.reporEstoque(10000);
        System.out.println("Qtd após reposição: " + qtdAposReposicao);
        int qtdRealmenteAbastecido1 = gasolina.abastecerVeiculo(100);
        System.out.println("Qtd Abastecida 1: " + qtdRealmenteAbastecido1);
        int qtdRealmenteAbastecido2 = gasolina.abastecerVeiculo(100);
        System.out.println("Qtd Abastecida 2: " + qtdRealmenteAbastecido2);
        System.out.println("Estoque de gasolina: " + gasolina.mostrarEstoque());

    }
}
