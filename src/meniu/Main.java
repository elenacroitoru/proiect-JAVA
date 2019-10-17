package meniu;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Aperitiv");
	System.out.println("2.Supa de rata");
	System.out.println("3.Gratar pui/porc cu cartofi natur");
	System.out.println("4.Papanas");
	System.out.println("Alege ce vrei sa mananci");
	int op=sc.nextInt();
	switch(op) {
	case 1:System.out.println("Ai ales Papanas");
	break;
	case 2:System.out.println("Ai ales Gratar pui/porc cu cartofi natur");
	break;
	case 3:System.out.println("Ai ales Aperitiv");
	break;
	case 4: System.out.println("Ai ales Supa de rata");
	break;
	}

}
}