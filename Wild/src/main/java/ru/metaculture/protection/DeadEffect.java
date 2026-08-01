package ru.metaculture.protection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.option.Perspective;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.EntityModels;
import net.minecraft.client.render.entity.model.LoadedEntityModels;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.render.entity.state.PlayerEntityRenderState;
import net.minecraft.client.util.SkinTextures.Model;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "DeadEffect",
   O000000000 = "Плавный выход души из модели игрока при потере тотема или смерти.",
   O0000000000 = Category.Visuals
)
public final class DeadEffect extends Module {
   private static final String O000000000O = "Тотем";
   private static final String O000000000O0 = "Смерть";
   private static final String O000000000O00 = "Себя";
   private static final String O000000000O000 = "Игроки";
   private static final long O000000000O00O = 180000000L;
   private static final long O000000000O0O = 700000000L;
   private static final long O000000000O0O0 = 5000000000L;
   private static final float O000000000O0OO = (float) (Math.PI * 2);
   private static final int O000000000OO = 96;
   private static final int O000000000OO0 = 36;
   private final GroupSetting O000000000OO00 = new GroupSetting("События", new BooleanSetting("Тотем", true), new BooleanSetting("Смерть", true));
   private final GroupSetting O000000000OO0O = new GroupSetting("Цели", new BooleanSetting("Себя", true), new BooleanSetting("Игроки", true));
   private final NumberSetting O000000000OOO = new NumberSetting("Длительность", 1.65F, 0.55F, 4.0F, 0.05F, false);
   private final NumberSetting O000000000OOO0 = new NumberSetting("Подъём", 1.85F, 0.6F, 4.0F, 0.05F, false);
   private final NumberSetting O000000000OOOO = new NumberSetting("Прозрачность", 0.74F, 0.15F, 1.0F, 0.01F, true);
   private final NumberSetting O00000000O = new NumberSetting("Свечение", 1.15F, 0.0F, 2.4F, 0.05F, false);
   private final NumberSetting O00000000O0 = new NumberSetting("Частицы", 34.0F, 0.0F, 90.0F, 1.0F, false);
   private final ColorSetting O00000000O00 = new ColorSetting("Цвет тотема", 31.0F, 0.82F, 1.0F);
   private final ColorSetting O00000000O000 = new ColorSetting("Цвет смерти", 74.0F, 0.68F, 1.0F);
   private final Map<Integer, DeadEffect.W140> O00000000O0000 = new ConcurrentHashMap<>();
   private final Map<Integer, DeadEffect.W138> O00000000O000O = new ConcurrentHashMap<>();
   private final Set<Integer> O00000000O00O = ConcurrentHashMap.newKeySet();
   private LoadedEntityModels O00000000O00O0;
   private PlayerEntityModel O00000000O00OO;
   private PlayerEntityModel O00000000O0O;
   private DeadEffect.W138 O00000000O0O0;
   private DeadEffect.W138 O00000000O0O00;

   public DeadEffect() {
      this.O00000000(
         new Setting[]{
            this.O000000000OO00,
            this.O000000000OO0O,
            this.O000000000OOO,
            this.O000000000OOO0,
            this.O000000000OOOO,
            this.O00000000O,
            this.O00000000O0,
            this.O00000000O00,
            this.O00000000O000
         }
      );
   }

   @Override
   public void O00000000() {
      this.O00000000O0000.clear();
      this.O00000000O000O.clear();
      this.O00000000O00O.clear();
      super.O00000000();
   }

