object Q5 {
def main(args: Array[String]) {
// Calls the function with a list and an integer to be inserted
println ("Sorted List is after adding the element is: " + pivotSort(List(2,3,1,7,4),5))
}
// Function Definition
	
def pivotSort(List1: List[Int], I: Int): List[Int]= {
	var List2=insertionSort(List(2,3,1,7,4))
	sortInsert(List2, I)
}
	
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
def insertionSort(List1: List[Int]): List[Int]= {
List1 match{	
case hd::rest => sortInsert(insertionSort(rest), hd)
case _ => List1
}
}
}
