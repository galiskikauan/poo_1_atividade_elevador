class Elevador {
    private int andarAtual = 0;
    private boolean portaAberta = false;
    private final int totalAndares;



    ;

    // Construtor para definir o limite de andares
    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void subir() {
        if (portaAberta) {
            System.out.println("ERRO: Feche a porta antes de subir.");
        } else if (andarAtual >= totalAndares) {
            System.out.println("ERRO: Você já está no último andar.");
        } else {
            andarAtual++;
            System.out.println("Subindo... Agora no " + andarAtual + "º andar.");
        }
    }

    public void descer() {
        if (portaAberta) {
            System.out.println("ERRO: Feche a porta antes de descer.");
        } else if (andarAtual <= 0) {
            System.out.println("ERRO: O elevador já está no térreo.");
        } else {
            andarAtual--;
            System.out.println("Descendo... Agora no " + andarAtual + "º andar.");
        }
    }

    public void abrirPorta() {
        portaAberta = true;
        System.out.println("Porta aberta.");
    }

    public void fecharPorta() {
        portaAberta = false;
        System.out.println("Porta fechada.");
    }

    public void exibirStatus() {
        String statusPorta = portaAberta ? "Aberta" : "Fechada";
        System.out.println("\n--- Status do Elevador ---");
        System.out.println("Andar Atual: " + andarAtual);
        System.out.println("Porta: " + statusPorta);
        System.out.println("--------------------------\n");
    }
}

// Classe principal para testar o objeto
public class Main {
    public static void main(String[] args) {
        // Criando um elevador em um prédio de 5 andares
        Elevador meuElevador = new Elevador(5);

        meuElevador.exibirStatus();

        // Testando subir com porta aberta (deve dar erro)
        meuElevador.abrirPorta();
        meuElevador.subir();

        // Movimentação correta
        meuElevador.fecharPorta();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.exibirStatus();

        // Abrindo porta no andar de destino
        meuElevador.abrirPorta();
        meuElevador.exibirStatus();
    }
}
