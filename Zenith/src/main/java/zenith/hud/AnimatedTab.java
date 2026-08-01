package zenith.hud;

import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.GameMode;
import net.minecraft.text.Text;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.OrderedText;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.gui.PlayerSkinDrawer;
import net.minecraft.scoreboard.ScoreboardDisplaySlot;
import net.minecraft.scoreboard.ReadableScoreboardScore;
import net.minecraft.scoreboard.ScoreHolder;
import net.minecraft.scoreboard.number.NumberFormat;
import net.minecraft.scoreboard.number.StyledNumberFormat;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.gui.hud.PlayerListHud.FallingBlockEntityRenderer8;

public class AnimatedTab extends HudElement {
   private final GetStartTimeHandler ll1l11llIIlIlIlIl1 = new GetStartTimeHandler(250L, IReturn.StringHolder_9);

   public AnimatedTab(String s) {
      super(s, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, null);
   }

   @Override
   protected void StringHolder_8(DrawContextImpl lliii11l1lllil, HudElement$EventBus ii11l1l11lil1i1$l1i1illlili) {
   }

   @Override
   protected void EventBus(DrawContextImpl lliii11l1lllil, HudElement$EventBus ii11l1l11lil1i1$l1i1illlili) {
   }

   @Override
   public void StringHolder_8(float f, float f1) {
   }

   @Override
   public void Event(float f, float f1) {
   }

   @Override
   public void llIIl1lllllII() {
   }

   @Override
   public void EventTarget(float f, float f1) {
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, Interface lil1i1i1l1il, float f2, float f3) {
   }

   @Override
   public JsonObject save() {
      return new JsonObject();
   }

   @Override
   public void load(JsonObject jsonobject) {
   }

   @Override
   public float IlI1IllI111lllllIIlllIll() {
      return 1.0F;
   }

   @Override
   public void StringHolder_8(floatHolder_4 iiii1ilili1l1l1lilli1liliii) {
      float f = this.IlI1IllI111lllllIIlllIll();
      iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(this.x + this.width / 2.0F, this.y, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f, f, 1.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-this.x - this.width / 2.0F, -this.y, 0.0F);
      this.StringHolder_8((DrawContextImpl)iiii1ilili1l1l1lilli1liliii);
      iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      net.minecraft.scoreboard.Scoreboard Scoreboard = l11I1I1ll1Illll1I1l1111l1II.world.getScoreboard();
      net.minecraft.scoreboard.ScoreboardObjective ScoreboardObjective = Scoreboard.getObjectiveForSlot(ScoreboardDisplaySlot.LIST);
      this.ll1l11llIIlIlIlIl1
         .ZenithInternal101(
            l11I1I1ll1Illll1I1l1111l1II.options.playerListKey.isPressed()
               && (
                  !l11I1I1ll1Illll1I1l1111l1II.isInSingleplayer()
                     || l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.getListedPlayerListEntries().size() > 1
                     || ScoreboardObjective != null
               )
         );
      if (this.ll1l11llIIlIlIlIl1.CloudFriendInfo() != 0.0F) {
         this.StringHolder_8(lliii11l1lllil, lliii11l1lllil.getScaledWindowWidth(), Scoreboard, ScoreboardObjective);
      }

      this.ll1l11llIIlIlIlIl1.EventImpl_21(250L);
      this.ll1l11llIIlIlIlIl1.StringHolder_8(IReturn.StringHolder_9);
   }

