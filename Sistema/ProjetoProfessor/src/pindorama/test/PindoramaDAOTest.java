package pindorama.test;

import pindorama.dao.PindoramaDAO;
import pindorama.pojo.Conta;

/**
 * 
 * @author marco.mangan@gmail.com
 *
 */
public class PindoramaDAOTest {

	public static void main(String[] args) {
		PindoramaDAO dao = new PindoramaDAO();
		System.out.println(dao.findContaByCPF("1234"));
		
		Conta c = new Conta("1234", "Marco Mangan", "QAZWSX123");
		//dao.insertConta(c);
		
		System.out.println(dao.findContaByCPF("1234"));
		Conta teste = dao.findContaByCPF("12345678901");
		System.out.println(teste);
		
		System.out.println(dao.findMovimentacaoByConta(teste));
		
	}

}
