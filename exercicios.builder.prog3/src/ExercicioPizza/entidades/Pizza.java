package ExercicioPizza.entidades;

public class Pizza {
    private String massa = "";
    private String ingrediente = "";

    private String  tamanho= "";
    public void setMassa(String massa) {
        this.massa = massa;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString(){
        return "Massa: " + this.massa + " " +
                " Ingrediente: " + this.ingrediente + " " +
                " Tamanho: " + this.tamanho;
    }

}
