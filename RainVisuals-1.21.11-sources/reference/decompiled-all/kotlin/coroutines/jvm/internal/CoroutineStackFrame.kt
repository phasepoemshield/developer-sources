package kotlin.coroutines.jvm.internal

// $VF: Compiled from CoroutineStackFrame.kt
@SinceKotlin(version = "1.3")
public interface CoroutineStackFrame {
   public val callerFrame: CoroutineStackFrame?

   public abstract fun getStackTraceElement(): StackTraceElement? {
   }
}
