package org.wild.mixin;

import java.util.List;
import java.util.Set;
import net.minecraft.class_10889;
import net.minecraft.class_1920;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2397;
import net.minecraft.class_2680;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_776;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.uuUnvvnNUU;

@Mixin({class_776.class})
public class BlockRenderManagerMixin {
   private static final Set<class_2248> GRASS_BLOCKS = Set.of(
      class_2246.field_10479,
      class_2246.field_10214,
      class_2246.field_10112,
      class_2246.field_10313,
      class_2246.field_56562,
      class_2246.field_56563,
      class_2246.field_10376,
      class_2246.field_10238,
      class_2246.field_10128
   );
   private static final Set<class_2248> PLANT_BLOCKS = Set.of(
      class_2246.field_10182,
      class_2246.field_10449,
      class_2246.field_10086,
      class_2246.field_10226,
      class_2246.field_10573,
      class_2246.field_10270,
      class_2246.field_10048,
      class_2246.field_10156,
      class_2246.field_10315,
      class_2246.field_10554,
      class_2246.field_9995,
      class_2246.field_10548,
      class_2246.field_10606,
      class_2246.field_10583,
      class_2246.field_10378,
      class_2246.field_10430,
      class_2246.field_10003,
      class_2246.field_10588,
      class_2246.field_10251,
      class_2246.field_10559,
      class_2246.field_10354,
      class_2246.field_10151,
      class_2246.field_9981,
      class_2246.field_10162,
      class_2246.field_10365,
      class_2246.field_10598,
      class_2246.field_10249,
      class_2246.field_10400,
      class_2246.field_10061,
      class_2246.field_10074,
      class_2246.field_10358,
      class_2246.field_10273,
      class_2246.field_9998,
      class_2246.field_10138,
      class_2246.field_10324,
      class_2246.field_10018,
      class_2246.field_10424,
      class_2246.field_10029,
      class_2246.field_56564,
      class_2246.field_10211,
      class_2246.field_10108,
      class_2246.field_10586,
      class_2246.field_9993,
      class_2246.field_10463,
      class_2246.field_10597,
      class_2246.field_22123,
      class_2246.field_22124,
      class_2246.field_23078,
      class_2246.field_23079,
      class_2246.field_28675,
      class_2246.field_28676,
      class_2246.field_16999,
      class_2246.field_9974,
      class_2246.field_10293,
      class_2246.field_10609,
      class_2246.field_10247,
      class_2246.field_10341
   );
   private static final Set<class_2248> SNOW_BLOCKS = Set.of(class_2246.field_10477, class_2246.field_10491, class_2246.field_27879);

   @Inject(
      method = {"renderBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void litka$skipHeavyBlocks(
      class_2680 var1, class_2338 var2, class_1920 var3, class_4587 var4, class_4588 var5, boolean var6, List<class_10889> var7, CallbackInfo var8
   ) {
      class_2248 var9 = var1.method_26204();
      if (uuUnvvnNUU.C00OOC00oO("Трава") && GRASS_BLOCKS.contains(var9)) {
         var8.cancel();
      } else if (uuUnvvnNUU.C00OOC00oO("Растения и цветы") && PLANT_BLOCKS.contains(var9)) {
         var8.cancel();
      } else if (uuUnvvnNUU.C00OOC00oO("Листва") && var9 instanceof class_2397) {
         var8.cancel();
      } else {
         if (uuUnvvnNUU.C00OOC00oO("Снег (покров)") && SNOW_BLOCKS.contains(var9)) {
            var8.cancel();
         }
      }
   }
}
