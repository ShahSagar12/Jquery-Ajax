<%@page import="com.sagar.aj.entity.Customer"%>


<%
response.setHeader("Content-Type","application/json");
Customer customer=new Customer(1,"Srijana Shah","Srijanashah@gmail.com",true);
out.println(customer.toJson());


%>