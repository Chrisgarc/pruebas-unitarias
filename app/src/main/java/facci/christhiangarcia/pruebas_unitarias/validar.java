package facci.christhiangarcia.pruebas_unitarias;

public class validar {

    public boolean validarCampo(String cadena) {
        if (cadena.length()== 0){
            return false;
        }
        return true;
    }

    public boolean validarLargo(String cadena) {
        if (cadena.length() >= 5){
            return true;
        }
        return false;
    }

    public boolean validarlargo(String cadena) {
        if (cadena.length() >= 15){
            return true;
        }
        return false;
    }

}
