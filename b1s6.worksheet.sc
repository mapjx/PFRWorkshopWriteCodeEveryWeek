val nros = List(727.7, 1086.5, 1091.0, 1361.3, 1490.5, 1956.1)

def promedio(valores: List[Double]) : Double = valores.sum / valores.size

def desvEst(valores: List[Double]) : Double = {
  val avg = promedio(valores)

  def varianza(valores: List[Double]) : Double =
    valores.map(x => Math.pow(x - avg, 2)).sum * (1.0 / (valores.size - 1))

  Math.sqrt(varianza(valores))
}

def clasifica( valores: List[Double]) : Unit = {
  val s = desvEst(valores)
  val avg = promedio(valores)

  (1 to 3).forearch(i =>
    println(valores.filter(x =>
      x >= (avg - i * s) && x <= (avg + i * s)).size))
}

//Tuplas
//Definicion
//Una tupla es un contenedor de datos en donde cada elemento puede ser de diferente tipo

val par = (1, "Abad Ana")

// Se puede acceder a cada elemento de forma independiente, utilizando punto, guion bajo y un indice

println(par._1)
println(par._2)

// ¿Como declarar su tipo?
// El tipo depende del numero de elementos y el tipo de dato de cada uno, asi

val student = (1, "Abad Ana")
//val student: Tuple2[Int, String]

val datos = ("max", " M", 25, 95.2, true)
//val datos: Tuple5[String, Char, Int, Double, Boolean]

// Algunas funciones para tuplas puras

val student = (1, "Abad Ana")
val (edad, nombre) = student
print(edad)
print(nombre)

student.swap //Cambiar orden

student.canEqual((1, "Abad Ana")) // Si el parametro dato es igual a la tupla dada

//Estructuras de datos funcionales
//Listas

val values = List(42, 31, 36, 40, 43)
val names= List("Jorde", "Rene", "Ma. del Carmen","Nelson")
val fruit: List [String] = List("apple", "orange","pears")
val nums: List [Int] = List(1,2,3,4)

//Listas
//Operaciones
// Dentro de las listas se pueden realizar algunas operaciones

//Count
//Exists
//Filter
//ForAll
//Length
//Map
//Max, maxBy
//Min, minBy
//Product
//Size

//Operaciones con listas
val myList = List(10,20,30,50,60)
myList.isEmpty
myList.drop(2)
myList.dropWhile(_<25)
myList.slice(2,4)
myList.tail
myList.take(3)
myList.takeWhile(_<30)
myList.sorted
myList.sorted(Ordering.Int.reserve)

//Listas
//Otras operaciones
//foldLeft:
//Aplica un operador binario a un valor inicial y a todos los elementos de esta secuencia, de izquierda a derecha
//El acumulador es x
myList.foldLeft(0) ((x, y) => x + y)
myList.foldLeft(0) (_ + _)

//foldRight:
// Aplica un operador binario a todos los elementos de esta lista y un valor inicial, de derecha a izquierda
// el acumulador es y
myList.foldRight(0) ((x, y) => x + y)
myList.foldRight(0) (_ + _)

//Listas
//foldLeft ejemplo
//Crear una funcion para calcular el promedio de los elementos de una lista de numeros reales

def average(valores: Seq[Double]) : Double = {
    val t = valores.foldLeft((0.0, 0))((acc, currVal) => (acc._1 + currVal, acc._2 + 1))
    t._1 / t._2
}
average(nros)

def average2(valores: Seq[Double]) : Double = {
    val t = valores.foldLeft((0.0, 0)) { (acc, currVal) => 
    val sum = acc._1 + currVal
    val cont = acc._2 + 1
    printf("suma %f - contador: %d%n", sum, cont)
    (sum, cont)
}
    t._1 / t._2
}

def average2(valores: Seq[Double]) : Double = {
      val t = valores.foldLeft((0.0,0)) { (acc,valoractual) =>
        val suma = acc._1 +valoractual
        val cont = acc._2+1 
        printf("suma: %f - contador : %d%n",suma,cont)
        (suma,cont)
}
    t._1/t._2
}
average2(nros)

//Zip
// Se usa para fusionar una coleccion con la actual y el resultando es una coleccion
// de tuplas de 2 con elementos de ambas colecciones

val myList = List(10, 20, 30, 40, 50, 60)
val names = List("Guido", "Armando", "Patricio", "Manuel", "Germania", "Fanny")
names.zip(myList)

//Unzip
//Convierte esta coleccion tuplas de 2 en dos colecciones de la primera y la
//segunda mitad de cada par

val zippedList: List[(String, Int)] =
    List(("Guido",10), ("Armando",20), ("Patricio",30), ("Manuel",40), ("Germania",50), ("Fanny",60))

val unzippedLists: (List[String], List[Int]) = zippedList.unzip

unzippedLists._1
unzippedLists._2

//Ejemplo
//Representar lista de goleadores de campeonato de futbol

val goleadores = List(
    ("Oscar Becerra", 17),
    ("Luis Amarilla", 16),
    ("Michael Estrada", 16),
    ("Fidel Martinez", 16),
    ("Gonzalo Mastriani", 13),
    ("Leonel Vides", 13),
    ("Rodrigo Aguirre", 12),
    ("Carlos Garces", 12),
    ("Jonathan Borja", 11))