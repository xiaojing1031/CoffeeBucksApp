
<html>
<head>
    <h3>Welcome to Ms.Chen Coffee Bucks</h3>
</head>
<body>
    <h2>Ms.Chen Landing Page </h2>
    <hr>
    <p>
        Welcome to the landing page! This page is open to the public ..
    </p>

    <hr>
    <p>
        Customer
        <a href="${pageContext.request.contextPath}/customerLogin">
            Log In
        </a>
        |
        <a href="${pageContext.request.contextPath}/customerSignUp">
            Sign Up
        </a>

    </p>

    <hr>

    <p>
        <a href="${pageContext.request.contextPath}/coffee">

            Access Secure Site for Coffee-Order Management (requires login)
        </a>
    </p>

</body>
</html>