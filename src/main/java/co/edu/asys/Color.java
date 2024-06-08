package co.edu.asys;

public enum Color {

    //Asiganamos los valores para cada color
    BLANCO(1),
    NEGRO(0);


    //una vez asignado no se puede camiar el valor
    private final int value;

    //Constructor
    Color(int value) {
        this.value = value;
    }

    //metodo getter para obtener el valor asosiado
    public int getValue(){
        return value;
    }




}
