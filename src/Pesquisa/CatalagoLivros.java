package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    //atributos
    private List<Livro> livroList;

    public void CatalogoLivros(){this.livroList = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int anoPublicado){
        livroList.add(new Livro(titulo, autor, anoPublicado));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){//retorna booleano
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }


}
