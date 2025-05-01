// #Sireum #Logika

import org.sireum._

//set all elements to 10
def all10(nums: ZS): Unit = {
  //function contract?
  Contract(
    //don't need to require anything
    Modifies(nums),
    Ensures(
      ∀(0 until nums.size)(k => nums(k) == In(nums)(k) + 10)
    )
  )

  var i: Z = 0
  while (i < nums.size) {
    //loop invariant block?
    Invariant(
      Modifies(i,nums),
      i >= 0,
      i <= nums.size, //bound the size and 
      nums.size == In(nums).size, //size doesnt change
      ∀(0 until i)(k => nums(k) == In(nums)(k) + 10),
      ∀(i until nums.size)(k => nums(k) == In(nums)(k)),
    )

    nums(i) = nums(i) + 10
    i = i + 1
  }
}

///////////////////////////

var test: ZS = ZS(4,1,3,8,10,2)

all10(test)

//what do we want to assert?
assert(test == ZS(14,11,13,18,20,12))