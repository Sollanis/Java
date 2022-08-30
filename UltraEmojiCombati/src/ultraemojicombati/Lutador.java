
package ultraemojicombati;

public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int vitorias, derrotas, empates;
    
    //Métodos Publicos
    public void apresentar(){
        System.out.println("LADIES AND GENTLEMAN! Apresentamos o lutador" + this.getNome());
        System.out.println("Vindo de " + this.getNacionalidade());
        System.out.println("com  " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + " vitórias.");
        System.out.println("com  " + this.getEmpates()+ " empates");
        System.out.println(this.getDerrotas()+ " derrotas.");
    };  
            
    public void status(){
            System.out.println(getNome() + "é um peso " + this.getCategoria());
            System.out.println("Possui " + this.getVitorias());
            System.out.println("Possui " + this.getEmpates());
            System.out.println("Possui " + this.getDerrotas());
    };
    public void ganharLuta(){
        this.setVitorias(getVitorias()+1);
//        this.vitorias = this.vitorias + 1;
    };
    public void perderLuta(){
        this.setDerrotas(getDerrotas()+1);
    };
    public void empatarLuta(){
        this.setEmpates(getEmpates()+1);
    };
        
    //Métodos Especiais
    
    //Construtor
    public Lutador(String nome, String nacionalidade, float altura,float peso, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
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
        if (this.peso < 52.5) {
            this.categoria = "Inválido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <=83.9){
            this.categoria = "Médio";
        }else if(this.peso <=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
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
