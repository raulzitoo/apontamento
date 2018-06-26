<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>    
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:url value="/resource/css/" var="cssPath" />

<link rel="stylesheet" href="${cssPath}/bootstrap.min.css">
<c:url value="/resource/js/" var="jsPath"/>
<script src="${jsPath }/bootstrap.min.js"></script>


<title>Apontamento</title>
</head>
<body>
<h1>Formulario</h1>

 <form action="${s:mvcUrl('AC#gravar').build() }" method="POST">
 	
 	
    <div >
         <label>Data:</label>
         <input type="text" name="data" />
    </div>
        
	<div>
 		<label>Horas:</label>
 		<input type="text" name="hora">
 	</div>
 	
 	
 	<div>
 		<label>Descrição:</label>
 		<input type="text" name="descricao">
 	</div>
 
 	<button type="submit">Cadastrar</button>
 </form>


</body>
</html>