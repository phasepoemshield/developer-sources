package ru.metaculture.protection;

import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SequencedMap;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumers;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.util.Hand;

public final class O0000O00OO0000 {
   private static final int O00000000 = 262144;
   private static final O0000O00OO0000 O000000000 = new O0000O00OO0000();
   private final Map<Hand, O0000O00OO0000.W377> O0000000000 = new EnumMap<>(Hand.class);
   private boolean O00000000000;
   private int O000000000000 = -1;
   private int O0000000000000 = -1;

   private O0000O00OO0000() {
      this.O0000000000.put(Hand.MAIN_HAND, new O0000O00OO0000.W377("wild_hands_main"));
      this.O0000000000.put(Hand.OFF_HAND, new O0000O00OO0000.W377("wild_hands_off"));
   }

   public static O0000O00OO0000 O00000000() {
      return O000000000;
   }

   public void O00000000(boolean bl, boolean bl2, int i, int j) {
      this.O00000000000 = false;
      this.O0000000000.values().forEach(O0000O00OO0000.W377::O000000000);
      if ((bl || bl2) && i > 0 && j > 0 && !O0000O00OO00O.O000000000()) {
         this.O000000000000 = i;
         this.O0000000000000 = j;
         O0000O00OO0000.W377 var5 = this.O0000000000.get(Hand.MAIN_HAND);
         O0000O00OO0000.W377 var6 = this.O0000000000.get(Hand.OFF_HAND);

         try {
            if (bl && var5.O00000000(i, j)) {
               var5.O00000000();
               this.O00000000000 = true;
            }

            if (bl2 && var6.O00000000(i, j)) {
               var6.O00000000();
               this.O00000000000 = true;
            }
         } catch (RuntimeException var8) {
            this.O00000000000 = false;
            this.O0000000000.values().forEach(O0000O00OO0000.W377::O000000000);
         }
      }
   }

   public VertexConsumerProvider O00000000(Hand hand, VertexConsumerProvider vertexConsumerProvider) {
      O0000O00OO0000.W377 var3 = this.O0000000000.get(hand);
      return this.O00000000000 && var3 != null && var3.O0000000000 && vertexConsumerProvider != null && !O0000O00OO00O.O000000000()
         ? renderLayer -> VertexConsumers.union(vertexConsumerProvider.getBuffer(renderLayer), var3.O00000000.O000000000000.O00000000(renderLayer))
         : vertexConsumerProvider;
   }

   public VertexConsumerProvider O000000000(Hand hand, VertexConsumerProvider vertexConsumerProvider) {
      O0000O00OO0000.W377 var3 = this.O0000000000.get(hand);
      return this.O00000000000 && var3 != null && var3.O0000000000 && vertexConsumerProvider != null && !O0000O00OO00O.O000000000()
         ? renderLayer -> VertexConsumers.union(vertexConsumerProvider.getBuffer(renderLayer), var3.O000000000.O000000000000.O00000000(renderLayer))
         : vertexConsumerProvider;
   }

   public void O00000000(Hand hand) {
      O0000O00OO0000.W377 var2 = this.O0000000000.get(hand);
      if (this.O00000000000 && var2 != null && var2.O0000000000) {
         var2.O00000000.O000000000();
         var2.O000000000.O000000000();
      }
   }

   public boolean O000000000(Hand hand) {
      O0000O00OO0000.W377 var2 = this.O0000000000.get(hand);
      return var2 != null && var2.O00000000.O00000000000O;
   }

   public int O0000000000(Hand hand) {
      O0000O00OO0000.W377 var2 = this.O0000000000.get(hand);
      return var2 != null && var2.O00000000.O00000000000O ? O00000000(var2.O00000000.O00000000000, false) : 0;
   }

   public int O00000000000(Hand hand) {
      O0000O00OO0000.W377 var2 = this.O0000000000.get(hand);
      return var2 != null && var2.O00000000.O00000000000O ? O00000000(var2.O00000000.O00000000000, true) : 0;
   }

   public int O000000000000(Hand hand) {
      O0000O00OO0000.W377 var2 = this.O0000000000.get(hand);
      return var2 != null && var2.O000000000.O00000000000O ? O00000000(var2.O000000000.O00000000000, false) : 0;
   }

   public void O000000000() {
      this.O00000000000 = false;
      this.O000000000000 = -1;
      this.O0000000000000 = -1;
      this.O0000000000.values().forEach(O0000O00OO0000.W377::O0000000000);
   }

   private static int O00000000(Framebuffer framebuffer, boolean bl) {
      if (framebuffer == null) {
         return 0;
      } else {
         return (bl ? framebuffer.getDepthAttachment() : framebuffer.getColorAttachment()) instanceof GlTexture var3 ? var3.getGlId() : 0;
      }
   }

   static final class W375 {
      private final String O00000000;
      private final BufferAllocator O000000000 = new BufferAllocator(262144);
      private final SequencedMap<RenderLayer, BufferAllocator> O0000000000 = new LinkedHashMap<>();
      SimpleFramebuffer O00000000000;
      O0000O00OO0000.W376 O000000000000;
      private int O0000000000000 = -1;
      private int O000000000000O = -1;
      boolean O00000000000O;

