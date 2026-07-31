package zenith.zov.client.screens.nlgui.elements;

import zenith.floatHolder_4;
import zenith.floatHolder_5;
import zenith.IReturn;
import zenith.ByteBufferHolder;
import zenith.ZenithInternal068;
import zenith.floatHolder_8;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.zov.base.font.Font;
import zenith.zov.base.font.Fonts;
import zenith.zov.client.screens.nlgui.elements.api.Element;
import zenith.zov.client.screens.nlgui.style.GuiStyle;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public class GuiFriendRequestElement extends Element {
   public static final float HEIGHT = 28.0F;
   private final GetStartTimeHandler visibleAnimation = new GetStartTimeHandler(220L, 0.0F, IReturn.ListHolder_8);
   // $VF: renamed from: uid java.lang.String
   private final String WALKABLE;
   private String role;
   private boolean touched;
   private boolean targetVisible = true;
   private HeightHandler acceptBounds;
   private HeightHandler declineBounds;

   public GuiFriendRequestElement(String s, String s1) {
      this.WALKABLE = s;
      this.role = s1 == null ? "" : s1;
   }

   // $VF: renamed from: key () java.lang.String
   public String next() {
      return "request:" + this.WALKABLE;
   }

   public void beginSync() {
      this.touched = false;
   }

   public void syncFromRequest(String s) {
      this.touched = true;
      this.targetVisible = true;
      this.role = s == null ? "" : s;
   }

   public boolean shouldRemoveAfterSync() {
      if (!this.touched) {
         this.targetVisible = false;
         return this.visibleAnimation.StringHolder_8(0.0F) <= 0.02F;
      } else {
         this.visibleAnimation.StringHolder_8(1.0F);
         return false;
      }
   }

   public float render(floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, ZenithStyle zenithstyle) {
      float f4 = this.visibleAnimation.StringHolder_8(this.targetVisible ? 1.0F : 0.0F);
      if (f4 <= 0.02F) {
         this.acceptBounds = null;
         this.declineBounds = null;
         return 0.0F;
      } else {
         float f5 = f3 * f4;
         Font font = Fonts.NEW_MEDIUM.getFont(5.0F);
         Font font1 = Fonts.NEW_REGULAR.getFont(4.8F);
         Font font2 = Fonts.NEW_MEDIUM.getFont(4.5F);
         float f6 = 14.0F;
         float f7 = 52.0F;
         float f8 = (float)GuiStyle.PADDING.intValue();
         float f9 = 13.0F;
         float f10 = f + (float)(GuiStyle.PADDING * 2);
         float f11 = f1 + (28.0F - f9) / 2.0F;
         float f12 = f10 + f9 + 4.0F;
         float f13 = font.height() + (float)GuiStyle.PADDING.intValue() / 2.0F + font1.height();
         float f14 = f11 + (f9 - f13) / 2.0F;
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f,
            f1,
            f2,
            28.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceDisableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f3)
         );
         iiii1ilili1l1l1lilli1liliii.EventBus(
            f,
            f1,
            f2,
            28.0F,
            floatHolder_5.StringHolder_30((float)GuiStyle.ROUND.intValue()),
            zenithstyle.getSurfaceEnableBackground().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f3)
         );
         iiii1ilili1l1l1lilli1liliii.I1lllI1IlllIl11Ill1lIl1();
         floatHolder_8.EventBus(
            iiii1ilili1l1l1lilli1liliii.getMatrices(),
            FriendSkinResolver.resolveSkin(this.WALKABLE),
            f10,
            f11,
            f9,
            floatHolder_5.StringHolder_30(2.0F),
            ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(f5)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font, "UID " + this.WALKABLE, f12, f14, zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font1,
            this.role.isEmpty() ? "Unknown role" : this.role,
            f12,
            f14 + font.height() + (float)GuiStyle.PADDING.intValue() / 2.0F,
            zenithstyle.getTextSecondary().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5)
         );
         float f15 = f + f2 - f7 - 8.0F;
         float f16 = f15 - f8 - f7;
         float f17 = f1 + (28.0F - f6) / 2.0F;
         this.acceptBounds = new HeightHandler(f16, f17, f7, f6);
         this.declineBounds = new HeightHandler(f15, f17, f7, f6);
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f16,
            f17,
            f7,
            f6,
            floatHolder_5.StringHolder_30(5.0F),
            zenithstyle.getPrimaryColor().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            "Accept",
            f16 + (f7 - font2.width("Accept")) / 2.0F,
            f17 + (f6 - font2.height()) / 2.0F,
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            f15,
            f17,
            f7,
            f6,
            floatHolder_5.StringHolder_30(5.0F),
            zenithstyle.getDisableActiveBg().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5)
         );
         iiii1ilili1l1l1lilli1liliii.StringHolder_8(
            font2,
            "Decline",
            f15 + (f7 - font2.width("Decline")) / 2.0F,
            f17 + (f6 - font2.height()) / 2.0F,
            zenithstyle.getTextEnable().l1IllIl1l1llIlI11I11Il1l1l1lI1().ZenithInternal039(f5)
         );
         return f4;
      }
   }

   @Override
   public String getName() {
      return this.WALKABLE;
   }

   @Override
   public float getHeight() {
      return 28.0F;
   }

   @Override
   public float getWidth() {
      return 0.0F;
   }

   @Override
   public boolean onMouseClicked(double d0, double d1, ZenithInternal068 ill1iili11ii1l) {
      return false;
   }

   public void setRole(String s) {
      this.role = s == null ? "" : s;
   }

   public void setTouched(boolean flag) {
      this.touched = flag;
   }

   public void setTargetVisible(boolean flag) {
      this.targetVisible = flag;
   }

   public GetStartTimeHandler getVisibleAnimation() {
      return this.visibleAnimation;
   }

   public String getUid() {
      return this.WALKABLE;
   }

   public String getRole() {
      return this.role;
   }

   public boolean isTouched() {
      return this.touched;
   }

   public boolean isTargetVisible() {
      return this.targetVisible;
   }

   public HeightHandler getAcceptBounds() {
      return this.acceptBounds;
   }

   public HeightHandler getDeclineBounds() {
      return this.declineBounds;
   }
}