   @Override
   public void O000000000() {
      this.O00000000O0000.clear();
      this.O00000000O000O.clear();
      this.O00000000O00O.clear();
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O000O o0000000O000O) {
      this.O00000000O0000.clear();
      this.O00000000O000O.clear();
      this.O00000000O00O.clear();
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.world != null && o0000000O000OO != null && !o0000000O000OO.O0000000000()) {
         if (o0000000O000OO.O00000000000() instanceof EntityStatusS2CPacket var2) {
            if (var2.getEntity(O0000000000.world) instanceof PlayerEntity var4 && this.O00000000(var4)) {
               byte var5 = var2.getStatus();
               if (var5 == 35 && this.O000000000OO00.O000000000("Тотем")) {
                  this.O00000000(var4, DeadEffect.W136.TOTEM);
               } else if (var5 == 3 && this.O000000000OO00.O000000000("Смерть") && O000000000(var4)) {
                  this.O00000000(var4, DeadEffect.W136.DEATH);
               }
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.world != null && O0000000000.player != null) {
         long var2 = System.nanoTime();
         this.O00000000(var2);

         for (PlayerEntity var5 : O0000000000.world.getPlayers()) {
            if (this.O00000000(var5)) {
               int var6 = var5.getId();
               if (O000000000(var5)) {
                  if (this.O00000000O00O.add(var6) && this.O000000000OO00.O000000000("Смерть")) {
                     this.O00000000(var5, DeadEffect.W136.DEATH);
                  }
               } else {
                  this.O00000000O00O.remove(var6);
               }
            }
         }
      } else {
         this.O00000000O0000.clear();
         this.O00000000O00O.clear();
      }
   }

   public static void O00000000(
      PlayerEntityRenderState playerEntityRenderState,
      PlayerEntityModel playerEntityModel,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider,
      int i,
      int j
   ) {
      DeadEffect var6 = O0000000000O0();
      if (var6 != null) {
         var6.O00000000(playerEntityRenderState, playerEntityModel);
      }
   }

   private void O00000000(PlayerEntityRenderState playerEntityRenderState, PlayerEntityModel playerEntityModel) {
      if (this.O0000000000000 && playerEntityRenderState != null && playerEntityModel != null && playerEntityRenderState.skinTextures != null) {
         if (!playerEntityRenderState.spectator && !playerEntityRenderState.invisible && !playerEntityRenderState.invisibleToPlayer) {
            DeadEffect.W138 var3 = DeadEffect.W138.capture(playerEntityModel, System.nanoTime());
            this.O00000000O000O.put(playerEntityRenderState.id, var3);
            DeadEffect.W140 var4 = this.O00000000O0000.get(playerEntityRenderState.id);
            if (var4 != null) {
               if (var4.O00000000000 == null) {
                  var4.O00000000000 = var3;
               }

               if (var4.O000000000000 == null) {
                  var4.O000000000000 = DeadEffect.W139.fromState(playerEntityRenderState);
               }

               if (var4.O0000000000000 == null) {
                  var4.O0000000000000 = playerEntityRenderState.skinTextures.texture();
               }

               var4.O000000000000O = O00000000(playerEntityRenderState);
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (this.O0000000000000 && O0000000000.world != null && O0000000000.player != null && o0000000OO0000 != null && !this.O00000000O0000.isEmpty()) {
         long var2 = System.nanoTime();
         this.O00000000(var2);
         if (!this.O00000000O0000.isEmpty()) {
            Immediate var4 = O0000O00O0O00.O00000000();

            try {
               for (Entry var6 : this.O00000000O0000.entrySet()) {
                  int var7 = (Integer)var6.getKey();
                  if (var7 != O0000000000.player.getId() || O0000000000.options == null || O0000000000.options.getPerspective() != Perspective.FIRST_PERSON) {
                     DeadEffect.W140 var8 = (DeadEffect.W140)var6.getValue();
                     if (!this.O00000000(var8, o0000000OO0000.O0000000000(), var4, var2)) {
                        this.O00000000O0000.remove(var7, var8);
                     }
                  }
               }
            } finally {
               O0000O00O0O00.O000000000();
            }
         }
      }
   }

   private boolean O00000000(DeadEffect.W140 o000000000000, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, long l) {
      if (o000000000000 != null && matrixStack != null && vertexConsumerProvider != null && o000000000000.O000000000000 != null) {
         float var6 = (float)(l - o000000000000.O000000000) / 1.0E9F;
         float var7 = this.O000000000(o000000000000.O00000000);
         float var8 = this.O00000000(o000000000000.O00000000);
         if (var6 >= var8) {
            return false;
         } else {
            float var9 = O000000000(var6 / var8);
            float var10 = O000000000(var6 / var7);
            float var11 = O00000000(var7 * 0.58F, var8, var6);
            float var12 = O00000000(0.0F, 0.11F, var9);
            float var13 = 1.0F - var11;
            float var14 = O000000000(var12 * var13 * this.O000000000OOOO.O0000000000());
            if (var14 <= 0.002F) {
               return true;
            } else {
               float var15 = O00000000(var10);
               float var16 = this.O000000000OOO0.O0000000000() * o000000000000.O00000000.O0000000000 * (var15 + var11 * 0.075F);
               float var17 = o000000000000.O0000000000 + var6 * 2.15F;
               float var18 = (float)Math.sin(var17 * 1.7F) * (0.025F + var11 * 0.045F) * var15;
               float var19 = (float)Math.cos(var17 * 1.3F) * (0.025F + var11 * 0.045F) * var15;
               float var20 = 1.0F + (float)Math.sin(var9 * Math.PI * 3.0) * 0.022F * (1.0F - var9);
               float var21 = (var20 + o000000000000.O00000000.O00000000000 * var15) * (1.0F + var11 * 0.055F);
               int var22 = this.O0000000000(o000000000000.O00000000);
               this.O00000000(matrixStack, vertexConsumerProvider, o000000000000, var9, var14, var16, var17, var11);
               Identifier var23 = o000000000000.O0000000000000;
               if (var23 == null) {
                  return true;
               } else {
                  PlayerEntityModel var24 = this.O0000000000(o000000000000.O000000000000O);
                  if (var24 == null) {
                     return true;
                  } else {
                     RenderLayer var25 = RenderLayer.getEntityTranslucentEmissive(var23);
                     int var26 = O00000000(
                        O00000000(16777215, var22, o000000000000.O00000000.O00000000000O0),
                        var14 * o000000000000.O00000000.O00000000000O * (1.0F - var11 * 0.22F)
                     );
                     DeadEffect.W138 var27 = o000000000000.O00000000000 != null ? o000000000000.O00000000000 : this.O00000000000(o000000000000.O000000000000O);
                     if (var27 != null) {
                        var27.apply(var24);
                     }

                     this.O00000000(
                        var24,
                        matrixStack,
                        vertexConsumerProvider,
                        var25,
                        o000000000000.O000000000000,
                        15728880,
                        OverlayTexture.DEFAULT_UV,
                        var18,
                        var16,
                        var19,
                        var21,
                        var26
                     );
                     return true;
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   private void O00000000(
      PlayerEntityModel playerEntityModel,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider,
      RenderLayer renderLayer,
      DeadEffect.W139 o00000000000,
      int i,
      int j,
      float f,
      float g,
      float h,
      float k,
      int l
   ) {
      if ((l >>> 24 & 0xFF) != 0) {
         matrixStack.push();
         this.O00000000(matrixStack, o00000000000, f, g, h, k);
         VertexConsumer var13 = vertexConsumerProvider.getBuffer(renderLayer);
         playerEntityModel.render(matrixStack, var13, i, j, l);
         matrixStack.pop();
         if (vertexConsumerProvider instanceof Immediate var14) {
            var14.draw(renderLayer);
         }
      }
   }

   private void O00000000(MatrixStack matrixStack, DeadEffect.W139 o00000000000, float f, float g, float h, float i) {
      Camera var7 = O0000000000.gameRenderer.getCamera();
      Vec3d var8 = var7 == null ? Vec3d.ZERO : var7.getPos();
      matrixStack.translate(o00000000000.x - var8.x + f, o00000000000.y - var8.y + g, o00000000000.z - var8.z + h);
      matrixStack.scale(o00000000000.baseScale, o00000000000.baseScale, o00000000000.baseScale);
      matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180.0F - o00000000000.bodyYaw));
      matrixStack.scale(-i, -i, i);
      matrixStack.translate(0.0F, -1.501F, 0.0F);
   }

   private PlayerEntityModel O0000000000(boolean bl) {
      if (this.O00000000O00O0 == null) {
         this.O00000000O00O0 = new LoadedEntityModels(EntityModels.getModels());
      }

      if (bl) {
         if (this.O00000000O0O == null) {
            this.O00000000O0O = new PlayerEntityModel(this.O00000000O00O0.getModelPart(EntityModelLayers.PLAYER_SLIM), true);
            this.O00000000O0O00 = DeadEffect.W138.capture(this.O00000000O0O, 0L);
         }

         return this.O00000000O0O;
      } else {
         if (this.O00000000O00OO == null) {
            this.O00000000O00OO = new PlayerEntityModel(this.O00000000O00O0.getModelPart(EntityModelLayers.PLAYER), false);
            this.O00000000O0O0 = DeadEffect.W138.capture(this.O00000000O00OO, 0L);
         }

         return this.O00000000O00OO;
      }
   }

   private DeadEffect.W138 O00000000000(boolean bl) {
      this.O0000000000(bl);
      return bl ? this.O00000000O0O00 : this.O00000000O0O0;
   }

   private void O00000000(PlayerEntity playerEntity, DeadEffect.W136 o00000000) {
      if (playerEntity != null && this.O00000000(playerEntity)) {
         int var3 = playerEntity.getId();
         long var4 = System.nanoTime();
         DeadEffect.W140 var6 = this.O00000000O0000.get(var3);
         if (var6 == null || var6.O00000000 != o00000000 || var4 - var6.O000000000 >= 180000000L) {
            DeadEffect.W138 var7 = this.O00000000O000O.get(var3);
            if (var7 != null && var4 - var7.capturedNanos > 700000000L) {
               var7 = null;
            }

            this.O00000000O0000
               .put(
                  var3,
                  new DeadEffect.W140(
                     o00000000,
                     var4,
                     (float)(ThreadLocalRandom.current().nextDouble() * Math.PI * 2.0),
                     var7,
                     DeadEffect.W139.fromPlayer(playerEntity),
                     O0000000000(playerEntity),
                     O00000000000(playerEntity)
                  )
               );
            if (this.O00000000O0.O0000000000() > 0.5F) {
               double var8 = playerEntity.getX();
               double var10 = playerEntity.getY();
               double var12 = playerEntity.getZ();
               double var14 = Math.max(1.0, (double)playerEntity.getHeight());
               O0000000000.execute(() -> this.O00000000(var8, var10, var12, var14, o00000000));
            }
         }
      }
   }

   private void O00000000(double d, double e, double f, double g, DeadEffect.W136 o00000000) {
      if (O0000000000.particleManager != null) {
         ThreadLocalRandom var10 = ThreadLocalRandom.current();
         int var11 = Math.max(0, Math.round(this.O00000000O0.O0000000000()));

         for (int var12 = 0; var12 < var11; var12++) {
            double var13 = var10.nextDouble(Math.PI * 2);
            double var15 = var10.nextDouble(0.08, 0.56);
            double var17 = d + Math.cos(var13) * var15;
            double var19 = e + var10.nextDouble(0.08, g + 0.42);
            double var21 = f + Math.sin(var13) * var15;
            double var23 = var10.nextDouble(0.018, 0.07);
            double var25 = Math.cos(var13) * var23;
            double var27 = var10.nextDouble(0.045, 0.145) * o00000000.O0000000000O00;
            double var29 = Math.sin(var13) * var23;
            O0000000000.particleManager.addParticle(o00000000.O00000000(var12), var17, var19, var21, var25, var27, var29);
         }
      }
   }

   private void O00000000(long l) {
      Iterator var3 = this.O00000000O0000.entrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         DeadEffect.W140 var5 = (DeadEffect.W140)var4.getValue();
         float var6 = this.O00000000(var5.O00000000) + 0.25F;
         if ((float)(l - var5.O000000000) > var6 * 1.0E9F) {
            var3.remove();
         }
      }

      this.O00000000O000O.entrySet().removeIf(entry -> l - entry.getValue().capturedNanos > 5000000000L);
   }

   private void O00000000(
      MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, DeadEffect.W140 o000000000000, float f, float g, float h, float i, float j
   ) {
      if (matrixStack != null && o000000000000.O000000000000 != null && !(g <= 0.01F) && O0000000000.gameRenderer != null) {
         Camera var9 = O0000000000.gameRenderer.getCamera();
         if (var9 != null) {
            RenderLayer var10 = O0000O0O0O.O0000000000();
            VertexConsumer var11 = vertexConsumerProvider.getBuffer(var10);
            Matrix4f var12 = matrixStack.peek().getPositionMatrix();
            Vec3d var13 = var9.getPos();
            DeadEffect.W139 var14 = o000000000000.O000000000000;
            float var15 = (float)(var14.x - var13.x);
            float var16 = (float)(var14.y - var13.y);
            float var17 = (float)(var14.z - var13.z);
            this.O00000000(var11, var12, o000000000000, var15, var16, var17, f, g, h);
            this.O00000000(var11, var12, o000000000000, var15, var16, var17, f, g, h, i);
            this.O000000000(var11, var12, o000000000000, var15, var16, var17, f, g, h);
            this.O00000000(var11, var12, o000000000000, var15, var16, var17, f, g, h, i, j);
            if (vertexConsumerProvider instanceof Immediate var18) {
               var18.draw(var10);
            }
         }
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, DeadEffect.W140 o000000000000, float f, float g, float h, float i, float j, float k) {
      for (int var10 = 0; var10 < 3; var10++) {
         float var11 = O0000000000(i * (1.22F + o000000000000.O00000000.O0000000000O0) + var10 * 0.31F);
         float var12 = (1.0F - var11) * O00000000(0.0F, 0.18F, var11);
         float var13 = o000000000000.O00000000.O00000000000OO + var11 * o000000000000.O00000000.O0000000000O;
         float var14 = 0.02F + (1.0F - var11) * 0.045F;
         float var15 = g + 0.08F + k * (0.1F + var10 * 0.075F) + var10 * 0.16F;
         int var16 = O00000000(
            O00000000(this.O0000000000(o000000000000.O00000000), o000000000000.O00000000.O0000000000O0O, 0.35F + var10 * 0.18F), j * var12 * 0.74F
         );
         this.O00000000(vertexConsumer, matrix4f, f, var15, h, var13, var14, var16);
      }
   }

   private void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, DeadEffect.W140 o000000000000, float f, float g, float h, float i, float j, float k, float l
   ) {
      float var11 = 1.38F + k * 0.72F;

      for (int var12 = 0; var12 < 2; var12++) {
         float var13 = var12 == 0 ? 1.0F : -1.0F;
         int var14 = var12 == 0 ? o000000000000.O00000000.O0000000000OO0 : o000000000000.O00000000.O0000000000OOO;

         for (int var15 = 0; var15 < 36; var15++) {
            float var16 = var15 / 36.0F;
            float var17 = (var15 + 1) / 36.0F;
            float var18 = l + var13 * (var16 * (float) (Math.PI * 2) * 1.72F + i * (float) (Math.PI * 2) * 1.15F);
            float var19 = l + var13 * (var17 * (float) (Math.PI * 2) * 1.72F + i * (float) (Math.PI * 2) * 1.15F);
            float var20 = 0.34F + 0.13F * (float)Math.sin(var16 * Math.PI + i * 3.0F);
            float var21 = 0.34F + 0.13F * (float)Math.sin(var17 * Math.PI + i * 3.0F);
            float var22 = 0.032F + 0.018F * (1.0F - i);
            float var23 = g + 0.12F + var16 * var11;
            float var24 = g + 0.12F + var17 * var11;
            float var25 = (float)Math.sin(var16 * Math.PI) * (1.0F - O00000000(0.86F, 1.0F, i));
            int var26 = O00000000(O00000000(var14, o000000000000.O00000000.O0000000000OO, var16), j * var25 * 0.54F);
            int var27 = O00000000(O00000000(var14, o000000000000.O00000000.O0000000000OO, var17), j * var25 * 0.54F);
            this.O00000000(vertexConsumer, matrix4f, f, h, var23, var24, var18, var19, var20, var21, var22, var26, var27);
         }
      }
   }

   private void O000000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, DeadEffect.W140 o000000000000, float f, float g, float h, float i, float j, float k
   ) {
      float var10 = g + 0.08F + k * 0.08F;
      float var11 = g + 1.7F + k * 0.92F;
      float var12 = 0.1F + 0.055F * (1.0F - i);
      int var13 = O00000000(o000000000000.O00000000.O0000000000O0O, j * 0.04F);
      int var14 = O00000000(O00000000(this.O0000000000(o000000000000.O00000000), 16777215, 0.38F), j * 0.3F * (1.0F - i * 0.34F));
      this.O00000000(
         vertexConsumer,
         matrix4f,
         f - var12,
         var10,
         h,
         f + var12,
         var10,
         h,
         f + var12 * 0.32F,
         var11,
         h,
         f - var12 * 0.32F,
         var11,
         h,
         var13,
         var13,
         var14,
         var14
      );
      this.O00000000(
         vertexConsumer,
         matrix4f,
         f,
         var10,
         h - var12,
         f,
         var10,
         h + var12,
         f,
         var11,
         h + var12 * 0.32F,
         f,
         var11,
         h - var12 * 0.32F,
         var13,
         var13,
         var14,
         var14
      );
   }

   private void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, DeadEffect.W140 o000000000000, float f, float g, float h, float i, float j, float k, float l, float m
   ) {
      if (!(m <= 0.02F)) {
         byte var12 = 18;

         for (int var13 = 0; var13 < var12; var13++) {
            float var14 = O0000000000(o000000000000.O0000000000 * 0.137F + var13 * 0.6180339F);
            float var15 = O0000000000(i * (0.78F + var14 * 0.22F) + var14);
            float var16 = l * 0.78F + var13 * 2.399963F + var15 * (float) (Math.PI * 2) * 0.62F;
            float var17 = 0.18F + var15 * (0.38F + var14 * 0.34F);
            float var18 = f + (float)Math.cos(var16) * var17;
            float var19 = h + (float)Math.sin(var16) * var17;
            float var20 = g + 0.52F + k * (0.45F + var14 * 0.28F) + var15 * (0.92F + var14 * 0.42F);
            float var21 = (0.025F + var14 * 0.035F) * (1.0F - var15 * 0.42F);
            float var22 = j * m * (1.0F - var15) * (0.3F + var14 * 0.28F) * this.O00000000O.O0000000000();
            int var23 = O00000000(O00000000(o000000000000.O00000000.O0000000000O0O, o000000000000.O00000000.O0000000000OO, var14), var22);
            this.O00000000(
               vertexConsumer,
               matrix4f,
               var18,
               var20 + var21,
               var19,
               var18 + var21,
               var20,
               var19,
               var18,
               var20 - var21,
               var19,
               var18 - var21,
               var20,
               var19,
               var23,
               var23,
               var23,
               var23
            );
         }
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, int k) {
      if ((k >>> 24 & 0xFF) != 0) {
         float var9 = Math.max(0.02F, i - j);
         float var10 = i + j;

         for (int var11 = 0; var11 < 96; var11++) {
            float var12 = (float) (Math.PI * 2) * var11 / 96.0F;
            float var13 = (float) (Math.PI * 2) * (var11 + 1) / 96.0F;
            float var14 = (float)Math.cos(var12);
            float var15 = (float)Math.sin(var12);
            float var16 = (float)Math.cos(var13);
            float var17 = (float)Math.sin(var13);
            this.O00000000(
               vertexConsumer,
               matrix4f,
               f + var14 * var9,
               g,
               h + var15 * var9,
               f + var16 * var9,
               g,
               h + var17 * var9,
               f + var16 * var10,
               g,
               h + var17 * var10,
               f + var14 * var10,
               g,
               h + var15 * var10,
               k,
               k,
               k,
               k
            );
         }
      }
   }

   private void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, float l, float m, float n, int o, int p
   ) {
      if ((o >>> 24 & 0xFF | p >>> 24 & 0xFF) != 0) {
         float var14 = (float)Math.cos(j);
         float var15 = (float)Math.sin(j);
         float var16 = (float)Math.cos(k);
         float var17 = (float)Math.sin(k);
         this.O00000000(
            vertexConsumer,
            matrix4f,
            f + var14 * (l - n),
            h,
            g + var15 * (l - n),
            f + var14 * (l + n),
            h,
            g + var15 * (l + n),
            f + var16 * (m + n),
            i,
            g + var17 * (m + n),
            f + var16 * (m - n),
            i,
            g + var17 * (m - n),
            o,
            o,
            p,
            p
         );
      }
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      float p,
      float q,
      int r,
      int s,
      int t,
      int u
   ) {
      this.O00000000(vertexConsumer, matrix4f, f, g, h, r);
      this.O00000000(vertexConsumer, matrix4f, i, j, k, s);
      this.O00000000(vertexConsumer, matrix4f, l, m, n, t);
      this.O00000000(vertexConsumer, matrix4f, o, p, q, u);
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, int i) {
      vertexConsumer.vertex(matrix4f, f, g, h).color(O00000000(i), O000000000(i), O0000000000(i), i >>> 24 & 0xFF);
   }

   private boolean O00000000(PlayerEntity playerEntity) {
      if (playerEntity == null) {
         return false;
      } else {
         return O0000000000.player != null && playerEntity.getId() == O0000000000.player.getId()
            ? this.O000000000OO0O.O000000000("Себя")
            : this.O000000000OO0O.O000000000("Игроки");
      }
   }

   private static boolean O000000000(PlayerEntity playerEntity) {
      return playerEntity == null || playerEntity.isRemoved() || !playerEntity.isAlive() || playerEntity.getHealth() <= 0.0F || playerEntity.deathTime > 0;
   }

   private float O00000000(DeadEffect.W136 o00000000) {
      return this.O000000000(o00000000) + o00000000.O000000000;
   }

   private float O000000000(DeadEffect.W136 o00000000) {
      return Math.max(0.15F, this.O000000000OOO.O0000000000() * o00000000.O00000000);
   }

   private int O0000000000(DeadEffect.W136 o00000000) {
      return o00000000 == DeadEffect.W136.TOTEM ? this.O00000000O00.O00000000000O() : this.O00000000O000.O00000000000O();
   }

   private static DeadEffect O0000000000O0() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         DeadEffect var0 = WildClient.O00000000.O000000000.O00000000(DeadEffect.class);
         return var0 != null && var0.O0000000000000 ? var0 : null;
      } else {
         return null;
      }
   }

   private static Identifier O0000000000(PlayerEntity playerEntity) {
      return playerEntity instanceof AbstractClientPlayerEntity var1 ? var1.getSkinTextures().texture() : null;
   }

   private static boolean O00000000000(PlayerEntity playerEntity) {
      return playerEntity instanceof AbstractClientPlayerEntity var1 && var1.getSkinTextures().model() == Model.SLIM;
   }

   private static boolean O00000000(PlayerEntityRenderState playerEntityRenderState) {
      return playerEntityRenderState != null && playerEntityRenderState.skinTextures != null && playerEntityRenderState.skinTextures.model() == Model.SLIM;
   }

   private static int O00000000(int i, float f) {
      return ColorHelper.getArgb(O00000000000(Math.round(O000000000(f) * 255.0F)), O00000000(i), O000000000(i), O0000000000(i));
   }

   private static int O00000000(int i, int j, float f) {
      float var3 = O000000000(f);
      int var4 = Math.round(O00000000(i) + (O00000000(j) - O00000000(i)) * var3);
      int var5 = Math.round(O000000000(i) + (O000000000(j) - O000000000(i)) * var3);
      int var6 = Math.round(O0000000000(i) + (O0000000000(j) - O0000000000(i)) * var3);
      return var4 << 16 | var5 << 8 | var6;
   }

   private static int O00000000(int i) {
      return i >> 16 & 0xFF;
   }

   private static int O000000000(int i) {
      return i >> 8 & 0xFF;
   }

   private static int O0000000000(int i) {
      return i & 0xFF;
   }

   private static int O00000000000(int i) {
      return Math.max(0, Math.min(255, i));
   }

   private static float O00000000(float f) {
      float var1 = 1.0F - O000000000(f);
      return 1.0F - var1 * var1 * var1;
   }

   private static float O00000000(float f, float g, float h) {
      float var3 = MathHelper.clamp((h - f) / Math.max(1.0E-4F, g - f), 0.0F, 1.0F);
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   private static float O000000000(float f) {
      return !Float.isFinite(f) ? 0.0F : MathHelper.clamp(f, 0.0F, 1.0F);
   }

   private static float O0000000000(float f) {
      return f - (float)Math.floor(f);
   }

   static enum W136 {
      TOTEM(0.9F, 0.58F, 0.92F, 0.035F, 0.82F, 0.44F, 0.42F, 0.66F, 0.2F, 0.58F, 1.18F, 0.22F, 1.1F, 6815716, 16777215, 16773226, 3669974, 0),
      DEATH(1.22F, 0.78F, 1.26F, 0.085F, 0.72F, 0.6F, 0.52F, 0.58F, 0.34F, 0.44F, 1.55F, 0.1F, 0.82F, 8693759, 15922687, 16739278, 6484991, 1);

      final float O00000000;
      final float O000000000;
      final float O0000000000;
      final float O00000000000;
      final float O000000000000;
      final float O0000000000000;
      final float O000000000000O;
      final float O00000000000O;
      final float O00000000000O0;
      final float O00000000000OO;
      final float O0000000000O;
      final float O0000000000O0;
      final float O0000000000O00;
      final int O0000000000O0O;
      final int O0000000000OO;
      final int O0000000000OO0;
      final int O0000000000OOO;
      final int O000000000O;

      private W136(
         float f, float g, float h, float j, float k, float l, float m, float n, float o, float p, float q, float r, float s, int t, int u, int v, int w, int x
      ) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = j;
         this.O000000000000 = k;
         this.O0000000000000 = l;
         this.O000000000000O = m;
         this.O00000000000O = n;
         this.O00000000000O0 = o;
         this.O00000000000OO = p;
         this.O0000000000O = q;
         this.O0000000000O0 = r;
         this.O0000000000O00 = s;
         this.O0000000000O0O = t;
         this.O0000000000OO = u;
         this.O0000000000OO0 = v;
         this.O0000000000OOO = w;
         this.O000000000O = x;
      }

      ParticleEffect O00000000(int i) {
         int var2 = (i + this.O000000000O) % 5;
         if (this == TOTEM) {
            return switch (var2) {
               case 0 -> ParticleTypes.TOTEM_OF_UNDYING;
               case 1 -> ParticleTypes.END_ROD;
               case 2 -> ParticleTypes.GLOW;
               case 3 -> ParticleTypes.ELECTRIC_SPARK;
               default -> ParticleTypes.WITCH;
            };
         } else {
            return switch (var2) {
               case 0 -> ParticleTypes.SOUL;
               case 1 -> ParticleTypes.SOUL_FIRE_FLAME;
               case 2 -> ParticleTypes.REVERSE_PORTAL;
               case 3 -> ParticleTypes.WHITE_ASH;
               default -> ParticleTypes.SCULK_SOUL;
            };
         }
      }
   }

   record W137(
      float originX,
      float originY,
      float originZ,
      float pitch,
      float yaw,
      float roll,
      float xScale,
      float yScale,
      float zScale,
      boolean visible,
      boolean hidden
   ) {
      static DeadEffect.W137 capture(ModelPart modelPart) {
         return new DeadEffect.W137(
            modelPart.originX,
            modelPart.originY,
            modelPart.originZ,
            modelPart.pitch,
            modelPart.yaw,
            modelPart.roll,
            modelPart.xScale,
            modelPart.yScale,
            modelPart.zScale,
            modelPart.visible,
            modelPart.hidden
         );
      }

      void apply(ModelPart modelPart) {
         modelPart.originX = this.originX;
         modelPart.originY = this.originY;
         modelPart.originZ = this.originZ;
         modelPart.pitch = this.pitch;
         modelPart.yaw = this.yaw;
         modelPart.roll = this.roll;
         modelPart.xScale = this.xScale;
         modelPart.yScale = this.yScale;
         modelPart.zScale = this.zScale;
         modelPart.visible = this.visible;
         modelPart.hidden = this.hidden;
      }
   }

   record W138(
      long capturedNanos,
      DeadEffect.W137 head,
      DeadEffect.W137 hat,
      DeadEffect.W137 body,
      DeadEffect.W137 rightArm,
      DeadEffect.W137 leftArm,
      DeadEffect.W137 rightLeg,
      DeadEffect.W137 leftLeg,
      DeadEffect.W137 leftSleeve,
      DeadEffect.W137 rightSleeve,
      DeadEffect.W137 leftPants,
      DeadEffect.W137 rightPants,
      DeadEffect.W137 jacket
   ) {

      static DeadEffect.W138 capture(PlayerEntityModel playerEntityModel, long l) {
         return new DeadEffect.W138(
            l,
            DeadEffect.W137.capture(playerEntityModel.head),
            DeadEffect.W137.capture(playerEntityModel.hat),
            DeadEffect.W137.capture(playerEntityModel.body),
            DeadEffect.W137.capture(playerEntityModel.rightArm),
            DeadEffect.W137.capture(playerEntityModel.leftArm),
            DeadEffect.W137.capture(playerEntityModel.rightLeg),
            DeadEffect.W137.capture(playerEntityModel.leftLeg),
            DeadEffect.W137.capture(playerEntityModel.leftSleeve),
            DeadEffect.W137.capture(playerEntityModel.rightSleeve),
            DeadEffect.W137.capture(playerEntityModel.leftPants),
            DeadEffect.W137.capture(playerEntityModel.rightPants),
            DeadEffect.W137.capture(playerEntityModel.jacket)
         );
      }

      void apply(PlayerEntityModel playerEntityModel) {
         this.head.apply(playerEntityModel.head);
         this.hat.apply(playerEntityModel.hat);
         this.body.apply(playerEntityModel.body);
         this.rightArm.apply(playerEntityModel.rightArm);
         this.leftArm.apply(playerEntityModel.leftArm);
         this.rightLeg.apply(playerEntityModel.rightLeg);
         this.leftLeg.apply(playerEntityModel.leftLeg);
         this.leftSleeve.apply(playerEntityModel.leftSleeve);
         this.rightSleeve.apply(playerEntityModel.rightSleeve);
         this.leftPants.apply(playerEntityModel.leftPants);
         this.rightPants.apply(playerEntityModel.rightPants);
         this.jacket.apply(playerEntityModel.jacket);
      }
   }

   record W139(double x, double y, double z, float bodyYaw, float baseScale) {

      static DeadEffect.W139 fromPlayer(PlayerEntity playerEntity) {
         float var1 = Module.O0000000000.getRenderTickCounter().getTickProgress(true);
         double var2 = MathHelper.lerp(var1, playerEntity.lastX, playerEntity.getX());
         double var4 = MathHelper.lerp(var1, playerEntity.lastY, playerEntity.getY());
         double var6 = MathHelper.lerp(var1, playerEntity.lastZ, playerEntity.getZ());
         float var8 = MathHelper.lerpAngleDegrees(var1, playerEntity.lastBodyYaw, playerEntity.bodyYaw);
         return new DeadEffect.W139(var2, var4, var6, var8, Math.max(0.01F, playerEntity.getScale()));
      }

      static DeadEffect.W139 fromState(PlayerEntityRenderState playerEntityRenderState) {
         return new DeadEffect.W139(
            playerEntityRenderState.x,
            playerEntityRenderState.y,
            playerEntityRenderState.z,
            playerEntityRenderState.bodyYaw,
            Math.max(0.01F, playerEntityRenderState.baseScale)
         );
      }
   }

   static final class W140 {
      final DeadEffect.W136 O00000000;
      final long O000000000;
      final float O0000000000;
      DeadEffect.W138 O00000000000;
      DeadEffect.W139 O000000000000;
      Identifier O0000000000000;
      boolean O000000000000O;

      W140(DeadEffect.W136 o00000000, long l, float f, DeadEffect.W138 o0000000000, DeadEffect.W139 o00000000000, Identifier identifier, boolean bl) {
         this.O00000000 = o00000000;
         this.O000000000 = l;
         this.O0000000000 = f;
         this.O00000000000 = o0000000000;
         this.O000000000000 = o00000000000;
         this.O0000000000000 = identifier;
         this.O000000000000O = bl;
      }
   }
}
