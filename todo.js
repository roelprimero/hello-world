/*var array1 = ['a', 'b', 'c'];

array1.forEach(function(element) {
  console.log(element);
});

function logArrayElements(element, index, array) {
  console.log('a[' + index + '] = ' + element);
}

*/



console.log("Connected");

var TodoArray = [];
var input = prompt("What do you want to do?");
var task;


function MyPrint(){
	///.log(TodoAray);
	console.log("======================");
	TodoArray.forEach(function element(value, index) {
		console.log("[" + index +  "] " + value);
	})
	console.log("======================");
}

function MyDelete(taskIndex){
	console.log("Deleting the [" + task + " ]task")
	TodoArray.splice(taskIndex, 1);
	console.log("New To do list is: ");
	MyPrint();
}

while (input !== "exit"){

	if(input === "new"){
		task = prompt("What task would you like to do?");
		TodoArray.push(task);
	} else if(input === "list"){
		MyPrint();
	} else if(input === "delete") {
		var taskIndex = prompt("What task would you like to delete? Enter number");
		MyDelete(taskIndex);
	  
	} else {

	}

	input = prompt("What do you want to do?");
}