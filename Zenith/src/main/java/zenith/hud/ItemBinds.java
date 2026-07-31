package zenith.hud;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.screen.slot.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;
import zenith.zov.utility.mixin.accessors.DrawContextAccessor;

public class ItemBinds extends HudElement {
   private static final float ll11I11lIIl11ll11I = 17.0F;
   private static final float I1I11IIlll11lIl1ll1ll1IllII1 = 10.0F;
   private static final float l1IIllIIll1Il1II = 118.0F;
   private final GetStartTimeHandler I1llIl1I1llIlIl = new GetStartTimeHandler(200L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler I1I1l1ll1l1II1l11llI1ll11l = new GetStartTimeHandler(200L, 118.0F, IReturn.ListHolder_8);

   public ItemBinds(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      Font font = Fonts.NEW_ICONS.getFont(5.5F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      Font font2 = Fonts.NEW_MEDIUM.getFont(5.4F);
      Font font3 = Fonts.NEW_SEMIBOLD.getFont(5.4F);
      List list = this.IIIIII11l1IIl1l11lI1l1ll();
      boolean flag = l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof net.minecraft.client.gui.screen.ChatScreen
         || ZenithClient.getInstance().ZenithInternal141().isRenderHud();
      float f = this.I1I1l1ll1l1II1l11llI1ll11l.StringHolder_8(this.StringHolder_8(list, font2, font3));
      float f1 = 17.0F + (float)GuiStyle.PADDING.intValue();
      if (!list.isEmpty()) {
         f1 += (float)list.size() * (10.0F + (float)GuiStyle.PADDING.intValue());
      }

      this.width = f;
      this.height = f1;
      this.I1llIl1I1llIlIl.ZenithInternal101(flag || !list.isEmpty());
      if (!(this.I1llIl1I1llIlIl.CloudFriendInfo() <= 0.01F)) {
         float f2 = this.x;
         float f3 = this.y;
         floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(Interface.lIl111ll1l111lIIlIlI1I1());
         lliii11l1lllil.lII1I1l1I11111l1llI1();
         lliii11l1lllil.getMatrices().translate(f2 + f / 2.0F, f3 + f1 / 2.0F, 0.0F);
         lliii11l1lllil.getMatrices().scale(this.I1llIl1I1llIlIl.CloudFriendInfo(), this.I1llIl1I1llIlIl.CloudFriendInfo(), 1.0F);
         lliii11l1lllil.getMatrices().translate(-(f2 + f / 2.0F), -(f3 + f1 / 2.0F), 0.0F);
         floatHolder_8.Event(
            lliii11l1lllil.getMatrices(), f2, f3, f, f1, 21.0F, iil11iill1il1l1llilll1l1i1i1, ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
         lliii11l1lllil.StringHolder_8(f2, f3, f, f1, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1());
         lliii11l1lllil.StringHolder_8(
            f2, f3, f, 17.0F, iil11iill1il1l1llilll1l1i1i1, zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         lliii11l1lllil.StringHolder_8(
            font, "n", f2 + 8.0F, f3 + (17.0F - font.height()) / 2.0F, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         lliii11l1lllil.StringHolder_8(
            font, "m", f2 + f - 8.0F - font.width("m"), f3 + (17.0F - font.height()) / 2.0F, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         lliii11l1lllil.StringHolder_8(
            font1,
            "ItemBinds",
            f2 + 8.0F + font.width("n") + (float)GuiStyle.PADDING.intValue(),
            f3 + (17.0F - font1.height()) / 2.0F,
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         float f4 = f3 + 17.0F + (float)GuiStyle.PADDING.intValue();
         if (!list.isEmpty()) {
            for (ItemBinds$II1Il11l111II11IIl lli1i11i1i1l11il1i111i1llliii1$ii1il11l111ii11iil : list) {
               this.StringHolder_8(lliii11l1lllil, lli1i11i1i1l11il1i111i1llliii1$ii1il11l111ii11iil, f2, f4, f, font2, font3, zenithstyle);
               f4 += 10.0F + (float)GuiStyle.PADDING.intValue();
            }
         }

         lliii11l1lllil.IIlII1lII1();
      }
   }

   private void StringHolder_8(
      DrawContextImpl lliii11l1lllil,
      ItemBinds$II1Il11l111II11IIl lli1i11i1i1l11il1i111i1llliii1$ii1il11l111ii11iil,
      float f,
      float f1,
      float f2,
      Font font,
      Font font1,
      ZenithStyle zenithstyle
   ) {
      try {
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         ByteBufferHolder il1iliilli1l1iill2 = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         float f3 = 10.0F;
         float f4 = f + 8.0F;
         float f5 = font1.width(lli1i11i1i1l11il1i111i1llliii1$ii1il11l111ii11iil.lI1I1lIl1llIIIII());
         float f6 = Math.max(14.0F, f5 + (float)GuiStyle.PADDING.intValue() * 2.0F);
         float f7 = f + f2 - f6 - 8.0F;
         float f8 = f4 + f3 + (float)GuiStyle.PADDING.intValue();
         this.StringHolder_8(lliii11l1lllil, lli1i11i1i1l11il1i111i1llliii1$ii1il11l111ii11iil.ll1I11lIl1lI1lll1(), f4, f1, f3);
         lliii11l1lllil.StringHolder_8(
            font, lli1i11i1i1l11il1i111i1llliii1$ii1il11l111ii11iil.I11Il11Il11Il1ll1ll1(), f8, f1 + (10.0F - font.height()) / 2.0F, il1iliilli1l1iill2
         );
         lliii11l1lllil.StringHolder_8(f7, f1, f6, 10.0F, floatHolder_5.StringHolder_30(1.5F), il1iliilli1l1iill);
         lliii11l1lllil.StringHolder_8(
            font1,
            lli1i11i1i1l11il1i111i1llliii1$ii1il11l111ii11iil.lI1I1lIl1llIIIII(),
            f7 + (f6 - f5) / 2.0F,
            f1 + (10.0F - font1.height()) / 2.0F,
            il1iliilli1l1iill1
         );
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, ItemStack ItemStack, float f, float f1, float f2) {
      float f3 = 8.0F;
      float f4 = f3 / 16.0F;
      lliii11l1lllil.lII1I1l1I11111l1llI1();
      lliii11l1lllil.getMatrices().translate(f + (f2 - f3) / 2.0F, f1 + (f2 - f3) / 2.0F, 0.0F);
      lliii11l1lllil.getMatrices().scale(f4, f4, 1.0F);
      lliii11l1lllil.StringHolder_8(ItemStack, 0, 0);
      ((DrawContextAccessor)lliii11l1lllil).callDrawItemBar(ItemStack, 0, 0);
      ((DrawContextAccessor)lliii11l1lllil).callDrawCooldownProgress(ItemStack, 0, 0);
      lliii11l1lllil.IIlII1lII1();
   }

   private float StringHolder_8(List<ItemBinds$II1Il11l111II11IIl> list, Font font, Font font1) {
      float f = 100.0F;

      for (ItemBinds$II1Il11l111II11IIl lli1i11i1i1l11il1i111i1llliii1$ii1il11l111ii11iil : list) {
         float f1 = Math.max(
            14.0F, font1.width(lli1i11i1i1l11il1i111i1llliii1$ii1il11l111ii11iil.lI1I1lIl1llIIIII()) + (float)GuiStyle.PADDING.intValue() * 2.0F
         );
         float f2 = 18.0F
            + (float)GuiStyle.PADDING.intValue()
            + font.width(lli1i11i1i1l11il1i111i1llliii1$ii1il11l111ii11iil.I11Il11Il11Il1ll1ll1())
            + 8.0F
            + f1
            + 8.0F;
         f = Math.max(f, f2);
      }

      return f;
   }

   private List<ItemBinds$II1Il11l111II11IIl> IIIIII11l1IIl1l11lI1l1ll() {
      ArrayList arraylist = new ArrayList();
      if (l11I1I1ll1Illll1I1l1111l1II != null && l11I1I1ll1Illll1I1l1111l1II.player != null) {
         Serverhelper i11iill1lli1li11il1illi1 = Serverhelper.l1l1l111I1lI11Il;
         this.StringHolder_8(arraylist, i11iill1lli1li11il1illi1.llI11I1IlIl1I1l1l1ll1lIlI(), i11iill1lli1li11il1illi1.ll1lIIIIIl1());

         for (Serverhelper$II1Il11l111II11IIl i11iill1lli1li11il1illi1$ii1il11l111ii11iil : i11iill1lli1li11il1illi1.I1II1l1IIl1I1lIIIlIIl1I1III()) {
            this.StringHolder_8(
               arraylist,
               i11iill1lli1li11il1illi1$ii1il11l111ii11iil.II11l11I1111II1lIlIlll111Il(),
               ListHolder_5.EventImpl_13(i11iill1lli1li11il1illi1$ii1il11l111ii11iil.lll1II1lIl())
            );
         }

         Clickaction l1ill1li1il1illiiiilli1 = Clickaction.I1l11l1IIIl1llIlI11II;
         this.StringHolder_8(arraylist, l1ill1li1il1illiiiilli1.ll111111lI1IllllIll1(), ListHolder_5.EventImpl_13(Items.EXPERIENCE_BOTTLE));

         for (Clickaction$II1Il11l111II11IIl l1ill1li1il1illiiiilli1$ii1il11l111ii11iil : l1ill1li1il1illiiiilli1.I1II1l1IIl1I1lIIIlIIl1I1III()) {
            this.StringHolder_8(
               arraylist,
               l1ill1li1il1illiiiilli1$ii1il11l111ii11iil.II11l11I1111II1lIlIlll111Il(),
               ListHolder_5.EventImpl_13(l1ill1li1il1illiiiilli1$ii1il11l111ii11iil.lll1II1lIl())
            );
         }

         return arraylist;
      } else {
         return arraylist;
      }
   }

   private void StringHolder_8(
      List<ItemBinds$II1Il11l111II11IIl> list, BindSetting iii11ll1iiiiiill1lil, Slot Slot
   ) {
      if (iii11ll1iiiiiill1lil != null && Slot != null && iii11ll1iiiiiill1lil.Elytramotion() != -1 && iii11ll1iiiiiill1lil.isVisible()) {
         ItemStack ItemStack = Slot.getStack().copy();
         if (!ItemStack.isEmpty()) {
            list.add(
               new ItemBinds$II1Il11l111II11IIl(
                  iii11ll1iiiiiill1lil.getName(),
                  StringHolder_3.doubleHolder_2(iii11ll1iiiiiill1lil.Elytramotion()),
                  iii11ll1iiiiiill1lil.Elytramotion(),
                  ItemStack
               )
            );
         }
      }
   }
}
