<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Add news</title>
    <link rel="stylesheet" href="/css/style.css" type="text/css">
</head>
<body>

<table align="center">
    <tr>
        <td>
            <h1>News portal</h1>
        </td>
        <td>
            Signed as:<br/>
            Login: ${userDto.login} <br/>
            Name: ${userDto.firstName} ${userDto.lastName} <br/>
        </td>
    </tr>
</table>

<div>
    <form action="/add" method="post">
        <label>Title:
        <br/><input type="text" name="title"/>
        </label>
        <br/><label>Short description:
            <br/><textarea rows="5" cols="110" name="description"></textarea>
        </label>
        <br/><label>Text:
            <br/><textarea rows="50" cols="110" name="text"></textarea>
        </label>
        <input type="submit" value="Add">
    </form>
</div>
</body>
</html>
