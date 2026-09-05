package ru.metaculture.protection;

import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2703;
import net.minecraft.class_640;
import net.minecraft.class_7828;
import net.minecraft.class_2703.class_2705;
import net.minecraft.class_2703.class_5893;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AntiBot",
   uUnuvNvvNU = oOOOo0.Combat,
   C00OOC00oO = "Убирает бота позади вас",
   vVvUvVVuuNvV = {uVUNNUnNvU.MATRIX, uVUNNUnNvU.GRIM}
)
public class AntiBot extends Module {
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим: ", "ALL", "ReallyWorld", "Matrix", "ALL");
   public static final Set<UUID> uVunuUNVVUUV = ConcurrentHashMap.newKeySet();
   private static final Set<UUID> uNnUnnuNUnNu = ConcurrentHashMap.newKeySet();
   private final Set<UUID> NnUuNNU = ConcurrentHashMap.newKeySet();
   private final Map<UUID, List<class_1799>> nNvNUVU = new ConcurrentHashMap<>();
   public static boolean UNnVVNvvnVvU = false;

   public AntiBot() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.NVNnnvnuunNv});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      UNnVVNvvnVvU = true;
   }

   @Override
   public void C00OOC00oO() {
      UNnVVNvvnVvU = false;
      uVunuUNVVUUV.clear();
      uNnUnnuNUnNu.clear();
      this.NnUuNNU.clear();
      this.nNvNUVU.clear();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         this.UnUNVVVNuv();
         String var2 = this.NVNnnvnuunNv.uUnuvNvvNU();
         if (!var2.equals("ReallyWorld") && !this.NnUuNNU.isEmpty()) {
            uUnuvNvvNU.field_1687.method_18456().stream().filter(var1x -> this.NnUuNNU.contains(var1x.method_5667())).forEach(this::uUnuvNvvNU);
         }

         if (var2.equals("Matrix") || var2.equals("ALL")) {
            this.UuuNnUvUuv();
         }

         if (var2.equals("ReallyWorld") || var2.equals("ALL")) {
            this.nUUVuvU();
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.vVvUvVVuuNvV() instanceof class_2703 var2) {
         this.UuUVuuUu(var2);
      } else if (var1.vVvUvVVuuNvV() instanceof class_7828 var3) {
         this.UuUVuuUu(var3);
      }
   }

   private void UuUVuuUu(class_2703 var1) {
      if (var1.method_46327().contains(class_5893.field_29136)) {
         var1.method_46329().forEach(var1x -> {
            GameProfile var2 = var1x.comp_1107();
            if (var2 != null) {
               if (this.UuUVuuUu(var1x, var2)) {
                  this.UuUVuuUu(var2.getId());
               } else {
                  UUID var3 = var2.getId();
                  if (this.UuUVuuUu(var2)) {
                     uVunuUNVVUUV.add(var3);
                  } else {
                     this.NnUuNNU.add(var3);
                  }
               }
            }
         });
      }
   }

   private void UuUVuuUu(class_7828 var1) {
      for (UUID var3 : var1.comp_1105()) {
         this.NnUuNNU.remove(var3);
         uVunuUNVVUUV.remove(var3);
         uNnUnnuNUnNu.remove(var3);
         this.nNvNUVU.remove(var3);
      }
   }

   private boolean UuUVuuUu(class_2705 var1, GameProfile var2) {
      return uUnuvNvvNU.field_1724 == null ? false : var2.getId().equals(uUnuvNvvNU.field_1724.method_5667()) || var1.comp_1109() > 0;
   }

   private boolean UuUVuuUu(GameProfile var1) {
      return uUnuvNvvNU.field_1687 == null
         ? false
         : uUnuvNvvNU.field_1687
            .method_18456()
            .stream()
            .anyMatch(var1x -> var1x.method_7334().getName().equals(var1.getName()) && !var1x.method_5667().equals(var1.getId()));
   }

   private List<class_1799> C00OOC00oO(class_1657 var1) {
      ArrayList var2 = new ArrayList(4);
      var2.add(var1.method_6118(class_1304.field_6169));
      var2.add(var1.method_6118(class_1304.field_6174));
      var2.add(var1.method_6118(class_1304.field_6172));
      var2.add(var1.method_6118(class_1304.field_6166));
      return var2;
   }

   private void uUnuvNvvNU(class_1657 var1) {
      if (vVvUvVVuuNvV(var1)) {
         this.NnUuNNU.remove(var1.method_5667());
         this.nNvNUVU.remove(var1.method_5667());
      } else {
         List var2 = this.C00OOC00oO(var1);
         List var3 = this.nNvNUVU.get(var1.method_5667());
         if (!this.UuUVuuUu(var2) && !this.UuUVuuUu(var2, var3)) {
            this.nNvNUVU.put(var1.method_5667(), var2);
         } else {
            uVunuUNVVUUV.add(var1.method_5667());
            this.NnUuNNU.remove(var1.method_5667());
         }
      }
   }

   private void UuuNnUvUuv() {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         Iterator var1 = this.NnUuNNU.iterator();

         while (var1.hasNext()) {
            UUID var2 = (UUID)var1.next();
            class_1657 var3 = uUnuvNvvNU.field_1687.method_18470(var2);
            if (var3 != null) {
               if (vVvUvVVuuNvV(var3)) {
                  continue;
               }

               String var4 = var3.method_5477().getString();
               boolean var5 = var4.startsWith("CIT-") && !var4.contains("NPC") && !var4.contains("[ZNPC]");
               int var6 = 0;

               for (class_1799 var8 : this.C00OOC00oO(var3)) {
                  if (var8 != null && !var8.method_7960()) {
                     var6++;
                  }
               }

               boolean var9 = var6 == 4;
               boolean var10 = !var3.method_5667().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var4).getBytes()));
               if (var9 || var5 || var10) {
                  uVunuUNVVUUV.add(var2);
               }
            }

            var1.remove();
         }

         if (uUnuvNvvNU.field_1724.field_6012 % 100 == 0) {
            uVunuUNVVUUV.removeIf(var0 -> uUnuvNvvNU.field_1687.method_18470(var0) == null);
         }
      }
   }

   private void nUUVuvU() {
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         for (class_1657 var2 : uUnuvNvvNU.field_1687.method_18456()) {
            if (var2 != uUnuvNvvNU.field_1724 && !vVvUvVVuuNvV(var2)) {
               String var3 = var2.method_5477().getString();
               boolean var4 = !var2.method_5667().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var3).getBytes()));
               boolean var5 = var3.contains("NPC") || var3.startsWith("[ZNPC]");
               if (var4 && !var5) {
                  uVunuUNVVUUV.add(var2.method_5667());
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(List<class_1799> var1) {
      for (class_1799 var3 : var1) {
         if (var3 == null || var3.method_7960() || var3.method_7942()) {
            return false;
         }
      }

      return true;
   }

   private boolean UuUVuuUu(List<class_1799> var1, List<class_1799> var2) {
      if (var2 == null) {
         return false;
      } else {
         for (int var3 = 0; var3 < 4; var3++) {
            class_1799 var4 = (class_1799)var1.get(var3);
            class_1799 var5 = (class_1799)var2.get(var3);
            if (var4 != null && var5 != null) {
               if (var4.method_7909() != var5.method_7909()) {
                  return true;
               }
            } else if (var4 != var5) {
               return true;
            }
         }

         return false;
      }
   }

   private void UnUNVVVNuv() {
      if (uUnuvNvvNU.method_1562() != null) {
         for (class_640 var2 : uUnuvNvvNU.method_1562().method_2880()) {
            if (var2 != null && var2.method_2966() != null && this.UuUVuuUu(var2.method_2966().getId(), var2.method_2959())) {
               this.UuUVuuUu(var2.method_2966().getId());
            }
         }

         uNnUnnuNUnNu.removeIf(
            var0 -> uUnuvNvvNU.method_1562().method_2871(var0) == null && (uUnuvNvvNU.field_1687 == null || uUnuvNvvNU.field_1687.method_18470(var0) == null)
         );
      }
   }

   private boolean UuUVuuUu(UUID var1, int var2) {
      return uUnuvNvvNU.field_1724 != null && var1.equals(uUnuvNvvNU.field_1724.method_5667()) || var2 > 0;
   }

   private void UuUVuuUu(UUID var1) {
      C00OOC00oO(var1);
      this.NnUuNNU.remove(var1);
      this.nNvNUVU.remove(var1);
   }

   private static void C00OOC00oO(UUID var0) {
      if (var0 != null) {
         uNnUnnuNUnNu.add(var0);
         uVunuUNVVUUV.remove(var0);
      }
   }

   private static boolean vVvUvVVuuNvV(class_1657 var0) {
      if (var0 == null) {
         return false;
      } else {
         UUID var1 = var0.method_5667();
         if (uNnUnnuNUnNu.contains(var1)) {
            return true;
         } else if (uUnuvNvvNU.field_1724 != null && var1.equals(uUnuvNvvNU.field_1724.method_5667())) {
            C00OOC00oO(var1);
            return true;
         } else if (uUnuvNvvNU.method_1562() == null) {
            return false;
         } else {
            class_640 var2 = uUnuvNvvNU.method_1562().method_2871(var1);
            if (var2 != null && var2.method_2959() > 0) {
               C00OOC00oO(var1);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   public static boolean UuUVuuUu(class_1657 var0) {
      if (!UNnVVNvvnVvU) {
         return false;
      } else if (vVvUvVVuuNvV(var0)) {
         return false;
      } else if (uVunuUNVVUUV.contains(var0.method_5667())) {
         return true;
      } else {
         String var1 = var0.method_5477().getString();
         if (var1.startsWith("CIT-") && !var1.contains("NPC") && !var1.startsWith("[ZNPC]")) {
            return true;
         } else {
            return var0.method_5767() && !var1.contains("NPC") && !var1.startsWith("[ZNPC]")
               ? !var0.method_5667().equals(UUID.nameUUIDFromBytes(("OfflinePlayer:" + var1).getBytes()))
               : false;
         }
      }
   }
}
