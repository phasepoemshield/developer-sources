package org.zenith.module;

import org.zenith.core.SimpleItemBuilder;
import org.zenith.core.PotionItemBuilder;
import org.zenith.core.ProfileItemBuilder;
import org.zenith.core.NbtEditor;
import org.zenith.core.EnchantItemSpec;
import org.zenith.core.ItemServiceBase;
import org.zenith.core.CloudApiClient;
import org.zenith.event.EventModifyMouseRotationInput;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.rotation.RotationLegitStrategy;
import org.zenith.rotation.RotationMLStrategy2;

import org.zenith.module.ModuleInfo;

import org.zenith.module.Category;
import org.zenith.util.CooldownTimer;
import org.zenith.module.Module;
import org.zenith.module.ModuleManager;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.core.ItemSpec;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.util.TextReplaceUtils;
import org.zenith.util.TextUtils;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.LocaleEntry;
import org.zenith.core.StyledTextBuilder;
import org.zenith.core.Translator;

import org.zenith.event.EventGetBasicProjectionMatrixHook2;
import org.zenith.event.EventTick;
import org.zenith.event.VelocityChangeEvent;




import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.Team;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;

@ModuleInfo(
   name = "StreamerMode",
   category = Category.MISC,
   description = "\u0421\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u0438\u043d\u0444\u043e \u0434\u043b\u044f \u0441\u0442\u0440\u0438\u043c\u0430"
)
public final class StreamerMode extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final StreamerMode streamerMode = new StreamerMode();
   public static final String[] val454 = {"Swift", "Silent", "Brave", "Lucky", "Shadow", "Iron", "Frost", "Ember"}; // TODO reconstructed
   public static final String[] val455 = {"Fox", "Wolf", "Raven", "Tiger", "Falcon", "Bear", "Viper", "Lynx"}; // TODO reconstructed
   public final List<StreamerMode_Var143> list78 = new ArrayList<>();
   public final Map<String, Integer> map33 = new HashMap<>();
   public boolean boolean142;
   public StreamerMode_Var159 streamerModeVar159 = StreamerMode_Var159.val070;
   public int int304 = -1;
   public int int305 = -1;
   public int int306 = -1;
   public Text text10;
   public Text text11;
   public Text text12;
   public Text text13;
   public String string78;
   public final CooldownTimer zClass06735 = new CooldownTimer();

   public StreamerMode() {
   }

   public void VelocityChangeEvent(int var1) {
      if (!this.isEnabled()) {
         StyledTextBuilder.RotationLegitStrategy("\u0421\u043d\u0430\u0447\u0430\u043b\u0430 \u0432\u043a\u043b\u044e\u0447\u0438 StreamerMode");
      } else if (minecraftClient3.player != null && minecraftClient3.player.networkHandler != null) {
         if (this.streamerModeVar159 != StreamerMode_Var159.val070) {
            StyledTextBuilder.RotationLegitStrategy("\u041f\u0430\u0440\u0441 \u0443\u0436\u0435 \u0438\u0434\u0451\u0442");
         } else {
            int i = ZenithClient.on23().CloudApiClient().getAnarchy();
            if (i == -1) {
               StyledTextBuilder.RotationMLStrategy2(
                  "\u041d\u0435 \u0432\u0438\u0436\u0443 \u043d\u043e\u043c\u0435\u0440 \u0442\u0435\u043a\u0443\u0449\u0435\u0439 \u0430\u043d\u0430\u0440\u0445\u0438\u0438, \u0437\u0430\u0439\u0434\u0438 \u043d\u0430 \u0430\u043d\u043a\u0443"
               );
            } else if (i == var1) {
               StyledTextBuilder.RotationMLStrategy2(
                  "\u0422\u044b \u0443\u0436\u0435 \u043d\u0430 \u0430\u043d"
                     + var1
                     + ", \u0432\u044b\u0431\u0435\u0440\u0438 \u0434\u0440\u0443\u0433\u0443\u044e"
               );
            } else {
               this.int305 = i;
               this.int304 = var1;
               this.boolean142 = false;
               this.call140();
               this.streamerModeVar159 = StreamerMode_Var159.val426;
               this.zClass06735.reset();
               this.EventGetBasicProjectionMatrixHook2(var1);
               StyledTextBuilder.RefreshCacheEvent(
                  "\u0418\u0434\u0443 \u043d\u0430 \u0430\u043d"
                     + var1
                     + " \u0437\u0430 \u0442\u0430\u0431\u043e\u043c, \u043f\u043e\u0442\u043e\u043c \u0432\u0435\u0440\u043d\u0443\u0441\u044c \u043d\u0430 \u0430\u043d"
                     + i
               );
            }
         }
      }
   }

   public void call180() {
      this.list78.clear();
      this.map33.clear();
      this.boolean142 = false;
      this.call140();
      this.streamerModeVar159 = StreamerMode_Var159.val070;
      StyledTextBuilder.RefreshCacheEvent("\u0421\u043f\u0430\u0440\u0448\u0435\u043d\u043d\u044b\u0439 \u0442\u0430\u0431 \u043e\u0447\u0438\u0449\u0435\u043d");
   }

   public void call140() {
      this.int306 = -1;
      this.text10 = null;
      this.text11 = null;
      this.text12 = null;
      this.text13 = null;
      this.string78 = null;
   }

   public int float235() {
      return this.int306;
   }

   public Text int366() {
      return this.text10;
   }

   public Text int367() {
      return this.text11;
   }

   public Text int368() {
      return this.text12;
   }

   public Text call228() {
      return this.text13;
   }

   public String call426() {
      return this.string78;
   }

   @EventTarget
   public void onUpdate(EventTick var1) {
      if (this.streamerModeVar159 != StreamerMode_Var159.val070
         && minecraftClient3.player != null
         && minecraftClient3.world != null) {
         int i = ZenithClient.on23().CloudApiClient().getAnarchy();
         switch (this.streamerModeVar159) {
            case val426:
               if (i == this.int304) {
                  this.streamerModeVar159 = StreamerMode_Var159.val427;
                  this.zClass06735.reset();
               } else if (this.zClass06735.EventModifyMouseRotationInput(60000L)) {
                  this.streamerModeVar159 = StreamerMode_Var159.val070;
                  StyledTextBuilder.RotationMLStrategy2(
                     "\u041d\u0435 \u0434\u043e\u0436\u0434\u0430\u043b\u0441\u044f \u0437\u0430\u0445\u043e\u0434\u0430 \u043d\u0430 \u0430\u043d"
                        + this.int304
                  );
               }
               break;
            case val427:
               int j = minecraftClient3.player.networkHandler.getListedPlayerListEntries().size();
               if (this.zClass06735.EventModifyMouseRotationInput(5000L) && j > 1 || this.zClass06735.EventModifyMouseRotationInput(15000L)) {
                  this.call281();
                  this.streamerModeVar159 = StreamerMode_Var159.val428;
                  this.zClass06735.reset();
                  this.EventGetBasicProjectionMatrixHook2(this.int305);
               }
               break;
            case val428:
               if (i == this.int305 || this.zClass06735.EventModifyMouseRotationInput(60000L)) {
                  this.streamerModeVar159 = StreamerMode_Var159.val070;
                  this.boolean142 = !this.list78.isEmpty();
                  if (this.boolean142) {
                     StyledTextBuilder.RefreshCacheEvent(
                        "\u0421\u043f\u0430\u0440\u0441\u0438\u043b "
                           + this.list78.size()
                           + " \u043d\u0438\u043a\u043e\u0432 \u0441 \u0430\u043d"
                           + this.int304
                           + ", \u0442\u0430\u0431 \u043f\u043e\u0434\u043c\u0435\u043d\u0451\u043d"
                     );
                  } else {
                     StyledTextBuilder.RotationMLStrategy2(
                        "\u0422\u0430\u0431 \u043d\u0430 \u0430\u043d"
                           + this.int304
                           + " \u0441\u043f\u0430\u0440\u0441\u0438\u0442\u044c \u043d\u0435 \u0432\u044b\u0448\u043b\u043e"
                     );
                  }
               }
         }
      }
   }

   public void EventGetBasicProjectionMatrixHook2(int var1) {
      if (ZenithClient.on23().CloudApiClient().call003()) {
         ZenithClient.on23().UiAnimation().reconnect(var1);
      } else {
         minecraftClient3.player.networkHandler.sendCommand("an" + var1);
      }
   }

   public void call281() {
      this.list78.clear();
      this.map33.clear();
      this.call140();
      String s = minecraftClient3.player.getNameForScoreboard();

      for (PlayerListEntry playerlistentry : minecraftClient3.inGameHud.getPlayerListHud().collectPlayerEntries()) {
         String s1 = playerlistentry.getProfile().getName();
         if (!s1.equals(s)) {
            MutableText mutabletext = NameProtect.nameProtect.Easing(playerlistentry).copy();
            this.list78.add(new StreamerMode_Var143(s1, mutabletext, this.Easing(mutabletext, s1)));
         }
      }

      this.call282();
   }

   public void call282() {
      if (minecraftClient3.player != null && minecraftClient3.world != null) {
         this.int306 = minecraftClient3.player.networkHandler.getListedPlayerListEntries().size();
         PlayerListHud playerlisthud = minecraftClient3.inGameHud.getPlayerListHud();
         this.text12 = TextUtils.ItemServiceBase(playerlisthud.header);
         if (this.text12 == null) {
            this.text12 = TextUtils.ItemServiceBase(playerlisthud.footer);
         }

         this.text13 = TextUtils.PotionItemBuilder(playerlisthud.header);
         if (this.text13 == null) {
            this.text13 = TextUtils.PotionItemBuilder(playerlisthud.footer);
         }

         if (this.text13 != null) {
            int i = TextUtils.ProfileItemBuilder(this.text13);
            if (i > 0) {
               this.int306 = i;
            }
         }

         Scoreboard scoreboard = minecraftClient3.world.getScoreboard();
         ScoreboardObjective scoreboardobjective = scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
         if (scoreboardobjective != null) {
            for (ScoreboardEntry scoreboardentry : scoreboard.getScoreboardEntries(scoreboardobjective)) {
               if (!scoreboardentry.hidden()) {
                  Team team = scoreboard.getScoreHolderTeam(scoreboardentry.owner());
                  MutableText mutabletext = Team.decorateName(team, scoreboardentry.name());
                  if (TextUtils.EnchantItemSpec(mutabletext)) {
                     this.text10 = mutabletext.copy();
                  } else if (TextUtils.SimpleItemBuilder(mutabletext)) {
                     this.text11 = mutabletext.copy();
                     int j = TextUtils.ProfileItemBuilder(mutabletext);
                     if (j > 0) {
                        this.int306 = j;
                     }
                  }
               }
            }
         }

         this.string78 = TextUtils.NbtEditor(this.text10);
         if (this.string78 == null) {
            this.string78 = TextUtils.NbtEditor(this.text12);
         }
      }
   }

   public boolean call082() {
      return this.isEnabled()
         && this.boolean142
         && this.streamerModeVar159 == StreamerMode_Var159.val070
         && !this.list78.isEmpty();
   }

   public Text ColorAnimator(PlayerListEntry var1) {
      if (this.call082() && var1 != null && minecraftClient3.player != null) {
         String s = var1.getProfile().getName();
         if (s.equals(minecraftClient3.player.getNameForScoreboard())) {
            return null;
         } else {
            StreamerMode_Var143 l1l1il1il1l11ii_l1i1illlili = this.Translator(s);
            return l1l1il1il1l11ii_l1i1illlili == null ? null : l1l1il1il1l11ii_l1i1illlili.call272().copy();
         }
      } else {
         return null;
      }
   }

   public String LocaleEntry(String var1) {
      if (!this.call082() || var1 == null || minecraftClient3.player == null) {
         return var1;
      } else if (var1.equals(minecraftClient3.player.getNameForScoreboard())) {
         return var1;
      } else {
         StreamerMode_Var143 l1l1il1il1l11ii_l1i1illlili = this.Translator(var1);
         return l1l1il1il1l11ii_l1i1illlili == null ? var1 : l1l1il1il1l11ii_l1i1illlili.call136();
      }
   }

   public Text UiAnimation(Text var1, String var2) {
      if (!this.call082() || var1 == null || var2 == null || minecraftClient3.player == null) {
         return var1;
      } else if (var2.equals(minecraftClient3.player.getNameForScoreboard())) {
         return var1;
      } else {
         StreamerMode_Var143 l1l1il1il1l11ii_l1i1illlili = this.Translator(var2);
         return (Text)(l1l1il1il1l11ii_l1i1illlili == null
            ? var1
            : TextReplaceUtils.on23(var1, var2, l1l1il1il1l11ii_l1i1illlili.string94().copy()));
      }
   }

   public Text ItemRegistry(Text var1) {
      if (this.call082()
         && var1 != null
         && minecraftClient3.player != null
         && minecraftClient3.player.networkHandler != null) {
         String s = var1.getString();
         String s1 = null;

         for (PlayerListEntry playerlistentry : minecraftClient3.player.networkHandler.getListedPlayerListEntries()) {
            String s2 = playerlistentry.getProfile().getName();
            if ((s1 == null || s2.length() > s1.length()) && s.contains(s2)) {
               s1 = s2;
            }
         }

         return s1 == null ? var1 : this.UiAnimation(var1, s1);
      } else {
         return var1;
      }
   }

   public void ItemSpec(List<PlayerListEntry> var1) {
      if (this.call082()) {
         for (PlayerListEntry playerlistentry : var1) {
            this.Translator(playerlistentry.getProfile().getName());
         }

         var1.sort(Comparator.comparingInt(var1x -> this.map33.getOrDefault(var1x.getProfile().getName(), Integer.MAX_VALUE)));
      }
   }

   public StreamerMode_Var143 Translator(String var1) {
      if (this.list78.isEmpty()) {
         return null;
      } else {
         Integer integer = this.map33.get(var1);
         if (integer == null) {
            integer = this.call283();
            this.map33.put(var1, integer);
         }

         return this.list78.get(integer);
      }
   }

   public int call283() {
      var hashset = new HashSet();
      if (minecraftClient3.player != null && minecraftClient3.player.networkHandler != null) {
         for (PlayerListEntry playerlistentry : minecraftClient3.player.networkHandler.getListedPlayerListEntries()) {
            Integer integer = this.map33.get(playerlistentry.getProfile().getName());
            if (integer != null) {
               hashset.add(integer);
            }
         }
      } else {
         hashset.addAll(this.map33.values());
      }

      for (int i = 0; i < this.list78.size(); i++) {
         if (!hashset.contains(i)) {
            return i;
         }
      }

      this.list78.add(this.call284());
      return this.list78.size() - 1;
   }

   public StreamerMode_Var143 call284() {
      String s = this.call285();
      MutableText mutabletext = Text.literal(s).setStyle(this.call181());
      return new StreamerMode_Var143(s, mutabletext, mutabletext);
   }

   public String call285() {
      ThreadLocalRandom threadlocalrandom = ThreadLocalRandom.current();

      for (int i = 0; i < 100; i++) {
         String s = this.on23(threadlocalrandom);
         if (s.length() <= 16 && !this.ModuleManager(s)) {
            return s;
         }
      }

      String s1 = "Player" + threadlocalrandom.nextInt(1000, 10000);

      while (this.ModuleManager(s1)) {
         s1 = "Player" + threadlocalrandom.nextInt(1000, 10000);
      }

      return s1;
   }

   public String on23(ThreadLocalRandom var1) {
      String s = val454[var1.nextInt(val454.length)];
      String s1 = val455[var1.nextInt(val455.length)];

      return switch (var1.nextInt(7)) {
         case 0 -> s + s1;
         case 1 -> s + s1 + var1.nextInt(1, 100);
         case 2 -> s + s1 + var1.nextInt(2007, 2013);
         case 3 -> s + "_" + s1;
         case 4 -> (s + s1).toLowerCase(Locale.ROOT);
         case 5 -> "_" + s + s1 + "_";
         default -> "x" + s + s1 + "x";
      };
   }

   public boolean ModuleManager(String var1) {
      for (StreamerMode_Var143 l1l1il1il1l11ii_l1i1illlili : this.list78) {
         if (l1l1il1il1l11ii_l1i1illlili.call136().equalsIgnoreCase(var1)) {
            return true;
         }
      }

      if (minecraftClient3.player != null && minecraftClient3.player.networkHandler != null) {
         for (PlayerListEntry playerlistentry : minecraftClient3.player.networkHandler.getListedPlayerListEntries()) {
            if (playerlistentry.getProfile().getName().equalsIgnoreCase(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   public Style call181() {
      for (StreamerMode_Var143 l1l1il1il1l11ii_l1i1illlili : this.list78) {
         if (l1l1il1il1l11ii_l1i1illlili.string94().getString().equals(l1l1il1il1l11ii_l1i1illlili.call136())) {
            Style[] astyle = new Style[1];
            l1l1il1il1l11ii_l1i1illlili.string94().asOrderedText().accept((var1, var2x, var3x) -> {
               astyle[0] = var2x;
               return false;
            });
            if (astyle[0] != null) {
               return astyle[0];
            }
         }
      }

      return Style.EMPTY;
   }

   public Text Easing(Text var1, String var2) {
      var arraylist = new ArrayList();
      StringBuilder stringbuilder = new StringBuilder();
      var1.asOrderedText().accept((var2x, var3x, var4x) -> {
         arraylist.add(Text.literal(new String(Character.toChars(var4x))).setStyle(var3x));
         stringbuilder.appendCodePoint(var4x);
         return true;
      });
      int i = stringbuilder.indexOf(var2);
      if (i == -1) {
         return var1.copy();
      } else {
         int j = stringbuilder.toString().codePointCount(0, i + var2.length());
         MutableText mutabletext = Text.empty();

         for (int k = 0; k < j && k < arraylist.size(); k++) {
            mutabletext.append((Text)arraylist.get(k));
         }

         return mutabletext;
      }
   }
}
