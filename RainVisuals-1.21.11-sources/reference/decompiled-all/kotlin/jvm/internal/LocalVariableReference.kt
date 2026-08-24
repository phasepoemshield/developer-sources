package kotlin.jvm.internal

import kotlin.reflect.KDeclarationContainer

// $VF: Compiled from localVariableReferences.kt
@SinceKotlin(version = "1.1")
public open class LocalVariableReference : PropertyReference0 {
   public override fun get(): Any? {
      LocalVariableReferencesKt.access$notSupportedError()
      throw KotlinNothingValueException()
   }

   public override fun getOwner(): KDeclarationContainer {
      LocalVariableReferencesKt.access$notSupportedError()
      throw KotlinNothingValueException()
   }
}
