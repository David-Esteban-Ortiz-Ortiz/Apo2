// 1. Proceso con funciones en eclipse 

// Metodo con funciones que busca determinar cualquier numero factorial 

public class news {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;

        while (num != 2) {
            if (num == 1) {
                int j = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "NUMERO FACTORIAL", 3));

                if (j > 0) {
                    int res1 = fac(j);
                    JOptionPane.showMessageDialog(null, "El factorial de " + j + " es " + res1);
                } else {
                    JOptionPane.showMessageDialog(null, "El número está fuera de alcance. Ingresa un número positivo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debes escoger solo entre 1 y 2.");
            }

            num = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué número deseas digitar?\n1. Continuar\n2. Salir"));
        }

        JOptionPane.showMessageDialog(null, "¡Hasta luego!");
    
      
	}
		public static int fac (int j) {
			int res = 1;
			for (int i = 1; i<=j; i++) {
				res = res*i; 
			}
			return res;
		
		
   }
}

// 2. Menu con la utilizacion de switch 

public static void main(String[] args) {
		
		int numero =0;
		while(numero !=4) {
			
		System.out.println("TABLA PARA INSERTAR \n 1. DISTANCIA \n 2. PROMEDIO \n 3. PARTIDOS \n 4. SALIENDO ");
	
		Scanner n1=new Scanner (System.in);
		System.out.println("inserte un numero: "); 
		numero=n1.nextInt();
		String opc ="";
		
		
		switch (numero) {
		
		case 1: 
		opc="OPCION 1"; 
		System.out.println(opc);
			
			int resultado=0;
			int velocidad=20;
			int tiempo=5;
			
			resultado= tiempo*velocidad;
			System.out.println("resultado de distancia: " +resultado); 
		break; 
		
		case 2: 
			opc="OPCION 2";
			System.out.println(opc);
			
			Scanner n11=new Scanner (System.in);
			float not1=n11.nextFloat();
			
			Scanner n2=new Scanner (System.in);
			float not2=n2.nextFloat();
			
			Scanner n3=new Scanner (System.in);
			float not3=n3.nextFloat();
			
			double promedio=0;
			
			promedio = (not1+not2+not3)/3;
			System.out.println("resultado del promedio: " +promedio);
		break;
		
		case 3:
			opc="OPCION 3";
			System.out.println(opc);
			
			double totalpuntos=0;
			
			int pganados=5;
			int pperdidos=3;
			int pempatados=2;
			
			totalpuntos= pganados+pperdidos+pempatados;
			System.out.println("total de puntos: "+totalpuntos);
			
			break;
			
		case 4:
			opc="OPCION 4";
			System.out.println(opc);
			
		System.out.println("SISTEMA CERRADO ");
	
		break; 
	default:
		System.out.println("EL NUMERO NO SE ENCUENTRA EN LA PANTALLA  ");	
		
		break;
		
		}
		
	
	}
	}




