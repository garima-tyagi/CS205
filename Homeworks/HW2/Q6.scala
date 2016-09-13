object Q6 {
def main(args: Array[String]) {
println ("Sorted List is: " + quickSort(List(2,3,1,7,4)))
}
// Function Definition
	
def quickSort(List1: List[Int]): List[Int]={
	List1 match {
		case hd::rest => (quickSort(pivotSort(List1.init,List1.last)))
		case _ => List1
	}
}
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
