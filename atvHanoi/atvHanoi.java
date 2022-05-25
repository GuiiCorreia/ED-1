package atvHanoi;

import java.util.Scanner;

public class atvHanoi {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		atvHanoi H = new atvHanoi();
		long inicioTempo = System.currentTimeMillis();

		System.out.println("Numero de discos: ");
		n = sc.nextInt();
		H.atvHanoi(n, 1, 2, 3);

		long tempoFinal = System.currentTimeMillis();
		long totalTempo = tempoFinal - inicioTempo;
		int mili = (int) totalTempo % 1000;
		int seg = (int) (totalTempo / 1000) % 60;
		int min = (int) (totalTempo / 60000) % 60;
		int horas = (int) totalTempo / 3600000;
		System.out.println(String.format("%02d : %02d : %02d : %03d", horas, min, seg, mili));
	}

	public void atvHanoi(int num, int inicio, int tempo, int fim) {

		if (num > 0) {
			atvHanoi(num - 1, inicio, fim, tempo);
			atvHanoi(num - 1, tempo, inicio, fim);

		}

	}

}
