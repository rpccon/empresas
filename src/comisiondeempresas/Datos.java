/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisiondeempresas;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Joshua
 */
public class Datos {
    LinkedList<Empresas> e = new LinkedList();
    public String nome;
    public String nomr;
    public double in;
    public double gas;
    public double dif;
    public double imp;
    
    public double generarImpuestosEmpresas(){
        double acumulador = 0;
        
        for(int i=0; i<e.size(); i++){
            acumulador = acumulador += e.get(i).getimp();
        }
        
        return acumulador;
    }
    public double generateImp(double dif){
        double finalImp = 0;
        
        if(dif<=3000000.0){
            finalImp = dif * 0.10;
        }
        else if(dif > 3000000.0 && dif <= 10000000.0){
            finalImp = dif * 0.15;
        }
        else if(dif > 10000000.0){
            finalImp = dif * 0.20;
        }
        
        return finalImp;
    }
    public void Ingresos(){
        Scanner k=new Scanner(System.in);
        double impt;
        
        while(true){
            Empresas empresa = new Empresas();
            System.out.println("Ingrese el nombre de la empresa: ");
            empresa.setnome(k.next());
            System.out.println("Ingrese el nombre del representante legal: ");
            empresa.setnomr(k.next());
            System.out.println("Digite los ingresos de la empresa: ");
            empresa.setin(k.nextDouble());
            System.out.println("Digite los gastos de la empresa: ");
            empresa.setgas(k.nextDouble());
            
            double diferencia = empresa.getin() - empresa.getgas();
            double impuesto = generateImp(diferencia);
            
            impt=(impuesto + impuesto);
            empresa.setimp(impt);
            this.e.addLast(empresa);            
            
            System.out.println("El impuesto total es: "+impt);
            
            double acumulado = generarImpuestosEmpresas();
            
            System.out.println("El impuesto acumulado total es: "+acumulado);            
            System.out.println("/n Ingrese 1 si desea agregar una nueva empresa...");
            
            if(!k.next().equals("1")){
                break;
            }
            
        }
    }
}
