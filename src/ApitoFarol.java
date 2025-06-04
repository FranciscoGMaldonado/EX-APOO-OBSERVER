public class ApitoFarol implements Observer {
    private String tipoSom;
    private Long intensidadeSom;

    @Override
    public void atualizar(String informacao) {
        System.out.println("ApitoFarol recebeu atualização: " + informacao);
        // Lógica do método
    }
}
