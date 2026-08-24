package oxxxde

// $VF: Compiled from heavy
public companion object ي {
   private fun initialMode(modes: List<String>, initialIndex: Int): String {
      if (modes.isEmpty()) {
         throw IllegalArgumentException("modes cannot be empty".toString())
      } else {
         return modes.get(RangesKt.coerceIn(initialIndex, 0, modes.size() - 1)) as java.lang.String
      }
   }
}
