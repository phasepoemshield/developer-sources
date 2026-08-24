package oxxxde

// $VF: Compiled from heavy
public object رع : دِ("SaturationHud", ظن.getHUD(), "Показывает запас насыщения над полосой еды") {
   private final val showEmpty: خذ = رع.INSTANCE.boolean("Отображать пустоту", true, "showEmpty")

   public fun shouldRenderEmptySlots(): Boolean {
      return showEmpty.getValue()
   }
}
