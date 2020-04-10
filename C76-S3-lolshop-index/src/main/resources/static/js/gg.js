window.onload = function(){

	var images = $('#img a');
	var pos = 0;
	var len = images.length;
	
	for(var i=0;i<len;i++){
		if(i != 0){
			images[i].style.display = 'none';
		}
	}
	
	setInterval(function() {

				images[pos].style.display = 'none';
				pos = ++pos == len ? 0 : pos;
				images[pos].style.display = 'inline';

			}, 5000);
	closead = function() {
		document.getElementById("ShowAD").style.display = 'none';
	}

};