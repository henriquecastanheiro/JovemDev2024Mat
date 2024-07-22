package aula_introducao;

import javax.swing.JOptionPane;

public class ExercicioValidarSenha {
	
	public static void main(String[] args) {
		/*
		 * Faça um programa para validar senhas.
		 * A senha deve possuir no mínimo 8 catacteres
		 * É necessário conter letras e números
		 * Deve possuir no mínimo um caractere maísculo
		 * Deve conter um desses caracteres (!,@,#,$,%,&.*)
		 * Deve solicitar a senha e validação, de modo que ambas sejam iguais.
		 * Expressão Regular
		 */
		String senha = JOptionPane.showInputDialog("Digite uma senha: " + "\n" + "É necessário conter letras e números;" 
		 + "\n" + "Deve possuir no mínimo um caractere maísculo;" + "\n" + "Deve conter um desses caracteres (!,@,#,$,%,&.*).");
		if (senha.length() < 8 ) {
			JOptionPane.showMessageDialog(null,"Senha Invalidá\n Minímo 8 digitos");
		} else if (senha.matches(".*[a-zA-Z].*") != true || senha.matches(".*[0-9].*") != true){
			JOptionPane.showMessageDialog(null,"Senha inválida\n Deve conter letras e números.");
		} else if (senha.matches(".*[A-Z].*") != true) {
			JOptionPane.showMessageDialog(null,"Senha inválida\n Deve conter pelos menos uma letra maíuscula.");
		} else if (senha.matches(".*[!@#%&].*") != true) {
			JOptionPane.showMessageDialog(null,"Senha inválida - Deve conter algum destes caracteres especiais [!, @, #, %, &].");
		} else {
			String verificacao = JOptionPane.showInputDialog("Senha Válida\n Digite novamente para confirmação.");
			if (verificacao.equals(senha)) {
				JOptionPane.showMessageDialog(null, "Senha criada com sucesso: " + senha);
			} else {
				JOptionPane.showMessageDialog(null, "As senhas estão diferentes\n Tente novamente");
			}
		}
	}
}
