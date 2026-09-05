package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1839;
import net.minecraft.class_1844;
import net.minecraft.class_1890;
import net.minecraft.class_2561;
import net.minecraft.class_2663;
import net.minecraft.class_2783;
import net.minecraft.class_6880;
import net.minecraft.class_9334;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "UseTracker",
   uUnuvNvvNU = oOOOo0.Misc,
   C00OOC00oO = "Отслеживание тотемов/эффектов/расходников у игроков"
)
public class UseTracker extends Module {
   private static final String NVNnnvnuunNv = "Снос тотема";
   private static final String uVunuUNVVUUV = "Полученные зелья";
   private static final String UNnVVNvvnVvU = "Съеденные предметы";
   private static final int uNnUnnuNUnNu = 31;
   private static final long NnUuNNU = 500L;
   private final VUVnvvnNN nNvNUVU = new VUVnvvnNN(
      "Отслеживать", new vvNnnUNnVvn("Снос тотема", true), new vvNnnUNnVvn("Полученные зелья", true), new vvNnnUNnVvn("Съеденные предметы", true)
   );
   private final Map<UUID, Map<String, class_1293>> UnUNuUU = new HashMap<>();
   private static final Map<UUID, Boolean> uUVuVvuNUvnu = new HashMap<>();
   private final Map<UUID, class_1799> UvUvUNuvNU = new HashMap<>();
   private final Map<UUID, Integer> c0oOOCcCoC0 = new HashMap<>();
   private final VuNvNNvVV VVnVNnunVvu = new VuNvNNvVV();

