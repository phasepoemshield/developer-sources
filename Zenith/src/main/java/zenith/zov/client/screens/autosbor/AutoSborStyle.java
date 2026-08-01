package zenith.zov.client.screens.autosbor;

import zenith.floatHolder_4;
import zenith.ZenithClient;
import zenith.floatHolder_5;
import zenith.ByteBufferHolder;
import zenith.floatHolder_8;
import zenith.zov.client.screens.nlgui.NLMenuScreen;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public final class AutoSborStyle {
   private AutoSborStyle() {
   }

   public static ByteBufferHolder leftBackground() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.LEFT_BACKGROUND : zenithstyle.getLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder rightBackground() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.RIGHT_BACKGROUND : zenithstyle.getRightBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder panelBackground() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.PANEL_LEFT_BACKGROUND : zenithstyle.getPanelLeftBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder surface() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.SURFACE_ENABLE_BACKGROUND : zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder headerSurface() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.HEADER_DISABLE_BACKGROUND : zenithstyle.getHeaderDisableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder fieldSurface() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.FIELD_SURFACE_BACKGROUND : zenithstyle.getFieldSurfaceBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder fieldBorder() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.FIELD_BORDER : zenithstyle.getFieldBorder().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder text() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.TEXT_ENABLE : zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder textSecondary() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.TEXT_SECONDARY : zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder textTertiary() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.TEXT_TERTIARY : zenithstyle.getTextTertiary().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder primary() {
      ZenithStyle zenithstyle = currentStyle();
      return zenithstyle == null ? GuiStyle.PRIMARY_COLOR : zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1();
   }

   public static ByteBufferHolder transparentText() {
      return text().EventImpl_36(0);
   }

   public static ByteBufferHolder textAlpha(int i) {
      return text().EventImpl_36(i);
   }

   public static void drawBlur(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii,
      float f,
      float f1,
      float f2,
      float f3,
      floatHolder_5 iil11iill1il1l1llilll1l1i1i1,
      float f4
   ) {
      float f5 = getBlurPower();
      if (!(f5 <= 0.0F)) {
         floatHolder_8.StringHolder_8(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            f,
            f1,
            f2,
            f3,
            f5,
            iil11iill1il1l1llilll1l1i1i1,
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f4),
            true,
            false
         );
      }
   }

   private static ZenithStyle currentStyle() {
      return ZenithClient.getInstance().floatHolder_3().getCurrentStyle();
   }

   private static float getBlurPower() {
      NLMenuScreen nlmenuscreen = ZenithClient.getInstance().ZenithInternal141();
      return nlmenuscreen == null ? 0.0F : nlmenuscreen.getBlurPower();
   }
}
