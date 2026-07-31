package zenith.hud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.FriendSkinResolver;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;
import zenith.zov.utility.mixin.accessors.DrawContextAccessor;

public class CloudFriendInfo extends HudElement {
   private static final float lII1II1III11lI1Il1lIIIlII = 91.0F;
   private static final float lIl1Illl1l = 21.0F;
   private static final float I1IIl111IlI1I1l1III1I1l = 85.0F;
   private static final float l11lI1II1l1IlIIlIIIl1 = 7.0F;
   private static final float lIl1I1II1l1I1111l111 = 1.0F;
   private static final float Il11II111lll1l1IllIIIll11IlIl = 6.0F;
   private static final float llI1lIl111l1I1l1 = 24.0F;
   private static final float IlI11I1l1II11I1I = 20.0F;
   private final GetStartTimeHandler l1II1I111lIlIIl1 = new GetStartTimeHandler(250L, IReturn.PatternHolder_2);
   private final Map<String, CloudFriendInfo$II1Il11l111II11IIl> lll111IIlIIll11ll1lll1I = new HashMap<>();

   public CloudFriendInfo(
      String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil
   ) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
      this.width = 91.0F;
      this.height = 85.0F;
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      List list = this.I111lIIlI1I1IIIl();
      this.width = 91.0F;
      this.height = list.isEmpty() ? 85.0F : (float)list.size() * 85.0F + (float)Math.max(0, list.size() - 1) * 24.0F;
      if (list.isEmpty()) {
         this.l1II1I111lIlIIl1.StringHolder_8(0.0F);
         if (this.l1II1I111lIlIIl1.CloudFriendInfo() <= 0.01F) {
            return;
         }
      } else {
         this.l1II1I111lIlIIl1.StringHolder_8(1.0F);
      }

