<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Tab</title>
</head>
<body>
<h1>Student Registration form</h1>

<form action="/saveStudent">
		<table>
			<tr>
				<td> USERID</td>
				<td><input type="text" name="sid"></td>
			</tr>
			<tr>
				<td>USERNAME FNAME</td>
				<td><input type="text" name="fname"></td>
			</tr>

			<tr>
				<td>USERNAME LASTNAME</td>
				<td><input type="text" name="lname"></td>
			</tr>

			<tr>
				<td>ADDRESS</td>
				<td><input type="text" name="saddress"></td>
			<tr>
			</tr>

				<td>MARKS</td>
				<td><input type="text" name="smarks"></td>
			</tr>

			<tr>

				<td><input type="submit" value="Click"></td>
			</tr>
		</table>
	</form>
</body>
</body>
</html>