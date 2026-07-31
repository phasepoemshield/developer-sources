// Module: NameProtect
// Category: misc
// Original class: Nameprotect
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.serialization.JsonOps;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.Formatting;
import net.minecraft.world.GameMode;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.text.MutableText;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.TextCodecs;

@ModuleInfo(
   name = "NameProtect",
   category = Category.MISC,
   description = "Защищает имена игроков"
)
public final class Nameprotect extends Module {
   public static final Nameprotect l1I1I1l1lI11l111I1lI111llll1l = new Nameprotect();
   private final StringSetting Il1I11lll1I1IlI1lIl1 = new StringSetting(
      "Name", "module.nameProtect.nameSetting.desc", "Zenith", "name", StringSetting$II1Il11l111II11IIl.SocketFactoryHolder_2(16)
   );
   private final StringSetting lI1IlllllIIl1l1II = new StringSetting("gowno", "gowno", "hownp", () -> false);
   Text lI1lI11l11llIll1lI1l = null;
   Text II11l11Ill1;
   private int I1l1l1I1l11Il11IlI1 = Integer.MIN_VALUE;
   private final BooleanSetting I1IIl1IIlllI1Il11lI1I1I = new BooleanSetting(
      "Скрыть друзей", "module.nameProtect.hideFriends.desc", false
   );
   private final ButtonSetting II1l1ll1l1ll1l11IIII1Ill = new ButtonSetting(
      "module.nameProtect.openCommand",
      "K",
      "module.nameProtect.openCommand.desc",
      () -> l11I1I1ll1Illll1I1l1111l1II.setScreen(new net.minecraft.client.gui.screen.ChatScreen(".nameprotect "))
   );

   private Nameprotect() {
   }

   public boolean Illll1Il11Illl1Il1Ill1IlIIII() {
      return this.I1IIl1IIlllI1Il11lI1I1I.Spider();
   }

   public static String IIIlllllI1II1IIIll11I1() {
      return l1I1I1l1lI11l111I1lI111llll1l.Spider()
         ? l1I1I1l1lI11l111I1lI111llll1l.I1IIlI1l11IllIl().getValue()
         : l11I1I1ll1Illll1I1l1111l1II.player.getNameForScoreboard();
   }

   public Text ZenithInternal095(Text Text) {
      String s = l11I1I1ll1Illll1I1l1111l1II.player.getNameForScoreboard();
      String s1 = IIIlllllI1II1IIIll11I1();
      this.StringHolder_11(false);

      MutableText MutableText;
      try {
         Text Textx = this.StringHolder_8(Textx, s, s1);
         if (this.lI1lI11l11llIll1lI1l != null) {
            return StringHolder_21.StringHolder_8(Textx, s, this.lI1lI11l11llIll1lI1l.copy().append(Textx.copy()));
         }

         MutableText = StringHolder_21.EventBus(Textx, s, Textx);
      } finally {
         this.StringHolder_11(true);
      }

      return MutableText;
   }

   private Text StringHolder_8(Text Text, String s, String s1) {
      if (s1 != null && !s1.isEmpty()) {
         List list = this.StringHolder_8(Text, s);
         if (list.isEmpty()) {
            return Text.literal(s1);
         } else {
            MutableText MutableText = Text.empty();
            int i = 0;

            for (int j = 0; i < s1.length(); j++) {
               int k = s1.codePointAt(i);
               Style Style = (Style)list.get(Math.min(j, list.size() - 1));
               MutableText.append(Text.literal(new String(Character.toChars(k))).setStyle(Style));
               i += Character.charCount(k);
            }

            return MutableText;
         }
      } else {
         return Text.empty();
      }
   }

