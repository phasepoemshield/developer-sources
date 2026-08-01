package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.block.Block;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;
import org.joml.Matrix4f;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public class XrayCommand extends Command {
   private static final int O00000000 = 16777215;
   private static final int O000000000 = 12;
   private static final int O0000000000 = 1;
   private static final int O00000000000 = 64;
   private static final long O000000000000 = 250L;
   private static final int O0000000000000 = 4096;
   private static final List<String> O000000000000O = List.of("clear", "off", "reset", "help");
   private boolean O00000000000O;
   private Block O00000000000O0;
   private Identifier O00000000000OO;
   private int O0000000000O00 = 16777215;
   private int O0000000000O0O = 12;
   private long O0000000000OO;
   private final List<BlockPos> O0000000000OO0 = new ArrayList<>();
   private static final RenderPipeline O0000000000OOO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "xray_box"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O000000000O = RenderLayer.of("xray_box", 4096, false, true, O0000000000OOO, MultiPhaseParameters.builder().build(false));

   public XrayCommand() {
      super("xray", "Подсветка блока в заданном радиусе", ".xray <block|clear/off/reset/help> [r,g,b] [radius]");
   }

   @Compile
   @Override
   public void O000000000(String[] strings) {
      if (strings.length == 0 || strings[0].equalsIgnoreCase("help")) {
         this.O0000000000000();
         return;
      }

      String var2 = strings[0].toLowerCase(Locale.ROOT);
      if (var2.equals("off") || var2.equals("clear") || var2.equals("reset")) {
         this.O000000000000();
         return;
      }

      Identifier var3 = this.O000000000(var2);
      if (var3 == null || !Registries.BLOCK.getIds().contains(var3)) {
         ChatUtil.O00000000("§cНеизвестный блок: §f" + strings[0]);
         return;
      }

      Integer var4 = strings.length >= 2 ? this.O0000000000(strings[1]) : Integer.valueOf(16777215);
      Integer var5 = strings.length >= 3 ? this.O00000000000(strings[2]) : Integer.valueOf(12);
      if (var4 == null) {
         ChatUtil.O00000000("§cЦвет должен иметь формат R,G,B (0–255).");
         return;
      }

      if (var5 == null) {
         ChatUtil.O00000000("§cРадиус должен быть от 1 до 64.");
         return;
      }

      this.O00000000000OO = var3;
      this.O00000000000O0 = Registries.BLOCK.get(var3);
      this.O0000000000O00 = var4;
      this.O0000000000O0O = var5;
      this.O00000000000O = true;
      this.O0000000000OO = 0L;
      this.O0000000000OO0.clear();
      ChatUtil.O00000000(
         "§aXRay: §f" + this.O00000000(var3) + " §7| цвет " + this.O00000000(var4) + " | радиус " + var5
      );
   }

   @Override
   public List<String> O00000000(String[] strings) {
      if (strings.length != 2) {
         if (strings.length == 3 && !this.O00000000(strings[1].toLowerCase(Locale.ROOT))) {
            String var8 = strings[2].toLowerCase(Locale.ROOT);
            return List.of("255,255,255", "255,0,0", "0,255,0", "0,128,255", String.valueOf(12)).stream().filter(string2 -> string2.startsWith(var8)).toList();
         } else if (strings.length == 4 && !this.O00000000(strings[1].toLowerCase(Locale.ROOT))) {
            String var7 = strings[3].toLowerCase(Locale.ROOT);
            return List.of("8", "12", "15", "24", "32", "64").stream().filter(string2 -> string2.startsWith(var7)).toList();
         } else {
            return List.of();
         }
      } else {
         String var2 = strings[1].toLowerCase(Locale.ROOT);
         ArrayList var3 = new ArrayList();

         for (String var5 : O000000000000O) {
            if (var5.startsWith(var2)) {
               var3.add(var5);
            }
         }

         for (Identifier var10 : Registries.BLOCK.getIds()) {
            String var6 = this.O00000000(var10);
            if (var6.startsWith(var2)) {
               var3.add(var6);
               if (var3.size() >= 30) {
                  break;
               }
            }
         }

         return var3;
      }
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      if (this.O00000000000O && this.O00000000000O0 != null && a_.world != null && a_.player != null) {
         this.O00000000000();
         if (!this.O0000000000OO0.isEmpty()) {
            Immediate var2 = O0000O00O0O00.O00000000();

            try {
               Vec3d var3 = a_.gameRenderer.getCamera().getPos();
               Matrix4f var4 = o0000000OO0000.O0000000000().peek().getPositionMatrix();
               VertexConsumer var5 = var2.getBuffer(O000000000O);
               Color var6 = new Color(this.O0000000000O00);
               Color var7 = new Color(var6.getRed(), var6.getGreen(), var6.getBlue(), 120);
               Color var8 = new Color(var6.getRed(), var6.getGreen(), var6.getBlue(), 0);

               for (BlockPos var10 : this.O0000000000OO0) {
                  if (a_.world.getBlockState(var10).isOf(this.O00000000000O0)) {
                     float var11 = (float)(var10.getX() - var3.x);
                     float var12 = (float)(var10.getY() - var3.y);
                     float var13 = (float)(var10.getZ() - var3.z);
                     float var14 = var11 + 1.0F;
                     float var15 = var12 + 1.0F;
                     float var16 = var13 + 1.0F;
                     this.O00000000(var5, var4, var11, var12, var13, var14, var15, var16, var7, var8);
                  }
               }
            } finally {
               O0000O00O0O00.O000000000();
            }
         }
      }
   }

   private void O00000000000() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.O0000000000OO >= 250L) {
         this.O0000000000OO = var1;
         this.O0000000000OO0.clear();
         BlockPos var3 = a_.player.getBlockPos();
         Mutable var4 = new Mutable();
         int var5 = Math.max(a_.world.getBottomY(), var3.getY() - this.O0000000000O0O);
         int var6 = Math.min(a_.world.getTopYInclusive(), var3.getY() + this.O0000000000O0O);

         for (int var7 = var3.getX() - this.O0000000000O0O; var7 <= var3.getX() + this.O0000000000O0O; var7++) {
            for (int var8 = var5; var8 <= var6; var8++) {
               for (int var9 = var3.getZ() - this.O0000000000O0O; var9 <= var3.getZ() + this.O0000000000O0O; var9++) {
                  var4.set(var7, var8, var9);
                  if (a_.world.getBlockState(var4).isOf(this.O00000000000O0)) {
                     this.O0000000000OO0.add(var4.toImmutable());
                  }
               }
            }
         }
      }
   }

   private void O000000000000() {
      this.O00000000000O = false;
      this.O00000000000O0 = null;
      this.O00000000000OO = null;
      this.O0000000000OO0.clear();
      ChatUtil.O00000000("§7XRay выключен.");
   }

   private void O0000000000000() {
      ChatUtil.O00000000("§cИспользование: " + this.O0000000000());
      ChatUtil.O00000000("§7Пример: §f.xray diamond_ore 255,255,255 15");
      ChatUtil.O00000000("§7Команды: §f.xray clear §7/ §f.xray off §7/ §f.xray reset");
   }

   private boolean O00000000(String string) {
      return string != null && (string.equals("off") || string.equals("clear") || string.equals("reset") || string.equals("help"));
   }

   private Identifier O000000000(String string) {
      if (string != null && !string.isBlank()) {
         String var2 = string.trim().toLowerCase(Locale.ROOT);
         if (!var2.contains(":")) {
            var2 = "minecraft:" + var2;
         }

         return Identifier.tryParse(var2);
      } else {
         return null;
      }
   }

   private Integer O0000000000(String string) {
      String[] var2 = string.split(",");
      if (var2.length != 3) {
         return null;
      } else {
         int[] var3 = new int[3];

         for (int var4 = 0; var4 < 3; var4++) {
            try {
               var3[var4] = Integer.parseInt(var2[var4].trim());
            } catch (NumberFormatException var6) {
               return null;
            }

            if (var3[var4] < 0 || var3[var4] > 255) {
               return null;
            }
         }

         return var3[0] << 16 | var3[1] << 8 | var3[2];
      }
   }

   private Integer O00000000000(String string) {
      try {
         int var2 = Integer.parseInt(string.trim());
         return var2 >= 1 && var2 <= 64 ? var2 : null;
      } catch (NumberFormatException var3) {
         return null;
      }
   }

   private String O00000000(int i) {
      return (i >> 16 & 0xFF) + "," + (i >> 8 & 0xFF) + "," + (i & 0xFF);
   }

   private String O00000000(Identifier identifier) {
      if (identifier == null) {
         return "";
      } else {
         return "minecraft".equals(identifier.getNamespace()) ? identifier.getPath() : identifier.toString();
      }
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, float i, float j, float k, Color color, Color color2) {
      int var11 = color.getRed();
      int var12 = color.getGreen();
      int var13 = color.getBlue();
      int var14 = color.getAlpha();
      int var15 = color2.getRed();
      int var16 = color2.getGreen();
      int var17 = color2.getBlue();
      int var18 = color2.getAlpha();
      vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, i, g, k).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, i, g, h).color(var11, var12, var13, var14);
      vertexConsumer.vertex(matrix4f, f, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, j, h).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, i, j, k).color(var15, var16, var17, var18);
      vertexConsumer.vertex(matrix4f, f, j, k).color(var15, var16, var17, var18);
   }

   static {
      Loader.initialize();
   }
}
