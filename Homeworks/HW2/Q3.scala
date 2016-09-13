object Q3 {
def main(args: Array[String]) {
// Calls the function with a list and an integer to be inserted
println ("Sorted List is: " + sortInsert(List(1,2,3,5),4))
}
// Function Definition
def sortInsert(List1: List[Int], I: Int): List[Int]= {
	List1 match {
		case Nil => (I::List1)
		case hd::Nil => {
			if (hd> I) (I::hd::Nil)
			else (hd::I::Nil)
		}
		case hd::rest => {
			if (hd> I) (I::hd::rest)
			else (hd::sortInsert(rest, I))//Calling sortInsert recursively on the rest of the list
			}
			}
			}
}

			
