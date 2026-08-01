package zenith;

import java.util.List;

@ModuleInfo(
   name = "NoRender",
   category = Category.RENDER,
   description = "Убирает лишние элементы с экрана"
)
public final class Norender extends Module {
   public static final Norender I11I1Il11lIlIl = new Norender();
   private final MultiBooleanSetting lIll1Il1IIl11IlllIII = MultiBooleanSetting.StringHolder_8(
      "module.noRender.settings",
      "module.noRender.settings.desc",
      List.of("module.noRender.fire", "module.noRender.badEffects", "module.noRender.blockOverlay")
   );

   private Norender() {
   }

   public boolean lI11l11I1II11II1IIl11() {
      return this.Spider() && this.lIll1Il1IIl11IlllIII.ConstructorHolder(2);
   }

   public boolean ll1l11llIIlIlIlIl1() {
      return this.Spider() && this.lIll1Il1IIl11IlllIII.ConstructorHolder(0);
   }

   public boolean IlllIIl1l1() {
      return this.Spider() && this.lIll1Il1IIl11IlllIII.ConstructorHolder(1);
   }
}
