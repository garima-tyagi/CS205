object Q1 {
def main(args:Array[String]) {
	
	print("Enter a number")
	// takes input from the user and stores it in a variable called input
	var input=readInt()
	// Calls the function fact with the entered input, and displays the function's result 
	println( "Factorial is: " + fact(input) );
}
// This is the defination of the function to calculate factorial	
def fact(n: Int): Int ={
if (n==0) 1
else n*fact(n-1)
}	
}
