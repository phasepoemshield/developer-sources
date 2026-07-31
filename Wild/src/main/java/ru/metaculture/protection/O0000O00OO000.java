package ru.metaculture.protection;

import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.nio.FloatBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.SequencedMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumers;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.LightType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;
import org.wild.mixin.acceser.EntityRenderDispatcherAccessor;

public final class O0000O00OO000 {
   private static final int O00000000 = 1048576;
   private static final Logger O000000000 = LogManager.getLogger("EntityFramebufferCapture");
   private static final O0000O00OO000 O0000000000 = new O0000O00OO000();
   private static final Predicate<Entity> O00000000000 = entity -> true;
   private volatile SimpleFramebuffer O000000000000;
   private volatile SimpleFramebuffer O0000000000000;
   private final Map<String, Predicate<Entity>> O000000000000O = new ConcurrentHashMap<>();
   private final Map<String, Predicate<Entity>> O00000000000O = new ConcurrentHashMap<>();
   private volatile boolean O00000000000O0;
   private volatile boolean O00000000000OO;
   private volatile boolean O0000000000O;
   private volatile boolean O0000000000O0;
   private volatile boolean O0000000000O00;
   private volatile boolean O0000000000O0O;
   private volatile int O0000000000OO = -1;
   private volatile int O0000000000OO0 = -1;
   private volatile int O0000000000OOO;
   private volatile int O000000000O;
   private volatile int O000000000O0 = Integer.MIN_VALUE;
   private int O000000000O00;
   private O0000O00OO000.W374 O000000000O000;
   private final BufferAllocator O000000000O00O = new BufferAllocator(1048576);
   private final SequencedMap<RenderLayer, BufferAllocator> O000000000O0O = new LinkedHashMap<>();

   private O0000O00OO000() {
   }

   public static O0000O00OO000 O00000000() {
      return O0000000000;
   }

   public void O00000000(boolean bl) {
      if (this.O00000000000O0 != bl) {
         this.O00000000000O0 = bl;
         this.O000000000O000();
      }
   }

   public void O00000000(String string, boolean bl, Predicate<Entity> predicate) {
      if (string == null || string.isBlank()) {
         throw new IllegalArgumentException("owner");
      } else if (!bl) {
         this.O00000000(string);
      } else {
         Predicate var4 = predicate == null ? O00000000000 : predicate;
         if (this.O000000000000O.get(string) != var4) {
            this.O000000000000O.put(string, var4);
         }
      }
   }

   public void O00000000(String string) {
      if (string != null && !string.isBlank()) {
         this.O000000000000O.remove(string);
         this.O000000000O000();
      }
   }

   public void O000000000(String string, boolean bl, Predicate<Entity> predicate) {
      if (string == null || string.isBlank()) {
         throw new IllegalArgumentException("owner");
      } else if (bl && predicate != null) {
         if (this.O00000000000O.get(string) != predicate) {
            this.O00000000000O.put(string, predicate);
         }
      } else {
         this.O000000000(string);
      }
   }

   public void O000000000(String string) {
      if (string != null && !string.isBlank()) {
         this.O00000000000O.remove(string);
         if (this.O00000000000O.isEmpty()) {
            this.O0000000000O = false;
         }
      }
   }

   private boolean O000000000O() {
      return !this.O00000000000O.isEmpty();
   }

   private boolean O00000000(Entity entity) {
      if (this.O00000000000O.isEmpty()) {
         return false;
      } else {
         for (Predicate var3 : this.O00000000000O.values()) {
            try {
               if (var3.test(entity)) {
                  return true;
               }
            } catch (RuntimeException var5) {
               O000000000.warn("Entity tag filter failed for {}", entity.getName().getString(), var5);
            }
         }

         return false;
      }
   }

   public boolean O000000000() {
      return this.O00000000000O0 || !this.O000000000000O.isEmpty();
   }

   public boolean O0000000000() {
      return this.O000000000() && this.O00000000000OO && this.O0000000000OO > 0 && this.O0000000000OO0 > 0 && O0000000000(this.O000000000000);
   }

   public int O00000000000() {
      return this.O0000000000() ? O00000000000(this.O000000000000) : 0;
   }

   public int O000000000000() {
      return this.O0000000000() ? O000000000000(this.O000000000000) : 0;
   }

   public boolean O0000000000000() {
      return this.O000000000() && this.O000000000O() && this.O0000000000O && O0000000000(this.O0000000000000);
   }

   public int O000000000000O() {
      return this.O0000000000000() ? O00000000000(this.O0000000000000) : 0;
   }

