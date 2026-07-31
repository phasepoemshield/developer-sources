package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "JumpCircle",
   O000000000 = "Тонкая гравитационная линза у ног при прыжке",
   O0000000000 = Category.Visuals
)
public class JumpCircle extends Module {
   private static final long O000000000O = 250L;
   private static final long O000000000O0 = 1500L;
   private static final long O000000000O00 = 850L;
   private static final float O000000000O000 = 1.95F;
   private static final float O000000000O00O = 0.04F;
   private final List<JumpCircle.W167> O000000000O0O = new ArrayList<>();
   private long O000000000O0O0;

   public JumpCircle() {
      O00000O0OO.O00000000();
   }

   @EventHandler
   public void O00000000(O0000000O0OO00 o0000000O0OO00) {
      if (O0000000000.player != null) {
         long var2 = System.currentTimeMillis();
         if (var2 - this.O000000000O0O0 >= 250L) {
            this.O000000000O0O0 = var2;
            Vec3d var4 = O0000000000.player.getPos().add(0.0, 0.04F, 0.0);
            this.O000000000O0O.add(new JumpCircle.W167(var4, var2));
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (!this.O000000000O0O.isEmpty()) {
         long var2 = System.currentTimeMillis();
         this.O000000000O0O.removeIf(o00000000 -> var2 - o00000000.O000000000 > 1500L);
         if (!this.O000000000O0O.isEmpty()) {
            Theme var4 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null
               ? WildClient.O00000000.O0000000000O.O000000000()
               : Theme.WILD;
            int var5 = var4 == Theme.WILD ? 8108031 : var4.O00000000().getRGB() & 16777215;
            int var6 = var5 >> 16 & 0xFF;
            int var7 = var5 >> 8 & 0xFF;
            int var8 = var5 & 0xFF;
            Immediate var9 = O0000O00O0O00.O00000000();

            try {
               VertexConsumer var10 = var9.getBuffer(O00000O0OO.O000000000());
               MatrixStack var11 = o0000000OO0000.O0000000000();
               Vec3d var12 = O0000000000.gameRenderer.getCamera().getPos();

               for (JumpCircle.W167 var14 : this.O000000000O0O) {
                  long var15 = var2 - var14.O000000000;
                  if (var15 >= 850L && !var14.O0000000000000) {
                     var14.O000000000000.O00000000(0.0, 0.65, O0000O0O00.O0000000000O);
                     var14.O00000000000.O00000000(1.35, 0.65, O0000O0O00.O0000000000O);
                     var14.O0000000000000 = true;
                  }

                  var14.O0000000000.O00000000();
                  var14.O00000000000.O00000000();
                  var14.O000000000000.O00000000();
                  float var17 = O00000000((float)var14.O0000000000.O00000000000O0());
                  float var18 = (float)var14.O00000000000.O00000000000O0();
                  float var19 = O00000000((float)var14.O000000000000.O00000000000O0());
                  if (!(var19 <= 0.002F) && !(var18 <= 0.001F)) {
                     int var20 = Math.max(0, Math.min(255, Math.round(var19 * var17 * 255.0F)));
                     float var21 = 1.95F * var18 * var17;
                     var11.push();
                     var11.translate(var14.O00000000.x - var12.x, var14.O00000000.y - var12.y, var14.O00000000.z - var12.z);
                     var11.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
                     Matrix4f var22 = var11.peek().getPositionMatrix();
                     this.O00000000(var10, var22, -var21 * 0.5F, -var21 * 0.5F, var21, var21, var6, var7, var8, var20);
                     var11.pop();
                  }
               }
            } finally {
               O0000O00O0O00.O000000000();
            }
         }
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, int j, int k, int l, int m) {
      float var13 = f + h;
      float var14 = g + i;
      vertexConsumer.vertex(matrix4f, f, g, 0.0F).texture(0.0F, 0.0F).color(j, k, l, m).normal(0.0F, 0.0F, 1.0F);
      vertexConsumer.vertex(matrix4f, var13, g, 0.0F).texture(1.0F, 0.0F).color(j, k, l, m).normal(0.0F, 0.0F, 1.0F);
      vertexConsumer.vertex(matrix4f, var13, var14, 0.0F).texture(1.0F, 1.0F).color(j, k, l, m).normal(0.0F, 0.0F, 1.0F);
      vertexConsumer.vertex(matrix4f, f, var14, 0.0F).texture(0.0F, 1.0F).color(j, k, l, m).normal(0.0F, 0.0F, 1.0F);
   }

   private static float O00000000(float f) {
      return f < 0.0F ? 0.0F : (f > 1.0F ? 1.0F : f);
   }

   static final class W167 {
      final Vec3d O00000000;
      final long O000000000;
      final O0000O00OOOO0 O0000000000 = new O0000O00OOOO0();
      final O0000O00OOOO0 O00000000000 = new O0000O00OOOO0();
      final O0000O00OOOO0 O000000000000 = new O0000O00OOOO0();
      boolean O0000000000000;

      W167(Vec3d vec3d, long l) {
         this.O00000000 = vec3d;
         this.O000000000 = l;
         this.O0000000000.O00000000(1.0, 0.28, O0000O0O00.O0000000000O);
         this.O00000000000.O00000000(1.0, 0.4, O0000O0O00.O0000000000O0O);
         this.O000000000000.O00000000(1.0, 0.18, O0000O0O00.O0000000000O0O);
      }
   }
}
