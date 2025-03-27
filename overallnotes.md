Exam grades in Canvas
- drops lowest among Exam 1, Exam 2, Exam 3,\n
    *midterm equivalent from final*


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

---

# Propositional Logic

```
SubProof(
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

---

# Predicate logic 

Argument is VALID: regardless of domain,
    whenever all the premises are true,
    then the conclusion is also true

Argument is INVALID: we can find a domain where
    all the premises are true but the conclusion is false

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

---

⋂ intersection // Only Elements in Both

⋃ union // Elements of both sets

⊆ subset (allowing equality)

⊂ subset

∀ - universal quantifier  // "For All"

∃ - existential quantifier // "There exists"

## Rules
### All Elimination
```
           ∀ ((x: T) => P(x))
AllE[T]:  ---------------------
                   P(v)


//// Syntax //// 
(
    ∀ ((x: T) => Human(x))
)
⊢
( Human(Socrates) )

Proof(
    1 ( ∀ ((x: T) => Human(x)) )    by Premise,
    2 Human(Socrates)               by AllE[T](1) (would only work if Socrates is in domain)
)
```
### All Introduction
```
            Let (   (a: T) => SubProof(
                ...
                P(a)
            )),
AllI[T] : -------------------------------
                 ∀ ((x: T) => P(x))


//"a" is an unused, "fresh" individual

//// Syntax ////
4 Let ( (a: T) => SubProof(
    ...
    P(a)
)),
10 ( ∀ ((x: T) => P(x)) ) by AllI[T](4)
```
### Exists Introduction
```
                  P(v)
ExistsI[T]: ---------------------
              ∃ ((x: T) => P(x) )

//v is some individual of type T

//// Syntax ////
( Human(Socrates) ) ⊢ ( ∃ ((x: T) => Human(x) ))
Proof(
    1 ( Human(Socrates) ) by Premise,
    2 ( ∃ ((x: T) => Human(x)) )  by ExistsI[T](1)
)

(assume "Socrates" was a parameter of type T)

```
### Exists Elimination
```
Let ((a: T) => SubProof(
        Assume( P(a) ),
        ∃((x: T) => P(x))       ...
        Q
    )),
ExistsE[T]: ----------------------------------------------------
                     Q

"a" is our alias for the x where P(x) held
"a" needs to be a "fresh" name (unused before)
Q CANNOT include anything about "a"



Syntax:

1 ( ∃((x: T) => P(x)) )         by Justification,
2 Let ((a: T) => SubProof(
    3 Assume ( P(a) ),
    ...
    4 ( Q )                     by Justification
)),
5 ( Q )                         by ExistsE[T](1, 2)
```

# Mathematical Induction
