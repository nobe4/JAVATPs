package Ex1;

public class Utilisation{
	public static void main(String args[]) {
		test();
	}

	public static void test()
	{
		Image image = new Image();
		image.addItem(new Rectangle(23, 5, 4, 5));
		image.addItem(new Rectangle(6, 2, 4, 7));
		image.addItem(new Square(2,5,6));
		
		// LES CONTAINER DE TYPE LIST NE GERE PAS LES DOUBLONS
		// NOTRE CAHIER DES CHARGES N'AUTORISE PAS LES DOUBLONS
		Triangle t1 = new Triangle(12,8);
		image.addItem(t1);
		image.addItem(t1);
		
		System.out.println("IMAGE TOUT LE MONDE AFFICHE SA TAILLE!");
		image.sizeAllItems();
		System.out.println("TAILLE DE L'IMAGE");
		System.out.println(image.size());
		System.out.println("\n \n ON COMPARE LES TAILLES 2 A 2!");
		image.compareToAllItems();
		System.out.println("###########################################################");

		Image image2 = new Image();
		image2.addItem(new Rectangle(40,50));             
		image2.addItem(new Rectangle(60,70));
		image2.addItem(new Square(60));
		image2.addItem(new Triangle(120,80));
		System.out.println("IMAGE2 TOUT LE MONDE AFFICHE SA TAILLE!");
		image2.sizeAllItems();
		System.out.println("TAILLE DE L'IMAGE2");
		System.out.println(image2.size());
		System.out.println("\n \n ON COMPARE LES TAILLES 2 A 2!");
		image2.compareToAllItems();
		System.out.println("###########################################################");

		image.addItem(image2);
		System.out.println("IMAGE TOUT LE MONDE AFFICHE SA TAILLE!");
		image.sizeAllItems();
		System.out.println("TAILLE DE L'IMAGE");
		System.out.println(image.size());
		System.out.println("\n \n ON COMPARE LES TAILLES 2 A 2!");
		image.compareToAllItems();
		System.out.println("###########################################################");

		image.addItem(image);
		image.addItem(image2);
		image2.addItem(image);
		System.out.println("###########################################################");
		
		System.out.println("On trie les formes de l'image selon leur taille");
		System.out.println("Avant le tri :");
		image.print();
		image.sortBySize();
		System.out.println("Apr�s le tri :");
		image.print();

        System.out.println("On trie les formes de l'image selon leur distance à l'origine");
        System.out.println("Avant le tri :");
        image.print();
        image.sortByDistanceOrigine();
        System.out.println("Apr�s le tri :");
        image.print();

        System.out.println("La forme avec la plus grande superficie : "+image.getBiggestSize());
        System.out.println("La forme avec la plus grande distance au centre : "+image.getFarestFromOrigin());
	}
}
