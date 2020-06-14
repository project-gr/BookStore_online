<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.bookstore.bean.UserBean" %>
<%
UserBean user = null;
user = (UserBean) request.getSession().getAttribute("user");
if(user == null){
	response.sendRedirect("Login.jsp");
}
%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>CSE WAD Demo</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
    <link rel="stylesheet" href="assets/css/styles.min.css">
</head>
<body>
    <div>
        <nav class="navbar navbar-light navbar-expand-md navigation-clean">
            <div class="container"><a href="#" class="navbar-brand">HCMIU SCSE</a><button data-toggle="collapse" data-target="#navcol-1" class="navbar-toggler"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse"
                    id="navcol-1">
                    <ul class="nav navbar-nav ml-auto">
                        <li role="presentation" class="nav-item"><a href="#" class="nav-link active">First Item</a></li>
                        <li role="presentation" class="nav-item"><a href="#" class="nav-link">Second Item</a></li>
                        <li role="presentation" class="nav-item"><a href="#" class="nav-link">Third Item</a></li>
                        <li class="dropdown nav-item"><a data-toggle="dropdown" aria-expanded="false" href="#" class="dropdown-toggle nav-link">Dropdown </a>
                            <div role="menu" class="dropdown-menu"><a role="presentation" href="#" class="dropdown-item">First Item</a><a role="presentation" href="#" class="dropdown-item">Second Item</a><a role="presentation" href="#" class="dropdown-item">Third Item</a></div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
    <div class="container">
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">${user.username}</h4>
                <h6 class="text-muted card-subtitle mb-2">${user.pass}</h6>
                <p class="card-text">The course you registered should be displayed in the table below:</p>
                <div class="table-responsive">
					<form method="post" action="CourseRegistrationController">
						<table class="table">
							<thead>
								<tr>
									<th>Course Name</th>
									<th>Credit</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items="${user.getElement(username)}">
									<tr>
										<td>${item.username}</td>
										<td>${item.fName}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</form>
				</div>
                <a href="CourseRegistrationController" class="btn btn-primary">Course Registration</a>
            </div>
        </div>
    </div>
</body>
</html>