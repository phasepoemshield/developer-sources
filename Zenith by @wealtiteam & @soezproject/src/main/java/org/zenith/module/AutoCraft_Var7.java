package org.zenith.module;

import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.config.ConfigJsonUtil;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.CloudResponse;


import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.math.BlockPos;

final class AutoCraft_Var7 {
   public final AutoCraft val392;
   public final BlockPos blockPos23;
   public final List<AutoCraft_Var134> list41;
   public int int124;

   public AutoCraft_Var7(AutoCraft var1, BlockPos var2) {
      this.val392 = var1;
      this.list41 = new ArrayList<>();
      this.blockPos23 = var2;
   }

   public void on23(AutoCraft_Var134 var1) {
      if (var1.count() > 0) {
         this.list41.add(var1);
      }
   }

   public int ConfigJsonUtil(String var1, String var2) {
      int i = 0;

      for (AutoCraft_Var134 ii1iiil1ll111iii11ii1illlii1_l1iil11li : this.list41) {
         if (this.val392.on23(ii1iiil1ll111iii11ii1illlii1_l1iil11li, var1, var2)) {
            i += ii1iiil1ll111iii11ii1illlii1_l1iil11li.count();
         }
      }

      return i;
   }

   public boolean CloudResponse(String var1, String var2) {
      if (this.int124 > 0) {
         return true;
      } else {
         for (AutoCraft_Var134 ii1iiil1ll111iii11ii1illlii1_l1iil11li : this.list41) {
            if (this.val392.on23(ii1iiil1ll111iii11ii1illlii1_l1iil11li, var1, var2)
               && ii1iiil1ll111iii11ii1illlii1_l1iil11li.count() < ii1iiil1ll111iii11ii1illlii1_l1iil11li.double128()) {
               return true;
            }
         }

         return false;
      }
   }
}
