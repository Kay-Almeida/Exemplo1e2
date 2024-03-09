package controller;

import algoritmo.Ordenadores;

public class Ordem {
	
	public Ordem() {
		super(); 
	}
	
	public void met1 (int [] vetor1, int [] vetor2) {
		Ordenadores or = new Ordenadores(); 
		or.funcaoBub(vetor1);
		or.funcaoBub(vetor2);
		System.out.println("Vetor 1 e 2 com BubbleSort");
		for(int valor: vetor1) {
		System.out.print(valor+ " ");
		}
		System.out.println(" ");
		for(int valor: vetor2) {
		System.out.print(valor+ " ");
		}
		System.out.println(" ");
		
	}
	
	public void met2 (int [] vetor1,  int [] vetor2 ) {
		Ordenadores or = new Ordenadores(); 
		or.funcaoMerge(vetor1, 0, vetor1.length-1);
		or.funcaoMerge(vetor2, 0, vetor2.length-1);
		System.out.println("Vetor 1 e 2 com MergeSort");
		for(int valor: vetor1) {
		System.out.print(valor+ " ");
		}
		System.out.println(" ");
		for(int valor: vetor2) {
		System.out.print(valor+ " ");
		}
	}

}
