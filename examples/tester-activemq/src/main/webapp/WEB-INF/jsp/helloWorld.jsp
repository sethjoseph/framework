<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<title>Hello World</title>
</head>

<body>
<h2>Welcome to the Tester ActiveMQ example application!</h2>
Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd" />
<br />
${message}
<br />
Count: ${count}
<hr />
Locale: ${pageContext.response.locale}
<hr />
<br />
<a href="/tester%2Dactivemq/inc">Increment Counter</a>&nbsp;&nbsp;&nbsp;<a href="/tester%2Dactivemq/dec">Decrement Counter</a>
<br />
<hr />

Message from queue: ${queueMessage}
<br />
<a href="/tester%2Dactivemq/produce">Produce a Message</a>&nbsp;&nbsp;&nbsp;<a href="/tester%2Dactivemq/consume">Consume a Message</a>

</body>
</html>
