
package br.com.alexandreluisrigotti.conversordemoeda.util;

import br.com.alexandreluisrigotti.conversordemoeda.model.Moeda;

/**
 *
 * @author alexandreluis
 */
public class Conversor 
{
    Moeda tipoUm;
    Moeda tipoDois;
    
    
    public Conversor() {}

    public Conversor(Moeda tipoUm, Moeda tipoDois) 
    {
        this.tipoUm = tipoUm;
        this.tipoDois = tipoDois;
    }
    
    public float Converter(Moeda tipoUm, Moeda tipoDois)
    {
        return tipoUm.getValor() * tipoDois.getValor();
    }
    
    public float Reverter(Moeda tipoUm, Moeda tipoDois)
    {
        return tipoUm.getValor() / tipoDois.getValor();
    }
}