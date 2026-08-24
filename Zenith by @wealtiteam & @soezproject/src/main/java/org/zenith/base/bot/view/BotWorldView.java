package org.zenith.base.bot.view;

import org.zenith.module.Bot;
import org.zenith.rotation.Rotation;

import org.zenith.base.bot.client.BotClient;
import org.zenith.base.bot.net.BotPlayHandler;
import org.zenith.base.bot.world.BotPlayer;
import org.zenith.base.bot.world.BotWorld;
import org.zenith.base.bot.world.BotWorld_RenderListener;
import org.zenith.utility.mixin.accessors.MinecraftClientAccessor;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;














import com.mojang.blaze3d.systems.ProjectionType;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.gl.GlUsage;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.gl.VertexBuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.FogShape;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.block.entity.BlockEntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkSectionPos;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Quaternionf;

public final class BotWorldView implements BotWorld_RenderListener {
   public static final int RENDER_DISTANCE_CHUNKS = 5;
   public static final int VERTICAL_SECTION_RADIUS = 5;
   public static final int MAX_BUILDS_PER_FRAME = 8;
   public static final int MAX_PENDING_BUILDS = 32;
   public static final double ENTITY_RENDER_DISTANCE_SQ = 9216.0;
   public static final double BLOCK_ENTITY_RENDER_DISTANCE_SQ = 2304.0;
   public static final float FOV_DEGREES = 100.0F;
   public static final float HAND_FOV_DEGREES = 70.0F;
   public final BotClient client;
   public final Map<Long, BotWorldView_Section> sections = new HashMap<>();
   public final Set<Long> dirty = ConcurrentHashMap.newKeySet();
   public final Queue<BotSectionMesher_MeshResult> uploads = new ConcurrentLinkedQueue<>();
   public final AtomicInteger pendingBuilds = new AtomicInteger();
   public final AtomicBoolean entitySnapshotScheduled = new AtomicBoolean();
   public volatile List<Entity> entitySnapshot = List.of();
   public final Camera camera = new Camera();
   public final BotLightmap lightmap = new BotLightmap();
   public final BotPlayerRenderer playerRenderer = new BotPlayerRenderer();
   public final BotHeldItemRenderer heldItem = new BotHeldItemRenderer();
   public final Matrix4f projection = new Matrix4f();
   public final Matrix4f handProjection = new Matrix4f();
   public final Matrix4f positionMatrix = new Matrix4f();
   public final Quaternionf rotationConjugate = new Quaternionf();
   public SimpleFramebuffer fbo;
   public BotWorld boundWorld;
   public boolean loggedRenderError;
   public volatile String lastError;
   public int lastEyeHeightAge = Integer.MIN_VALUE;
   public static MinecraftClient minecraftClient3 = MinecraftClient.getInstance();

