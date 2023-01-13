<!DOCTYPE html>
<html>
<head>
<title>ZMTMO #project</title>
<link rel = "shortcut icon" href = "res/logo.ico">
<link rel = "stylesheet" href = "css/menu.css">
<link rel = "stylesheet" href = "css/mobile.css">
<link rel = "stylesheet" href = "css/global.css">
<link rel = "stylesheet" href = "css/card.css">
<link rel = "stylesheet" href = "css/comments.css">
<script src="https://kit.fontawesome.com/df86fcb26d.js" crossorigin="anonymous"></script>
<script src = "js/hamburger.js"></script>
</head>
<body>
<button class = "hamburger" onclick = "showHamburger()">&equiv;</button>
<div class = "page">
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
				<div class = "menu-item active">
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
						<h1 class = "card-heading">Final verdict . . .</h1>
						<p class = "card-header-desc sm">For yet another year in a row, the Redmi Note Pro lineup brings a phone which is super easy to recommend. 
						It's a true "bang for the buck" kind of midranger and leaves almost nothing to complain about. 
						Sure, the Realme XT has a banging OLED panel for the same price with arguably more convenient in-display fingerprint reader, 
						but the Note 8 Pro's screen isn't bad either. It's bright, it's crisp, and the only things that could use some improvement is its color accuracy, 
						which may not be an essential point for many of the prospective buyers.</p>
					</div>
					<hr>
					<div class = "card-body">
						<div class = "critics-div">
							<span class = "review-text positive"><i class = "fas fa-plus"></i> dual Gorilla Glass 5 panels.</span>
						</div>
						<div class = "critics-div">
							<span class = "review-text positive"><i class = "fas fa-plus"></i> video recording quality</span>
						</div>
						<div class = "critics-div">
							<span class = "review-text positive"><i class = "fas fa-plus"></i> Outstanding battery life</span>
						</div>
						<div class = "critics-div">
							<span class = "review-text negative"><i class = "fas fa-minus"></i> 2MP Macro camera</span>
						</div>
						<div class = "critics-div">
							<span class = "review-text negative"><i class = "fas fa-minus"></i> video recording in 1080p</span>
						</div>
					</div>
					<div class = "card-functions">
						<div class = "interactions-div">
							<div class = "i-block">
								<button class = "like-btn"><i class = "fas fa-thumbs-up"></i></button>
								<p class = "like-text">Upvote</p>
							</div>
							<div class = "i-block">
								<button class = "like-btn dislike-colored"><i class = "fas fa-thumbs-down"></i></button>
								<p class = "like-text">Downvote</p>
							</div>
							<div class = "i-block">
								<button class = "like-btn comment-colored" onclick = "window.scrollTo(0,700);"><i class = "fas fa-comments"></i></button>
								<p class = "like-text">Scroll to the comment section</p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class = "comment-container">
				<div class = "comments-title">
					<h1 class = "comments-title-text">Leave your opinion in the comments below . . .</h1>
					<form method = "post">
						<textarea class = "input" placeholder = "Be free to write your idea . . ."></textarea>
						<button type = "submit" class = "submitComment"><i class = "fas fa-paper-plane loc"></i></button>
					</form>
				</div>
				<br>
				<div class = "comments-content">
					<div class = "msgRow">
						<span class = "msgDateTime">21-Nov-21 21:07</span>
						<div class = "msgBody">
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed volutpat leo leo, et consectetur nisl iaculis eu. Aliquam erat volutpat. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;</p>
						</div>
					</div>
					<div class = "msgRow">
						<span class = "msgDateTime">21-Nov-21 21:07</span>
						<div class = "msgBody">
							<p>Curabitur volutpat mi non diam suscipit volutpat. Cras volutpat pellentesque lorem ut venenatis. Etiam venenatis aliquam sem, in pellentesque elit maximus ac.</p>
						</div>
					</div>
					<div class = "msgRow">
						<span class = "msgDateTime">21-Nov-21 21:07</span>
						<div class = "msgBody">
							<p>Sed turpis felis, facilisis semper placerat id, vehicula sed nisl.</p>
						</div>
					</div>
				</div>
			</div>
	</div>
</div>
</body>
</html>