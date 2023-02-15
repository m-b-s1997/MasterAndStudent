<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	 <h1>Calculator</h1>
	 <h6 style="color: red">*Please Enter single digit field only</h6>
	 <form method="get" action="add" name="form" onsubmit="validate()">
	 <h3>Addition</h3>
        <input type="number" name="num1" value="" required>
        <label for="num1">+</label>
        <input type="number" name="num2" value="" required>
        <input type="submit" value="Calculate">
    </form><br><br>
    <hr>

    <form method="get" action="subtract" name="form" onsubmit="validate()">
    	<h3>Subtraction</h3>
        <input type="number" name="num1" value="" required>
        <label for="num1">-</label>
        <input type="number" name="num2" value="" required>
        <input type="submit" value="Calculate">
    </form><br><br>
    <hr>

    <form method="get" action="multiply" name="form" onsubmit="validate()">
    	<h3>Multiplication</h3>
        <input type="number" name="num1" value="" required>
        <label for="num1">*</label>
        <input type="number" name="num2" value="" required>
        <input type="submit" value="Calculate">
    </form><br><br>
    <hr>

    <form method="get" action="divide" name="form1" onsubmit="validate();">
    	<h3>Division</h3>
        <input type="number" name="num1" value="" required>
        <label for="num1">/</label>
        <input type="number" name="num2" value="" required>
        <input type="submit" value="Calculate">
    </form><br><br>
    <hr>
	 
	 <a href="./logout">Logout</a></li>
	 
	 <script type="text/javascript">
	 
	function validate(){
		var num1=document.form1.num1.value;
		var num2=document.form1.num2.value;
		if(num1.length!=1 && num2.length !=1){
			alart("Please Enter single digit number (0 - 9)");
	}
	}
	 
	 
	  </script>
</body>
</html>