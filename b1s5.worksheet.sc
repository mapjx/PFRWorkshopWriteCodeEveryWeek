
/*Mapear una lista de cadenas de texto a lista de enteros que representan la longitud del texto*/
val names : List[String] = List("Leo", "Cristiano","Enner", "Felipe")
names.map(_.length)


/*Dada una lista de numeros enteros, desarrollar las funciones necesarias que */
/*le permiten contar cuantos elementos de la lista son numeros primos*/
val numbers = List(3, 4, 7, 11, 12)
val isPrime = (nro : Int) => (2 to nro - 1 ).forall( nro %  _ != 0)
numbers.map(isPrime(_) match {
    case true => 1
    case false => 0
}).sum


val numberss = List(6, 28, 15, 12, 11, 24)
numberss.max

numberss.min

numberss.size

/*forall -> devuelve true si y solo si el predicado devuelve true para todos los valores de la lista*/
def isPrime(nro : Int) : Boolean = (2 until nro).forall(nro % _ != 0)

/*exists -> devuelve true si y solo si el predicado devuelve true para por lo menos un valor de la lista*/
def isPrime(nro : Int) : Boolean = !(2 until nro).exists(nro % _ == 0)


/*Filtrar y truncar secuencias*/
/*filter -> devuelve una lista que unicamente contiene los valores que cumplen con el predicado*/

List(1, 2, 3, 4, 5).filter(k => k % 3 != 0)
res: List[Int] = List(1, 2, 4, 5)

/*takeWhile -> trunca la lista cuando encuentra un valor que NO cumple con el predicado*/
List(1, 2, 3, 4, 5).takeWhile(k => k % 3 != 0)
res: List[Int] = List(1, 2)

/*Map/reduce*/
/*Transformar, una funcion toma una lista y devuelve otra*/
            /*Funciones: map, filter, etc*/
/*Agregar, toma una lista y devuelve un unico valor*/
            /*Funciones: max, sum, etc*/
/*Escribir programas que concatenan transformaciones y agregaciones se conocen como programacion map/reduce*/

/*Ejercicios transformaciones*/
/*Map y Filter*/

/*Dada una lista de numeros enteros, desarrollar las funciones necesarias que permitan contar*/
/*el numero de elementos de la lista que son numeros perfectos, deficientes o abundantes*/

/*Clasificacion en base a suma de los devisores propios de un numero*/

val divp =(n:Int)=>(1 until n).filter(div => n % div == 0 )
val x = divp(6).sum 
val numberss = List(6,28,15,12,11,24)
val sumDiv =(n:Int)=>(1 until n).filter(div => n % div == 0 ).sum

//Cuantos numeros de elementos de la lista son perfectos
numberss.filter(nro=>  nro == sumDiv(nro)).size

//Cuantos numeros de elementos de la lista son deficientes
numberss.filter(nro=>  nro > sumDiv(nro)).size

//Cuantos numeros de elementos de la lista son abundantes
numberss.filter(nro=>  nro < sumDiv(nro)).size

// Factorial escalonado
def !!(n: Int) : Int = {
    n % 2 match {
        case 0 => ((2 to n by 2)).product
        case _ => ((1 to n by 2)).product
    }
}
!!(8)
!!(9)
//


val numbers = (1 to 20).toList
// Contar Pares
numbers.filter(nro => nro % 2 == 0 ).size

// Otra forma
numbers.count(nro => nro % 2 == 0 )

// Contar Impares
numbers.filter(nro => nro % 2 != 0 ).size

// Contar primos
def contarPrimos(nros : List[Int]) : Int = {
    val isPrime = (n : Int) => (2 until n).forall(n % _ != 0)
    nros.filter(isPrime).size
}
contarPrimos(numbers)

// Presentar 3 factores
def tresFactores(nros : List[Int]) : List[Int] = {
    val factores = (n : Int) => (2 until n).filter(n % _ == 0)
    nros.filter(nro => factores(nro).size == 3)
}
tresFactores((1 to 1000).toList)




