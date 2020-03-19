<%@page import="com.sagar.aj.dao.CustomerDAOImpl"%>
<%@page import="com.sagar.aj.dao.CustomerDAO"%>
<%@page import="com.sagar.aj.entity.Customer"%>


<%
CustomerDAO customerDao=new CustomerDAOImpl();
response.setHeader("Content-Type","application/json");
if(request.getParameter("id")==null){
String output="";
for(Customer c:customerDao.getAll()){
	if(output.equals("")){
		output+=c.toJson();
	}else{
		output+=","+c.toJson();
	}
}
out.println("["+output+"]");
}else{
	int id=Integer.parseInt(request.getParameter("id"));
	Customer customer=customerDao.getById(id);
	out.println(customer.toJson());
}


%>