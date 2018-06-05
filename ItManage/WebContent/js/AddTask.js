/**
 * 
 */
$(document).ready(function(){

	
	
	
	$.get("GetProjectNames",function(result){
		//debugger;
	//console.log(result)	;
	$.each(result,function( key,value ) {
			 //console.log( key + ": " + value );
			 if(key=="Records"){
			  $.each(value,function( i,j ) {
	  		 //console.log( i + ": " + j.div_name );
				  $("#sProject").append(
					        $('<option value='+j.p_id+'>'+j.p_name+'</option>')
					    );	 
				  });
			     } 
			  });
	});
	
	 $("#sProject").on('change',function(){
		 
		 var id=this.value;
       //		 var pname=$("#sProject option:selected").text();
		// alert(id);
	   // alert(pname);

			$.get("GetProjectEmpDetails",function(result){
				//debugger;
			//console.log(result)	;
			$("#assignEmp").empty();
			$("#assignEmp").append( $('<option value="Select">Select</option>'))
			$.each(result,function( key,value ) {
					 //console.log( key + ": " + value );
					 if(key=="Records"){
					  $.each(value,function( i,j ) {
			  		 //console.log( i + ": " + j.div_name );
			  		 // alert(id);
			  		  //alert(j.p_id);
                  	  if(id==j.p_id)
			  			 {
			  			  $("#assignEmp").append(
							        $('<option value='+j.emp_fname+'>'+j.emp_fname+'</option>')
							    );	
			  			 }
						  });
					     } 
					  });
			});
			 
		 
/*
			 $.ajax({
				    url: 'AddTask',
				   
				    data:{projectname:""+pname+""}
				
				    ,type: 'POST'

				
			}); 

			
*/		 
	 });
	 
	 
	 

	
});



