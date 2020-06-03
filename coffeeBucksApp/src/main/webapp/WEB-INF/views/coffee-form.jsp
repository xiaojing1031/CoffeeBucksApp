<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<head>
    <title>Save Coffee</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/static_resources/css/coffee_order_style.css">

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/static_resources/css/coffee_order_style.css">

</head>
<body>

    <div id="wrapper">
        <div id="header">
            <h2>CRM - Coffee Management</h2>
        </div>
    </div>

    <div id="container">
        <h3>Save Coffee</h3>

        <form:form action="saveCoffee" modelAttribute="coffee" method="post">

            <!-- need to associate this data with coffee id -->
            <form:hidden path="id" />

            <table>
                <tbody>

                    <tr>
                        <td><label>Coffee Name: </label></td>
                        <td><form:input path="coffee"/></td>
                    </tr>

                    <tr>
                        <td><label>Coffee Price: </label></td>
                        <td><form:input path="price"/></td>
                    </tr>

                    <tr>
                        <td><label></label></td>
                        <td><input type="submit" value="Save" class="save"></td>
                    </tr>

                </tbody>
            </table>
        </form:form>

        <!-- navigation  -->
        <div style="clear; both;"></div>

        <p>
            <a href="${pageContext.request.contextPath}/coffee">Back to List</a>
        </p>

    </div>
</body>
</html>