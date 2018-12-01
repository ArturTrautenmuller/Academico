package sistemaAcademico;

import java.util.Date;

/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Pessoa
* Objetivo...: Representar uma pessoa qualquer.
* Observacoes: Exige-se que a pessoa tenha um identificador �nico, ou seja, 
*              duas pessoas n�o podem ter o mesmo tipo e n�mero de identificador
*              
*/
public abstract class Pessoa {
    DocumentoIdentificacao          documento;              
    private String                  prenome;                // Exemplo: Maria Luiza
    private String                  sobrenome;              // da Silva Ferreira Prado
    
    private Date                    dataNascimento;
    private long                    municipioNascimento;    // C�digo do município
    private int                     ufNascimento;
    private int                     paisNascimento;
    
    private int                     estadoCivil;            // C�digo do estado civil
    private Endereco                endereco;
    private Telefone                telefoneResidencial;
    private Telefone                telefoneComercial;
    private Telefone                telefoneAlternativo;
    private Email                   emailPessoal;           // e-mails podem ser deixados em branco
    private Email                   emailComercial;
    private Email                   emailAlternativo;
    
    public abstract void cadastrar();
    public abstract void alterar(DocumentoIdentificacao documento);
    public abstract void excluir(DocumentoIdentificacao documento);
    public abstract Pessoa consultar(DocumentoIdentificacao documento);
	    
}
