package kotlin.contracts

import kotlin.internal.ContractsDsl

// $VF: Compiled from ContractBuilder.kt
@ExperimentalContracts
@SinceKotlin(version = "1.3")
@ContractsDsl
public interface ContractBuilder {
   @ContractsDsl
   public abstract fun <R> callsInPlace(lambda: () -> Any, kind: InvocationKind = ...): CallsInPlace {
   }

   @ContractsDsl
   public abstract fun returns(): Returns {
   }

   @ContractsDsl
   public abstract fun returnsNotNull(): ReturnsNotNull {
   }

   @ContractsDsl
   public abstract fun returns(value: Any?): Returns {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from ContractBuilder.kt
   internal class DefaultImpls
}
