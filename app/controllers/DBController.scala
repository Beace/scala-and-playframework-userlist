package controllers

import javax.inject.Inject

import play.api.db.Database
import play.api.mvc.{Action, Controller}

/**
  * Created by beace on 16/10/12.
  */
class DBController @Inject() (db: Database) extends Controller{
  def user = Action {
    var outString = "number is"
    val conn = db.getConnection()

    try {
      val stmt = conn.createStatement()
      val rs = stmt.executeQuery("SELECT * FROM test")
      while(rs.next()){
        println(rs.getString("id"))
        outString += rs.getString("id")
        outString += rs.getString("username")
        outString += rs.getString("password")
      }
    }finally {
      conn.close()
    }
    Ok(outString)
  }
}
