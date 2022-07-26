<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

<%--    <link rel="stylesheet" href="fonts/icomoon/style.css">--%>

    <link rel="stylesheet" href="${contextPath}/css/owl.carousel.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="${contextPath}/css/bootstrap.min.css">

    <!-- Style -->
    <link rel="stylesheet" href="${contextPath}/css/style.css">

    <title>Login</title>
</head>
<body>


<div class="d-lg-flex half">
    <div class="bg order-1 order-md-2" style="background-image: url('../../images/sampul.png');"></div>
    <div class="contents order-2 order-md-1">

        <div class="container">
            <div class="row align-items-center justify-content-center">
                <div class="col-md-7">
                    <h3>Login to <strong>E-Rapor</strong></h3>
                    <p class="mb-4">This application is specially made for teachers. Now manage rapor data easily</p>
                    <form:form cssClass="form" action="/cekLogin" modelAttribute="guru" method="POST">
                        <div class="form-group first">
                            <label for="username">Username</label>
                            <form:input type="text" class="form-control" placeholder="Your Username" id="username" path="username"/>
                        </div>
                        <div class="form-group last mb-3">
                            <label for="password">Password</label>
                            <form:input type="password" class="form-control" placeholder="Your Password" id="password" path="password"/>
                        </div>

                        <div class="d-flex mb-5 align-items-center">
                            <label class="control control--checkbox mb-0"><span class="caption">Remember me</span>
                                <input type="checkbox" checked="checked"/>
                                <div class="control__indicator"></div>
                            </label>
                        </div>
                        <form:button type="submit" id="save" class="btn btn-block btn-primary">Login</form:button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>



<script src="../../js/jquery-3.3.1.min.js"></script>
<script src="../../js/popper.min.js"></script>
<script src="../../js/bootstrap.min.js"></script>
<script src="../../js/main.js"></script>
</body>
</html>