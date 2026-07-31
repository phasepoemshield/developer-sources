package zenith.hud;

import java.util.List;
import java.util.stream.Collectors;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.text.MutableText;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ScoreboardEntry;
import net.minecraft.scoreboard.number.NumberFormat;
import net.minecraft.scoreboard.number.StyledNumberFormat;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class ScoreBoard extends HudElement {
   public ScoreBoard(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      net.minecraft.scoreboard.Scoreboard Scoreboard = l11I1I1ll1Illll1I1l1111l1II.world.getScoreboard();
      net.minecraft.scoreboard.ScoreboardObjective ScoreboardObjectivex = null;
      net.minecraft.scoreboard.Team Team = Scoreboard.getScoreHolderTeam(l11I1I1ll1Illll1I1l1111l1II.player.getNameForScoreboard());
      if (Team != null) {
         ScoreboardDisplaySlot ScoreboardDisplaySlot = ScoreboardDisplaySlot.fromFormatting(Team.getColor());
         if (ScoreboardDisplaySlot != null) {
            ScoreboardObjectivex = Scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot);
         }
      }

      net.minecraft.scoreboard.ScoreboardObjective ScoreboardObjectivex = ScoreboardObjectivex != null ? ScoreboardObjectivex : Scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.SIDEBAR);
      if (ScoreboardObjectivex != null) {
         this.StringHolder_8(lliii11l1lllil, ScoreboardObjectivex);
      } else {
         this.height = 0.0F;
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, net.minecraft.scoreboard.ScoreboardObjective ScoreboardObjective) {
      net.minecraft.scoreboard.Scoreboard Scoreboard = ScoreboardObjective.getScoreboard();
      Font font = Fonts.NEW_MEDIUM.getFont(7.0F);
      NumberFormat NumberFormat = ScoreboardObjective.getNumberFormatOr(StyledNumberFormat.RED);
      List list = Scoreboard.getScoreboardEntries(ScoreboardObjective)
         .stream()
         .filter(ScoreboardEntry -> !ScoreboardEntry.hidden())
         .sorted(net.minecraft.client.gui.hud.InGameHud.SCOREBOARD_ENTRY_COMPARATOR)
         .limit(15L)
         .map(ScoreboardEntry -> {
            net.minecraft.scoreboard.Team Team = Scoreboard.getScoreHolderTeam(ScoreboardEntry.owner());
            MutableText MutableTextx = net.minecraft.scoreboard.Team.decorateName(Team, ScoreboardEntry.name());
            MutableText MutableTextx = ScoreboardEntry.formatted(NumberFormat);
            float f7 = font.width(MutableTextx);
            return new ScoreBoard$II1Il11l111II11IIl(MutableTextx, MutableTextx, (int)f7);
         })
         .collect(Collectors.toList());
      Text Textx = ScoreboardObjective.getDisplayName();
      float f = font.width(Textx);
      float f1 = font.width(": ");
      float f2 = f;

      for (ScoreBoard$II1Il11l111II11IIl llil1i1l1il1ilili$ii1il11l111ii11iilx : list) {
         float f3 = font.width(llil1i1l1il1ilili$ii1il11l111ii11iilx.lII1lllIlllIllII());
         float f4 = f3
            + (llil1i1l1il1ilili$ii1il11l111ii11iilx.ll1l1I1ll111lll1l() > 0 ? f1 + (float)llil1i1l1il1ilili$ii1il11l111ii11iilx.ll1l1I1ll111lll1l() : 0.0F);
         f2 = Math.max(f2, f4);
      }

      int l1 = list.size();
      byte b0 = 9;
      byte b1 = 17;
      int i2 = l1 * b0;
      int i = (int)this.y;
      int j = i + b0;
      int k = i + b1;
      int l = StringHolder_8(list, j, b0, k);
      int i1 = (int)(this.x + 8.0F);
      this.width = Math.max(0.0F, f2 + 16.0F);
      this.height = (float)Math.max(b1, i2 + 10 + l);
      float f5 = Interface.lIl111ll1l111lIIlIlI1I1();
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (lliii11l1lllil instanceof DrawContextImpl) {
         floatHolder_8.Event(
            lliii11l1lllil.getMatrices(),
            this.getX(),
            this.getY(),
            this.width,
            this.height,
            21.0F,
            floatHolder_5.StringHolder_30(f5),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
         lliii11l1lllil.StringHolder_8(
            this.getX(),
            (float)i,
            this.width,
            this.height,
            floatHolder_5.StringHolder_30(f5),
            zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         lliii11l1lllil.StringHolder_8(
            this.getX(),
            (float)i,
            this.width,
            (float)b1,
            floatHolder_5.StringHolder_30(f5),
            zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
      }

      this.EventTarget((float)lliii11l1lllil.getScaledWindowWidth(), (float)lliii11l1lllil.getScaledWindowHeight());
      float f6 = (float)i1 + f2 / 2.0F - f / 2.0F;
      if (Textx.getSiblings().isEmpty()) {
         Textx = Textx.copy()
            .setStyle(
               Style.EMPTY
                  .withColor(
                     ZenithClient.getInstance()
                        .floatHolder_3()
                        .getCurrentStyle()
                        .getTextEnable()
                        .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                        .lllIlll1Ill111l111Il11II11lII()
                  )
            );
      } else {
         Object object = Text.of("");

         for (Text Textx : Textx.getSiblings()) {
            object = object.copy()
               .append(
                  Textx.copy()
                     .setStyle(
                        Textx.getStyle().getColor() == null
                           ? Style.EMPTY.withColor(zenithstyle.getTextEnable().II11II1lIlIl1IIIlII1I1())
                           : Textx.getStyle()
                     )
               );
         }

         Textx = (Text)object;
      }

      lliii11l1lllil.StringHolder_8(font, Textx, f6, (float)i + ((float)b1 - font.height()) / 2.0F);
      int j2 = 0;

      for (int k2 = 0; k2 < l1; k2++) {
         ScoreBoard$II1Il11l111II11IIl llil1i1l1il1ilili$ii1il11l111ii11iil = (ScoreBoard$II1Il11l111II11IIl)list.get(k2);
         int j1 = j + k2 * b0 + j2;
         Object object1 = llil1i1l1il1ilili$ii1il11l111ii11iil.lII1lllIlllIllII();
         if (Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.Spider()) {
            if (object1.getString().contains(l11I1I1ll1Illll1I1l1111l1II.player.getNameForScoreboard())) {
               object1 = StringHolder_21.EventBus(
                  (Text)object1, l11I1I1ll1Illll1I1l1111l1II.player.getNameForScoreboard(), Nameprotect.IIIlllllI1II1IIIll11I1()
               );
            } else if (Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.ll1l1l1I1I() != null) {
               if (object1.getString().contains("Группа:")) {
                  object1 = StringHolder_21.EventTarget((Text)object1, "Группа:", Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.ll1l1l1I1I());
               } else if (object1.getString().contains("Ранг:")) {
                  object1 = StringHolder_21.EventTarget((Text)object1, "Ранг:", Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.ll1l1l1I1I());
               }
            }
         }

         if (EventBus((Text)object1) && j1 < k) {
            int k1 = k - j1;
            j2 += k1;
            j1 += k1;
         }

         lliii11l1lllil.StringHolder_8(font, (Text)object1, (float)i1, (float)j1, zenithstyle.getTextEnable().II11II1lIlIl1IIIlII1I1());
      }
   }

   private static int StringHolder_8(List<ScoreBoard$II1Il11l111II11IIl> list, int i, int j, int k) {
      int l = 0;

      for (int i1 = 0; i1 < list.size(); i1++) {
         int j1 = i + i1 * j + l;
         if (EventBus(((ScoreBoard$II1Il11l111II11IIl)list.get(i1)).lII1lllIlllIllII()) && j1 < k) {
            l += k - j1;
         }
      }

      return l;
   }

   private static boolean EventBus(Text Text) {
      String s = Text.getString();
      if (s.isBlank()) {
         return false;
      } else {
         for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 167) {
               i++;
            } else if (!Character.isWhitespace(s.charAt(i))) {
               return true;
            }
         }

         return false;
      }
   }
}
