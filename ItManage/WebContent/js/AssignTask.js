/**
 * 
 */
$(document).ready(function(){
	   $("#sProject").on('change',function(){
		   
			 $("#sTask").empty();
			  $("#sTask").append(
				        $('<option value="select">Select</option>')
				          
				    );
			  var name=this.value;
			  $.get("GetTaskNames",function(result){
					// debugger;
				//console.log(result)	;
					$.each(result,function( key,value ) {
							 //console.log( key + ": " + value );
							 if(key=="Records"){
							  $.each(value,function( i,task ) {
					  		 //console.log( i + ": " + j.dep_name );
					  		 if(name==task.p_name)
					  	      {		 
								  $("#sTask").append(
									        $('<option value='+task.t_name+'>'+task.t_name+'</option>')
									    );
							  }

					   });								
						 }							

				});
		   });                                 				  
			  
			  
		  });


	   
   
	});
