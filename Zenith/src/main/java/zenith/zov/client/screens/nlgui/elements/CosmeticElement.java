package zenith.zov.client.screens.nlgui.elements;

import zenith.hud.*;

import java.nio.file.Path;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.cosmetics.CosmeticAvatarImageCache;
import zenith.zov.client.screens.nlgui.elements.api.InterfaceElement;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class CosmeticElement extends InterfaceElement {
   private static final float CARD_HEIGHT = 79.0F;
   private static final float CARD_HEADER_HEIGHT = 23.0F;
   private static final int COLUMNS = 3;
   private final String name;
   private final String relativePath;
   private final Path path;
   private final Supplier<Path> selectedPathSupplier;
   private final Consumer<Path> onSelect;
   private final GetStartTimeHandler animationEnable = new GetStartTimeHandler(200L, IReturn.ScreenImpl);
   private HeightHandler bounds;

   @Override
   public String getName() {
      return this.name;
   }

   public CosmeticElement(String s, String s1, Path path, Supplier<Path> supplier, Consumer<Path> consumer) {
      this.name = s;
      this.relativePath = s1;
      this.path = path;
      this.selectedPathSupplier = supplier;
      this.onSelect = consumer;
      if (this.isSelected()) {
         this.animationEnable.EventBus(1.0F);
      }
   }

   public String getRelativePath() {
      return this.relativePath;
   }

   public Path getPath() {
      return this.path;
   }

   @Override
   public float getHeight() {
      return 79.0F;
   }

   @Override
   public float getWidth() {
      float f = 376.0F - (float)GuiStyle.PADDING.intValue() * 2.0F;
      float f1 = (float)GuiStyle.PADDING.intValue();
      return (f - f1 * 2.0F) / 3.0F;
   }

   private boolean isSelected() {
      Path pathx = this.selectedPathSupplier != null ? this.selectedPathSupplier.get() : null;
      return pathx != null && this.path != null ? this.path.toAbsolutePath().normalize().equals(pathx.toAbsolutePath().normalize()) : false;
   }

   @Override
   public void render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f22, float f23, float f, float f1, float f2, int i) {
      ZenithStyle zenithstyle = ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
      if (zenithstyle != null) {
         float f3 = this.getWidth();
         this.bounds = new HeightHandler(f, f1, f3, 79.0F);
         boolean flag = this.isSelected();
         this.animationEnable.ZenithInternal101(flag);
         float f4 = this.animationEnable.CloudFriendInfo();
         ByteBufferHolder il1iliilli1l1iill = zenithstyle.getSurfaceDisableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
         ByteBufferHolder il1iliilli1l1iill1 = zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1();
         ByteBufferHolder il1iliilli1l1iill2 = il1iliilli1l1iill1.ZenithInternal039(f2 * (flag ? 1.0F : 0.8F));
         ByteBufferHolder il1iliilli1l1iill3 = zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
         ByteBufferHolder il1iliilli1l1iill4 = zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f2);
         ByteBufferHolder il1iliilli1l1iill5 = zenithstyle.getHeaderDisableBackground()
            .l1IllIl1l1llIlI11I11Il1l1l1lI1()
            .StringHolder_8(zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f4)
            .ZenithInternal039(f2);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f, f1, f3, 79.0F, floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()), il1iliilli1l1iill
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         float f5 = 40.0F;
         float f6 = 40.0F;
         float f7 = f + (f3 - f5) / 2.0F;
         float f8 = f1 + (56.0F - f6) / 2.0F;
         Identifier Identifier = CosmeticAvatarImageCache.getAvatarTextureId(this.path);
         if (Identifier != null) {
            floatHolder_8.StringHolder_8(
               iiii1ilili1l1l1lilli1liliii.getMatrices(),
               Identifier,
               f7,
               f8,
               f5,
               f6,
               floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue() / 1.5F),
               ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f2)
            );
         } else {
            String s = "No preview";
            Font font = Fonts.NEW_REGULAR.getFont(4.7F);
            float f9 = f7 + (f5 - font.width(s)) / 2.0F;
            float f10 = f8 + (f6 - font.height()) / 2.0F;
            iiii1ilili1l1l1lilli1liliii.StringHolder_8(font, s, f9, f10, il1iliilli1l1iill4);
         }

         float f21 = f1 + 79.0F - 23.0F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f, f21, f3, 23.0F, floatHolder_5.ZenithInternal016((float)GuiStyle.ROUND.intValue()), il1iliilli1l1iill5
         );
         Font font1 = Fonts.NEW_MEDIUM.getFont(5.2F);
         String s2 = flag ? "A" : "N";
         Font font2 = Fonts.NEW_ICONS.getFont(5.0F);
         float f11 = f + (float)GuiStyle.PADDING.intValue() * 1.4F;
         float f12 = f21 + (23.0F - font2.height()) / 2.0F - 0.2F;
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font2, s2, f11, f12, il1iliilli1l1iill2);
         float f13 = f11 + font2.width(s2) + (float)GuiStyle.PADDING.intValue();
         float f14 = f21 + (23.0F - font1.height()) / 2.0F - 0.2F;
         float f15 = f3 / 2.0F;
         String s1 = trimToWidth(font1, this.name, f15);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(font1, s1, f13, f14, il1iliilli1l1iill3);
         float f16 = 12.0F;
         float f17 = 7.0F;
         float f18 = f21 + (float)(GuiStyle.PADDING * 2);
         float f19 = f + f3 - (float)(GuiStyle.PADDING * 2) - f16;
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f19,
            f18,
            f16,
            f17,
            floatHolder_5.StringHolder_30(2.5F),
            zenithstyle.getDisableActiveBg().l1IllIl1l1llIlI11I11Il1l1l1lI1().StringHolder_8(il1iliilli1l1iill1, f4).ZenithInternal039(f2)
         );
         float f20 = MathHelper.lerp(f4, 1.0F, f16 - 1.0F - 5.0F);
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f19 + f20,
            f18 + 1.0F,
            5.0F,
            5.0F,
            floatHolder_5.StringHolder_30(1.5F),
            zenithstyle.getTextTertiary()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
               .StringHolder_8(zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1(), f4)
               .ZenithInternal039(f2)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
      }
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      if (ill1iili11ii1l != ZenithInternal068.IlIl1I1lIIII1II1I1II1lI1IllIl || this.bounds == null || this.onSelect == null) {
         return false;
      } else if (this.bounds.byteHolder(d0, d1)) {
         this.onSelect.accept(this.isSelected() ? null : this.path);
         return true;
      } else {
         return false;
      }
   }

   private static String trimToWidth(Font font, String s, float f) {
      if (s != null && s.contains("/")) {
         s = s.substring(0, s.indexOf("/"));
      }

      if (s != null && s.contains("(")) {
         s = s.substring(0, s.indexOf("("));
      }

      if (s != null && !s.isEmpty() && !(font.width(s) <= f)) {
         String s1 = "...";
         float f1 = font.width(s1);
         if (f1 > f) {
            return "";
         } else {
            int i = s.length();

            while (i > 0 && font.width(s.substring(0, i)) + f1 > f) {
               i--;
            }

            return i <= 0 ? s1 : s.substring(0, i) + s1;
         }
      } else {
         return s == null ? "" : s;
      }
   }
}
