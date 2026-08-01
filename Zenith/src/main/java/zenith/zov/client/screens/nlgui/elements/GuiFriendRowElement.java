package zenith.zov.client.screens.nlgui.elements;

import zenith.floatHolder_4;
import zenith.IReturn;
import zenith.ZenithInternal068;
import zenith.HeightHandler;
import zenith.GetStartTimeHandler;
import zenith.zov.client.screens.nlgui.elements.api.Element;
import zenith.zov.client.screens.nlgui.style.ZenithStyle;

public abstract class GuiFriendRowElement extends Element {
   public static final float HEIGHT = 28.0F;
   public static final float REMOVE_HEIGHT = 13.0F;
   private final GetStartTimeHandler visibleAnimation = new GetStartTimeHandler(220L, 0.0F, IReturn.ListHolder_8);
   private final GetStartTimeHandler removeHoverAnimation = new GetStartTimeHandler(160L, 0.0F, IReturn.ScreenImpl);
   private boolean touched;
   private boolean targetVisible = true;
   private float order;
   private HeightHandler removeBounds;
   protected HeightHandler bounds;

   // $VF: renamed from: key () java.lang.String
   public abstract String getEnd();

   public abstract boolean isCloud();

   public abstract String getCloudUid();

   public abstract String getLocalName();

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

   public abstract float render(
      floatHolder_4 iiii1ilili1l1l1lilli1liliii, float f, float f1, float f2, float f3, float f4, float f5, ZenithStyle zenithstyle
   );

   public final void beginSync() {
      this.touched = false;
   }

   public final void markPresent(float f) {
      this.touched = true;
      this.targetVisible = true;
      this.order = f;
   }

   public final boolean shouldRemoveAfterSync() {
      if (!this.touched) {
         this.targetVisible = false;
         return this.visibleAnimation.StringHolder_8(0.0F) <= 0.02F;
      } else {
         this.visibleAnimation.StringHolder_8(1.0F);
         return false;
      }
   }

   protected final float updateVisible() {
      return this.visibleAnimation.StringHolder_8(this.targetVisible ? 1.0F : 0.0F);
   }

   public HeightHandler getRemoveBounds() {
      return this.removeBounds;
   }

   public HeightHandler getBounds() {
      return this.bounds;
   }

   protected void setRemoveBounds(HeightHandler li1il11i1iilii1iiili111li11) {
      this.removeBounds = li1il11i1iilii1iiili111li11;
   }

   public GetStartTimeHandler getRemoveHoverAnimation() {
      return this.removeHoverAnimation;
   }

   public GetStartTimeHandler getVisibleAnimation() {
      return this.visibleAnimation;
   }

   public boolean isTargetVisible() {
      return this.targetVisible;
   }

   public void setTargetVisible(boolean flag) {
      this.targetVisible = flag;
   }

   public float getOrder() {
      return this.order;
   }
}
