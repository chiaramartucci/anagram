package it.polito.tdp.anagram.model;

import java.util.List;

public class Anagram {

	// interfaccia pubblica che userà una funzione
	// ricorsiva interna che lavora con più info a disposizione
	public List<String> anagrammi (String parola){
		// lancio (avvio) la ricorsione
		permuta(0, "", parola);
		return null;
	}
	
	// livello rappresenta la dimensione della soluzione
	// (lunghezza) parziale che abbiamo creato fin ora
	// livello iniziale = 0
	
	// parziale = stinga che contiene l'anagramma incompleto
	// in fase di cotruzione
	
	// lettere = le lettere della parola iniziale che
	// non abbiamo utilizzato ancora 
	private void permuta (int livello, String parziale, String lettere) {
		
		if(lettere.length()==0) {
			// la soluzione parziale è anche soluzione completa
			System.out.println(parziale);
		}
		else {
			//fai ricorsione
			// sottoproblema == una lettera (un singolo carattere)
			// di 'lettere'
			
			for (int pos=0; pos<lettere.length(); pos++) {
				char tentativo = lettere.charAt(pos);
				
				String nuovoParziale = parziale + tentativo;
				// togli il carattere pos da lettere
				String nuovaLettere = lettere.substring(0,pos)+lettere.substring(pos+1);
						
				permuta (livello+1,nuovoParziale, nuovaLettere);
				
				//Backtracking (non serve)
				// rimetti a posto 'parziale' 
				// rimetti a posto 'lettere'
			}
		}
	}
}
