<#ftl encoding='UTF-8'>
<html>
<head>
    <title>${news.title}</title>
    <link rel="stylesheet" href="/css/style.css" type="text/css">
</head>
<body>
<table align="center">
    <tr>
        <td>
            <h1>News portal</h1>
        </td>
        <td>
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
        </td>
    </tr>
</table>
<div>
    <h2>${news.title}</h2>
${news.text}
    <br/>
    <h5>
        Author: ${news.author.firstName} ${news.author.lastName}
    </h5>
    <h5>
        <#assign aDateTime = news.dateTime>
        Date: ${aDateTime}
    </h5>
</div>
<a href="#" onClick="history.go(-1)">Go Back</a>
</body>
</html>
