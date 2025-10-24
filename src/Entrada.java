public class Entrada {

    public static void main(String[] args) {
        /*Operaciones.sumar(4,8);
        Operaciones.restar(6,9);
         ¡¡¡No es seguro!!!
        Para hacer referencia a otro método de otra clase,
        podemos declararlos estáticos y luego mencionarlos así:
        NombreClase.metodo()
         */

        /* FORMA SEGURA :))
        Declaramos una variable con el nombre de la clase y así la importamos y podemos usar todas las operaciones de la otra clase. No deben estar en static.
        NombreClase nombreVariable = new NombreClase();  Al ser compleja lleva la palabra new.
         */
        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(4,7);
        operacionesMatematicas.restar(8,5);
    }

    /*  Si es public, se puede acceder a el desde cualquier parte.
        Si es protected, lo pueden ver las clases que están dentro del mismo paquete.
        Si es private, nadie lo puede llamar, salvo otro método de la misma clase.
     */
}
