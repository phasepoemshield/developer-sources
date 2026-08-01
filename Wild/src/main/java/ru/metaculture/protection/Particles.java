package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.RenderPhase.Texture;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.Heightmap.Type;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Particles",
   O000000000 = "Улучшенные частицы при атаках и бросках",
   O0000000000 = Category.Visuals
)
public class Particles extends Module {
   public static GroupSetting O000000000O = new GroupSetting(
      "Спавнить при", new BooleanSetting("Атаке", true), new BooleanSetting("Бросок", true), new BooleanSetting("В мире", false)
   );
   public static ModeSetting O000000000O0 = new ModeSetting(
      "Тип частиц", "Bloom", "Bloom", "Star", "Snow", "Heart", "Dollar", "Triangle", "Sakura", "Genshin", "Rhombus"
   );
   public static NumberSetting O000000000O00 = new NumberSetting("Размер", 0.5F, 0.0F, 1.0F, 0.1F, false);
   public static NumberSetting O000000000O000 = new NumberSetting("Количество", 10.0F, 10.0F, 100.0F, 10.0F, false);
   public static NumberSetting O000000000O00O = new NumberSetting("Время жизни", 2.0F, 0.5F, 10.0F, 0.5F, false);
   public static NumberSetting O000000000O0O = new NumberSetting("Радиус в мире", 12.0F, 2.0F, 50.0F, 1.0F, false);
   public static BooleanSetting O000000000O0O0 = new BooleanSetting("Физика", true);
   public static ModeSetting O000000000O0OO = new ModeSetting("Режим цвета", "Клиентовский", "Клиентовский", "Свой");
   public static ColorSetting O000000000OO = new ColorSetting("Кастом цвет", 15.0F, 1.0F, 1.0F).O000000000(() -> !O000000000O0OO.O000000000("Свой"));
   private static final int O000000000OO0 = 1024;
   private long O000000000OO00 = System.nanoTime();
   private static final String O000000000OO0O = "wild";
   private static final RenderPipeline O000000000OOO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_TEX_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/textured_quads"))
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final Map<Particles.W183, RenderLayer> O000000000OOO0 = new ConcurrentHashMap<>();
   private final List<Particles.W182> O000000000OOOO = new ArrayList<>();
   private final List<Particles.W182> O00000000O = new ArrayList<>();
   private final List<Particles.W182> O00000000O0 = new ArrayList<>();
   private static final Vector3f O00000000O00 = new Vector3f(0.0F, 0.0F, 1.0F);

   public Particles() {
      this.O00000000(
         new Setting[]{O000000000O, O000000000O0, O000000000O0OO, O000000000OO, O000000000O00, O000000000O000, O000000000O00O, O000000000O0O, O000000000O0O0}
      );
   }

   private void O0000000000O0() {
      this.O000000000OOOO.clear();
      this.O00000000O0.clear();
      this.O00000000O.clear();
   }

   private void O00000000(List<Particles.W182> list, Vec3d vec3d, Vec3d vec3d2) {
      float var4 = 0.05F + O000000000O00.O0000000000() * 0.2F;
      int var5 = O000000000O0OO.O000000000("Свой") ? O000000000OO.O0000000000().getRGB() : O0000O000OO000.O000000000O000(list.size() * 100);
      String var7 = O000000000O0.O0000000000();

      Particles.W183 var6 = switch (var7) {
         case "Heart" -> Particles.W183.HEART;
         case "Star" -> Particles.W183.STAR;
         case "Snow" -> Particles.W183.SNOW;
         case "Bloom" -> Particles.W183.BLOOM;
         case "Dollar" -> Particles.W183.DOLLAR;
         case "Triangle" -> Particles.W183.TRIANGLE;
         case "Sakura" -> Particles.W183.SAKURA;
         case "Genshin" -> Particles.W183.GEMINI;
         case "Rhombus" -> Particles.W183.SIMS;
         default -> Particles.W183.BLOOM;
      };
      list.add(
         new Particles.W182(
            var6,
            vec3d.add(0.0, var4, 0.0),
            vec3d2,
            list.size(),
            (int)O0000O000OOOOO.O000000000000(O0000O000OOOOO.O00000000000(0.0F, 360.0F), 15.0),
            var5,
            var4,
            0.2F
         )
      );
   }

