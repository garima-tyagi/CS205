object Q7 {
def main (args: Array[String]) {
println ("Result is" + fastPower(1,2))
}

def fastPower(X: Int, N: Int) : Int = { 
	var res= fastPower(X, N/2)
	var oddRes= fastPower(X, (N-1)/2)
	N match{
		case 0 => 1
		case n if (n%2==0) => res*res
		case _ => X*oddRes*oddRes

}
}	
}