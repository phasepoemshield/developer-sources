package org.zenith.core;

import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.event.EventMouseButton;
import org.zenith.module.Arrows;
import org.zenith.module.ItemScroller;
import org.zenith.util.TextUtils;

import org.zenith.managers.CloudApi;
import org.zenith.ZenithClient;

import org.zenith.util.CooldownTimer;
import org.zenith.util.ScreenUtils;

import org.zenith.event.EventTick;
import org.zenith.event.PacketEvent;



import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import java.util.Locale;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class HolyWorldClient implements GameService {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final int int437 = 1;
   public static final int int438 = 18;
   public static final int int439 = 38;
   public static final int int440 = 39;
   public static final int int441 = 57;
   public static final int int442 = 58;
   public static final int int443 = 74;
   public final CooldownTimer zClass06739 = new CooldownTimer();
   public boolean lobby;
   public int anarchy;

   public HolyWorldClient() {
      EventManager.register(this);
   }

   public boolean isActive() {
      return this.anarchy != 0;
   }

   public boolean isHolyWorldHere() {
      return ZenithClient.on23().CloudApiClient().call003();
   }

   public boolean SpinMarker() {
      return ZenithClient.on23().CloudApiClient().soundEvent5();
   }

   public int currentAnarchyHere() {
      return ZenithClient.on23().CloudApiClient().getAnarchy();
   }

   @EventTarget
   public void onPacket(PacketEvent var1) {
      if (this.anarchy != 0 && var1.Arrows()) {
         if (var1.ItemScroller() instanceof GameMessageS2CPacket gamemessages2cpacket) {
            String s = gamemessages2cpacket.content().getString().toLowerCase(Locale.ROOT);
            if (!s.contains("\u0445\u0430\u0431") && s.contains("\u043d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c")) {
               CloudApi.TextUtils()
                  .on23(
                     "0",
                     Text.literal(
                        " \u041d\u0430 \u0434\u0430\u043d\u043d\u0443\u044e \u0430\u043d\u0430\u0440\u0445\u0438\u044e "
                           + Formatting.RED
                           + "\u043d\u0435\u043b\u044c\u0437\u044f"
                           + Formatting.RESET
                           + " \u0437\u0430\u0439\u0442\u0438"
                     )
                  );
               this.anarchy = 0;
               this.lobby = false;
            }
         }
      }
   }

   @EventTarget
   public void UiAnimation(EventTick var1) {
      if (this.anarchy != 0
         && minecraftClient3.player != null
         && minecraftClient3.player.networkHandler != null
         && minecraftClient3.world != null) {
         if (this.isHolyWorldHere() && !this.SpinMarker()) {
            int i = this.currentAnarchyHere();
            if (this.lobby) {
               if (i == -1) {
                  this.lobby = false;
                  this.zClass06739.reset();
               } else if (this.zClass06739.EventMouseButton(1500L)) {
                  minecraftClient3.player.networkHandler.sendChatCommand("hub");
               }
            } else if (i == this.anarchy) {
               this.anarchy = 0;
            } else {
               if (minecraftClient3.currentScreen instanceof GenericContainerScreen genericcontainerscreen
                  && genericcontainerscreen.getTitle()
                     .getString()
                     .toLowerCase(Locale.ROOT)
                     .contains("\u043b\u0430\u0439\u0442 \u0430\u043d\u0430\u0440\u0445\u0438\u0438")) {
                  if (System.currentTimeMillis() - ((RenderHook)minecraftClient3.currentScreen).zenithDLC_callGetStartTime() > 4000L) {
                     minecraftClient3.player.closeHandledScreen();
                  }

                  if (!this.zClass06739.EventModifyMouseRotationInput(500L)) {
                     return;
                  }

                  byte b1 = 0;
                  byte b0 = 1;
                  if (this.anarchy >= 18 && this.anarchy <= 38) {
                     b1 = 1;
                     b0 = 18;
                  } else if (this.anarchy >= 39 && this.anarchy <= 57) {
                     b1 = 2;
                     b0 = 39;
                  } else if (this.anarchy >= 58 && this.anarchy <= 74) {
                     b1 = 3;
                     b0 = 58;
                  }

                  if (genericcontainerscreen.getScreenHandler().getInventory().size() < 10) {
                     ScreenUtils.on23(b1, 0, SlotActionType.PICKUP, false);
                  } else {
                     ScreenUtils.on23(18 + this.anarchy - b0, 0, SlotActionType.PICKUP, false);
                     minecraftClient3.player.closeHandledScreen();
                  }

                  return;
               }

               if (this.zClass06739.EventMouseButton(3000L)) {
                  minecraftClient3.player.networkHandler.sendChatCommand("lite");
               }
            }
         } else {
            this.anarchy = 0;
            this.lobby = false;
         }
      }
   }

   public void reconnect(int var1) {
      if (var1 >= 1 && var1 <= 74) {
         this.anarchy = var1;
         this.lobby = true;
         this.zClass06739.reset();
      } else {
         CloudApi.TextUtils()
            .on23("[RCT]", Text.literal(" \u041d\u0435 \u0432\u0435\u0440\u043d\u044b\u0439 " + Formatting.RED + "\u043b\u0430\u0439\u0442"));
      }
   }
}
