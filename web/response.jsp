<%-- 
    Document   : response
    Created on : Aug 27, 2014, 8:46:45 PM
    Author     : Kyle
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Response</title>
    </head>
    <body>
        <h1>Hello</h1>
         <p>

    <%
        Object objList = request.getAttribute("response");
        String s = "";
        if(objList == null) {
            // do something so program doesn't crash, like
            // here we create a list with an error message
 
           out.print("Sorry,  back empty");
        } else {
            // cast it
            s = (String)objList;
        }
     
            out.print(s);
    %>
    
         </p>
    </body>
</html>