      float f = this.l1II1I111lIlIIl1.CloudFriendInfo();
      if (!(f <= 0.01F)) {
         lliii11l1lllil.getMatrices().push();
         lliii11l1lllil.getMatrices().translate(this.x + this.width / 2.0F, this.y + this.height / 2.0F, 0.0F);
         lliii11l1lllil.getMatrices().scale(f, f, 1.0F);
         lliii11l1lllil.getMatrices().translate(-(this.x + this.width / 2.0F), -(this.y + this.height / 2.0F), 0.0F);
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         float f1 = Interface.lIl111ll1l111lIIlIlI1I1();
         float f2 = this.y;

         for (GetSettingsHandler i11ll1111lil11i : list) {
            this.StringHolder_8(lliii11l1lllil, zenithstyle, f1, i11ll1111lil11i, f2);
            f2 += 109.0F;
         }

         lliii11l1lllil.getMatrices().pop();
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, ZenithStyle zenithstyle, float f, GetSettingsHandler i11ll1111lil11i, float f1) {
      CloudFriendInfo$II1Il11l111II11IIl i1i1lll1liii1il1llll1$ii1il11l111ii11iil = this.lll111IIlIIll11ll1lll1I
         .computeIfAbsent(i11ll1111lil11i.Autoexplosion(), s -> new CloudFriendInfo$II1Il11l111II11IIl());
      StringHolder_15 illiilillliiiil1liil = i11ll1111lil11i.Blink();
      int i = illiilillliiiil1liil != null ? illiilillliiiil1liil.Cheststealer() : 0;
      if (i != i1i1lll1liii1il1llll1$ii1il11l111ii11iil.Il1Il1llIIl1lIlII11l11ll) {
         i1i1lll1liii1il1llll1$ii1il11l111ii11iil.lll11lIIlllII.StringHolder_8(0.0F);
         i1i1lll1liii1il1llll1$ii1il11l111ii11iil.Il1Il1llIIl1lIlII11l11ll = i;
      }

      i1i1lll1liii1il1llll1$ii1il11l111ii11iil.lll11lIIlllII.StringHolder_8(1.0F);
      floatHolder_8.Event(
         lliii11l1lllil.getMatrices(),
         this.x,
         f1,
         this.width,
         85.0F,
         21.0F,
         floatHolder_5.StringHolder_30(f),
         ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      lliii11l1lllil.StringHolder_8(
         this.x, f1, this.width, 85.0F, floatHolder_5.StringHolder_30(f), zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      lliii11l1lllil.StringHolder_8(
         this.x, f1, this.width, 21.0F, floatHolder_5.StringHolder_30(f), zenithstyle.getHeaderHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      this.StringHolder_8(lliii11l1lllil, zenithstyle, i11ll1111lil11i, f1, i1i1lll1liii1il1llll1$ii1il11l111ii11iil);
      this.StringHolder_8(lliii11l1lllil, zenithstyle, illiilillliiiil1liil, f1);
      this.EventBus(lliii11l1lllil, zenithstyle, illiilillliiiil1liil, f1);
   }

   private void StringHolder_8(
      DrawContextImpl lliii11l1lllil,
      ZenithStyle zenithstyle,
      GetSettingsHandler i11ll1111lil11i,
      float f,
      CloudFriendInfo$II1Il11l111II11IIl i1i1lll1liii1il1llll1$ii1il11l111ii11iil
   ) {
      float f1 = 5.5F;
      float f2 = 1.5F;
      float f3 = (float)GuiStyle.PADDING.intValue();
      float f4 = f1 + f3 + f2;
      float f5 = f + (21.0F - f4) / 2.0F;
      float f6 = this.x + 6.0F;
      String s = !i11ll1111lil11i.Autoswap().isBlank() ? i11ll1111lil11i.Autoswap() : i11ll1111lil11i.Autoexplosion();
      Identifier Identifier = FriendSkinResolver.resolveSkin(s);
      floatHolder_8.StringHolder_8(
         lliii11l1lllil.getMatrices(), Identifier, f6, f5 + 0.5F, f1, floatHolder_5.StringHolder_30(1.0F), ByteBufferHolder.ll1lIllll111I1lIIl1lIl
      );
      Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
      float f7 = f6 + f1 + 3.0F;
      float f8 = f5 + (f1 - font.height()) / 2.0F;
      lliii11l1lllil.StringHolder_8(font, s, f7, f8, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      float f9 = this.EventBus(i11ll1111lil11i);
      float f10 = MathHelper.clamp(f9 / 20.0F, 0.0F, 1.0F);
      float f11 = MathHelper.clamp(i1i1lll1liii1il1llll1$ii1il11l111ii11iil.I1lI11lIlllI1.StringHolder_8(f10), 0.0F, 1.0F);
      Font font1 = Fonts.NEW_MEDIUM.getFont(5.5F);
      String s1 = (int)Math.ceil((double)f9) + "hp";
      float f12 = font1.width(s1);
      lliii11l1lllil.StringHolder_8(font1, s1, this.x + this.width - 6.0F - f12, f8, zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      float f13 = f5 + f1 + f3;
      float f14 = this.width - 12.0F;
      lliii11l1lllil.StringHolder_8(
         f6, f13, f14, f2, floatHolder_5.StringHolder_30(0.1F), zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1()
      );
      if (f11 > 0.0F) {
         lliii11l1lllil.StringHolder_8(
            f6, f13, f14 * f11, f2, floatHolder_5.StringHolder_30(0.1F), zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
      }
   }

   private void StringHolder_8(DrawContextImpl lliii11l1lllil, ZenithStyle zenithstyle, StringHolder_15 illiilillliiiil1liil, float f) {
      float f1 = f + 21.0F + 6.0F;
      Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
      int i = illiilillliiiil1liil != null ? illiilillliiiil1liil.Autotool() : 0;
      lliii11l1lllil.StringHolder_8(font, "Inventory", this.x + 6.0F, f1, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      String s = String.valueOf(i);
      lliii11l1lllil.StringHolder_8(font, s, this.x + this.width - 6.0F - font.width(s), f1, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      float f2 = f1 + font.height() + 3.0F;
      this.StringHolder_8(lliii11l1lllil, zenithstyle, illiilillliiiil1liil, f2, 3, true);
   }

   private void EventBus(DrawContextImpl lliii11l1lllil, ZenithStyle zenithstyle, StringHolder_15 illiilillliiiil1liil, float f) {
      Font font = Fonts.NEW_MEDIUM.getFont(5.5F);
      float f1 = 25.0F;
      float f2 = f + 21.0F + 6.0F + font.height() + 3.0F;
      float f3 = f2 + f1 + 4.0F;
      int i = illiilillliiiil1liil != null ? illiilillliiiil1liil.Autotrap() : 0;
      lliii11l1lllil.StringHolder_8(font, "Hotbar", this.x + 6.0F, f3, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      String s = String.valueOf(i);
      lliii11l1lllil.StringHolder_8(font, s, this.x + this.width - 6.0F - font.width(s), f3, zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1());
      float f4 = f3 + font.height() + 3.0F;
      this.StringHolder_8(lliii11l1lllil, zenithstyle, illiilillliiiil1liil, f4, 1, false);
   }

   private void StringHolder_8(
      DrawContextImpl lliii11l1lllil, ZenithStyle zenithstyle, StringHolder_15 illiilillliiiil1liil, float f, int i, boolean flag
   ) {
      byte b0 = 9;
      float f1 = (float)b0 * 7.0F + (float)(b0 - 1) * 2.0F;
      float f2 = this.x + (this.width - f1) / 2.0F;
      Font font = Fonts.ICONS.getFont(4.5F);
      ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1();

      for (int j = 0; j < i; j++) {
         for (int k = 0; k < b0; k++) {
            float f3 = f2 + (float)k * 9.0F;
            float f4 = f + (float)j * 9.0F;
            ItemStack ItemStack = this.StringHolder_8(illiilillliiiil1liil, flag, j, k);
            if (ItemStack != null && !ItemStack.isEmpty()) {
               float f5 = 0.4375F;
               lliii11l1lllil.lII1I1l1I11111l1llI1();
               lliii11l1lllil.getMatrices().translate(f3, f4, 0.0F);
               lliii11l1lllil.getMatrices().scale(f5, f5, 1.0F);
               lliii11l1lllil.StringHolder_8(ItemStack, 0, 0);
               ((DrawContextAccessor)lliii11l1lllil).callDrawItemBar(ItemStack, 0, 0);
               ((DrawContextAccessor)lliii11l1lllil).callDrawCooldownProgress(ItemStack, 0, 0);
               lliii11l1lllil.IIlII1lII1();
            } else {
               lliii11l1lllil.StringHolder_8(font, "M", f3 + (7.0F - font.width("M")) / 2.0F, f4 + (7.0F - font.height()) / 2.0F, il1iliilli1l1iill);
            }
         }
      }
   }

   private ItemStack StringHolder_8(StringHolder_15 illiilillliiiil1liil, boolean flag, int i, int j) {
      if (illiilillliiiil1liil == null) {
         return ItemStack.EMPTY;
      } else {
         return flag ? illiilillliiiil1liil.ZenithInternal021(i * 9 + j) : illiilillliiiil1liil.ZenithInternal064(j);
      }
   }

   private float EventBus(GetSettingsHandler i11ll1111lil11i) {
      StringHolder_22 l1liil1ili1iiii1lliii1l1li = i11ll1111lil11i.Reachv3();
      return l1liil1ili1iiii1lliii1l1li != null ? Math.max(0.0F, l1liil1ili1iiii1lliii1l1li.Elytrahelper()) : 0.0F;
   }

   private List<GetSettingsHandler> I111lIIlI1I1IIIl() {
      List list = ZenithClient.getInstance().StringHolder_26().ZenithInternal001();
      ArrayList arraylist = new ArrayList();
      if (list == null) {
         return arraylist;
      } else {
         for (GetSettingsHandler i11ll1111lil11i : list) {
            if (i11ll1111lil11i.Autoaccept().Spider()
               && i11ll1111lil11i.Blink() != null
               && i11ll1111lil11i.Rotationrecorder()) {
               arraylist.add(i11ll1111lil11i);
            }
         }

         return arraylist;
      }
   }
}
