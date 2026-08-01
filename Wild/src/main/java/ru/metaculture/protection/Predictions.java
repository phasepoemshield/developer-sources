package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.thrown.ThrownEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.EggItem;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.ExperienceBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SnowballItem;
import net.minecraft.item.ThrowablePotionItem;
import net.minecraft.item.TridentItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Axis;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Predictions",
   O000000000 = "Показ предикта траэктории полета",
   O0000000000 = Category.Visuals
)
public class Predictions extends Module {
   private static final int O000000000O = 240;
   private static final int O000000000O0 = 96;
   private static final int O000000000O00 = 2097152;
   private static final int O000000000O000 = 72;
   private static final int O000000000O00O = 10;
   private static final int O000000000O0O = 6;
   private static final int O000000000O0O0 = 8;
   private static final int O000000000O0OO = 6;
   private static final long O000000000OO = System.nanoTime();
   private static final float O000000000OO0 = 1.5F;
   private static final float O000000000OO00 = 0.5F;
   private static final float O000000000OO0O = 0.7F;
   private static final float O000000000OOO = -20.0F;
   private static final double O000000000OOO0 = 0.99;
   private static final double O000000000OOOO = 0.8;
   private static final float O00000000O = 0.1F;
   private static final float O00000000O0 = 0.1F;
   private static final float O00000000O00 = 0.1F;
   private static final double O00000000O000 = 64.0;
   private static final double O00000000O0000 = 16.0;
   private static final Identifier O00000000O000O = Identifier.of("wild", "core/prediction_vfx");
   private static final BlendFunction O00000000O00O = new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE);
   private static final RenderPipeline O00000000O00O0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET, RenderPipelines.GLOBALS_SNIPPET})
         .withLocation(Identifier.of("wild", "prediction_glass"))
         .withVertexShader(O00000000O000O)
         .withFragmentShader(O00000000O000O)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR_NORMAL, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline O00000000O00OO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET, RenderPipelines.GLOBALS_SNIPPET})
         .withLocation(Identifier.of("wild", "prediction_glass_no_depth"))
         .withVertexShader(O00000000O000O)
         .withFragmentShader(O00000000O000O)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR_NORMAL, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline O00000000O0O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET, RenderPipelines.GLOBALS_SNIPPET})
         .withLocation(Identifier.of("wild", "prediction_emission"))
         .withVertexShader(O00000000O000O)
         .withFragmentShader(O00000000O000O)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR_NORMAL, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(O00000000O00O)
         .build()
   );
   private static final RenderPipeline O00000000O0O0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET, RenderPipelines.GLOBALS_SNIPPET})
         .withLocation(Identifier.of("wild", "prediction_emission_no_depth"))
         .withVertexShader(O00000000O000O)
         .withFragmentShader(O00000000O000O)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR_NORMAL, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(O00000000O00O)
         .build()
   );
   private static final RenderLayer O00000000O0O00 = RenderLayer.of(
      "wild_prediction_glass", 2097152, false, true, O00000000O00O0, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O00000000O0O0O = RenderLayer.of(
      "wild_prediction_glass_no_depth", 2097152, false, true, O00000000O00OO, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O00000000O0OO = RenderLayer.of(
      "wild_prediction_emission", 2097152, false, true, O00000000O0O, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O00000000O0OO0 = RenderLayer.of(
      "wild_prediction_emission_no_depth", 2097152, false, true, O00000000O0O0, MultiPhaseParameters.builder().build(false)
   );
   private final BooleanSetting O00000000O0OOO = new BooleanSetting("ThroughWalls", true);
   private final BooleanSetting O00000000OO = new BooleanSetting("AimPreview", true);
   private final BooleanSetting O00000000OO0 = new BooleanSetting("ShowOwner", false);
   private final HudElement O00000000OO00 = new HudElement() {};
   private final List<Predictions.W185> O00000000OO000 = new ArrayList<>();
   private final Map<String, Predictions.W185> O00000000OO00O = new HashMap<>();
   private ItemStack O00000000OO0O;

   public Predictions() {
      this.O00000000(new Setting[]{this.O00000000O0OOO, this.O00000000OO, this.O00000000OO0});
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (O0000000000.world == null || O0000000000.player == null) {
         this.O0000000000O0();
      } else if (O0000000000.options != null && O0000000000.options.getPerspective() != null && O0000000000.options.getPerspective().isFirstPerson()) {
         this.O00000000(o0000000OO0000.O00000000000());
         if (!this.O00000000OO000.isEmpty()) {
            MatrixStack var2 = o0000000OO0000.O0000000000();
            Matrix4f var3 = var2.peek().getPositionMatrix();
            Vec3d var4 = O0000000000.gameRenderer.getCamera().getPos();
            RenderLayer var5 = this.O00000000O0OOO.O0000000000() ? O00000000O0O0O : O00000000O0O00;
            RenderLayer var6 = this.O00000000O0OOO.O0000000000() ? O00000000O0OO0 : O00000000O0OO;
            int var7 = O0000O000OO000.O000000000000(O0000O000OO000.O00000000(), 235);
            Immediate var8 = O0000O00O0O00.O00000000();
            boolean var25 = false /* VF: Semaphore variable */;

            try {
               var25 = true;
               VertexConsumer var9 = var8.getBuffer(var5);

               for (Predictions.W185 var11 : this.O00000000OO000) {
                  boolean var12 = var11.hitEntity() != null;
                  boolean var13 = var11.blockHit() != null && var11.blockHit().getType() != Type.MISS;
                  boolean var14 = var12 || var13;
                  int var15 = var12 ? -51112 : var7;
                  this.O00000000(var9, var3, var4, var11.path(), var15, var14);
               }

               var25 = false;
            } finally {
               if (var25) {
                  O0000O00O0O00.O000000000();
               }
            }

            O0000O00O0O00.O000000000();
            var8 = O0000O00O0O00.O00000000();

            try {
               VertexConsumer var29 = var8.getBuffer(var6);

               for (Predictions.W185 var31 : this.O00000000OO000) {
                  boolean var32 = var31.hitEntity() != null;
                  boolean var33 = var31.blockHit() != null && var31.blockHit().getType() != Type.MISS;
                  boolean var34 = var32 || var33;
                  int var35 = var32 ? -51112 : var7;
                  int var16 = var35 >> 16 & 0xFF;
                  int var17 = var35 >> 8 & 0xFF;
                  int var18 = var35 & 0xFF;
                  this.O000000000(var29, var3, var4, var31.path(), var35, var34);
                  if (var32) {
                     Box var19 = var31.targetBox() != null ? var31.targetBox() : var31.hitEntity().getBoundingBox();
                     this.O00000000(
                        var29,
                        var3,
                        var19.minX - var4.x,
                        var19.minY - var4.y,
                        var19.minZ - var4.z,
                        var19.maxX - var4.x,
                        var19.maxY - var4.y,
                        var19.maxZ - var4.z,
                        var16,
                        var17,
                        var18,
                        230
                     );
                     this.O00000000(var29, var3, var4, var19, var16, var17, var18);
                  } else if (var33) {
                     Vec3d var36 = var31.blockRenderPos();
                     if (var36 != null) {
                        this.O00000000(
                           var29,
                           var3,
                           var36.x - var4.x,
                           var36.y - var4.y,
                           var36.z - var4.z,
                           var36.x + 1.0 - var4.x,
                           var36.y + 1.0 - var4.y,
                           var36.z + 1.0 - var4.z,
                           var16,
                           var17,
                           var18
                        );
                     }

                     this.O00000000(var29, var3, var4, var31.blockHit(), var31.landingPos(), var35);
                  }
               }
            } finally {
               O0000O00O0O00.O000000000();
            }
         }
      } else {
         this.O0000000000O0();
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O o0000000O00O) {
      if (O0000000000.world != null && O0000000000.player != null) {
         if (O0000000000.options != null && O0000000000.options.getPerspective() != null && O0000000000.options.getPerspective().isFirstPerson()) {
            if (!this.O00000000OO000.isEmpty()) {
               RenderManager var2 = o0000000O00O.O00000000000();
               var2.O00000000(23.0F);

               for (Predictions.W185 var4 : this.O00000000OO000) {
                  if (!var4.isPreAim()) {
                     Vec3d var5 = O0000O000OOOOO.O00000000(var4.landingPos());
                     if (var5 != null && !(var5.z < 0.0) && !(var5.z > 1.0)) {
                        float var6 = (float)var5.x;
                        float var7 = (float)var5.y;
                        float var8 = 1.0F;
                        this.O00000000(var2, var6, var7, var8, var4);
                        if (this.O00000000OO0.O0000000000() && this.O000000000(var4)) {
                           this.O000000000(var2, var6, var7 - 31.0F * var8, var8, var4);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void O00000000(float f) {
      this.O00000000OO000.clear();
      if (O0000000000.world != null && O0000000000.player != null) {
         ArrayList var2 = new ArrayList();
         ItemStack var3 = O0000000000.player.getMainHandStack();
         boolean var4 = false;
         if (var3.isEmpty() || !this.O00000000(var3.getItem())) {
            var3 = O0000000000.player.getOffHandStack();
            var4 = true;
         }

         if (this.O00000000OO.O0000000000() && !var3.isEmpty() && this.O00000000(var3.getItem())) {
            Predictions.W185 var5 = this.O00000000(O0000000000.player, var3, var4, f);
            if (var5 != null) {
               var2.add(var5);
            }
         }

         if (ClickPearl.O000000000O0 && (var3.isEmpty() || !(var3.getItem() instanceof EnderPearlItem))) {
            if (this.O00000000OO0O == null) {
               this.O00000000OO0O = new ItemStack(Items.ENDER_PEARL);
            }

            Predictions.W185 var8 = this.O00000000(O0000000000.player, this.O00000000OO0O, false, f);
            if (var8 != null) {
               var2.add(var8);
            }
         }

         for (ProjectileEntity var6 : O0000000000.world
            .getEntitiesByClass(
               ProjectileEntity.class,
               O0000000000.player.getBoundingBox().expand(256.0),
               projectileEntity -> !(projectileEntity instanceof FireworkRocketEntity)
            )) {
            Predictions.W185 var7 = this.O00000000(var6, f);
            if (var7 != null) {
               var2.add(var7);
            }
         }

         this.O000000000(var2);
      } else {
         this.O00000000OO00O.clear();
      }
   }

   private boolean O00000000(Item item) {
      return item instanceof EnderPearlItem
         || item instanceof SnowballItem
         || item instanceof EggItem
         || item instanceof BowItem
         || item instanceof CrossbowItem
         || item instanceof TridentItem
         || item instanceof ThrowablePotionItem
         || item instanceof ExperienceBottleItem;
   }

   private Predictions.W185 O00000000(PlayerEntity playerEntity, ItemStack itemStack, boolean bl, float f) {
      Item var5 = itemStack.getItem();
      Predictions.W184 var6 = this.O00000000(playerEntity, var5);
      Identifier var7 = this.O000000000(var5);
      Camera var8 = O0000000000.gameRenderer.getCamera();
      float var9 = var8.getYaw();
      float var10 = var8.getPitch();
      Vec3d var11 = this.O00000000(playerEntity, var9, var10, var6.speed(), var6.pitchOffset());
      Vec3d var12 = var8.getPos().subtract(0.0, 0.1, 0.0);
      Vec3d var13 = Vec3d.fromPolar(var10, var9);
      Vec3d var14 = Vec3d.fromPolar(0.0F, var9 + 90.0F);
      float var15 = bl ? -0.3F : 0.3F;
      Vec3d var16 = var12.add(var13.multiply(0.4)).add(var14.multiply(var15)).subtract(0.0, 0.2, 0.0);
      Vec3d var17 = var16.subtract(var12);
      String var18 = (bl ? "self:off:" : "self:main:") + Registries.ITEM.getId(var5);
      return this.O00000000(playerEntity, var12, var17, var11, var6.gravity(), 0.99, var6.applyPhysicsBeforeMove(), f, var18, "You", var7, true);
   }

   private Predictions.W184 O00000000(PlayerEntity playerEntity, Item item) {
      double var3 = 1.5;
      double var5 = 0.03;
      float var7 = 0.0F;
      boolean var8 = item instanceof EnderPearlItem || item instanceof SnowballItem || item instanceof EggItem;
      if (item instanceof BowItem) {
         int var9 = playerEntity.getItemUseTime();
         float var10 = var9 == 0 ? 1.0F : BowItem.getPullProgress(var9);
         var3 = var10 * 3.0;
         var5 = 0.05;
         var8 = false;
      } else if (item instanceof CrossbowItem) {
         var3 = 3.15;
         var5 = 0.05;
         var8 = false;
      } else if (item instanceof TridentItem) {
         var3 = 2.5;
         var5 = 0.05;
         var8 = false;
      } else if (item instanceof ExperienceBottleItem) {
         var3 = 0.7F;
         var5 = 0.07;
         var7 = -20.0F;
         var8 = true;
      } else if (item instanceof ThrowablePotionItem) {
         var3 = 0.5;
         var5 = 0.05;
         var7 = -20.0F;
         var8 = true;
      }

      return new Predictions.W184(var3, var5, var7, var8);
   }

   private Vec3d O00000000(PlayerEntity playerEntity, float f, float g, double d, float h) {
      float var7 = f * (float) (Math.PI / 180.0);
      float var8 = g * (float) (Math.PI / 180.0);
      float var9 = (g + h) * (float) (Math.PI / 180.0);
      double var10 = -MathHelper.sin(var7) * MathHelper.cos(var8);
      double var12 = -MathHelper.sin(var9);
      double var14 = MathHelper.cos(var7) * MathHelper.cos(var8);
      Vec3d var16 = new Vec3d(var10, var12, var14).normalize().multiply(d);
      Vec3d var17 = playerEntity.getMovement();
      return var16.add(var17.x, playerEntity.isOnGround() ? 0.0 : var17.y, var17.z);
   }

   private Predictions.W185 O00000000(ProjectileEntity projectileEntity, float f) {
      if (!projectileEntity.isRemoved() && !(projectileEntity.getVelocity().lengthSquared() < 0.001)) {
         Vec3d var3 = projectileEntity.getLerpedPos(f);
         double var4 = projectileEntity.getFinalGravity();
         Identifier var6 = this.O00000000(projectileEntity);
         boolean var7 = projectileEntity instanceof ThrownEntity;
         double var8 = var7 && projectileEntity.isTouchingWater() ? 0.8 : 0.99;
         return this.O00000000(
            projectileEntity,
            var3,
            Vec3d.ZERO,
            projectileEntity.getVelocity(),
            var4,
            var8,
            var7,
            f,
            "entity:" + projectileEntity.getId(),
            Predictions.W185.resolveOwnerName(projectileEntity),
            var6,
            false
         );
      } else {
         return null;
      }
   }

   private Predictions.W185 O00000000(
      Entity entity,
      Vec3d vec3d,
      Vec3d vec3d2,
      Vec3d vec3d3,
      double d,
      double e,
      boolean bl,
      float f,
      String string,
      String string2,
      Identifier identifier,
      boolean bl2
   ) {
      if (O0000000000.world == null) {
         return null;
      } else {
         Vec3d var15 = vec3d3;
         Vec3d var16 = vec3d;
         ArrayList var17 = new ArrayList();
         var17.add(vec3d.add(vec3d2));
         int var18 = 0;
         BlockHitResult var19 = null;
         Entity var20 = null;
         byte var21 = 7;

         for (int var22 = 0; var22 < 240; var22++) {
            Vec3d var23 = bl ? this.O00000000(var15, d, e) : var15;
            Vec3d var24 = var16.add(var23);
            var19 = O0000000000.world.raycast(new RaycastContext(var16, var24, ShapeType.COLLIDER, FluidHandling.NONE, entity));
            Vec3d var25 = var19.getType() != Type.MISS ? var19.getPos() : var24;
            Box var26 = new Box(var16, var25).expand(1.0);
            double var27 = Double.MAX_VALUE;
            Vec3d var29 = null;
            Entity var30 = null;

            for (Entity var32 : O0000000000.world.getOtherEntities(entity, var26, entityx -> !entityx.isSpectator() && entityx.isAlive())) {
               Box var33 = var32.getBoundingBox().expand(0.3);
               Optional var34 = var33.raycast(var16, var25);
               if (var34.isPresent()) {
                  double var35 = var16.squaredDistanceTo((Vec3d)var34.get());
                  if (var35 < var27) {
                     var27 = var35;
                     var29 = (Vec3d)var34.get();
                     var30 = var32;
                  }
               }
            }

            double var38 = Math.max(0.0, 1.0 - (double)(var22 + 1) / var21);
            if (var30 != null) {
               var17.add(var29.add(vec3d2.multiply(var38)));
               var20 = var30;
               var16 = var29;
               var18 = var22 + 1;
               break;
            }

            if (var19.getType() != Type.MISS) {
               var17.add(var19.getPos().add(vec3d2.multiply(var38)));
               var16 = var19.getPos();
               var18 = var22 + 1;
               break;
            }

            var17.add(var24.add(vec3d2.multiply(var38)));
            var16 = var24;
            var15 = bl ? var23 : this.O000000000(var15, d, e);
            var18 = var22 + 1;
         }

         if (var17.size() < 2) {
            return null;
         } else {
            Box var37 = var20 != null ? this.O00000000(var20, f) : null;
            return new Predictions.W185(string, this.O00000000((List<Vec3d>)var17), var16, this.O00000000(var19), var37, var18, var20, var19, string2, identifier, bl2);
         }
      }
   }

   private List<Vec3d> O00000000(List<Vec3d> list) {
      int var2 = list.size();
      if (var2 <= 96) {
         return list;
      } else {
         int var3 = Math.max(2, (int)Math.ceil(var2 / 96.0));
         ArrayList var4 = new ArrayList(var2 / var3 + 2);

         for (int var5 = 0; var5 < var2; var5 += var3) {
            var4.add((Vec3d)list.get(var5));
         }

         Vec3d var6 = (Vec3d)list.get(var2 - 1);
         if (var4.isEmpty() || var4.get(var4.size() - 1) != var6) {
            var4.add(var6);
         }

         return var4;
      }
   }

   private void O000000000(List<Predictions.W185> list) {
      if (list.isEmpty()) {
         this.O00000000OO00O.clear();
      } else {
         HashMap var2 = new HashMap();

         for (Predictions.W185 var4 : list) {
            Predictions.W185 var5 = this.O00000000(var4);
            this.O00000000OO000.add(var5);
            var2.put(var5.key(), var5);
         }

         this.O00000000OO00O.clear();
         this.O00000000OO00O.putAll(var2);
      }
   }

   private Predictions.W185 O00000000(Predictions.W185 o000000000) {
      Predictions.W185 var2 = this.O00000000OO00O.get(o000000000.key());
      if (var2 != null && var2.path().size() >= 2 && o000000000.path().size() >= 2) {
         if (var2.path().get(0).squaredDistanceTo(o000000000.path().get(0)) > 256.0) {
            return o000000000;
         } else {
            List var3 = this.O00000000(var2.path(), o000000000.path(), 0.1F);
            float var4 = o000000000.isPreAim() ? 0.1F : 0.1F;
            Vec3d var5 = this.O00000000(var2.landingPos(), o000000000.landingPos(), var4, 64.0);
            Vec3d var6 = this.O000000000(var2.blockRenderPos(), o000000000.blockRenderPos(), var4, 64.0);
            Box var7 = this.O00000000(var2, o000000000, o000000000.isPreAim() ? 0.1F : 0.1F);
            return o000000000.withRenderState(var3, var5, var6, var7);
         }
      } else {
         return o000000000;
      }
   }

   private List<Vec3d> O00000000(List<Vec3d> list, List<Vec3d> list2, float f) {
      ArrayList var4 = new ArrayList(list2.size());

      for (int var5 = 0; var5 < list2.size(); var5++) {
         Vec3d var6 = var5 < list.size() ? this.O00000000((Vec3d)list.get(var5), (Vec3d)list2.get(var5), f) : (Vec3d)list2.get(var5);
         var4.add(var6);
      }

      return var4;
   }

   private Vec3d O00000000(Vec3d vec3d, Vec3d vec3d2, float f) {
      return new Vec3d(MathHelper.lerp(f, vec3d.x, vec3d2.x), MathHelper.lerp(f, vec3d.y, vec3d2.y), MathHelper.lerp(f, vec3d.z, vec3d2.z));
   }

   private Vec3d O00000000(Vec3d vec3d, Vec3d vec3d2, float f, double d) {
      return vec3d.squaredDistanceTo(vec3d2) > d ? vec3d2 : this.O00000000(vec3d, vec3d2, f);
   }

   private Vec3d O000000000(Vec3d vec3d, Vec3d vec3d2, float f, double d) {
      if (vec3d == null) {
         return vec3d2;
      } else if (vec3d2 == null) {
         return null;
      } else {
         return vec3d.squaredDistanceTo(vec3d2) > d ? vec3d2 : this.O00000000(vec3d, vec3d2, f);
      }
   }

   private Box O00000000(Predictions.W185 o000000000, Predictions.W185 o0000000002, float f) {
      if (o0000000002.targetBox() == null) {
         return null;
      } else if (o000000000.targetBox() != null && o000000000.hitEntity() != null && o0000000002.hitEntity() != null) {
         if (o000000000.hitEntity().getId() != o0000000002.hitEntity().getId()) {
            return o0000000002.targetBox();
         } else {
            return this.O00000000(o000000000.targetBox(), o0000000002.targetBox()) > 16.0
               ? o0000000002.targetBox()
               : this.O00000000(o000000000.targetBox(), o0000000002.targetBox(), f);
         }
      } else {
         return o0000000002.targetBox();
      }
   }

   private Box O00000000(Box box, Box box2, float f) {
      return new Box(
         MathHelper.lerp(f, box.minX, box2.minX),
         MathHelper.lerp(f, box.minY, box2.minY),
         MathHelper.lerp(f, box.minZ, box2.minZ),
         MathHelper.lerp(f, box.maxX, box2.maxX),
         MathHelper.lerp(f, box.maxY, box2.maxY),
         MathHelper.lerp(f, box.maxZ, box2.maxZ)
      );
   }

   private double O00000000(Box box, Box box2) {
      double var3 = (box.minX + box.maxX - box2.minX - box2.maxX) * 0.5;
      double var5 = (box.minY + box.maxY - box2.minY - box2.maxY) * 0.5;
      double var7 = (box.minZ + box.maxZ - box2.minZ - box2.maxZ) * 0.5;
      return var3 * var3 + var5 * var5 + var7 * var7;
   }

   private Box O00000000(Entity entity, float f) {
      Vec3d var3 = entity.getLerpedPos(f);
      Vec3d var4 = entity.getPos();
      return entity.getBoundingBox().offset(var3.x - var4.x, var3.y - var4.y, var3.z - var4.z);
   }

   private Vec3d O00000000(BlockHitResult blockHitResult) {
      if (blockHitResult != null && blockHitResult.getType() != Type.MISS) {
         BlockPos var2 = blockHitResult.getBlockPos();
         return new Vec3d(var2.getX(), var2.getY(), var2.getZ());
      } else {
         return null;
      }
   }

   private void O0000000000O0() {
      this.O00000000OO000.clear();
      this.O00000000OO00O.clear();
   }

   private Vec3d O00000000(Vec3d vec3d, double d, double e) {
      return vec3d.subtract(0.0, d, 0.0).multiply(e);
   }

   private Vec3d O000000000(Vec3d vec3d, double d, double e) {
      return vec3d.multiply(e).subtract(0.0, d, 0.0);
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Vec3d vec3d, List<Vec3d> list, int i, boolean bl) {
      if (list.size() >= 2) {
         float var7 = this.O0000000000O00() * 0.3125F;
         this.O00000000(vertexConsumer, matrix4f, vec3d, list, i, bl, 0.072F, 0.024F, 0.56F, var7 + 0.23F, 0.64F, 1.0F);
         this.O00000000(vertexConsumer, matrix4f, vec3d, list, i, bl, 0.042F, 0.014F, 0.94F, var7 + 0.37F, 1.0F, 1.0F);
      }
   }

   private void O000000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Vec3d vec3d, List<Vec3d> list, int i, boolean bl) {
      if (list.size() >= 2) {
         float var7 = this.O0000000000O00() * 0.3125F;
         this.O00000000(vertexConsumer, matrix4f, vec3d, list, i, bl, 0.235F, 0.066F, 0.16F, var7, 0.25F, 0.0F);
         this.O00000000(vertexConsumer, matrix4f, vec3d, list, i, bl, 0.126F, 0.036F, 0.34F, var7 + 0.19F, 0.58F, 0.0F);
      }
   }

   private void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, Vec3d vec3d, List<Vec3d> list, int i, boolean bl, float f, float g, float h, float j, float k, float l
   ) {
      int var13 = list.size();
      int var14 = var13 - 1;
      int var15 = i >> 16 & 0xFF;
      int var16 = i >> 8 & 0xFF;
      int var17 = i & 0xFF;
      int var18 = Math.max(120, i >>> 24 & 0xFF);
      double var19 = vec3d.x;
      double var21 = vec3d.y;
      double var23 = vec3d.z;

      for (int var25 = 0; var25 < var14; var25++) {
         Vec3d var26 = (Vec3d)list.get(var25);
         Vec3d var27 = (Vec3d)list.get(var25 + 1);
         double var28 = var26.x - var19;
         double var30 = var26.y - var21;
         double var32 = var26.z - var23;
         double var34 = var27.x - var19;
         double var36 = var27.y - var21;
         double var38 = var27.z - var23;
         double var40 = var34 - var28;
         double var42 = var36 - var30;
         double var44 = var38 - var32;
         double var46 = Math.sqrt(var40 * var40 + var42 * var42 + var44 * var44);
         if (!(var46 <= 1.0E-5)) {
            double var48 = var40 / var46;
            double var50 = var42 / var46;
            double var52 = var44 / var46;
            double var54 = Math.abs(var50) < 0.92 ? 0.0 : 1.0;
            double var56 = Math.abs(var50) < 0.92 ? 1.0 : 0.0;
            double var58 = 0.0;
            double var60 = var56 * var52 - var58 * var50;
            double var62 = var58 * var48 - var54 * var52;
            double var64 = var54 * var50 - var56 * var48;
            double var66 = Math.sqrt(var60 * var60 + var62 * var62 + var64 * var64);
            if (var66 <= 1.0E-5) {
               var60 = 1.0;
               var62 = 0.0;
               var64 = 0.0;
            } else {
               var60 /= var66;
               var62 /= var66;
               var64 /= var66;
            }

            double var68 = var50 * var64 - var52 * var62;
            double var70 = var52 * var60 - var48 * var64;
            double var72 = var48 * var62 - var50 * var60;
            float var74 = (float)var25 / var14;
            float var75 = (float)(var25 + 1) / var14;
            float var76 = this.O00000000(var74, f, g, bl);
            float var77 = this.O00000000(var75, f, g, bl);
            var76 *= 1.0F + 0.085F * (float)Math.sin((var74 * 2.7F - j * 3.8F + k * 0.31F) * Math.PI * 2.0);
            var77 *= 1.0F + 0.085F * (float)Math.sin((var75 * 2.7F - j * 3.8F + k * 0.31F) * Math.PI * 2.0);

            for (int var78 = 0; var78 < 10; var78++) {
               float var79 = var78 / 10.0F;
               float var80 = (var78 + 1) / 10.0F;
               if (var78 == 9) {
                  var80 = 0.999F;
               }

               double var81 = (var79 + j * 0.07F) * Math.PI * 2.0;
               double var83 = (var80 + j * 0.07F) * Math.PI * 2.0;
               double var85 = Math.cos(var81);
               double var87 = Math.sin(var81);
               double var89 = Math.cos(var83);
               double var91 = Math.sin(var83);
               double var93 = var60 * var85 + var68 * var87;
               double var95 = var62 * var85 + var70 * var87;
               double var97 = var64 * var85 + var72 * var87;
               double var99 = var60 * var89 + var68 * var91;
               double var101 = var62 * var89 + var70 * var91;
               double var103 = var64 * var89 + var72 * var91;
               this.O00000000(
                  vertexConsumer,
                  matrix4f,
                  var28 + var93 * var76,
                  var30 + var95 * var76,
                  var32 + var97 * var76,
                  var15,
                  var16,
                  var17,
                  var18,
                  var74,
                  l + var79,
                  j,
                  h,
                  k,
                  var93,
                  var95,
                  var97
               );
               this.O00000000(
                  vertexConsumer,
                  matrix4f,
                  var28 + var99 * var76,
                  var30 + var101 * var76,
                  var32 + var103 * var76,
                  var15,
                  var16,
                  var17,
                  var18,
                  var74,
                  l + var80,
                  j,
                  h,
                  k,
                  var99,
                  var101,
                  var103
               );
               this.O00000000(
                  vertexConsumer,
                  matrix4f,
                  var34 + var99 * var77,
                  var36 + var101 * var77,
                  var38 + var103 * var77,
                  var15,
                  var16,
                  var17,
                  var18,
                  var75,
                  l + var80,
                  j,
                  h,
                  k,
                  var99,
                  var101,
                  var103
               );
               this.O00000000(
                  vertexConsumer,
                  matrix4f,
                  var34 + var93 * var77,
                  var36 + var95 * var77,
                  var38 + var97 * var77,
                  var15,
                  var16,
                  var17,
                  var18,
                  var75,
                  l + var79,
                  j,
                  h,
                  k,
                  var93,
                  var95,
                  var97
               );
            }
         }
      }
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      double d,
      double e,
      double f,
      int i,
      int j,
      int k,
      int l,
      float g,
      float h,
      float m,
      float n,
      float o,
      double p,
      double q,
      double r
   ) {
      float var24 = this.O000000000(g);
      int var25 = this.O00000000(i, 255, o * 0.18F);
      int var26 = this.O00000000(j, 255, o * 0.14F);
      int var27 = this.O00000000(k, 255, o * 0.12F);
      int var28 = MathHelper.clamp(Math.round(l * n * var24), 0, 255);
      vertexConsumer.vertex(matrix4f, (float)d, (float)e, (float)f)
         .texture(g + m * 0.28F, h)
         .color(var25, var26, var27, var28)
         .normal((float)p, (float)q, (float)r);
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Vec3d vec3d, BlockHitResult blockHitResult, Vec3d vec3d2, int i) {
      if (blockHitResult != null && blockHitResult.getType() != Type.MISS) {
         Direction var7 = blockHitResult.getSide();
         Vec3d var8 = vec3d2 != null ? vec3d2 : blockHitResult.getPos();
         double var9 = var7.getOffsetX();
         double var11 = var7.getOffsetY();
         double var13 = var7.getOffsetZ();
         double var15 = var8.x - vec3d.x + var9 * 0.01;
         double var17 = var8.y - vec3d.y + var11 * 0.01;
         double var19 = var8.z - vec3d.z + var13 * 0.01;
         double var21;
         double var23;
         double var25;
         double var27;
         double var29;
         double var31;
         if (var7.getAxis() == Axis.Y) {
            var21 = 1.0;
            var23 = 0.0;
            var25 = 0.0;
            var27 = 0.0;
            var29 = 0.0;
            var31 = var7 == Direction.DOWN ? -1.0 : 1.0;
         } else if (var7.getAxis() == Axis.X) {
            var21 = 0.0;
            var23 = 0.0;
            var25 = var7 == Direction.WEST ? -1.0 : 1.0;
            var27 = 0.0;
            var29 = 1.0;
            var31 = 0.0;
         } else {
            var21 = var7 == Direction.NORTH ? -1.0 : 1.0;
            var23 = 0.0;
            var25 = 0.0;
            var27 = 0.0;
            var29 = 1.0;
            var31 = 0.0;
         }

         float var33 = this.O0000000000O00() * 0.454545F;
         int var34 = i >> 16 & 0xFF;
         int var35 = i >> 8 & 0xFF;
         int var36 = i & 0xFF;
         float var37 = 0.92F + 0.08F * (float)Math.sin(var33 * Math.PI * 2.0);
         this.O00000000(
            vertexConsumer,
            matrix4f,
            var15,
            var17,
            var19,
            var9,
            var11,
            var13,
            var21,
            var23,
            var25,
            var27,
            var29,
            var31,
            1.2F * var37,
            var34,
            var35,
            var36,
            56,
            var33,
            4.0F
         );
         this.O00000000(
            vertexConsumer,
            matrix4f,
            var15,
            var17,
            var19,
            var9,
            var11,
            var13,
            var21,
            var23,
            var25,
            var27,
            var29,
            var31,
            0.74F * var37,
            this.O00000000(var34, 255, 0.18F),
            this.O00000000(var35, 255, 0.14F),
            this.O00000000(var36, 255, 0.16F),
            100,
            var33 + 0.27F,
            4.0F
         );
         this.O00000000(
            vertexConsumer,
            matrix4f,
            var15,
            var17,
            var19,
            var9,
            var11,
            var13,
            var21,
            var23,
            var25,
            var27,
            var29,
            var31,
            0.54F * var37,
            0.3F * var37,
            this.O00000000(var34, 255, 0.32F),
            this.O00000000(var35, 255, 0.26F),
            this.O00000000(var36, 255, 0.28F),
            130,
            var33,
            4.0F
         );
         this.O00000000(
            vertexConsumer,
            matrix4f,
            var15,
            var17,
            var19,
            var21,
            var23,
            var25,
            var27,
            var29,
            var31,
            0.62F * var37,
            0.09F,
            var34,
            var35,
            var36,
            110,
            var33 + 0.21F,
            0.78F,
            2.0F
         );
         this.O00000000(
            vertexConsumer,
            matrix4f,
            var15,
            var17,
            var19,
            var21,
            var23,
            var25,
            var27,
            var29,
            var31,
            0.33F * var37,
            0.038F,
            this.O00000000(var34, 255, 0.36F),
            this.O00000000(var35, 255, 0.3F),
            this.O00000000(var36, 255, 0.32F),
            200,
            var33 + 0.46F,
            0.95F,
            2.0F
         );
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Vec3d vec3d, Box box, int i, int j, int k) {
      double var8 = (box.minX + box.maxX) * 0.5 - vec3d.x;
      double var10 = box.minY - vec3d.y + 0.035;
      double var12 = (box.minZ + box.maxZ) * 0.5 - vec3d.z;
      double var14 = box.maxY - box.minY;
      double var16 = Math.max(box.maxX - box.minX, box.maxZ - box.minZ) * 0.66 + 0.22;
      long var18 = System.currentTimeMillis();
      float var20 = (float)(var18 % 1800L) / 1800.0F;
      this.O00000000(vertexConsumer, matrix4f, var8, var10, var12, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, (float)var16, 0.058F, i, j, k, 215, var20, 1.0F, 2.0F);
      this.O00000000(
         vertexConsumer,
         matrix4f,
         var8,
         var10 + var14 * 0.56,
         var12,
         1.0,
         0.0,
         0.0,
         0.0,
         0.0,
         1.0,
         (float)(var16 * 0.86),
         0.04F,
         i,
         j,
         k,
         120,
         var20 + 0.33F,
         0.62F,
         2.0F
      );
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      double d,
      double e,
      double f,
      double g,
      double h,
      double i,
      double j,
      double k,
      double l,
      double m,
      double n,
      double o,
      float p,
      int q,
      int r,
      int s,
      int t,
      float u,
      float v
   ) {
      for (int var34 = 0; var34 < 8; var34++) {
         float var35 = var34 / 8.0F;
         float var36 = (var34 + 1) / 8.0F;
         float var37 = var35;
         float var38 = var34 == 7 ? 0.999F : var36;
         double var39 = p * var35;
         double var41 = p * var36;
         int var43 = MathHelper.clamp(Math.round(t * (1.0F - var35) * (1.0F - var35)), 0, 255);
         int var44 = MathHelper.clamp(Math.round(t * (1.0F - var36) * (1.0F - var36)), 0, 255);

         for (int var45 = 0; var45 < 72; var45++) {
            float var46 = var45 / 72.0F;
            float var47 = (var45 + 1) / 72.0F;
            double var48 = var46 * Math.PI * 2.0;
            double var50 = var47 * Math.PI * 2.0;
            double var52 = Math.cos(var48);
            double var54 = Math.sin(var48);
            double var56 = Math.cos(var50);
            double var58 = Math.sin(var50);
            this.O00000000(vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, m, n, o, var52, var54, var41, q, r, s, var44, var46 + u * 0.18F, v + var38);
            this.O00000000(vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, m, n, o, var52, var54, var39, q, r, s, var43, var46 + u * 0.18F, v + var37);
            this.O00000000(vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, m, n, o, var56, var58, var39, q, r, s, var43, var47 + u * 0.18F, v + var37);
            this.O00000000(vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, m, n, o, var56, var58, var41, q, r, s, var44, var47 + u * 0.18F, v + var38);
         }
      }
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      double d,
      double e,
      double f,
      double g,
      double h,
      double i,
      double j,
      double k,
      double l,
      double m,
      double n,
      double o,
      double p,
      double q,
      double r,
      int s,
      int t,
      int u,
      int v,
      float w,
      float x
   ) {
      double var39 = d + (j * p + m * q) * r;
      double var41 = e + (k * p + n * q) * r;
      double var43 = f + (l * p + o * q) * r;
      vertexConsumer.vertex(matrix4f, (float)var39, (float)var41, (float)var43).texture(w, x).color(s, t, u, v).normal((float)g, (float)h, (float)i);
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      double d,
      double e,
      double f,
      double g,
      double h,
      double i,
      double j,
      double k,
      double l,
      double m,
      double n,
      double o,
      float p,
      float q,
      int r,
      int s,
      int t,
      int u,
      float v,
      float w
   ) {
      for (int var35 = 0; var35 < 6; var35++) {
         float var36 = var35 / 6.0F;
         float var37 = (var35 + 1) / 6.0F;
         float var38 = var36;
         float var39 = var35 == 5 ? 0.999F : var37;
         double var40 = p * var36;
         double var42 = p * var37;
         double var44 = q * (1.0 - var36 * var36);
         double var46 = q * (1.0 - var37 * var37);
         int var48 = MathHelper.clamp(Math.round(u * (1.0F - var36 * 0.62F)), 0, 255);
         int var49 = MathHelper.clamp(Math.round(u * (1.0F - var37 * 0.62F)), 0, 255);

         for (int var50 = 0; var50 < 72; var50++) {
            float var51 = var50 / 72.0F;
            float var52 = (var50 + 1) / 72.0F;
            double var53 = var51 * Math.PI * 2.0;
            double var55 = var52 * Math.PI * 2.0;
            double var57 = Math.cos(var53);
            double var59 = Math.sin(var53);
            double var61 = Math.cos(var55);
            double var63 = Math.sin(var55);
            this.O00000000(
               vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, m, n, o, var57, var59, var42, var46, var37, r, s, t, var49, var51 + v * 0.26F, w + var39
            );
            this.O00000000(
               vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, m, n, o, var57, var59, var40, var44, var36, r, s, t, var48, var51 + v * 0.26F, w + var38
            );
            this.O00000000(
               vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, m, n, o, var61, var63, var40, var44, var36, r, s, t, var48, var52 + v * 0.26F, w + var38
            );
            this.O00000000(
               vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, m, n, o, var61, var63, var42, var46, var37, r, s, t, var49, var52 + v * 0.26F, w + var39
            );
         }
      }
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      double d,
      double e,
      double f,
      double g,
      double h,
      double i,
      double j,
      double k,
      double l,
      double m,
      double n,
      double o,
      double p,
      double q,
      double r,
      double s,
      float t,
      int u,
      int v,
      int w,
      int x,
      float y,
      float z
   ) {
      double var42 = j * p + m * q;
      double var44 = k * p + n * q;
      double var46 = l * p + o * q;
      double var48 = d + var42 * r + g * s;
      double var50 = e + var44 * r + h * s;
      double var52 = f + var46 * r + i * s;
      double var54 = g * (1.0 - t * 0.32F) + var42 * t * 0.68F;
      double var56 = h * (1.0 - t * 0.32F) + var44 * t * 0.68F;
      double var58 = i * (1.0 - t * 0.32F) + var46 * t * 0.68F;
      double var60 = Math.sqrt(var54 * var54 + var56 * var56 + var58 * var58);
      if (var60 <= 1.0E-5) {
         var54 = g;
         var56 = h;
         var58 = i;
      } else {
         var54 /= var60;
         var56 /= var60;
         var58 /= var60;
      }

      vertexConsumer.vertex(matrix4f, (float)var48, (float)var50, (float)var52)
         .texture(y, z)
         .color(u, v, w, x)
         .normal((float)var54, (float)var56, (float)var58);
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, double d, double e, double f, double g, double h, double i, int j, int k, int l) {
      double var18 = 0.004;
      double var20 = d - var18;
      double var22 = e - var18;
      double var24 = f - var18;
      double var26 = g + var18;
      double var28 = h + var18;
      double var30 = i + var18;
      int var32 = this.O00000000(j, 255, 0.3F);
      int var33 = this.O00000000(k, 255, 0.26F);
      int var34 = this.O00000000(l, 255, 0.26F);
      this.O00000000(vertexConsumer, matrix4f, var20, var22, var24, var26, var28, var30, 0.046F, j, k, l, 26);
      this.O00000000(vertexConsumer, matrix4f, var20, var22, var24, var26, var28, var30, 0.02F, j, k, l, 60);
      this.O00000000(vertexConsumer, matrix4f, var20, var22, var24, var26, var28, var30, 0.008F, var32, var33, var34, 180);
   }

   private void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, double d, double e, double f, double g, double h, double i, float j, int k, int l, int m, int n
   ) {
      this.O00000000(vertexConsumer, matrix4f, d, e, f, g, e, f, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, g, e, f, g, e, i, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, g, e, i, d, e, i, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, d, e, i, d, e, f, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, d, h, f, g, h, f, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, g, h, f, g, h, i, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, g, h, i, d, h, i, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, d, h, i, d, h, f, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, d, e, f, d, h, f, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, g, e, f, g, h, f, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, g, e, i, g, h, i, j, k, l, m, n, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, d, e, i, d, h, i, j, k, l, m, n, 3.0F);
   }

   private void O00000000(
      VertexConsumer vertexConsumer, Matrix4f matrix4f, double d, double e, double f, double g, double h, double i, int j, int k, int l, int m
   ) {
      double var19 = g - d;
      double var21 = h - e;
      double var23 = i - f;
      double var25 = Math.min(Math.min(var19, var21), var23) * 0.42;
      if (var25 < 0.18) {
         var25 = 0.18;
      }

      if (var25 > 0.38) {
         var25 = 0.38;
      }

      float var27 = 0.028F;
      this.O00000000(vertexConsumer, matrix4f, d, e, f, 1.0, 1.0, 1.0, var25, var27, j, k, l, m);
      this.O00000000(vertexConsumer, matrix4f, g, e, f, -1.0, 1.0, 1.0, var25, var27, j, k, l, m);
      this.O00000000(vertexConsumer, matrix4f, g, e, i, -1.0, 1.0, -1.0, var25, var27, j, k, l, m);
      this.O00000000(vertexConsumer, matrix4f, d, e, i, 1.0, 1.0, -1.0, var25, var27, j, k, l, m);
      this.O00000000(vertexConsumer, matrix4f, d, h, f, 1.0, -1.0, 1.0, var25, var27, j, k, l, m);
      this.O00000000(vertexConsumer, matrix4f, g, h, f, -1.0, -1.0, 1.0, var25, var27, j, k, l, m);
      this.O00000000(vertexConsumer, matrix4f, g, h, i, -1.0, -1.0, -1.0, var25, var27, j, k, l, m);
      this.O00000000(vertexConsumer, matrix4f, d, h, i, 1.0, -1.0, -1.0, var25, var27, j, k, l, m);
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      double d,
      double e,
      double f,
      double g,
      double h,
      double i,
      double j,
      float k,
      int l,
      int m,
      int n,
      int o
   ) {
      this.O00000000(vertexConsumer, matrix4f, d, e, f, d + g * j, e, f, k, l, m, n, o, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, d, e, f, d, e + h * j, f, k, l, m, n, o, 3.0F);
      this.O00000000(vertexConsumer, matrix4f, d, e, f, d, e, f + i * j, k, l, m, n, o, 3.0F);
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      double d,
      double e,
      double f,
      double g,
      double h,
      double i,
      double j,
      double k,
      double l,
      float m,
      float n,
      int o,
      int p,
      int q,
      int r,
      float s,
      float t,
      float u
   ) {
      double var30 = Math.max(0.01, (double)(m - n * 0.5F));
      double var32 = m + n * 0.5F;
      double var34 = h * l - i * k;
      double var36 = i * j - g * l;
      double var38 = g * k - h * j;

      for (int var40 = 0; var40 < 72; var40++) {
         float var41 = var40 / 72.0F;
         float var42 = (var40 + 1) / 72.0F;
         double var43 = var41 * Math.PI * 2.0;
         double var45 = var42 * Math.PI * 2.0;
         double var47 = Math.cos(var43);
         double var49 = Math.sin(var43);
         double var51 = Math.cos(var45);
         double var53 = Math.sin(var45);
         int var55 = this.O00000000(r, var41, s, t);
         int var56 = this.O00000000(r, var42, s, t);
         this.O00000000(
            vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, var47, var49, var32, o, p, q, var55, var41 + s * 0.2F, u + 0.92F, var34, var36, var38
         );
         this.O00000000(
            vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, var47, var49, var30, o, p, q, var55, var41 + s * 0.2F, u + 0.08F, var34, var36, var38
         );
         this.O00000000(
            vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, var51, var53, var30, o, p, q, var56, var42 + s * 0.2F, u + 0.08F, var34, var36, var38
         );
         this.O00000000(
            vertexConsumer, matrix4f, d, e, f, g, h, i, j, k, l, var51, var53, var32, o, p, q, var56, var42 + s * 0.2F, u + 0.92F, var34, var36, var38
         );
      }
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      double d,
      double e,
      double f,
      double g,
      double h,
      double i,
      double j,
      double k,
      double l,
      double m,
      double n,
      double o,
      int p,
      int q,
      int r,
      int s,
      float t,
      float u,
      double v,
      double w,
      double x
   ) {
      double var39 = d + (g * m + j * n) * o;
      double var41 = e + (h * m + k * n) * o;
      double var43 = f + (i * m + l * n) * o;
      vertexConsumer.vertex(matrix4f, (float)var39, (float)var41, (float)var43).texture(t, u).color(p, q, r, s).normal((float)v, (float)w, (float)x);
   }

   private int O00000000(int i, float f, float g, float h) {
      float var5 = 0.5F + 0.5F * (float)Math.sin((f * 3.0F - g * 2.0F) * Math.PI * 2.0);
      return MathHelper.clamp(Math.round(i * h * (0.48F + var5 * 0.52F)), 0, 255);
   }

   private void O00000000(
      VertexConsumer vertexConsumer,
      Matrix4f matrix4f,
      double d,
      double e,
      double f,
      double g,
      double h,
      double i,
      float j,
      int k,
      int l,
      int m,
      int n,
      float o
   ) {
      double var21 = g - d;
      double var23 = h - e;
      double var25 = i - f;
      double var27 = Math.sqrt(var21 * var21 + var23 * var23 + var25 * var25);
      if (!(var27 <= 1.0E-5)) {
         double var29 = var21 / var27;
         double var31 = var23 / var27;
         double var33 = var25 / var27;
         double var35 = Math.abs(var31) < 0.92 ? 0.0 : 1.0;
         double var37 = Math.abs(var31) < 0.92 ? 1.0 : 0.0;
         double var39 = 0.0;
         double var41 = var37 * var33 - var39 * var31;
         double var43 = var39 * var29 - var35 * var33;
         double var45 = var35 * var31 - var37 * var29;
         double var47 = Math.sqrt(var41 * var41 + var43 * var43 + var45 * var45);
         if (var47 <= 1.0E-5) {
            var41 = 1.0;
            var43 = 0.0;
            var45 = 0.0;
         } else {
            var41 /= var47;
            var43 /= var47;
            var45 /= var47;
         }

         double var49 = var31 * var45 - var33 * var43;
         double var51 = var33 * var41 - var29 * var45;
         double var53 = var29 * var43 - var31 * var41;
         double var55 = j * 0.5;

         for (int var57 = 0; var57 < 6; var57++) {
            float var58 = var57 / 6.0F;
            float var59 = (var57 + 1) / 6.0F;
            if (var57 == 5) {
               var59 = 0.999F;
            }

            double var60 = var58 * Math.PI * 2.0;
            double var62 = var59 * Math.PI * 2.0;
            double var64 = Math.cos(var60);
            double var66 = Math.sin(var60);
            double var68 = Math.cos(var62);
            double var70 = Math.sin(var62);
            double var72 = var41 * var64 + var49 * var66;
            double var74 = var43 * var64 + var51 * var66;
            double var76 = var45 * var64 + var53 * var66;
            double var78 = var41 * var68 + var49 * var70;
            double var80 = var43 * var68 + var51 * var70;
            double var82 = var45 * var68 + var53 * var70;
            vertexConsumer.vertex(matrix4f, (float)(d + var72 * var55), (float)(e + var74 * var55), (float)(f + var76 * var55))
               .texture(0.0F, o + var58)
               .color(k, l, m, n)
               .normal((float)var72, (float)var74, (float)var76);
            vertexConsumer.vertex(matrix4f, (float)(d + var78 * var55), (float)(e + var80 * var55), (float)(f + var82 * var55))
               .texture(0.0F, o + var59)
               .color(k, l, m, n)
               .normal((float)var78, (float)var80, (float)var82);
            vertexConsumer.vertex(matrix4f, (float)(g + var78 * var55), (float)(h + var80 * var55), (float)(i + var82 * var55))
               .texture(1.0F, o + var59)
               .color(k, l, m, n)
               .normal((float)var78, (float)var80, (float)var82);
            vertexConsumer.vertex(matrix4f, (float)(g + var72 * var55), (float)(h + var74 * var55), (float)(i + var76 * var55))
               .texture(1.0F, o + var58)
               .color(k, l, m, n)
               .normal((float)var72, (float)var74, (float)var76);
         }
      }
   }

   private float O00000000(float f, float g, float h, boolean bl) {
      float var5 = (float)Math.pow(this.O0000000000(f), 0.72F);
      float var6 = g + (h - g) * var5;
      return bl ? var6 : var6 * (1.0F - var5 * 0.36F);
   }

   private float O000000000(float f) {
      return this.O00000000(0.0F, 0.055F, f) * (1.0F - this.O00000000(0.885F, 1.0F, f));
   }

   private float O00000000(float f, float g, float h) {
      float var4 = this.O0000000000((h - f) / Math.max(1.0E-5F, g - f));
      return var4 * var4 * (3.0F - 2.0F * var4);
   }

   private float O0000000000(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }

   private int O00000000(int i, int j, float f) {
      float var4 = this.O0000000000(f);
      return MathHelper.clamp(Math.round(i + (j - i) * var4), 0, 255);
   }

   private float O0000000000O00() {
      return (float)(System.nanoTime() - O000000000OO) * 1.0E-9F;
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, Predictions.W185 o000000000) {
      String var6 = this.O00000000000(o000000000.ticks() / 20.0F);
      float var7 = 25.0F;
      float var8 = 3.0F;
      float var9 = 3.0F;
      float var10 = 22.0F;
      float var11 = 3.0F;
      float var12 = 6.0F;
      float var13 = RenderManager.O00000000(FontRegistry.O00000000, var6, var7).O00000000;
      int var14 = this.O00000000(o000000000.icon());
      boolean var15 = var14 > 0;
      float var16 = var15 ? var10 + var11 : 0.0F;
      float var17 = var8 * 2.0F + var16 + var13 + var12;
      float var18 = var9 + Math.max(var15 ? var10 : 0.0F, var7);
      float var19 = var18 / 2.0F;
      o0000O00OO0O0.O00000000(f, g);
      o0000O00OO0O0.O000000000(h, h);
      float var20 = -var17 / 2.0F;
      float var21 = -var18;
      this.O00000000(o0000O00OO0O0, var20, var21, var17, var18, var19, 111.0F);
      float var22 = var20 + var8 + (var15 ? 0.0F : var12 / 2.0F);
      if (var15) {
         float var23 = var20 + var8;
         float var24 = var21 + (var18 - var10) / 2.0F;
         o0000O00OO0O0.O00000000(var23, var24 + var10);
         o0000O00OO0O0.O000000000(1.0F, -1.0F);
         o0000O00OO0O0.O00000000(var14, 0.0F, 0.0F, var10, var10);
         o0000O00OO0O0.O00000000000O0();
         o0000O00OO0O0.O00000000000O();
         var22 = var23 + var10 + var11;
      }

      float var25 = var21 + var9 + var7 - 10.0F;
      int var26 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000O(1, 1), 230);
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var22 + 1.0F, var25 + 1.0F, var7, var6, var26);
      o0000O00OO0O0.O00000000000O0();
      o0000O00OO0O0.O00000000000O();
   }

   private boolean O000000000(Predictions.W185 o000000000) {
      Identifier var2 = o000000000.icon();
      return var2 != null && var2.getPath().contains("ender_pearl");
   }

   private void O000000000(RenderManager o0000O00OO0O0, float f, float g, float h, Predictions.W185 o000000000) {
      String var6 = o000000000.ownerName();
      if (var6 != null && !var6.isEmpty() && !var6.equals("Unknown") && !var6.equals("You")) {
         float var7 = 22.0F;
         float var8 = 4.0F;
         float var9 = 3.0F;
         float var10 = 18.0F;
         float var11 = 4.0F;
         float var12 = RenderManager.O00000000(FontRegistry.O00000000, var6, var7).O00000000;
         float var13 = var8 * 2.0F + var10 + var11 + var12;
         float var14 = var9 + Math.max(var10, var7);
         float var15 = var14 / 2.0F;
         o0000O00OO0O0.O00000000(f, g);
         o0000O00OO0O0.O000000000(h, h);
         float var16 = -var13 / 2.0F;
         float var17 = -var14;
         this.O00000000(o0000O00OO0O0, var16, var17, var13, var14, var15, 111.0F);
         float var18 = var16 + var8;
         float var19 = var17 + (var14 - var10) / 2.0F;
         this.O00000000(o0000O00OO0O0, var6, var18, var19, var10, 1.0F);
         float var20 = var18 + var10 + var11;
         float var21 = var17 + var9 + var7 - 10.0F;
         int var22 = RenderManager.W382.O0000000000O(RenderManager.W382.O000000000000O(1, 1), 230);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000, var20 + 1.0F, var21 + 1.0F, var7, var6, var22);
         o0000O00OO0O0.O00000000000O0();
         o0000O00OO0O0.O00000000000O();
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, String string, float f, float g, float h, float i) {
      if (O0000000000.getNetworkHandler() != null) {
         PlayerListEntry var7 = null;

         for (PlayerListEntry var9 : O0000000000.getNetworkHandler().getPlayerList()) {
            if (var9.getProfile().getName().equalsIgnoreCase(string)) {
               var7 = var9;
               break;
            }
         }

         if (var7 != null) {
            try {
               Identifier var13 = var7.getSkinTextures().texture();
               AbstractTexture var14 = O0000000000.getTextureManager().getTexture(var13);
               if (var14 != null && var14.getGlTexture() instanceof GlTexture var10 && var10.getGlId() > 0) {
                  int var15 = var10.getGlId();
                  GlStateManager._bindTexture(var15);
                  o0000O00OO0O0.O000000000000(i);
                  o0000O00OO0O0.O00000000(var15, f, g, h, h, 0.125F, 0.125F, 0.25F, 0.25F, 3.0F);
                  o0000O00OO0O0.O00000000(var15, f, g, h, h, 0.625F, 0.125F, 0.75F, 0.25F, 3.0F);
                  o0000O00OO0O0.O00000000000OO();
               }
            } catch (Throwable var12) {
            }
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k) {
      float var8 = k / 155.0F;
      int var9 = this.O00000000OO00.O00000000(255.0F);
      int var10 = this.O00000000OO00.O00000000000(var8);
      o0000O00OO0O0.O00000000(f, g, h, i, 12.0F, var9);
   }

   private String O00000000000(float f) {
      String var2 = String.format(Locale.US, "%.1f", f).replace('.', ',');
      return var2 + " сек";
   }

   private int O00000000(Identifier identifier) {
      if (identifier == null) {
         return -1;
      } else {
         TextureManager var2 = O0000000000.getTextureManager();
         if (var2 == null) {
            return -1;
         } else {
            AbstractTexture var3 = var2.getTexture(identifier);
            if (var3 == null) {
               return -1;
            } else if (var3.getGlTexture() instanceof GlTexture var5) {
               int var6 = var5.getGlId();
               return var6 > 0 ? var6 : -1;
            } else {
               return -1;
            }
         }
      }
   }

   private Identifier O000000000(Item item) {
      if (item instanceof TridentItem) {
         return Identifier.of("minecraft", "textures/item/trident.png");
      } else if (item instanceof BowItem || item instanceof CrossbowItem) {
         return Identifier.of("minecraft", "textures/item/arrow.png");
      } else if (item instanceof ThrowablePotionItem) {
         return Identifier.of("minecraft", "textures/item/potion.png");
      } else if (item instanceof SnowballItem) {
         return Identifier.of("minecraft", "textures/item/snowball.png");
      } else if (item instanceof EggItem) {
         return Identifier.of("minecraft", "textures/item/egg.png");
      } else if (item instanceof ExperienceBottleItem) {
         return Identifier.of("minecraft", "textures/item/experience_bottle.png");
      } else {
         return item instanceof EnderPearlItem ? Identifier.of("minecraft", "textures/item/ender_pearl.png") : null;
      }
   }

   private Identifier O00000000(ProjectileEntity projectileEntity) {
      String var2 = Registries.ENTITY_TYPE.getId(projectileEntity.getType()).getPath();
      if (var2.contains("trident")) {
         return Identifier.of("minecraft", "textures/item/trident.png");
      } else if (var2.contains("snowball")) {
         return Identifier.of("minecraft", "textures/item/snowball.png");
      } else if (var2.contains("arrow")) {
         return Identifier.of("minecraft", "textures/item/arrow.png");
      } else if (var2.contains("potion")) {
         return Identifier.of("minecraft", "textures/item/potion.png");
      } else if (var2.contains("pearl")) {
         return Identifier.of("minecraft", "textures/item/ender_pearl.png");
      } else if (var2.contains("egg")) {
         return Identifier.of("minecraft", "textures/item/egg.png");
      } else {
         return var2.contains("experience_bottle") ? Identifier.of("minecraft", "textures/item/experience_bottle.png") : null;
      }
   }

   record W184(double speed, double gravity, float pitchOffset, boolean applyPhysicsBeforeMove) {
   }

   record W185(
      String key,
      List<Vec3d> path,
      Vec3d landingPos,
      Vec3d blockRenderPos,
      Box targetBox,
      int ticks,
      Entity hitEntity,
      BlockHitResult blockHit,
      String ownerName,
      Identifier icon,
      boolean isPreAim
   ) {
      Predictions.W185 withRenderState(List<Vec3d> list, Vec3d vec3d, Vec3d vec3d2, Box box) {
         return new Predictions.W185(this.key, list, vec3d, vec3d2, box, this.ticks, this.hitEntity, this.blockHit, this.ownerName, this.icon, this.isPreAim);
      }

      static String resolveOwnerName(ProjectileEntity projectileEntity) {
         return projectileEntity.getOwner() instanceof PlayerEntity var2 ? var2.getName().getString() : "Unknown";
      }
   }
}
