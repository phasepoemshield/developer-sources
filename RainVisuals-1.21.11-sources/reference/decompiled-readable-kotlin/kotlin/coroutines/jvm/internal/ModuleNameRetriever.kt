package kotlin.coroutines.jvm.internal

import java.lang.reflect.Method
import org.jetbrains.annotations.Nullable

// $VF: Compiled from DebugMetadata.kt
private object ModuleNameRetriever {
   private final var cache: kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache?
   private final val notOnJava9: kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache = ModuleNameRetriever.Cache(null, null, null)

   public fun getModuleName(continuation: BaseContinuationImpl): String? {
      var var10000: ModuleNameRetriever.Cache = cache
      if (cache == null) {
         var10000 = this.buildCache(continuation)
      }

      if (var10000 === notOnJava9) {
         return null
      } else {
         var var6: Any = if (var10000.getModuleMethod != null) var10000.getModuleMethod.invoke(continuation.getClass()) else null
         if (var6 == null) {
            return null
         } else {
            var6 = if (var10000.getDescriptorMethod != null) var10000.getDescriptorMethod.invoke(var6) else null
            if (var6 == null) {
               return null
            } else {
               val var5: Any = if (var10000.nameMethod != null) var10000.nameMethod.invoke(var6) else null
               return var5 as? java.lang.String
            }
         }
      }
   }

   private fun buildCache(continuation: BaseContinuationImpl): kotlin.coroutines.jvm.internal.ModuleNameRetriever.Cache {
      try {
         val var7: ModuleNameRetriever.Cache = ModuleNameRetriever.Cache(
            Class.class.getDeclaredMethod("getModule"),
            continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor"),
            continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name")
         )
         cache = var7
         return var7
      } catch (var10: Exception) {
         val methodClass: ModuleNameRetriever.Cache = notOnJava9
         cache = notOnJava9
         return methodClass
      }
   }

   // $VF: Compiled from DebugMetadata.kt
   private class Cache(getModuleMethod: Method?, getDescriptorMethod: Method?, nameMethod: Method?) {
      @JvmField
      @Nullable
      public final val getDescriptorMethod: Method?

      @JvmField
      @Nullable
      public final val getModuleMethod: Method?

      @JvmField
      @Nullable
      public final val nameMethod: Method?

      init {
         this.getModuleMethod = getModuleMethod
         this.getDescriptorMethod = getDescriptorMethod
         this.nameMethod = nameMethod
      }
   }
}
