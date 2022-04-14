package application;

import entities.Client;

public class Main {

	public static void main(String[] args) {
		/* XXX Equals e HashCode são operações da classe Object usadas para comparar se um Objeto é igual ao outro
		 * equals: lento, resposta 100% -- se fala q que é igual então é mesmo
		 * 	equals retorna 'true' ou 'false'
		 * hashCode: rápido, porém pode dar falsos positivos
		 * 	hashCode retorna um numero inteiro representando um código gerado a partir das informações do objeto
		 * 
		 * Um hashcode sempre retorna o mesmo codigo para um mesmo objeto, ex:
		 * hashcode("Maria") sempre vai retornar o mesmo valor.
		 * 
		 * Pode acontecer de um hashCode com paramatros diferentes produzirem o mesmo resultado (colisões)
		 * como o retorno do hashCode é um numero inteiro (32 bits ou 4 bilhões de possibilidades) 
		 * pode acontecer de 2 objetos diferentes terem o mesmo hashcode (pouco provavel mas possível)
		 * 
		 * # Regra de ouro do hashcode #
		 * Em geral, usamos o hashcode para comparar os objetos, se o hashcode for igual ai usamos o equals para ter
		 * 100% de certeza, assim usamos a velocidade do hashcode até chegar em casos 
		 * muitíssimo provaveis de serem iguais
		 * 
		 * Tipos comuns (String, Date, Integer, Double, etc) ja possuem implementação para essas opções.
		 * Classes personalizadas precisam sobrepor.
		 */
		
		Client c1 = new Client("Maria", "Maria@gmail.com");
		Client c2 = new Client("Maria", "Maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		
		//XXX verifica a posição de memória (referencia) e por isso 
		// mesmo sendo objeto com mesmo conteudo
		// terá retorno falso
		System.out.println(c1==c2);
		
		String s1 = "test"; 
		String s2 = "test"; 
		//XXX o compilador trata literais de forma especial e ai a expressão abaixo é
		// verdadeira
		System.out.println(s1==s2);
	}

}
