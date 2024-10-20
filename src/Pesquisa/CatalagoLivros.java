package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    //atributos
    private List<Livro> livroList;

    public CatalagoLivros() {this.livroList = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
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

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){//retorna booleano
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }

                }
            }
        return livrosPorIntervaloAnos;

    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }

        }
        return livroPorTitulo;
    }
    public static void main(String[] args){
        CatalagoLivros catalogoLivros = new CatalagoLivros();
        catalogoLivros.adicionarLivro("livro 1", "autor 1", 2024);
        catalogoLivros.adicionarLivro("livro 2", "autor 2", 2023);
        catalogoLivros.adicionarLivro("livro 2", "autor 2", 2020);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 1"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2023));
    }

}
