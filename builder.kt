fun main() {

  val person = Person.Builder("adarsh", "gupta", "Male", "1234567890") .setPhoneCode("+91").setDate("2024-12-11")
 .setLanguage("eng")
      .setDateOfBirth("2005-02-13")
      .build()

  println(person)
}
class Person private constructor(
  val fName: String,
  val lName: String,
  val gender: String,
  val phone: String?
) {

  var phoneCode: String? = null
  private set

  var date: String? = null
 private set

  var lang: String? = null
      private set


var dob: String? = null
      private set

  
  class Builder(
      private val fName: String,
      private val lName: String,
      private val gender: String,
      private val phone: String?
  ) {
   private val personToBuild = Person(fName, lName, gender, phone)

      fun setPhoneCode(phoneCode: String): Builder {
       personToBuild.phoneCode = phoneCode
      return this
      }

      fun setDate(date: String): Builder {
          personToBuild.date = date
          return this
      }

      fun setLanguage(lang: String): Builder {
          personToBuild.lang = lang
          return this
      }


             fun setDateOfBirth(dob: String): Builder {

        personToBuild.dob = dob
          return this
             }

      fun build(): Person {
       return personToBuild
      }
  }

 
  override fun toString(): String {
      return "Person(fName='$fName', lName='$lName', gender='$gender', phone='$phone', phoneCode='$phoneCode', date='$date', lang='$lang', dob='$dob')"
  }
}
