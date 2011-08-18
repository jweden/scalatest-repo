package weden.jason.scalatest.repo

import javax.servlet.http._
import javax.servlet._

class MainServlet extends HttpServlet {
	  override def doGet(request: HttpServletRequest, response: HttpServletResponse) = {
		 // response.setContentType("text/plain")
		  response.getWriter().println( exampleContent )  	  
	  } 
	  def exampleContent(): String = { """<html><h1>
This looks like just a webpage but behind the scenes is something pretty cool.  
This is a scala servlet that is deployed on the Google App Engine.  
When time permits, I hope to build this out into something more than a 
simple webpage being served up.  
<p>The code here resides in my <a href="https://github.com/jweden/scalatest-repo">GitHub Repository</a>
<p>
My LinkedIn profile is <a href="http://www.linkedin.com/in/jasonweden">here</a>.
</h1></html>""" }
}