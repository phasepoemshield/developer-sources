package kotlin.jvm.internal

import kotlin.reflect.KCallable

// $VF: Compiled from PackageReference.kt
@SinceKotlin(version = "1.1")
public class PackageReference(jClass: Class<*>, moduleName: String) : ClassBasedDeclarationContainer {
   public open val jClass: Class<*>
   private final val moduleName: String

   public override fun toString(): String {
      return "${this.jClass.toString()} (Kotlin reflection is not available)"
   }

   public override fun hashCode(): Int {
      return this.jClass.hashCode()
   }

   init {
      this.jClass = jClass
      this.moduleName = moduleName
   }

   public open val members: Collection<KCallable<*>>
      public open get() {
         throw KotlinReflectionNotSupportedError()
      }


   public override operator fun equals(other: Any?): Boolean {
      return other is PackageReference && this.jClass == (other as PackageReference).jClass
   }
}
