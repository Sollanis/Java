
package ultraemojicombati;

public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int vitorias, derrotas, empates;
    
    //Métodos Publicos
    public void apresentar(){
    };
            
    public void status(){
    };
    public void ganharLuta(){
    };
    public void perderLuta(){
    };
    public void empatarLuta(){
    };
        
    //Métodos Especiais
    
    //Construtor
    public Lutador(String nome, String nacionalidade, float altura, int vitorias, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.vitorias = vitorias;
        this.empates = empates;
    }
    
    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
