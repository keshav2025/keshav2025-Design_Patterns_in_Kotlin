fun main() {
  sharingWidget.incrementTwitterLikes()
  sharingWidget.incrementTwitterLikes()
  sharingWidget.incrementTwitterLikes()
  sharingWidget.incrementTwitterLikes()
  sharingWidget.incrementTwitterLikes()
  sharingWidget.incrementFbLikes()
  sharingWidget.incrementFbLikes()
  sharingWidget.incrementFbLikes()
  sharingWidget.incrementFbLikes()
  sharingWidget.displayAllLikes()

  dataBaseConnection.connect()
  dataBaseConnection.disconnect()
  println(dataBaseConnection.getConnectionStatus()) 
}

object sharingWidget {
  private var twitterLikes = 0
  private var fbLikes = 0

  fun incrementTwitterLikes() {
      twitterLikes++
  }

  fun incrementFbLikes() {
      fbLikes++
  }

  fun displayAllLikes() {
      println("Twitter Likes ---> $twitterLikes, Facebook Likes ---> $fbLikes")
  }
}

object dataBaseConnection {

  val connection: String = "Data Base connection is initialized"
  
  fun connect() {
      println("Your dataBase is connected")
  }

  fun disconnect() {
      println("Your dataBase is disconnected")
  }

 
  fun getConnectionStatus(): String {
      return connection
  }
}





