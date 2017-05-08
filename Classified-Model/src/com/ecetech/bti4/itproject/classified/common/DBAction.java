package com.ecetech.bti4.itproject.classified.common;

//~--- JDK imports ------------------------------------------------------------

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Class DB Action, methodes liée a la base de donnée 
 * @author Maeva, Adrien, Moaz
 */

public class DBAction {
	/**
	 * Contient des outils d'acces a la base de donnee
	 *
	 */

	///Chemin d'acces a la BDD
    private static final String dbPath   = "jdbc:mysql://localhost:3306/mydb";
    ///User utilise pour se connecter
    private static final String user     = "classified";
    ///Mot de passe de connection
    private static final String password = "12345";

    private static Connection   con      = null;
    private static Statement    stm      = null;
    private static ResultSet    res      = null;
    private static int          erreur;
    
/**
 * public static DBConnexion()
 * initie une connection a la base de donnee
 * @return null si connecte ou un message d'erreur
 */
    public static Exception DBConnexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(dbPath, user, password);
            stm = con.createStatement();

            return null;
        } catch (Exception e) {
            System.out.println("ERROR in Connexion to " + dbPath + " :" + e.getMessage());

            return e;
        }
    }

    /**
     * public static DBClose()
     * termine la connection a la base de donnee
     * @return un message d'erreur si besoins
     */
    public static int DBClose() {
        try {
            stm.close();
            con.close();
        } catch (Exception e) {
            System.out.println("ERROR in Connexion closure to " + dbPath + " : " + e.getMessage());
        }

        return erreur;
    }

    /**
     * Getters & setters 
     * 
     * @return
     */
    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        DBAction.con = con;
    }

    public static Statement getStm() {
        return stm;
    }

    public static void setStm(Statement stm) {
        DBAction.stm = stm;
    }

    public static ResultSet getRes() {
        return res;
    }

    public static void setRes(ResultSet res) {
        DBAction.res = res;
    }
}

