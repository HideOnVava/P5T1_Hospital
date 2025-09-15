/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Haisv
 */
public class Hospital {
    //Atributos:
        private int id_hospital;
        private String nombre;
        private String direccion;
        private int num_doctores;
        private int num_pacientes;
        private double costo_consulta;
    //Constructores:   
        public Hospital(){
            id_hospital = 0;
            nombre = "";
            direccion = "";
            num_doctores = 0;
            num_pacientes = 0;
            costo_consulta = 0.0;
        }
        
        public Hospital(int id_hospital, String nombre, String direccion, int num_doctores
        , int num_pacientes, double costo_consulta){
            this.id_hospital = id_hospital;
            this.nombre = nombre;
            this.direccion = direccion;
            this.num_doctores = num_doctores;
            this.num_pacientes = num_pacientes;
            this.costo_consulta = costo_consulta;
        }
    //Metodos getters y setters:
        public int getIdHospital() {return id_hospital;}
        public void setIdHospital(int id_hospital) {this.id_hospital = id_hospital;}
        
        public String getNombre() {return nombre;}
        public void setNombre(String nombre) {this.nombre = nombre;}
        
        public String getDireccion() {return direccion;}
        public void setDireccion(String direccion) {this.direccion = direccion;}
        
        public int getNumDoctores() {return num_doctores;}
        public void setNumDoctores(int num_doctores) {this.num_doctores = num_doctores;}
        
        public int getNumPacientes() {return num_pacientes;}
        public void setNumPacientes(int num_pacientes) {this.num_pacientes = num_pacientes;}
        
        public double getCostoConsulta() {return costo_consulta;}
        public void setCostoConsulta(double costo_consulta) {this.costo_consulta = costo_consulta;} 
    //Metodos:
        @Override
        public String toString(){
            return "ID Hospital: "+ id_hospital + 
                    "\nNombre: "+ nombre +
                    "\nDireccion: "+ direccion +
                    "\nNum Doctores: "+ num_doctores +
                    "\nNum Pacientes: "+ num_pacientes +
                    "\nCosto Consulta: "+ costo_consulta;
        }
}
