<!-- Kyle Snitko 2349076 -->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Error</title>
    </head>
    <body>
        <h1>Java Error</h1>
        <p> Sorry, Java has thrown an exception.</p>
        <p> To continue, please click the back button</p>
        
        <h2> Details</h2>
        <p> Type: {pageContext.exception["class"]}</p>
        <p> Message: {pageContext.exception.message}</p>
    </body>
</html>
