function closeHamburger() {
	var el = document.getElementById("menu");
	el.style.opacity = "0";
	el.style.visibility = "hidden";
	el.style.transition = "opacity 500ms, visibility 500ms";
}

function showHamburger() {
	var el = document.getElementById("menu");
	el.style.opacity = "1";
	el.style.visibility = "visible";
	el.style.transition = "opacity 500ms, visibility 500ms";
}