package l;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;

public class Helper63 implements Helper141, Helper160 {
   private String texture;

   public Helper63() {
   }

   @Override
   public void method677(Helper80 var1) {
      MatrixStack var2 = var1.method846();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShaderTexture(0, Identifier.of(this.texture));
      float var3 = var1.method849();
      float var4 = var1.method847() + var3;
      float var5 = var1.method848();
      var2.push();
      var2.translate(var4, var5, 0.0F);
      var2.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(90.0F));
      var2.translate(-var4, -var5, 0.0F);
      drawEngine.method1435(var2.peek().getPositionMatrix(), var4, var5, var1.method850(), var3, var1.method858().x);
      var2.pop();
      RenderSystem.disableBlend();
   }

   public Helper63 method678(String var1) {
      this.texture = var1;
      return this;
   }
}
