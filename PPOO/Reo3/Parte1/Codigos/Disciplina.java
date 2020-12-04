
package carrinhoteste;

public class Disciplina {

    private String codigo;
    private int cargaHorariaSemanal;
    
    public Disciplina(String codigo, int cargaHorariaSemanal){
        this.codigo = codigo;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }
    public String getCodigo(){
        return codigo;
    }
    public int getCargaHorariaSemanal(){
        return cargaHorariaSemanal;
    }
}
