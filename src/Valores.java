public class Valores {

    public Valores() {
    }

    //Metodo

    public double novoValor(double valor){
        if (valor < 8){
            return valor*1.5;
        } else if(valor >=8 && valor <=10){
            return valor *1.25;
        } else if( valor>10 && valor <=15){
            return valor *1.15;
        } else{
            return valor *1.05;
        }
    }
    
    
}
