package kotlin.jvm.internal

import kotlin.reflect.KDeclarationContainer

// $VF: Compiled from ClassBasedDeclarationContainer.kt
public interface ClassBasedDeclarationContainer : KDeclarationContainer {
   public val jClass: Class<*>
}
