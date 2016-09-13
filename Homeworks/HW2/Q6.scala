object Q6 {
def main(args: Array[String]) {
// Calls the function with an unsorted list
	println ("Sorted List is after adding the element is: " + quickSort(List(2,3,1,7,4)))
}
// Function Definition
	
def quickSort(List1: List[Int]): List[Int]= {
List1 match{	
case hd::rest => pivotSort(quickSort(rest), hd)
case _ => List1
}
}

//Uses pivotSort to sort the list
def pivotSort(List1: List[Int], I: Int): List[Int]= {
	List1 match {
		case Nil => (I::List1)
		case hd::Nil => {
			if (hd> I) (I::hd::Nil)
			else (hd::I::Nil)
		}
		case hd::rest => {
			if (hd> I) (I::hd::rest)
			else (hd::pivotSort(rest, I))
			}
			}
}
}

