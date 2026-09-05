package ru.metaculture.protection;

import net.minecraft.class_10039;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "ItemPhysic",
   uUnuvNvvNU = oOOOo0.Visuals,
   C00OOC00oO = "Рендерит предметы лежащими на поверхности"
)
public class ItemPhysic extends Module {
   private static final float NVNnnvnuunNv = 90.0F;
   private static final float uVunuUNVVUUV = 0.0F;
   private static final float UNnVVNvvnVvU = 22.0F;
   private static boolean uNnUnnuNUnNu;

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      uNnUnnuNUnNu = true;
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      uNnUnnuNUnNu = false;
   }

   public static boolean UuUVuuUu(class_10039 var0) {
      return uNnUnnuNUnNu && var0 instanceof nvnNNunvv var1 && var1.wild$isItemPhysicOnGround();
   }

   public static boolean C00OOC00oO(class_10039 var0) {
      return uNnUnnuNUnNu && var0 instanceof nvnNNunvv var1 && !var1.wild$isItemPhysicOnGround();
   }

   public static float UuuNnUvUuv() {
      return 0.0F;
   }

   public static float nUUVuvU() {
      return 90.0F;
   }

   public static float UuUVuuUu(float var0) {
      return var0 * 22.0F;
   }
}
