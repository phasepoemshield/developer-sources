package org.zenith.module;

import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.EffectEngine;

import org.zenith.event.ItemUseEvent;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.ModeSetting3_Var159;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.util.Hand;

@ModuleInfo(
   name = "NoSlow",
   category = Category.MOVEMENT,
   description = "\u0423\u0431\u0438\u0440\u0430\u0435\u0442 \u0437\u0430\u043c\u0435\u0434\u043b\u0435\u043d\u0438\u0435 \u0432\u043e \u0432\u0440\u0435\u043c\u044f \u0435\u0434\u044b"
)
public final class NoSlow extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final NoSlow noSlow = new NoSlow();
   public final ModeSetting3 mode11 = new ModeSetting3("module.noSlow.mode", "module.noSlow.mode.desc");
   public final ModeSetting3_Var159 modeSetting3Var15939 = new ModeSetting3_Var159(
      this.mode11, "module.noSlow.mode.grimNew"
   );
   public final ModeSetting3_Var159 modeSetting3Var15940 = new ModeSetting3_Var159(
         this.mode11, "module.noSlow.mode.grimOld"
      )
      .int210();
   public final BooleanSetting sprint = new BooleanSetting(
      "module.noSlow.sprint", "module.noSlow.sprint.desc", true, this.modeSetting3Var15940::isSelected
   );

   public NoSlow() {
   }

   @EventTarget
   public void on23(ItemUseEvent var1) {
      if (this.modeSetting3Var15939.isSelected() && minecraftClient3.player.getItemUseTime() % 2 == 0) {
         var1.setCancelled(true);
      }

      if (this.modeSetting3Var15940.isSelected()) {
         Hand hand = minecraftClient3.player.getActiveHand();
         if (this.sprint.isEnabled()) {
            minecraftClient3.player
               .setSprinting(
                  minecraftClient3.player.canSprint()
                     && minecraftClient3.player.isWalking()
                     && !minecraftClient3.player.isBlind()
                     && !minecraftClient3.player.isGliding()
                     && (!minecraftClient3.player.shouldSlowDown() || minecraftClient3.player.isSubmergedInWater())
               );
         }

         EffectEngine.useItem(hand.equals(Hand.MAIN_HAND) ? Hand.OFF_HAND : Hand.MAIN_HAND);
         var1.setCancelled(true);
      }
   }
}
