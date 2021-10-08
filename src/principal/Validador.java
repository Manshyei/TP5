package principal;

/**
 * Verifica se os dados fornecidos est�o no formato e requisitos esperados
 * @author Caio C�sar e Lucas Henrique
 * @version 1.0 (Out 2020)
 */

public class Validador {
	
	/**
	 * Verifica se a data fornecida est� no formato esperado. S�o feitas as seguintes verifica��es:
	 * (1) se a data tem 10 caracteres
	 * (2) se a data tem 8 caracteres num�ricos
	 * (3) se o 3� e o 6� caractere s�o "/"
	 * (4) se o primeiro caractere de dias est� entre 0 e 3
	 * (5) se o primeiro caracter de meses est� entre 0 e 1
	 * (6) se o primeiro caractere de anos est� entre 1 e 2
	 * (7) se os caracteres de dias est�o entre 1 e 31
	 * (8) se os caracteres de meses est�o entre 1 e 12
	 * (9) se os caracteres de anos est�o entre 1888 e 2021
	 * @param data uma string que representa uma data a ser verificada
	 * @return um boolean (Verdadeiro ou falso), false caso reprove em algum teste e true caso passe em todos
	 */

	public boolean validaData(String data) {
		
		if (data.length() != 10) { // Verifica se existem exatos 10 caracteres
			return false;
		}
		
		if (data.replaceAll("[\\D]", "").length() != 8) { // Verifica se existem exatos 8 caracteres num�ricos
			return false;
		}
		
		if (data.substring(2, 3).indexOf("/") != 0 || data.substring(5, 6).indexOf("/") != 0) { // Verifica se existem 2 "/" em posi��es espec�ficas
			return false;
		}
		
		if (data.substring(0, 1).indexOf("0") != 0 && data.substring(0, 1).indexOf("1") != 0 && 
				data.substring(0, 1).indexOf("2") != 0 && data.substring(0, 1).indexOf("3") != 0) { // Verifica se o primeiro caractere de dias est� entre 0 e 3
			return false;
		}
		
		if (data.substring(3, 4).indexOf("0") != 0 && 
				data.substring(3, 4).indexOf("1") != 0) { // Verifica se o primeiro caractere de meses est� entre 0 e 1
			return false;
		}
		
		if (data.substring(6, 7).indexOf("1") != 0 && 
				data.substring(6, 7).indexOf("2") != 0) { // Verifica se o primeiro caractere de anos est� entre 1 e 2
			return false;
		}
		
		if (Integer.parseInt(data.substring(0, 2)) < 1 || Integer.parseInt(data.substring(0, 2)) > 31) { // Verifica se os dias est�o entre 1 e 31
			return false;
		}
		
		if (Integer.parseInt(data.substring(3, 5)) < 1 || Integer.parseInt(data.substring(3, 5)) > 12) { // Verifica se os meses est�o entre 1 e 12
			return false;
		}
		
		if (Integer.parseInt(data.substring(6, 10)) < 1888 || Integer.parseInt(data.substring(6, 10)) > 2021) { // Verifica se os anos est�o entre 1888 e 2021
			return false;
		}

		return true;
	}
	
	/**
	 * Verifica se o CPF fornecido est� no formato esperado. S�o feitas as seguintes verifica��es:
	 * (1) se o CPF tem 14 caracteres
	 * (2) se o CPF tem 11 caracteres num�ricos
	 * (3) se o 4� e o 8� caractere s�o "." e o 12� caractere "-"
	 * (4) se os caracteres num�ricos n�o s�o todos repetidos
	 * @param cpf uma string que representa um CPF a ser verificado
	 * @return um boolean (Verdadeiro ou falso), false caso reprove em algum teste e true caso passe em todos
	 */
	
	public boolean validaCPF(String cpf) {
		if (cpf.length() != 14)
			return false;
		
		if (cpf.replaceAll("[\\D]", "").length() != 11)
			return false;
		
		if (cpf.substring(3, 4).indexOf(".") != 0 || cpf.substring(7, 8).indexOf(".") != 0 || 
				cpf.substring(11, 12).indexOf("-") != 0) // Verifica se existem 2 "/" em posi��es espec�ficas
			return false;
		
		if (cpf.replaceAll("[\\D]", "").equals("00000000000") || cpf.replaceAll("[\\D]", "").equals("11111111111") ||
				cpf.replaceAll("[\\D]", "").equals("22222222222") || cpf.replaceAll("[\\D]", "").equals("33333333333") ||
				cpf.replaceAll("[\\D]", "").equals("44444444444") || cpf.replaceAll("[\\D]", "").equals("55555555555") ||
				cpf.replaceAll("[\\D]", "").equals("66666666666") || cpf.replaceAll("[\\D]", "").equals("77777777777") ||
				cpf.replaceAll("[\\D]", "").equals("88888888888") || cpf.replaceAll("[\\D]", "").equals("99999999999"))
			return false;
		
		return true;
	}
	
}
