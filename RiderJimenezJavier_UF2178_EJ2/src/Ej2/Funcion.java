package Ej2;

public class Funcion {

	public static void mostrar_imcs(double matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%.2f  ", matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	public static double media_paciente(double matriz[][], int nPaciente ) {
		double media = 0;
		for(int i = 0; i<matriz[nPaciente].length; i++ ) {
			for (int j=0; j<matriz[0].length; j++) {
				media=media+matriz[nPaciente][j];
			}
		}
		return media/(matriz.length*matriz[nPaciente].length);
	}
	
	
	
	
	
	

}
