import org.specs._

class primeFactorsSpec extends Specification {
  "should generate empty list for 1" in {
    primeFactors.generate(1) must be equalTo(List[Int]())
  }
  "should generate a list with 2 in it for 2" in {
    primeFactors.generate(2) must be equalTo(List[Int](2))
  }
  "should generate list with 3 in it for 3" in {
        primeFactors.generate(3) must be equalTo(List[Int](3))
  }
  "should generate a list with 2 and 2 in it for 4" in {
    primeFactors.generate(4) must be equalTo(List[Int](2,2))
  }
  "should generate a list with 2 and 3 in it for 6" in {
    primeFactors.generate(6) must be equalTo(List[Int](2,3))
  }

  "should generate list with three 2s for 8" in {
    primeFactors.generate(8) must be equalTo(List[Int](2,2,2))
  }
  "should generate list with two 3s for 9" in {
    primeFactors.generate(9) must be equalTo(List[Int](3,3))
  }
}
