val goleadores = List(("Francisco Fydriszewski", 10),
                      ("Joaquin Vergés", 9),
                      ("Santiago Giordana", 9),
                      ("Ismael Díaz", 8),
                      ("Tomás Molina", 7),
                      ("Danny Luna", 7),
                      ("Cristian Martínez", 7),
                      ("Grabiel Cortez", 7),
                      ("Leonardo Villagra", 6),
                      ("Michael Hoyos",6))
val goles = goleadores.map(_._2).map(_.toDouble)
val average =
  (values: List[Double]) => values.sum / values.length
val avgGol = average(goles)
goleadores.maxBy(_._2)._1
goleadores.minBy(_._2)._1
val mayoresAvg = goleadores.filter(_._2 > avgGol).map(_._1)

// Group by
List(1,2,3,4,5).groupBy( k => k % 3)

// Group by
// El metodo groupBy reorganiza una secuencia de un mapa  donde algunos elementos de la secuencia original
// se agrupan en subsecuencias
// Por ejemplo dada una secuencia de palabras,podemos agrupar todas la palabras que comienza con la letra "y"
// en una subsecuencia y todas las demas palabras en otra subsecuencia
Seq("wombat","xanthan","yogurt","zebra").
  groupBy(s=> if (s startsWith "y")1 else 2)

// Itera sobre pares key/value
fruitBaskett.filter { case (fruit,count) => count > 0 }

// Conjunto de valores unicos
val conj2: Set[ Int] = Set (1,2,3,4,5)

// Algunas funciones
val conjunto: Set[ Int] = Set (1,2,3)
val conjuntoNuevo = conjunto + 6
val conNuevo = conjunto.concat(List(2,3,4,5))
conNuevo.intersect(conjunto)

// Mapas
// Metodo toMap: Convertir una lista de tuplas en mapa
List(("apples",3),("oranges",2),("pears",0)).toMap
List("apples"->3,"oranges" ->2,"pears" ->0).toMap

// Otra manera de crear mapas
Map(("apples",3),("oranges",2),("pears",0))
Map("apples"->3,"oranges" ->2,"pears" ->0)

// Metodo toSeq: convertir un Map en una secuencia de pares(tulpas 2)
Map(("apples",3),("oranges",2),("pears",0)).toSeq
Map("apples"->3,"oranges" ->2,"pears" ->0).toSeq
//Seq[(String, Int)] = List(("apples",3),("oranges",2),("pears",0))
// Map en Mapas
val fruitBasket = Map("apples"->3,"oranges" ->2,"pears" ->0)
fruitBasket.map( data => data
match {
  case (fruit,count) => count *2
})

// Otra manera
fruitBasket.map{ case (fruit,count) => count *2}
val fruitBaskett = Map("apples"->3,"oranges" ->2,"pears" ->0)
fruitBaskett.map{ case (fruit,count) => (fruit,count*2)}
fruitBaskett.map{ case (fruit,count) => (fruit,count, count*2)}.map{
  case (fruit, _,count2) => (fruit, count2 / 2)
}.toMap







