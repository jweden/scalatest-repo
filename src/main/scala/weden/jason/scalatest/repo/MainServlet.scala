package weden.jason.scalatest.repo

import javax.servlet.http._
import javax.servlet._

class MainServlet extends HttpServlet {
	  override def doGet(request: HttpServletRequest, response: HttpServletResponse) = {
		  response.setContentType("text/plain")
		  response.getWriter().println( exampleContent )  	  
	  } 
	  def exampleContent(): String = { "Hello world, from a Scala servlet!" }
}