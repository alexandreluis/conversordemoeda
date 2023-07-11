
package br.com.alexandreluisrigotti.conversordemoeda;


import br.com.alexandreluisrigotti.conversordemoeda.view.JMenuTipoParaConverter;
import javax.swing.JOptionPane;


/**
 *
 * @author alexandreluis
 */
public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        float valorDigitado = 0.0f;
        String selecionado = null;
        String valorConvertido = null;
        

        JMenuTipoParaConverter sistema = new JMenuTipoParaConverter();
        
        while(selecionado != "No")
        {
            selecionado = sistema.menuEscolheConversao();

            if(selecionado == "Converter de Moeda")
            {
                valorDigitado = sistema.menuSolicitaValor();

                String moeda = (String)sistema.menuEscolheMoeda();

                valorConvertido = sistema.converteMoeda(moeda, valorDigitado);

                sistema.valorConvertido(valorConvertido);
                
                sistema.concluir();
            }

            if(selecionado == "Converter de Temperatura")
            {
                System.out.println(" temps     ");
            }

           selecionado = sistema.escolher();
        }
        
        sistema.finalizar();
    }
}