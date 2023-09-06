package Modelo;

import java.util.List;

public class Validacao
{
    public String mensagem;
    public Integer id;
    public Double valor;
    
    
    public void validarId(String numId)
    {
        this.mensagem = "";
        try
        {
            this.id = Integer.valueOf(numId);
        } 
        catch (NumberFormatException e)
        {
            this.mensagem = "Digite um ID válido";
        }
    }
    
    public void validarValor(String valor)
    {
        this.mensagem = "";
        try
        {
            this.valor = Double.valueOf(valor);
        } 
        catch (NumberFormatException e)
        {
            this.mensagem = "Digite um valor válido";
        }
    }
    
    public void validarCarro(List<String> listaDadosCarro)
    {
        this.mensagem = "";
        validarId(listaDadosCarro.get(0));
        if (listaDadosCarro.get(1).length() < 3)
            this.mensagem += "Fabricante deve ter mais que 3 caracteres\n";
        if (listaDadosCarro.get(2).length() > 50)
            this.mensagem += "Modelo deve ter menos que 50 caracteres\n";
        if (listaDadosCarro.get(3).length() > 30)
            this.mensagem += "Cor deve ter menos que 30 caracteres\n";
        if (listaDadosCarro.get(4).length() > 13)
            this.mensagem += "Ano deve ter menos que 13 caracteres\n";
        validarValor(listaDadosCarro.get(5));
        
        
    }
    
    public void validarPessoa(List<String> listaDadosPessoa)
    {
        this.mensagem = "";
        validarId(listaDadosPessoa.get(0));
        if (listaDadosPessoa.get(1).length() < 3)
            this.mensagem += "Nome deve ter mais que 3 caracteres\n";
        if (listaDadosPessoa.get(1).length() > 50)
            this.mensagem += "Nome deve ter menos que 50 caracteres\n";
        if (listaDadosPessoa.get(2).length() > 10)
            this.mensagem += "Rg deve ter menos que 10 caracteres\n";
        if (listaDadosPessoa.get(3).length() > 13)
            this.mensagem += "CPF deve ter menos que 13 caracteres\n";
        
        
        
    }
    
    
}
