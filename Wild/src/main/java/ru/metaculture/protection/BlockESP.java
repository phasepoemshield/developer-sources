package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.DispenserBlockEntity;
import net.minecraft.block.entity.DropperBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.block.entity.MobSpawnerBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.entity.TrappedChestBlockEntity;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.WorldChunk;
import org.joml.Matrix4f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "BlockESP",
   O0000000000 = Category.Visuals,
   O000000000 = "Подцветка определенных блоков"
)
public class BlockESP extends Module {
   public static GroupSetting O000000000O = new GroupSetting(
      "Блоки",
      new BooleanSetting("Сундук", true),
      new BooleanSetting("Сундук ловушка", true),
      new BooleanSetting("Эндер сундук", true),
      new BooleanSetting("Спавнер", true),
      new BooleanSetting("Бочка", true),
      new BooleanSetting("Воронка", true),
      new BooleanSetting("Раздатчик", true),
      new BooleanSetting("Выбрасыватель", true),
      new BooleanSetting("Печка", true),
      new BooleanSetting("Шалкер", true)
   );
   public static final Map<BlockEntityType<?>, Integer> O000000000O0 = new HashMap<>();
   private static final int O000000000O00 = 1024;
   private static final RenderPipeline O000000000O000 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "block_esp_box"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O000000000O00O = RenderLayer.of(
      "block_esp_box", 1024, false, true, O000000000O000, MultiPhaseParameters.builder().build(false)
   );

   public BlockESP() {
      this.O00000000(new Setting[]{O000000000O});
      O000000000O0.clear();
      O000000000O0.put(BlockEntityType.CHEST, new Color(255, 194, 84).getRGB());
      O000000000O0.put(BlockEntityType.TRAPPED_CHEST, new Color(143, 109, 62).getRGB());
      O000000000O0.put(BlockEntityType.ENDER_CHEST, new Color(153, 49, 238).getRGB());
      O000000000O0.put(BlockEntityType.MOB_SPAWNER, 16777215);
      O000000000O0.put(BlockEntityType.BARREL, new Color(250, 225, 62).getRGB());
      O000000000O0.put(BlockEntityType.HOPPER, new Color(62, 137, 250).getRGB());
      O000000000O0.put(BlockEntityType.DISPENSER, new Color(27, 64, 250).getRGB());
      O000000000O0.put(BlockEntityType.DROPPER, new Color(0, 23, 255).getRGB());
      O000000000O0.put(BlockEntityType.FURNACE, new Color(115, 115, 115).getRGB());
      O000000000O0.put(BlockEntityType.SHULKER_BOX, new Color(246, 123, 123).getRGB());
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (O0000000000.world != null && O0000000000.player != null) {
         Immediate var2 = O0000O00O0O00.O00000000();

         try {
            Vec3d var3 = O0000000000.gameRenderer.getCamera().getPos();
            Matrix4f var4 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
            VertexConsumer var5 = var2.getBuffer(O000000000O00O);
            ChunkPos var6 = O0000000000.player.getChunkPos();
            int var7 = (Integer)O0000000000.options.getViewDistance().getValue();

            for (int var8 = var6.x - var7; var8 <= var6.x + var7; var8++) {
               for (int var9 = var6.z - var7; var9 <= var6.z + var7; var9++) {
                  WorldChunk var10 = O0000000000.world.getChunk(var8, var9);
                  if (var10 != null) {
                     for (BlockEntity var12 : var10.getBlockEntities().values()) {
                        BlockEntityType var13 = var12.getType();
                        if (O000000000O0.containsKey(var13)
                           && (!(var12 instanceof TrappedChestBlockEntity) || O000000000O.O000000000("Сундук ловушка"))
                           && (!(var12 instanceof ChestBlockEntity) || O000000000O.O000000000("Сундук"))
                           && (!(var12 instanceof EnderChestBlockEntity) || O000000000O.O000000000("Эндер сундук"))
                           && (!(var12 instanceof MobSpawnerBlockEntity) || O000000000O.O000000000("Спавнер"))
                           && (!(var12 instanceof BarrelBlockEntity) || O000000000O.O000000000("Бочка"))
                           && (!(var12 instanceof HopperBlockEntity) || O000000000O.O000000000("Воронка"))
                           && (!(var12 instanceof DispenserBlockEntity) || O000000000O.O000000000("Раздатчик"))
                           && (!(var12 instanceof DropperBlockEntity) || O000000000O.O000000000("Выбрасыватель"))
                           && (!(var12 instanceof FurnaceBlockEntity) || O000000000O.O000000000("Печка"))
                           && (!(var12 instanceof ShulkerBoxBlockEntity) || O000000000O.O000000000("Шалкер"))) {
                           BlockPos var14 = var12.getPos();
                           float var15 = (float)(var14.getX() - var3.x);
                           float var16 = (float)(var14.getY() - var3.y);
                           float var17 = (float)(var14.getZ() - var3.z);
                           float var18 = (float)(var14.getX() + 1 - var3.x);
                           float var19 = (float)(var14.getY() + 1 - var3.y);
                           float var20 = (float)(var14.getZ() + 1 - var3.z);
                           this.O00000000(var5, var4, var15, var16, var17, var18, var19, var20, O000000000O0.get(var13), 120, 0);
                        }
                     }
                  }
               }
            }
         } finally {
            O0000O00O0O00.O000000000();
         }
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, int l, int m, int n) {
      int var12 = l >> 16 & 0xFF;
      int var13 = l >> 8 & 0xFF;
      int var14 = l & 0xFF;
      vertexConsumer.vertex(matrix4f, f, g, h).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var12, var13, var14, m);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var12, var13, var14, n);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var12, var13, var14, n);
   }
}
