package org.zenith.setting;

import org.zenith.event.ItemUseEvent;

import org.zenith.core.NpcCloneManager;
import org.zenith.ZenithClient;
import org.zenith.event.ItemUseEvent;
import org.zenith.core.TradeGuardService;
import org.zenith.core.BotFeatureRegistry;


import java.util.function.Predicate;

public abstract class BooleanSetting2_Var159 {
   public final int int120;

   public BooleanSetting2_Var159() {
      this.int120 = Integer.MAX_VALUE;
   }

   public abstract boolean ItemUseEvent(String var1);

   public static BooleanSetting2_Var159 boolean120() {
      return new BooleanSetting2_Var159_1(Integer.MAX_VALUE);
   }

   public static BooleanSetting2_Var159 TradeGuardService(int var0) {
      return new BooleanSetting2_Var159_2(var0, var0);
   }

   public static BooleanSetting2_Var159 on23(int var0, Predicate<String> var1) {
      return new BooleanSetting2_Var159_3(var0, var1);
   }

   public BooleanSetting2_Var159(int var1) {
      this.int120 = var1;
   }

   public int getMaxLength() {
      return this.int120;
   }
}
