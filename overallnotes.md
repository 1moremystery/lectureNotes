
When is an argument considered valid?
    if every time all the premises are true, then the conclusion
    is also true

When is an argument invalid?
    if I can find a truth assigment where all premises are true,
    but the conclusion is NOT true

What is satisfiability? 
    true at least once

How to prove propositional logic statements are 
NOT equivalent?
    find one truth assignment where the outputs are different

    
if nothing else works do Proof by contradiction, especially if theres negation

SOUNDNESS: everything that is provable is actually true

COMPLETENESS: everything that is true is provable

===

```
SubProof(\n
            Assume( P ),
            ...
            Q
        )
ImplyI: -----------
          (P → Q)  by ImplyI(Subproof Line Number)
```
```
SubProof(
            Assume( P ),
          ... F
        )
NegI: ------------------
              (¬P) by NegI(Subproof Line Number)
```
negation-elimination
a ( p  ) by Justification,
b ( ¬p ) by Justification,
c ( F  ) by NegE( w/o neg, w/ neg)
F here means contradiction

```
        SubProof(
            Assume(¬P),
            ...
            F
        )
PbC:  -------------------
          P
```

===

# Predicate logic 

∈ exists in
∉ doesnt exist in

ℕ: natural numbers
    1, 2, 3, 4, ...
ℤ: All integers (negative and positive integers)

ℚ: Rational numbers
    p/q where q != 0, p & q ∈ ℤ

ℝ: real numbers

ℂ: Complex numbers

∅: null set

⋂ intersection // Only Elements in Both
⋃ union // Elements off both sets

⊆ strict subset
⊂ subset

∀ - universal quantifier  // "For All"
∃ - existential quantifier // "There exists"