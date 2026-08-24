package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.hud.TargetHudModule
import kotakbaz.rain.module.setting.settings.BooleanSetting

// $VF: Compiled from heavy
public object صِ : Module("RenderTweaks", RENDER, "Разные настройки рендера") {
   @JvmStatic
   private BooleanSetting noStatusEffects = صِ.INSTANCE.boolean("Убрать ванильные эффекты", false, "noStatusEffects").setVisible({ 
      !TargetHudModule.INSTANCE.isEnabled()
   });
   @JvmStatic
   private BooleanSetting noHurtCam = صِ.INSTANCE.boolean("Убрать тряску экрана", false, "noHurtCam");
   @JvmStatic
   private BooleanSetting noBossBar = صِ.INSTANCE.boolean("Убрать босс бар", false, "noBossBar");
   @JvmStatic
   private BooleanSetting noTotemAnimation = صِ.INSTANCE.boolean("Отключить анимацию тотема", false, "noTotemAnimation");
   @JvmStatic
   private BooleanSetting noHandSway = صِ.INSTANCE.boolean("Убрать тряску рук", false, "noHandSway");
   @JvmStatic
   private BooleanSetting noBlackHearts = صِ.INSTANCE.boolean("Убрать чёрные сердца", false, "noBlackHearts");
   @JvmStatic
   private BooleanSetting noGlow = صِ.INSTANCE.boolean("Убрать свечение", false, "noGlow");
   @JvmStatic
   private BooleanSetting hideMobs = صِ.INSTANCE.boolean("Убрать мобов", false, "hideMobs");
   @JvmStatic
   private BooleanSetting noFire = INSTANCE.boolean("Убрать огонь", false, "noFire");
   @JvmStatic
   private BooleanSetting removeVignette = INSTANCE.boolean("Отключить виньетку", false, "removeVignette");

   public final val hideMobs: خذ

   public final val noHurtCam: خذ

   public final val noStatusEffects: خذ

   public final val noTotemAnimation: خذ

   public final val removeVignette: خذ

   public final val noGlow: خذ

   public final val noBlackHearts: خذ

   public final val noBossBar: خذ

   public final val noFire: خذ

   public final val noHandSway: خذ
}
