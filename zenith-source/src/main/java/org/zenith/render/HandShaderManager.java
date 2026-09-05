package org.zenith.render;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;
import org.zenith.core.ShaderWrapper;

/**
 * Owns the first-person hand capture framebuffer and the composite shader
 * wrappers. Since 1.21.9 the hand is queued during world rendering and drawn
 * inside the GUI phase, so the capture is armed when the hand is queued and
 * performed when {@code RenderDispatcher.render()} drains the queue.
 */
public class HandShaderManager {
   public static MinecraftClient minecraftClient = MinecraftClient.getInstance();
   public static final String string132 = "sirius_aqua";
   public static final Map<String, ShaderWrapper> map59 = new HashMap<>();
   public static final Set<String> set22 = new HashSet<>();
   public static SimpleFramebuffer simpleFramebuffer;
   public static boolean initialized = false;

   private static boolean handQueued;
   private static boolean capturing;
   private static boolean handCaptured;

   public static void float246() {
      if (!initialized) {
         try {
            HudTabList(string132);
            initialized = true;
            System.out.println("[Zenith/ShaderHand] sirius_aqua loaded OK");
         } catch (Exception exception) {
            System.err.println("[Zenith/ShaderHand] Failed to initialize hand shaders!");
            exception.printStackTrace();
         }
      }
   }

   public static ShaderWrapper HudStatusPanel(String var0) {
      if (var0 == null || var0.isBlank()) {
         return map59.get(string132);
      }

      if (set22.contains(var0)) {
         return map59.get(string132);
      }

      try {
         boolean flag = !map59.containsKey(var0);
         ShaderWrapper var05 = HudTabList(var0);
         if (flag) {
            System.out.println("[Zenith/ShaderHand] shader " + var0 + " loaded OK");
         }

         return var05;
      } catch (Exception exception) {
         set22.add(var0);
         System.err.println("[Zenith/ShaderHand] Failed to initialize hand shader: " + var0);
         exception.printStackTrace();
         return map59.get(string132);
      }
   }

   public static ShaderWrapper HudTabList(String var0) {
      ShaderWrapper lliii11l1lllil = map59.get(var0);
      if (lliii11l1lllil == null) {
         lliii11l1lllil = new ShaderWrapper(Identifier.of("zenith", "core/" + var0 + "/data"), VertexFormats.POSITION);
         map59.put(var0, lliii11l1lllil);
      }

      return lliii11l1lllil;
   }

   public static void float247() {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         int i = minecraftClient.getWindow().getFramebufferWidth();
         int j = minecraftClient.getWindow().getFramebufferHeight();
         if (simpleFramebuffer == null || simpleFramebuffer.textureWidth != i || simpleFramebuffer.textureHeight != j) {
            if (simpleFramebuffer != null) {
               simpleFramebuffer.delete();
            }

            simpleFramebuffer = new SimpleFramebuffer("Zenith hand shader", i, j, true);
         }
      }
   }

   public static void var14336() {
      RenderSystem.assertOnRenderThread();
      BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION);
      bufferbuilder.vertex(-1.0F, -1.0F, 0.0F);
      bufferbuilder.vertex(1.0F, -1.0F, 0.0F);
      bufferbuilder.vertex(1.0F, 1.0F, 0.0F);
      bufferbuilder.vertex(-1.0F, 1.0F, 0.0F);
      org.zenith.render.LegacyRenderBridge.draw(bufferbuilder.end());
   }

   /**
    * Called when the vanilla hand pass is queued. The actual GPU draw happens
    * later in the GUI phase, so capture only becomes armed here.
    */
   public static void armCapture() {
      handQueued = true;
   }

   /** Drops a stale arm, e.g. when the queue was never drained last frame. */
   public static void onFrameStart() {
      handQueued = false;
      capturing = false;
   }

   public static void beginCaptureIfArmed() {
      if (!handQueued || simpleFramebuffer == null) {
         return;
      }

      // Another feature (HandFire, bot world view) already owns the output.
      if (RenderSystem.outputColorTextureOverride != null) {
         handQueued = false;
         return;
      }

      RenderSystem.outputColorTextureOverride = simpleFramebuffer.getColorAttachmentView();
      RenderSystem.outputDepthTextureOverride = simpleFramebuffer.getDepthAttachmentView();
      capturing = true;
   }

   public static boolean endCapture() {
      if (!capturing) {
         return false;
      }

      RenderSystem.outputColorTextureOverride = null;
      RenderSystem.outputDepthTextureOverride = null;
      capturing = false;
      handQueued = false;
      handCaptured = true;
      return true;
   }

   public static boolean isHandCaptured() {
      return handCaptured;
   }

   public static void consumeCapture() {
      handCaptured = false;
   }

   public static boolean isInitialized() {
      return initialized;
   }

   public static SimpleFramebuffer string38() {
      return simpleFramebuffer;
   }
}
