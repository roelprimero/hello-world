function isEven(number){

	if( (number%2) === 0)
	{
		alert(Number + "is Even");
		return true;
	} else {
		alert(Number + "is Odd");
		return false;
	}
}

function myFactorial(number2){

	var temp = number2;
	var temp2 = number2;
	var answer;

	
	while (temp-- > 1) //4 3 2 1
	{  
		console.log(temp);
		answer = temp2 * temp; //20
		temp2 = answer;
		console.log(temp2);
	}

	alert ("factorial of " + number2 + " is " + temp2);
	console.log("factorial of " + number2 + " is " + temp2);
	return temp2;
}



isEven(2);
isEven(3);
myFactorial(5);
myFactorial(4);
myFactorial(10); 

5   *  4 = 20
20  *  3 = 60
60  *  2 = 120
120 *  1 = 120