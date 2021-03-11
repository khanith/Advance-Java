<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.*,com.ltts.demowebproject.model.*,com.ltts.demowebproject.Dao.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
AutionDao pd=new AutionDao();
List<Aution> li=pd.getAllAutions();
%>
<table>
<tr>
<th></th>
<th>Aution id</th>
<th>Player id</th>
<th>Team id</th>
<th>Year</th>
<th>Amount</th>
</tr>
<%
for(Aution a:li){
%>
<tr>
<td><%=a.getAutionid() %></td>
<td><%=a.getPlayerid() %></td>
<td><%=a.getTeamid() %></td>
<td><%=a.getYear() %></td>
<td><%=a.getAmount() %></td>
<td><a href="editaution.jsp?id=<%=a.getAutionid()%>">Update</a></td>
</tr>
<%} %>
</table>
</body>
</html>