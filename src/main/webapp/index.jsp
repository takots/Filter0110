<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.Html"%>
<%
Html Html = new Html();
out.print(Html.Start("+-*/"));
out.print(Html.createContent("plus" ,2 ,2)); 
out.print(Html.createContent("minus" ,2 ,2)); 
out.print(Html.End());
%>