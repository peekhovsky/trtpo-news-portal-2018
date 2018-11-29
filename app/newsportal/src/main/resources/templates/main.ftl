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
            <form method="post" action="/login">
                <ul>
                <#if auth_fail??>
                    <li>Incorrect login or password.</li>
                <#else>
                    <li>Sign in</li>
                </#if>
                    <li><label for="login">
                        <input class="input-field" type="text" id="login" name="login"
                               placeholder="Login">
                    </label></li>
                    <li><label for="password">
                        <input class="input-field" type="password" id="password" name="password"
                               placeholder="Password">
                    </label></li>
                    <li>
                        <div class="button"><input type="submit" value="Sign in"></div>
                    </li>
                </ul>
            </form>
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
        <div class="content">
    <#list newsFromServer as news>
        <div class="news">
            <h1>${news.title}</h1>
            ${news.description}
            <br/><br/>
            <div class="descr">
            <a href="/news/${news.id}/">Read more</a><br/>
                    <#assign aDateTime = news.dateTime>
                Date: ${aDateTime.format(dateFormatter)} <br/>
                Author: ${news.author.firstName} ${news.author.lastName}
            </div>
            <br/>
        </div>
        <br/>
    </#list>
        </div>
        <div class="sidenav">
            <ul>
                <#if request??>
                     <#if nextPageNumber??>
                         <li><a href="/search/${nextPageNumber}?request=${request}">Next page</a></li>
                     </#if>
                    <#if previousPageNumber??>
                        <li><a href="/search/${previousPageNumber}/?request=${request}">Previous page</a></li>
                    </#if>
                <#else>
                    <#if nextPageNumber??>
                <li><a href="/${nextPageNumber}">Next page</a></li>
                    </#if>
                    <#if previousPageNumber??>
                        <li><a href="/${previousPageNumber}">Previous page</a></li>
                    </#if>
                </#if>
                <li><a href="/">Main page</a></li>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
