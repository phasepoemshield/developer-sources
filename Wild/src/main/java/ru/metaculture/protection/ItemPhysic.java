package ru.metaculture.protection;

import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ItemPhysic",
   O0000000000 = Category.Visuals,
   O000000000 = "Рендерит предметы лежащими на поверхности"
)
public class ItemPhysic extends Module {
   private static final float O000000000O = 90.0F;
   private static final float O000000000O0 = 0.0F;
   private static final float O000000000O00 = 22.0F;
   private static boolean O000000000O000;

   @Override
   public void O00000000() {
      super.O00000000();
      O000000000O000 = true;
   }

   @Override
   public void O000000000() {
      super.O000000000();
      O000000000O000 = false;
   }

   public static boolean O00000000(ItemEntityRenderState itemEntityRenderState) {
      return O000000000O000 && itemEntityRenderState instanceof O000000000 var1 && var1.wild$isItemPhysicOnGround();
   }

   public static boolean O000000000(ItemEntityRenderState itemEntityRenderState) {
      return O000000000O000 && itemEntityRenderState instanceof O000000000 var1 && !var1.wild$isItemPhysicOnGround();
   }

   public static float O0000000000O0() {
      return 0.0F;
   }

   public static float O0000000000O00() {
      return 90.0F;
   }

   public static float O00000000(float f) {
      return f * 22.0F;
   }
}
