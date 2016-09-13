object Q4 {
def main(args: Array[String]) {
// Calls the function InsertionSort with an unsorted list
println ("Sorted List is: " + insertionSort(List(2,3,1,5,4)))
}
// Function Definition
//After call from insertionSort
def sortInsert(List1: List[Int], I: Int): List[Int]= {
	List1 match {
		case Nil => (I::List1)
		case hd::Nil => {
			if (hd> I) (I::hd::Nil)
			else (hd::I::Nil)
		}
		case hd::rest => {
			if (hd> I) (I::hd::rest)
			else (hd::sortInsert(rest, I))
			}
			}
}
//After the call from main
def insertionSort(List1: List[Int]): List[Int]= {
List1 match{	
case hd::rest => sortInsert(insertionSort(rest), hd)//Sort the list recursively
case _ => List1
}
}
}
