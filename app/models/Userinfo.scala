package models

import javax.inject.Inject

import play.api.db
import play.api.db.Database

/**
  * Created by beace on 16/10/12.
  */
case class Userinfo (id: Int, username: String, description: String, password: String)
