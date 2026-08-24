package oxxxde

// $VF: Compiled from heavy
public open class ظي(name: String, modes: List<String>, initialIndex: Int = 0, configKey: String = name) : رف(
      name, ي.access$initialMode(Companion, modes, initialIndex), configKey
   ) {
   public final val modes: List<String>
   @JvmStatic
   public ي Companion = ي(null);
   private final var displayNameProvider: (String) -> String

   public final val displayValue: String
      public final get() {
         return this.displayNameFor(this.getValue())
      }


   public final val selectedIndex: Int
      public final get() {
         val var1: Int = this.modes.indexOf(this.getValue())
         val it: Int = var1.intValue()
         return if ((if (it >= 0) var1 else null) != null) if (it >= 0) var1 else null else 0
      }


   public fun setIndex(index: Int) {
      this.set(this.modes.get(RangesKt.coerceIn(index, 0, CollectionsKt.getLastIndex(this.modes))))
   }

   public fun setMode(mode: String) {
      if (this.modes.contains(mode)) {
         this.set(mode)
      }
   }

   public open fun setVisible(condition: () -> Boolean): ظي {
      super.setVisible(condition)
      return this
   }

   init {
      this.modes = modes
      this.displayNameProvider = { it: java.lang.String ->
         it
      }
      if (this.modes.isEmpty()) {
         throw IllegalArgumentException("modes cannot be empty".toString())
      }
   }

   public fun withDisplayNameProvider(provider: (String) -> String): ظي {
      this.displayNameProvider = provider
      return this
   }

   public fun displayNameFor(mode: String): String {
      val var2: java.lang.CharSequence = this.displayNameProvider(mode)
      return (if (StringsKt.isBlank(var2)) mode else var2) as java.lang.String
   }

   public fun isSelected(index: Int): Boolean {
      return this.selectedIndex == index
   }

   public fun cycleNext() {
      this.set(this.modes.get((this.selectedIndex + 1) % this.modes.size()))
   }
}
