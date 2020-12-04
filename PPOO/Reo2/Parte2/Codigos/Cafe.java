
package carrinhoteste;

import java.util.ArrayList;

public class Cafe {
    private  String tipo;
    private  ArrayList<Integer>codigo;

public Cafe(String tipo){
    this.tipo = tipo;
    codigo = new ArrayList();
}

public String getTipo(){
    return tipo;
}

public int getComplemento(){
    return codigo.size();
}

public void inserirComplemento(int numero){
    codigo.add(numero);
}

public int getCodigo(int numero){
    return codigo.get(numero);
}

}