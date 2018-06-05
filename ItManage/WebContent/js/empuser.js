/**
 * 
 */

	$(document).ready(
			function() {
				
				//var role=${role};
				//
				   
			$.get("GetProjectNames", function(result) {
					//debugger;
					//console.log(result)	;

					$.each(result, function(key, value) {
						//console.log( key + ": " + value );
						if (key == "Records") {
							$.each(value, function(i, j) {
								//alert(j.p_name);
								//console.log( i + ": " + j.div_name );
								 $("#selectpro").append(
									        $('<option value='+j.p_name+'>'+j.p_name+'</option>')
									    );	
							});
						}
					});
				});

				$("#selectpro").on(
						'change',
						
						
						function() {
							$("#td").empty();
							 
							var pName = $( "#selectpro option:selected" ).text();;
							// alert(pName);
							$.get("GetTaskNames", async = true,
									function(result) {
										//debugger;
										//console.log(result)	;
										$.each(result, function(key, value) {
											//console.log( key + ": " + value );
											if (key == "Records") {
												$.each(value, function(i, j) {
													//console.log( i + ": " + j.div_name );
													
													if(pName==j.p_name && pName!="Select")
														{
														//alert(name);
													var row = '<tr>' + '<td value="'+j.t_id+'">'
															+ j.t_id + '</td>'
															+ '<td>'+j.t_name+'</td>'
															+'<td>' + j.status
															+ '</td>' + '<td><a id="employeelink_'+j.t_id+'" onclick="datachange('+j.t_id+')">'
															+ j.p_name+'</a></td>'
															+ '</a></td>' + '<td>'
															+ j.assignee
															+ '</td>' + '<td>'
															+ j.date + '</td>'
															+ '<td>' + j.create
															+ '</td>' +

															'</tr>';
															
													//console.log(row)
													$("#td").append(row);
												}
													
												});
											}

										});
										$('#example').DataTable();
									});

						});
				/* var table = $('#example').DataTable();
				$('#example tbody').on( 'click', 'tr', function () {
			        var data = table.row( $(this).parents('tr') ).data();
			        alert( data[1]);
			    } ); */
			});
	function datachange(id)
	{
		sessionStorage.setItem("id",id);
		
		$("#employeelink_"+id).attr("href","EmployeeTask.html");
	    			
	}
