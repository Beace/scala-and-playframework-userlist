package models

/**
  * Created by beace on 16/10/11.
  */
class Users {
  val users = Map("beace" -> "bbb")
  def authenticate(username: String, password: String): Boolean = {
    users.exists{
      case (name,pwd) => name == username && pwd == password
    }
  }
}
