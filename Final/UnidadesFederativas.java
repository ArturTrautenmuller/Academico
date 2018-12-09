import java.util.ArrayList;
import java.util.List;

public class UnidadesFederativas {
	 private List <ElementoDescritivo>  uf = new ArrayList<ElementoDescritivo>();

	    public UnidadesFederativas() {		// atribui uma descri��o(completa ou abreviada) para cada estado
	    	ElementoDescritivo ed;
	    		
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(0, "DS", "Desconhecido");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(1, "AC", "Acre");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(2, "AL", "Alagoas");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(3, "AM", "Amazonas");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(4, "AP", "Amap�");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(5, "BA", "Bahia");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(6, "CE", "Cear�");
	        uf.add(ed);
	     
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(7, "DF", "Distrito Federal");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(8, "ES", "Esp�rito Santo");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(9, "GO", "Goi�s");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(10, "MA", "Maranh�o");
	        uf.add(ed);
	       
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(11, "MG", "Minas Gerais");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(12, "MS", "Mato Grosso do Sul");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(13, "MT", "Mato Grosso");
	        uf.add(ed);
	       
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(14, "PA", "Par�");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(15, "PB", "Para�ba");
	        uf.add(ed);
	       
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(16, "PE", "Pernambuco");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(17, "PI", "Piau�");
	        uf.add(ed);
	      
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(18, "PR", "Paran�");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(19, "RJ", "Rio de Janeiro");
	        uf.add(ed);

	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(20, "RN", "Rio Grande do Norte");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(21, "RO", "Rond�nia");
	        uf.add(ed);
	   
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(22, "RR", "Roraima");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(23, "RS", "Rio Grande do Sul");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(24, "SC", "Santa Catarina");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(25, "SE", "Sergipe");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(27, "SP", "S�o Paulo");
	        uf.add(ed);
	        
	        this.uf = new ArrayList<ElementoDescritivo>();
	        ed = new ElementoDescritivo();
	        ed.setElementoDescritivo(28, "TO", "Tocantins");
	        uf.add(ed);
	             
	    }
	    
	    public ArrayList<ElementoDescritivo> getUf() {
	        return (ArrayList<ElementoDescritivo>) (this.uf);
	    }
}