   public UseTracker() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.nNvNUVU});
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         if (this.UvnvNVnnnnNU()) {
            this.UuuNnUvUuv();
         } else {
            this.UvUvUNuvNU.clear();
            this.c0oOOCcCoC0.clear();
         }

         if (!this.vNVuvnUUnuUn()) {
            this.UnUNuUU.clear();
         } else if (this.VVnVNnunVvu.uNNnnnuuuN(500L)) {
            this.VVnVNnunVvu.UuUVuuUu();
            this.nUUVuvU();
         }
      } else {
         this.uVUVnuvnuVuv();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (var1.uNNnnnuuuN().equals(uvUUuvnunU.NVnVnNnN.RECEIVE) && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724 != null) {
         if (var1.vVvUvVVuuNvV() instanceof class_2663 var2) {
            this.UuUVuuUu(var2);
         }

         if (var1.vVvUvVVuuNvV() instanceof class_2783 var4) {
            this.UuUVuuUu(var4);
         }
      }
   }

   private void UuuNnUvUuv() {
      HashSet var1 = new HashSet();

      for (class_1657 var3 : uUnuvNvvNU.field_1687.method_18456()) {
         if (var3 != null && var3.method_5805() && !this.C00OOC00oO(var3)) {
            UUID var4 = var3.method_5667();
            var1.add(var4);
            if (var3.method_6115()) {
               this.UvUvUNuvNU.computeIfAbsent(var4, var1x -> var3.method_6030().method_7972());
               this.c0oOOCcCoC0.putIfAbsent(var4, var3.field_6012);
            } else {
               class_1799 var5 = this.UvUvUNuvNU.remove(var4);
               Integer var6 = this.c0oOOCcCoC0.remove(var4);
               if (var5 != null && !var5.method_7960() && var6 != null && var3.field_6012 - var6 >= 31) {
                  class_1839 var7 = var5.method_7976();

                  String var8 = switch (var7) {
                     case field_8946 -> "выпил";
                     case field_8950 -> "съел";
                     default -> null;
                  };
                  if (var8 != null) {
                     String var9 = this.UuUVuuUu(var5.method_7964().getString());
                     String var10 = this.UuUVuuUu(var5);
                     String var11 = var10.isEmpty() ? "" : " §8(§7" + var10 + "§8)";
                     this.C00OOC00oO("§f" + var3.method_5477().getString() + "§7 " + var8 + " §f" + var9 + var11);
                  }
               }
            }
         }
      }

      this.UvUvUNuvNU.keySet().removeIf(var1x -> !var1.contains(var1x));
      this.c0oOOCcCoC0.keySet().removeIf(var1x -> !var1.contains(var1x));
   }

   private void UuUVuuUu(class_2663 var1) {
      if (this.UnUNVVVNuv() && var1.method_11470() == 35) {
         if (var1.method_11469(uUnuvNvvNU.field_1687) instanceof class_1657 var3 && !this.C00OOC00oO(var3)) {
            boolean var4 = class_1890.method_58117(var3.method_6079())
               || class_1890.method_58117(var3.method_6047())
               || var3.method_6079().method_7958()
               || var3.method_6047().method_7958();
            uUVuVvuNUvnu.put(var3.method_5667(), var4);
            this.C00OOC00oO("§f" + var3.method_5477().getString() + "§7 потерял тотем бессмертия, зачарован: " + (var4 ? "§a" : "§c") + "⬤");
         }
      }
   }

   private void UuUVuuUu(class_2783 var1) {
      if (this.vNVuvnUUnuUn()) {
         if (uUnuvNvvNU.field_1687.method_8469(var1.method_11943()) instanceof class_1657 var3) {
            UUID var4 = var3.method_5667();
            HashMap var5 = new HashMap<>(this.UnUNuUU.getOrDefault(var4, Map.of()));
            var5.putAll(this.UuUVuuUu(var3));
            class_1293 var6 = new class_1293(
               var1.method_11946(), var1.method_11944(), var1.method_11945(), var1.method_11950(), var1.method_11949(), var1.method_11942()
            );
            String var7 = this.UuUVuuUu(var1.method_11946(), var1.method_11945());
            var5.put(var7, var6);
            HashSet var8 = new HashSet();
            var8.add(var7);
            this.UuUVuuUu(var3, var5, var8);
            this.UnUNuUU.put(var4, var5);
         }
      }
   }

   private void nUUVuvU() {
      HashSet var1 = new HashSet();

      for (class_1657 var3 : uUnuvNvvNU.field_1687.method_18456()) {
         if (var3 != null && var3.method_5805()) {
            UUID var4 = var3.method_5667();
            var1.add(var4);
            Map var5 = this.UnUNuUU.getOrDefault(var4, Map.of());
            Map var6 = this.UuUVuuUu(var3);
            HashSet var7 = new HashSet();

            for (Entry var9 : var6.entrySet()) {
               class_1293 var10 = (class_1293)var5.get(var9.getKey());
               if (var10 == null || this.UuUVuuUu(var10, (class_1293)var9.getValue())) {
                  var7.add((String)var9.getKey());
               }
            }

            if (!var7.isEmpty()) {
               this.UuUVuuUu(var3, var6, var7);
            }

            this.UnUNuUU.put(var4, var6);
         }
      }

      this.UnUNuUU.keySet().removeIf(var1x -> !var1.contains(var1x));
   }

   private boolean UuUVuuUu(class_1293 var1, class_1293 var2) {
      return var1.method_5578() != var2.method_5578() ? true : var2.method_5584() > var1.method_5584() + 20;
   }

   private void UuUVuuUu(class_1657 var1, Map<String, class_1293> var2, Set<String> var3) {
      ArrayList var4 = new ArrayList();
      this.UuUVuuUu(var2, var3, var4, UseTracker.nvnNNunvv.KILLER, "effect.minecraft.strength:3", "effect.minecraft.resistance:0");
      this.UuUVuuUu(var2, var3, var4, UseTracker.nvnNNunvv.URINE, "effect.minecraft.jump_boost:0", "effect.minecraft.speed:2");
      this.UuUVuuUu(var2, var3, var4, UseTracker.nvnNNunvv.MEDIC, "effect.minecraft.health_boost:2", "effect.minecraft.regeneration:2");
      this.UuUVuuUu(
         var2,
         var3,
         var4,
         UseTracker.nvnNNunvv.BURP,
         "effect.minecraft.blindness:0",
         "effect.minecraft.glowing:0",
         "effect.minecraft.hunger:9",
         "effect.minecraft.slowness:2",
         "effect.minecraft.wither:4"
      );
      this.UuUVuuUu(var2, var3, var4, UseTracker.nvnNNunvv.FLASH, "effect.minecraft.blindness:0", "effect.minecraft.glowing:0");
      this.UuUVuuUu(
         var2,
         var3,
         var4,
         UseTracker.nvnNNunvv.SULFURIC_ACID,
         "effect.minecraft.poison:1",
         "effect.minecraft.slowness:3",
         "effect.minecraft.weakness:2",
         "effect.minecraft.wither:4"
      );
      this.UuUVuuUu(
         var2,
         var3,
         var4,
         UseTracker.nvnNNunvv.WINNER,
         "effect.minecraft.health_boost:1",
         "effect.minecraft.invisibility:0",
         "effect.minecraft.regeneration:1",
         "effect.minecraft.resistance:0"
      );
      if (var4.isEmpty()) {
         for (String var9 : var3) {
            class_1293 var7 = (class_1293)var2.get(var9);
            if (var7 != null) {
               this.UuUVuuUu(var1, var7);
            }
         }
      } else {
         for (UseTracker.nvnNNunvv var6 : var4) {
            this.UuUVuuUu(var1, var6);
         }
      }
   }

   private void UuUVuuUu(class_1657 var1, class_1293 var2) {
      String var3 = this.UuUVuuUu(class_2561.method_43471(((class_1291)var2.method_5579().comp_349()).method_5567()).getString());
      int var4 = Math.max(0, var2.method_5578()) + 1;
      String var5 = this.UuUVuuUu(var2);
      this.C00OOC00oO("§f" + var1.method_5477().getString() + "§7 получил §f" + var3 + " " + var4 + "§7 на §f" + var5);
   }

   private boolean UuUVuuUu(Map<String, class_1293> var1, Set<String> var2, List<UseTracker.nvnNNunvv> var3, UseTracker.nvnNNunvv var4, String... var5) {
      HashSet var6 = new HashSet<>(Arrays.asList(var5));
      boolean var7 = var6.stream().allMatch(var1::containsKey);
      boolean var8 = var6.stream().anyMatch(var2::contains);
      if (var7 && var8) {
         var3.add(var4);
         var2.removeAll(var6);
         return true;
      } else {
         return false;
      }
   }

   private Map<String, class_1293> UuUVuuUu(class_1657 var1) {
      HashMap var2 = new HashMap();

      for (class_1293 var4 : var1.method_6026()) {
         var2.put(this.UuUVuuUu(var4.method_5579(), var4.method_5578()), var4);
      }

      return var2;
   }

   private String UuUVuuUu(class_6880<class_1291> var1, int var2) {
      return ((class_1291)var1.comp_349()).method_5567() + ":" + var2;
   }

   private void UuUVuuUu(class_1657 var1, UseTracker.nvnNNunvv var2) {
      this.C00OOC00oO("§f" + var1.method_5477().getString() + "§7 получил §f" + this.UuUVuuUu(var2.UuUVuuUu));
   }

   private String UuUVuuUu(class_1799 var1) {
      class_1844 var2 = (class_1844)var1.method_58694(class_9334.field_49651);
      if (var2 == null) {
         return "";
      } else {
         StringBuilder var3 = new StringBuilder();

         for (class_1293 var5 : var2.method_57397()) {
            if (!var3.isEmpty()) {
               var3.append("§8, §7");
            }

            String var6 = this.UuUVuuUu(class_2561.method_43471(((class_1291)var5.method_5579().comp_349()).method_5567()).getString());
            int var7 = Math.max(0, var5.method_5578()) + 1;
            var3.append(var6).append(" ").append(var7).append("§7 на §f").append(this.UuUVuuUu(var5));
         }

         return var3.toString();
      }
   }

   private String UuUVuuUu(class_1293 var1) {
      if (var1.method_48559()) {
         return "∞";
      } else {
         int var2 = var1.method_5584() / 20;
         int var3 = var2 / 60;
         var2 %= 60;
         return var3 > 0 ? var3 + " мин " + var2 + " сек" : var2 + " сек";
      }
   }

   private boolean UnUNVVVNuv() {
      return this.nNvNUVU.C00OOC00oO("Снос тотема");
   }

   private boolean vNVuvnUUnuUn() {
      return this.nNvNUVU.C00OOC00oO("Полученные зелья");
   }

   private boolean UvnvNVnnnnNU() {
      return this.nNvNUVU.C00OOC00oO("Съеденные предметы");
   }

   private boolean C00OOC00oO(class_1657 var1) {
      return uUnuvNvvNU.field_1724 != null && var1.method_5667().equals(uUnuvNvvNU.field_1724.method_5667());
   }

   private String UuUVuuUu(String var1) {
      return var1 == null ? "" : var1.replaceAll("§[0-9a-fk-orA-FK-OR]", "");
   }

   private void C00OOC00oO(String var1) {
      vVnvuVVUunuv.UuUVuuUu(var1);
   }

   private void uVUVnuvnuVuv() {
      this.UnUNuUU.clear();
      uUVuVvuNUvnu.clear();
      this.UvUvUNuvNU.clear();
      this.c0oOOCcCoC0.clear();
   }

   @Override
   public void C00OOC00oO() {
      this.uVUVnuvnuVuv();
      super.C00OOC00oO();
   }

   record NVnVnNnN(class_6880<class_1291> effect, int durationSeconds, int amplifier) {
      int durationTicks() {
         return this.durationSeconds * 20;
      }
   }

   static enum nvnNNunvv {
      FLASH("§6[★] §eВспышка", List.of(new UseTracker.NVnVnNnN(class_1294.field_5919, 20, 0), new UseTracker.NVnVnNnN(class_1294.field_5912, 240, 0))),
      KILLER(
         "§4[★] §cЗелье Киллера", List.of(new UseTracker.NVnVnNnN(class_1294.field_5907, 180, 0), new UseTracker.NVnVnNnN(class_1294.field_5910, 90, 3))
      ),
      BURP(
         "§c[★] §6Зелье Отрыжки",
         List.of(
            new UseTracker.NVnVnNnN(class_1294.field_5919, 10, 0),
            new UseTracker.NVnVnNnN(class_1294.field_5912, 180, 0),
            new UseTracker.NVnVnNnN(class_1294.field_5903, 90, 9),
            new UseTracker.NVnVnNnN(class_1294.field_5909, 180, 2),
            new UseTracker.NVnVnNnN(class_1294.field_5920, 30, 4)
         )
      ),
      SULFURIC_ACID(
         "§2[★] §aСерная кислота",
         List.of(
            new UseTracker.NVnVnNnN(class_1294.field_5899, 50, 1),
            new UseTracker.NVnVnNnN(class_1294.field_5909, 90, 3),
            new UseTracker.NVnVnNnN(class_1294.field_5911, 90, 2),
            new UseTracker.NVnVnNnN(class_1294.field_5920, 30, 4)
         )
      ),
      MEDIC("§5[★] §dЗелье Медика", List.of(new UseTracker.NVnVnNnN(class_1294.field_5914, 45, 2), new UseTracker.NVnVnNnN(class_1294.field_5924, 45, 2))),
      WINNER(
         "§2[★] §aЗелье Победителя",
         List.of(
            new UseTracker.NVnVnNnN(class_1294.field_5914, 180, 1),
            new UseTracker.NVnVnNnN(class_1294.field_5905, 900, 0),
            new UseTracker.NVnVnNnN(class_1294.field_5924, 60, 1),
            new UseTracker.NVnVnNnN(class_1294.field_5907, 60, 0)
         )
      ),
      URINE("§3[★] §bМоча Флеша", List.of(new UseTracker.NVnVnNnN(class_1294.field_5913, 120, 1), new UseTracker.NVnVnNnN(class_1294.field_5904, 120, 2)));

      final String UuUVuuUu;
      private final List<UseTracker.NVnVnNnN> C00OOC00oO;

      private nvnNNunvv(String var3, List<UseTracker.NVnVnNnN> var4) {
         this.UuUVuuUu = var3;
         this.C00OOC00oO = var4;
      }
   }
}
