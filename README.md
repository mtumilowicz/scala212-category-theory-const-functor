# scala212-category-theory-const-functor

_Reference_: https://bartoszmilewski.com/2015/01/20/functors/

# preview
Referring my other github project could be useful 
(basic info concerning functors):
* https://github.com/mtumilowicz/java11-category-theory-optional-is-not-functor

When we think about functors we are not at all concerned 
about accessing the values - it's completely outside of 
the formal scope of the functor. Functors are all about
being able to transforming underlying values with functions.

* if there is possibility to access the values - we will
see the transformed result
* if we cannot access them - all we care is that the 
manipulations compose correctly and does not change
anything when composed with identity

Meaningful example of a functor that does not provide us
with an access to underlying values is a `Const` functor
that completely ignores its second argument:

* `data Const c a = Const c`
* `fmap :: (a -> b) -> Const c a -> Const c b`
    
**The `Const` data type can be thought of similarly to the const function, 
but as a data type.**

# project description
We will provide simple implementation of `Const` functor in Scala:
```
final case class Const[C, A](param: A) {
  def map[B](f: A => B): Const[C, B] = this.asInstanceOf[Const[C, B]]
}
```

Note that we provide the simplest implementation that there could be,
follow https://github.com/typelevel/cats/blob/master/core/src/main/scala/cats/data/Const.scala
to see much more sophisticated solution.