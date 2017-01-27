package com.ecetech.bti4.itproject.classified.common;

/**
 * Genere un UUID 
 * @author Maeva, Adrien, Moaz
 *
 */

/**
 * public MakeUUID()
 * Genere un UUID aleatoire et le renvois sous forme de String
 * @return String
 */
public class MakeUUID {
	public static String generate(){
		return java.util.UUID.randomUUID().toString();
	}

}
