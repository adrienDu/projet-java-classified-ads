package com.ecetech.bti4.itproject.classifiedinterface.utils;

/**
 * 
 * @author adri-laptop
 *
 */
public class QualityDataQualification {

	/**
	 * 
	 * @param data
	 * @return
	 */
	public static boolean verifData(String data) {
		if (data.isEmpty())
			return false;
		else
			return true;

	}

	/**
	 * Valide le mot de passe
	 * 
	 * @param motDePasse
	 * @param confirmPasse
	 * @throws Exception
	 */
	public static boolean validationMDP(String motDePasse, String confirmPasse) throws Exception {
		if (!motDePasse.equals(confirmPasse)) {
			return false;
		} else
			return true;
	}

	/**
	 * Verify l'adresse mail saisie.
	 * 
	 * @param email
	 * @param confirmMail
	 */
	public static boolean verifyEmail(String email) throws Exception {
		if ((email != null) && (email.trim().length() != 0)) {
			if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
				return false;
			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * Valide l'adresse mail saisie.
	 * 
	 * @param email
	 * @param confirmMail
	 */
	static void validationEmail(String email, String confirmMail) throws Exception {
		if ((email != null) && (email.trim().length() != 0)) {
			if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
				throw new Exception("Merci de saisir une adresse mail valide ");
			}
		} else {
			throw new Exception("Merci de saisir une adresse mail.");
		}

		if (!email.equals(confirmMail)) {
			throw new Exception("Les adresses emails ne correspondent pas");
		}
	}
	/**
	 * 
	 * @param psw
	 * @param referenceCriptedPsw
	 * @return
	 * @throws Exception
	 */

	public static boolean validateAndCriptPsw(String psw, String referenceCriptedPsw) throws Exception {
		String criptTempPsw = cripterPswAsModel(psw);
		return (validationMDP(criptTempPsw, referenceCriptedPsw));

	}

	private static String cripterPswAsModel(String psw) {
		// TODO Auto-generated method stub
		// mettre en place la même méthode de criptage de psw
		return null;
	}

}