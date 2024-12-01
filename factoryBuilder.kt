fun main() {
  
  val pizza1: pizza = pizza.Factory.create("Veggie")
  println(pizza1)
}

class pizza(val type: String, val topping: String) {
  object Factory {
      fun create(pizzaType: String): pizza {
          return when (pizzaType) {
              "Tomato" -> pizza(type = "tomato", topping = "tomato, cheese")
              "Veggie" -> pizza(type = "veggie", topping = "Peppers, onions, olives")
              "PeppyPanner" -> pizza(type = "paneer", topping = "pepperoni, sausage, veggies")
              else -> pizza(type = "Basic", topping = "Onion, cheese, veggies")
          }
      }
  }

  
  override fun toString(): String {
      return "Pizza(type=$type, topping=$topping)"
  }
}