      W375(String string) {
         this.O00000000 = string;
      }

      boolean O00000000(int i, int j) {
         if (this.O00000000000 == null) {
            this.O00000000000 = new SimpleFramebuffer(this.O00000000, i, j, true);
            this.O0000000000000 = i;
            this.O000000000000O = j;
         } else if (this.O0000000000000 != i || this.O000000000000O != j) {
            this.O00000000000.resize(i, j);
            this.O0000000000000 = i;
            this.O000000000000O = j;
         }

         GpuTextureView var3 = this.O00000000000.getColorAttachmentView();
         GpuTextureView var4 = this.O00000000000.getDepthAttachmentView();
         return var3 != null && !var3.isClosed() && (var4 == null || !var4.isClosed());
      }

      void O00000000() {
         this.O00000000000();
         this.O0000000000();
         this.O000000000.clear();
         this.O0000000000.values().forEach(BufferAllocator::clear);
         this.O000000000000 = new O0000O00OO0000.W376(this.O000000000, this.O0000000000);
      }

      void O000000000() {
         O0000O00OO0000.W376 var1 = this.O000000000000;
         if (var1 != null && var1.O00000000000 && this.O00000000000 != null) {
            GpuTextureView var2 = this.O00000000000.getColorAttachmentView();
            if (var2 != null && !var2.isClosed()) {
               GpuTextureView var3 = RenderSystem.outputColorTextureOverride;
               GpuTextureView var4 = RenderSystem.outputDepthTextureOverride;
               RenderSystem.outputColorTextureOverride = var2;
               RenderSystem.outputDepthTextureOverride = this.O00000000000.getDepthAttachmentView();

               try {
                  var1.O00000000();
                  this.O00000000000O = true;
               } finally {
                  RenderSystem.outputColorTextureOverride = var3;
                  RenderSystem.outputDepthTextureOverride = var4;
               }
            }
         }
      }

      private void O0000000000() {
         if (this.O00000000000 != null) {
            GpuTextureView var1 = this.O00000000000.getColorAttachmentView();
            GpuTextureView var2 = this.O00000000000.getDepthAttachmentView();
            if (var1 != null && !var1.isClosed()) {
               CommandEncoder var3 = RenderSystem.getDevice().createCommandEncoder();
               if (var2 != null && !var2.isClosed()) {
                  var3.clearColorAndDepthTextures(var1.texture(), 0, var2.texture(), 1.0);
               } else {
                  var3.clearColorTexture(var1.texture(), 0);
               }
            }
         }
      }

      void O00000000000() {
         this.O00000000000O = false;
         O0000O00OO0000.W376 var1 = this.O000000000000;
         this.O000000000000 = null;
         if (var1 != null) {
            var1.close();
         }
      }

      void O000000000000() {
         this.O00000000000();

         for (BufferAllocator var2 : this.O0000000000.values()) {
            var2.clear();
         }

         this.O000000000.clear();
         if (this.O00000000000 != null) {
            this.O00000000000.delete();
            this.O00000000000 = null;
         }

         this.O0000000000000 = -1;
         this.O000000000000O = -1;
      }
   }

   static final class W376 implements AutoCloseable {
      private final BufferAllocator O00000000;
      private final SequencedMap<RenderLayer, BufferAllocator> O000000000;
      private final Immediate O0000000000;
      boolean O00000000000;
      private boolean O000000000000;

      W376(BufferAllocator bufferAllocator, SequencedMap<RenderLayer, BufferAllocator> sequencedMap) {
         this.O00000000 = bufferAllocator;
         this.O000000000 = sequencedMap;
         this.O0000000000 = VertexConsumerProvider.immediate(sequencedMap, bufferAllocator);
      }

      VertexConsumer O00000000(RenderLayer renderLayer) {
         this.O000000000
            .computeIfAbsent(renderLayer, renderLayerx -> new BufferAllocator(Math.max(4096, Math.min(renderLayerx.getExpectedBufferSize(), 262144))));
         this.O00000000000 = true;
         this.O000000000000 = false;
         return this.O0000000000.getBuffer(renderLayer);
      }

      void O00000000() {
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

   static final class W377 {
      final O0000O00OO0000.W375 O00000000;
      final O0000O00OO0000.W375 O000000000;
      boolean O0000000000;

      W377(String string) {
         this.O00000000 = new O0000O00OO0000.W375(string + "_mask");
         this.O000000000 = new O0000O00OO0000.W375(string + "_item");
      }

      boolean O00000000(int i, int j) {
         return this.O00000000.O00000000(i, j) && this.O000000000.O00000000(i, j);
      }

      void O00000000() {
         this.O00000000.O00000000();
         this.O000000000.O00000000();
         this.O0000000000 = true;
      }

      private void O000000000() {
         this.O0000000000 = false;
         this.O00000000.O00000000000();
         this.O000000000.O00000000000();
      }

      private void O0000000000() {
         this.O0000000000 = false;
         this.O00000000.O000000000000();
         this.O000000000.O000000000000();
      }
   }
}