   public boolean renderToFbo(int var1, int var2) {
      BotWorld botworld = this.client.getWorld();
      BotPlayer botplayer = this.client.getPlayer();
      if (botworld != null && botplayer != null && this.client.isJoined() && var1 > 0 && var2 > 0) {
         this.bindWorld(botworld);
         this.drainUploads();
         this.refreshSections(botworld, botplayer);
         this.scheduleBuilds(botworld, botplayer);
         this.scheduleEntitySnapshot(botworld);
         this.ensureFbo(var1, var2);
         if (this.fbo == null) {
            return false;
         } else {
            Fog fog = RenderSystem.getShaderFog();
            Matrix4fStack matrix4fstack = RenderSystem.getModelViewStack();
            RenderSystem.backupProjectionMatrix();
            matrix4fstack.pushMatrix();
            matrix4fstack.identity();
            int i = minecraftClient3.getWindow().getFramebufferWidth();
            int j = minecraftClient3.getWindow().getFramebufferHeight();
            Framebuffer framebuffer = minecraftClient3.getFramebuffer();
            synchronized (this.client.getRenderStateLock()) {
               float f = this.client.getTickDelta();
               this.updateCamera(botworld, botplayer, f);
               this.lightmap.update(botworld);

               try {
                  ((MinecraftClientAccessor)minecraftClient3).zenith_setFramebuffer(this.fbo);
                  float f1 = (float)var1 / (float)var2;
                  float f2 = 128.0F;
                  this.projection.identity().perspective((float) (Math.PI * 5.0 / 9.0), f1, 0.05F, f2);
                  this.positionMatrix.rotation(this.camera.getRotation().conjugate(this.rotationConjugate));
                  RenderSystem.setProjectionMatrix(this.projection, ProjectionType.PERSPECTIVE);
                  float[] afloat = skyColor(botworld, botplayer);
                  RenderSystem.setShaderFog(new Fog(f2 * 0.55F, f2 * 0.95F, FogShape.CYLINDER, afloat[0], afloat[1], afloat[2], 1.0F));
                  this.fbo.setClearColor(afloat[0], afloat[1], afloat[2], 1.0F);
                  this.fbo.clear();
                  this.fbo.beginWrite(true);
                  RenderSystem.viewport(0, 0, var1, var2);
                  Vec3d vec3d = this.camera.getPos();
                  this.drawTerrainLayer(RenderLayer.getSolid(), vec3d, false);
                  this.drawTerrainLayer(RenderLayer.getCutoutMipped(), vec3d, false);
                  this.drawTerrainLayer(RenderLayer.getCutout(), vec3d, false);
                  this.renderEntities(botworld, botplayer, vec3d, f);
                  this.renderBlockEntities(botworld, vec3d, f);
                  this.drawTerrainLayer(RenderLayer.getTranslucent(), vec3d, true);
                  this.drawTerrainLayer(RenderLayer.getTripwire(), vec3d, true);
                  this.renderHand(botworld, botplayer, f, f1, f2);
               } catch (Throwable throwable) {
                  this.lastError = throwable.toString();
                  if (!this.loggedRenderError) {
                     this.loggedRenderError = true;
                     System.err.println("[BotWorldView] render failed:");
                     throwable.printStackTrace();
                  }
               } finally {
                  ((MinecraftClientAccessor)minecraftClient3).zenith_setFramebuffer(framebuffer);
                  RenderSystem.restoreProjectionMatrix();
                  RenderSystem.setShaderFog(fog);
                  matrix4fstack.popMatrix();
                  this.restoreDispatchers();
                  framebuffer.beginWrite(true);
                  RenderSystem.viewport(0, 0, i, j);
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   public void refreshSections(BotWorld var1, BotPlayer var2) {
      int i = ChunkSectionPos.getSectionCoord(MathHelper.floor(var2.getX()));
      int j = ChunkSectionPos.getSectionCoord(MathHelper.floor(var2.getEyeY()));
      int k = ChunkSectionPos.getSectionCoord(MathHelper.floor(var2.getZ()));
      int l = ChunkSectionPos.getSectionCoord(var1.getBottomY());
      int i1 = ChunkSectionPos.getSectionCoord(var1.getTopYInclusive());
      this.sections
         .entrySet()
         .removeIf(
            var3x -> {
               long l2 = var3x.getKey();
               boolean flag = Math.abs(ChunkSectionPos.unpackX(l2) - i) > 5
                  || Math.abs(ChunkSectionPos.unpackZ(l2) - k) > 5
                  || Math.abs(ChunkSectionPos.unpackY(l2) - j) > 5;
               if (flag) {
                  var3x.getValue().closeBuffers();
               }

               return flag;
            }
         );

      for (int j1 = i - 5; j1 <= i + 5; j1++) {
         for (int k1 = k - 5; k1 <= k + 5; k1++) {
            int l1 = Math.max(j - 5, l);
            int i2 = Math.min(j + 5, i1);

            for (int j2 = l1; j2 <= i2; j2++) {
               long k2 = ChunkSectionPos.asLong(j1, j2, k1);
               if (!this.sections.containsKey(k2)) {
                  this.sections.put(k2, new BotWorldView_Section(k2));
                  this.dirty.add(k2);
               }
            }
         }
      }
   }

   public void scheduleBuilds(BotWorld var1, BotPlayer var2) {
      if (!this.dirty.isEmpty() && this.pendingBuilds.get() < 32) {
         List<BotWorldView_Section> arraylist = new ArrayList<>();

         for (Long olong : this.dirty) {
            BotWorldView_Section botworldview_section = this.sections.get(olong);
            if (botworldview_section == null) {
               this.dirty.remove(olong);
            } else if (!botworldview_section.building) {
               arraylist.add(botworldview_section);
            }
         }

         if (!arraylist.isEmpty()) {
            double d1 = var2.getX();
            double d2 = var2.getY();
            double d0 = var2.getZ();
            arraylist.sort((var6x, var7) -> Double.compare(var6x.squaredDistanceTo(d1, d2, d0), var7.squaredDistanceTo(d1, d2, d0)));
            int i = 0;

            for (BotWorldView_Section botworldview_section1 : arraylist) {
               if (i >= 8 || this.pendingBuilds.get() >= 32) {
                  break;
               }

               long j = botworldview_section1.pos;
               if (this.dirty.remove(j)) {
                  botworldview_section1.building = true;
                  this.pendingBuilds.incrementAndGet();
                  i++;
                  this.client.execute(() -> {
                     try {
                        this.uploads.add(BotSectionMesher.build(var1, j));
                     } catch (Throwable throwable) {
                        this.lastError = "mesh: " + throwable;
                        this.uploads.add(new BotSectionMesher_MeshResult(j, List.of(), List.of(), true));
                        this.dirty.add(j);
                     } finally {
                        this.pendingBuilds.decrementAndGet();
                     }
                  });
               }
            }
         }
      }
   }

   public void drawTerrainLayer(RenderLayer var1, Vec3d var2, boolean var3) {
      List<BotWorldView_Section> arraylist = null;

      for (BotWorldView_Section botworldview_section : this.sections.values()) {
         if (botworldview_section.buffers.containsKey(var1)) {
            if (arraylist == null) {
               arraylist = new ArrayList<>();
            }

            arraylist.add(botworldview_section);
         }
      }

      if (arraylist != null) {
         double d2 = var2.x;
         double d0 = var2.y;
         double d1 = var2.z;
         arraylist.sort((var6x, var7x) -> Double.compare(var6x.squaredDistanceTo(d2, d0, d1), var7x.squaredDistanceTo(d2, d0, d1)));
         if (var3) {
            Collections.reverse(arraylist);
         }

         var1.startDrawing();
         this.fbo.beginWrite(false);
         RenderSystem.setShaderTexture(2, this.lightmap.getGlId());
         ShaderProgram shaderprogram = RenderSystem.getShader();
         if (shaderprogram == null) {
            var1.endDrawing();
         } else {
            shaderprogram.initializeUniforms(DrawMode.QUADS, this.positionMatrix, this.projection, minecraftClient3.getWindow());
            shaderprogram.bind();
            GlUniform gluniform = shaderprogram.modelOffset;

            for (BotWorldView_Section botworldview_section1 : arraylist) {
               VertexBuffer vertexbuffer = botworldview_section1.buffers.get(var1);
               if (gluniform != null) {
                  gluniform.set(
                     (float)((double)botworldview_section1.originX() - d2),
                     (float)((double)botworldview_section1.originY() - d0),
                     (float)((double)botworldview_section1.originZ() - d1)
                  );
                  gluniform.upload();
               }

               vertexbuffer.bind();
               vertexbuffer.draw();
            }

            if (gluniform != null) {
               gluniform.set(0.0F, 0.0F, 0.0F);
            }

            shaderprogram.unbind();
            VertexBuffer.unbind();
            var1.endDrawing();
            this.fbo.beginWrite(false);
         }
      }
   }

   public void renderEntities(BotWorld var1, BotPlayer var2, Vec3d var3, float var4) {
      EntityRenderDispatcher entityrenderdispatcher = minecraftClient3.getEntityRenderDispatcher();
      entityrenderdispatcher.configure(var1, this.camera, null);
      Immediate immediate = minecraftClient3.getBufferBuilders().getEntityVertexConsumers();
      BotPlayHandler botplayhandler = this.client.getPlayHandler();
      boolean flag = minecraftClient3.player == null;

      for (Entity entity : this.entitySnapshot) {
         if (entity != var2 && !entity.isRemoved() && entity.getWorld() == var1 && !(entity.squaredDistanceTo(var3) > 9216.0)) {
            try {
               MatrixStack matrixstack = new MatrixStack();
               matrixstack.multiplyPositionMatrix(this.positionMatrix);
               if (entity instanceof PlayerEntity playerentity) {
                  int i = WorldRenderer.getLightmapCoordinates(var1, playerentity.getBlockPos());
                  this.playerRenderer.render(playerentity, botplayhandler, var3.x, var3.y, var3.z, var4, matrixstack, immediate, i, true);
               } else if (!flag || !(entity instanceof LivingEntity)) {
                  double d0 = MathHelper.lerp((double)var4, entity.lastRenderX, entity.getX());
                  double d1 = MathHelper.lerp((double)var4, entity.lastRenderY, entity.getY());
                  double d2 = MathHelper.lerp((double)var4, entity.lastRenderZ, entity.getZ());
                  entityrenderdispatcher.render(
                     entity, d0 - var3.x, d1 - var3.y, d2 - var3.z, var4, matrixstack, immediate, entityrenderdispatcher.getLight(entity, var4)
                  );
               }
            } catch (Throwable throwable) {
               this.lastError = "entity: " + throwable;
               if (!this.loggedRenderError) {
                  this.loggedRenderError = true;
                  System.err.println("[BotWorldView] entity render failed for " + entity.getType() + ":");
                  throwable.printStackTrace();
               }
            }
         }
      }

      immediate.draw();
      this.fbo.beginWrite(false);
   }

   public void renderBlockEntities(BotWorld var1, Vec3d var2, float var3) {
      BlockEntityRenderDispatcher blockentityrenderdispatcher = minecraftClient3.getBlockEntityRenderDispatcher();
      blockentityrenderdispatcher.configure(var1, this.camera, null);
      Immediate immediate = minecraftClient3.getBufferBuilders().getEntityVertexConsumers();

      for (BotWorldView_Section botworldview_section : this.sections.values()) {
         for (BlockEntity blockentity : botworldview_section.blockEntities) {
            if (!blockentity.isRemoved() && blockentity.getWorld() == var1) {
               BlockPos blockpos = blockentity.getPos();
               if (!(blockpos.getSquaredDistance(var2) > 2304.0)) {
                  try {
                     MatrixStack matrixstack = new MatrixStack();
                     matrixstack.multiplyPositionMatrix(this.positionMatrix);
                     matrixstack.push();
                     matrixstack.translate((double)blockpos.getX() - var2.x, (double)blockpos.getY() - var2.y, (double)blockpos.getZ() - var2.z);
                     blockentityrenderdispatcher.render(blockentity, var3, matrixstack, immediate);
                     matrixstack.pop();
                  } catch (Throwable throwable) {
                  }
               }
            }
         }
      }

      immediate.draw();
      this.fbo.beginWrite(false);
   }

   public BotWorldView(BotClient var1) {
      this.client = var1;
   }

   public int getColorAttachment() {
      return this.fbo != null ? this.fbo.getColorAttachment() : -1;
   }

   public void updateCamera(BotWorld var1, BotPlayer var2, float var3) {
      boolean flag = this.camera.getFocusedEntity() != var2;
      if (!flag && var2.age != this.lastEyeHeightAge) {
         this.camera.updateEyeHeight();
         this.heldItem.tick(var2);
      }

      this.lastEyeHeightAge = var2.age;
      this.camera.update(var1, var2, false, false, var3);
      if (flag) {
         for (int i = 0; i < 24; i++) {
            this.camera.updateEyeHeight();
         }

         this.camera.update(var1, var2, false, false, var3);
         this.heldItem.snap(var2);
      }
   }

   public String getDebugStatus() {
      int i = 0;

      for (BotWorldView_Section botworldview_section : this.sections.values()) {
         if (!botworldview_section.buffers.isEmpty()) {
            i++;
         }
      }

      StringBuilder stringbuilder = new StringBuilder("mesh ")
         .append(i)
         .append('/')
         .append(this.sections.size())
         .append(" | dirty ")
         .append(this.dirty.size())
         .append(" | pending ")
         .append(this.pendingBuilds.get());
      String s = this.lastError;
      if (s != null) {
         stringbuilder.append(" | err: ").append(s);
      }

      return stringbuilder.toString();
   }

   public void close() {
      for (BotWorldView_Section botworldview_section : this.sections.values()) {
         botworldview_section.closeBuffers();
      }

      this.sections.clear();
      this.dirty.clear();
      this.drainUploadsDiscarding();
      if (this.fbo != null) {
         this.fbo.delete();
         this.fbo = null;
      }

      this.lightmap.close();
      if (this.boundWorld != null) {
         this.boundWorld.setRenderListener(null);
         this.boundWorld = null;
      }
   }

   @Override
   public void onBlockChanged(BlockPos var1) {
      int i = ChunkSectionPos.getSectionCoord(var1.getX() - 1);
      int j = ChunkSectionPos.getSectionCoord(var1.getX() + 1);
      int k = ChunkSectionPos.getSectionCoord(var1.getY() - 1);
      int l = ChunkSectionPos.getSectionCoord(var1.getY() + 1);
      int i1 = ChunkSectionPos.getSectionCoord(var1.getZ() - 1);
      int j1 = ChunkSectionPos.getSectionCoord(var1.getZ() + 1);

      for (int k1 = i; k1 <= j; k1++) {
         for (int l1 = k; l1 <= l; l1++) {
            for (int i2 = i1; i2 <= j1; i2++) {
               this.dirty.add(ChunkSectionPos.asLong(k1, l1, i2));
            }
         }
      }
   }

   @Override
   public void onChunkChanged(int var1, int var2) {
      BotWorld botworld = this.client.getWorld();
      if (botworld != null) {
         int i = ChunkSectionPos.getSectionCoord(botworld.getBottomY());
         int j = ChunkSectionPos.getSectionCoord(botworld.getTopYInclusive());

         for (int k = i; k <= j; k++) {
            this.dirty.add(ChunkSectionPos.asLong(var1, k, var2));
            this.dirty.add(ChunkSectionPos.asLong(var1 - 1, k, var2));
            this.dirty.add(ChunkSectionPos.asLong(var1 + 1, k, var2));
            this.dirty.add(ChunkSectionPos.asLong(var1, k, var2 - 1));
            this.dirty.add(ChunkSectionPos.asLong(var1, k, var2 + 1));
         }
      }
   }

   @Override
   public void onSectionChanged(int var1, int var2, int var3) {
      this.dirty.add(ChunkSectionPos.asLong(var1, var2, var3));
      this.dirty.add(ChunkSectionPos.asLong(var1 - 1, var2, var3));
      this.dirty.add(ChunkSectionPos.asLong(var1 + 1, var2, var3));
      this.dirty.add(ChunkSectionPos.asLong(var1, var2 - 1, var3));
      this.dirty.add(ChunkSectionPos.asLong(var1, var2 + 1, var3));
      this.dirty.add(ChunkSectionPos.asLong(var1, var2, var3 - 1));
      this.dirty.add(ChunkSectionPos.asLong(var1, var2, var3 + 1));
   }

   public void bindWorld(BotWorld var1) {
      if (this.boundWorld != var1) {
         if (this.boundWorld != null) {
            this.boundWorld.setRenderListener(null);
         }

         for (BotWorldView_Section botworldview_section : this.sections.values()) {
            botworldview_section.closeBuffers();
         }

         this.sections.clear();
         this.dirty.clear();
         this.drainUploadsDiscarding();
         this.boundWorld = var1;
         var1.setRenderListener(this);
      }
   }

   public void drainUploads() {
      BotSectionMesher_MeshResult botsectionmesher_meshresult;
      while ((botsectionmesher_meshresult = this.uploads.poll()) != null) {
         BotWorldView_Section botworldview_section = this.sections.get(botsectionmesher_meshresult.sectionPos());
         if (botworldview_section == null) {
            discardResult(botsectionmesher_meshresult);
         } else {
            botworldview_section.building = false;
            botworldview_section.closeBuffers();
            botworldview_section.blockEntities = botsectionmesher_meshresult.blockEntities();

            for (BotSectionMesher_LayerMesh botsectionmesher_layermesh : botsectionmesher_meshresult.layers()) {
               VertexBuffer vertexbuffer = new VertexBuffer(GlUsage.STATIC_WRITE);
               vertexbuffer.bind();
               vertexbuffer.upload(botsectionmesher_layermesh.buffer());
               botsectionmesher_layermesh.allocator().close();
               botworldview_section.buffers.put(botsectionmesher_layermesh.layer(), vertexbuffer);
            }

            VertexBuffer.unbind();
         }
      }
   }

   public void drainUploadsDiscarding() {
      BotSectionMesher_MeshResult botsectionmesher_meshresult;
      while ((botsectionmesher_meshresult = this.uploads.poll()) != null) {
         discardResult(botsectionmesher_meshresult);
      }
   }

   public static void discardResult(BotSectionMesher_MeshResult var0) {
      for (BotSectionMesher_LayerMesh botsectionmesher_layermesh : var0.layers()) {
         botsectionmesher_layermesh.buffer().close();
         botsectionmesher_layermesh.allocator().close();
      }
   }

   public void scheduleEntitySnapshot(BotWorld var1) {
      if (this.entitySnapshotScheduled.compareAndSet(false, true)) {
         this.client.execute(() -> {
            try {
               var arraylist = new ArrayList();

               for (Entity entity : var1.getEntities()) {
                  arraylist.add(entity);
               }

               this.entitySnapshot = arraylist;
            } catch (Throwable throwable) {
            } finally {
               this.entitySnapshotScheduled.set(false);
            }
         });
      }
   }

   public void ensureFbo(int var1, int var2) {
      if (this.fbo == null || this.fbo.textureWidth != var1 || this.fbo.textureHeight != var2) {
         if (this.fbo != null) {
            this.fbo.delete();
         }

         this.fbo = new SimpleFramebuffer(var1, var2, true);
      }
   }

   public void renderHand(BotWorld var1, BotPlayer var2, float var3, float var4, float var5) {
      RenderSystem.clear(256);
      this.handProjection.identity().perspective(1.2217305F, var4, 0.05F, var5);
      RenderSystem.setProjectionMatrix(this.handProjection, ProjectionType.PERSPECTIVE);
      RenderSystem.setShaderTexture(2, this.lightmap.getGlId());
      Immediate immediate = minecraftClient3.getBufferBuilders().getEntityVertexConsumers();
      MatrixStack matrixstack = new MatrixStack();
      int i = WorldRenderer.getLightmapCoordinates(var1, BlockPos.ofFloored(var2.getEyePos()));
      this.heldItem.render(var2, this.client.getPlayHandler(), var3, matrixstack, immediate, i);
      this.fbo.beginWrite(false);
   }

   public void restoreDispatchers() {
      if (minecraftClient3.world != null) {
         Camera camerax = minecraftClient3.gameRenderer.getCamera();
         minecraftClient3.getEntityRenderDispatcher()
            .configure(minecraftClient3.world, camerax, minecraftClient3.targetedEntity);
         minecraftClient3.getBlockEntityRenderDispatcher()
            .configure(minecraftClient3.world, camerax, minecraftClient3.crosshairTarget);
      }
   }

   public static float[] skyColor(BotWorld var0, BotPlayer var1) {
      float f = BotLightmap.getSkyBrightness(var0);

      int i;
      try {
         i = var0.getBiome(var1.getBlockPos()).value().getSkyColor();
      } catch (Exception exception) {
         i = 7907327;
      }

      return new float[]{(float)ColorHelper.getRed(i) / 255.0F * f, (float)ColorHelper.getGreen(i) / 255.0F * f, (float)ColorHelper.getBlue(i) / 255.0F * f};
   }
}
