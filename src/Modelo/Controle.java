package Modelo;

import DAL.CarroDAO;
import DAL.PessoaDAO;
import java.util.List;

public class Controle
{
    public String mensagem;
 
       
    public void cadastrarPessoa(List<String> listaDadosPessoa)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarPessoa(listaDadosPessoa);
        if (validacao.mensagem.equals(""))
        {
            Pessoa pessoa = new Pessoa();
            pessoa.nome = listaDadosPessoa.get(1);
            pessoa.rg = listaDadosPessoa.get(2);
            pessoa.cpf = listaDadosPessoa.get(3);
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.cadastrarPessoa(pessoa);
            this.mensagem = pessoaDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
    
    public Pessoa pesquisarPessoaPorId(String numId)
    {
        this.mensagem = "";
        Pessoa pessoa = new Pessoa();
        Validacao validacao = new Validacao();
        validacao.validarId(numId);
        if (validacao.mensagem.equals(""))
        {
            pessoa.idPessoa = validacao.id;
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoa = pessoaDAO.pesquisarPessoaPorId(pessoa);
            this.mensagem = pessoaDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
        return pessoa;
    }
    
    public void editarPessoa(List<String> listaDadosPessoa)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarPessoa(listaDadosPessoa);
        if (validacao.mensagem.equals(""))
        {
            Pessoa pessoa = new Pessoa();
            pessoa.idPessoa = validacao.id;
            pessoa.nome = listaDadosPessoa.get(1);
            pessoa.rg = listaDadosPessoa.get(2);
            pessoa.cpf = listaDadosPessoa.get(3);
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.editarPessoa(pessoa);
            this.mensagem = pessoaDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
    
    public void excluirPessoa(String numId)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarId(numId);
        if (validacao.mensagem.equals(""))
        {
            Pessoa pessoa = new Pessoa();
            pessoa.idPessoa = validacao.id;
            PessoaDAO pessoaDAO = new PessoaDAO();
            pessoaDAO.exclirPessoa(pessoa);
            this.mensagem = pessoaDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
    
        public void cadastrarCarro(List<String> listaDadosCarro)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarCarro(listaDadosCarro);
        if (validacao.mensagem.equals(""))
        {
            Carro carro = new Carro();
            carro.fabricante = listaDadosCarro.get(1);
            carro.modelo = listaDadosCarro.get(2);
            carro.cor = listaDadosCarro.get(3);
            carro.ano = listaDadosCarro.get(4);
            carro.valor = validacao.valor;
            CarroDAO carroDAO = new CarroDAO();
            carroDAO.cadastrarCarro(carro);
            this.mensagem = carroDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
    
    public Carro pesquisarCarroPorId(String numId)
    {
        this.mensagem = "";
        Carro carro = new Carro();
        Validacao validacao = new Validacao();
        validacao.validarId(numId);
        if (validacao.mensagem.equals(""))
        {
            carro.idCarro = validacao.id;
            CarroDAO carroDAO = new CarroDAO();
            carro = carroDAO.pesquisarCarroPorId(carro);
            this.mensagem = carroDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
        return carro;
    }
    
    public void editarCarro(List<String> listaDadosCarro)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarCarro(listaDadosCarro);
        if (validacao.mensagem.equals(""))
        {
            Carro carro = new Carro();
            carro.idCarro = validacao.id;
            carro.fabricante = listaDadosCarro.get(1);
            carro.modelo = listaDadosCarro.get(2);
            carro.cor = listaDadosCarro.get(3);
            carro.ano = listaDadosCarro.get(4);
            carro.valor = validacao.valor;
            CarroDAO carroDAO = new CarroDAO();
            carroDAO.editarCarro(carro);
            this.mensagem = carroDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
    
    public void excluirCarro(String numId)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarId(numId);
        if (validacao.mensagem.equals(""))
        {
            Carro carro = new Carro();
            carro.idCarro = validacao.id;
            CarroDAO carroDAO = new CarroDAO();
            carroDAO.exclirCarro(carro);
            this.mensagem = carroDAO.mensagem;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }

}



