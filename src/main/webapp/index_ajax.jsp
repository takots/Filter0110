<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.Html"%>
<%
Html Html = new Html();
out.print(Html.Start("+-*/"));
out.print(Html.createContent("+" ,"PlusNum1"     ,"PlusNum2"    ,"PlusServlet"          ,"+" ,2 ,2));
// out.print(Html.createContent("-" ,"MinusNum1"    ,"MinusNum2"   ,"MinusServlet"         ,"-" ,2 ,2));
// out.print(Html.createContent("*" ,"MultiplyNum1" ,"MultiplyNum2","MultiplytiplyServlet" ,"*" ,2 ,2));
// out.print(Html.createContent("/" ,"DividedNum1"  ,"DividedNum2" ,"DividedidedServlet"   ,"/" ,2 ,2));
%>
<script>
function goCal(id){
alert(id);
	$.ajax({
        type: "get",
        url: "/Filter0110/"+id+"Servlet",
        dataType: "json",
        data: {"num1": $('#'+id+"Num1").val() ,"num2": $('#'+id+"Num2").val()},
        success: function (response) { 
        },
        error:function (){
        }
    }); 
}
</script>
<%
out.print(Html.End());
%>