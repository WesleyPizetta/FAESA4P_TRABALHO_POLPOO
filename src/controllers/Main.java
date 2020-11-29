package controllers;

import utils.InOutInterface;

public class Main {

	public void main(String metodo, String tamanho) {
		/*
		 * a interface usa essa classe para encaminha o fluxo de execução para rodar todos os metodos ou se rodara apenas um especifico 
		 * */
		
		switch (metodo) {
		case "Quick":
			QuickSortBuscaBi buscaBi = new QuickSortBuscaBi();
			if (tamanho.equals("Todos")) {
				buscaBi.iniciaApp();
			} else {
				buscaBi.iniciaApp(tamanho);
			}

			break;
		case "Heap":
			HeapSortBuscaBi hpbb = new HeapSortBuscaBi();
			if (tamanho.equals("Todos")) {
				hpbb.iniciaApp();
			} else {
				hpbb.iniciaApp(tamanho);
			}

			break;
		case "Todos":
			if (tamanho.equals("Todos")) {
				todosMetodosTamanhos();
			} 

			break;
		case "Hashing":
			HashingController hashController = new HashingController();
			if (tamanho.equals("Todos")) {
				hashController.iniciaApp();
			} else {
				hashController.iniciaApp(tamanho);
			}
			
			break;

		case "ABB":
			ArvoreABBController abbController = new ArvoreABBController();
			if (tamanho.equals("Todos")) {
				abbController.iniciaApp();
			} else {
				abbController.iniciaApp(tamanho);
			}
			break;

		case "AVL":
			ArvoreAVLController arvoreAVLController = new ArvoreAVLController();
			if (tamanho.equals("Todos")) {
				arvoreAVLController.iniciaApp();
			} else {
				arvoreAVLController.iniciaApp(tamanho);
			}

			break;
		default:
			InOutInterface.outputError("Opção não disponivel");
			break;
		}

	}

	public void todosMetodosTamanhos() {
		//metodo que rodará todos os metodos em todos os tamanhos

		HeapSortBuscaBi hpbb = new HeapSortBuscaBi();
		hpbb.iniciaApp();

		QuickSortBuscaBi buscaBi = new QuickSortBuscaBi();
		buscaBi.iniciaApp();

		ArvoreABBController abbController = new ArvoreABBController();
		abbController.iniciaApp();

		ArvoreAVLController arvoreAVLController = new ArvoreAVLController();
		arvoreAVLController.iniciaApp();
		
		HashingController hashingController = new HashingController();
		hashingController.iniciaApp();
	}
	
	
	
	public void todosMetodosUnicoTamanho(String tamanho) {
		//metodo que rodará todos os metodos e um unico tamanho
		HeapSortBuscaBi hpbb = new HeapSortBuscaBi();
		hpbb.iniciaApp(tamanho);

		QuickSortBuscaBi buscaBi = new QuickSortBuscaBi();
		buscaBi.iniciaApp(tamanho);

		ArvoreABBController abbController = new ArvoreABBController();
		abbController.iniciaApp(tamanho);

		ArvoreAVLController arvoreAVLController = new ArvoreAVLController();
		arvoreAVLController.iniciaApp(tamanho);
		
		HashingController hashingController = new HashingController();
		hashingController.iniciaApp(tamanho);

	}

}
