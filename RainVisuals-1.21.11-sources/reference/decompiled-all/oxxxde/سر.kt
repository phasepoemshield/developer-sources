package oxxxde

// $VF: Compiled from heavy
public object سر {
   public final val settings: List<رف<*>> = CollectionsKt.listOf(سر.scaleSetting, سر.hudScaleSetting, سر.guiBackgroundSetting)
   private final val guiBackgroundSetting: خذ = خذ("GUI Background", false, "background")
   public final val openKey: Int = 344
   private final val scaleAnimation: ري = ري(1.0F)
   private final val hudScaleSetting: طُ = طُ("HUD Size", 120.0F, 50.0F, 200.0F, 1.0F, "hudScale")
   private final val scaleSetting: طُ = طُ("GUI Size", 120.0F, 75.0F, 150.0F, 1.0F, "guiScale")

   public fun setHudScaleProgress(progress: Float) {
      this.setHudScalePercent(this.hudScalePercentForProgress(progress))
   }

   public fun hudScalePercentForProgress(progress: Float): Float {
      return hudScaleSetting.min + (hudScaleSetting.max - hudScaleSetting.min) * RangesKt.coerceIn(progress, 0.0F, 1.0F)
   }

   public fun hudScale(): Float {
      return hudScaleSetting.getValue().floatValue() / 100.0F
   }

   public fun renderGuiBackground(): Boolean {
      return guiBackgroundSetting.getValue()
   }

   public fun scaleProgress(): Float {
      return scaleSetting.progress()
   }

   public fun setScalePercent(value: Float) {
      scaleSetting.setClamped(value)
   }

   public fun hudScalePercent(): Float {
      return hudScaleSetting.getValue().floatValue()
   }

   public fun scale(): Float {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:770)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.FunctionExprent.wrapOperandString(FunctionExprent.java:736)
      //
      // Bytecode:
      // 00: getstatic oxxxde/سر.scaleSetting Loxxxde/طُ;
      // 03: invokevirtual oxxxde/طُ.getValue ()Ljava/lang/Object;
      // 06: checkcast java/lang/Number
      // 09: invokevirtual java/lang/Number.floatValue ()F
      // 0c: ldc 100.0
      // 0e: fdiv
      // 0f: fstore 1
      // 10: getstatic oxxxde/سر.scaleAnimation Loxxxde/ري;
      // 13: fload 1
      // 14: ldc 150.0
      // 16: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 19: astore 2
      // 1a: new oxxxde/دئ
      // 1d: dup
      // 1e: aload 2
      // 1f: nop
      // 20: invokespecial oxxxde/دئ.<init> (Loxxxde/بف;)V
      // 23: checkcast oxxxde/شل
      // 26: invokevirtual oxxxde/ري.animate (FFLoxxxde/شل;)F
      // 29: freturn
   }

   public fun setScaleProgress(progress: Float) {
      this.setScalePercent(this.scalePercentForProgress(progress))
   }

   public fun hudScaleProgress(): Float {
      return hudScaleSetting.progress()
   }

   public fun toggleGuiBackground() {
      guiBackgroundSetting.toggle()
   }

   public fun setHudScalePercent(value: Float) {
      hudScaleSetting.setClamped(value)
   }

   public fun scalePercentForProgress(progress: Float): Float {
      return scaleSetting.min + (scaleSetting.max - scaleSetting.min) * RangesKt.coerceIn(progress, 0.0F, 1.0F)
   }

   public fun scalePercent(): Float {
      return scaleSetting.getValue().floatValue()
   }
}
