package org.zenith.module;

import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.util.CooldownTimer;
import org.zenith.module.Module;
import org.zenith.core.TextScanner;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.FriendStore;

import org.zenith.event.EventTick;
import org.zenith.event.PacketEvent;

import org.zenith.setting.ModeSetting3;
import org.zenith.setting.ModeSetting3_Var159;



import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;

@ModuleInfo(
   name = "AutoDuels",
   category = Category.MISC,
   description = "\u041a\u0438\u0434\u0430\u0435\u0442 \u0434\u0443\u044d\u043b\u044c \u043d\u0430 RW"
)
public final class AutoDuels extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoDuels autoDuels = new AutoDuels();
   public static final Pattern pattern = Pattern.compile("(?!)"); // TODO reconstructed: never matches
   public final ModeSetting3 mode = new ModeSetting3("module.autoDuels.mode", "module.autoDuels.mode.desc");
   public final ModeSetting3_Var159 modeSetting3Var15923 = new ModeSetting3_Var159(
      this.mode, "module.autoDuels.shield"
   );
   public final ModeSetting3_Var159 modeSetting3Var15924 = new ModeSetting3_Var159(
      this.mode, "module.autoDuels.shipi"
   );
   public final ModeSetting3_Var159 modeSetting3Var15925 = new ModeSetting3_Var159(
      this.mode, "module.autoDuels.bow"
   );
   public final ModeSetting3_Var159 modeSetting3Var15926 = new ModeSetting3_Var159(
      this.mode, "module.autoDuels.totem"
   );
   public final ModeSetting3_Var159 modeSetting3Var15927 = new ModeSetting3_Var159(
      this.mode, "module.autoDuels.noDebuff"
   );
   public final ModeSetting3_Var159 modeSetting3Var15928 = new ModeSetting3_Var159(
      this.mode, "module.autoDuels.balls"
   );
   public final ModeSetting3_Var159 modeSetting3Var15929 = new ModeSetting3_Var159(
         this.mode, "module.autoDuels.classik"
      )
      .int210();
   public final ModeSetting3_Var159 modeSetting3Var15930 = new ModeSetting3_Var159(
      this.mode, "module.autoDuels.cheats"
   );
   public final ModeSetting3_Var159 modeSetting3Var15931 = new ModeSetting3_Var159(
      this.mode, "module.autoDuels.nezer"
   );
   public final CooldownTimer zClass0677 = new CooldownTimer();
   public final List<String> list7 = new ArrayList<>();

   public AutoDuels() {
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      var arraylist = new ArrayList();
      Collections.shuffle(arraylist);

      for (PlayerListEntry playerlistentry : minecraftClient3.player.networkHandler.getPlayerList()) {
         arraylist.add(playerlistentry.getProfile().getName());
      }

      for (String s1 : (Iterable<String>)(Object)(arraylist)) {
         if (this.FriendStore(s1)
            && this.zClass0677.EventModifyMouseRotationInput(750L)
            && !this.list7.contains(s1)
            && !s1.equals(minecraftClient3.player.getNameForScoreboard())) {
            minecraftClient3.player.networkHandler.sendChatCommand("duel " + s1);
            this.list7.add(s1);
            this.zClass0677.reset();
         }
      }

      if (minecraftClient3.player.currentScreenHandler instanceof GenericContainerScreenHandler) {
         String s = minecraftClient3.currentScreen.getTitle().getString();
         if (s.contains("\u0412\u044b\u0431\u043e\u0440 \u043d\u0430\u0431\u043e\u0440\u0430")) {
            minecraftClient3.interactionManager
               .clickSlot(
                  minecraftClient3.player.currentScreenHandler.syncId,
                  this.mode.getValues().indexOf(this.mode.getRandomEnabledElement()),
                  0,
                  SlotActionType.PICKUP,
                  minecraftClient3.player
               );
         } else if (s.contains("\u041d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430 \u043f\u043e\u0435\u0434\u0438\u043d\u043a\u0430")) {
            minecraftClient3.interactionManager
               .clickSlot(minecraftClient3.player.currentScreenHandler.syncId, 0, 0, SlotActionType.PICKUP, minecraftClient3.player);
         }
      }
   }

   public boolean FriendStore(String var1) {
      return var1 != null && pattern.matcher(var1).matches();
   }

   @EventTarget
   public void TextScanner(PacketEvent var1) {
      if (var1.Arrows()) {
         if (var1.ItemScroller() instanceof GameMessageS2CPacket gamemessages2cpacket) {
            String s = gamemessages2cpacket.content().getString();
            if (s.contains("\u041f\u0440\u0438\u043d\u044f\u043b") && !s.contains("\u043d\u0435 \u043f\u0440\u0438\u043d\u044f\u043b")) {
               this.list7.clear();
               this.toggle();
            }

            if (s.contains("\u0434\u0443\u044d\u043b\u044c")
               && (
                  s.contains("\u043d\u0430\u0439\u0434\u0435\u043d\u0430")
                     || s.contains("\u043d\u0430\u0447\u0430\u043b\u0430\u0441\u044c")
                     || s.contains("\u0441\u0442\u0430\u0440\u0442")
               )) {
               this.list7.clear();
               this.toggle();
            }

            if (s.contains("\u043f\u043e\u0431\u0435\u0434\u0438\u043b")
               || s.contains("\u043f\u0440\u043e\u0438\u0433\u0440\u0430\u043b")
               || s.contains("\u043d\u0438\u0447\u044c\u044f")) {
               this.list7.clear();
               this.toggle();
            }

            if (s.contains("\u0411\u0430\u043b\u0430\u043d\u0441")
               || s.contains("\u043e\u0442\u043a\u043b\u044e\u0447\u0438\u043b \u0437\u0430\u043f\u0440\u043e\u0441\u044b")) {
               var1.cancel();
            }
         }
      }
   }

   @Override
   public void onEnable() {
      if (minecraftClient3.player == null) {
         this.setEnabled(false);
      } else {
         this.zClass0677.reset();
         super.onEnable();
      }
   }
}
