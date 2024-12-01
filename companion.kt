fun main() {
  MyClass.f()
   MyClass.anotherObject.g() 
}

class MyClass {
   companion object MyObjec { // one class have only one companion
       fun f() {
           println("hello i am object from object")
       }
   }
   object anotherObject{
     fun g() {
       println("hello i am object from anothr object")
     }
   }
}
