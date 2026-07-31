package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.RenderPhase.LineWidth;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ESP",
   O000000000 = "Подцветка игроков",
   O0000000000 = Category.Visuals
)
public class ESP extends Module {
   private static final int O000000000O00O = 2048;
   private static final int O000000000O0O = 96;
   private static final int O000000000O0O0 = O0000O000OO000.O0000000000(52, 255, 96, 255);
   public final GroupSetting O000000000O = new GroupSetting("Targets", new BooleanSetting("Players", true), new BooleanSetting("Mobs", true));
   public final NumberSetting O000000000O0 = new NumberSetting("Distance", 72.0F, 8.0F, 200.0F, 1.0F, false);
   public final BooleanSetting O000000000O00 = new BooleanSetting("Fill", true);
   public final BooleanSetting O000000000O000 = new BooleanSetting("Outline", true);
   private final List<Entity> O000000000O0OO = new ArrayList<>(96);
   private final int[] O000000000OO = new int[4];
   private static final RenderPipeline O000000000OO0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("minecraft", "rendertype_lequal_depth_test"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline O000000000OO00 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("minecraft", "rendertype_lines"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.DEBUG_LINES)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O000000000OO0O = RenderLayer.of(
      "litka_esp_fill", 2048, false, true, O000000000OO0, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O000000000OOO = RenderLayer.of(
      "litka_esp_line", 2048, false, true, O000000000OO00, MultiPhaseParameters.builder().lineWidth(new LineWidth(OptionalDouble.of(2.2))).build(false)
   );

   public ESP() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000});
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (O0000000000.world != null && O0000000000.player != null) {
         List var2 = this.O0000000000O0();
         if (!var2.isEmpty()) {
            Immediate var3 = O0000O00O0O00.O00000000();

            try {
               for (Entity var5 : (List<Entity>)var2) {
                  this.O00000000(o0000000OO0000.O0000000000(), var3, var5, o0000000OO0000.O00000000000());
               }
            } finally {
               O0000O00O0O00.O000000000();
            }
         }
      }
   }

   private List<Entity> O0000000000O0() {
      this.O000000000O0OO.clear();
      float var1 = this.O000000000O0.O0000000000() * this.O000000000O0.O0000000000();
      boolean var2 = this.O000000000O.O000000000("Players");
      boolean var3 = this.O000000000O.O000000000("Mobs");

      for (Entity var5 : O0000000000.world.getEntities()) {
         if (this.O000000000O0OO.size() >= 96) {
            break;
         }

         if (this.O00000000(var5, var2, var3) && !(O0000000000.player.squaredDistanceTo(var5) > var1)) {
            this.O000000000O0OO.add(var5);
         }
      }

      return this.O000000000O0OO;
   }

   private boolean O00000000(Entity entity, boolean bl, boolean bl2) {
      if (entity != null && entity != O0000000000.player) {
         if (!(entity instanceof LivingEntity var4 && var4.isAlive())) {
            return false;
         } else {
            return entity instanceof PlayerEntity ? bl : bl2;
         }
      } else {
         return false;
      }
   }

   private void O00000000(MatrixStack matrixStack, Immediate immediate, Entity entity, float f) {
      Vec3d var5 = O0000000000.gameRenderer.getCamera().getPos();
      Vec3d var6 = this.O00000000(entity, f);
      Box var7 = entity.getBoundingBox().offset(var6.x - entity.getX(), var6.y - entity.getY(), var6.z - entity.getZ());
      float var8 = entity instanceof PlayerEntity ? 0.09F : 0.06F;
      Box var9 = var7.expand(var8).offset(-var5.x, -var5.y, -var5.z);
      int var10 = this.O000000000(entity);
      float var11 = this.O00000000(entity);
      int var12 = O0000O000OO000.O0000000000000(var10, 0.92F);
      int var13 = O0000O000OO000.O000000000000(var10, 0.62F);
      int var14 = O0000O000OO000.O000000000000(var10, 0.8F);
      int[] var15 = this.O000000000OO;
      var15[0] = O0000O000OO000.O000000000(var12, var14, 0, 10);
      var15[1] = O0000O000OO000.O000000000(var14, var13, 90, 10);
      var15[2] = O0000O000OO000.O000000000(var13, var14, 180, 10);
      var15[3] = O0000O000OO000.O000000000(var14, var12, 270, 10);
      Matrix4f var16 = matrixStack.peek().getPositionMatrix();
      if (this.O000000000O00.O0000000000()) {
         int var17 = (int)(MathHelper.clamp(var11, 0.1F, 1.0F) * 95.0F);
         VertexConsumer var18 = immediate.getBuffer(O000000000OO0O);
         O0000O0O0O0.O00000000(var18, var16, var9.minX, var9.minY, var9.minZ, var9.maxX, var9.maxY, var9.maxZ, var15, var17);
      }

      if (this.O000000000O000.O0000000000()) {
         int var19 = (int)(MathHelper.clamp(var11, 0.2F, 1.0F) * 255.0F);
         VertexConsumer var20 = immediate.getBuffer(O000000000OOO);
         O0000O0O0O0.O00000000(var20, var16, var9.minX, var9.minY, var9.minZ, var9.maxX, var9.maxY, var9.maxZ, var15, var19, 0.18, 0.06);
      }
   }

   private Vec3d O00000000(Entity entity, float f) {
      double var3 = MathHelper.lerp(f, entity.lastRenderX, entity.getX());
      double var5 = MathHelper.lerp(f, entity.lastRenderY, entity.getY());
      double var7 = MathHelper.lerp(f, entity.lastRenderZ, entity.getZ());
      return new Vec3d(var3, var5, var7);
   }

   private float O00000000(Entity entity) {
      float var2 = O0000000000.player.distanceTo(entity);
      float var3 = Math.max(this.O000000000O0.O0000000000(), 1.0F);
      return 1.0F - MathHelper.clamp(var2 / var3, 0.0F, 1.0F);
   }

   private int O000000000(Entity entity) {
      if (entity instanceof PlayerEntity var2) {
         String var3 = var2.getGameProfile() != null ? var2.getGameProfile().getName() : var2.getName().getString();
         return FriendCommand.O00000000(var3) ? O000000000O0O0 : O0000O000OO000.O000000000O000(var2.getId() * 17);
      } else {
         return O0000O000OO000.O000000000O000(entity.getId() * 11);
      }
   }
}
