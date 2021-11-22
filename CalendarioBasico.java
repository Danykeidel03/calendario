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
        String newDia = "";
        String newMes = "";
        String newAno = "";
        if (dia < 10) {
            newDia = "0" + dia;
        }
         if (mes < 10) {
            newMes = "0" + mes;
        }
         if (ano < 10) {
            newAno = "0" + ano;
        }
        return (newDia + "-" + newMes +"-" + newAno );
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
        if (mes > 12) {
            dia = 1;
            mes = 1;
            ano = ano + 1;
        }
        if (ano > 99) {
            dia = 1;
            mes = 1;
            ano = 1;
        }

    } 
}