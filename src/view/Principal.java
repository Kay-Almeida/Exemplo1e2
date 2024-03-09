package view;

import controller.Ordem;

public class Principal {
	static int [] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
	static int [] vetor2 = {44, 43, 42, 41, 40, 39, 38};
	
	public static void main(String[] args) {
		Ordem ord = new Ordem();
		
		ord.met1(vetor1, vetor2);
		ord.met2(vetor1, vetor2);
		
	}

}
