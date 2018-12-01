
package sistemaAcademico;

/*
* Nome.......: Endere�o
* Objetivo...: Representar um endere�o de um logradouro qualquer.
* Observacoes:
*/
public class Endereco {
    int                             tipoLogradouro;         
    int                             codigoLogradouro;       // � o CEP do logradouro
    String                          descricaoLogradouro;
    String                          complementoLogradouro;  // Por exemplo: esquina com Rua 26.
    int                             numero;                 // 0 quando inexistente
    String                          quadra;                 
    String                          lote;                         
    String                          bairro;
    long                            municipio;
    int                             unidadeFederacao;
    int                             pais;
    String                          referencia;             // Ponto de refer�ncia do endere�o.
}