   public int O00000000000O() {
      return this.O0000000000000() ? O000000000000(this.O0000000000000) : 0;
   }

   public boolean O00000000000O0() {
      return this.O0000000000O0 || this.O0000000000O00;
   }

   public boolean O00000000000OO() {
      return this.O0000000000O0;
   }

   public void O00000000(WorldRenderer worldRenderer, RenderTickCounter renderTickCounter, Camera camera) {
      if (!this.O000000000()) {
         this.O000000000O00O();
      } else {
         Objects.requireNonNull(worldRenderer, "worldRenderer");
         Objects.requireNonNull(renderTickCounter, "tickCounter");
         MinecraftClient var4 = MinecraftClient.getInstance();
         if (var4 == null || var4.world == null || var4.gameRenderer == null) {
            this.O000000000O00O();
         } else if (!var4.gameRenderer.isRenderingPanorama() && camera != null) {
            Framebuffer var5 = var4.getFramebuffer();
            if (var5 == null) {
               this.O000000000O00O();
            } else {
               Window var6 = var4.getWindow();
               int var7 = var6 != null ? var6.getFramebufferWidth() : var5.textureWidth;
               int var8 = var6 != null ? var6.getFramebufferHeight() : var5.textureHeight;
               if (var7 <= 0 || var8 <= 0) {
                  this.O000000000O00O();
                  this.O000000000O00();
                  this.O0000000000OO = -1;
                  this.O0000000000OO0 = -1;
               } else if (!this.O0000000000(var7, var8)) {
                  this.O000000000O00O();
               } else {
                  SimpleFramebuffer var9 = this.O000000000000;
                  if (var9 == null) {
                     this.O000000000O00O();
                  } else {
                     GpuTextureView var10 = var9.getColorAttachmentView();
                     if (var10 != null && !var10.isClosed()) {
                        GpuTextureView var11 = var9.getDepthAttachmentView();
                        if (!this.O00000000(var9)) {
                           CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
                           GpuTexture var13 = var10.texture();
                           if (var11 != null && !var11.isClosed()) {
                              var12.clearColorAndDepthTextures(var13, 0, var11.texture(), 1.0);
                           } else {
                              var12.clearColorTexture(var13, 0);
                           }
                        }

                        this.O000000000O0O();

                        try {
                           this.O000000000O00O.clear();
                           this.O000000000O0O.values().forEach(BufferAllocator::clear);
                           this.O000000000O000 = new O0000O00OO000.W374(this.O000000000O00O, this.O000000000O0O);
                        } catch (RuntimeException var14) {
                           O000000000.warn("Failed to allocate capture resources", var14);
                           this.O000000000O00O();
                           return;
                        }

                        this.O000000000(var7, var8);
                        this.O00000000000OO = false;
                        this.O0000000000O0O = true;
                        this.O0000000000OOO = 0;
                     } else {
                        this.O000000000O00O();
                     }
                  }
               }
            }
         } else {
            this.O000000000O00O();
         }
      }
   }

