object Q2 {
def main(args:Array[String]) {
	
	// Calls the function fact with the entered input, and displays the function's result 
	println( "Lists are: " + Split(List(1,4,5,2,7)))
}
// This is the defination of the function to calculate factorial	
def Split(List1: List[Int]): (List[Int], List[Int] )={
	 
	List1 match{
		case Nil => (Nil, Nil)
		case hd::Nil => (List1,Nil)
		case hd::rest => {
			var(first, sec)= Split((List1.init).drop(1));
			if (List1==List1.head::List1.last::Nil) (List(List1.head), List(List1.last))
			else (hd::first, rest.last::sec)
			
			}
}
}
}