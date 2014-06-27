/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.de.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 *
 * @author Maria Belen Indacochea
 */
public class ProyectoDeListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   ArrayList<Empleados> ListEmpleados=new ArrayList<>();
   ListEmpleados.add(new Empleados("1314027275", "Maria Indacochea", "Manta", 21,900, "Dep Sistemas"));
   ListEmpleados.add(new Empleados("1314027283", "Jennifer Alvarez", "Manta", 23,350.25, "Recursos Humanos"));
   ListEmpleados.add(new Empleados("1315102048", "Elvis Indacochea", "Jipijapa", 45,600, "Dep Administraciòn"));
   ListEmpleados.add(new Empleados("1320473810", "Maryruri Sanchez", "Calceta", 36,800, "Dep Administraciòn"));
   ListEmpleados.add(new Empleados("1312864790", "Yalitza Demera", "Chone", 20,500, "Dep Sistemas"));
   ListEmpleados.add(new Empleados("1317360492", "Darwin Quiroz", "Portoviejo", 25,850, "Dep Sistemas"));
   ListEmpleados.add(new Empleados("1398628497", "Victor Muentes", "Montecristi", 30,600, "Dep Franquicia"));
   ListEmpleados.add(new Empleados("1314027276", "Zuleyka Alcivar", "Santana", 29,600, "Dep. Contabilidad"));
   ListEmpleados.add(new Empleados("1314028275", "Cristhian Simbaña", "Manta", 27,837, "Dep. Producciòn"));
   ListEmpleados.add(new Empleados("1314089975", "Betty Zamora", "Bahia", 33,900, "Dep. Compras"));
   ListEmpleados.add(new Empleados("1318900076", "Angel Mora", "Montecristi", 27,500, "Dep. Compras"));
   ListEmpleados.add(new Empleados("1314029835", "Angel Franco", "Manta", 35,700, "Dep. Compras"));
   ListEmpleados.add(new Empleados("1390027275", "Lourdes Vera", "Manta", 45,800, "Dep. Producciòn"));
   ListEmpleados.add(new Empleados("1318943275", "Ruben Navarrete", "Manta", 39,500, "Dep Sistemas"));
   ListEmpleados.add(new Empleados("1356792140", "Yoconda Cevallos", "Portoviejo", 39,340, "Dep Administraciòn"));
   ListEmpleados.add(new Empleados("1314890427", "Dario Zamora", "Chone", 23,390.78, "Dep. Contabilidad"));
   ListEmpleados.add(new Empleados("1314608688", "Aurora Velez", "Manta", 45,340, "Dep. Compras"));
   ListEmpleados.add(new Empleados("1320473810", "Laura Indacochea ", "Manta", 25,340, "Dep Administraciòn"));
   ListEmpleados.add(new Empleados("1312864790", "Genesis Alava", "Portoviejo", 20,340, "Dep Administraciòn"));
   ListEmpleados.add(new Empleados("1312864898", "Ma Dolores Indacochea", "Portoviejo", 27,340, "Dep Administraciòn"));
   ListEmpleados.add(new Empleados("1312890088", "Jessenia Jaime", "Portoviejo", 36,340, "Dep Administraciòn"));
   ListEmpleados.add(new Empleados("1318994790", "Ortencia Sabando", "Portoviejo", 20,340, "Dep Administraciòn"));
   ListEmpleados.add(new Empleados("1311130937", "Marìa Belèn Sànchez", "Manta", 46,340, "Dep Administraciòn"));
   ListEmpleados.add(new Empleados("1314027236", "Luis Torres", "Manta", 29,340, "Dep Administraciòn"));
   ListEmpleados.add(new Empleados("1325345678", "Cesar Zavala", "Montecristi", 29,340, "Dep Administraciòn"));
  
   
    //1. El empleado de mayor edad en la institución
   Collections.sort(ListEmpleados,(p1,p2)->(p2.getEdad()-p1.getEdad()));
   ListEmpleados.stream().limit(1).forEach(p->{System.out.println("El nombre del empleado de mayor edad es:"+" " +p.getNombre());System.out.println("del:"+" "+p.getDepartamento());System.out.println("tiene:"+" "+ p.getEdad()+" "+"años");});
  

    //2. Los empleados con el menor sueldo de la empresa
   Predicate<Empleados> MenorSueldo=(p->p.getSueldo()<=340);
   System.out.println("***LOS EMPLEADOS CON EL MENOR SUELDO SON***");
   ListEmpleados.stream().filter(MenorSueldo).forEach(p->{System.out.println(p.getNombre());System.out.println(p.getSueldo());});
   
    //3. Los empleados que pertenecen a la ciudad de Manta y trabajan en el Departamento de Sistemas
   Predicate<Empleados> EmpleadosMantaSistemas=(p->p.getCiudad()== "Manta" && p.getDepartamento()== "Dep Sistemas");
   ListEmpleados.stream().filter(EmpleadosMantaSistemas).forEach(p->{System.out.println("***EL EMPLEADO:"+" "+p.getNombre());System.out.println("de la ciudad de:"+" "+p.getCiudad());System.out.println("pertenece al:"+" "+p.getDepartamento());});
   
   
    //4. Los empleados con cédula de Manabí y cuyo sueldo supera los 500 dólares
  
   Predicate<Empleados> EmpleadosCedulaSueldo =(p-> "13".equals(p.getCedula().substring(0, 2))&& p.getSueldo()> 500.00);
   System.out.println("*** LOS EMPLEADOS CON CEDULA DE MANABI Y SUELDO QUE SUPERA LOS $500 DOLARES SON ***");
   ListEmpleados.stream().filter(EmpleadosCedulaSueldo).forEach(p->{System.out.println("*NOMBRE DEL EMPLEADO:"+" "+p.getNombre());System.out.println(" CEDULA:"+" "+p.getCedula());System.out.println(" SUELDO:"+" "+p.getSueldo());});
   
   
    //5. El promedio del sueldo de los 5 empleados con el mayor salario
   Predicate<Empleados> PromedioSueldo =(p->p.getSueldo()>500);     
   double cinco=ListEmpleados.stream().filter(PromedioSueldo).limit(5).mapToDouble(p->p.getSueldo()).average().getAsDouble();
   System.out.println("EL PROMEDIO DE LOS SUELDO DE LOS 5 EMPLEADOS CON EL MAYOR SALARIO ES DE: $"+cinco);

