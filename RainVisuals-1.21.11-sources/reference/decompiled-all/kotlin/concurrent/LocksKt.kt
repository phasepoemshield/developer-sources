@file:JvmName(name = "LocksKt")

package kotlin.concurrent

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantReadWriteLock
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock
import kotlin.contracts.InvocationKind
import kotlin.internal.InlineOnly
import kotlin.jvm.internal.InlineMarker

// $VF: Compiled from Locks.kt
@InlineOnly
public inline fun <T> ReentrantReadWriteLock.read(action: () -> Any): Any {
   contract {
      callsInPlace(action, InvocationKind.EXACTLY_ONCE)
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
   // 00: aload 0
   // 01: ldc "<this>"
   // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
   // 06: aload 1
   // 07: ldc "action"
   // 09: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
   // 0c: nop
   // 0d: aload 0
   // 0e: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock.readLock ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
   // 11: astore 2
   // 12: aload 2
   // 13: nop
   // 14: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.lock ()V
   // 17: nop
   // 18: aload 1
   // 19: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
   // 1e: astore 3
   // 1f: bipush 1
   // 20: nop
   // 21: invokestatic kotlin/jvm/internal/InlineMarker.finallyStart (I)V
   // 24: aload 2
   // 25: nop
   // 26: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock ()V
   // 29: bipush 1
   // 2a: nop
   // 2b: invokestatic kotlin/jvm/internal/InlineMarker.finallyEnd (I)V
   // 2e: aload 3
   // 2f: nop
   // 30: areturn
   // 31: astore 3
   // 32: bipush 1
   // 33: nop
   // 34: invokestatic kotlin/jvm/internal/InlineMarker.finallyStart (I)V
   // 37: aload 2
   // 38: nop
   // 39: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock ()V
   // 3c: bipush 1
   // 3d: nop
   // 3e: invokestatic kotlin/jvm/internal/InlineMarker.finallyEnd (I)V
   // 41: aload 3
   // 42: nop
   // 43: athrow
}

@InlineOnly
public inline fun <T> Lock.withLock(action: () -> Any): Any {
   contract {
      callsInPlace(action, InvocationKind.EXACTLY_ONCE)
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
   // 00: aload 0
   // 01: ldc "<this>"
   // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
   // 06: aload 1
   // 07: ldc "action"
   // 09: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
   // 0c: nop
   // 0d: aload 0
   // 0e: invokeinterface java/util/concurrent/locks/Lock.lock ()V 1
   // 13: nop
   // 14: aload 1
   // 15: invokeinterface kotlin/jvm/functions/Function0.invoke ()Ljava/lang/Object; 1
   // 1a: astore 2
   // 1b: bipush 1
   // 1c: nop
   // 1d: invokestatic kotlin/jvm/internal/InlineMarker.finallyStart (I)V
   // 20: aload 0
   // 21: invokeinterface java/util/concurrent/locks/Lock.unlock ()V 1
   // 26: bipush 1
   // 27: nop
   // 28: invokestatic kotlin/jvm/internal/InlineMarker.finallyEnd (I)V
   // 2b: aload 2
   // 2c: nop
   // 2d: areturn
   // 2e: astore 2
   // 2f: bipush 1
   // 30: nop
   // 31: invokestatic kotlin/jvm/internal/InlineMarker.finallyStart (I)V
   // 34: aload 0
   // 35: invokeinterface java/util/concurrent/locks/Lock.unlock ()V 1
   // 3a: bipush 1
   // 3b: nop
   // 3c: invokestatic kotlin/jvm/internal/InlineMarker.finallyEnd (I)V
   // 3f: aload 2
   // 40: nop
   // 41: athrow
}

@InlineOnly
public inline fun <T> ReentrantReadWriteLock.write(action: () -> Any): Any {
   contract {
      callsInPlace(action, InvocationKind.EXACTLY_ONCE)
   }

   val rl: ReadLock = `$this$write`.readLock()
   val readCount: Int = if (`$this$write`.getWriteHoldCount() == 0) `$this$write`.getReadHoldCount() else 0

   repeat(readCount) { wl ->
      rl.unlock()
   }

   val var11: WriteLock = `$this$write`.writeLock()
   var11.lock()

   try {
      return (T)action()
   } finally {
      InlineMarker.finallyStart(1)

      repeat(readCount) { var12 ->
         rl.lock()
      }

      var11.unlock()
      InlineMarker.finallyEnd(1)
   }
}
