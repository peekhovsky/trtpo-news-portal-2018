<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Main page</title>
</head>
<body>
<h1>News portal</h1>
<div>
    <#list newsFromServer as news>
        <h3>${news.title}</h3>
        ${news.description}
        <br/>
        <form action="/news/${news.id}">
            <input type="submit" value="Read more"/>
        </form>
        Date: ${news.dateTime}
        Author: ${news.author.firstName} ${news.author.lastName}
        <br/>
    </#list>
</div>
</body>
</html>