   private void O000000000(int i, int j) {
      this.O0000000000O = false;
      if (!this.O000000000O()) {
         this.O000000000O0();
      } else if (this.O00000000000(i, j)) {
         SimpleFramebuffer var3 = this.O0000000000000;
         if (var3 != null) {
            GpuTextureView var4 = var3.getColorAttachmentView();
            if (var4 != null && !var4.isClosed()) {
               GpuTextureView var5 = var3.getDepthAttachmentView();
               if (!this.O00000000(var3)) {
                  CommandEncoder var6 = RenderSystem.getDevice().createCommandEncoder();
                  if (var5 != null && !var5.isClosed()) {
                     var6.clearColorAndDepthTextures(var4.texture(), 0, var5.texture(), 1.0);
                  } else {
                     var6.clearColorTexture(var4.texture(), 0);
                  }
               }
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O0000000000O() {
      O0000O00OO000.W374 var1 = this.O000000000O000;
      boolean var7 = false /* VF: Semaphore variable */;

      label102: {
         label101: {
            try {
               var7 = true;
               if (var1 != null) {
                  try {
                     this.O00000000(var1);
                  } finally {
                     var1.close();
                  }

                  var7 = false;
               } else {
                  var7 = false;
               }
               break label101;
            } catch (RuntimeException var12) {
               O000000000.warn("Failed to finalize capture frame", var12);
               this.O00000000000OO = false;
               var7 = false;
            } finally {
               if (var7) {
                  this.O000000000O000 = null;
                  this.O0000000000O0O = false;
                  this.O000000000O = this.O0000000000OOO;
               }
            }

            this.O000000000O000 = null;
            this.O0000000000O0O = false;
            this.O000000000O = this.O0000000000OOO;
            break label102;
         }

         this.O000000000O000 = null;
         this.O0000000000O0O = false;
         this.O000000000O = this.O0000000000OOO;
      }

      this.O00000000000OO = this.O00000000000OO && O0000000000(this.O000000000000);
      this.O0000000000O = this.O0000000000O && O0000000000(this.O0000000000000);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(Entity entity, double d, double e, double f, float g, MatrixStack matrixStack) {
      if (this.O000000000() && this.O0000000000O0O && !this.O0000000000O0 && !this.O0000000000O00 && !O0000O00OO00O.O000000000() && entity != null) {
         if (entity instanceof LivingEntity) {
            if (this.O00000000(entity)) {
               this.O000000000(entity, d, e, f, g, matrixStack);
            }
         } else if (this.O000000000(entity)) {
            Objects.requireNonNull(matrixStack, "matrices");
            O0000O00OO000.W374 var10 = this.O000000000O000;
            SimpleFramebuffer var11 = this.O000000000000;
            if (var10 != null && var11 != null && this.O0000000000OO > 0 && this.O0000000000OO0 > 0) {
               GpuTextureView var12 = var11.getColorAttachmentView();
               if (var12 != null && !var12.isClosed()) {
                  GpuTextureView var13 = var11.getDepthAttachmentView();
                  MinecraftClient var14 = MinecraftClient.getInstance();
                  if (var14 != null && var14.world != null) {
                     EntityRenderDispatcher var15 = var14.getEntityRenderDispatcher();
                     if (var15 != null) {
                        MatrixStack var16 = var10.O00000000(matrixStack);
                        if (var16 != null) {
                           Vec3d var17 = entity.getLerpedPos(g);
                           double var18 = var17.x - d;
                           double var20 = var17.y - e;
                           double var22 = var17.z - f;
                           BlockPos var24 = BlockPos.ofFloored(var17);
                           int var25 = var14.world.getLightLevel(LightType.BLOCK, var24);
                           int var26 = var14.world.getLightLevel(LightType.SKY, var24);
                           int var27 = LightmapTextureManager.pack(var26, var25);
                           GpuTextureView var28 = RenderSystem.outputColorTextureOverride;
                           GpuTextureView var29 = RenderSystem.outputDepthTextureOverride;
                           RenderSystem.outputColorTextureOverride = var12;
                           RenderSystem.outputDepthTextureOverride = var13;
                           EntityRenderDispatcherAccessor var30 = var15 instanceof EntityRenderDispatcherAccessor var31 ? var31 : null;
                           boolean var45 = var30 != null;
                           boolean var32 = false;
                           if (var30 != null) {
                              var32 = var30.night$getRenderShadows();
                              var30.night$setRenderShadows(false);
                           }

                           this.O0000000000O0 = true;
                           boolean var38 = false /* VF: Semaphore variable */;

                           label252: {
                              try {
                                 try {
                                    var38 = true;
                                    var15.render(entity, var18, var20, var22, g, var16, var10.O00000000(), var27);
                                    var10.O000000000();
                                    this.O0000000000OOO++;
                                    this.O00000000000OO = true;
                                 } finally {
                                    var10.O0000000000();
                                 }

                                 var38 = false;
                                 break label252;
                              } catch (RuntimeException var43) {
                                 O000000000.warn("Failed to visuals entity {} into capture framebuffer", entity.getName().getString(), var43);
                                 this.O00000000000OO = false;
                                 var38 = false;
                              } finally {
                                 if (var38) {
                                    this.O0000000000O0 = false;
                                    if (var45) {
                                       var30.night$setRenderShadows(var32);
                                    }

                                    RenderSystem.outputColorTextureOverride = var28;
                                    RenderSystem.outputDepthTextureOverride = var29;
                                 }
                              }

                              this.O0000000000O0 = false;
                              if (var45) {
                                 var30.night$setRenderShadows(var32);
                              }

                              RenderSystem.outputColorTextureOverride = var28;
                              RenderSystem.outputDepthTextureOverride = var29;
                              return;
                           }

                           this.O0000000000O0 = false;
                           if (var45) {
                              var30.night$setRenderShadows(var32);
                           }

                           RenderSystem.outputColorTextureOverride = var28;
                           RenderSystem.outputDepthTextureOverride = var29;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O000000000(Entity entity, double d, double e, double f, float g, MatrixStack matrixStack) {
      O0000O00OO000.W374 var10 = this.O000000000O000;
      SimpleFramebuffer var11 = this.O0000000000000;
      if (var10 != null && var11 != null && O0000000000(var11) && matrixStack != null) {
         GpuTextureView var12 = var11.getColorAttachmentView();
         if (var12 != null && !var12.isClosed()) {
            GpuTextureView var13 = var11.getDepthAttachmentView();
            MinecraftClient var14 = MinecraftClient.getInstance();
            if (var14 != null && var14.world != null) {
               EntityRenderDispatcher var15 = var14.getEntityRenderDispatcher();
               if (var15 != null) {
                  MatrixStack var16 = var10.O00000000(matrixStack);
                  if (var16 != null) {
                     double var17 = MathHelper.lerp(g, entity.lastRenderX, entity.getX());
                     double var19 = MathHelper.lerp(g, entity.lastRenderY, entity.getY());
                     double var21 = MathHelper.lerp(g, entity.lastRenderZ, entity.getZ());
                     double var23 = var17 - d;
                     double var25 = var19 - e;
                     double var27 = var21 - f;
                     BlockPos var29 = BlockPos.ofFloored(var17, var19, var21);
                     int var30 = var14.world.getLightLevel(LightType.BLOCK, var29);
                     int var31 = var14.world.getLightLevel(LightType.SKY, var29);
                     int var32 = LightmapTextureManager.pack(var31, var30);
                     GpuTextureView var33 = RenderSystem.outputColorTextureOverride;
                     GpuTextureView var34 = RenderSystem.outputDepthTextureOverride;
                     RenderSystem.outputColorTextureOverride = var12;
                     RenderSystem.outputDepthTextureOverride = var13;
                     EntityRenderDispatcherAccessor var35 = var15 instanceof EntityRenderDispatcherAccessor var36 ? var36 : null;
                     boolean var49 = false;
                     if (var35 != null) {
                        var49 = var35.night$getRenderShadows();
                        var35.night$setRenderShadows(false);
                     }

                     this.O0000000000O00 = true;
                     boolean var42 = false /* VF: Semaphore variable */;

                     label182: {
                        try {
                           try {
                              var42 = true;
                              var15.render(entity, var23, var25, var27, g, var16, var10.O00000000(), var32);
                              var10.O000000000();
                              this.O0000000000O = true;
                           } finally {
                              var10.O0000000000();
                           }

                           var42 = false;
                           break label182;
                        } catch (RuntimeException var47) {
                           O000000000.warn("Failed to render tagged entity {} into capture framebuffer", entity.getName().getString(), var47);
                           this.O0000000000O = false;
                           var42 = false;
                        } finally {
                           if (var42) {
                              this.O0000000000O00 = false;
                              if (var35 != null) {
                                 var35.night$setRenderShadows(var49);
                              }

                              RenderSystem.outputColorTextureOverride = var33;
                              RenderSystem.outputDepthTextureOverride = var34;
                           }
                        }

                        this.O0000000000O00 = false;
                        if (var35 != null) {
                           var35.night$setRenderShadows(var49);
                        }

                        RenderSystem.outputColorTextureOverride = var33;
                        RenderSystem.outputDepthTextureOverride = var34;
                        return;
                     }

                     this.O0000000000O00 = false;
                     if (var35 != null) {
                        var35.night$setRenderShadows(var49);
                     }

                     RenderSystem.outputColorTextureOverride = var33;
                     RenderSystem.outputDepthTextureOverride = var34;
                  }
               }
            }
         }
      }
   }

   public boolean O0000000000O0() {
      return this.O000000000() && this.O0000000000O0O && this.O0000000000OO > 0 && this.O0000000000OO0 > 0 && O0000000000(this.O000000000000);
   }

   public VertexConsumer O00000000(VertexConsumer vertexConsumer, RenderLayer renderLayer, LivingEntityRenderState livingEntityRenderState) {
      if (vertexConsumer != null
         && renderLayer != null
         && this.O000000000()
         && this.O0000000000O0O
         && !this.O0000000000O0
         && !this.O0000000000O00
         && !O0000O00OO00O.O000000000()) {
         LivingEntity var4 = this.O000000000(livingEntityRenderState);
         O0000O00OO000.W374 var5 = this.O000000000O000;
         SimpleFramebuffer var6 = this.O000000000000;
         if (var4 != null && var5 != null && var6 != null) {
            GpuTextureView var7 = var6.getColorAttachmentView();
            if (var7 != null && !var7.isClosed()) {
               GpuTextureView var8 = RenderSystem.outputColorTextureOverride;
               GpuTextureView var9 = RenderSystem.outputDepthTextureOverride;
               RenderSystem.outputColorTextureOverride = var7;
               RenderSystem.outputDepthTextureOverride = var6.getDepthAttachmentView();

               VertexConsumer var11;
               try {
                  VertexConsumer var10 = var5.O00000000(renderLayer);
                  var5.O000000000();
                  this.O000000000O0 = var4.getId();
                  return VertexConsumers.union(vertexConsumer, var10);
               } catch (RuntimeException var15) {
                  O000000000.warn("Failed to prepare living layer {} for {}", renderLayer, var4.getName().getString(), var15);
                  var11 = vertexConsumer;
               } finally {
                  RenderSystem.outputColorTextureOverride = var8;
                  RenderSystem.outputDepthTextureOverride = var9;
               }

               return var11;
            } else {
               return vertexConsumer;
            }
         } else {
            return vertexConsumer;
         }
      } else {
         return vertexConsumer;
      }
   }

   public void O00000000(
      FeatureRenderer featureRenderer,
      MatrixStack matrixStack,
      VertexConsumerProvider vertexConsumerProvider,
      int i,
      LivingEntityRenderState livingEntityRenderState,
      float f,
      float g
   ) {
      LivingEntity var8 = this.O000000000(livingEntityRenderState);
      if (this.O000000000() && this.O0000000000O0O && !this.O0000000000O0 && !this.O0000000000O00 && !O0000O00OO00O.O000000000() && var8 != null) {
         VertexConsumerProvider var9 = renderLayer -> this.O00000000(vertexConsumerProvider.getBuffer(renderLayer), renderLayer, livingEntityRenderState);
         featureRenderer.render(matrixStack, var9, i, livingEntityRenderState, f, g);
      } else {
         featureRenderer.render(matrixStack, vertexConsumerProvider, i, livingEntityRenderState, f, g);
      }
   }

   public void O00000000(LivingEntityRenderState livingEntityRenderState) {
      if (!this.O0000000000O00) {
         if (O0000O00OO00O.O000000000()) {
            this.O000000000O0 = Integer.MIN_VALUE;
         } else {
            LivingEntity var2 = this.O000000000(livingEntityRenderState);
            if (var2 != null && this.O000000000O0 == var2.getId()) {
               O0000O00OO000.W374 var3 = this.O000000000O000;
               this.O000000000O0 = Integer.MIN_VALUE;
               if (var3 != null) {
                  try {
                     this.O00000000(var3);
                     this.O0000000000OOO++;
                     this.O00000000000OO = true;
                  } catch (RuntimeException var5) {
                     O000000000.warn("Failed to finish living capture for {}", var2.getName().getString(), var5);
                     this.O00000000000OO = false;
                  }
               }
            }
         }
      }
   }

   public int O0000000000O00() {
      return this.O0000000000OOO;
   }

   public int O0000000000O0O() {
      return this.O000000000O;
   }

   public int O0000000000OO() {
      return this.O000000000O0O.size();
   }

   public int O0000000000OO0() {
      return this.O0000000000OO;
   }

   public int O0000000000OOO() {
      return this.O0000000000OO0;
   }

   public void O00000000(RenderManager o0000O00OO0O0, int i, int j) {
      if (o0000O00OO0O0 != null && i > 0 && j > 0) {
         if (this.O0000000000()) {
            int var4 = O00000000000(this.O000000000000);
            if (var4 > 0) {
               o0000O00OO0O0.O000000000(var4, 0.0F, 0.0F, (float)i, (float)j);
            }
         }
      }
   }

   public void O00000000(int i, int j) {
      this.O000000000O00O();
      this.O00000000000OO = false;
      if (i <= 0 || j <= 0 || i != this.O0000000000OO || j != this.O0000000000OO0) {
         this.O000000000O00();
         this.O000000000O0();
         this.O0000000000OO = -1;
         this.O0000000000OO0 = -1;
      }
   }

   private boolean O0000000000(int i, int j) {
      if (i > 0 && j > 0) {
         SimpleFramebuffer var3 = this.O000000000000;
         if (var3 != null && !O0000000000(var3)) {
            this.O000000000O00();
            this.O0000000000OO = -1;
            this.O0000000000OO0 = -1;
            var3 = null;
         }

         if (var3 == null) {
            try {
               var3 = new SimpleFramebuffer("night_entity_capture", i, j, true);
               this.O000000000000 = var3;
               this.O0000000000OO = i;
               this.O0000000000OO0 = j;
            } catch (RuntimeException var6) {
               O000000000.warn("Failed to create capture framebuffer {}x{}", i, j, var6);
               this.O000000000000 = null;
               this.O0000000000OO = -1;
               this.O0000000000OO0 = -1;
               return false;
            }
         }

         if (this.O0000000000OO != i || this.O0000000000OO0 != j) {
            try {
               var3.resize(i, j);
               this.O0000000000OO = i;
               this.O0000000000OO0 = j;
            } catch (RuntimeException var5) {
               O000000000.warn("Failed to resize capture framebuffer to {}x{}", i, j, var5);
               this.O000000000O00();
               this.O0000000000OO = -1;
               this.O0000000000OO0 = -1;
               return false;
            }
         }

         return O0000000000(var3);
      } else {
         this.O000000000O00();
         this.O0000000000OO = -1;
         this.O0000000000OO0 = -1;
         return false;
      }
   }

   private boolean O00000000000(int i, int j) {
      if (i > 0 && j > 0) {
         SimpleFramebuffer var3 = this.O0000000000000;
         if (var3 != null && !O0000000000(var3)) {
            this.O000000000O0();
            var3 = null;
         }

         if (var3 == null) {
            try {
               var3 = new SimpleFramebuffer("wild_tagged_capture", i, j, true);
               this.O0000000000000 = var3;
            } catch (RuntimeException var6) {
               O000000000.warn("Failed to create tagged capture framebuffer {}x{}", i, j, var6);
               this.O0000000000000 = null;
               return false;
            }
         }

         if (var3.textureWidth != i || var3.textureHeight != j) {
            try {
               var3.resize(i, j);
            } catch (RuntimeException var5) {
               O000000000.warn("Failed to resize tagged capture framebuffer to {}x{}", i, j, var5);
               this.O000000000O0();
               return false;
            }
         }

         return O0000000000(var3);
      } else {
         this.O000000000O0();
         return false;
      }
   }

   private void O000000000O0() {
      SimpleFramebuffer var1 = this.O0000000000000;
      if (var1 != null) {
         if (!RenderSystem.isOnRenderThread()) {
            this.O0000000000000 = null;
         } else {
            try {
               var1.delete();
            } catch (RuntimeException var3) {
               O000000000.warn("Failed to delete tagged capture framebuffer", var3);
            }

            this.O0000000000000 = null;
         }
      }
   }

   private void O000000000O00() {
      SimpleFramebuffer var1 = this.O000000000000;
      if (var1 != null || this.O000000000O00 != 0) {
         if (!RenderSystem.isOnRenderThread()) {
            this.O000000000000 = null;
            this.O000000000O00 = 0;
         } else {
            if (var1 != null) {
               try {
                  var1.delete();
               } catch (RuntimeException var3) {
                  O000000000.warn("Failed to delete capture framebuffer", var3);
               }

               this.O000000000000 = null;
            }

            if (this.O000000000O00 != 0) {
               GL30.glDeleteFramebuffers(this.O000000000O00);
               this.O000000000O00 = 0;
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean O00000000(Framebuffer framebuffer) {
      if (framebuffer.getColorAttachment() instanceof GlTexture var2) {
         int var19 = var2.getGlId();
         int var4 = framebuffer.getDepthAttachment() instanceof GlTexture var5 ? var5.getGlId() : 0;
         if (var19 <= 0) {
            return false;
         } else {
            O0000O00O0OOO0.W373 var20 = O0000O00O0OOO0.O00000000();
            boolean var14 = false /* VF: Semaphore variable */;

            boolean var7;
            label159: {
               label160: {
                  boolean var24;
                  try {
                     label146: {
                        MemoryStack var21;
                        label161: {
                           var14 = true;
                           var21 = MemoryStack.stackPush();

                           try {
                              if (this.O000000000O00 == 0) {
                                 this.O000000000O00 = GL30.glGenFramebuffers();
                              }

                              GL30.glBindFramebuffer(36160, this.O000000000O00);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, var19, 0);
                              GL30.glFramebufferTexture2D(36160, 36096, 3553, var4, 0);
                              GL11.glDrawBuffer(36064);
                              if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                 var7 = false;
                                 break label161;
                              }

                              GL11.glColorMask(true, true, true, true);
                              GL11.glDepthMask(true);
                              FloatBuffer var22 = var21.floats(0.0F, 0.0F, 0.0F, 0.0F);
                              GL30.glClearBufferfv(6144, 0, var22);
                              if (var4 > 0) {
                                 FloatBuffer var8 = var21.floats(1.0F);
                                 GL30.glClearBufferfv(6145, 0, var8);
                              }

                              var24 = true;
                           } catch (Throwable var16) {
                              if (var21 != null) {
                                 try {
                                    var21.close();
                                 } catch (Throwable var15) {
                                    var16.addSuppressed(var15);
                                 }
                              }

                              throw var16;
                           }

                           if (var21 != null) {
                              var21.close();
                              var14 = false;
                           } else {
                              var14 = false;
                           }
                           break label146;
                        }

                        if (var21 != null) {
                           var21.close();
                           var14 = false;
                        } else {
                           var14 = false;
                        }
                        break label160;
                     }
                  } catch (RuntimeException var17) {
                     O000000000.warn("Failed to clear capture framebuffer directly", var17);
                     var7 = false;
                     var14 = false;
                     break label159;
                  } finally {
                     if (var14) {
                        if (this.O000000000O00 != 0) {
                           GL30.glBindFramebuffer(36160, this.O000000000O00);
                           GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           GL30.glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
                        }

                        O0000O00O0OOO0.O00000000(var20);
                     }
                  }

                  if (this.O000000000O00 != 0) {
                     GL30.glBindFramebuffer(36160, this.O000000000O00);
                     GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                     GL30.glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
                  }

                  O0000O00O0OOO0.O00000000(var20);
                  return var24;
               }

               if (this.O000000000O00 != 0) {
                  GL30.glBindFramebuffer(36160, this.O000000000O00);
                  GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                  GL30.glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
               }

               O0000O00O0OOO0.O00000000(var20);
               return var7;
            }

            if (this.O000000000O00 != 0) {
               GL30.glBindFramebuffer(36160, this.O000000000O00);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
               GL30.glFramebufferTexture2D(36160, 36096, 3553, 0, 0);
            }

            O0000O00O0OOO0.O00000000(var20);
            return var7;
         }
      } else {
         return false;
      }
   }

   private boolean O000000000(Entity entity) {
      if (this.O00000000000O0) {
         return true;
      } else {
         for (Predicate var3 : this.O000000000000O.values()) {
            try {
               if (var3.test(entity)) {
                  return true;
               }
            } catch (RuntimeException var5) {
               O000000000.warn("Entity capture filter failed for {}", entity.getName().getString(), var5);
            }
         }

         return false;
      }
   }

   private LivingEntity O000000000(LivingEntityRenderState livingEntityRenderState) {
      if (livingEntityRenderState == null) {
         return null;
      } else {
         int var2 = ((O0000O00OO000O)livingEntityRenderState).wild$getEntityId();
         MinecraftClient var3 = MinecraftClient.getInstance();
         return (var3 != null && var3.world != null && var2 != Integer.MIN_VALUE ? var3.world.getEntityById(var2) : null) instanceof LivingEntity var5
               && this.O000000000(var5)
            ? var5
            : null;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(O0000O00OO000.W374 o00000000) {
      SimpleFramebuffer var2 = this.O000000000000;
      if (o00000000 != null && var2 != null) {
         GpuTextureView var3 = var2.getColorAttachmentView();
         if (var3 != null && !var3.isClosed()) {
            GpuTextureView var4 = RenderSystem.outputColorTextureOverride;
            GpuTextureView var5 = RenderSystem.outputDepthTextureOverride;
            RenderSystem.outputColorTextureOverride = var3;
            RenderSystem.outputDepthTextureOverride = var2.getDepthAttachmentView();
            this.O0000000000O0 = true;
            boolean var8 = false /* VF: Semaphore variable */;

            try {
               var8 = true;
               o00000000.O0000000000();
               var8 = false;
            } finally {
               if (var8) {
                  this.O0000000000O0 = false;
                  RenderSystem.outputColorTextureOverride = var4;
                  RenderSystem.outputDepthTextureOverride = var5;
               }
            }

            this.O0000000000O0 = false;
            RenderSystem.outputColorTextureOverride = var4;
            RenderSystem.outputDepthTextureOverride = var5;
         }
      }
   }

   private void O000000000O000() {
      if (!this.O000000000()) {
         this.O00000000000OO = false;
         this.O0000000000O = false;
         this.O0000000000O0 = false;
         this.O0000000000O00 = false;
         this.O0000000000O0O = false;
         this.O0000000000OO = -1;
         this.O0000000000OO0 = -1;
         this.O0000000000OOO = 0;
         this.O000000000O = 0;
         this.O000000000O0 = Integer.MIN_VALUE;
         this.O000000000O0O();
         this.O000000000O0O0();
         this.O000000000O00();
         this.O000000000O0();
      }
   }

   private void O000000000O00O() {
      this.O00000000000OO = false;
      this.O0000000000O = false;
      this.O0000000000O0O = false;
      this.O0000000000OOO = 0;
      this.O000000000O0 = Integer.MIN_VALUE;
      this.O000000000O0O();
   }

   private void O000000000O0O() {
      O0000O00OO000.W374 var1 = this.O000000000O000;
      if (var1 != null) {
         try {
            try {
               var1.O0000000000();
            } catch (RuntimeException var3) {
               O000000000.warn("Failed to flush capture resources during reset", var3);
            }

            var1.close();
         } catch (RuntimeException var4) {
            O000000000.warn("Failed to release capture resources", var4);
         }

         this.O000000000O000 = null;
      }
   }

   private void O000000000O0O0() {
      for (BufferAllocator var2 : this.O000000000O0O.values()) {
         try {
            var2.close();
         } catch (RuntimeException var4) {
            O000000000.warn("Failed to close capture layer allocator", var4);
         }
      }

      this.O000000000O0O.clear();
   }

   private static boolean O000000000(Framebuffer framebuffer) {
      if (framebuffer == null) {
         return false;
      } else {
         return framebuffer.getColorAttachment() instanceof GlTexture var2 ? var2.getGlId() > 0 : false;
      }
   }

   private static boolean O0000000000(Framebuffer framebuffer) {
      if (!O000000000(framebuffer)) {
         return false;
      } else if (!(framebuffer instanceof SimpleFramebuffer var1)) {
         return true;
      } else {
         GpuTextureView var2 = var1.getColorAttachmentView();
         if (var2 != null && !var2.isClosed()) {
            GpuTextureView var3 = var1.getDepthAttachmentView();
            return var3 == null || !var3.isClosed();
         } else {
            return false;
         }
      }
   }

   private static int O00000000000(Framebuffer framebuffer) {
      if (framebuffer == null) {
         return 0;
      } else {
         return framebuffer.getColorAttachment() instanceof GlTexture var1 ? var1.getGlId() : 0;
      }
   }

   private static int O000000000000(Framebuffer framebuffer) {
      if (framebuffer == null) {
         return 0;
      } else {
         return framebuffer.getDepthAttachment() instanceof GlTexture var1 ? var1.getGlId() : 0;
      }
   }

   static final class W374 implements AutoCloseable {
      private final BufferAllocator O00000000;
      private final SequencedMap<RenderLayer, BufferAllocator> O000000000;
      private final Immediate O0000000000;
      private final VertexConsumerProvider O00000000000;
      private boolean O000000000000;

      W374(BufferAllocator bufferAllocator, SequencedMap<RenderLayer, BufferAllocator> sequencedMap) {
         this.O00000000 = bufferAllocator;
         this.O000000000 = sequencedMap;
         this.O0000000000 = VertexConsumerProvider.immediate(sequencedMap, bufferAllocator);
         this.O00000000000 = this::O00000000;
      }

      VertexConsumerProvider O00000000() {
         return this.O00000000000;
      }

      VertexConsumer O00000000(RenderLayer renderLayer) {
         this.O000000000
            .computeIfAbsent(renderLayer, renderLayerx -> new BufferAllocator(Math.max(4096, Math.min(renderLayerx.getExpectedBufferSize(), 262144))));
         this.O000000000000 = false;
         return this.O0000000000.getBuffer(renderLayer);
      }

      MatrixStack O00000000(MatrixStack matrixStack) {
         if (matrixStack == null) {
            return null;
         } else {
            MatrixStack var2 = new MatrixStack();
            Entry var3 = matrixStack.peek();
            Entry var4 = var2.peek();
            var4.getPositionMatrix().set(var3.getPositionMatrix());
            var4.getNormalMatrix().set(var3.getNormalMatrix());
            return var2;
         }
      }

      void O000000000() {
         this.O000000000000 = false;
      }

      void O0000000000() {
         if (!this.O000000000000) {
            this.O0000000000.draw();
            this.O00000000.clear();
            this.O000000000.values().forEach(BufferAllocator::clear);
            this.O000000000000 = true;
         }
      }

      @Override
      public void close() {
         this.O00000000.clear();
         this.O000000000.values().forEach(BufferAllocator::clear);
      }
   }
}
