<!DOCTYPE html>
<html>
<head>
<title>ZMTMO #project</title>
<link rel = "shortcut icon" href = "res/logo.ico">
<!--<link rel = "stylesheet" href = "css/style.css">-->
<link rel = "stylesheet" href = "css/menu.css">
<link rel = "stylesheet" href = "css/mobile.css">
<link rel = "stylesheet" href = "css/main.css">
<link rel = "stylesheet" href = "css/global.css">
<script src="https://kit.fontawesome.com/df86fcb26d.js" crossorigin="anonymous"></script>
<script src = "js/hamburger.js"></script>
</head>
<body>
<button class = "hamburger" onclick = "showHamburger()">&equiv;</button>
<div class = "menu-container" id = "menu">
	<button class = "hamburger-close" onclick = "closeHamburger()">&#10005;</button>
	<a href = "index.php" target = "_self">
		<div class = "menu-item logo">
			<img src = "res/logo.png" class = "logo">
		</div>
	</a>
	<a href = "index.php" target = "_self">
		<div class = "menu-item active">
			<p class = "menu-item-text">home</p>
		</div>
	</a>
	<a href = "description.php" target = "_self">
		<div class = "menu-item">
			<p class = "menu-item-text">description</p>
		</div>
	</a>
	<a href = "specifications.php" target = "_self">
		<div class = "menu-item">
			<p class = "menu-item-text">specifications</p>
		</div>
	</a>
	<a href = "review.php" target = "_self">
		<div class = "menu-item">
			<p class = "menu-item-text">review</p>
		</div>
	</a>
	<a href = "comparisons.php" target = "_self">
		<div class = "menu-item">
			<p class = "menu-item-text">comparisons</p>
		</div>
	</a>
	<a href = "contact.php" target = "_self">
		<div class = "menu-item">
			<p class = "menu-item-text">contact us</p>
		</div>
	</a>
</div>
<div class = "main-container">
	<div class = "mobile-preview">
		<img src = "res/phone.jpg" class = "phone-img">
	</div>
	<div class = "welcome-description">
		<h1 class = "welcome-header">Dream-equipped Redmi Note 8 Pro mobile</h1>
		<hr color = "#e4e4e4">
		<p class = "welcome-desc">Xiaomi's dream-equipped Redmi Note 8 Pro mobile offers a range of new and innovative features.</p>
	</div>
</div>
</body>
</html>