package list.OperacoesBasicas;

public class Tarefa {
    //Atributo
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //metodo
    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return  descricao;
    }
}
