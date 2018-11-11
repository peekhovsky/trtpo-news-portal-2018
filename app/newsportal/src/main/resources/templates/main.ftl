<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Main page</title>
</head>
<body>
<div>
    <#list newsFromServer as news>
        <h3>${news.title}</h3>
        <br/>
        ${news.text}
        <br/>
        Date: ${news.date}
        <br/>
    </#list>
</div>
</body>
</html>