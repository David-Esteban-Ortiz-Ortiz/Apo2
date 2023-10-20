### proceso con funciones en eclipse 

//metodo con funciones que busca determinar cualquier numero factorial 

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


