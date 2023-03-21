public class Hamburguer {

    public String nome;
    public Double valor;
    public Boolean seEartesanal;

    public Double calcularValor(Boolean seEartesanal){
        if (seEartesanal){
            return valor + 8.00;

        }
        return valor;
    }
    public String ConsultarNome(){
        return nome;
    }
}
