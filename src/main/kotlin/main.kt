fun main(args: Array<String>) {

    //Variables
    val menu = """
        <-----> Menu principal <----->

        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()
    val menuIngredientes = """
        <-----> Menu Ingredientes <----->

        Selecciona la opción deseada e ingrese la cantidad deseada
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceite
        9. Salir
    """.trimIndent()
    var opcion: String? = "0"
    var seleccion: Int? = 0
    var receta ="Tu reseta es la siguiente: \n"
    var numeroIngrediente = 1


    //Codigo
    println("<*****> Bienvenido a Recipe Maker <*****>\n")
    menu@ while(opcion.equals("3").not() ){
        //Imprimir el menu
        println(menu)

        //Valida que sea una de las opciones
        opcion= readLine()
        if (!(opcion?.matches(Regex("[1-3]")) ?: false)){
            println("\n\t *** La opcion ingresada no es valida *** \n")
            continue@menu
        }

        //Selecciona una de las opciones
        seleccion=opcion?.toInt()
        when(seleccion){
            1 -> {
                //2° Menu para seleccionar ingredientes
                menuIngredientes@ while (opcion.equals("9").not()){
                    //Imprimir el menu de ingredientes
                    println(menuIngredientes)

                    //Valida que sea una de las opciones
                    opcion= readLine()
                    if (!(opcion?.matches(Regex("[1-9]")) ?: false)){
                        println("\n\t *** La opcion ingresada no es valida *** \n")
                        continue@menuIngredientes
                    }

                    //Selecciona la opcion
                    seleccion=opcion?.toInt()
                    when(seleccion){
                        1 -> receta=receta.plus("\t $numeroIngrediente .- Agua \n")
                        2 -> receta=receta.plus("\t $numeroIngrediente .- Leche \n")
                        3 -> receta=receta.plus("\t $numeroIngrediente .- Carne \n")
                        4 -> receta=receta.plus("\t $numeroIngrediente .- Verduras \n")
                        5 -> receta=receta.plus("\t $numeroIngrediente .- Frutas \n")
                        6 -> receta=receta.plus("\t $numeroIngrediente .- Cereal \n")
                        7 -> receta=receta.plus("\t $numeroIngrediente .- Huevos \n")
                        8 -> receta=receta.plus("\t $numeroIngrediente .- Aceite \n")
                    }
                    numeroIngrediente=numeroIngrediente.inc()

                }

            }
            2 -> println(receta)
        }
    }


}