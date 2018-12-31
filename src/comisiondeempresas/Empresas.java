/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comisiondeempresas;

/**
 *
 * @author Joshua
 */
public class Empresas {
    String nome="";
    String nomr="";
    double in=0;
    double gas=0;
    double dif=0;
    double imp=0;
    
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    public String getnomr(){
        return nomr;
    }
    public void setnomr(String nomr){
        this.nomr=nomr;
    }
    public double getin(){
        return in;
    }
    public void setin(double in){
        this.in=in;
    }
    public double getgas(){
        return gas;
    }
    public void setgas(double gas){
        this.gas=gas;
    }
    public double getdif(){
        return dif;
    }
    public void setdif(double dif){
        this.dif=dif;
    }
    public double getimp(){
        return imp;
    }
    public void setimp(double imp){
        this.imp=imp;
    }
    
}
