/*
 * Sistema de Gest�o Acad�mica 
 */
package sistemaAcademico;

import java.util.ArrayList;

public class SistemaAcademico {
	//
	// Aqui est�o sendo declarados objetos das principais classes.
	// Evidentemente cada equipe utilizar� somente alguns deles para 
	// implementar sua por��o do sistema. 
	//
	// Todos os objetos foram declarados como sendo ArrayList e, portanto, 
	// ao finalizar uma execu��o da aplica��o todos os dados ser�o perdidos
	//
	// 
	// Observa��o: Exclua as declara��es que n�o necessitar...
	//
	//
	private static ArrayList <Academico> academicos;

	//
	// Atributos auxiliares...
	//
	private static UnidadesFederativas	unidadesFederativas;
	private static EstadosCivis 		estadosCivis;
	private static SituacaoAcademica 	situacaoAcademica;



	public static void main(String[] args) {  
		int i;
		academicos	= new ArrayList<>();

		
		Evento evento = new Evento();
		evento.setVisible(true);
	
	}

}
