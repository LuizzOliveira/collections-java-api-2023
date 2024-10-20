package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>(); //lista
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao)); //metodo de adicionar tarefa
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList <>(); //pode ter elementos repetidos por isso removeAll.
        for(Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){ //se a descricao t, for igual equalsIgnoreCase descricao da tarefa
                tarefasParaRemover.add(t); //adiciona a lista de remover
            }
        }

        tarefaList.removeAll(tarefasParaRemover); //remove tudo que estiver dentro da lista de tarefa para remover
    }

    public int obterNumeroTotaltarefas(){
        return tarefaList.size(); //size() metodo que representa a quantiddade de elementos que tem dentro da lista

    }

    public void obterDescrcoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total na lista é: " + listaTarefa.obterNumeroTotaltarefas());

        listaTarefa.adicionarTarefa( "Tarefa 1");
        listaTarefa.adicionarTarefa( "Tarefa 1");
        listaTarefa.adicionarTarefa( "Tarefa 3");

        System.out.println("O número total na lista é: " + listaTarefa.obterNumeroTotaltarefas());

        listaTarefa.removerTarefa("tarefa 1");

        System.out.println("O número total na lista é: " + listaTarefa.obterNumeroTotaltarefas());

        listaTarefa.obterDescrcoesTarefas();

    }

}
