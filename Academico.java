package sistemaAcademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Acad�mico
* Objetivo...: Representar uma pessoa que exerce o papel de acad�mico(a) na 
*              institui��o de ensino.
* Observacoes:
*/
public class Academico extends Pessoa {
    long	matricula;
    int		situacaoAcademica;
    //
    // A equipe respons�vel dever� verificar se h� necessidade de outros
    // atributos e m�todos para inseri-los....
    // 
    // Observa��o: Lembre-se que devo poder cadastrar, alterar, consultar e 
    // excluir pelo n�mero de matricula...

    @Override
    public void cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alterar(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa consultar(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  


}
   