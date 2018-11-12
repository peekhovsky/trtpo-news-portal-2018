<#ftl encoding='UTF-8'>
<html>
<head>
    <title>${news.title}</title>
</head>
<body>
<div>
    <h2>${news.title}</h2>
    ${news.text}
    <h5>
        Author: ${news.author.firstName} ${news.author.lastName}
    </h5>
    <h5>
        Date: ${news.date}
    </h5>
</div>
</body>
</html>