   @EventHandler
   public void O00000000(O0000000O0O0OO o0000000O0O0OO) {
      Entity var2 = o0000000O0O0OO.O0000000000();
      float var3 = 6.0F;
      if (O000000000O.O000000000("Атаке")) {
         int var4 = (int)O000000000O000.O0000000000();

         for (int var5 = 0; var5 < var4; var5++) {
            this.O00000000(
               this.O000000000OOOO,
               new Vec3d(var2.getX(), var2.getY() + O0000O000OOOOO.O00000000000(0.0F, var2.getHeight()), var2.getZ()),
               new Vec3d(O0000O000OOOOO.O00000000000(-var3, var3), O0000O000OOOOO.O00000000000(-var3, var3), O0000O000OOOOO.O00000000000(-var3, var3))
            );
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0OOO o0000000O0OOO) {
      if (O000000000O.O000000000("Бросок")) {
         if (O0000000000.world == null) {
            return;
         }

         for (Entity var3 : O0000000000.world.getEntities()) {
            if ((var3 instanceof EnderPearlEntity || var3 instanceof ArrowEntity || var3 instanceof TridentEntity)
               && (!(var3 instanceof TridentEntity var4) || !var4.isOnGround())) {
               boolean var17 = var3.lastX != var3.getX() || var3.lastY != var3.getY() || var3.lastZ != var3.getZ();
               if (var17) {
                  Vec3d var5 = var3.getPos();
                  int var6 = Math.max(1, (int)(O000000000O000.O0000000000() / 10.0F));

                  for (int var7 = 0; var7 < var6; var7++) {
                     this.O00000000(
                        this.O00000000O0,
                        new Vec3d(
                           var5.x + MathHelper.nextDouble(Random.create(), -0.2, 0.2),
                           var5.y + MathHelper.nextDouble(Random.create(), -0.2, 0.2),
                           var5.z + MathHelper.nextDouble(Random.create(), -0.2, 0.2)
                        ),
                        new Vec3d(
                           MathHelper.nextDouble(Random.create(), -1.0, 1.0),
                           MathHelper.nextDouble(Random.create(), -0.3, 0.3),
                           MathHelper.nextDouble(Random.create(), -1.0, 1.0)
                        )
                     );
                  }
               }
            }
         }
      }

      if (O000000000O.O000000000("В мире")) {
         if (O0000000000.world == null || O0000000000.player == null) {
            return;
         }

         int var14 = (int)O000000000O0O.O0000000000();
         int var16 = Math.max(1, (int)(O000000000O000.O0000000000() / 2.0F));

         for (int var18 = 0; var18 < var16; var18++) {
            Vec3d var19 = O0000000000.player
               .getPos()
               .add(O0000O000OOOOO.O00000000000((float)(-var14), (float)var14), 0.0, O0000O000OOOOO.O00000000000((float)(-var14), (float)var14));
            BlockPos var20 = O0000000000.world.getTopPosition(Type.MOTION_BLOCKING, BlockPos.ofFloored(var19));
            double var21 = var20.getX() + O0000O000OOOOO.O00000000000(0.0F, 1.0F);
            double var9 = var20.getZ() + O0000O000OOOOO.O00000000000(0.0F, 1.0F);
            double var11 = O0000000000.player.getY() + O0000O000OOOOO.O00000000000(O0000000000.player.getHeight(), (float)var14);
            Vec3d var13 = new Vec3d(var21, var11, var9);

            while (!O0000000000.world.isAir(BlockPos.ofFloored(var13)) && var13.y < O0000000000.world.getTopYInclusive()) {
               var13 = var13.add(0.0, 1.0, 0.0);
            }

            this.O00000000(
               this.O00000000O,
               var13,
               new Vec3d(
                  O0000000000.player.getVelocity().x + O0000O000OOOOO.O00000000000(-2.0F, 2.0F),
                  O0000O000OOOOO.O000000000(-0.2, 0.2),
                  O0000000000.player.getVelocity().z + O0000O000OOOOO.O00000000000(-2.0F, 2.0F)
               )
            );
         }
      }

      long var15 = this.O0000000000O00();
      this.O00000000(this.O000000000OOOO, var15);
      this.O00000000(this.O00000000O0, var15);
      this.O00000000(this.O00000000O, var15);
   }

   @EventHandler
   public void O00000000(O0000000OO0000 o0000000OO0000) {
      MatrixStack var2 = o0000000OO0000.O0000000000();
      Vec3d var3 = O0000000000.gameRenderer.getCamera().getPos();
      long var4 = System.nanoTime();
      double var6 = (var4 - this.O000000000OO00) / 1.0E9;
      this.O000000000OO00 = var4;
      BufferAllocator var8 = new BufferAllocator(262144);
      Immediate var9 = VertexConsumerProvider.immediate(var8);

      try {
         long var10 = this.O0000000000O00();
         long var12 = Math.min(400L, Math.max(100L, var10 / 5L));
         long var14 = Math.max(var12 + 1L, (long)((float)var10 * 0.62F));
         this.O00000000(var2, var9, var3, this.O000000000OOOO, var12, var14, var6);
         this.O00000000(var2, var9, var3, this.O00000000O0, var12, var14, var6);
         this.O00000000(var2, var9, var3, this.O00000000O, var12, var14, var6);
         var9.draw();
      } finally {
         var8.close();
      }
   }

   private long O0000000000O00() {
      return Math.max(250L, (long)(O000000000O00O.O0000000000() * 1000.0F));
   }

   private void O00000000(List<Particles.W182> list, long l) {
      list.removeIf(o00000000 -> o00000000.O00000000000OO().O00000000((double)l));
   }

   private void O00000000(MatrixStack matrixStack, Immediate immediate, Vec3d vec3d, List<Particles.W182> list, long l, long m, double d) {
      if (!list.isEmpty()) {
         matrixStack.push();

         for (Particles.W182 var12 : list) {
            var12.O00000000(O000000000O0O0.O0000000000(), d);
            boolean var13 = !var12.O00000000000OO().O00000000((double)l);
            boolean var14 = var12.O00000000000OO().O00000000((double)m);
            if (var13) {
               var12.O0000000000O().O00000000(1.0, 0.4, O0000O00O0OO0O.O00000000000O, true);
            } else if (var14) {
               var12.O0000000000O().O00000000(0.0, 0.4, O0000O00O0OO0O.O00000000000O, true);
            }

            if (var12.O000000000O.O000000000()) {
               var12.O000000000O.O00000000();
            }

            float var15 = var12.O000000000O.O000000000000();
            int var16 = (int)(var15 * 255.0F);
            if (var16 > 0) {
               int var17 = O0000O000OO000.O000000000000(var12.O000000000000O(), var16);
               Vec3d var18 = var12.O0000000000();
               this.O00000000(matrixStack, immediate, var12, (float)var18.x, (float)var18.y, (float)var18.z, var12.O00000000000O, var17, var16);
            }
         }

         matrixStack.pop();
      }
   }

   private void O00000000(MatrixStack matrixStack, Immediate immediate, Particles.W182 o00000000, float f, float g, float h, float i, int j, int k) {
      matrixStack.push();
      RenderManager.O00000000(matrixStack, f, g, h);
      matrixStack.multiply(O0000000000.gameRenderer.getCamera().getRotation());
      RenderLayer var10 = O000000000OOO0.computeIfAbsent(
         o00000000.O000000000(),
         o000000000 -> {
            Identifier var1 = o000000000.O00000000();
            return RenderLayer.of(
               var1.toString(), 1024, false, true, O000000000OOO, MultiPhaseParameters.builder().texture(new Texture(var1, false)).build(false)
            );
         }
      );
      Entry var11 = matrixStack.peek();
      Matrix4f var12 = var11.getPositionMatrix();
      Matrix3f var13 = var11.getNormalMatrix();
      VertexConsumer var14 = immediate.getBuffer(var10);
      this.O00000000(var14, var12, var13, -i, -i, i * 2.0F, i * 2.0F, j, k);
      if (o00000000.O000000000 == Particles.W183.BLOOM) {
         this.O00000000(var14, var12, var13, -i / 2.0F, -i / 2.0F, i, i, j, k);
      }

      matrixStack.pop();
   }

   private void O00000000(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, float f, float g, float h, float i, int j, int k) {
      int var10 = j >> 16 & 0xFF;
      int var11 = j >> 8 & 0xFF;
      int var12 = j & 0xFF;
      O00000000O00.set(0.0F, 0.0F, 1.0F);
      matrix3f.transform(O00000000O00);
      O00000000O00.normalize();
      float var15 = f + h;
      float var16 = g + i;
      vertexConsumer.vertex(matrix4f, f, g, 0.0F)
         .color(var10, var11, var12, k)
         .texture(0.0F, 1.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(O00000000O00.x, O00000000O00.y, O00000000O00.z);
      vertexConsumer.vertex(matrix4f, var15, g, 0.0F)
         .color(var10, var11, var12, k)
         .texture(1.0F, 1.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(O00000000O00.x, O00000000O00.y, O00000000O00.z);
      vertexConsumer.vertex(matrix4f, var15, var16, 0.0F)
         .color(var10, var11, var12, k)
         .texture(1.0F, 0.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(O00000000O00.x, O00000000O00.y, O00000000O00.z);
      vertexConsumer.vertex(matrix4f, f, var16, 0.0F)
         .color(var10, var11, var12, k)
         .texture(0.0F, 0.0F)
         .overlay(OverlayTexture.DEFAULT_UV)
         .light(15728880)
         .normal(O00000000O00.x, O00000000O00.y, O00000000O00.z);
   }

   @Override
   public void a_() {
      super.a_();
      this.O0000000000O0();
   }

   @EventHandler
   public void O00000000(O0000000O000O o0000000O000O) {
      this.O0000000000O0();
   }

   public static class W182 {
      private Box O00000000;
      final Particles.W183 O000000000;
      private Vec3d O0000000000;
      private Vec3d O00000000000;
      private final int O000000000000;
      private final int O0000000000000;
      private final int O000000000000O;
      final float O00000000000O;
      private static final double O00000000000O0 = 0.05;
      private static final double O00000000000OO = 0.0035;
      private static final double O0000000000O = 0.985;
      private static final double O0000000000O0 = 0.55;
      private static final double O0000000000O00 = 0.72;
      private static final double O0000000000O0O = 0.003;
      private static final double O0000000000OO = 1.0E-6;
      private final double O0000000000OO0;
      private final O0000O00O0 O0000000000OOO = new O0000O00O0();
      final O0000O00O0OO O000000000O = new O0000O00O0OO();

      public W182(Particles.W183 o000000000, Vec3d vec3d, Vec3d vec3d2, int i, int j, int k, float f, double d) {
         double var10 = f / 2.0;
         this.O00000000 = new Box(new Vec3d(vec3d.x - var10, vec3d.y - var10, vec3d.z - var10), new Vec3d(vec3d.x + var10, vec3d.y + var10, vec3d.z + var10));
         this.O000000000 = o000000000;
         this.O0000000000 = vec3d;
         this.O00000000000 = vec3d2.multiply(0.05);
         this.O000000000000 = i;
         this.O0000000000000 = j;
         this.O000000000000O = k;
         this.O00000000000O = f;
         this.O0000000000OO0 = d;
         this.O0000000000OOO.O00000000();
      }

      public void O00000000(boolean bl, double d) {
         double var4 = d * 60.0 * this.O0000000000OO0;
         if (bl && Module.O0000000000.world != null) {
            this.O00000000000 = this.O00000000000.multiply(Math.pow(0.985, d * 60.0)).subtract(0.0, 0.0035 * d * 60.0, 0.0);
            this.O00000000(this.O00000000000.x * var4, 0);
            this.O00000000(this.O00000000000.y * var4, 1);
            this.O00000000(this.O00000000000.z * var4, 2);
         } else {
            this.O0000000000 = this.O0000000000.add(this.O00000000000.multiply(var4));
            this.O0000000000O0();
         }
      }

      private void O00000000(double d, int i) {
         if (!(Math.abs(d) <= 1.0E-6)) {
            Box var4 = switch (i) {
               case 0 -> this.O00000000.offset(d, 0.0, 0.0);
               case 1 -> this.O00000000.offset(0.0, d, 0.0);
               default -> this.O00000000.offset(0.0, 0.0, d);
            };
            if (this.O00000000(var4)) {
               this.O00000000(i);
            } else {
               this.O00000000 = var4;

               this.O0000000000 = switch (i) {
                  case 0 -> this.O0000000000.add(d, 0.0, 0.0);
                  case 1 -> this.O0000000000.add(0.0, d, 0.0);
                  default -> this.O0000000000.add(0.0, 0.0, d);
               };
            }
         }
      }

      private void O00000000(int i) {
         double var2 = this.O00000000000.x;
         double var4 = this.O00000000000.y;
         double var6 = this.O00000000000.z;
         switch (i) {
            case 0:
               var2 = -var2 * 0.55;
               break;
            case 1:
               if (var4 < 0.0) {
                  var2 *= 0.72;
                  var6 *= 0.72;
               }

               var4 = -var4 * 0.55;
               break;
            default:
               var6 = -var6 * 0.55;
         }

         this.O00000000000 = new Vec3d(this.O00000000(var2), this.O00000000(var4), this.O00000000(var6));
      }

      private double O00000000(double d) {
         return Math.abs(d) < 0.003 ? 0.0 : d;
      }

      private boolean O00000000(Box box) {
         int var2 = MathHelper.floor(box.minX + 1.0E-6);
         int var3 = MathHelper.floor(box.minY + 1.0E-6);
         int var4 = MathHelper.floor(box.minZ + 1.0E-6);
         int var5 = MathHelper.floor(box.maxX - 1.0E-6);
         int var6 = MathHelper.floor(box.maxY - 1.0E-6);
         int var7 = MathHelper.floor(box.maxZ - 1.0E-6);
         Mutable var8 = new Mutable();

         for (int var9 = var2; var9 <= var5; var9++) {
            for (int var10 = var3; var10 <= var6; var10++) {
               for (int var11 = var4; var11 <= var7; var11++) {
                  var8.set(var9, var10, var11);
                  VoxelShape var12 = Module.O0000000000.world.getBlockState(var8).getCollisionShape(Module.O0000000000.world, var8);
                  if (!var12.isEmpty()) {
                     for (Box var14 : var12.getBoundingBoxes()) {
                        if (box.intersects(var14.offset(var9, var10, var11))) {
                           return true;
                        }
                     }
                  }
               }
            }
         }

         return false;
      }

      private void O0000000000O0() {
         double var1 = this.O00000000000O / 2.0;
         this.O00000000 = new Box(
            new Vec3d(this.O0000000000.x - var1, this.O0000000000.y - var1, this.O0000000000.z - var1),
            new Vec3d(this.O0000000000.x + var1, this.O0000000000.y + var1, this.O0000000000.z + var1)
         );
      }

      @Generated
      public Box O00000000() {
         return this.O00000000;
      }

      @Generated
      public Particles.W183 O000000000() {
         return this.O000000000;
      }

      @Generated
      public Vec3d O0000000000() {
         return this.O0000000000;
      }

      @Generated
      public Vec3d O00000000000() {
         return this.O00000000000;
      }

      @Generated
      public int O000000000000() {
         return this.O000000000000;
      }

      @Generated
      public int O0000000000000() {
         return this.O0000000000000;
      }

      @Generated
      public int O000000000000O() {
         return this.O000000000000O;
      }

      @Generated
      public float O00000000000O() {
         return this.O00000000000O;
      }

      @Generated
      public double O00000000000O0() {
         return this.O0000000000OO0;
      }

      @Generated
      public O0000O00O0 O00000000000OO() {
         return this.O0000000000OOO;
      }

      @Generated
      public O0000O00O0OO O0000000000O() {
         return this.O000000000O;
      }
   }

   static enum W183 {
      HEART("heart", false),
      STAR("star", false),
      SNOW("snowflake", false),
      BLOOM("firefly", false),
      DOLLAR("dollar", false),
      TRIANGLE("triangle", false),
      SAKURA("sakura", false),
      GEMINI("genshin", false),
      SIMS("rhombus", false);

      private final Identifier O00000000;
      private final boolean O000000000;

      private W183(String string2, boolean bl) {
         this.O00000000 = Identifier.of("wild", "textures/world/" + string2 + ".png");
         this.O000000000 = bl;
      }

      @Generated
      public Identifier O00000000() {
         return this.O00000000;
      }

      @Generated
      public boolean O000000000() {
         return this.O000000000;
      }
   }
}