//6. La suma de sueldos de los empleados que no pertenecen a Manta
   Predicate<Empleados> SumaNoPerteneceManta = (p->p.getCiudad()!="Manta");
   double suma=ListEmpleados.stream().filter(SumaNoPerteneceManta).mapToDouble(p->p.getSueldo()).sum();
   System.out.println("LA SUMA DE LOS SUELDOS DE LOS EMPLEADOS QUE NO PERTENECEN A MANTA ES DE: $"+suma);
   

//7. El promedio de las edades entre los empleados menores de 25 años
   Predicate<Empleados> PromedioEdad= (p->p.getEdad()<25);
   int MenorEdad=(int)ListEmpleados.stream().filter(PromedioEdad).mapToDouble(p->p.getEdad()).average().getAsDouble();
   System.out.println("EL PROMEDIO DE LAS EDADES ENTRE LOS EMPLEADOS MENORES DE 25 ES DE: "+MenorEdad+ "años");

//8. El promedio de las edades en los empleados con sueldo básico
   Predicate<Empleados> SueldoBasicoPromEdad= (p->p.getSueldo()== 340);
   int SueldoBasico=(int) ListEmpleados.stream().filter(SueldoBasicoPromEdad).mapToDouble(p->p.getEdad()).average().getAsDouble();
   System.out.println("EL PROMEDIO DE LAS EDADES EN LOS EMPLEADOS CON EL SUELDO BASICO ES DE: "+SueldoBasico+ "años");
   
   
