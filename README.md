This is my Play application
=================================

You can run it by typing the below command:

```
./activator run
```
open your browser,type:

```
localhost:9000/users
```

Look like this:

### User Add
![user add](http://img.beacelee.com/static/useradd.png@!2)

### User List
![user list](http://img.beacelee.com/static/userlist.png@!2)

### User Query

![user query](http://img.beacelee.com/static/userquery.png@!2)

### User Edit

![user edit](http://img.beacelee.com/static/useredit.png@!2)

### User Detail

![user detail](http://img.beacelee.com/static/userdetail.png@!2)


Controllers
===========

**ignore the below controllers,they are play's template,not customers**

- HomeController.scala:

  Shows how to handle simple HTTP requests.

- AsyncController.scala:

  Shows how to do asynchronous programming when handling a request.

- CountController.scala:

  Shows how to inject a component into a controller and use the component when
  handling requests.
  
**Please focus on below Controllers**

- DBController

  Show how to connect mysql DB simply.

- UserController(**the real code**)

  the customer code by me(`userinfo object`).

- ItemsController(**test code**)

  I will delete them later,just for the test before writing the real code. 


Views
==========
**just focus on the below files**

- layout.scala.html:

  All htmls' Schema.

- users.scala.html:

  Users list.

- details.scala.html:

  A panel component to find the user's details.


- edit.scala.html:

  A form component to edit a user information.


- userForm.scala.html:

  A form component to add a user information.
  
  
DataBase
==========

`"mysql" % "mysql-connector-java" % "5.1.36"`

