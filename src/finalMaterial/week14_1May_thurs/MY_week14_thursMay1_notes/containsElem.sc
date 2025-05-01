// #Sireum #Logika

import org.sireum._

//returns whether an element is in a sequence
//returns true/false (B is bool)
//can either write true or T, same with false
def containsElem(nums: ZS, elem: Z): B = {
  Contract(
    Ensures(
      //True means the element is in the list
      Res[B] == true __>: ∃(0 until nums.size)(k => elem == nums(k)),
      //False means the element is not in the list
      Res[B] == false __>: !(∃(0 until nums.size)(k => elem == nums(k))),
    )
  )
  var i: Z = 0
  var found: B = false
  while (i < nums.size) {
    Invariant(
      Modifies(i,found),
      i >= 0,
      i <= nums.size,
      found == true __>: ∃(0 until i)(k => elem == nums(k)),
      found == false __>: !(∃(0 until i)(k => elem == nums(k))),
    )
    if (nums(i) == elem) {
      found = true
    }
    i = i + 1
  }

  return found
}

////////////// Calling code ///////////////////

var test: ZS = ZS(8,1,0,10,9,2,0)
var testFound: B = containsElem(test, 0)

//what should testFound be?
assert(testFound == true)

testFound = containsElem(test, 4)

//what should testFound be?
assert(testFound == false)