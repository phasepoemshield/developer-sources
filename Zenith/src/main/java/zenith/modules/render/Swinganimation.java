// Module: SwingAnimation
// Category: render
// Original class: Swinganimation
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.render;

import net.minecraft.util.Arm;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

@ModuleInfo(
   name = "SwingAnimation",
   category = Category.RENDER,
   description = "Кастомные анимации замаха"
)
public final class Swinganimation extends Module {
   public static final Swinganimation I111l11lIl1llIIl1IlI1I1lII1 = new Swinganimation();
   public ModeSetting IlIl1II11l1III1IlIIl1l1II = new ModeSetting(
      "module.swingAnimation.animationMode",
      "module.swingAnimation.animationMode.desc",
      "module.swingAnimation.normal",
      "module.swingAnimation.first",
      "module.swingAnimation.second",
      "module.swingAnimation.third",
      "module.swingAnimation.fourth",
      "module.swingAnimation.fifth",
      "module.swingAnimation.sixth",
      "module.swingAnimation.seventh",
      "module.swingAnimation.eighth"
   );
   public NumberSetting ll11llIIl1II1lI1Il1I = new NumberSetting(
      "module.swingAnimation.swingPower", 5.0F, 1.0F, 20.0F, 0.1F, "module.swingAnimation.swingPower.desc", "x"
   );
   public final BooleanSetting IIll11lI1IlII11l1l1I1lI1 = new BooleanSetting(
      "module.swingAnimation.onlyAura", "module.swingAnimation.onlyAura.desc", false
   );

   private Swinganimation() {
   }

   public void StringHolder_8(MatrixStack MatrixStack, float f, float f1, Arm Arm) {
      if (this.IlIl1II11l1III1IlIIl1l1II.ClearHeadersHandler(0)) {
         MatrixStack.translate(0.56F, -0.52F, -0.72F);
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(45.0F + MathHelper.sin(f * f * (float) Math.PI) * -20.0F));
         float f2 = MathHelper.sin(MathHelper.sqrt(f) * (float) Math.PI);
         MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(f2 * -20.0F));
         MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(f2 * -80.0F));
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-45.0F));
      } else if (this.IlIl1II11l1III1IlIIl1l1II.ClearHeadersHandler(1)) {
         if (f > 0.0F) {
            float f5 = MathHelper.sin(MathHelper.sqrt(f) * (float) Math.PI);
            MatrixStack.translate(0.56F, f1 * -0.2F - 0.5F, -0.7F);
            MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(45.0F));
            MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(f5 * -85.0F));
            MatrixStack.translate(-0.1F, 0.28F, 0.2F);
            MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-85.0F));
         } else {
            float f6 = -0.4F * MathHelper.sin(MathHelper.sqrt(f) * (float) Math.PI);
            float f3 = 0.2F * MathHelper.sin(MathHelper.sqrt(f) * (float) (Math.PI * 2));
            float f4 = -0.2F * MathHelper.sin(f * (float) Math.PI);
            MatrixStack.translate(f6, f3, f4);
            this.StringHolder_8(MatrixStack, Arm, f1);
            this.EventBus(MatrixStack, Arm, f);
         }
      } else if (this.IlIl1II11l1III1IlIIl1l1II.ClearHeadersHandler(2)) {
         float f7 = MathHelper.sin(MathHelper.sqrt(f) * (float) Math.PI);
         this.StringHolder_8(MatrixStack, Arm, 0.0F);
         MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(50.0F));
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-60.0F));
         MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(110.0F + 20.0F * f7));
      } else if (this.IlIl1II11l1III1IlIIl1l1II.ClearHeadersHandler(3)) {
         float f8 = MathHelper.sin(MathHelper.sqrt(f) * (float) Math.PI);
         this.StringHolder_8(MatrixStack, Arm, 0.0F);
         MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(50.0F));
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-30.0F * (1.0F - f8) - 30.0F));
         MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(110.0F));
      } else if (this.IlIl1II11l1III1IlIIl1l1II.ClearHeadersHandler(4)) {
         float f9 = MathHelper.sin(f * (float) Math.PI);
         this.StringHolder_8(MatrixStack, Arm, 0.0F);
         MatrixStack.translate(0.1F, -0.2F, -0.3F);
         MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-30.0F * f9 - 36.0F));
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(25.0F * f9));
         MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(12.0F));
      } else if (this.IlIl1II11l1III1IlIIl1l1II.ClearHeadersHandler(5)) {
         float f10 = MathHelper.sin(MathHelper.sqrt(f) * (float) Math.PI);
         this.StringHolder_8(MatrixStack, Arm, 0.0F);
         MatrixStack.translate(0.0F, -0.2F, -0.4F);
         MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-120.0F * f10 - 3.0F));
      } else if (this.IlIl1II11l1III1IlIIl1l1II.ClearHeadersHandler(6)) {
         MatrixStack.translate(0.56F, -0.52F + Math.sin((double)((f > 0.0F ? f : 1.0F) * f1)) / 6.0, -0.72F);
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(45.0F + MathHelper.sin(f * f * (float) Math.PI) * -20.0F));
         float f11 = MathHelper.sin(MathHelper.sqrt(f) * (float) Math.PI);
         MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(f11 * -20.0F));
         MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(f11 * -80.0F));
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-45.0F));
      } else if (this.IlIl1II11l1III1IlIIl1l1II.ClearHeadersHandler(7)) {
         this.StringHolder_8(MatrixStack, Arm, 0.0F);
         MatrixStack.multiply(RotationAxis.NEGATIVE_X.rotationDegrees(360.0F * f));
      } else if (this.IlIl1II11l1III1IlIIl1l1II.ClearHeadersHandler(8)) {
         float f12 = (float)Math.sin((double)f * (Math.PI / 2) * 2.0);
         int i = Arm == Arm.RIGHT ? 1 : -1;
         MatrixStack.translate((double)((float)i * 0.56F), -0.52F, -(1.0 + (double)f12 * 0.2));
         MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-180.0F));
         MatrixStack.multiply(RotationAxis.NEGATIVE_Z.rotationDegrees(30.0F));
         MatrixStack.multiply(RotationAxis.NEGATIVE_Z.rotationDegrees(-180.0F * f12));
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(50.0F));
         MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(60.0F * f12));
      }
   }

   private void StringHolder_8(MatrixStack MatrixStack, Arm Arm, float f) {
      int i = Arm == Arm.RIGHT ? 1 : -1;
      MatrixStack.translate((float)i * 0.56F, -0.52F + f * -0.6F, -0.72F);
   }

   private void EventBus(MatrixStack MatrixStack, Arm Arm, float f) {
      int i = Arm == Arm.RIGHT ? 1 : -1;
      float f1 = MathHelper.sin(f * f * (float) Math.PI);
      MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float)i * (45.0F + f1 * -20.0F)));
      float f2 = MathHelper.sin(MathHelper.sqrt(f) * (float) Math.PI);
      MatrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees((float)i * f2 * -20.0F));
      MatrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(f2 * -80.0F));
      MatrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float)i * -45.0F));
   }
}
