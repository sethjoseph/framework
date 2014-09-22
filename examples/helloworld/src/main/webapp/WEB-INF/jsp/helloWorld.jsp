<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<title>Hello World</title>
</head>

<body>
<h2>Hello, and welcome to the Hello World example application!</h2>
Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd" />
<br />
The message is ${message}
<br />
Reference Data Source is ${referenceDataSource}
<hr />
Locale: ${pageContext.response.locale}
</body>
</html>
