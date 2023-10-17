	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//.....................
		//Constantes
		
		
		int result;
		//..............
		//Atributos
	
		int notas=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero de notas","contenedor",-1));

		double[] Nnotas=new double[notas];
		
		Nnotas [0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa primera nota"));
		Nnotas [1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa segunda nota"));
		Nnotas [2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa tercera nota"));
		
		double suma =0;
		suma=Nnotas [0]+Nnotas [1]+Nnotas [2];
		double prom;
		prom = suma/3;
	
		JOptionPane.showMessageDialog(null,"**************\n El prmedio de la nota es:\n  " + prom + "\n" +  "**************\n");
	}
	