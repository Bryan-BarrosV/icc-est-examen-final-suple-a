package models;

import java.util.List;

public class Estudiante {
  private String nombre;
  private String cedula;
  private List<Double> calificaciones;
  private int PorcentajesUnicos;
  private int Promedio;
  private int calcularPorcentajesUnicos;

  public Estudiante(String nombre, String cedula, List<Double> calificaciones, int porcentajesUnicos) {
    this.nombre = nombre;
    this.cedula = cedula;
    this.calificaciones = calificaciones;
    PorcentajesUnicos = porcentajesUnicos;
  }
  
  
  public String getNombre() {
    return nombre;
  }


  public String getCedula() {
    return cedula;
  }


  public List<Double> getCalificaciones() {
    return calificaciones;
  }


  public int getPorcentajesUnicos() {
    return PorcentajesUnicos;
  }


  public int getPromedio(){
    if (Promedio >= 7){
      return Promedio;
    }
    return PorcentajesUnicos;
  
  }

  

  @Override
  public String toString() {
    return "Estudiante [nombre=" + nombre + ", cedula=" + cedula + ", calificaciones=" + calificaciones
        + ", PorcentajesUnicos=" + PorcentajesUnicos + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
    result = prime * result + ((calificaciones == null) ? 0 : calificaciones.hashCode());
    result = prime * result + PorcentajesUnicos;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Estudiante other = (Estudiante) obj;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    if (cedula == null) {
      if (other.cedula != null)
        return false;
    } else if (!cedula.equals(other.cedula))
      return false;
    if (calificaciones == null) {
      if (other.calificaciones != null)
        return false;
    } else if (!calificaciones.equals(other.calificaciones))
      return false;
    if (PorcentajesUnicos != other.PorcentajesUnicos)
      return false;
    return true;
  }


  public int getCalcularPorcentajesUnicos() {
    return calcularPorcentajesUnicos;
  }
  
  

}
