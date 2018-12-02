package sistemaAcademico;
import java.util.ArrayList;

/*
* Nome.......: TiposDocumentos
* Objetivo...: Representa os poss�veis tipos de documentos que uma pessoa pode
*              ter para identificar-se
* Observacoes: Se for desconhecido, utilize o tipo 0 - DS - Desconhecido.
*/
public class TiposDocumentos {
    private ArrayList<ElementoDescritivo>           tiposDocumentos;
    
    public TiposDocumentos() {
        ElementoDescritivo  elementoDescritivo;
        
        tiposDocumentos     = new ArrayList();
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(0, "DS", "Desconhecido");
        tiposDocumentos.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(1, "RG", "Registro Geral");
        tiposDocumentos.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(2, "CPF", "CPF/MF");
        tiposDocumentos.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(3, "CP", "Carteira Profissional");
        tiposDocumentos.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(4, "PST", "Passaporte");
        tiposDocumentos.add(elementoDescritivo); 
        elementoDescritivo  = new ElementoDescritivo();
        elementoDescritivo.setElementoDescritivo(5, "OUT", "Outro");
        tiposDocumentos.add(elementoDescritivo); 
    }
    
    /**
     * @return A cole��o de tipos de documentos.
     */
    public ArrayList<ElementoDescritivo> getTiposDocumentos() {
        return (this.tiposDocumentos);
    }
    /**
     *
     * @param index �ndice, na cole��o de tipos de documentos, que se deseja recuperar.
     * @return O tipo de documento desejado ou, se inexistente, um elemento vazio.
     */
    public ElementoDescritivo getTipoDocumento(int index) {
        if ((index >= 0) && (index < this.tiposDocumentos.size())) {
            return (this.tiposDocumentos.get(index));
        }
        else {
            return (new ElementoDescritivo());
        }
    }
    /**
     * 
     * @param str A descricao abreviada do tipo de documento a localizado na 
     *            cole��o de tipos de documentos.
     * @return O �ndice, na cole��o de tipos de documentos, onde est� localizado
     *         o tipo de documento desejado ou -1 se inexistente.
     */
    public int indexOf(String str) {
        int i;
        for (i = 0; (i <= this.tiposDocumentos.size()); i++) {
            if (this.tiposDocumentos.get(i).getDescricaoAbreviada().equalsIgnoreCase(str)) {
                return (i);
            }
        }
        return (-1);
    }
    
    public int size() {
        return(this.tiposDocumentos.size());
    }
}
