package org.zenith.module;

import org.zenith.core.TradeGuardService;
import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.ZenithClient;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.util.CooldownTimer;
import org.zenith.util.ItemExt2;
import org.zenith.module.Module;
import org.zenith.util.ScoreboardHelper;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.EventTick;

import org.zenith.setting.BooleanSetting2;
import org.zenith.setting.BooleanSetting2_Var159;



import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;

@ModuleInfo(
   name = "AutoPay",
   category = Category.MISC,
   description = ""
)
public final class AutoPay extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoPay autoPay = new AutoPay();
   public static final long long21 = 5000L;
   public final BooleanSetting2 nick = new BooleanSetting2(
      "autopay.nick", "", "autopay.nick.empty", BooleanSetting2_Var159.TradeGuardService(16)
   );
   public final BooleanSetting2 maxAmount = new BooleanSetting2(
      "autopay.maxAmount",
      "100000",
      "autopay.maxAmount.empty",
      BooleanSetting2_Var159.on23(12, var0 -> var0.isEmpty() || var0.chars().allMatch(Character::isDigit))
   );
   public final CooldownTimer zClass06710 = new CooldownTimer();
   public long long22 = -1L;

   public AutoPay() {
   }

   @Override
   public void onEnable() {
      this.long22 = -1L;
      this.zClass06710.reset();
      super.onEnable();
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         long i = ScoreboardHelper.on23(
            minecraftClient3.world.getScoreboard(), minecraftClient3.player.getNameForScoreboard()
         );
         if (i >= 0L) {
            this.long22 = i;
         }

         if (this.long22 >= 0L) {
            String s = this.nick.getValue().trim();
            long j = ItemExt2(this.maxAmount.getValue().trim());
            if (!s.isEmpty() && j >= 0L) {
               long k = this.long22 - j;
               if (k > 0L && this.zClass06710.EventModifyMouseRotationInput(5000L)) {
                  minecraftClient3.player.networkHandler.sendChatCommand("pay " + s + " " + k);
                  this.zClass06710.reset();
               }
            }
         }
      }
   }

   public static long ItemExt2(String var0) {
      if (var0.isEmpty()) {
         return -1L;
      } else {
         try {
            return Long.parseLong(var0);
         } catch (NumberFormatException numberformatexception) {
            return -1L;
         }
      }
   }

   public long double129() {
      return this.long22;
   }
}
