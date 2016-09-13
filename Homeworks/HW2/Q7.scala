object Q7 {
def main (args: Array[String]) {
println ("Result is" + fastPower(2,3))
}

def fastPower(X: Int, N: Int) : Int = { 
	N match{
		case 0 => 1
		case n if (n%2==0) => fastPower(X,N/2)*fastPower(X,N/2)
		case _ => X*fastPower(X, N-1)

}
}	
}
