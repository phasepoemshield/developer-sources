package kotlin.jvm.internal

import java.lang.reflect.Type
import kotlin.reflect.KType

// $VF: Compiled from KTypeBase.kt
@SinceKotlin(version = "1.4")
public interface KTypeBase : KType {
   public val javaType: Type?
}
