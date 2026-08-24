package kotlin

// $VF: Compiled from Lazy.kt
public interface Lazy<T> {
   public val value: Any

   public abstract fun isInitialized(): Boolean {
   }
}
