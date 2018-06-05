$(document).ready(function(){
	 
    $("#it").hide();
    $("#itDepart").hide();

	 

/* Get Divition Names */			
		$.get("GetDivi",function(result){
			//debugger;
		//console.log(result)	;
		$.each(result,function( key,value ) {
				 //console.log( key + ": " + value );
				 if(key=="Records"){
				  $.each(value,function( i,j ) {
		  		 //console.log( i + ": " + j.div_name );
					  $("#division").append(
						        $('<option value='+j.div_name+'>'+j.div_name+'</option>')
						    );	 
					  });
				     } 
				  });
		});
	 	
	 	
/* Get Department names by slect dep */
		 $("#division").on('change',function(){
			 $("#it").show();

			 $("#team").empty();
			 $("#team").append(
				        $('<option value="select">Select</option>'),
				        $('<option value="add">Add</option>')
						   
				    );
			
		     $("#department").empty();
			  $("#department").append(
					  $('<option value="select">Select</option>'),						    
				        $('<option value="add">Add</option>')
				    );
		      var name=this.value;
		      //alert(name);
		      if(name=="add")
		    	  {
		    	  myFunction(" ","division");
		    		 
		    	  }	       
		       $.get("GetDepNames",function(result){
					 //debugger;
				     //console.log(result)	;
					$.each(result,function( key,value ) {
							 //console.log( key + ": " + value );
							 if(key=="Records"){
							  $.each(value,function( i,dep ) {
					  		 //console.log( i + ": " + j.dep_name );
					  		 if(name==dep.div_name)
					  	      {		 
								  $("#department").append(
									        $('<option value='+dep.name+'>'+dep.name+'</option>')
									    );
							  }

					   });								
						 }							
             		});
		      });                                 				  
		  });
	  
	/* Get Team Names for select to DepartmentName	 */
	
	   $("#department").on('change',function(){
			 $("#itDepart").show();
		       
			 $("#team").empty();
			  $("#team").append(
				        $('<option value="select">Select</option>'),
				        $('<option value="add">Add</option>')
						   
				    );
			  var name=this.value;
			 // alert(name);
			  if(name=="add")
	    	  {
				  var div=$("#division option:selected").val();
				  myFunction(div,"department");
	    	    	
	    	  }	       
	    
			  
			  
			  
			 // alert(name);
			  
			  $.get("GetTeamNames",function(result){
					// debugger;
				console.log(result)	;
					$.each(result,function( key,value ) {
							 //console.log( key + ": " + value );
							 if(key=="Records"){
							  $.each(value,function( i,team ) {
					  		 //console.log( i + ": " + j.dep_name );
					  		 if(name==team.dep_name)
					  	      {		 
								  $("#team").append(
									        $('<option value='+team.team_name+'>'+team.team_name+'</option>')
									    );
							  }

					   });								
						 }							

				});
		   });                                 				  
			  
			  
		  });
	  
			 
	   $("#team").on('change',function(){
	   
	   var name=this.value;
	  // alert(name);
	   if(name=="add")
			   {
		   var div=$("#department option:selected").val();
		//  alert(div);
		       myFunction(div,"team");
		      
			   }
	   
	   
	   }); 
		 
	  
 
                   
});

/* end jquery */


function myFunction(pass,check) {

//var name = prompt("Please enter your '"+check+"' name:", "");

var name=swal({
	  title: "Name!",
	  text: "Write "+check+" name:",
	  type: "input",
	  showCancelButton: true,
	  closeOnConfirm: false,
	  inputPlaceholder: "Write something"
	}, function (inputValue) {
	  if (inputValue === false) return false;
	  if (inputValue === "") {
	    swal.showInputError("You need to write "+check+" name!");
	    return false
	  }
	  swal("Nice!", "You create: " + inputValue, "success");
	 
	  //alert(inputValue);
	  passSer(inputValue,check,pass);

//      window.location.href = "admin.html";
   
      
	} );


/*
if (name == null || name == "") {
   alert("Enter the name");
} else {
   alert("done");
   passSer(name,check,pass);
}
*/

}
function passSer(name,check,pass)
{	
	//alert(name);
	//alert(check);
//	/alert(pass);
	$.ajax({
	    url: 'AddDivition',
	   
	    data:{name:""+name+"",check:""+check+"",pass:""+pass+""}
	
	    ,type: 'POST'

	
}); 
//$("division").refresh();

	

	window.location.href = "admin.html";


	
}

