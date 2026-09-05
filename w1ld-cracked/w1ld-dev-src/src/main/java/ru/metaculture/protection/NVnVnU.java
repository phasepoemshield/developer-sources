package ru.metaculture.protection;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_10185;
import net.minecraft.class_304;
import net.minecraft.class_3675;

public class NVnVnU implements O000c0oocoo {
   private static final NVnVnU C00OOC00oO = new NVnVnU();
   public final Set<String> UuUVuuUu = new HashSet<>();

   private NVnVnU() {
   }

   public static NVnVnU UuUVuuUu() {
      return C00OOC00oO;
   }

   public void UuUVuuUu(String var1) {
      if (a_.field_1724 != null && a_.field_1724.method_5805() && a_.field_1687 != null) {
         AttackAura.NUVvUUVuVNVv = true;
         this.UuUVuuUu.add(var1);
         this.UuUVuuUu(false);
         if (a_.field_1724.method_5624()) {
            a_.field_1724.method_5728(false);
         }

         if (a_.field_1724.field_3913 != null) {
            a_.field_1724.field_3913.field_54155 = class_10185.field_54098;
         }
      }
   }

   public void C00OOC00oO(String var1) {
      if (a_.field_1724 != null && a_.field_1724.method_5805() && a_.field_1687 != null) {
         this.UuUVuuUu.remove(var1);
         if (this.UuUVuuUu.isEmpty() && a_.field_1755 == null) {
            this.UuUVuuUu(true);
            AttackAura.NUVvUUVuVNVv = false;
         }
      }
   }

   private void UuUVuuUu(boolean var1) {
      if (a_.field_1690 != null && a_.method_22683() != null) {
         class_304[] var2 = new class_304[]{
            a_.field_1690.field_1894,
            a_.field_1690.field_1881,
            a_.field_1690.field_1913,
            a_.field_1690.field_1849,
            a_.field_1690.field_1903,
            a_.field_1690.field_1867
         };
         long var3 = a_.method_22683().method_4490();

         for (class_304 var8 : var2) {
            boolean var9 = var1 && class_3675.method_15987(var3, var8.method_1429().method_1444());
            var8.method_23481(var9);
         }
      }
   }
}
