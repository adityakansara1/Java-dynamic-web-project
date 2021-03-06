<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="Header.jsp"%>
<% response.setHeader("Cache-Control" ,"no-cache ,no-store ,must-revalidate"); // HTTP 1.1
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0
		response.setHeader("Expires" ,"0"); // Proxies
		if(session.getAttribute("username")==null){
			response.sendRedirect("login.jsp");
		}
		%>
<header id="header" class="fixed-top">
  <div class="container d-flex align-items-center">

    <h1 class="logo mr-auto"><a href="index.html">Technical Blogs</a></h1>
    <!-- Uncomment below if you prefer to use an image logo -->
    <!-- <a href="index.html" class="logo mr-auto"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

    <nav class="nav-menu d-none d-lg-block">
      <ul>
        <li class="active"><a href="/">Home</a></li>
        <li><a href="/about">About</a></li>

        <li><a href="/contact">Contact</a></li>


      </ul>
    </nav><!-- .nav-menu -->



  </div>
</header><!-- End Header -->
   
<%
int id=Integer.parseInt(request.getParameter("id"));
request.setAttribute("id", id);
%>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/technicalblogs" user="root" password=""/>
	<sql:query var="rs" dataSource="${db}">select * from posts where id=${id}</sql:query> 
<c:forEach items="${rs.rows}" var="post">
<section style="padding-top: 100px;">

  <div class="col-md-10 mt-5 mx-auto">
    <div class="container mx-auto">
      
      <form action="edit?id=${post.id}" method="post" >

      
     
     
        <div class="form-group">
          <textarea class="form-control" name="title" rows="5" data-rule="required"
            data-msg="Please write something for us" >${post.title}</textarea>
          <div class="validate"></div>
        </div>


        <div class="form-group">
          <input type="text" class="form-control" name="slug" id="subject" value="${post.slug }" data-rule="minlen:4"
            data-msg="Please enter at least 8 chars of subject" />
          <div class="validate"></div>
        </div>

        <!-- 0 -->
        <div class="form-group">

          


        <div class="form-group">
          <textarea class="form-control" name="content1" rows="5" colums="200" data-rule="required"
            data-msg="Please write something for us">${post.content1}</textarea>
          <div class="validate"></div>
        </div>
        
        
        <div class="form-group">
          <textarea class="form-control" name="content2" rows="5" colums="200" data-rule="required"
            data-msg="Please write something for us">${post.content2}</textarea>
          <div class="validate"></div>
        </div>
        
        <div class="form-group">
          <textarea class="form-control" name="content3" rows="5" colums="200" data-rule="required"
            data-msg="Please write something for us">${post.content3}</textarea>
          <div class="validate"></div>
        </div>
        
        <div class="form-group">
          <textarea class="form-control" name="content4" rows="5" colums="200" data-rule="required"
            data-msg="Please write something for us">${post.content4}</textarea>
          <div class="validate"></div>
        </div>
        
        <div class="form-group">
          <textarea class="form-control" name="content5" rows="5" colums="200" data-rule="required"
            data-msg="Please write something for us">${post.content5}</textarea>
          <div class="validate"></div>
        </div>
        
        <div class="form-group">
          <textarea class="form-control" name="content6" rows="5" colums="200" data-rule="required"
            data-msg="Please write something for us">${post.content6}</textarea>
          <div class="validate"></div>
        </div>
        
        <div class="form-group">
          <textarea class="form-control" name="content7" rows="5" colums="200" data-rule="required"
            data-msg="Please write something for us">${post.content7}</textarea>
          <div class="validate"></div>
        </div>
        
        <div class="form-group">
          <textarea class="form-control" name="content8" rows="5" colums="200" data-rule="required"
            data-msg="Please write something for us">${post.content8}</textarea>
          <div class="validate"></div>
        </div>
        
        <div class="form-group">
          <textarea class="form-control" name="content9" rows="5" colums="200" data-rule="required"
            data-msg="Please write something for us">${post.content9}</textarea>
          <div class="validate"></div>
        </div>
        
        <div class="form-group">
          <textarea class="form-control" name="content10" rows="5" colums="200" data-rule="required"
            data-msg="Please write something for us">${post.content10}</textarea>
          <div class="validate"></div>
        </div>
                            <button onclick="myfunc2()" class="btn btn-submit btn-block"
                              style="background-color: #5f86cf;" type="submit">Post edited post</button>
      </form>
    </div>
  </div>
</section>
</c:forEach> 
<hr>
 <%@ include file="Footer.jsp"%>