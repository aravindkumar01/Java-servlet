$.get("GetProjectNames",function(result){
		//debugger;
	//console.log(result)	;
	$.each(result,function( key,value ) {
			 //console.log( key + ": " + value );
			 if(key=="Records"){
			  $.each(value,function( i,j ) {
	  		 //console.log( i + ": " + j.div_name );
				  $("#sProject").append(
					        $('<option value='+j.p_name+'>'+j.p_name+'</option>')
					    );	 
				  });
			     } 
			  });
	});