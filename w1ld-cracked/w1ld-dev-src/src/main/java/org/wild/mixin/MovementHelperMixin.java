package org.wild.mixin;

import baritone.api.BaritoneAPI;
import baritone.pathing.movement.MovementHelper;
import baritone.pathing.precompute.Ternary;
import java.util.List;
import net.minecraft.class_10;
import net.minecraft.class_2189;
import net.minecraft.class_2190;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2323;
import net.minecraft.class_2349;
import net.minecraft.class_2480;
import net.minecraft.class_2482;
import net.minecraft.class_2488;
import net.minecraft.class_2533;
import net.minecraft.class_2577;
import net.minecraft.class_2680;
import net.minecraft.class_3610;
import net.minecraft.class_4770;
import net.minecraft.class_5542;
import net.minecraft.class_5546;
import net.minecraft.class_5800;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin({MovementHelper.class})
public interface MovementHelperMixin {
   @Overwrite
   static Ternary a(class_2680 var0) {
      class_2248 var1 = var0.method_26204();
      if (var1 instanceof class_2189 || var1 instanceof class_2533) {
         return Ternary.a;
      } else if (var1 instanceof class_4770
         || var1 == class_2246.field_10589
         || var1 == class_2246.field_10343
         || var1 == class_2246.field_10027
         || var1 == class_2246.field_10302
         || var1 instanceof class_2190
         || var1 == class_2246.field_10422
         || var1 instanceof class_2480
         || var1 instanceof class_2482
         || var1 == class_2246.field_21211
         || var1 == class_2246.field_10455
         || var1 == class_2246.field_16999
         || var1 == class_2246.field_28048
         || var1 instanceof class_5542
         || var1 instanceof class_5800) {
         return Ternary.c;
      } else if (var1 == class_2246.field_28682) {
         return Ternary.c;
      } else if (var1 == class_2246.field_27879) {
         return Ternary.c;
      } else if (((List)BaritoneAPI.getSettings().blocksToAvoid.value).contains(var1)) {
         return Ternary.c;
      } else if (!(var1 instanceof class_2323) && !(var1 instanceof class_2349)) {
         if (var1 instanceof class_2577) {
            return Ternary.b;
         } else if (var1 instanceof class_2488) {
            return Ternary.b;
         } else {
            class_3610 var2 = var0.method_26227();
            if (!var2.method_15769()) {
               return var2.method_15772().method_15779(var2) != 8 ? Ternary.c : Ternary.b;
            } else if (var1 instanceof class_5546) {
               return Ternary.c;
            } else {
               return var0.method_26171(class_10.field_50) ? Ternary.a : Ternary.c;
            }
         }
      } else {
         return var1 == class_2246.field_9973 ? Ternary.c : Ternary.a;
      }
   }
}
