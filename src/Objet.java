/**
 * Informations communes � tous les objets (joueurs, murs, boules)
 * permet de m�moriser la position de l'objet et de g�rer les  collisions
 *
 */
public abstract class Objet {

	/**
	 * position X de l'objet
	 */
	protected Integer posX ;
	/**
	 * position Y de l'objet
	 */
	protected Integer posY ;
	
	/**
	 * contr�le si l'objet actuel touche l'objet pass� en param�tre
	 * @param objet contient l'objet � contr�ler
	 * @return true si les 2 objets se touchent
	 */
	public Boolean toucheObjet (Objet objet) {
		return null;
	}
	
	/**
	 * getter sur posX
	 */
	public Integer getposX() {
		return posX;
	}
	
	/**
	 * getter sur posY
	 */
	public Integer getposY() {
		return posY;
	}
	
	/**
	 * setter sur posX
	 */
	public void setposX(Integer posX) {
		this.posX=posX;
	}
	
	/**
	 * setter sur posY
	 */
	public void setposY(Integer posY) {
		this.posY=posY;
	}
	
}
