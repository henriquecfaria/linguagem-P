public class Acai {
    public String tamanho;
    public Double valor;
    public Boolean acrescimoSorvete;

    public Double CalculaValor(Boolean acrescimoSorvete,String tamanho){
        if(tamanho.equals("P")){
            valor = 8.00;

        } else if (tamanho.equals("M")) {
            valor = 10.0;

        } else{
            valor =12.0;
        }

        if(acrescimoSorvete){
            valor += 2.0;

        }
        return valor;
    }
}