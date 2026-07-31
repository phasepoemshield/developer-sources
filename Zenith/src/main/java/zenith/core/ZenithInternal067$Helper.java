package zenith;

import zenith.hud.*;

import net.minecraft.item.ItemStack;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;
import zenith.zov.utility.mixin.accessors.DrawContextAccessor;

class ArmorHud$II1Il11l111II11IIl {
   private final int l1IIlll1I1IIIlI1II1IIlll111;

   private ArmorHud$II1Il11l111II11IIl(ArmorHud ill11ii1ilil1liili1iliil, int i) {
      this.l1IIlll1I1IIIlI1II1IIlll111 = i;
   }

   public void StringHolder_8(DrawContextImpl lliii11l1lllil, float f, float f1, ZenithStyle zenithstyle) {
      float f2 = Interface.lIl111ll1l111lIIlIlI1I1();
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1 = floatHolder_5.StringHolder_30(f2);
      Font font = Fonts.NEW_MEDIUM.getFont(5.4F);
      ByteBufferHolder il1iliilli1l1iill = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1();
      ItemStack ItemStack = (ItemStack)ZenithInternal076.l11I1I1ll1Illll1I1l1111l1II
         .player
         .getInventory()
         .armor
         .get(3 - this.l1IIlll1I1IIIlI1II1IIlll111);
      if (!ItemStack.isEmpty()) {
         lliii11l1lllil.lII1I1l1I11111l1llI1();
         lliii11l1lllil.getMatrices().translate((double)f + 4.6, (double)f1 + 4.6, 1.0);
         lliii11l1lllil.getMatrices().scale(0.8F, 0.8F, 0.8F);
         lliii11l1lllil.StringHolder_8(ItemStack, 0, 0);
         ((DrawContextAccessor)lliii11l1lllil).callDrawItemBar(ItemStack, 0, 0);
         ((DrawContextAccessor)lliii11l1lllil).callDrawCooldownProgress(ItemStack, 0, 0);
         lliii11l1lllil.IIlII1lII1();
         if (ItemStack.getCount() > 1) {
            String s = "x" + ItemStack.getCount();
            float f3 = font.width(s);
            float f4 = f + 22.0F - f3 - 3.0F;
            float f5 = f1 + 22.0F - font.height() - 3.0F;
            lliii11l1lllil.StringHolder_8(font, s, f4, f5, il1iliilli1l1iill);
         }
      } else {
         Font font1 = Fonts.ICONS.getFont(4.5F);
         lliii11l1lllil.StringHolder_8(
            font1,
            "M",
            f + (22.0F - font1.width("M")) / 2.0F,
            f1 + (22.0F - font1.height()) / 2.0F,
            ZenithClient.getInstance()
               .floatHolder_3()
               .getCurrentStyle()
               .getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
      }
   }
}
