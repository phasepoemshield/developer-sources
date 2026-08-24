package org.zenith.module;

import org.zenith.core.ModuleSnapshotDto;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;

import org.zenith.event.GameMessageEvent;

import org.zenith.base.filemanager.impl.way.Way;
import org.zenith.base.filemanager.impl.way.WayManager;














import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.util.math.BlockPos;

@ModuleInfo(
   name = "EventTracker",
   category = Category.MISC,
   description = "module.eventTracker.desc"
)
public final class EventTracker extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final EventTracker eventTracker = new EventTracker();
   public static final Pattern pattern6 = Pattern.compile("(?!)(-?\\d+)\\s+(-?\\d+)"); // TODO reconstructed: never matches
   public static final Pattern pattern7 = Pattern.compile("(?!)(.*)"); // TODO reconstructed: never matches
   public static final Pattern pattern8 = Pattern.compile("(?!)(.*)"); // TODO reconstructed: never matches
   public static final Pattern pattern9 = Pattern.compile("(?!)(.*)"); // TODO reconstructed: never matches
   public String pendingName;
   public String string15;

   public EventTracker() {
   }

   @EventTarget
   public void onChatReceive(GameMessageEvent var1) {
      String s = var1.InventorySetting().getString();
      Matcher matcher = pattern7.matcher(s);
      String s1 = null;
      if (matcher.find()) {
         String s2 = matcher.group(1).trim();
         if (!s2.matches("[-\\d\\s]*")) {
            s1 = s2;
         }
      }

      if (s1 == null) {
         Matcher matcher1 = pattern8.matcher(s);
         if (matcher1.find()) {
            s1 = matcher1.group(1).trim();
         }
      }

      if (s1 == null) {
         Matcher matcher2 = pattern9.matcher(s);
         if (matcher2.find()) {
            s1 = matcher2.group(1).trim();
         }
      }

      Matcher matcher3 = pattern6.matcher(s);
      if (matcher3.find()) {
         String s4 = s1 != null ? s1 : this.pendingName;
         if (s4 != null) {
            int i = Integer.parseInt(matcher3.group(1));
            int j = Integer.parseInt(matcher3.group(2));
            int k = Integer.parseInt(matcher3.group(3));
            this.on23(s4, i, j, k);
            this.pendingName = null;
         }
      } else if (s1 != null) {
         this.pendingName = s1;
      } else if (s.contains("\u258d")) {
         String s3 = s.replace("\u258d", "").trim();
         if (!s3.isEmpty()
            && !s3.startsWith("\u0420\u0435\u0434\u043a\u043e\u0441\u0442\u044c")
            && !s3.startsWith("\u0423\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430")) {
            this.pendingName = s3;
         }
      }
   }

   public void on23(String var1, int var2, int var3, int var4) {
      WayManager waymanager = ZenithClient.on23().ModuleSnapshotDto();
      if (this.string15 != null) {
         waymanager.deleteWay(this.string15);
      }

      waymanager.deleteWay(var1);
      String s = minecraftClient3.getNetworkHandler() != null && minecraftClient3.getNetworkHandler().getServerInfo() != null
         ? minecraftClient3.getNetworkHandler().getServerInfo().address
         : "VANILLA";
      waymanager.addWay(new Way(var1, new BlockPos(var2, var3, var4), s));
      this.string15 = var1;
   }

   @Override
   public void onDisable() {
      this.pendingName = null;
      super.onDisable();
   }
}
