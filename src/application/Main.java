package application;

import entities.Client;

public class Main {

	public static void main(String[] args) {
		/* XXX Equals e HashCode s�o opera��es da classe Object usadas para comparar se um Objeto � igual ao outro
		 * equals: lento, resposta 100% -- se fala q que � igual ent�o � mesmo
		 * 	equals retorna 'true' ou 'false'
		 * hashCode: r�pido, por�m pode dar falsos positivos
		 * 	hashCode retorna um numero inteiro representando um c�digo gerado a partir das informa��es do objeto
		 * 
		 * Um hashcode sempre retorna o mesmo codigo para um mesmo objeto, ex:
		 * hashcode("Maria") sempre vai retornar o mesmo valor.
		 * 
		 * Pode acontecer de um hashCode com paramatros diferentes produzirem o mesmo resultado (colis�es)
		 * como o retorno do hashCode � um numero inteiro (32 bits ou 4 bilh�es de possibilidades) 
		 * pode acontecer de 2 objetos diferentes terem o mesmo hashcode (pouco provavel mas poss�vel)
		 * 
		 * # Regra de ouro do hashcode #
		 * Em geral, usamos o hashcode para comparar os objetos, se o hashcode for igual ai usamos o equals para ter
		 * 100% de certeza, assim usamos a velocidade do hashcode at� chegar em casos 
		 * muit�ssimo provaveis de serem iguais
		 * 
		 * Tipos comuns (String, Date, Integer, Double, etc) ja possuem implementa��o para essas op��es.
		 * Classes personalizadas precisam sobrepor.
		 */
		
		Client c1 = new Client("Maria", "Maria@gmail.com");
		Client c2 = new Client("Maria", "Maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		
		//XXX verifica a posi��o de mem�ria (referencia) e por isso 
		// mesmo sendo objeto com mesmo conteudo
		// ter� retorno falso
		System.out.println(c1==c2);
		
		String s1 = "test"; 
		String s2 = "test"; 
		//XXX o compilador trata literais de forma especial e ai a express�o abaixo �
		// verdadeira
		System.out.println(s1==s2);
	}

}
