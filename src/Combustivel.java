public class Combustivel {
    private int estoque;
    private int limiteEstoque;

    public Combustivel(int limiteEstoque) {
        this.limiteEstoque = limiteEstoque;
        this.estoque = 0;
    }

    public int reporEstoque(int quantidade) {
        if (quantidade < 0) {
            return 0;
        } else if (this.estoque + quantidade > this.limiteEstoque) {
            int quantidadeReposta = this.limiteEstoque - this.estoque;
            this.estoque = this.limiteEstoque;
            return quantidadeReposta;
        } else {
            this.estoque += quantidade;
            return quantidade;
        }
    }

    public int abastecerVeiculo(int quantidadeAbastecida) {
        if (quantidadeAbastecida < 0) {
            return 0;
        } else if (quantidadeAbastecida > this.estoque) {
            int quantidadeDisponivel = this.estoque;
            this.estoque = 0;
            return quantidadeDisponivel;
        } else {
            this.estoque -= quantidadeAbastecida;
            return quantidadeAbastecida;
        }
    }

    public int mostrarEstoque() {
        return this.estoque;
    }
}
