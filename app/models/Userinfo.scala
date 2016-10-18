package models

import javax.inject.Inject

import play.api.db
import play.api.db.Database

/**
  * Created by beace on 16/10/12.
  */
case class Userinfo (id: Int, username: String, description: String, password: String)

object Userinfo {
  var outString = ""
  var list: List[Userinfo] = {
    List(
      Userinfo(
        1,
        "beace",
        "student",
        "beace"
      ),
      Userinfo(
        2,
        "jerry",
        "big crow",
        "jerry"
      ),
      Userinfo(
        3,
        "jenny",
        "little girl",
        "jenny"
      )
    )
  }
  def save(userinfo: Userinfo) = {
    list = list ::: List(userinfo)
  }
}