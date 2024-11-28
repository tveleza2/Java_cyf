package Enums.enums;

public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    protected boolean workingDay;

    public boolean esDiaLaboral(){
        return this!=SABADO && this !=DOMINGO;
    }
    
}
