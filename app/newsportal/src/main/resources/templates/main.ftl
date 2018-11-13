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
            <h1>News portal</h1>
        </div>
        <div class="right">
            <#if userDto??>
                Signed as:<br/>
                Login: ${userDto.login} <br/>
                Name: ${userDto.firstName} ${userDto.lastName} <br/>
                <form method="get" action="/add">
                    <input type="submit" value="Add news">
                </form>
                <form method="get" action="/logout">
                    <input type="submit" value="Sign out">
                </form>
            <#else>
            <form method="post" action="/login">
                <table>
                    <tr>
                    <#if auth_fail??>
                        <td>Incorrect login or password.</td>
                    </#if>
                    </tr>
                    <tr>
                        <td>
                            <label for="login">
                                <input class="input-field" type="text" id="login" name="login"
                                       placeholder="Login">
                            </label>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label for="password">
                                <input class="input-field" type="password" id="password" name="password"
                                       placeholder="Password">
                            </label>
                        </td>
                    </tr>
                    <tr>
                        <td align="left">
                            <input type="submit" value="Sign in">
                        </td>
                    </tr>
                </table>
            </form>
            </#if>
        </div>
    </div>
</div>
<br/>
<div class="container">
    <div class="navigation">
        <a href="#">Vestibulum</a>
        <a href="#">Suspendisse</a>
        <a href="#">Elemen</a>
        <a href="#">Maecenas</a>
        <a href="#">Sodales</a>
        <div class="clearer"><span></span></div>
    </div>
    <div class="main">
    <div class="content">
    <#list newsFromServer as news>

            <h1>${news.title}</h1>
            ${news.description}
            <br/><br/>
            <form action="/news/${news.id}/">
                <input type="submit" value="Read more"/>
            </form>
            <div class="descr">Date: ${news.dateTime}
                Author: ${news.author.firstName} ${news.author.lastName}
            </div>
            <br/><br/><br/>
    </#list>
    </div>
        <div class="sidenav">
            <ul>
            <#if nextPageNumber??>
                <li><a href="/${nextPageNumber}">Next page</a></li>
            </#if>
            <#if previousPageNumber??>
                <li><a href="/${previousPageNumber}">Previous page</a></li>
            </#if>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
