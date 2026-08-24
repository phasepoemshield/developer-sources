package kotlin.contracts

import kotlin.enums.EnumEntries
import kotlin.internal.ContractsDsl

// $VF: Compiled from ContractBuilder.kt
@ContractsDsl
@SinceKotlin(version = "1.3")
@ExperimentalContracts
public enum class InvocationKind {
   @ContractsDsl
   AT_LEAST_ONCE,
   @ContractsDsl
   AT_MOST_ONCE,
   @ContractsDsl
   EXACTLY_ONCE,
   @ContractsDsl
   UNKNOWN;

   @JvmStatic
   fun getEntries(): EnumEntries<InvocationKind> {
      $ENTRIES
   }
}
