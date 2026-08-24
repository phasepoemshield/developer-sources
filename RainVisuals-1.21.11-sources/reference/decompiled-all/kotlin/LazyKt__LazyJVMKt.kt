@file:JvmMultifileClass
@file:JvmName("LazyKt")

package kotlin

// $VF: Compiled from LazyJVM.kt
public fun <T> lazy(initializer: () -> Any): Lazy<Any> {
   return SynchronizedLazyImpl(initializer, null, 2, null)
}

public fun <T> lazy(mode: LazyThreadSafetyMode, initializer: () -> Any): Lazy<Any> {
   var var10000: Lazy
   when (LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
      1 -> var10000 = SynchronizedLazyImpl(initializer, null, 2, null)
      2 -> var10000 = SafePublicationLazyImpl(initializer)
      3 -> var10000 = UnsafeLazyImpl(initializer)
      else -> throw NoWhenBranchMatchedException()
   }

   return var10000
}

public fun <T> lazy(lock: Any?, initializer: () -> Any): Lazy<Any> {
   return SynchronizedLazyImpl(initializer, lock)
}

open fun LazyKt__LazyJVMKt() {
}
