package Ex1;

import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class Image extends Forme {
	// LE CODE INVARIANT PAR RAPPORT A LA CLASSE D'IMPLEMENTATION DE L'INTERFACE LIST
	// (ArrayList ou LinkedList)
	// L'UN DES OBJECTIFS DE LA POO EST REMPLI:
	// Invariance du code par rapport � la r.p.i. (r�presentation interne)
	// List <Forme> items = new ArrayList<Forme>();
	List <Forme> items = new LinkedList<Forme>();

    public Image(){
        super();
    }

    public void sortByDistanceOrigine(){
        Collections.sort(items, new DistanceComparator());  // Utilise la class DistanceComparator pour faire le sort
    }

	public void addItem( Forme x) {
		if (this == x)
		{
			System.out.println("Ne pas ajouter une image dans la m�me image");
			return;
		}
		// Si l'on ne veut pas dupliquer des formes dans le container
		// UTILE CAR LES CLASSES D'IMPLEMENTATION DE L'INTERFACE LIST NE GERENT PAS LES DOUBLONS!	
		if (items.contains(x))
		{
			System.out.println("Ne pas ajouter une forme d�j� existante dans une image");
			return;
		}
		// ON VEILLE A NE PAS METTRE DANS LE CONTAINER D'UNE IMAGE INITIALE
		// UNE NOUVELLE IMAGE DONT LE CONTAINER CONTIENT DEJA L'IMAGE INITIALE
		if ( isImage(x) &&  isCirculaire(x) )
		{
			System.out.println("Attention � la circularit�!");
			return;
		}

		items.add(x);
	}

	private boolean isImage(Forme x)
	{
		//return (x.getClass().getName().equals("Image"));
		return (x instanceof Image);
	}

	private boolean isCirculaire(Forme x)
	{
		return (((Image)x).items).contains(this);
	}

	public double size() {
		double total = 0;

		if (items.size() == 0)
			System.out.println("Rien dans l'image");
		else {
			for (Forme item : items) {
				total += item.size();
			}
		}

		return total;
	}

	public void sizeAllItems() {
		if (items.size() == 0)
			System.out.println("Rien dans l'image");
		else {
			for (Forme item : items) {
				// on affiche la taille repr�sent�e par un double
				System.out.println(item.size());
			}
		}
	}

	// ON COMPARE LES TAILLES 2 � 2
	public void compareToAllItems() {
		if (items.size()< 2)
		{
			System.out.println("Moins de 2 �l�ments dans l'image ==> pas de comparaison");
			return;
		}
		
		Forme item1, item2;
		for (int i = 0;i < items.size() -1;i++) {
			item1 = items.get(i);
			item2 = items.get(i+1);

			// ON COMPARE LES TAILLES 2 � 2
			int resultat = item1.compareTo(item2);
			switch(resultat)
			{
			case -1: System.out.println(item1.toString()  + "<" + item2.toString() ); break;
			case 0: System.out.println(item1.toString()  + "=" + item2.toString() ); break;
			case 1:	System.out.println(item1.toString()  + ">" + item2.toString() ); break;
			default: System.out.println("LE PIRE EST ARRIVE!"); break;
			}                  	
		}
	}

	public void sortBySize(){
		Collections.sort(this.items);
	}

    public Forme getBiggestSize(){
        return Collections.max(items);
    }

    public Forme getFarestFromOrigin(){
        return Collections.max(items, new DistanceComparator());
    }
	
	public void print(){
		for (Forme item : items) {
			System.out.println("distance = " + item.distanceOrigine() + " pour " + item);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Image [taille =" + this.size() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
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
		Image other = (Image) obj;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		return true;
	}

}
