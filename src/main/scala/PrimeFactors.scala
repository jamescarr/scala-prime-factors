object primeFactors{
  def generate(n:Int) = {
    var x = n    
    var factors = List[Int]()
    if(x > 1){
      for(i <- 2 to n){
        while(x % i == 0 && x/i > 1){
          factors += i
          x/=i
        }
      }
     factors += x
    }
    factors
  }
}
