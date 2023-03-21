import javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {
    String opcao =JOptionPane.showInputDialog("informe o pedido \n + 1.Hamburguer \n 2.Pizza \n 3.sair");
    if (opcao.equals("2")){
    String nome = JOptionPane.showInputDialog("informe o nome da pizza");
    Double valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor da pizza");
    String bordaDigitada JOptionPane.showInputDialog("voce deseja borda ? S - sim \n N - false");
    boolean bordaParaCalculo;

    if(bordaDigitada.equals("S")){
        bordaParaCalculo= true;
    }
        else{
            bordaParaCalculo=false;
    }
        Pizza p = new Pizza();
        p.nome = nome;
        p.valor = valor;

    double valorTotal =p.calcularValor(bordaParaCalculo);

    JOptionPane.showInputDialog(null,"pedido"+ valorTotal,"pedido",JOptionPane.INFORMATION_MESSAGE);
    }

        if (opcao.equals("2")){
            String nome = JOptionPane.showInputDialog("informe o nome do Hamburguer");
            Double valor = Double.parseDouble(JOptionPane.showInputDialog("informe o valor do Hamburguer");
            String artesanal JOptionPane.showInputDialog("voce deseja Artesanal ? S - sim \n N - false");
            boolean artesanalCalculo;

            if(artesanal.equals("S")){
                artesanalCalculo= true;
            }
            else{
                artesanal=false;
            }
            Hamburguer p = new Hamburguer();
            p.nome = nome;
            p.valor = valor;

            double valorTotal =p.calcularValor(artesanal);

            JOptionPane.showInputDialog(null,"pedido"+ valorTotal,"pedido",JOptionPane.INFORMATION_MESSAGE);
        }


    }
}
