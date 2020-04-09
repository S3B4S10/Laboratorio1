<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>taller JSP</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="nombre"/>
        <jsp:setProperty name="mybean" property="nacimiento"/>
        <jsp:setProperty name="mybean" property="ingreso" />
        <jsp:setProperty name="mybean" property="semestreIngreso"/>
        <h1>Hola, <jsp:getProperty name="mybean" property="nombre" />!
            <br>
            Edad: <jsp:getProperty name="mybean" property="nacimiento" /> años
            <br>
            Ingresó en el año <jsp:getProperty name="mybean" property="ingreso" />, en el <jsp:getProperty name="mybean" property="semestreIngreso" />° semestre
            <br>
            Aproximado de semestres cursados: <jsp:getProperty name="mybean" property="semestresCursados" />
        </h1>
        
        
    </body>
</html>
