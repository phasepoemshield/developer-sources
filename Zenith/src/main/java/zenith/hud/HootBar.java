package zenith.hud;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.profiler.Profilers;
import net.minecraft.util.Formatting;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.HungerManager;
import net.minecraft.item.ItemStack;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.text.MutableText;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.client.gui.hud.InGameHud.ServerList1;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;
import zenith.zov.utility.mixin.accessors.DrawContextAccessor;

public class HootBar extends HudElement {
   private final List<HootBar$II1Il11l111II11IIl> II1lllll1Il1Il11II = new ArrayList<>();
   private GetStartTimeHandler lll11I1llI1I1111I1l = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private MutableText IlIIlIl1II1I1l11lII1I1l11;

   public HootBar(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
      float f6 = 22.0F;
      this.width = f6 * 9.0F;
      this.height = f6;

      for (int i = 0; i < 9; i++) {
         this.II1lllll1Il1Il11II.add(new HootBar$II1Il11l111II11IIl(this, i));
      }
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      this.height = 22.0F;
      this.width = 198.0F;
      float f = this.getX();
      float f1 = this.getY();
      float f2 = Interface.lIl111ll1l111lIIlIlI1I1();
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (l11I1I1ll1Illll1I1l1111l1II.interactionManager.hasCreativeInventory()) {
         this.StringHolder_8(lliii11l1lllil, f1 - 35.0F);
         this.StringHolder_8(lliii11l1lllil, l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter(), f1 - 35.0F - 9.0F);
         Font font1 = Fonts.NEW_MEDIUM.getFont(6.0F);
         int l = l11I1I1ll1Illll1I1l1111l1II.player.experienceLevel;
         lliii11l1lllil.StringHolder_8(
            font1,
            String.valueOf(l),
            f + this.width / 2.0F - font1.width(String.valueOf(l)) / 2.0F,
            f1 - 15.0F + font1.height() / 2.0F,
            ByteBufferHolder.II1l1Ill1III1I1l11Il11I
         );
         floatHolder_8.Event(
            lliii11l1lllil.getMatrices(),
            this.x,
            this.y,
            this.width,
            this.height,
            21.0F,
            floatHolder_5.StringHolder_30(f2),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
         lliii11l1lllil.StringHolder_8(
            this.x,
            this.y,
            this.width,
            this.height,
            floatHolder_5.StringHolder_30(f2),
            zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         ItemStack ItemStackx = l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack();
         if (!ItemStackx.isEmpty()) {
            float f8 = f - this.height - 12.0F;
            floatHolder_8.Event(
               lliii11l1lllil.getMatrices(),
               f8,
               f1,
               this.height,
               this.height,
               21.0F,
               floatHolder_5.StringHolder_30(f2),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl
            );
            lliii11l1lllil.StringHolder_8(
               f8, f1, this.height, this.height, floatHolder_5.StringHolder_30(f2), zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            lliii11l1lllil.lII1I1l1I11111l1llI1();
            lliii11l1lllil.getMatrices().translate((double)f8 + 4.6, (double)f1 + 4.6, 1.0);
            lliii11l1lllil.getMatrices().scale(0.8F, 0.8F, 0.8F);
            lliii11l1lllil.StringHolder_8(ItemStackx, 0, 0);
            ((DrawContextAccessor)lliii11l1lllil).callDrawItemBar(ItemStackx, 0, 0);
            ((DrawContextAccessor)lliii11l1lllil).callDrawCooldownProgress(ItemStackx, 0, 0);
            lliii11l1lllil.IIlII1lII1();
            if (ItemStackx.getCount() > 1) {
               String s1 = "x" + ItemStackx.getCount();
               float f11 = font1.width(s1);
               float f12 = f8 + 22.0F - f11 - 1.0F;
               float f13 = f1 + 22.0F - font1.height() - 3.0F;
               lliii11l1lllil.StringHolder_8(font1, s1, f12, f13, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1());
            }
         }

         float f9 = f;

         for (HootBar$II1Il11l111II11IIl l1lili1ii11$ii1il11l111ii11iilx : this.II1lllll1Il1Il11II) {
            l1lili1ii11$ii1il11l111ii11iilx.StringHolder_8(lliii11l1lllil, f9, f1, zenithstyle);
            f9 += this.height;
         }
      } else {
         if (l11I1I1ll1Illll1I1l1111l1II.interactionManager.hasStatusBars()) {
            int i = lliii11l1lllil.getScaledWindowWidth() / 2 - 91;
            int j = lliii11l1lllil.getScaledWindowHeight() - 39;
            float f3 = 0.9F;
            lliii11l1lllil.getMatrices().push();
            lliii11l1lllil.getMatrices().translate(f, f1 - 12.0F, 0.0F);
            lliii11l1lllil.getMatrices().scale(f3, f3, 1.0F);
            lliii11l1lllil.getMatrices().translate((float)(-i), (float)(-j), 0.0F);
            if (!l11I1I1ll1Illll1I1l1111l1II.interactionManager.hasCreativeInventory()) {
               this.StringHolder_8((net.minecraft.client.gui.DrawContext)lliii11l1lllil);
            }

            lliii11l1lllil.getMatrices().pop();
            this.StringHolder_8(lliii11l1lllil, f1 - 35.0F);
            this.StringHolder_8(lliii11l1lllil, l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter(), f1 - 35.0F - 9.0F);
            Font font = Fonts.NEW_MEDIUM.getFont(6.0F);
            int k = l11I1I1ll1Illll1I1l1111l1II.player.experienceLevel;
            lliii11l1lllil.StringHolder_8(
               font,
               String.valueOf(k),
               f + this.width / 2.0F - font.width(String.valueOf(k)) / 2.0F,
               f1 - 15.0F + font.height() / 2.0F,
               ByteBufferHolder.II1l1Ill1III1I1l11Il11I
            );
            floatHolder_8.Event(
               lliii11l1lllil.getMatrices(),
               this.x,
               this.y,
               this.width,
               this.height,
               21.0F,
               floatHolder_5.StringHolder_30(f2),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl
            );
            lliii11l1lllil.StringHolder_8(
               this.x,
               this.y,
               this.width,
               this.height,
               floatHolder_5.StringHolder_30(f2),
               zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
            ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getOffHandStack();
            if (!ItemStack.isEmpty()) {
               float f4 = f - this.height - 12.0F;
               floatHolder_8.Event(
                  lliii11l1lllil.getMatrices(),
                  f4,
                  f1,
                  this.height,
                  this.height,
                  21.0F,
                  floatHolder_5.StringHolder_30(f2),
                  ByteBufferHolder.ll1lIllll111I1lIIl1lIl
               );
               lliii11l1lllil.StringHolder_8(
                  f4,
                  f1,
                  this.height,
                  this.height,
                  floatHolder_5.StringHolder_30(f2),
                  zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
               );
               lliii11l1lllil.lII1I1l1I11111l1llI1();
               lliii11l1lllil.getMatrices().translate((double)f4 + 4.6, (double)f1 + 4.6, 1.0);
               lliii11l1lllil.getMatrices().scale(0.8F, 0.8F, 0.8F);
               lliii11l1lllil.StringHolder_8(ItemStack, 0, 0);
               ((DrawContextAccessor)lliii11l1lllil).callDrawItemBar(ItemStack, 0, 0);
               ((DrawContextAccessor)lliii11l1lllil).callDrawCooldownProgress(ItemStack, 0, 0);
               lliii11l1lllil.IIlII1lII1();
               if (ItemStack.getCount() > 1) {
                  String s = "x" + ItemStack.getCount();
                  float f5 = font.width(s);
                  float f6 = f4 + 22.0F - f5 - 3.0F;
                  float f7 = f1 + 22.0F - font.height() - 3.0F;
                  lliii11l1lllil.StringHolder_8(font, s, f6, f7, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1());
               }
            }

            float f10 = f;

            for (HootBar$II1Il11l111II11IIl l1lili1ii11$ii1il11l111ii11iil : this.II1lllll1Il1Il11II) {
               l1lili1ii11$ii1il11l111ii11iil.StringHolder_8(lliii11l1lllil, f10, f1, zenithstyle);
               f10 += this.height;
            }
         }
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, float f) {
      if (this.lll11I1llI1I1111I1l == null) {
         this.lll11I1llI1I1111I1l = new GetStartTimeHandler(300L, IReturn.ScreenImpl);
      }

      this.lll11I1llI1I1111I1l.EventImpl_21(200L);
      this.lll11I1llI1I1111I1l.StringHolder_8(IReturn.ScreenImpl);
      if (l11I1I1ll1Illll1I1l1111l1II.inGameHud.heldItemTooltipFade > 0 && !l11I1I1ll1Illll1I1l1111l1II.inGameHud.currentStack.isEmpty()) {
         this.lll11I1llI1I1111I1l.StringHolder_8(1.0F);
         this.IlIIlIl1II1I1l11lII1I1l11 = Text.empty()
            .append(l11I1I1ll1Illll1I1l1111l1II.inGameHud.currentStack.getName())
            .formatted(l11I1I1ll1Illll1I1l1111l1II.inGameHud.currentStack.getRarity().getFormatting());
         if (l11I1I1ll1Illll1I1l1111l1II.inGameHud.currentStack.contains(DataComponentTypes.CUSTOM_NAME)) {
            this.IlIIlIl1II1I1l11lII1I1l11.formatted(Formatting.ITALIC);
         }
      } else {
         this.lll11I1llI1I1111I1l.StringHolder_8(0.0F);
      }

      if (this.IlIIlIl1II1I1l11lII1I1l11 != null && this.lll11I1llI1I1111I1l.CloudFriendInfo() > 0.0F) {
         this.StringHolder_8(lliii11l1lllil, this.IlIIlIl1II1I1l11lII1I1l11, f);
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, MutableText MutableText, float f) {
      Font font = Fonts.NEW_MEDIUM.getFont(8.0F);
      float f1 = font.width(MutableText);
      float f2 = (this.width - f1) / 2.0F;
      int i = (int)f;
      if (!l11I1I1ll1Illll1I1l1111l1II.interactionManager.hasStatusBars() || l11I1I1ll1Illll1I1l1111l1II.interactionManager.hasCreativeInventory()) {
         i += 14;
      }

      short short1 = 255;
      if (short1 > 0) {
         lliii11l1lllil.getMatrices().push();
         lliii11l1lllil.getMatrices().translate(this.x + f2, (float)i, 0.0F);
         lliii11l1lllil.StringHolder_8(
            font, MutableText, 0.0F, 0.0F, ColorHelper.withAlpha((int)((float)short1 * this.lll11I1llI1I1111I1l.CloudFriendInfo()), -1)
         );
         lliii11l1lllil.getMatrices().pop();
      }
   }

   public final void StringHolder_8(DrawContextImpl lliii11l1lllil, RenderTickCounter RenderTickCounter, float f) {
      if (l11I1I1ll1Illll1I1l1111l1II.inGameHud.overlayMessage != null && l11I1I1ll1Illll1I1l1111l1II.inGameHud.overlayRemaining > 0) {
         float f1 = (float)l11I1I1ll1Illll1I1l1111l1II.inGameHud.overlayRemaining - RenderTickCounter.getTickDelta(false);
         int i = (int)(f1 * 255.0F / 20.0F);
         if (i > 255) {
            i = 255;
         }

         if (i > 8) {
            Font font = Fonts.NEW_MEDIUM.getFont(8.0F);
            lliii11l1lllil.getMatrices().push();
            lliii11l1lllil.getMatrices().translate(this.x + this.width / 2.0F, f, 0.0F);
            int j;
            if (l11I1I1ll1Illll1I1l1111l1II.inGameHud.overlayTinted) {
               j = MathHelper.hsvToArgb(f1 / 50.0F, 0.7F, 0.6F, i);
            } else {
               j = ColorHelper.withAlpha(i, -1);
            }

            float f2 = font.width(l11I1I1ll1Illll1I1l1111l1II.inGameHud.overlayMessage);
            lliii11l1lllil.getMatrices().translate(-f2 / 2.0F, -font.height() / 2.0F, 0.0F);
            lliii11l1lllil.StringHolder_8(font, l11I1I1ll1Illll1I1l1111l1II.inGameHud.overlayMessage, 0.0F, 0.0F, j);
            lliii11l1lllil.getMatrices().pop();
         }
      }
   }

   @Override
   public void EventTarget(float f, float f1) {
      if (!(f1 <= 0.0F) && !(f <= 0.0F)) {
         if (!this.llIII1ll1IlllllIlI()) {
            float f2 = this.l1l11l111IIl11lI1I1111lII1 > 0.0F ? this.l1l11l111IIl11lI1I1111lII1 : f;
            float f3 = this.IlIllI1lI11Ill11llII1111l > 0.0F ? this.IlIllI1lI11Ill11llII1111l : f1;
            this.ZenithInternal095(f2, f3);
         }

         this.l1l11l111IIl11lI1I1111lII1 = f;
         this.IlIllI1lI11Ill11llII1111l = f1;
         float f4 = this.FinishThread(f) + this.lII1II11IIIII1 * this.ZenithInternal021(f);
         float f5 = this.ZenithException_2(f1) + this.l1IlIIllIIl1I1IlII1ll1III1I11 * this.StringHolder_5(f1);
         this.y = this.EventImpl_21(f5, f1) + this.l1I11Il1lllI();
      }
   }

   @Override
   protected void ZenithInternal095(float f, float f1) {
      if (!(f <= 0.0F) && !(f1 <= 0.0F)) {
         float f2 = this.ZenithInternal021(f);
         float f3 = this.StringHolder_5(f1);
         if (!(f2 <= 0.0F) && !(f3 <= 0.0F)) {
            this.l1IlIIllIIl1I1IlII1ll1III1I11 = (this.I1llllIIIIllIl() - this.ZenithException_2(f1)) / f3;
         }
      }
   }

   private void StringHolder_8(net.minecraft.client.gui.DrawContext DrawContext) {
      ClientPlayerEntity ClientPlayerEntity = l11I1I1ll1Illll1I1l1111l1II.player;
      if (ClientPlayerEntity != null) {
         int i = MathHelper.ceil(ClientPlayerEntity.getHealth());
         boolean flag = l11I1I1ll1Illll1I1l1111l1II.inGameHud.heartJumpEndTick > (long)l11I1I1ll1Illll1I1l1111l1II.inGameHud.ticks
            && (l11I1I1ll1Illll1I1l1111l1II.inGameHud.heartJumpEndTick - (long)l11I1I1ll1Illll1I1l1111l1II.inGameHud.ticks) / 3L % 2L == 1L;
         long j = net.minecraft.util.Util.getMeasuringTimeMs();
         if (i < l11I1I1ll1Illll1I1l1111l1II.inGameHud.lastHealthValue && ClientPlayerEntity.timeUntilRegen > 0) {
            l11I1I1ll1Illll1I1l1111l1II.inGameHud.lastHealthCheckTime = j;
            l11I1I1ll1Illll1I1l1111l1II.inGameHud.heartJumpEndTick = (long)(l11I1I1ll1Illll1I1l1111l1II.inGameHud.ticks + 20);
         } else if (i > l11I1I1ll1Illll1I1l1111l1II.inGameHud.lastHealthValue && ClientPlayerEntity.timeUntilRegen > 0) {
            l11I1I1ll1Illll1I1l1111l1II.inGameHud.lastHealthCheckTime = j;
            l11I1I1ll1Illll1I1l1111l1II.inGameHud.heartJumpEndTick = (long)(l11I1I1ll1Illll1I1l1111l1II.inGameHud.ticks + 10);
         }

         if (j - l11I1I1ll1Illll1I1l1111l1II.inGameHud.lastHealthCheckTime > 1000L) {
            l11I1I1ll1Illll1I1l1111l1II.inGameHud.renderHealthValue = i;
            l11I1I1ll1Illll1I1l1111l1II.inGameHud.lastHealthCheckTime = j;
         }

         l11I1I1ll1Illll1I1l1111l1II.inGameHud.lastHealthValue = i;
         int k = l11I1I1ll1Illll1I1l1111l1II.inGameHud.renderHealthValue;
         l11I1I1ll1Illll1I1l1111l1II.inGameHud.random.setSeed((long)(l11I1I1ll1Illll1I1l1111l1II.inGameHud.ticks * 312871));
         int l = DrawContext.getScaledWindowWidth() / 2 - 91;
         int i1 = DrawContext.getScaledWindowWidth() / 2 + 90 + 36;
         int j1 = DrawContext.getScaledWindowHeight() - 39;
         float f = Math.max((float)ClientPlayerEntity.getAttributeValue(EntityAttributes.MAX_HEALTH), (float)Math.max(k, i));
         int k1 = MathHelper.ceil(ClientPlayerEntity.getAbsorptionAmount());
         int l1 = MathHelper.ceil((f + (float)k1) / 2.0F / 10.0F);
         int i2 = Math.max(10 - (l1 - 2), 3);
         int j2 = j1 - 10;
         int k2 = -1;
         if (ClientPlayerEntity.hasStatusEffect(StatusEffects.REGENERATION)) {
            k2 = l11I1I1ll1Illll1I1l1111l1II.inGameHud.ticks % MathHelper.ceil(f + 5.0F);
         }

         Profilers.get().push("armor");
         StringHolder_8(DrawContext, ClientPlayerEntity, j1, l1, i2, l);
         Profilers.get().swap("health");
         this.StringHolder_8(DrawContext, ClientPlayerEntity, l, j1, i2, k2, f, i, k, k1, flag);
         LivingEntity LivingEntity = l11I1I1ll1Illll1I1l1111l1II.inGameHud.getRiddenEntity();
         int l2 = l11I1I1ll1Illll1I1l1111l1II.inGameHud.getHeartCount(LivingEntity);
         if (l2 == 0) {
            Profilers.get().swap("food");
            this.StringHolder_8(DrawContext, ClientPlayerEntity, j1, i1);
            j2 -= 10;
         }

         Profilers.get().swap("air");
         this.StringHolder_8(DrawContext, ClientPlayerEntity, l2, j2, i1);
         Profilers.get().pop();
      }
   }

   private static void StringHolder_8(net.minecraft.client.gui.DrawContext DrawContext, PlayerEntity PlayerEntity, int i, int j, int k, int l) {
      int i1 = PlayerEntity.getArmor();
      if (i1 > 0) {
         int j1 = i - (j - 1) * k - 10;

         for (int k1 = 0; k1 < 10; k1++) {
            int l1 = l + k1 * 8;
            if (k1 * 2 + 1 < i1) {
               DrawContext.drawGuiTexture(RenderLayer::getGuiTextured, net.minecraft.client.gui.hud.InGameHud.ARMOR_FULL_TEXTURE, l1, j1, 9, 9);
            }

            if (k1 * 2 + 1 == i1) {
               DrawContext.drawGuiTexture(RenderLayer::getGuiTextured, net.minecraft.client.gui.hud.InGameHud.ARMOR_HALF_TEXTURE, l1, j1, 9, 9);
            }

            if (k1 * 2 + 1 > i1) {
               DrawContext.drawGuiTexture(RenderLayer::getGuiTextured, net.minecraft.client.gui.hud.InGameHud.ARMOR_EMPTY_TEXTURE, l1, j1, 9, 9);
            }
         }
      }
   }

   private void StringHolder_8(
      net.minecraft.client.gui.DrawContext DrawContext, PlayerEntity PlayerEntity, int i, int j, int k, int l, float f, int i1, int j1, int k1, boolean flag
   ) {
      ServerList1 ServerList1 = ServerList1.fromPlayerState(PlayerEntity);
      boolean flag1 = PlayerEntity.getWorld().getLevelProperties().isHardcore();
      int l1 = MathHelper.ceil((double)f / 2.0);
      int i2 = MathHelper.ceil((double)k1 / 2.0);
      int j2 = l1 * 2;

      for (int k2 = l1 + i2 - 1; k2 >= 0; k2--) {
         int l2 = k2 / 10;
         int i3 = k2 % 10;
         int j3 = i + i3 * 8;
         int k3 = j - l2 * k;
         if (i1 + k1 <= 4) {
            k3 += l11I1I1ll1Illll1I1l1111l1II.inGameHud.random.nextInt(2);
         }

         if (k2 < l1 && k2 == l) {
            k3 -= 2;
         }

         this.StringHolder_8(DrawContext, ServerList1.CONTAINER, j3, k3, flag1, flag, false);
         int l3 = k2 * 2;
         boolean flag2 = k2 >= l1;
         if (flag2) {
            int i4 = l3 - j2;
            if (i4 < k1) {
               boolean flag3 = i4 + 1 == k1;
               this.StringHolder_8(DrawContext, ServerList1 == ServerList1.WITHERED ? ServerList1 : ServerList1.ABSORBING, j3, k3, flag1, false, flag3);
            }
         }

         if (flag && l3 < j1) {
            boolean flag4 = l3 + 1 == j1;
            this.StringHolder_8(DrawContext, ServerList1, j3, k3, flag1, true, flag4);
         }

         if (l3 < i1) {
            boolean flag5 = l3 + 1 == i1;
            this.StringHolder_8(DrawContext, ServerList1, j3, k3, flag1, false, flag5);
         }
      }
   }

   private void StringHolder_8(net.minecraft.client.gui.DrawContext DrawContext, PlayerEntity PlayerEntity, int i, int j) {
      HungerManager HungerManager = PlayerEntity.getHungerManager();
      int k = HungerManager.getFoodLevel();

      for (int l = 0; l < 10; l++) {
         int i1 = i;
         Identifier Identifierxx;
         Identifier Identifierx;
         Identifier Identifierxx;
         if (PlayerEntity.hasStatusEffect(StatusEffects.HUNGER)) {
            Identifierxx = net.minecraft.client.gui.hud.InGameHud.FOOD_EMPTY_HUNGER_TEXTURE;
            Identifierx = net.minecraft.client.gui.hud.InGameHud.FOOD_HALF_HUNGER_TEXTURE;
            Identifierxx = net.minecraft.client.gui.hud.InGameHud.FOOD_FULL_HUNGER_TEXTURE;
         } else {
            Identifierxx = net.minecraft.client.gui.hud.InGameHud.FOOD_EMPTY_TEXTURE;
            Identifierx = net.minecraft.client.gui.hud.InGameHud.FOOD_HALF_TEXTURE;
            Identifierxx = net.minecraft.client.gui.hud.InGameHud.FOOD_FULL_TEXTURE;
         }

         if (PlayerEntity.getHungerManager().getSaturationLevel() <= 0.0F && l11I1I1ll1Illll1I1l1111l1II.inGameHud.ticks % (k * 3 + 1) == 0) {
            i1 = i + (l11I1I1ll1Illll1I1l1111l1II.inGameHud.random.nextInt(3) - 1);
         }

         int j1 = j - l * 8 - 9;
         DrawContext.drawGuiTexture(RenderLayer::getGuiTextured, Identifierxx, j1, i1, 9, 9);
         if (l * 2 + 1 < k) {
            DrawContext.drawGuiTexture(RenderLayer::getGuiTextured, Identifierxx, j1, i1, 9, 9);
         }

         if (l * 2 + 1 == k) {
            DrawContext.drawGuiTexture(RenderLayer::getGuiTextured, Identifierx, j1, i1, 9, 9);
         }
      }
   }

   private void StringHolder_8(net.minecraft.client.gui.DrawContext DrawContext, ServerList1 ServerList1, int i, int j, boolean flag, boolean flag1, boolean flag2) {
      DrawContext.drawGuiTexture(RenderLayer::getGuiTextured, ServerList1.getTexture(flag, flag2, flag1), i, j, 9, 9);
   }

   private void StringHolder_8(net.minecraft.client.gui.DrawContext DrawContext, PlayerEntity PlayerEntity, int i, int j, int k) {
      int l = PlayerEntity.getMaxAir();
      int i1 = Math.clamp((long)PlayerEntity.getAir(), 0, l);
      boolean flag = PlayerEntity.isSubmergedIn(FluidTags.WATER);
      if (flag || i1 < l) {
         j = this.Event(i, j);
         int j1 = this.StringHolder_8(i1, l, -2);
         int k1 = this.StringHolder_8(i1, l, 0);
         int l1 = 10 - this.StringHolder_8(i1, l, this.Event(i1, flag));
         boolean flag1 = j1 != k1;
         if (!flag) {
            l11I1I1ll1Illll1I1l1111l1II.inGameHud.lastBurstBubble = 0;
         }

         for (int i2 = 1; i2 <= 10; i2++) {
            int j2 = k - (i2 - 1) * 8 - 9;
            if (i2 <= j1) {
               DrawContext.drawGuiTexture(RenderLayer::getGuiTextured, net.minecraft.client.gui.hud.InGameHud.AIR_TEXTURE, j2, j, 9, 9);
            } else if (flag1 && i2 == k1 && flag) {
               DrawContext.drawGuiTexture(RenderLayer::getGuiTextured, net.minecraft.client.gui.hud.InGameHud.AIR_BURSTING_TEXTURE, j2, j, 9, 9);
               l11I1I1ll1Illll1I1l1111l1II.inGameHud.playBurstSound(i2, PlayerEntity, l1);
            } else if (i2 > 10 - l1) {
               int k2 = l1 == 10 && l11I1I1ll1Illll1I1l1111l1II.inGameHud.ticks % 2 == 0
                  ? l11I1I1ll1Illll1I1l1111l1II.inGameHud.random.nextInt(2)
                  : 0;
               DrawContext.drawGuiTexture(RenderLayer::getGuiTextured, net.minecraft.client.gui.hud.InGameHud.AIR_EMPTY_TEXTURE, j2, j + k2, 9, 9);
            }
         }
      }
   }

   private int Event(int i, int j) {
      int k = l11I1I1ll1Illll1I1l1111l1II.inGameHud.getHeartRows(i) - 1;
      return j - k * 10;
   }

   private int StringHolder_8(int i, int j, int k) {
      return MathHelper.ceil((float)((i + k) * 10) / (float)j);
   }

   private int Event(int i, boolean flag) {
      return i != 0 && flag ? 1 : 0;
   }
}
