
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="data" value="jhdhjghghjj"></c:set>
<c:out value="${data}"></c:out>

<p id="userData">Showed here</p>

<script type="text/javascript">
var name=`
<p>USerName is ${userData} </p>
ul
`;

(
		function()
		{
	var data=JSON.stringify(${userData});
	var jsonObj=JSON.parse(data);
	 let content="<table><tr><th>Name</th><th>Mobile number</th></tr>";
	for( let obj in jsonObj)
		{
		content+="<tr><td>"+jsonObj[obj].name+"</td><td>"+jsonObj[obj].mobile+"</td></tr>";		
		}
	console.log(jsonObj);
	content+="</table>";
	 console.log(content);
	document.getElementById("userData").innerHTML=content; 
	
		}
)();

</script>


</body>
</html>