   private List<Style> StringHolder_8(Text Text, String s) {
      if (Text != null && s != null && !s.isEmpty()) {
         ArrayList arraylist = new ArrayList();
         ArrayList arraylist1 = new ArrayList();
         StringBuilder stringbuilder = new StringBuilder();
         Text.asOrderedText().accept((k1, Style, j1) -> {
            stringbuilder.appendCodePoint(j1);
            arraylist1.add(Style != null ? Style : Style.EMPTY);
            return true;
         });
         String s1 = stringbuilder.toString();
         int i = s1.indexOf(s);
         if (i == -1) {
            return arraylist;
         } else {
            int j = s1.codePointCount(0, i);
            int k = s.codePointCount(0, s.length());
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
   public void EventImpl_21(EventImpl_22 l11llilil1) {
      if (this.lI1IlllllIIl1l1II.getValue().isEmpty()) {
         this.lI1lI11l11llIll1lI1l = null;
         this.I1l1l1I1l11Il11IlI1 = Integer.MIN_VALUE;
      } else {
         try {
            String s = this.lI1IlllllIIl1l1II.getValue();
            int i = s.indexOf(32);
            if (i <= 0 || i >= s.length() - 1) {
               this.lI1lI11l11llIll1lI1l = null;
               this.I1l1l1I1l11Il11IlI1 = Integer.MIN_VALUE;
               return;
            }

            this.I1l1l1I1l11Il11IlI1 = Integer.parseInt(s.substring(0, i));
            JsonElement jsonelement = JsonParser.parseString(s.substring(i + 1));
            this.lI1lI11l11llIll1lI1l = (Text)TextCodecs.CODEC.parse(JsonOps.INSTANCE, jsonelement).result().orElse(Text.empty());
         } catch (Exception exception) {
            this.lI1lI11l11llIll1lI1l = null;
            this.I1l1l1I1l11Il11IlI1 = Integer.MIN_VALUE;
            exception.printStackTrace();
         }
      }
   }

   public Text EventTarget(PlayerListEntry PlayerListEntry) {
      return PlayerListEntry.getDisplayName() != null
         ? this.StringHolder_8(PlayerListEntry, PlayerListEntry.getDisplayName().copy())
         : this.StringHolder_8(
            PlayerListEntry, net.minecraft.scoreboard.Team.decorateName(PlayerListEntry.getScoreboardTeam(), Text.literal(PlayerListEntry.getProfile().getName()))
         );
   }

   private Text StringHolder_8(PlayerListEntry PlayerListEntry, MutableText MutableText) {
      return PlayerListEntry.getGameMode() == GameMode.SPECTATOR ? MutableText.formatted(Formatting.ITALIC) : MutableText;
   }

   @EventTarget
   public void StringHolder_8(TextHolder_2 l1li1l1111ii111i11l) {
      String s = this.TypeHolder(l1li1l1111ii111i11l.Shaderesp().getString());
      if (s != null) {
         l1li1l1111ii111i11l.StringHolder_8(StringHolder_21.EventBus(l1li1l1111ii111i11l.Shaderesp(), s, IIIlllllI1II1IIIll11I1()));
      }
   }

   public static String CreateGsonHandler(String s) {
      Nameprotect i1liliiiii11illil = l1I1I1l1lI11l111I1lI111llll1l;
      if (i1liliiiii11illil != null && i1liliiiii11illil.Spider() && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         String s1 = l11I1I1ll1Illll1I1l1111l1II.player.getNameForScoreboard();
         if (s.contains(s1)) {
            return s.replace(s1, l1I1I1l1lI11l111I1lI111llll1l.I1IIlI1l11IllIl().getValue());
         } else {
            if (i1liliiiii11illil instanceof Nameprotect i1liliiiii11illil1 && i1liliiiii11illil1.I1IIl1IIlllI1Il11lI1I1I.Spider()) {
               for (String s2 : ZenithClient.getInstance().StringHolder_26().getItems()) {
                  if (s.contains(s2)) {
                     return s.replace(s2, l1I1I1l1lI11l111I1lI111llll1l.I1IIlI1l11IllIl().getValue());
                  }
               }
            }

            return s;
         }
      } else {
         return s;
      }
   }

   private String TypeHolder(String s) {
      String s1 = l11I1I1ll1Illll1I1l1111l1II.player.getNameForScoreboard();
      if (s.contains(s1)) {
         return s1;
      } else {
         if (this.I1IIl1IIlllI1Il11lI1I1I.Spider()) {
            for (String s2 : ZenithClient.getInstance().StringHolder_26().getItems()) {
               if (s.contains(s2)) {
                  return s2;
               }
            }
         }

         return null;
      }
   }

   public void EventBus(JsonElement jsonelement, int i) {
      this.lI1IlllllIIl1l1II.booleanHolder_3(i + " " + jsonelement.toString());
      this.I1l1l1I1l11Il11IlI1 = i;
   }

   public void IIl11Il1II() {
      this.lI1IlllllIIl1l1II.booleanHolder_3("");
      this.I1l1l1I1l11Il11IlI1 = Integer.MIN_VALUE;
   }

   public StringSetting I1IIlI1l11IllIl() {
      return this.Il1I11lll1I1IlI1lIl1;
   }

   public Text ll1l1l1I1I() {
      return this.lI1lI11l11llIll1lI1l;
   }

   public int IIIIIlllIIlI1llIIIl11() {
      return this.I1l1l1I1l11Il11IlI1;
   }
}
