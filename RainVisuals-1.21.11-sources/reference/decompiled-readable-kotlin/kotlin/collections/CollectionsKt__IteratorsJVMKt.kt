@file:JvmMultifileClass
@file:JvmName("CollectionsKt")

package kotlin.collections

import java.util.Enumeration

// $VF: Compiled from IteratorsJVM.kt
public operator fun <T> Enumeration<Any>.iterator(): Iterator<Any> {
   // $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
   //   at org.vineflower.kotlin.KotlinWriter.writeMethod(KotlinWriter.java:1198)
   //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:476)
   //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
   //   at org.vineflower.kotlin.expr.KFunctionExprent.toJava(KFunctionExprent.java:196)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
   //   at org.jetbrains.java.decompiler.modules.decompiler.exps.ExitExprent.toJava(ExitExprent.java:85)
   //
   // Bytecode:
   // 00: aload 0
   // 01: ldc "<this>"
   // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
   // 06: new kotlin/collections/CollectionsKt__IteratorsJVMKt$iterator$1
   // 09: dup
   // 0a: aload 0
   // 0b: invokespecial kotlin/collections/CollectionsKt__IteratorsJVMKt$iterator$1.<init> (Ljava/util/Enumeration;)V
   // 0e: checkcast java/util/Iterator
   // 11: areturn
}

open fun CollectionsKt__IteratorsJVMKt() {
}
