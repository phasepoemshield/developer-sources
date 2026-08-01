package l;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;

public class Arrows extends Helper242 {
   private static final int FRIEND_ARROW_COLOR = -11141291;
   private final Helper467 radiusAnim = new Animation2().method5003(150).method5004(6.0);
   private final Setting5 arrowMode = new Setting5("Режим ", "Режим логики свапа").method2381("Кристалы", "Стрелка").method2383("Стрелка");
   private final Setting2 radiusSetting = new Setting2("Радиус", "Радиус стрелок").method2086(50.0F).method2079(30, 100);
   private final Setting2 sizeSetting = new Setting2("Размер", "Размер стрелок").method2086(10.0F).method2079(8, 20);
   public final Setting7 colorSetting = new Setting7("Цвет", "Main accent color").method2555(-39623).method2551(-9659651, -7569409, -23178, -33925);
   private final List<PlayerEntity> players = new ArrayList<>();

   public Arrows() {
      super("Arrows", "Arrows", Helper269.RENDER);
      this.setup(new Helper264[]{this.arrowMode, this.radiusSetting, this.sizeSetting, this.colorSetting});
   }

   @Helper104
   public void onTick(Event8 var1) {
      this.radiusAnim.method4997(mc.player.isSprinting() ? Helper450.FORWARDS : Helper450.BACKWARDS);
   }

   @Helper104
   public void onDraw(Event20 var1) {
      int var2 = this.colorSetting.method2553();
      if (this.arrowMode.method2385("Кристалы")) {
         MatrixStack var3 = var1.method4058().getMatrices();
         List<? extends net.minecraft.entity.Entity> var4 = mc.world
            .getPlayers()
            .stream()
            .filter(var0 -> var0 != mc.player && var0.isAlive() && var0.getHealth() > 0.0F)
            .filter(var1x -> !this.method2067(var1x))
            .toList();
         float var5 = mc.getWindow().getScaledWidth() / 2.0F;
         float var6 = mc.getWindow().getScaledHeight() / 2.0F;
         float var7 = var6 - this.radiusSetting.method2082() - this.radiusAnim.method5000().floatValue();
         float var8 = this.sizeSetting.method2082();
         if (!mc.options.hudHidden && mc.options.getPerspective().equals(Perspective.FIRST_PERSON) && !var4.isEmpty()) {
            RenderSystem.enableBlend();
            RenderSystem.disableCull();
            RenderSystem.disableDepthTest();
            RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
            RenderSystem.setShaderTexture(0, Identifier.of("textures/teremok/arrows/cristal.png"));
            RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
            BufferBuilder var9 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            var4.forEach(
               var7x -> {
                  int var8x = Helper309.method3075(var7x) ? -11141291 : var2;
                  float var9x = method2068(var7x) - mc.player.getYaw();
                  var3.push();
                  var3.translate(var5, var6, 0.0F);
                  var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var9x));
                  var3.translate(-var5, -var6, 0.0F);
                  Matrix4f var10x = var3.peek().getPositionMatrix();
                  var9.vertex(var10x, var5 - var8 / 2.0F, var7 + var8, 0.0F)
                     .texture(0.0F, 1.0F)
                     .color(Helper133.method1108(Helper133.method1132(var8x, 0.4F), 0.5F));
                  var9.vertex(var10x, var5 + var8 / 2.0F, var7 + var8, 0.0F)
                     .texture(1.0F, 1.0F)
                     .color(Helper133.method1108(Helper133.method1132(var8x, 0.4F), 0.5F));
                  var9.vertex(var10x, var5 + var8 / 2.0F, var7, 0.0F).texture(1.0F, 0.0F).color(var8x);
                  var9.vertex(var10x, var5 - var8 / 2.0F, var7, 0.0F).texture(0.0F, 0.0F).color(var8x);
                  var3.translate(var5, var6, 0.0F);
                  var3.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-var9x));
                  var3.translate(-var5, -var6, 0.0F);
                  var3.pop();
               }
            );
            BufferRenderer.drawWithGlobalProgram(var9.end());
            RenderSystem.enableDepthTest();
            RenderSystem.enableCull();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
         }
      } else if (this.arrowMode.method2385("Стрелка")) {
         MatrixStack var10 = var1.method4058().getMatrices();
         List<? extends net.minecraft.entity.Entity> var11 = mc.world
            .getPlayers()
            .stream()
            .filter(var0 -> var0 != mc.player && var0.isAlive() && var0.getHealth() > 0.0F)
            .filter(var1x -> !this.method2067(var1x))
            .toList();
         float var12 = mc.getWindow().getScaledWidth() / 2.0F;
         float var13 = mc.getWindow().getScaledHeight() / 2.0F;
         float var14 = var13 - this.radiusSetting.method2082() - this.radiusAnim.method5000().floatValue();
         float var15 = this.sizeSetting.method2082();
         if (!mc.options.hudHidden && mc.options.getPerspective().equals(Perspective.FIRST_PERSON) && !var11.isEmpty()) {
            RenderSystem.enableBlend();
            RenderSystem.disableCull();
            RenderSystem.disableDepthTest();
            RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
            RenderSystem.setShaderTexture(0, Identifier.of("textures/teremok/arrows/arrow.png"));
            RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
            BufferBuilder var16 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
            var11.forEach(
               var7x -> {
                  int var8x = Helper309.method3075(var7x) ? -11141291 : var2;
                  float var9x = method2068(var7x) - mc.player.getYaw();
                  var10.push();
                  var10.translate(var12, var13, 0.0F);
                  var10.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var9x));
                  var10.translate(-var12, -var13, 0.0F);
                  Matrix4f var10x = var10.peek().getPositionMatrix();
                  var16.vertex(var10x, var12 - var15 / 2.0F, var14 + var15, 0.0F)
                     .texture(0.0F, 1.0F)
                     .color(Helper133.method1108(Helper133.method1132(var8x, 0.4F), 0.5F));
                  var16.vertex(var10x, var12 + var15 / 2.0F, var14 + var15, 0.0F)
                     .texture(1.0F, 1.0F)
                     .color(Helper133.method1108(Helper133.method1132(var8x, 0.4F), 0.5F));
                  var16.vertex(var10x, var12 + var15 / 2.0F, var14, 0.0F).texture(1.0F, 0.0F).color(var8x);
                  var16.vertex(var10x, var12 - var15 / 2.0F, var14, 0.0F).texture(0.0F, 0.0F).color(var8x);
                  var10.translate(var12, var13, 0.0F);
                  var10.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(-var9x));
                  var10.translate(-var12, -var13, 0.0F);
                  var10.pop();
               }
            );
            BufferRenderer.drawWithGlobalProgram(var16.end());
            RenderSystem.enableDepthTest();
            RenderSystem.enableCull();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableBlend();
         }
      }
   }

   private boolean method2067(AbstractClientPlayerEntity var1) {
      if (var1.getCustomName() != null) {
         String var2 = var1.getCustomName().getString();
         return var2 != null && var2.startsWith("Ghost_");
      } else {
         return var1.getClass().getSimpleName().equals("OtherClientPlayerEntity") && var1.getPitch() == -30.0F;
      }
   }

   public static float method2068(Entity var0) {
      double var1 = Helper147.method1249(var0.getX(), var0.getX()) - Helper147.method1249(mc.player.getX(), mc.player.getX());
      double var3 = Helper147.method1249(var0.getZ(), var0.getZ()) - Helper147.method1249(mc.player.getZ(), mc.player.getZ());
      return (float)(-(Math.atan2(var1, var3) * (180.0 / Math.PI)));
   }
}
