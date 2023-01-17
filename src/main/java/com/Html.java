package com;

public class Html {
	public String Start(String title) {
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("<!DOCTYPE html>");
		stringbuffer.append(	"<html lang=\"en\">");
		stringbuffer.append(	"<head>");
		stringbuffer.append(		"<meta charset=\"UTF-8\">");
		stringbuffer.append(		"<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		stringbuffer.append(		"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		stringbuffer.append(		"<title>"+title+"</title>");
		// bookstrap5
		stringbuffer.append(		"<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0\" crossorigin=\"anonymous\">");
		stringbuffer.append(		"<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8\" crossorigin=\"anonymous\"></script>");
		// swal
		stringbuffer.append(		"<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>");
		// ajax
		stringbuffer.append(		"<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>");
		stringbuffer.append(	"</head>");
		stringbuffer.append(	"<body>");
		stringbuffer.append(	"<div class=\"container\">");
		return stringbuffer.toString();
	}
	
	public String createContent(String servletname ,int sm1 ,int sm2) {
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("<form action=\"/Filter0110/"+servletname+"\">");
		stringbuffer.append(	"<div class=\"mb-3\">");
		stringbuffer.append(		"<label for=\"staticEmail\" class=\"col-sm-"+sm1+" col-form-label\">"+servletname+"</label>");
		stringbuffer.append(		"<div class=\"col-sm-"+sm2+"\">");
		stringbuffer.append(			"<input class=\"form-control\"    type=\"text\" name=\"num1\">");
		stringbuffer.append(			"<input class=\"form-control\"    type=\"text\" name=\"num2\">");
		stringbuffer.append(			"<input class=\"btn btn-primary\" type=\"submit\" value=\""+servletname+"\">");
		stringbuffer.append(		"</div>");
		stringbuffer.append(	"</div>");
		stringbuffer.append("</form>");
		return stringbuffer.toString();
	}
	
	// ajax
	public String createContent(String labelName ,String idnum1 ,String idnum2 ,String idpostbtn ,String postbtnvalue ,int sm1 ,int sm2) {
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("<div class=\"mb-3\">");
		stringbuffer.append(	"<label for=\"staticEmail\" class=\"col-sm-"+sm1+" col-form-label\">"+labelName+"</label>");
		stringbuffer.append(	"<div class=\"col-sm-"+sm2+"\">");
		stringbuffer.append(		"<input type=\"text\" class=\"form-control\" id=\""+idnum1+"\" value=\"\">");
		stringbuffer.append(		"<input type=\"text\" class=\"form-control\" id=\""+idnum2+"\" value=\"\">");
		stringbuffer.append(	"<input id=\""+idpostbtn+"\" class=\"btn btn-primary\" value=\""+postbtnvalue+"\" type=\"button\" value=\"Input\" onclick=\"goCal(this.id)\">");
		stringbuffer.append(	"</div>");
		stringbuffer.append("</div>");
		return stringbuffer.toString();
	}
	public String End() {
		StringBuffer stringbuffer = new StringBuffer();
		stringbuffer.append("</div>");
		stringbuffer.append("</body>");
		stringbuffer.append("</html>");
		return stringbuffer.toString();
	}
}
