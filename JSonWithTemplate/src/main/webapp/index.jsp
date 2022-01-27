<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>

<form action="ShowUserServlet">

<button type="submit">GetUsers</button>
</form>
<c:set var="data1" value="jhdhjghghjj"></c:set>
<c:out value="${data1}"></c:out>
</body>
</html>
