$(document).ready(function() {
	debugger;
	$('#employeeList').jtable({
		title : 'Employee Details',
		actions : {
			listAction : 'ViewEmployee?action=list',
			createAction : 'ViewEmployee?action=create',
			updateAction : 'ViewEmployee?action=update',
			deleteAction : 'ViewEmployee?action=delete'
		},
	
		fields : {
			

			emp_id : {
				title : 'Id',
				width : '30%',
				key : true,
				list : true,
				edit : false,
				create : true
			},
			emp_idNum : {
				title : 'Emp Id',
				width : '20%',
				edit : false
				
			},
			emp_fname: {
				title : 'First Name',
				width : '30%',
				edit : true
			},
			emp_lname: {
				title : 'Last Name',
				width : '30%',
				edit : true
			},
			dob : {
				title : 'Date_of_brith',
				width : '30%',
				edit : true
			},
			doj: {
				title : 'Date_of_join',
				width : '30%',
				edit : true
			},
			emp_gender : {
				title : 'Gender',
				width : '30%',
				edit : true
			},
			emp_email: {
				title : 'Email',
				width : '30%',
				edit : true
			},
			emp_role: {
				title : 'Desiganation',
				width : '30%',
				edit : true
			},
			emp_division: {
				title : 'Division',
				width : '30%',
				edit : true
			},
			emp_department: {
				title : 'Department',
				width : '30%',
				edit : true
			},
			emp_team: {
				title : 'Team',
				width : '30%',
				edit : true
			},
			emp_address: {
				title : 'address',
				width : '30%',
				edit : true
			}
			/*emp_uname: {
				title : 'UserName',
				width : '30%',
				edit : true
			},
			emp_pass: {
				title : 'password',
				width : '30%',
				edit : true
			}*/
			
			
		}
	});
	$('#employeeList').jtable('load');
}); 
