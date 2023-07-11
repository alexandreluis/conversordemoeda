
package br.com.alexandreluisrigotti.conversordemoeda.view;

import javax.swing.JOptionPane;

/**
 *
 * @author alexandreluis
 */
public class JMenuTipoParaConverter 
{
    public String menuEscolheConversao()
    {
        Object[] itens = {" ", "Converter de Moeda", "Converter de Temperatura"};

        return (String)JOptionPane.showInputDialog(null, "Escolha uma Opção: ", "Menu", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
    }
    
    public Float menuSolicitaValor()
    {
        float valor;
        
        valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira um valor: ", "Input", JOptionPane.INFORMATION_MESSAGE));

        if(valor < 0)
        {
            JOptionPane.showMessageDialog(null, "Valor inválido");
        }
        
        return valor;
    }
    
    public Object menuEscolheMoeda()
    {
        Object[] itens = 
        {" ",
            "Converter de Reais a Dólar",
            "Converter de Reais a Euro",
            "Converter de Reais a Libras Esterlinas",
            "Converter de Reais a Peso argentino",
            "Converter de Reais a Peso Chileno",
            "--",
            "Converter de Dólar a Reais",
            "Converter de Euro a Reais",
            "Converter de Libras Esterlinas a Reais",
            "Converter de Peso argentino a  Reais",
            "Converter de Peso Chileno a Reais"};

        return JOptionPane.showInputDialog(null, "Escolha o item: ", "Menu", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
    }
    
    public String converteMoeda(Object moedaEscolhida, float valorParaConverter)
    {
        float novoValor = 0.0f;
        String simboloDaMoeda = null;
        
         switch((String)moedaEscolhida)
         {
             case "Converter de Reais a Dólar":
                 novoValor = (float) (valorParaConverter / 4.80);
                 simboloDaMoeda = "$ ";
                 break;
             case "Converter de Reais a Euro":
                 novoValor = (float) (valorParaConverter / 5.34);
                 simboloDaMoeda = "€ ";
                 break;
             case "Converter de Reais a Libras Esterlinas":
                 novoValor = (float) (valorParaConverter / 6.23);
                 simboloDaMoeda = "";
                 break;
             case "Converter de Reais a Peso argentino":
                 novoValor = (float) (valorParaConverter / 0.019);
                 simboloDaMoeda = "£ ";
                 break;
             case "Converter de Reais a Peso Chileno":
                 novoValor = (float) (valorParaConverter / 0.0060);
                 simboloDaMoeda = "CPL ";
                 break;
                 
             case "Converter de Dólar a Reais":
                 novoValor = (float) (valorParaConverter * 4.80);
                 simboloDaMoeda = "R$ ";
                 break;
             case "Converter de Euro a Reais":
                 novoValor = (float) (valorParaConverter * 5.34);
                 simboloDaMoeda = "R$ ";
                 break;
             case "Converter de Libras Esterlinas a Reais":
                 novoValor = (float) (valorParaConverter * 6.23);
                 simboloDaMoeda = "R$ ";
                 break;
             case "Converter de Peso argentino a  Reais":
                 novoValor = (float) (valorParaConverter * 0.019);
                 simboloDaMoeda = "R$ ";
                 break;
             case "Converter de Peso Chileno a Reais":
                 novoValor = (float) (valorParaConverter * 0.0060);
                 simboloDaMoeda = "R$ ";
                 break;
             default:
                 System.out.println(" Escolha uma opção válida ");
                 break;
         }
         
        return simboloDaMoeda + novoValor;
    }
    
    public void valorConvertido(String valorConertido)
    {
         JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorConertido);
    }
    
    public String escolher()
    {
        String resultado = null;
        
        Object[] opt = { "Yes", "No", "Cancel"}; 
        int op = JOptionPane.showOptionDialog(null, "Deseja continuar?", "Select an Option", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opt, opt[0]);
      
        if(op == 1)
        {
           resultado = "No";
           
        }
        else if(op == 2)
        {
           resultado = "Cancel";
        }
        
        return resultado;
    }
    
    public void concluir()
    {
         JOptionPane.showMessageDialog(null, "Programa concluído");
    }
    
    public void finalizar()
    {
         JOptionPane.showMessageDialog(null, "Programa finalizado");
    }
    
    
}