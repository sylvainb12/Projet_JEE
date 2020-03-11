package Jeu;
public class Utilisateur {
	
	//###### VARIABLES ######
	private String nom;
	private String prenom;
	private int age;
	private static int id = 0;
	
	
	//###### CONSTRUCTEUR ######
	public Utilisateur()
	{
		this.id++;
	}
	
	public Utilisateur(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.id++;
	}
	
	
	//###### GETTERS / SETTERS ######
	public String getName() {
		return nom;
	}

	public String getSurname() {
		return prenom;
	}

	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.nom = name;
	}

	public void setSurname(String surname) {
		this.prenom = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
