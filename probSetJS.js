


function printReverse(arr) {
	
	var length = arr.length;
	//console.log(length);
	while (length >=0 ){
		console.log(arr[length--]);	
	}
}



function isUniform(arr){
	var length = arr.length;
	var i = 0;
	while (i < length-1){
		//console.log(i, i+1);
		if(arr[i] !== arr[i+1] )
		{		
			return false;
		}
		i++;
	}
	return true;
}


function sum(arr){//all integers
	//var length = arr.length;
	var sum = 0;
	arr.forEach(function toAdd(value){
		sum += value;
	})

	return sum;
}

function max(arr){ //all integers
	var highest;
	var length = arr.length;
	var i = 0;

	while (i < length) {
		if(i === 0){
			highest = arr[i] > arr[i+1] ? arr[i] : arr[i+1];
		}
		else{
			highest = arr[i] > highest ? arr[i] : highest;
		}
		i++;
	}
	return highest;
}

var array1 = ['1',2, 3, '4', "MyGod"];
var test2 = [11,1,1,1,1];
var test3 = [1,1,1,1,'1'];
var test4 = [1,1,1,1,1];
var test5 = [1,10,2,1,100,32,67];

//printReverse(array1); 
/*isUniform(test2);
isUniform(test3);
isUniform(test4);
sum(test3);*/
max(test5);