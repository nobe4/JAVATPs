package PartieA;

public class ExceptionCatch {
	
	public ExceptionCatch() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int somme;
	private int nb;	
	
	public static void main(String args[]){
		int cpt = 0, somme = 0, nb = 0;
		boolean notNumeric;
		
		
		while(args[cpt] != null){
			//Test if string
			notNumeric = false;
			try  
			 {  
			   int d = Integer.parseInt(args[cpt]);  
			 }  
			 catch(NumberFormatException nfe)  
			 {  
				 notNumeric = true;
				 System.out.println("La note numero "+(cpt+1)+" n'est pas entière");
			 } 
			if(!notNumeric){
				
				somme += Integer.parseInt(args[cpt]);
				nb++;
			}
			cpt++;
		}
		if(nb != 0){
			System.out.println("La moyenne est de "+(somme/nb));
		}	
		
	}
		

	public ExceptionCatch(int somme, int nb) {
		super();
		this.somme = somme;
		this.nb = nb;
	}


	@Override
	public String toString() {
		return "ExceptionCatch [somme=" + somme + ", nb=" + nb + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nb;
		result = prime * result + somme;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExceptionCatch other = (ExceptionCatch) obj;
		if (nb != other.nb)
			return false;
		if (somme != other.somme)
			return false;
		return true;
	}
}
