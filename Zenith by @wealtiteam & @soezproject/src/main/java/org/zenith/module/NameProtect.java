package org.zenith.module;

import org.zenith.core.MediaTrackInfo;
import org.zenith.core.TradeGuardService;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.TextScanner;
import org.zenith.core.Easing;
import org.zenith.util.TextReplaceUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.ItemStackStore;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.DiskStorage;

import org.zenith.event.EventTick;
import org.zenith.event.GameMessageEvent;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.BooleanSetting2;
import org.zenith.setting.BooleanSetting2_Var159;
import org.zenith.setting.StringSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.serialization.JsonOps;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextCodecs;
import net.minecraft.util.Formatting;
import net.minecraft.world.GameMode;

@ModuleInfo(
   name = "NameProtect",
   category = Category.MISC,
   description = "\u0417\u0430\u0449\u0438\u0449\u0430\u0435\u0442 \u0438\u043c\u0435\u043d\u0430 \u0438\u0433\u0440\u043e\u043a\u043e\u0432"
)
public final class NameProtect extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final NameProtect nameProtect = new NameProtect();
   public final BooleanSetting2 name = new BooleanSetting2(
      "Name", "module.nameProtect.nameSetting.desc", "Zenith", "name", BooleanSetting2_Var159.TradeGuardService(16)
   );
   public final BooleanSetting2 gowno = new BooleanSetting2("gowno", "gowno", "hownp", () -> false);
   Text text4 = null;
   Text val538;
   public int int214 = Integer.MIN_VALUE;
   public final BooleanSetting u0421U043aU0440U044bU0442U044cU0434U0440U0443U0437U0435U0439 = new BooleanSetting(
      "\u0421\u043a\u0440\u044b\u0442\u044c \u0434\u0440\u0443\u0437\u0435\u0439", "module.nameProtect.hideFriends.desc", false
   );
   public final StringSetting openCommand = new StringSetting(
      "module.nameProtect.openCommand",
      "K",
      "module.nameProtect.openCommand.desc",
      () -> minecraftClient3.setScreen(new ChatScreen(".nameprotect "))
   );

   public NameProtect() {
   }

   public boolean call057() {
      return this.u0421U043aU0440U044bU0442U044cU0434U0440U0443U0437U0435U0439.isEnabled();
   }

   public static String call029() {
      return nameProtect.isEnabled()
         ? nameProtect.call134().getValue()
         : minecraftClient3.player.getNameForScoreboard();
   }

   public Text ColorAnimator(Text var1) {
      String s = minecraftClient3.player.getNameForScoreboard();
      String s1 = call029();
      this.setEnabled(false);

      MutableText mutabletext;
      try {
         Text text = this.on23(var1, s, s1);
         if (this.text4 != null) {
            return TextReplaceUtils.on23(var1, s, this.text4.copy().append(text.copy()));
         }

         mutabletext = TextReplaceUtils.UiAnimation(var1, s, text);
      } finally {
         this.setEnabled(true);
      }

      return mutabletext;
   }

   public Text on23(Text var1, String var2, String var3) {
      if (var3 != null && !var3.isEmpty()) {
         var list = this.on23(var1, var2);
         if (list.isEmpty()) {
            return Text.literal(var3);
         } else {
            MutableText mutabletext = Text.empty();
            int i = 0;

            for (int j = 0; i < var3.length(); j++) {
               int k = var3.codePointAt(i);
               Style style = (Style)list.get(Math.min(j, list.size() - 1));
               mutabletext.append(Text.literal(new String(Character.toChars(k))).setStyle(style));
               i += Character.charCount(k);
            }

            return mutabletext;
         }
      } else {
         return Text.empty();
      }
   }

   public List<Style> on23(Text var1, String var2) {
      if (var1 != null && var2 != null && !var2.isEmpty()) {
         List<Style> arraylist = new ArrayList<>();
         var arraylist1 = new ArrayList();
         StringBuilder stringbuilder = new StringBuilder();
         var1.asOrderedText().accept((var2x, var3x, var4x) -> {
            stringbuilder.appendCodePoint(var4x);
            arraylist1.add(var3x != null ? var3x : Style.EMPTY);
            return true;
         });
         String s = stringbuilder.toString();
         int i = s.indexOf(var2);
         if (i == -1) {
            return arraylist;
         } else {
            int j = s.codePointCount(0, i);
            int k = var2.codePointCount(0, var2.length());
            int l = Math.min(j + k, arraylist1.size());

            for (int i1 = j; i1 < l; i1++) {
               arraylist.add((Style)arraylist1.get(i1));
            }

            return arraylist;
         }
      } else {
         return List.of();
      }
   }

   @EventTarget
   public void TextScanner(EventTick var1) {
      if (this.gowno.getValue().isEmpty()) {
         this.text4 = null;
         this.int214 = Integer.MIN_VALUE;
      } else {
         try {
            String s = this.gowno.getValue();
            int i = s.indexOf(32);
            if (i <= 0 || i >= s.length() - 1) {
               this.text4 = null;
               this.int214 = Integer.MIN_VALUE;
               return;
            }

            this.int214 = Integer.parseInt(s.substring(0, i));
            JsonElement jsonelement = JsonParser.parseString(s.substring(i + 1));
            this.text4 = TextCodecs.CODEC.parse(JsonOps.INSTANCE, jsonelement).result().orElse(Text.empty());
         } catch (Exception exception) {
            this.text4 = null;
            this.int214 = Integer.MIN_VALUE;
            exception.printStackTrace();
         }
      }
   }

   public Text Easing(PlayerListEntry var1) {
      return var1.getDisplayName() != null
         ? this.on23(var1, var1.getDisplayName().copy())
         : this.on23(var1, Team.decorateName(var1.getScoreboardTeam(), Text.literal(var1.getProfile().getName())));
   }

   public Text on23(PlayerListEntry var1, MutableText var2) {
      return var1.getGameMode() == GameMode.SPECTATOR ? var2.formatted(Formatting.ITALIC) : var2;
   }

   @EventTarget
   public void on23(GameMessageEvent var1) {
      String s = this.DiskStorage(var1.InventorySetting().getString());
      if (s != null) {
         var1.on23(TextReplaceUtils.UiAnimation(var1.InventorySetting(), s, call029()));
      }
   }

   public static String ItemStackStore(String var0) {
      NameProtect liiliil11ill1l1l1iiiiiix = nameProtect;
      if (liiliil11ill1l1l1iiiiiix != null && liiliil11ill1l1l1iiiiiix.isEnabled() && minecraftClient3.player != null) {
         String s = minecraftClient3.player.getNameForScoreboard();
         if (var0.contains(s)) {
            return var0.replace(s, nameProtect.call134().getValue());
         } else {
            if (liiliil11ill1l1l1iiiiiix.u0421U043aU0440U044bU0442U044cU0434U0440U0443U0437U0435U0439.isEnabled()) {
               for (String s1 : ZenithClient.on23().MediaTrackInfo().getItems()) {
                  if (var0.contains(s1)) {
                     return var0.replace(s1, nameProtect.call134().getValue());
                  }
               }
            }

            return var0;
         }
      } else {
         return var0;
      }
   }

   public String DiskStorage(String var1) {
      String s = minecraftClient3.player.getNameForScoreboard();
      if (var1.contains(s)) {
         return s;
      } else {
         if (this.u0421U043aU0440U044bU0442U044cU0434U0440U0443U0437U0435U0439.isEnabled()) {
            for (String s1 : ZenithClient.on23().MediaTrackInfo().getItems()) {
               if (var1.contains(s1)) {
                  return s1;
               }
            }
         }

         return null;
      }
   }

   public void UiAnimation(JsonElement var1, int var2) {
      this.gowno.setValue(var2 + " " + var1.toString());
      this.int214 = var2;
   }

   public void call105() {
      this.gowno.setValue("");
      this.int214 = Integer.MIN_VALUE;
   }

   public BooleanSetting2 call134() {
      return this.name;
   }

   public Text int440() {
      return this.text4;
   }

   public int call209() {
      return this.int214;
   }
}
