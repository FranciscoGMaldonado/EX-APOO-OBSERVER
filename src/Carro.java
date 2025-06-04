import java.util.ArrayList;
import java.util.List;

public class Carro {
    private List<Observer> observadores = new ArrayList<>();
    private String informacoes;

    public void notificarObservadores(){
        for (Observer observador : observadores){
            observador.atualizar(this.informacoes);
        }
    }

    public void adicionarObservador(Observer observador){
        observadores.add(observador);
    }

    public void removerObservador(Observer observador){
        observadores.remove(observador);
    }

    public void setState(String novoEstado){
        this.informacoes = novoEstado;
        notificarObservadores();
    }

}
