// #Sireum #Logika
//@Logika: --manual

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//sum of first n even numbers
def sumEvens(n: Z): Z = {
  //What can we use as the function contract?
  Contract(
    Requires(n >= 0),
    Ensures(Res[Z] == n*(n+1))
  )

  var sum: Z = 0
  var cur: Z = 0

  //premises sum == 0, cur == 0, n >= 0

  while (cur != n) {
    //what about our loop invariant?


    //premise: cur !=n, sum = cur*(cur+1), n >= 0
    cur = cur + 1
    sum = sum + 2*cur
    //need to prove: (sum == cur*(cur+1)) (prove invarient)
  }

  //premises: !(cur!=n), sum == cur*(cur+1), n >= 0

  //need to prove: sum == n*(n+1)
  return sum
}

//////////// test code /////////

val num: Z = 5

//premise: num == 5
//prove num >= 0 (prove precondition)

var sum5evens: Z = sumEvens(num)

//premise: sum5evens == num*(num+1), num == 5
//prove: sum5evens == 30

//sum of first 5 evens: 2 + 4 + 6 + 8 + 10 = 30
assert(sum5evens == 30)