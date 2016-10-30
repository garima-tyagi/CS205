class Queue[T]{
	var Lst: List[Any]=Nil
	
	def equals(that: Queue[T]): Boolean={
		(this.Lst, that.Lst) match{
			
			case (Nil, Nil) => true
			case (hd1::rest1, hd2::rest2) => (hd1.equals(hd2)) && (rest1.equals(rest2))
			case _ => false
		}
	}

	override def hashCode(): Int={
             var hash: Int=0                                   
             this.Lst.foreach{
				 hash+=_.hashCode()
		}
		 return hash
	}
	
	def enqueue(b:Any){

		Lst=b::Lst
		println(Lst)
	}
	
	
	def dequeue(){

		Lst match{
			case Nil=> println("No element to remove")
			case _=> Lst=Lst.init	
		}
		println(Lst)
	}
	}


object Q{
	def main(args: Array[String]):Unit={
		var a= new Queue()
		
		a.enqueue(5)
		a.enqueue(6)
		a.dequeue()
	}
	}
