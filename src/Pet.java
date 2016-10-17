import java.util.ArrayList;

/**
 * Created by ramon on 10/10/16.
 */
public class Pet {
    ArrayList<Gato> gatosNaPet = new ArrayList();

    public Gato add(){
        Gato g = new Gato();
        g.ler();
        /// Fazer o método que adicione os gatinhos no arraylist
        ///importante nao deve conter gatos iguais
        //deve retornar o gato quando possivel inserir, caso contrario
        //deve retornar null

        if(gatosNaPet.contains(g)){
            System.out.println("Opa..ja temos esse gato");
            return null;
        }else{
            gatosNaPet.add(g);
            return g;
        }


    }
    public int quantidadeDeGatos(){
        //retornar quantos gatos estão cadastrados
        return gatosNaPet.size();

    }
    public int quantidadeDeGatosNoCio(){
        //retornar quantos gatos estão cadastrados que estão no CIO
        int cont=0;
        for(int i=0; i<gatosNaPet.size();i++){
            if(gatosNaPet.get(i).cio==true){
                cont++;
            }
        }
        return cont;



/*
        int cont=0;
        for(int i=0; i<gatosNaPet.size();i++){
            Gato n= gatosNaPet.get(i);
            if(n.cio==true){
                cont++;
            }
        }

        return cont;*/

/*
        for (Gato g:gatosNaPet) {
            if (g.cio==true){
                cont++;
            }

        }

*/

    }
    public void quantidadeDeRacao (String racao){
        // exibir a quantidade de racao que tenho que ter em estoque
        // o usuario vai informar uma racao;
        double qtd=0;
        for(int i=0; i<gatosNaPet.size();i++){
            if(gatosNaPet.get(i).racaoFavorita.equals(racao)){
             qtd+=gatosNaPet.get(i).qtdRacao;
            //    qtd=gatosNaPet.get(i).qtdRacao+qtd;
            }
        }





    }
    public Gato remover (Gato gatoProcurado){
        // remover o gatoProcurado da arraylist
        //o programa deve mostrar os dados do gato removido
        // e Retornar o "gato" que foi removido ao programa principal.
        ////deve retornar null caso nao exista o gato.
        if(gatosNaPet.contains(gatoProcurado)){
            gatosNaPet.remove(gatoProcurado);
            return  gatoProcurado;
        }else{
            System.out.println("Opa não temos esse gatinho");
            return null;
        }

    }


}
