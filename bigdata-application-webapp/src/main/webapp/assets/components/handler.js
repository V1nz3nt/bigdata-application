var $dataTable = {};

$(document).ready(function() {
	
	// https://datatables.net/manual/data/
	// https://datatables.net/manual/server-side
	// https://datatables.net/manual/data/renderers
	
	initializeDataTable();
	addRowClickListener();
} );

function initializeDataTable(){
	$dataTable = $('#container').DataTable({
		"serverSide" : false,
		"ajax": {"url" : "/bigdata-application-webapp/rest/all"},
		"columns" : [
			{"data" : "firstName"},
			{"data" : "lastName"},
			{"data" : "dateBirth"},
			{"data" : "address"}
		]
	});
	console.log("Initalizing DataTable");
}

function addRowClickListener(){
	$('#container tbody').on('click', 'tr', function () {
        var data = $dataTable.row( this ).data();
        console.log(data);
        alert( 'You clicked on '+ data.id +'\'s row' );
    } );
	console.log("Added DataTable row clickListener");
}

function deleteRow(){
	('#button').click( function () {
        table.row('.selected').remove().draw( "full-hold" );
    } );
}