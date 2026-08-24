@file:JvmName(name = "Boxing")

package kotlin.coroutines.jvm.internal

// $VF: Compiled from boxing.kt
@SinceKotlin(version = "1.3")
@PublishedApi
internal fun boxLong(primitive: Long): java.lang.Long {
   return java.lang.Long(primitive)
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun boxDouble(primitive: Double): java.lang.Double {
   return java.lang.Double(primitive)
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun boxInt(primitive: Int): Integer {
   return Int(primitive)
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun boxFloat(primitive: Float): java.lang.Float {
   return java.lang.Float(primitive)
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun boxShort(primitive: Short): java.lang.Short {
   return java.lang.Short(primitive)
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun boxChar(primitive: Char): Character {
   return Character(primitive)
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun boxBoolean(primitive: Boolean): java.lang.Boolean {
   return primitive
}

@SinceKotlin(version = "1.3")
@PublishedApi
internal fun boxByte(primitive: Byte): java.lang.Byte {
   return primitive
}
