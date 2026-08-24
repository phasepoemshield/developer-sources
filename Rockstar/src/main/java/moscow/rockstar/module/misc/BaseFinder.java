package moscow.rockstar.module.misc;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.render.Render3DEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.game.WorldUtility;
import moscow.rockstar.util.render.Draw3DUtility;
import moscow.rockstar.util.render.RenderUtility;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.entity.TrappedChestBlockEntity;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(name = "Base Finder", category = ModuleCategory.OTHER, desc = "Поиск баз игроков по блокам и структурам")
public class BaseFinder extends BaseModule {
   private static final ColorRGBA COLOR = new ColorRGBA(255.0F, 180.0F, 60.0F, 255.0F);
   private static final double MAX_DIST_SQ = 999.0;

   private final EventListener<Render3DEvent> onRender = event -> {
      if (mc.world == null || mc.player == null) {
         return;
      }

      MatrixStack matrices = event.getMatrices();
      Camera camera = mc.gameRenderer.getCamera();
      Vec3d cameraPos = camera.getPos();

      RenderSystem.enableBlend();
      RenderSystem.disableDepthTest();
      RenderSystem.disableCull();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder quads = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);

      int drawn = 0;
      for (BlockEntity be : WorldUtility.blockEntities) {
         if (!this.isStorage(be) || mc.player.squaredDistanceTo(be.getPos().toCenterPos()) > MAX_DIST_SQ) {
            continue;
         }
         Box box = new Box(be.getPos()).offset(-cameraPos.x, -cameraPos.y, -cameraPos.z);
         Draw3DUtility.renderFilledBox(matrices, quads, box, COLOR.withAlpha(70.0F));
         if (++drawn > 200) {
            break;
         }
      }

      RenderUtility.buildBuffer(quads);
      BufferBuilder lines = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      drawn = 0;
      for (BlockEntity be : WorldUtility.blockEntities) {
         if (!this.isStorage(be) || mc.player.squaredDistanceTo(be.getPos().toCenterPos()) > MAX_DIST_SQ) {
            continue;
         }
         Box box = new Box(be.getPos()).offset(-cameraPos.x, -cameraPos.y, -cameraPos.z);
         Draw3DUtility.renderOutlinedBox(matrices, lines, box, COLOR);
         if (++drawn > 200) {
            break;
         }
      }
      RenderUtility.buildBuffer(lines);
      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   };

   private boolean isStorage(BlockEntity be) {
      return be instanceof ChestBlockEntity
         || be instanceof TrappedChestBlockEntity
         || be instanceof EnderChestBlockEntity
         || be instanceof FurnaceBlockEntity
         || be instanceof BarrelBlockEntity
         || be instanceof ShulkerBoxBlockEntity;
   }
}
