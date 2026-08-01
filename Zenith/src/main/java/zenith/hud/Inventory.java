package zenith.hud;

import net.minecraft.item.ItemStack;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;
import zenith.zov.utility.mixin.accessors.DrawContextAccessor;

public class Inventory extends HudElement {
   private final GetStartTimeHandler IllllII1l1IIIl1Il1lII = new GetStartTimeHandler(300L, IReturn.PatternHolder_2);
   private final GetStartTimeHandler lllIllI11lIIl1lIl1I1lIIIll = new GetStartTimeHandler(150L, IReturn.PatternHolder_2);
   private String II1IIlI11 = "";
   private float IlI1I111111llIII1I11l111 = 0.0F;
   private float lIIIl1IllIlI1 = 0.0F;

   public Inventory(String s, float f, float f1, float f2, float f3, float f4, float f5, HudElement$II1Il11l111II11IIl ii11l1l11lil1i1$ii1il11l111ii11iil) {
      super(s, f, f1, f2, f3, f4, f5, ii11l1l11lil1i1$ii1il11l111ii11iil);
   }

   @Override
   public void StringHolder_8(DrawContextImpl lliii11l1lllil) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         this.IllllII1l1IIIl1Il1lII.StringHolder_8(0.0F);
         if (this.IllllII1l1IIIl1Il1lII.CloudFriendInfo() > 0.01F) {
            this.EventBus(lliii11l1lllil, this.IllllII1l1IIIl1Il1lII.CloudFriendInfo());
         }
      } else {
         this.IllllII1l1IIIl1Il1lII.StringHolder_8(1.0F);
         if (!(this.IllllII1l1IIIl1Il1lII.CloudFriendInfo() <= 0.01F)) {
            String s = "";

            for (int i = 9; i < 36; i++) {
               ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(i);
               s = s + ItemStack.getItem().toString() + ItemStack.getCount();
            }

            if (!s.equals(this.II1IIlI11)) {
               this.lllIllI11lIIl1lIl1I1lIIIll.StringHolder_8(0.0F);
               this.II1IIlI11 = s;
            }

            this.lllIllI11lIIl1lIl1I1lIIIll.StringHolder_8(1.0F);
            this.EventBus(lliii11l1lllil, this.IllllII1l1IIIl1Il1lII.CloudFriendInfo() * this.lllIllI11lIIl1lIl1I1lIIIll.CloudFriendInfo());
         }
      }
   }

   private void EventBus(DrawContextImpl lliii11l1lllil, float f) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
         Font font1 = Fonts.ICONS.getFont(4.5F);
         float f1 = 14.0F;
         float f2 = 1.0F;
         float f3 = 4.0F;
         ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
         byte b0 = 9;
         byte b1 = 3;
         float f4 = (float)b0 * f1 + (float)(b0 - 1) * f2;
         float f5 = (float)b1 * f1 + (float)(b1 - 1) * 0.5F;
         this.width = f4;
         this.height = f5;
         float f6 = Interface.lIl111ll1l111lIIlIlI1I1();
         this.IlI1I111111llIII1I11l111 = this.width;
         this.lIIIl1IllIlI1 = this.height;
         lliii11l1lllil.getMatrices().push();
         lliii11l1lllil.getMatrices().translate(this.x + this.width / 2.0F, this.y + this.height / 2.0F, 0.0F);
         lliii11l1lllil.getMatrices().scale(f, f, 1.0F);
         lliii11l1lllil.getMatrices().translate(-(this.x + this.width / 2.0F), -(this.y + this.height / 2.0F), 0.0F);
         floatHolder_8.Event(
            lliii11l1lllil.getMatrices(),
            this.x,
            this.y,
            this.width,
            this.height,
            21.0F,
            floatHolder_5.StringHolder_30(f6),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl
         );
         lliii11l1lllil.StringHolder_8(
            this.x,
            this.y,
            this.width,
            this.height,
            floatHolder_5.StringHolder_30(f6),
            zenithstyle.getHudBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
         float f7 = (f1 - font1.width("X")) / 2.0F;

         for (int i = 0; i < b1; i++) {
            for (int j = 0; j < b0; j++) {
               int k = 9 + i * 9 + j;
               ItemStack ItemStack = l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(k);
               float f8 = this.x + (float)j * (f1 + f2);
               float f9 = this.y + (float)i * (f1 + 0.5F);
               float f10 = Math.min(f6, f1 / 2.0F);
               floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(f10);
               if (!ItemStack.isEmpty()) {
                  float f11 = 8.0F;
                  float f12 = f11 / 16.0F;
                  lliii11l1lllil.lII1I1l1I11111l1llI1();
                  lliii11l1lllil.getMatrices().translate(f8 + (f1 - f11) / 2.0F, f9 + (f1 - f11) / 2.0F, 0.0F);
                  lliii11l1lllil.getMatrices().scale(f12, f12, 1.0F);
                  lliii11l1lllil.StringHolder_8(ItemStack, 0, 0);
                  ((DrawContextAccessor)lliii11l1lllil).callDrawItemBar(ItemStack, 0, 0);
                  ((DrawContextAccessor)lliii11l1lllil).callDrawCooldownProgress(ItemStack, 0, 0);
                  lliii11l1lllil.IIlII1lII1();
                  if (ItemStack.getCount() > 1) {
                     String s = "x" + ItemStack.getCount();
                     float f13 = font.width(s);
                     float f14 = f8 + f1 - f13 - 1.5F;
                     float f15 = f9 + f1 - font.height() - 1.0F;
                     lliii11l1lllil.StringHolder_8(font, s, f14, f15, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1());
                  }
               } else {
                  lliii11l1lllil.StringHolder_8(
                     font1,
                     "M",
                     f8 + f7,
                     f9 + (f1 - font1.height()) / 2.0F,
                     ZenithClient.getInstance()
                        .floatHolder_3()
                        .getCurrentStyle()
                        .getTextTertiary()
                        .l1IllIl1l1llIlI11I11Il1l1l1lI1()
                  );
               }
            }
         }

         lliii11l1lllil.getMatrices().pop();
      }
   }
}
