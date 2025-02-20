// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

@pure def not5(p: B, q: B, r: B): Unit = {
  Deduce(
    ( !(!p | !q) ) |- ( p & q )
      Proof(
        1 (  !(!p | !q) ) by Premise,
        // prove p
        2 SubProof( //PbC for p
          3 Assume(!p),
          4 (!p | !q) by OrI1(3),
          5 ( F ) by NegE(4,1)
        ),
        6 (p) by PbC(2),

        //prove q
        7 SubProof(
          8 Assume(!q),
          9 (!p | !q) by OrI2(8),
          10 (F) by NegE(9,1)
        ),
        11 (q) by PbC(7),
        //andI p & q
        12 (p & q) by AndI(6,11)
    )
  )
}