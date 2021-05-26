def simple(): Unit = {

  println(" simple print")
}

simple()

def adder(num1:Int,num2:Int): Int = {

  return num1 + num2
}

adder(4,5)


def greetName(name: String): String = {

  return  s"hello $name"
}
val fullgreet = greetName("jose")
println(fullgreet)

val numbers = List(1,2,3,4,6)
def check(nums:List[Int]): List[Int] = {
  return nums
}