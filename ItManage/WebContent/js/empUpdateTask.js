/**
 * 
 */

$(document).ready(
		function() {
			   
			
		     			   
		 			$.post("PassId?id="+sessionStorage.getItem("id"),async=true, function(result) {
		 					//debugger;
		 					//console.log(result)	;

		 					$.each(result, function(key, value) {
		 						console.log( key + ": " + value );
		 						if (key == "Records") {
		 							$.each(value, function(i, j) {
		 							   // alert(j.date);
		 								$("#tname").val(j.t_name);
		 							     
		 							   $("#pname").val(j.p_name);
		 							   $("#des").val(j.t_des);
		 							   $("#status").val(j.status);
		 							   $("#assignee").val(j.assignee);
		 							    $("#sdate").val(j.date);
		 							    $("#ddate").val(j.ddate);
		 							    $("#tid").val(j.t_id);
		 							
		 							});
		 						}
		 					});
		 				});

		
		
		});
