import java.util.Scanner;

public class Gato {
    public String nome;
    public String sexo;// (masculino ou feminino)
    public boolean cio; //(sim ou nao)
    public String raca;
    public String racaoFavorita;
    public double qtdRacao;
    public String mostrar() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", raca='" + raca + '\'' +
                ", racaoFavorita='" + racaoFavorita + '\'' +
                ", qtdRacao=" + qtdRacao +
                '}';
    }
    public void ler(){
        Scanner tc = new Scanner(System.in);
        this.nome= tc.next();
        this.sexo = tc.next();
        if(this.sexo.equals("feminino")){
            this.cio = tc.nextBoolean();
        }
        this.raca = tc.next();
        this.racaoFavorita = tc.next();
        this.qtdRacao=tc.nextFloat();

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return nome != null ? nome.equals(gato.nome) : gato.nome == null;
    }


}
