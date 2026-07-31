package zenith.hud;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.Vector2f;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.base.font.MsdfRenderer;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;
import zenith.zov.utility.mixin.accessors.DrawContextAccessor;

public class TargetHud extends HudElement {
   private final GetStartTimeHandler lIlIlII111l1llIl1l1 = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private final GetStartTimeHandler llI11ll1l1I1Il1ll1II1l11l1 = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private final GetStartTimeHandler IIIll11lIlIIl1l11I1lIIII = new GetStartTimeHandler(200L, IReturn.ListHolder_8);
   private final GetStartTimeHandler IlIllIlI1l1111IIlllIl11lIIIll = new GetStartTimeHandler(150L, IReturn.PatternHolder_2);
   private LivingEntity llIl11llIII1IIlI1;
   private HeightHandler bounds;
   private String I1lI11I1lIIIllIIl1l1 = "";

   public TargetHud(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public boolean StringHolder_8(EventImpl_38 lllll1l1iliiiiiiililii11) {
      Vector2f Vector2f = this.II1IIll1IlI1llII1lIlI1I1();
      if (this.bounds != null
         && this.bounds.byteHolder((double)Vector2f.getX(), (double)Vector2f.getY())
         && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         l11I1I1ll1Illll1I1l1111l1II.keyboard.setClipboard(l11I1I1ll1Illll1I1l1111l1II.player.getGameProfile().getName());
         return true;
      } else {
         return super.StringHolder_8(lllll1l1iliiiiiiililii11);
      }
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      this.width = 109.0F;
      this.height = 25.0F;
      Aura liil1li11l111lil1liiii1ill = Aura.ll1II1l1lII11IlII1;
      Object object = !(l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen)
            && !ZenithClient.getInstance().ZenithInternal141().isRenderHud()
         ? (
            liil1li11l111lil1liiii1ill.lI1IIllII11I() == null
               ? Aimassist.lI1l1I1l1l1Il.lI1IIllII11I()
               : liil1li11l111lil1liiii1ill.lI1IIllII11I()
         )
         : l11I1I1ll1Illll1I1l1111l1II.player;
      this.StringHolder_8((LivingEntity)object);
      if (this.IIIll11lIlIIl1l11I1lIIII.CloudFriendInfo() != 0.0F && this.llIl11llIII1IIlI1 != null) {
         String s = this.llIl11llIII1IIlI1.getName().getString();
         this.StringHolder_8((floatHolder_4)lliii11l1lllil, this.llIl11llIII1IIlI1, this.IIIll11lIlIIl1l11I1lIIII.CloudFriendInfo());
      }
   }

   private void StringHolder_8(floatHolder_4 iiii1ilili1l1l1lilli1liliii, LivingEntity LivingEntity, float f) {
      float f1 = this.x;
      float f2 = this.y;
      float f3 = 109.0F;
      float f4 = 25.0F;
      float f5 = 17.0F;
      float f6 = (float)GuiStyle.PADDING.intValue();
      float f7 = 7.5F;
      float f8 = Interface.lIl111ll1l111lIIlIlI1I1();
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      ByteBufferHolder il1iliilli1l1iill = zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      iiii1ilili1l1l1lilli1liliii.getMatrices().push();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f1 + f3 / 2.0F, f2 + f4 / 2.0F, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f, f, 1.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-(f1 + f3 / 2.0F), -(f2 + f4 / 2.0F), 0.0F);
      floatHolder_8.Event(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         this.x,
         this.y,
         f3,
         f4,
         21.0F,
         floatHolder_5.StringHolder_30(f8),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f1, f2, f3, f4, floatHolder_5.StringHolder_30(f8), il1iliilli1l1iill1);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(f1, f2, f5 + f6 * 2.0F, f4, floatHolder_5.StringHolder_30(f8), il1iliilli1l1iill);
      float f9 = Math.min(999.0F, ZenithInternal066.byteHolder_2(LivingEntity));
      float f10 = Math.max(1.0F, LivingEntity.getMaxHealth());
      float f11 = MathHelper.clamp(f9 / f10, 0.0F, 1.0F);
      float f12 = MathHelper.clamp(this.lIlIlII111l1llIl1l1.StringHolder_8(f11), 0.0F, 1.0F);
      float f13 = Math.max(0.0F, f9 - LivingEntity.getMaxHealth());
      float f14 = this.llI11ll1l1I1Il1ll1II1l11l1.StringHolder_8(f13 / f10);
      float f15 = f1 + f6;
      float f16 = f2 + (f4 - f5) / 2.0F;
      if (LivingEntity instanceof PlayerEntity PlayerEntityx) {
         float f17 = MathHelper.clamp((float)LivingEntity.hurtTime / 10.0F, 0.0F, 1.0F);
         ByteBufferHolder il1iliilli1l1iill2 = ByteBufferHolder.ll1lIllll111I1lIIl1lIl
            .StringHolder_8(ByteBufferHolder.lIlll1llI1l11I1ll11llIll111I, f17);
         floatHolder_8.StringHolder_8(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            ((AbstractClientPlayerEntity)PlayerEntityx).getSkinTextures().texture(),
            f15,
            f16,
            f5,
            floatHolder_5.StringHolder_30(Interface.lIl111ll1l111lIIlIlI1I1() / 2.0F),
            il1iliilli1l1iill2
         );
      } else {
         Font font2 = Fonts.MEDIUM.getFont(12.0F);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2, "?", f15 + (f5 - font2.width("?")) / 2.0F, f16 + f5 / 2.0F - font2.height() / 2.0F, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
      }

      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      String s2 = Nameprotect.CreateGsonHandler(LivingEntity.getName().getString());
      float f20 = f3 - (f5 + f6 * 2.0F + 50.0F) - 30.0F;
      String s = s2;
      Vector2f Vector2f = this.II1IIll1IlI1llII1lIlI1I1();
      this.bounds = new HeightHandler(f15 + f5 + f6 * 2.0F, f16 - 3.0F, f20, 6.0F);
      if (this.bounds.byteHolder((double)Vector2f.getX(), (double)Vector2f.getY())) {
         s = "Скопировать";
      } else {
         this.bounds = null;
      }

      MsdfRenderer.renderText(
         font1.getFont(),
         s,
         font1.getSize(),
         zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().lllIlll1Ill111l111Il11II11lII(),
         iiii1ilili1l1l1lilli1liliii.getMatrices().peek().getPositionMatrix(),
         f15 + f5 + f6 * 2.0F,
         f16 + f6 / 2.0F,
         0.0F,
         true,
         0.4F,
         1.0F,
         50.0F
      );
      String s1 = Math.round(f9) + "";
      if (LivingEntity instanceof PlayerEntity PlayerEntity) {
         this.StringHolder_8(
            iiii1ilili1l1l1lilli1liliii, PlayerEntity, f15 + f5 + f6 * 2.0F, f16 + f5 - 6.0F - f6 / 2.0F, f1 + f3 - (f15 + f5 + f6 * 2.0F), f6, f7
         );
      }

      float f21 = 17.0F;
      float f18 = this.x + f3 - f6 - f21;
      float f19 = this.y + (f4 - f21) / 2.0F;
      floatHolder_8.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii.getMatrices(), f18, f19, f21, f21, 1.0F, 360.0F, 0.5F, zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      floatHolder_8.StringHolder_8(
         iiii1ilili1l1l1lilli1liliii.getMatrices(),
         f18,
         f19,
         f21,
         f21,
         1.0F,
         360.0F * f12,
         0.5F,
         zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      if (f14 != 0.0F) {
         floatHolder_8.StringHolder_8(
            iiii1ilili1l1l1lilli1liliii.getMatrices(), f18, f19, f21, f21, 1.0F, 360.0F * f14, 0.5F, ByteBufferHolder.IIIIIl1I1l1Il1ll11
         );
      }

      Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font, s1, f18 + (f21 - font.width(s1)) / 2.0F, f19 + (f21 - font.height()) / 2.0F, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      iiii1ilili1l1l1lilli1liliii.getMatrices().pop();
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, PlayerEntity PlayerEntity, float f, float f1, float f6, float f7, float f8) {
      float f2 = 7.0F;
      float f3 = 0.5F;
      float f4 = f;
      float f5 = f1 + 0.5F;
      Font font = Fonts.ICONS.getFont(4.5F);
      DefaultedList DefaultedList = PlayerEntity.getInventory().armor;
      ItemStack[] aItemStack = new ItemStack[]{
         PlayerEntity.getMainHandStack(),
         PlayerEntity.getOffHandStack(),
         (ItemStack)DefaultedList.get(3),
         (ItemStack)DefaultedList.get(2),
         (ItemStack)DefaultedList.get(1),
         (ItemStack)DefaultedList.get(0)
      };

      for (ItemStack ItemStack : aItemStack) {
         if (!ItemStack.isEmpty()) {
            lliii11l1lllil.getMatrices().push();
            lliii11l1lllil.getMatrices().translate(f4 + (f2 - 7.0F) / 2.0F, f5 + (f2 - 7.0F) / 2.0F, 0.0F);
            lliii11l1lllil.getMatrices().scale(0.4375F, 0.4375F, 1.0F);
            lliii11l1lllil.StringHolder_8(ItemStack, 0, 0);
            ((DrawContextAccessor)lliii11l1lllil).callDrawItemBar(ItemStack, 0, 0);
            ((DrawContextAccessor)lliii11l1lllil).callDrawCooldownProgress(ItemStack, 0, 0);
            lliii11l1lllil.getMatrices().pop();
         } else {
            lliii11l1lllil.StringHolder_8(
               font,
               "M",
               f4 + (f2 - font.width("X")) / 2.0F,
               f5 + (f2 - font.height()) / 2.0F,
               ZenithClient.getInstance()
                  .floatHolder_3()
                  .getCurrentStyle()
                  .getTextTertiary()
                  .l1IllIl1l1llIlI11I11Il1l1l1lI1()
            );
         }

         f4 += f2 + f3;
      }
   }

   public void StringHolder_8(LivingEntity LivingEntity) {
      if (LivingEntity == null) {
         this.IIIll11lIlIIl1l11I1lIIII.StringHolder_8(0.0F);
         if (this.IIIll11lIlIIl1l11I1lIIII.CloudFriendInfo() == 0.0F) {
            this.llIl11llIII1IIlI1 = null;
         }
      } else if (LivingEntity != this.llIl11llIII1IIlI1) {
         this.IIIll11lIlIIl1l11I1lIIII.StringHolder_8(0.0F);
         if (this.IIIll11lIlIIl1l11I1lIIII.CloudFriendInfo() == 0.0F) {
            this.llIl11llIII1IIlI1 = LivingEntity;
         }
      } else {
         this.IIIll11lIlIIl1l11I1lIIII.StringHolder_8(1.0F);
      }
   }
}
