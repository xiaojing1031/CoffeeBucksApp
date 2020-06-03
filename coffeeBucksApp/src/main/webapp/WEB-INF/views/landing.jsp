<%@ taglib prefix="tr" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
    <title>Ms.Chen Coffee Bucks</title>
    <style>
        h1 {
            color: mediumpurple;
            text-align: center;
        }
    </style>

    <link type="text/css"
            rel="stylesheet"
            href="${pageContext.request.contextPath}/static_resources/css/landing_page_style.css">

</head>

<body>

    <p>
        <a href="${pageContext.request.contextPath}/customerLogin">
            Log In
        </a>
        |
        <a href="${pageContext.request.contextPath}/customerSignUp">
            Join Now
        </a>
        |
        <a href="${pageContext.request.contextPath}/myCart">
            My Cart
        </a>

        <div id = "wrapper">
            <div id="header">
                <h1>Ms.Chen Coffee Bucks </h1>
            </div>
        </div>

    </p>

    <hr>

    <div id="container">
        <h2>Coffee Menu</h2>

        <div id="content">
            <!-- add a search box -->
            <form:form action="search" method="get">
                Search Coffee: <input type="text" name="searchCoffee">
                <input type="submit" value="Search">
            </form:form>

            <hr>

            <table>
                <tr>
                    <th>Coffee</th>
                    <th>Regular Size Price</th>
                    <th>Venti Size Price</th>
                    <th>Action</th>
                </tr>

                <!-- loop over and print our coffee -->
                <c:forEach var="shoppingProduct" items="${products}">

                    <tr>
                        <td>${shoppingProduct.coffeeName}</td>
                        <td>${shoppingProduct.regularPrice}</td>
                        <td>${shoppingProduct.ventiPrice}</td>
                        <td>

                            <a href="${pageContext.request.contextPath}/addToCart">Add to Cart</a>
                        </td>

                    </tr>
                    </tr>
                </c:forEach>

            </table>

        </div>

    </div>

    <hr>

    <p>
        <a href="${pageContext.request.contextPath}/coffee">

            Access Secure Site for Coffee-Order Management (requires login)
        </a>
    </p>

</body>

</html>