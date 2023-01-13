<!DOCTYPE html>
<html>
<head>
<title>ZMTMO #project</title>
<link rel = "shortcut icon" href = "res/logo.ico">
<link rel = "stylesheet" href = "css/menu.css">
<link rel = "stylesheet" href = "css/global.css">
<link rel = "stylesheet" href = "css/mobile.css">
<link rel = "stylesheet" href = "css/card.css">
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
			<div class = "menu-item">
				<p class = "menu-item-text">home</p>
			</div>
		</a>
		<a href = "description.php" target = "_self">
			<div class = "menu-item active">
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
			<div class = "card-container">
				<div class = "card-header">
					<h1 class = "card-heading">Xiaomi Redmi Note 8 Pro</h1>
					<p class = "card-header-desc">The Redmi lineup has been one of the most sought-after budget smartphones for years now, but with competition heating up in the segment, Xioami needs to step up its game to stay relevant. The Redmi Note 8 Pro is an attempt to do that and has a lot to offer for the price delivering new hardware and a set of much-needed features.</p>
				</div>
				<hr>
				<div class = "card-body">
					<div class = "card-info">
						<p class = "card-info-text" title = "Phone camera have 64 Megapixels, 2160p quality"><i class = "fa fa-camera"></i> &nbsp 64MP</p>
					</div>
					<div class = "card-info">
						<p class = "card-info-text" title = "Battery have 4500mAh Li-Po technology"><i class = "fa fa-battery-full"></i> &nbsp 4500mAh</p>
					</div>
					<div class = "card-info">
						<p class = "card-info-text" title = "OS Android v11 RP1A"><i class = "fa fa-android"></i> &nbsp Android 11</p>
					</div>
					<div class = "card-info">
						<p class = "card-info-text" title = "Screen size is 6.53 inch 1080x2340 pixels"><i class = "fas fa-mobile"></i> &nbsp 6.53"</p>
					</div>
				</div>
				<br>
				<div class = "card-functions">
					<a href = "specifications.php" target = "_self"><button class = "card-button">...Show more</button></a>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>