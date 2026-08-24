package kotakbaz.rain.ui.menu.settings

import java.awt.Color
import kotakbaz.rain.client.util.animations.AnimationUtil
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import kotakbaz.rain.module.setting.Setting
import kotakbaz.rain.ui.api.PipelinedRender
import oxxxde.اظ
import oxxxde.ثْ
import oxxxde.صؤ

// $VF: Compiled from ModuleSettingComponent.kt
public abstract class ModuleSettingComponent<T extends Setting<?>> : اظ, PipelinedRender {
   public final var parentOpenProgress: Float
   private AnimationUtil visibleAnimation;
   private T setting;
   public final var enableProgress: Float

   public abstract val componentHeight: Float

   public override fun rectPipeline(): صؤ {
      return ClientRenderPipeline.GUI_RECT
   }

   protected fun themedTitle(disabledAlpha: Float, enabledAlpha: Float): Color {
      return ثْ.INSTANCE.title(this.alphaByState(disabledAlpha, enabledAlpha))
   }

   protected fun themedBorder(disabledAlpha: Float, enabledAlpha: Float): Color {
      return ثْ.INSTANCE.title(this.alphaByState(disabledAlpha, enabledAlpha))
   }

   protected fun hovered(mouseX: Int, mouseY: Int): Boolean {
      return mouseX >= this.getX() && mouseX <= this.getX() + this.getWidth() && mouseY >= this.getY() && mouseY <= this.getY() + this.componentHeight
   }

   open fun ModuleSettingComponent(setting: T) {
      this.setting = (T)setting
      this.enableProgress = 1.0F
      this.parentOpenProgress = 1.0F
      this.visibleAnimation = AnimationUtil(if (this.setting.isVisible()) 1.0F else 0.0F)
   }

   public override fun textPipeline(): صؤ {
      return ClientRenderPipeline.GUI_TEXT
   }

   protected fun themedSurface(disabledAlpha: Float, enabledAlpha: Float): Color {
      return ثْ.INSTANCE.surface(this.alphaByState(disabledAlpha, enabledAlpha))
   }

   public override fun iconsPipeline(): صؤ {
      return ClientRenderPipeline.GUI_SPECIAL
   }

   protected fun alphaByState(disabledAlpha: Float, enabledAlpha: Float): Float {
      return (disabledAlpha + (enabledAlpha - disabledAlpha) * this.enableProgress) * this.getAlpha()
   }

   public fun visibleProgress(duration: Float = 170.0F): Float {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Anonymous class does not have Class Kotlin metadata
      //   at org.vineflower.kotlin.KotlinWriter.writeClassDefinition(KotlinWriter.java:742)
      //   at org.vineflower.kotlin.KotlinWriter.writeClass(KotlinWriter.java:309)
      //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:178)
      //   at org.vineflower.kotlin.expr.KFunctionExprent.toJava(KFunctionExprent.java:196)
      //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.setting Lkotakbaz/rain/module/setting/Setting;
      // 04: invokevirtual kotakbaz/rain/module/setting/Setting.isVisible ()Z
      // 07: ifne 26
      // 0a: aload 0
      // 0b: getfield kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.visibleAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 0e: fconst_0
      // 0f: nop
      // 10: fconst_0
      // 11: nop
      // 12: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 15: astore 2
      // 16: new oxxxde/ظز
      // 19: dup
      // 1a: aload 2
      // 1b: nop
      // 1c: invokespecial oxxxde/ظز.<init> (Loxxxde/بف;)V
      // 1f: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 22: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 25: freturn
      // 26: aload 0
      // 27: getfield kotakbaz/rain/ui/menu/settings/ModuleSettingComponent.visibleAnimation Lkotakbaz/rain/client/util/animations/AnimationUtil;
      // 2a: fconst_1
      // 2b: nop
      // 2c: fload 1
      // 2d: getstatic oxxxde/بف.INSTANCE Loxxxde/بف;
      // 30: astore 2
      // 31: new oxxxde/شب
      // 34: dup
      // 35: aload 2
      // 36: nop
      // 37: invokespecial oxxxde/شب.<init> (Loxxxde/بف;)V
      // 3a: checkcast kotakbaz/rain/client/util/animations/FloatEasing
      // 3d: invokevirtual kotakbaz/rain/client/util/animations/AnimationUtil.animate (FFLkotakbaz/rain/client/util/animations/FloatEasing;)F
      // 40: freturn
   }

   protected fun themedIcon(disabledAlpha: Float, enabledAlpha: Float): Color {
      return ثْ.INSTANCE.icon(this.alphaByState(disabledAlpha, enabledAlpha))
   }

   protected fun themedValue(disabledAlpha: Float, enabledAlpha: Float): Color {
      return ثْ.INSTANCE.value(this.alphaByState(disabledAlpha, enabledAlpha))
   }

   public final val setting: Any
}