   public void StringHolder_8(net.minecraft.client.gui.DrawContext DrawContext, int i, net.minecraft.scoreboard.Scoreboard Scoreboard, net.minecraft.scoreboard.ScoreboardObjective ScoreboardObjective) {
      float f = this.ll1l11llIIlIlIlIl1.CloudFriendInfo();
      List list = l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().collectPlayerEntries();
      ArrayList arraylist = new ArrayList(list.size());
      int j = l11I1I1ll1Illll1I1l1111l1II.textRenderer.getWidth(" ");
      int k = 0;
      int l = 0;

      for (PlayerListEntry PlayerListEntryx : list) {
         Text Text = l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().getPlayerName(PlayerListEntryx);
         k = Math.max(k, l11I1I1ll1Illll1I1l1111l1II.textRenderer.getWidth(Text));
         int i1 = 0;
         MutableText MutableText = null;
         int j1 = 0;
         if (ScoreboardObjective != null) {
            ScoreHolder ScoreHolder = ScoreHolder.fromProfile(PlayerListEntryx.getProfile());
            ReadableScoreboardScore ReadableScoreboardScore = Scoreboard.getScore(ScoreHolder, ScoreboardObjective);
            if (ReadableScoreboardScore != null) {
               i1 = ReadableScoreboardScore.getScore();
            }

            if (ScoreboardObjective.getRenderType() != net.minecraft.scoreboard.ScoreboardCriterion.UnmodifiableLevelProperties5.HEARTS) {
               NumberFormat NumberFormat = ScoreboardObjective.getNumberFormatOr(StyledNumberFormat.YELLOW);
               MutableText = ReadableScoreboardScore.getFormattedScore(ReadableScoreboardScore, NumberFormat);
               j1 = l11I1I1ll1Illll1I1l1111l1II.textRenderer.getWidth(MutableText);
               l = Math.max(l, j1 > 0 ? j + j1 : 0);
            }
         }

         arraylist.add(new FallingBlockEntityRenderer8(Text, i1, MutableText, j1));
      }

      if (!l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().hearts.isEmpty()) {
         Set set = list.stream().map(PlayerListEntry -> PlayerListEntryxx.getProfile().getId()).collect(Collectors.toSet());
         l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().hearts.keySet().removeIf(uuid -> !set.contains(uuid));
      }

      int i4 = list.size();
      int j4 = i4;

      int k4;
      for (k4 = 1; j4 > 20; j4 = (i4 + k4 - 1) / k4) {
         k4++;
      }

      boolean flag1 = true;
      int l4;
      if (ScoreboardObjective != null) {
         l4 = ScoreboardObjective.getRenderType() == net.minecraft.scoreboard.ScoreboardCriterion.UnmodifiableLevelProperties5.HEARTS ? 90 : l;
      } else {
         l4 = 0;
      }

      int i5 = Math.min(k4 * ((flag1 ? 9 : 0) + k + l4 + 13), i - 50) / k4;
      int j5 = i / 2 - (i5 * k4 + (k4 - 1) * 5) / 2;
      this.x = (float)j5;
      int k5 = 10;
      int l5 = i5 * k4 + (k4 - 1) * 5;
      this.y = (float)k5;
      this.width = (float)l5;
      List list1 = null;
      if (l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().header != null) {
         list1 = l11I1I1ll1Illll1I1l1111l1II.textRenderer.wrapLines(l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().header, i - 50);

         for (OrderedText OrderedText : list1) {
            l5 = Math.max(l5, l11I1I1ll1Illll1I1l1111l1II.textRenderer.getWidth(OrderedText));
         }
      }

      List list2 = null;
      if (l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().footer != null) {
         list2 = l11I1I1ll1Illll1I1l1111l1II.textRenderer.wrapLines(l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().footer, i - 50);

         for (OrderedText OrderedTextxx : list2) {
            l5 = Math.max(l5, l11I1I1ll1Illll1I1l1111l1II.textRenderer.getWidth(OrderedTextxx));
         }
      }

      int i6 = list1 != null ? list1.size() * 9 : 0;
      int j6 = list1 != null ? 1 : 0;
      int k1 = j4 * 9;
      int l1 = list2 != null ? 1 : 0;
      int i2 = list2 != null ? list2.size() * 9 : 0;
      int j2 = i6 + j6 + k1 + l1 + i2;
      this.height = (float)j2;
      float f1 = (float)(i / 2 - 1);
      float f2 = 10.0F + (float)j2 / 2.0F;
      float f3 = Math.max(1.0E-4F, f);
      MatrixStack MatrixStack = DrawContext.getMatrices();
      MatrixStack.push();
      MatrixStack.translate(f1, f2, 0.0F);
      MatrixStack.scale(f3, f3, 1.0F);
      MatrixStack.translate(-f1, -f2, 0.0F);
      if (list1 != null) {
         DrawContext.fill(i / 2 - l5 / 2 - 1, k5 - 1, i / 2 + l5 / 2 + 1, k5 + list1.size() * 9, Integer.MIN_VALUE);

         for (OrderedText OrderedTextxxx : list1) {
            int k2 = l11I1I1ll1Illll1I1l1111l1II.textRenderer.getWidth(OrderedTextxxx);
            DrawContext.drawTextWithShadow(l11I1I1ll1Illll1I1l1111l1II.textRenderer, OrderedTextxxx, i / 2 - k2 / 2, k5, -1);
            k5 += 9;
         }

         k5++;
      }

      DrawContext.fill(i / 2 - l5 / 2 - 1, k5 - 1, i / 2 + l5 / 2 + 1, k5 + j4 * 9, Integer.MIN_VALUE);
      int k6 = l11I1I1ll1Illll1I1l1111l1II.options.getTextBackgroundColor(553648127);

      for (int l6 = 0; l6 < i4; l6++) {
         int i7 = l6 / j4;
         int l2 = l6 % j4;
         int i3 = j5 + i7 * i5 + i7 * 5;
         int j3 = k5 + l2 * 9;
         DrawContext.fill(i3, j3, i3 + i5, j3 + 8, k6);
         if (l6 < list.size()) {
            PlayerListEntry PlayerListEntry = (PlayerListEntry)list.get(l6);
            FallingBlockEntityRenderer8 FallingBlockEntityRenderer8 = (FallingBlockEntityRenderer8)arraylist.get(l6);
            GameProfile gameprofile = PlayerListEntry.getProfile();
            int k3 = i3;
            if (flag1) {
               PlayerEntity PlayerEntity = l11I1I1ll1Illll1I1l1111l1II.world.getPlayerByUuid(gameprofile.getId());
               boolean flag = PlayerEntity != null && LivingEntityRenderer.shouldFlipUpsideDown(PlayerEntity);
               PlayerSkinDrawer.draw(DrawContext, PlayerListEntry.getSkinTextures().texture(), i3, j3, 8, PlayerListEntry.shouldShowHat(), flag, -1);
               k3 = i3 + 9;
            }

            int k7 = PlayerListEntry.getGameMode() == GameMode.SPECTATOR ? -1859310289 : -1;
            DrawContext.drawTextWithShadow(l11I1I1ll1Illll1I1l1111l1II.textRenderer, FallingBlockEntityRenderer8.name(), k3, j3, k7);
            if (ScoreboardObjective != null && PlayerListEntry.getGameMode() != GameMode.SPECTATOR) {
               int l7 = k3 + k + 1;
               int l3 = l7 + l4;
               if (l3 - l7 > 5) {
                  l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().renderScoreboardObjective(ScoreboardObjective, j3, FallingBlockEntityRenderer8, l7, l3, gameprofile.getId(), DrawContext);
               }
            }

            l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().renderLatencyIcon(DrawContext, i5, k3 - (flag1 ? 9 : 0), j3, PlayerListEntry);
         }
      }

      if (list2 != null) {
         k5 += j4 * 9 + 1;
         DrawContext.fill(i / 2 - l5 / 2 - 1, k5 - 1, i / 2 + l5 / 2 + 1, k5 + list2.size() * 9, Integer.MIN_VALUE);

         for (OrderedText OrderedTextx : list2) {
            int j7 = l11I1I1ll1Illll1I1l1111l1II.textRenderer.getWidth(OrderedTextx);
            DrawContext.drawTextWithShadow(l11I1I1ll1Illll1I1l1111l1II.textRenderer, OrderedTextx, i / 2 - j7 / 2, k5, -1);
            k5 += 9;
         }
      }

      MatrixStack.pop();
   }

   @Override
   public boolean EventBus(double d0, double d1) {
      return false;
   }

   @Override
   public float l1l11Il1l11IlllIIllI() {
      return 0.0F;
   }

   @Override
   public float I1llllIIIIllIl() {
      return 0.0F;
   }

   @Override
   public float lI11l1IIl1II11l11lI11() {
      return 0.0F;
   }

   @Override
   public float lll1lI1I1l1l() {
      return 0.0F;
   }
}
