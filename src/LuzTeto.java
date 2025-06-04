public class LuzTeto implements Observer{
    private String corLuz;
    private Long intensidadeLuz;

    @Override
    public void atualizar(String informacao) {
        System.out.println("LuzTeto recebeu atualização: " + informacao);
        // Lógica do método
    }
}
