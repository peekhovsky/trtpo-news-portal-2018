<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Main page</title>
</head>
<body>
<div>
    <#list newsFromServer as news>
        <h3>${news.title}</h3>
        ${news.description}
        <br/>
        Date: ${news.date}
        Author: ${news.author.firstName} ${news.author.lastName}
        <br/>
    </#list>
</div>
</body>
</html>
