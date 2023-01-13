<?php

	$seconds = date("s");
	
	if ($seconds >= 0 && $seconds <= 15) {

		include("page1.php");
	}

	else if ($seconds > 15 && $seconds <= 30) {
		include("page2.php");
	}

	else if ($seconds > 30 && $seconds <= 45) {
		include("page3.php");
	}

	else {
		include("page4.php");
	}
	
?>