package ru.metaculture.protection;

import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_3966;
import net.minecraft.class_239.class_240;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "FriendManager",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Менеджер по управлению в друзьях"
)
public class FriendManager extends Module {
   public static uVNuNUVvn NVNnnvnuunNv = new uVNuNUVvn("Бинд друзей", -1);
   public static vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Не бить друзей", true);
   public static vvNnnUNnVvn UNnVVNvvnVvU = new vvNnnUNnVvn("Убирать хитбокс друга", true);
   private final unnunUVvU uNnUnnuNUnNu = new unnunUVvU();

   public FriendManager() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (var1.vVvUvVVuuNvV() == NVNnnvnuunNv.uUnuvNvvNU() && var1.nuUnNvnuUu() == 1 && this.uNnUnnuNUnNu.vVvUvVVuuNvV(200L)) {
         if (AttackAura.ccOO0COcoco0 != null) {
            return;
         }

         class_239 var2 = uUnuvNvvNU.field_1765;
         if (var2 == null || var2.method_17783() != class_240.field_1331) {
            return;
         }

         if (!(((class_3966)var2).method_17782() instanceof class_1657 var4)) {
            return;
         }

         String var5 = var4.method_5477().getString();
         String var6 = NVnVnNnN.UuUVuuUu.VVnVNnunVvu();
         if (!uNvUVUNvuUVV.UuUVuuUu(var5)) {
            NVnVnNnN.UuUVuuUu.UvUvUNuvNU().UuUVuuUu(var6 + "friend add " + var5);
            vnnunVnunuN.UuUVuuUu("add", 0.5F);
         } else {
            NVnVnNnN.UuUVuuUu.UvUvUNuvNU().UuUVuuUu(var6 + "friend remove " + var5);
            vnnunVnunuN.UuUVuuUu("remove", 0.5F);
         }

         this.uNnUnnuNUnNu.UuUVuuUu();
      }
   }
}
