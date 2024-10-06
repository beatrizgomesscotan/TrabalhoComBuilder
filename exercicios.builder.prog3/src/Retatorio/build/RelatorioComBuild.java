package Retatorio.build;

import Retatorio.entidades.Relatorio;

public class RelatorioComBuild {
    private Relatorio relatorio = new Relatorio();

    public RelatorioComBuild setTipo(String titulo){
        this.relatorio.setTitulo(titulo);
        return this;
    }

    public RelatorioComBuild setCorpo(String corpo){
        this.relatorio.setCorpo(corpo);
        return this;
    }

    public RelatorioComBuild setRodape(String rodape){
        this.relatorio.setRodape(rodape);
        return this;
    }

    public Relatorio build(){
        return this.relatorio;
    }






}
