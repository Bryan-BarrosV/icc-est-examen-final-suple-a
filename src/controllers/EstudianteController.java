package controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.Estudiante;

public class EstudianteController {
  public int ordenarPromedio(List <Estudiante> estudiante){
    TreeSet<Estudiante> estudiantes =new TreeSet<>();
    if(Estudiante :: estudiantes){
      estudiantes.push();
    };
    return estudiantes.pop();
    
  }

  public LinkedList<Estudiante> clasificarPorPorcentaje(int estudiante){
    LinkedList<Estudiante> ordenado= new LinkedList<>();
    if(estudiante >= 90){
      System.out.println("A");
    }
    if(estudiante <= 89){
      System.out.println("B");
    }
    if (estudiante <= 69){
      System.out.println("C");
    }
    if(estudiante <= 49){
      System.err.println("D");
    }
    if(estudiante >=0){
      System.out.println("E");
    }
    return ordenado;
    }


    public int obtenerEstudiantesDestacados(List<Estudiante> estudiantes){
      List<Estudiante> promEstudiantes =new ArrayList<>();
      if(Estudiante :: estudiantes.getPromedio()){
        System.out.println(estudiantes);
      }
    }

  
}


