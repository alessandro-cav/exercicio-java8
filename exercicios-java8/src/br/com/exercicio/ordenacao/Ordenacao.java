package br.com.exercicio.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordenacao {
	public static void main(String[] args) {

		ArrayList teste = new ArrayList();
		teste.add(new Presidente("Luis Inacio", 2002, 2005));
		teste.add(new Presidente("Fernando Henrique", 1998, 2001));
		teste.add(new Presidente("Fernando Henrique", 1994, 1997));

		// Em ordem crescente do início do mandato
		Collections.sort(teste, new Comparator() {
			public int compare(Object o1, Object o2) {
				Presidente p1 = (Presidente) o1;
				Presidente p2 = (Presidente) o2;
				return p1.inicio < p2.inicio ? -1 : (p1.inicio > p2.inicio ? +1 : 0);
			}
		});
		System.out.println(teste);

		// Em ordem decrescente do inicio do mandato
		Collections.sort(teste, new Comparator() {
			public int compare(Object o1, Object o2) {
				Presidente p1 = (Presidente) o1;
				Presidente p2 = (Presidente) o2;
				return p1.inicio < p2.inicio ? +1 : (p1.inicio > p2.inicio ? -1 : 0);
			}
		});
		System.out.println(teste);

	}

}
