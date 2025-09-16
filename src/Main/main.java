/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Clases.Hospital;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Haisv
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);
        //Objeto oH1:
            Hospital oH1 = new Hospital();
            System.out.println("idHospital: ");
            int id_hospital = MyScanner.nextInt();
            MyScanner.nextLine();
            System.out.println("Nombre: ");
            String nombre = MyScanner.nextLine();
            System.out.println("Direccion: ");
            String direccion = MyScanner.nextLine();
            System.out.println("Num Doctores: ");
            int num_doctores = MyScanner.nextInt();
            System.out.println("Num Pacientes: ");
            int num_pacientes = MyScanner.nextInt();
            System.out.println("Costo Consulta: ");
            double costo_consulta = MyScanner.nextDouble();
            oH1.setIdHospital(id_hospital);
            oH1.setNombre(nombre);
            oH1.setDireccion(direccion);
            oH1.setNumDoctores(num_doctores);
            oH1.setNumPacientes(num_pacientes);
            oH1.setCostoConsulta(costo_consulta);
        //Objeto oH2:
            Hospital oH2 = new Hospital(1,"Cruz Roja","Calle 3",5,7,530.50);
        //Mostrar los datos de oH1 utilizando getters:
            System.out.println("HOSPITAL 1.");
            System.out.println("idHospital: "+ oH1.getIdHospital());
            System.out.println("Nombre: "+ oH1.getNombre());
            System.out.println("Direccion: "+ oH1.getDireccion());
            System.out.println("Num Doctores: "+ oH1.getNumDoctores());
            System.out.println("Num Pacientes: "+ oH1.getNumPacientes());
            System.out.println("Costo Consulta: "+ oH1.getCostoConsulta());
            System.out.println("=====================================");
        //Mostrar los datos de oH2 utilizando toString():
            System.out.println("HOSPITAL 2.");
            System.out.println(oH2.toString());
            System.out.println("=====================================");
        //Mostrar resultados de las operaciones.
            System.out.println("HOSPITAL 1.");
            System.out.println("Ingresos: "+ oH1.calcularIngresos());
            System.out.println("Pacientes*Doctor: "+ oH1.promedioPacientes_Doctor());
            System.out.println("=====================================");
            System.out.println("HOSPITAL 2.");
            System.out.println("Ingresos: "+ oH2.calcularIngresos());
            System.out.println("Pacientes*Doctor: "+ oH2.promedioPacientes_Doctor());
            System.out.println("=====================================");
    }
        
}