//9. El número de empleados por departamento

    Predicate<Empleados> NumeroEmpleadosXdepartamento= (p->p.getDepartamento().startsWith("Dep Sistemas"));
    int Xdepartamento=(int) ListEmpleados.stream().filter(NumeroEmpleadosXdepartamento).count();
        System.out.println("*************** D E P A R T A M E N T O S ***************");
        System.out.println("En el *DEPARTAMENTO DE SISTEMAS* hay: "+Xdepartamento+ " "+"Empleados");
    Predicate<Empleados> NumeroEmpleadosXdepartamentoA= (p->p.getDepartamento().startsWith("Recursos Humanos"));
    int XdepartamentoA=(int) ListEmpleados.stream().filter(NumeroEmpleadosXdepartamentoA).count();
        System.out.println("En el *DEPARTAMENTO DE RECURSOS HUMANOS* hay: "+XdepartamentoA+ " "+"Empleado");
     Predicate<Empleados> NumeroEmpleadosXdepartamentoB= (p->p.getDepartamento().startsWith("Dep Administraciòn"));
    int XdepartamentoB=(int) ListEmpleados.stream().filter(NumeroEmpleadosXdepartamentoB).count();
        System.out.println("En el *DEPARTAMENTO DE ADMINISTRACION* hay: "+XdepartamentoB+ " "+"Empleados");    
        Predicate<Empleados> NumeroEmpleadosXdepartamentoC= (p->p.getDepartamento().startsWith("Dep Franquicia"));
    int XdepartamentoC=(int) ListEmpleados.stream().filter(NumeroEmpleadosXdepartamentoC).count();
        System.out.println("En el *DEPARTAMENTO DE FRANQUICIA* hay: "+XdepartamentoC+ " "+"Empleado");
        Predicate<Empleados> NumeroEmpleadosXdepartamentoD= (p->p.getDepartamento().startsWith("Dep. Contabilidad"));
    int XdepartamentoD=(int) ListEmpleados.stream().filter(NumeroEmpleadosXdepartamentoD).count();
        System.out.println("En el *DEPARTAMENTO DE CONTABILIDAD* hay: "+XdepartamentoD+ " "+"Empleado");
        Predicate<Empleados> NumeroEmpleadosXdepartamentoE= (p->p.getDepartamento().startsWith("Dep. Producciòn"));
    int XdepartamentoE=(int) ListEmpleados.stream().filter(NumeroEmpleadosXdepartamentoE).count();
        System.out.println("En el *DEPARTAMENTO DE PRODUCCION* hay: "+XdepartamentoE+ " "+"Empleados");
        Predicate<Empleados> NumeroEmpleadosXdepartamentoF= (p->p.getDepartamento().startsWith("Dep. Compras"));
    int XdepartamentoF=(int) ListEmpleados.stream().filter(NumeroEmpleadosXdepartamentoF).count();
        System.out.println("En el *DEPARTAMENTO DE COMPRAS* hay: "+XdepartamentoF+ " "+"Empleados");
        
//10. El número de empleados por ciudad
    Predicate<Empleados> NumeroEmpleadosXCiudadA= (p->p.getCiudad().startsWith("Manta"));
    int XCiudadA=(int) ListEmpleados.stream().filter(NumeroEmpleadosXCiudadA).count();
    System.out.println("****************** C I U D A D E S ******************");
        System.out.println("En la ciudad de *MANTA* hay: "+XCiudadA+ " "+"Empleados");
        Predicate<Empleados> NumeroEmpleadosXCiudadB= (p->p.getCiudad().startsWith("Jipijapa"));
    int XCiudadB=(int) ListEmpleados.stream().filter(NumeroEmpleadosXCiudadB).count();
        System.out.println("En la ciudad de *JIPIJAPA* hay: "+XCiudadB+ " "+"Empleado");
  Predicate<Empleados> NumeroEmpleadosXCiudadC= (p->p.getCiudad().startsWith("Calceta"));
    int XCiudadC=(int) ListEmpleados.stream().filter(NumeroEmpleadosXCiudadC).count();
        System.out.println("En la ciudad de *CALCETA* hay: "+XCiudadC+ " "+"Empleado");
        Predicate<Empleados> NumeroEmpleadosXCiudadD= (p->p.getCiudad().startsWith("Chone"));
    int XCiudadD=(int) ListEmpleados.stream().filter(NumeroEmpleadosXCiudadD).count();
        System.out.println("En la ciudad de *CHONE* hay: "+XCiudadD+ " "+"Empleados");
  Predicate<Empleados> NumeroEmpleadosXCiudadE= (p->p.getCiudad().startsWith("Portoviejo"));
    int XCiudadE=(int) ListEmpleados.stream().filter(NumeroEmpleadosXCiudadE).count();
        System.out.println("En la ciudad de *PORTOVIEJO* hay: "+XCiudadE+ " "+"Empleados");
        Predicate<Empleados> NumeroEmpleadosXCiudadF= (p->p.getCiudad().startsWith("Montecristi"));
    int XCiudadF=(int) ListEmpleados.stream().filter(NumeroEmpleadosXCiudadF).count();
        System.out.println("En la ciudad de *MONTECRISTI* hay: "+XCiudadF+ " "+"Empleados");
        Predicate<Empleados> NumeroEmpleadosXCiudadG= (p->p.getCiudad().startsWith("Santana"));
    int XCiudadG=(int) ListEmpleados.stream().filter(NumeroEmpleadosXCiudadG).count();
        System.out.println("En la ciudad de *SANTA ANA* hay: "+XCiudadG+ " "+"Empleado");
        Predicate<Empleados> NumeroEmpleadosXCiudadH= (p->p.getCiudad().startsWith("Bahia"));
    int XCiudadH=(int) ListEmpleados.stream().filter(NumeroEmpleadosXCiudadH).count();
        System.out.println("En la ciudad de *BAHIA* hay: "+XCiudadH+ " "+"Empleado");
  
  
    }


}
