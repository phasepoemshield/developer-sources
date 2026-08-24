@file:JvmMultifileClass
@file:JvmName("NumbersKt")

package kotlin

import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext
import kotlin.internal.InlineOnly

// $VF: Compiled from BigIntegers.kt
@InlineOnly
@SinceKotlin(version = "1.2")
public inline fun BigInteger.toBigDecimal(scale: Int = 0, mathContext: MathContext = MathContext.UNLIMITED): BigDecimal {
   return BigDecimal(`$this$toBigDecimal`, scale, mathContext)
}

@InlineOnly
public inline operator fun BigInteger.unaryMinus(): BigInteger {
   val var10000: BigInteger = `$this$unaryMinus`.negate()
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline infix fun BigInteger.shr(n: Int): BigInteger {
   val var10000: BigInteger = `$this$shr`.shiftRight(n)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline infix fun BigInteger.xor(other: BigInteger): BigInteger {
   val var10000: BigInteger = `$this$xor`.xor(other)
   return var10000
}

@SinceKotlin(version = "1.2")
@InlineOnly
public inline fun Long.toBigInteger(): BigInteger {
   val var10000: BigInteger = BigInteger.valueOf(`$this$toBigInteger`)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline infix fun BigInteger.or(other: BigInteger): BigInteger {
   val var10000: BigInteger = `$this$or`.or(other)
   return var10000
}

@InlineOnly
public inline operator fun BigInteger.plus(other: BigInteger): BigInteger {
   val var10000: BigInteger = `$this$plus`.add(other)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline fun Int.toBigInteger(): BigInteger {
   val var10000: BigInteger = BigInteger.valueOf((long)`$this$toBigInteger`)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.1")
public inline operator fun BigInteger.rem(other: BigInteger): BigInteger {
   val var10000: BigInteger = `$this$rem`.remainder(other)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline infix fun BigInteger.shl(n: Int): BigInteger {
   val var10000: BigInteger = `$this$shl`.shiftLeft(n)
   return var10000
}

@SinceKotlin(version = "1.2")
@InlineOnly
public inline infix fun BigInteger.and(other: BigInteger): BigInteger {
   val var10000: BigInteger = `$this$and`.and(other)
   return var10000
}

open fun NumbersKt__BigIntegersKt() {
}

@SinceKotlin(version = "1.2")
@InlineOnly
public inline operator fun BigInteger.inc(): BigInteger {
   val var10000: BigInteger = `$this$inc`.add(BigInteger.ONE)
   return var10000
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline operator fun BigInteger.dec(): BigInteger {
   val var10000: BigInteger = `$this$dec`.subtract(BigInteger.ONE)
   return var10000
}

@InlineOnly
public inline operator fun BigInteger.times(other: BigInteger): BigInteger {
   val var10000: BigInteger = `$this$times`.multiply(other)
   return var10000
}

@InlineOnly
public inline operator fun BigInteger.minus(other: BigInteger): BigInteger {
   val var10000: BigInteger = `$this$minus`.subtract(other)
   return var10000
}

@SinceKotlin(version = "1.2")
@InlineOnly
public inline fun BigInteger.toBigDecimal(): BigDecimal {
   return BigDecimal(`$this$toBigDecimal`)
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline fun BigInteger.inv(): BigInteger {
   val var10000: BigInteger = `$this$inv`.not()
   return var10000
}

@InlineOnly
public inline operator fun BigInteger.div(other: BigInteger): BigInteger {
   val var10000: BigInteger = `$this$div`.divide(other)
   return var10000
}
