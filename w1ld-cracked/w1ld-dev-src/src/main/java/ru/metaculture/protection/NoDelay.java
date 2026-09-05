package ru.metaculture.protection;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1802;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.mixin.acceser.MinecraftClientAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "NoDelay",
   C00OOC00oO = "Убирает задержку",
   uUnuvNvvNU = oOOOo0.Player
)
public class NoDelay extends Module {
   public static vvNnnUNnVvn NVNnnvnuunNv = new vvNnnUNnVvn("Прыжки", true);
   public static vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Рандомизация", false).UuUVuuUu(() -> !NVNnnvnuunNv.uUnuvNvvNU());
   public static vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Поломка блоков", false);
   public static vvNnnUNnVvn uNnUnnuNUnNu = new vvNnnUNnVvn("ЛКМ", false);
   public static vvNnnUNnVvn NnUuNNU = new vvNnnUNnVvn("ПКМ", false);
   public static vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Пузырьки опыта", true);
   public static nNUuNvVn UnUNuUU = new nNUuNvVn("Скорость прыжка", 0.0F, 0.0F, 10.0F, 1.0F, false).UuUVuuUu(() -> !NVNnnvnuunNv.uUnuvNvvNU());
   public static nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Скорость поломки блока", 0.0F, 0.0F, 5.0F, 1.0F, false).UuUVuuUu(() -> !UNnVVNvvnVvU.uUnuvNvvNU());
   public static nNUuNvVn UvUvUNuvNU = new nNUuNvVn("ЛКМ задержка", 0.0F, 0.0F, 10.0F, 1.0F, false).UuUVuuUu(() -> !uNnUnnuNUnNu.uUnuvNvvNU());
   public static nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("ПКМ задержка", 0.0F, 0.0F, 4.0F, 1.0F, false).UuUVuuUu(() -> !NnUuNNU.uUnuvNvvNU());

   public NoDelay() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UnUNuUU, UNnVVNvvnVvU, uUVuVvuNUvnu, uNnUnnuNUnNu, UvUvUNuvNU, NnUuNNU, c0oOOCcCoC0, nNvNUVU});
   }

   public static int UuuNnUvUuv() {
      int var0 = (int)UnUNuUU.uUnuvNvvNU();
      return uVunuUNVVUUV.uUnuvNvvNU() && var0 > 0 ? ThreadLocalRandom.current().nextInt(0, var0 + 1) : var0;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null) {
         if (UNnVVNvvnVvU.uUnuvNvvNU() && uUnuvNvvNU.field_1761 != null) {
            ClientPlayerInteractionManagerAccessor var2 = (ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761;
            if (var2.getBlockBreakingCooldown() > uUVuVvuNUvnu.uUnuvNvvNU()) {
               var2.setBlockBreakingCooldown((int)uUVuVvuNUvnu.uUnuvNvvNU());
            }
         }

         if (nNvNUVU.uUnuvNvvNU()) {
            boolean var3 = uUnuvNvvNU.field_1724.method_6047().method_7909() == class_1802.field_8287
               || uUnuvNvvNU.field_1724.method_6079().method_7909() == class_1802.field_8287;
            if (var3) {
               ((MinecraftClientAccessor)uUnuvNvvNU).setItemUseCooldown(0);
            }
         }
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      if (uUnuvNvvNU.field_1761 != null) {
         ((ClientPlayerInteractionManagerAccessor)uUnuvNvvNU.field_1761).setBlockBreakingCooldown(5);
      }
   }
}
