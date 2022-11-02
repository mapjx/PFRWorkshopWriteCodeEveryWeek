//val cedula = "1108765321"
//cedula = "1108765321" // no se puede

//====================================================================

var cedula = "1108765321"
cedula = "1108765321" // El var si nos permite modificarlo //

// ====================================================================

(x:Double)=> -Math.pow(x,2)+8*x-12
val f1 = (x : Double) => -Math.pow(x, 2) + 8 * x -12
f1(12)
((x : Double) => -Math.pow(x, 2) + 8 * x  - 12)(12)
f1(12)*9/8+3
((x:Double)=> -Math.pow(x,2)+8*x-12)(12)*9/8+3

// ======================================================================

//def integracion(a : Int, b: Int, f: Double => Double) = {}

def integracion(a : Int, b: Int, f: Double => Double) = {
    val intermedio = ((a + b) / 2.0)
//val intermedio1=((a+b)/2).toDouble//
    val fa = f(a);
    val fi = f(intermedio)
    val fb = f(b)
    (b - a) * (fa + 4 * fi + fb) / 6
}

// ======================================================================

def select(option : Char ) : (Int, Int) => Double = {
    option match {
        case '+' => (a: Int, b: Int) => a + b
        case '-' => (a: Int, b: Int) => a - b
        case '*' => (a: Int, b: Int) => a * b
        case '/' => (a: Int, b: Int) => a / b.toDouble
        case _ => (a: Int, b: Int) => 0 / (a+b)
    }
}

select('+')(2, 1)
val operation = select('+')
operation(2, 1)

// ======================================================================

val nums = List(5, 6, 7, 8, 9)
val isEven = (k : Int) => if (k % 2 == 0) 1 else 0

def isEven(k : Int) : Int = (k % 2) match {
    case 0 => 1
    case _ => 0
}


List(1, 2, 3)
List(1, 2, 3).sum

List(1, 2, 3).map(x => x * x + 100 * x)
res1: List[Int] = List(101, 204, 309)

def func1(x : Int ) : Int = x * x + 100 * x

List(1, 2, 3).map(func1)
res3: List[Int] = List(101, 204, 309)

List(1, 2, 3) map func1 //dotless infix


def isEven(k : Int) : Int = (k % 2) match {
    case 0 => 1
    case _ => 0
}

def countEven(s : List[Int] ) : Int = s.map(isEven).sum
countEven( List(5, 6, 7, 8, 9))
res9: Int = 2

// Lo hice correr con la consola de Windows CDM 
val f1 = (x : Double) => -Math.pow(x, 2) + 8 * x - 12
f1(12)
val res0: Double = -60.0

val nums = List(1, 2, 3)
val nums: List[Int] = List(1, 2, 3)
nums.map(x => x + 1)
val res1: List[Int] = List(2, 3, 4)
def add1(a: Int) : Int = a + 1
def add1(a: Int): Int
nums.map(add1)
val res2: List[Int] = List(2, 3, 4)
nums.map(x => add1(x))
val res3: List[Int] = List(2, 3, 4)
nums.map(add1(_))
val res4: List[Int] = List(2, 3, 4)
val sumaDos = (a: Int, b: Int) => a + b
val sumaDos: (Int, Int) => Int = Lambda$1517/0x0000000801540d80@2c1a95a2
nums.map(x => sumaDos(x, x))
val res5: List[Int] = List(2, 4, 6)


def countEven( s : List[Int]) : Int = s,
    map(k => if (k % 2 == 0) 1 else 0)
    sum


def CountEven(s : List[Int] ) : Int = {
    def isEven(k : Int) : Int = (k % 2) match {
    case 0 => 1
    case _ => 0
  }
  s.map( isEven ).sum
}
countEven(List(12, 14, 9, 7, 5, 4, 40))


// ======================================================================