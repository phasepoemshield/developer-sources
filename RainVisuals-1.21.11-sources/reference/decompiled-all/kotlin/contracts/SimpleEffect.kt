package kotlin.contracts

import kotlin.internal.ContractsDsl

// $VF: Compiled from Effect.kt
@ExperimentalContracts
@ContractsDsl
@SinceKotlin(version = "1.3")
public interface SimpleEffect : Effect {
   @ExperimentalContracts
   @ContractsDsl
   public abstract infix fun implies(booleanExpression: Boolean): ConditionalEffect {
   }
}
