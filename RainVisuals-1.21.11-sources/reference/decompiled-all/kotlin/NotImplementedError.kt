package kotlin

// $VF: Compiled from Standard.kt
public class NotImplementedError(message: String = "An operation is not implemented.") : Error(message) {
   fun NotImplementedError() {
      this(null, 1, null)
   }
}
