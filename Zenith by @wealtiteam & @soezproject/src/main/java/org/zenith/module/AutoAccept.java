package org.zenith.module;

import org.zenith.core.MediaTrackInfo;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;

import org.zenith.event.PacketEvent;

import org.zenith.setting.BooleanSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.Locale;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

@ModuleInfo(
   name = "AutoAccept",
   category = Category.MISC,
   description = "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043f\u0440\u0438\u043d\u0438\u043c\u0430\u0435\u0442 \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0430\u0446\u0438\u044e"
)
public final class AutoAccept extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final AutoAccept autoAccept = new AutoAccept();
   public final BooleanSetting onlyFriend = new BooleanSetting("module.autoAccept.onlyFriend", "module.autoAccept.onlyFriend.desc", false);

   public AutoAccept() {
   }

   @EventTarget
   public void onPacket(PacketEvent var1) {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         if (var1.Arrows()) {
            if (var1.ItemScroller() instanceof GameMessageS2CPacket gamemessages2cpacket) {
               String s1 = gamemessages2cpacket.content().getString().toLowerCase(Locale.ROOT);
               if (s1.contains("\u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f")
                  || s1.contains("has requested teleport")
                  || s1.contains(
                     "\u043f\u0440\u043e\u0441\u0438\u0442 \u043a \u0432\u0430\u043c \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f"
                  )) {
                  if (this.onlyFriend.isEnabled()) {
                     boolean flag = false;

                     for (String s : ZenithClient.on23().MediaTrackInfo().getItems()) {
                        if (s1.contains(s.toLowerCase(Locale.ROOT))) {
                           flag = true;
                           break;
                        }
                     }

                     if (!flag) {
                        return;
                     }
                  }

                  minecraftClient3.player.networkHandler.sendChatCommand("tpaccept");
               }
            }
         }
      }
   }
}
