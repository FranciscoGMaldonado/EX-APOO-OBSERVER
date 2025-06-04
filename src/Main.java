public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        LuzTeto luzTeto = new LuzTeto();
        ApitoFarol apitoFarol = new ApitoFarol();

        carro.adicionarObservador(luzTeto);
        carro.adicionarObservador(apitoFarol);

        System.out.println("Atualizando estado do carro para 'Motor ligado'");
        carro.setState("Motor ligado");

        System.out.println("Atualizando estado do carro para 'Freio acionado'");
        carro.setState("Freio acionado");
    }
}