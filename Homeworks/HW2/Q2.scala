object Q2 {
def main(args:Array[String]) {
	
	// Calls the function split with a list, and displays the function's result 
	println( "Lists are: " + Split(List(1,4,5,2,7)))
}
// This is the defination of the function to split the list into two halves	
def Split(List1: List[Int]): (List[Int], List[Int] )={
	 
	List1 match{
		case Nil => (Nil, Nil)
		case hd::Nil => (List1,Nil)
		case hd::rest => {
			var(first, sec)= Split((List1.init).drop(1)); //Calling split recursively on the list wothout the first and the last element
			if (List1==List1.head::List1.last::Nil) (List(List1.head), List(List1.last))
			else (hd::first, rest.last::sec)
			
			}
}
}
}
