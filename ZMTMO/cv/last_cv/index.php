<!DOCTYPE html>
<html>
<body>
<form method = "GET">
	<input name = "e1" type = "number">
    <select name = "operation">
    	<option value = "plus">+</option>
        <option value = "minus">-</option>
        <option value = "multiply">*</option>
        <option value = "divide">/</option>
    </select>
    <input name = "e2" type = "number">
    <input name = "submit" type = "submit">
</form>
<?php
	$e1 = intval($_GET['e1']);
    $e2 = intval($_GET['e2']);
    $op = $_GET['operation'];
    $submit = $_GET['submit'];
	$result = 0;
    
    if (isset($e1) && isset($e2) && isset($op) && isset($submit)) {
		if ($_GET['e1'] != "" && $_GET['e2'] != "") {
			if (gettype($e1) === "integer" && gettype($e2) === "integer") {
				if ($op === "divide") {
					if ($e2 != 0) {
						$result = $e1 / $e2;
					}
					else {
						echo "<br>Error: division by zero error";
					}
				}
				else if ($op === "multiply") {
					$result = $e1 * $e2;
				}
				else if ($op === "plus") {
					$result = $e1 + $e2;
				}
				else if ($op === "minus") {
					$result = $e1 - $e2;
				}
				else {
					echo "<br>Error: invalid operation type";
				}
				
				echo "<br>Result is: " . $result;
			}
			else {
				echo "<br>Error: non-number input";
			}
		}
		else {
			echo "<br>Error: both numbers!";
		}
    }
    else {
    	echo "<br>Values not set yet!";
    }
?>
</body>
</html>
