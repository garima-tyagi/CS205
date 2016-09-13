object q5 {
def main(args: Array[String]) {
// Calls the function with a list and an integer to be inserted
println ("Sorted List is: " + pivotSort(List(2,3,1,7,4,5),6))
}
// Function Definition
	
def pivotSort(List1: List[Int], I: Int): List[Int]= {
	List1 match {
		case Nil => (I::List1)
		case hd::Nil => {
			if (hd> I) (I::hd::Nil)
			else (hd::I::Nil)
		}
		case hd::rest => {
			if (hd> I) (pivotSort(rest, I):::List(hd))
			else (hd::pivotSort(rest, I))
			}
			}
}
}
