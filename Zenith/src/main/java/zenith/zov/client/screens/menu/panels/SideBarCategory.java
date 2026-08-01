package zenith.zov.client.screens.menu.panels;

import zenith.hud.*;

import net.minecraft.util.math.MathHelper;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.Category;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;

public class SideBarCategory {
   private final Category category;
   private final GetStartTimeHandler animationSwitch;

   public SideBarCategory(Category iill11i1il1ilii11iii1llil1ll) {
      this.category = iill11i1il1ilii11iii1llil1ll;
      this.animationSwitch = new GetStartTimeHandler(
         200L, iill11i1il1ilii11iii1llil1ll == Category.IIII1111111II ? 1.0F : 0.0F, IReturn.ScreenImpl
      );
   }

   public void render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      float f7,
      float f2,
      float f3,
      boolean flag,
      ByteBufferHolder il1iliilli1l1iill,
      ByteBufferHolder il1iliilli1l1iill1,
      ByteBufferHolder il1iliilli1l1iill2,
      ByteBufferHolder il1iliilli1l1iill3
   ) {
      this.animationSwitch.ZenithInternal095(flag ? 1.0F : 0.0F);
      this.animationSwitch.ArmorHud();
      ByteBufferHolder il1iliilli1l1iill4 = il1iliilli1l1iill2.StringHolder_8(il1iliilli1l1iill3, this.animationSwitch.CloudFriendInfo());
      ByteBufferHolder il1iliilli1l1iill5 = il1iliilli1l1iill1.StringHolder_8(il1iliilli1l1iill, this.animationSwitch.CloudFriendInfo());
      Font font = Fonts.ICONS.getFont(7.0F);
      float f4 = (f2 - font.height()) / 2.0F;
      float f5 = MathHelper.lerp(f3, 1.0F, 0.8F);
      float f6 = font.width(this.category.getIcon());
      iiii1ilili1l1l1lilli1liliii.lII1I1l1I11111l1llI1();
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(f + 8.0F + f6 / 2.0F, f1 + f4 + font.height() / 2.0F, 0.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().scale(f5, f5, 1.0F);
      iiii1ilili1l1l1lilli1liliii.getMatrices().translate(-(f + 8.0F + f6 / 2.0F), -(f1 + f4 + font.height() / 2.0F), 0.0F);
      if (this.category == Category.lIl11I11I1llIIl11llIlI1Il) {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            Fonts.ICONS.getFont(7.0F),
            this.category.getIcon(),
            f + 8.0F,
            f1 + f4,
            ZenithClient.getInstance().NotificationsHolder().lII111IIl1lI1I11lIIlIl1III1I().MusicInfo()
         );
      } else {
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(Fonts.ICONS.getFont(7.0F), this.category.getIcon(), f + 8.0F, f1 + f4, il1iliilli1l1iill4);
      }

      iiii1ilili1l1l1lilli1liliii.IIlII1lII1();
      Font font1 = Fonts.MEDIUM.getFont(7.0F);
      iiii1ilili1l1l1lilli1liliii.StringHolder_8(
         font1, this.category.getName(), f + 8.0F + f6 * f5 + 6.0F, f1 + (f2 - font.height()) / 2.0F, il1iliilli1l1iill5
      );
   }

   public Category getCategory() {
      return this.category;
   }
}
