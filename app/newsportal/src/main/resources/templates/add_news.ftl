<#ftl encoding='UTF-8'>
<html>
<head>
    <title>News portal</title>
    <link rel="stylesheet" href="/css/default.css" type="text/css" media="screen">
    <link rel="stylesheet" href="/css/style.css" type="text/css">
</head>
<body>
<div class="top">
    <div class="header">
        <div class="left">
            <ul>
                <li>
                    <h2>News portal</h2>
                </li>
                <li>
                    <form method="get" action="/search">
                        <#if request??>
                            <input class="input-field" type="text" id="request" name="request"
                                   value="${request}" placeholder="Search here...">
                        <#else>
                             <input class="input-field" type="text" id="request" name="request"
                                    placeholder="Search here...">
                        </#if>
                    </form>
                </li>
            </ul>
        </div>
        <div class="right">
            <#if userDto??>
                <h3>Login: ${userDto.login}</h3>
                <h3>Name: ${userDto.firstName} ${userDto.lastName}</h3>
            <#else>
            </#if>
        </div>
    </div>
</div>
<br/>
<div class="container">
<#if userDto??>
<div class="navigation">
    <a href="/add_news">Add news</a>
    <a href="/add_user">Add user</a>
    <a href="/logout">Sign out</a>
</div>
</#if>
    <div class="main">
        <div class="add-news">
            <form action="/add_news" method="post">
                <br/>
                <label>Title:
                    <br/><input type="text" name="title"/>
                </label>
                <br/>
                <label>Short description:
                    <br/><textarea rows="5" cols="110" name="description"></textarea>
                </label>
                <br/>
                <label>Text:
                <br/><textarea rows="50" cols="110" name="text"></textarea>
                </label>
                <br/>
                <div class="button"><input type="submit" value="Add"></div>
            </form>
        </div>
</body>
</html>
