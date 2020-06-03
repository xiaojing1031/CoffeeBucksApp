<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>

<html>
<head>
    <title>List Coffee</title>

    <!-- reference our style sheet -->
    <link type="text/css"
        rel="stylesheet"
        href="${pageContext.request.contextPath}/static_resources/css/coffee_order_style.css">
</head>

<body>

    <div id="wrapper">
        <div id="header">
            <h2>CRM - Coffee Management </h2>
        </div>
    </div>

    <div id="container">

        <div id="content">

            <!-- put new button: Add Coffee -->
            <input type="button" value="Add Coffee"
                   onclick="window.location.href='showCoffeeFormForAdd'; return false;"
                   class="add-button"
            />

            <!-- add a search box -->
            <form:form action="search" method="get">
                Search Coffee: <input type="text" name="theSearchName">
                <input type="submit" value="Search" class="add-button">
            </form:form>

            <!-- add out html table here -->
            <table>
                <tr>
                    <th>Id</th>
                    <th>Create Time</th>
                    <th>Update Time</th>
                    <th>Coffee</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>

                <!-- loop over and print our coffee -->
                <c:forEach var="tempCoffee" items="${coffee}">

                    <!-- construct an "update" link with coffee id -->
                    <c:url var="updateLink" value="/showCoffeeFormForUpdate">
                        <c:param name="coffeeId" value="${tempCoffee.id}" />
                    </c:url>

                    <c:url var="deleteLink" value="/coffeeDelete">
                        <c:param name="coffeeId" value="${tempCoffee.id}" />
                    </c:url>

                    <tr>
                        <td>${tempCoffee.id}</td>
                        <td>${tempCoffee.createTime}</td>
                        <td>${tempCoffee.updateTime}</td>
                        <td>${tempCoffee.coffee}</td>
                        <td>${tempCoffee.price}</td>

                        <td>
                            <!-- display the update link -->
                            <a href="${updateLink}">Update</a>
                            |
                            <a href="${deleteLink}"
                                onclick="if (!confirm('Are you sure you want to delete this coffee?')) return false">Delete</a>
                        </td>

                    </tr>
                </c:forEach>

            </table>

        </div>
    </div>

    <hr>

    <!-- display user name and role -->

    <p>
        User: <security:authentication property="principal.username" />
        <br><br>
        Role(s): <security:authentication property="principal.authorities" />
    </p>

    <hr>

    <!-- Add a logout button -->
    <form:form action="${pageContext.request.contextPath}/logout"
               method="post">

        <input type="submit" value="Logout" class="add-button"/>

    </form:form>

</body>

</html>
