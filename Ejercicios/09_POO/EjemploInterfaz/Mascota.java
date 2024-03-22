/**
 * Mascota.java
 * Definición de la interfaz Mascota
 * 
 * @author Gianluca Maida
 */
public interface Mascota {
  String getCodigo();
  void hazRuido();
  void come(String comida);
  void peleaCon(Animal contrincante);
}
