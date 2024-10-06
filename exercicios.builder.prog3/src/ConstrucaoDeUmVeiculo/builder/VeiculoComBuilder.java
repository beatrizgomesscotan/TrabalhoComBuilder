package ConstrucaoDeUmVeiculo.builder;

import ConstrucaoDeUmVeiculo.entidades.Veiculo;
import ExercicioPizza.entidades.Pizza;

public class VeiculoComBuilder {

    private Veiculo veiculo = new Veiculo();

    public VeiculoComBuilder setTipo(String tipo){
        this.veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoComBuilder setCor(String cor) {
        this.veiculo.setCor(cor);
        return this;
    }

    public VeiculoComBuilder setRodas(String roda){
        this.veiculo.setRodas(roda);
        return this;

    }

    public Veiculo build(){
        return this.veiculo;
    }
}
