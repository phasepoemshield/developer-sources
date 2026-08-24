package oxxxde

// $VF: Compiled from heavy
public object ثض : دِ("ItemPhysic", ظن.getRENDER(), "Изменяет способ отображения предметов") {
   private const val MODE_PHYSICS: String = "Физика"
   private const val MODE_2D: String = "2Д"
   private final val modeSetting: ظي = دِ.mode$default(INSTANCE, "Режим", CollectionsKt.listOf("Физика", "2Д"), 0, null, 12, null)

   public fun is2DMode(): Boolean {
      return this.isEnabled() && modeSetting.getValue() == "2Д"
   }

   public fun isPhysicsMode(): Boolean {
      return this.isEnabled() && modeSetting.getValue() == "Физика"
   }
}
