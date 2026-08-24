@file:JvmName(name = "AutoCloseableKt")

package kotlin.jdk7

import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly

// $VF: Compiled from AutoCloseableJVM.kt
@SinceKotlin(version = "1.2")
@PublishedApi
internal fun AutoCloseable?.closeFinally(cause: Throwable?) {
   if (`$this$closeFinally` != null) {
      if (cause == null) {
         `$this$closeFinally`.close()
      } else {
         try {
            `$this$closeFinally`.close()
         } catch (var3: java.lang.Throwable) {
            ExceptionsKt.addSuppressed(cause, var3)
         }
      }
   }
}

@InlineOnly
@SinceKotlin(version = "1.2")
public inline fun <T : AutoCloseable?, R> Any.use(block: (Any) -> Any): Any {
   contract {
      callsInPlace(block, InvocationKind.EXACTLY_ONCE)
   }
   // $VF: Couldn't be decompiled
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
   //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
   //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
   //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
   //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
   //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
   //   at org.jetbrains.java.decompiler.util.collections.ListStack.pop(ListStack.java:31)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processBlock(ExprProcessor.java:448)
   //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.processStatement(ExprProcessor.java:141)
   //
   // Bytecode:
   // 00: aload 1
   // 01: ldc "block"
   // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
   // 06: nop
   // 07: aconst_null
   // 08: nop
   // 09: astore 2
   // 0a: nop
   // 0b: aload 1
   // 0c: aload 0
   // 0d: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
   // 12: astore 3
   // 13: bipush 1
   // 14: nop
   // 15: invokestatic kotlin/jvm/internal/InlineMarker.finallyStart (I)V
   // 18: aload 0
   // 19: aload 2
   // 1a: nop
   // 1b: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
   // 1e: bipush 1
   // 1f: nop
   // 20: invokestatic kotlin/jvm/internal/InlineMarker.finallyEnd (I)V
   // 23: aload 3
   // 24: nop
   // 25: areturn
   // 26: astore 3
   // 27: aload 3
   // 28: nop
   // 29: astore 2
   // 2a: aload 3
   // 2b: nop
   // 2c: athrow
   // 2d: astore 3
   // 2e: bipush 1
   // 2f: nop
   // 30: invokestatic kotlin/jvm/internal/InlineMarker.finallyStart (I)V
   // 33: aload 0
   // 34: aload 2
   // 35: nop
   // 36: invokestatic kotlin/jdk7/AutoCloseableKt.closeFinally (Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
   // 39: bipush 1
   // 3a: nop
   // 3b: invokestatic kotlin/jvm/internal/InlineMarker.finallyEnd (I)V
   // 3e: aload 3
   // 3f: nop
   // 40: athrow
}
