public class CalendarioBasico {

    private int dia;
    private int mes;
    private int ano;
   
    public CalendarioBasico () {
        dia = 1;
        mes = 1;
        ano = 1;
        
    }
    public String obtenerFecha() {
     return (dia + "-" + mes +"-" + ano );
    }
    public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno) {
    dia = nuevoDia;
    mes = nuevoMes;
    ano = nuevoAno;
    }
    
    public void avanzarFecha() {
    dia = dia + 1;
    if (dia > 30) {
    dia = 1;
    mes = mes + 1;
    }
    if (dia > 12) {
    dia = 1;
    mes = 1;
    ano = ano + 1;
    }
    if (ano > 99)
    dia = 1;
    mes = 1;
    ano = 1;
    
    }
    
    
} 