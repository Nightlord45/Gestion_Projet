package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Decimal{
    @Required
    private static final int [] codeSecret = {1,4,0,2}; 
    private static final int [] valeur = {1,3,1,0}; 
    private static final int [] valeur1 = {1,4,0,2}; 
    private static final int [] valeur2 = {2,4,0,2}; 
    private int compteur;

    public Decimal(){
	this.compteur=10;
	}

    public int getCompteur(){
	return compteur;
    }
}
