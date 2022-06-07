 $(document).ready(function() {
 
	 $("#forminfo").submit(function(){
		
		 var dados = jQuery( this ).serialize();
		 
		$.ajax({
			url: 'controllers/response.php',
			cache: false,
			data: dados,
			type: "POST",  

			success: function(msg){
				
				$("#results").empty();
				$("#results").append(msg);
			}
			
		});
		 
		 return false;
	 });
 
 });