package oxxxde

// $VF: Compiled from heavy
public object حئ {
   private final val HUD_PIPELINES: Array<صؤ>
   private final val GUI_PIPELINES: Array<صؤ>
   private final val WINDOW_PIPELINES: Array<صؤ>

   public fun getPipelines(renderIn: ذث): List<صؤ> {
      var var10000: java.util.List
      when (طٌ.$EnumSwitchMapping$0[renderIn.ordinal()]) {
         1 -> var10000 = ArraysKt.asList(HUD_PIPELINES)
         2 -> var10000 = ArraysKt.asList(GUI_PIPELINES)
         3 -> var10000 = ArraysKt.asList(WINDOW_PIPELINES)
         else -> throw NoWhenBranchMatchedException()
      }

      return var10000
   }
}
