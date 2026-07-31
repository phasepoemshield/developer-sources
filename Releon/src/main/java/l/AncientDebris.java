package l;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;

public class AncientDebris extends Helper242 {
   private static final int SEARCH_RADIUS = 20;
   private static final long CLICK_DELAY_MS = 500L;
   private static final int DEBRIS_COLOR = -16646399;
   private final List<BlockPos> highlightedDebris = Collections.synchronizedList(new ArrayList<>());
   private final List<BlockPos> clicked = Collections.synchronizedList(new ArrayList<>());
   private final ExecutorService threadPool = Executors.newFixedThreadPool(1);
   private volatile BlockPos clicking;

   public AncientDebris() {
      super("AncientDebris", "AncientDebris", Helper269.PLAYER);
   }

   @Override
   public void deactivate() {
      this.highlightedDebris.clear();
      this.clicked.clear();
      this.clicking = null;
      super.deactivate();
   }

   @Helper104
   public void method1767(Event10 var1) {
      if (mc.player != null && mc.world != null) {
         MatrixStack var2 = var1.method3708();
         var2.push();
         BlockPos var3 = mc.player.getBlockPos();
         Vec3d var4 = mc.gameRenderer.getCamera().getPos();
         this.highlightedDebris.clear();

         for (int var5 = -20; var5 <= 20; var5++) {
            for (int var6 = -20; var6 <= 20; var6++) {
               for (int var7 = -20; var7 <= 20; var7++) {
                  BlockPos var8 = var3.add(var5, var6, var7);
                  Block var9 = mc.world.getBlockState(var8).getBlock();
                  if (this.method1768(var8, var9)) {
                     this.method1775(var2, new Box(var8), -16646399, var4);
                     this.highlightedDebris.add(var8.toImmutable());
                  }
               }
            }
         }

         if (!this.highlightedDebris.isEmpty() && this.clicking == null) {
            this.method1769();
         }

         var2.pop();
      }
   }

   private boolean method1768(BlockPos var1, Block var2) {
      return var2 == Blocks.ANCIENT_DEBRIS && this.method1770(var1) && !this.method1771(var1) && this.method1772(var1) && !this.method1773(var1);
   }

   private void method1769() {
      this.clicking = this.highlightedDebris.get(0);
      this.threadPool.execute(() -> {
         try {
            for (BlockPos var2 : new ArrayList<>(this.highlightedDebris)) {
               if (!this.clicked.contains(var2)) {
                  if (mc.getNetworkHandler() != null) {
                     mc.getNetworkHandler().sendPacket(new PlayerActionC2SPacket(Action.START_DESTROY_BLOCK, var2, Direction.UP));
                  }

                  this.clicked.add(var2);
                  Thread.sleep(500L);
               }
            }
         } catch (InterruptedException var6) {
            Thread.currentThread().interrupt();
         } finally {
            this.clicking = null;
         }
      });
   }

   private boolean method1770(BlockPos var1) {
      int var2 = 0;

      for (Direction var6 : Direction.values()) {
         if (this.method1774(mc.world.getBlockState(var1.offset(var6)).getBlock())) {
            if (++var2 >= 2) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean method1771(BlockPos var1) {
      int var2 = 0;

      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               Block var6 = mc.world.getBlockState(var1.add(var3, var4, var5)).getBlock();
               if (var6 == Blocks.NETHER_QUARTZ_ORE || var6 == Blocks.NETHER_GOLD_ORE) {
                  if (++var2 >= 4) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   private boolean method1772(BlockPos var1) {
      int var2 = 0;

      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               if (this.method1774(mc.world.getBlockState(var1.add(var3, var4, var5)).getBlock())) {
                  if (++var2 >= 4) {
                     return true;
                  }
               }
            }
         }
      }

      return var2 >= 4;
   }

   private boolean method1773(BlockPos var1) {
      int var2 = 0;

      for (int var3 = -3; var3 <= 2; var3++) {
         for (int var4 = -2; var4 <= 2; var4++) {
            for (int var5 = -2; var5 <= 3; var5++) {
               if (mc.world.getBlockState(var1.add(var3, var4, var5)).isOf(Blocks.ANCIENT_DEBRIS)) {
                  if (++var2 > 3) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   private boolean method1774(Block var1) {
      return var1 == Blocks.AIR || var1 == Blocks.LAVA || var1 == Blocks.CAVE_AIR;
   }

   private void method1775(MatrixStack var1, Box var2, int var3, Vec3d var4) {
      float var5 = (float)(var2.minX - var4.x);
      float var6 = (float)(var2.minY - var4.y);
      float var7 = (float)(var2.minZ - var4.z);
      float var8 = (float)(var2.maxX - var4.x);
      float var9 = (float)(var2.maxY - var4.y);
      float var10 = (float)(var2.maxZ - var4.z);
      var1.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableDepthTest();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      int var11 = this.method1778(var3, 255);
      int var12 = this.method1779(this.method1778(var3, 255), 0.45F);
      BufferBuilder var13 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      this.method1776(var13, var1.peek().getPositionMatrix(), var5, var6, var7, var8, var9, var10, var11, var12);
      BufferRenderer.drawWithGlobalProgram(var13.end());
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      var1.pop();
   }

   private void method1776(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      this.method1777(var1, var2, var3, var4, var5, var9);
      this.method1777(var1, var2, var6, var4, var5, var9);
      this.method1777(var1, var2, var6, var4, var8, var9);
      this.method1777(var1, var2, var3, var4, var8, var9);
      this.method1777(var1, var2, var3, var7, var5, var10);
      this.method1777(var1, var2, var3, var7, var8, var10);
      this.method1777(var1, var2, var6, var7, var8, var10);
      this.method1777(var1, var2, var6, var7, var5, var10);
      this.method1777(var1, var2, var3, var4, var5, var9);
      this.method1777(var1, var2, var3, var7, var5, var10);
      this.method1777(var1, var2, var6, var7, var5, var10);
      this.method1777(var1, var2, var6, var4, var5, var9);
      this.method1777(var1, var2, var3, var4, var8, var9);
      this.method1777(var1, var2, var6, var4, var8, var9);
      this.method1777(var1, var2, var6, var7, var8, var10);
      this.method1777(var1, var2, var3, var7, var8, var10);
      this.method1777(var1, var2, var3, var4, var5, var9);
      this.method1777(var1, var2, var3, var4, var8, var9);
      this.method1777(var1, var2, var3, var7, var8, var10);
      this.method1777(var1, var2, var3, var7, var5, var10);
      this.method1777(var1, var2, var6, var4, var5, var9);
      this.method1777(var1, var2, var6, var7, var5, var10);
      this.method1777(var1, var2, var6, var7, var8, var10);
      this.method1777(var1, var2, var6, var4, var8, var9);
   }

   private void method1777(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, int var6) {
      var1.vertex(var2, var3, var4, var5).color(var6);
   }

   private int method1778(int var1, int var2) {
      return var1 & 16777215 | var2 << 24;
   }

   private int method1779(int var1, float var2) {
      int var3 = var1 >>> 24;
      int var4 = Math.round((var1 >> 16 & 0xFF) * var2);
      int var5 = Math.round((var1 >> 8 & 0xFF) * var2);
      int var6 = Math.round((var1 & 0xFF) * var2);
      return var3 << 24 | var4 << 16 | var5 << 8 | var6;
   }
}
