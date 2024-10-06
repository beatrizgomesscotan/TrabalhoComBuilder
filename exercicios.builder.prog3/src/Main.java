import ConstrucaoDeUmVeiculo.builder.VeiculoComBuilder;
import ConstrucaoDeUmVeiculo.entidades.Veiculo;
import ExercicioPizza.builder.PizzaBuilder;
import ExercicioPizza.entidades.Pizza;
import Retatorio.build.RelatorioComBuild;
import Retatorio.entidades.Relatorio;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------");
        System.out.println("Primeiro Exercicio: ");
        pizzaComBuilder();
        System.out.println("--------------------------------");
        System.out.println("Segundo Exercicio:");
        veiculoComBuilder();
        System.out.println("--------------------------------");
        System.out.println("Terceiro Exercicio:");
        relatorioComBuilder();
        System.out.println("---------------------------------");
    }
    public static void pizzaComBuilder(){

        Pizza quatroQueijo = new PizzaBuilder()
                .setMassa("Massa Salgada")
                .setIngrediente("Molho")
                .setIngrediente("Quejo Mussarela, Quejo Parmesão, Catupiry, Cheder ")
                .setTamanho("Grande")
                .build();

        Pizza Confete = new PizzaBuilder()
                .setMassa("Doce")
                .setIngrediente("Mussarela")
                .setIngrediente("Quejo Mussarela, Chocolate Branco, Confete")
                .setIngrediente("Confete")
                .setTamanho("Média")
                .build();

        System.out.println(quatroQueijo.toString());
        System.out.println(Confete.toString());

    }

    public static void veiculoComBuilder(){

        Veiculo saveiro = new VeiculoComBuilder()
                .setTipo("Saveiro")
                .setCor("Branca")
                .setRodas("4 Rodas")
                .build();

        Veiculo hondaCivic = new VeiculoComBuilder()
            .setTipo("Honda Civic")
                .setCor("Chumbo")
                .setRodas("4 Rodas")
                .build();

        System.out.println(saveiro.toString());
        System.out.println(hondaCivic.toString());
    }

    public static void relatorioComBuilder(){
        Relatorio relatorio = new RelatorioComBuild()
                .setTipo(" Titulo ")
                .setCorpo(" Corpo ")
                .setRodape(" Rodapé ")
                .build();
        System.out.println(relatorio.toString());
    }



    }


