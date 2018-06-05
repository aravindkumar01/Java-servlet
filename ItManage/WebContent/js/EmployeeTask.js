/**
 * 
 */
	$(document).ready(
			function() {
	

				
				        var p=0;
				        var tid=0;
			 			$.post("PassId?id="+sessionStorage.getItem("id"),async=true, function(result) {
			 					//debugger;
			 					//console.log(result)	;

			 					$.each(result, function(key, value) {
			 						//console.log( key + ": " + value );
			 						if (key == "Records") {
			 							$.each(value, function(i, j) {
			 								
			 								$("#tname").text(j.t_name);
			 							     $("#tid").text(j.t_id);
			 								 $("#addname").text(j.create);
			 							     $("#status").text(j.status);
			 							     $("#date").text(j.date);
			 							     $("#des").text(j.t_des);
                                             $("#pname").text(j.p_name);
			 							     $("#assignee").text(j.assignee);
			 							     p=j.pro_id;
			 						         tid=j.t_id;	   
			 						 	});
			 						}
			 					});
			 					


					 			   $.get("GetUpdateTask",function(result){
					 					//debugger;
					 				//console.log(result)	;
					 				$.each(result,function( key,value ) {
					 						 //console.log( key + ": " + value );
					 						 if(key=="Records"){
									 	
					 							 //var n=1;
					 						  $.each(value,function( i,j ) {
					 				  		 //console.log( i + ": " + j.div_name );
					 				  		 if(j.pro_id==p && j.t_id==tid)
					 				  			 {
					 				  
					 				  		  //alert(p);
 				  			                 // alert(j.histroy);
		    $( "#new" ).append('<br><label  style="color: #000000 ;">'+j.histroy +' <label  style="color:#4B0082;"> updated on </label><label style="color:#1E90FF;">  '+j.time+'</label></label><br>');

					 				  			 }
					 						  });
					 						     } 
					 						  });
					 				});

 
					 			  
					 			  
					 			  
					 			  
			 					
			 					
			 				});

                              
			 			 		
			 			 $("#edit").button().click(function(){
			 					var id= $("#tid").text();
			 				// alert(id);
			 				sessionStorage.setItem("id",id);
			 				window.location.href="empUpdateTask.html";


			 				 
			 		    });   	
			 			 		
			
			});
