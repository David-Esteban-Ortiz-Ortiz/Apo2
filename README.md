![Logo Java](https://seeklogo.com/images/J/java-logo-7833D1D21A-seeklogo.com.png)

# APO 2 Manejo de funciones

Aqui podras encontrar una gran variedad de codigos para poder usarse en la clase de Algoritmos y programación 2.

## Resolución de problemas por computador.

Pasos:
1. Conocer el problema.
2. Análisis profundo del tema.
3. Diseño del problema.
4. Prueba de la solción del problema.
5. Codificación.
6. Compilación y ejecución.
7. Verificación y depuración.

### Menu con System.out.print

En este menu se ven incluidas las tecnicas como el switch y el while 

```
import java.util.Scanner;


public class menu1 {
	//@author David Esteban Ortiz

		

	public static void main(String[]  args) {
		//TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int numero = 0;
		while (numero!=5) {
		System.out.println("1. Conversor de moneda");
		System.out.println("2. Promedio de notas");
		System.out.println("3. Clasificacion de equipos");
		System.out.println("4. Par o impar");
		System.out.println("5. exit");
		System.out.println("seleccióna una opcion, del 1 al 5");
		numero = sc1.nextInt();

		switch(numero){
		case 1:
			System.out.print("ingresasr el valor en pesos:");
			Scanner sc8=new Scanner(System.in);
			double pesos=sc8.nextDouble();
			
			double dolares=0;
			dolares=(pesos/4150);
			
			System.out.print("El valor en dolares es:"+ dolares );
			
			break;
		  case 2:
				System.out.print("ingresa la nota 1");
				Scanner sc2=new Scanner(System.in);
				float nota1=sc2.nextFloat();
				System.out.print("ingresa la nota 2");
				Scanner sc3=new Scanner(System.in);
				float nota2=sc3.nextFloat();
				System.out.print("ingresa la nota 3");
				Scanner sc4=new Scanner(System.in);
				float nota3=sc4.nextFloat();
				double promedio=0;
				promedio=(nota1+nota2+nota3)/3;
				System.out.print("El promedio de las notas es: "+promedio);
				
		break;
		
		  case 3:
			System.out.print("Ingresar ´partidos ganados");
			int PG=3;
			int PE=1;
			int PP=0;
			double puntos= 0;
		
			Scanner sc5=new Scanner(System.in);
			float PG1=sc5.nextFloat();
			
			System.out.print("Ingresar partidos empatados");
			Scanner sc6=new Scanner(System.in);
			float PE2=sc6.nextFloat();
			
			System.out.print("ingresar partidos perdidos");
			Scanner sc7=new Scanner(System.in);
			float PP3=sc7.nextFloat();
			puntos=(PG*PG1)+(PE*PE2)+(PP*PP3);
			System.out.print("El promedio de las notas: "+puntos);
			
			break;
			
		  case 4:
			Scanner sc9=new Scanner(System.in);
			
			System.out.print("ingresar numero: ");
			double n = sc9.nextDouble();
	
			if (n==0) {
			System.out.print("El numero es = 0");
			}
			else if (n %2 ==0) {
			System.out.print("El numero es par");
			}
			else {
			System.out.print("El numero es impar");
			}
			
			break;
			
		  case 5:
				System.out.print("exit");
			
		  default:
			  
		}
			
		
		}


	
	}
	

}
```

### Menu JOptionPane

Una serie de ejemplos paso a paso que le indican cómo ejecutar un entorno de desarrollo.

Di cuál será el paso.

```
import javax.swing.JOptionPane;

public class Mymenu {
	
	public static void main(String[] args) {

		int op=0;
		while (op!=5){
			
		op = Integer.parseInt(JOptionPane.showInputDialog(null," 1: Conversor COP/USD\n 2: Promedio de Notas\n 3: Clasificacion Equipo\n 4: Numeros Par/Impar\n 5: Salir","Selecciona Un Ejercicio",-1));
			   
					
		if (op==1) {
		Divisa ();
		}
					
		else if (op==2) {
		Darpromedio();
		}
		else if (op==3) {
		Darpuntos();
					}
		else if (op==4) {
		Par();
		}
		else if (op==5) {

		JOptionPane.showMessageDialog(null,"Programa finalizado","Salir",-1);
		JOptionPane.showMessageDialog(null,"Bye","______________",2);
		}
		else{
			
		JOptionPane.showMessageDialog(null,"Opción Inválida","Error",2);
		}
		}
		}

		public static void Divisa () {
		double D;
		double NV;
					
		D = 4100;
					
		int v = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el valor en pesos;","Divisa",1));
					
		NV = (v/D);
				    		
		if (v<0) {
		JOptionPane.showMessageDialog(null,"el valor no es valido","Divisa",1);
		}
		else {
		}
		JOptionPane.showMessageDialog(null,"el valor en dolares es:" + NV,"Divisa",-1);
		}

		public static void Darpromedio () {

		int x;
		int t;
						
		int n1 =Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la nota 1:"));
		int n2 =Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la nota 2:"));
		int n3 =Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la nota 3:"));
						
		x = (n1+n2+n3);
		t = (x/3);
						
		JOptionPane.showMessageDialog(null,"el promedio es:" + t);
		}
					
		public static void Darpuntos () {
			
		int pt =Integer.parseInt(JOptionPane.showInputDialog(null,"Partidos:"));
		int pg =Integer.parseInt(JOptionPane.showInputDialog(null,"Partidos ganados:"));
		int pp =Integer.parseInt(JOptionPane.showInputDialog(null,"Partidos perdidos:"));
		int pe =Integer.parseInt(JOptionPane.showInputDialog(null,"Partidos empatados:"));
					
		pt = ((pg*3)+(pp*0)+(pe*1));
						
		JOptionPane.showMessageDialog(null,"los puntos totales son:" + pt);
		}

		public static void Par () {
						
		int no =Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese numero:"));

		if (no == 0) {
		JOptionPane.showMessageDialog(null,"el numero es 0");
		}
		else if (no%2 != 0){
			
		JOptionPane.showMessageDialog(null,"el numero es impar");
		}
		else if (no%2 == 0){
							
		JOptionPane.showMessageDialog(null,"el numero es par");
		}
		}	
		}

```

Y repetir

```
until finished
```

Termine con un ejemplo de cómo sacar algunos datos del sistema o usarlos para una pequeña demostración.

## Ejecutando las pruebas

Explicar cómo ejecutar las pruebas automatizadas para este sistema.

### Dividir en pruebas de principio a fin

Explique qué prueban estas pruebas y por qué.

```
Give an example
```

### Y pruebas de estilo de codificación.

Explique qué prueban estas pruebas y por qué.

```
Give an example
```

## Despliegue (Deployment)

Agregue notas adicionales sobre cómo implementar esto en un sistema en vivo


## Construido con

Dropwizard : el marco web utilizado
Maven - Gestión de dependencias
ROMA : se utiliza para generar canales RSS

## Versionado

Usamos Git para el control de versiones. Para conocer las versiones disponibles, consulte las etiquetas en este repositorio .

## Autores

* **Gustavo Sánchez** 


## Licencia

Este proyecto tiene la licencia MIT; consulte el archivo LICENSE.md para obtener más detalles.

## Expresiones de gratitud (Acknowledgments)

* Un consejo para cualquiera cuyo código se haya utilizado
* Inspiración
* etc
