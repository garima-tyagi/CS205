object Q2 {
def main(args: Array[String]) {
println ("New Lists are: " + split(List(1,2,3,5,7,9)))
}

	def split(lst:List[Int]): (List[Int],List[Int])={
		var i=0
		var m=0
		var lst1= List[Int]()
		var lst2= List[Int]()
		val stack=new scala.collection.mutable.Stack[Int]
	
		while(i<lst.length){
			stack.push(lst(i))
			i+=1
		}

		while(m<=(lst.length-1)/2){
			lst1=stack.pop::lst1
			m+=1
		}
	
		while(m<lst.length){
			lst2=stack.pop::lst2
			m+=1
		}
		(lst2, lst1)
	}
}
			
