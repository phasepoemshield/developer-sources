package l;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Heightmap.Type;
import org.joml.Vector4i;

public class Particles extends Helper242 {
   private Setting5 modetype = new Setting5("Мод", "Выберите тип частиц").method2381("2D").method2383("2D");
   private Setting5 particleType = new Setting5("Тип частиц", "Выбор типа")
      .method2381("Звезды", "Снег", "Глоу", "Череп", "Снежинки", "Сердечко")
      .method2382(() -> this.modetype.method2385("2D"));
   private Setting3 spawnFromGround = new Setting3("От земли", "Спавн частиц от земли").method2201(true).method2199(() -> this.modetype.method2385("2D"));
   Setting3 collision = new Setting3("Коллизия", "Коллизия частиц").method2201(true).method2199(() -> this.modetype.method2385("2D"));
   Setting3 scale = new Setting3("Скейл", "Масштабирование по альфе").method2201(true).method2199(() -> this.modetype.method2385("2D"));
   private Setting2 particleCount = new Setting2("Количество", "Количество кристаллов в мире")
      .method2079(10, 200)
      .method2086(50.0F)
      .method2081(() -> this.modetype.method2385("3D"));
   private Setting2 range = new Setting2("Дальность", "Дальность спавна кристаллов от игрока")
      .method2079(8, 64)
      .method2086(32.0F)
      .method2081(() -> this.modetype.method2385("3D"));
   private Setting2 size = new Setting2("Размер", "Размер кристаллов")
      .method2078(0.05F, 0.15F)
      .method2086(0.09F)
      .method2081(() -> this.modetype.method2385("3D"));
   private Setting2 maxParticles = new Setting2("Макс количество", "Максимальное количество частиц")
      .method2079(10, 200)
      .method2086(50.0F)
      .method2081(() -> this.modetype.method2385("2D"));
   private Setting2 spawnRate = new Setting2("Спавн/сек", "Количество спавна частиц в секунду")
      .method2078(10.0F, 200.0F)
      .method2086(15.0F)
      .method2081(() -> this.modetype.method2385("2D"));
   private Setting2 spawnHeight = new Setting2("Высота спавна", "Высота спавна частиц")
      .method2078(0.05F, 30.0F)
      .method2086(10.0F)
      .method2081(() -> this.modetype.method2385("2D"));
   Setting2 particleGravity = new Setting2("Гравитация", "Гравитация частиц")
      .method2078(-10.0F, 10.0F)
      .method2086(0.0F)
      .method2081(() -> this.modetype.method2385("2D"));
   Setting2 motionPower = new Setting2("Сила движения", "Сила движения частиц")
      .method2078(0.1F, 2.0F)
      .method2086(1.0F)
      .method2081(() -> this.modetype.method2385("2D"));
   Setting2 inclineX = new Setting2("Наклон X", "Наклон полета по X")
      .method2078(-17.5F, 17.5F)
      .method2086(0.0F)
      .method2081(() -> this.modetype.method2385("2D"));
   Setting2 inclineZ = new Setting2("Наклон Z", "Наклон полета по Z")
      .method2078(-17.5F, 17.5F)
      .method2086(0.0F)
      .method2081(() -> this.modetype.method2385("2D"));
   private Setting2 particleSize = new Setting2("Размер", "Размер частиц")
      .method2086(1.0F)
      .method2078(0.5F, 2.0F)
      .method2081(() -> this.modetype.method2385("2D"));
   private Setting2 lifeTime = new Setting2("Время жизни", "Время жизни частиц в мс")
      .method2086(800.0F)
      .method2078(250.0F, 3000.0F)
      .method2081(() -> this.modetype.method2385("2D"));
   private Setting2 spawnRange = new Setting2("Радиус спавна", "Радиус спавна")
      .method2086(25.0F)
      .method2078(10.0F, 50.0F)
      .method2081(() -> this.modetype.method2385("2D"));
   private Setting7 particleColor = new Setting7("Цвет", "Цвет кристаллов")
      .method2550(new Color(255, 255, 255, 55).getRGB())
      .method2551(
         new Color(0, 246, 255, 255).getRGB(), new Color(183, 1, 195, 255).getRGB(), new Color(255, 60, 0, 255).getRGB(), new Color(171, 253, 0, 255).getRGB()
      );
   private Setting3 totemPop = new Setting3("Totem Pop", "Spawn burst particles on totem pop")
      .method2201(true)
      .method2199(() -> this.modetype.method2385("2D"));
   private Setting2 totemCount = new Setting2("Totem Count", "Burst particle count")
      .method2086(70.0F)
      .method2078(10.0F, 200.0F)
      .method2081(() -> this.modetype.method2385("2D") && this.totemPop.method2200());
   private Setting2 totemSpeed = new Setting2("Totem Speed", "Burst particle speed")
      .method2086(4.0F)
      .method2078(0.5F, 10.0F)
      .method2081(() -> this.modetype.method2385("2D") && this.totemPop.method2200());
   private Setting2 totemLifetime = new Setting2("Totem Lifetime", "Burst lifetime in ms")
      .method2086(1500.0F)
      .method2078(300.0F, 5000.0F)
      .method2081(() -> this.modetype.method2385("2D") && this.totemPop.method2200());
   private final List<Helper287> crystalList = new ArrayList<>();
   private final List<Helper288> particles = new ArrayList<>();
   private final List<Helper288> totemParticles = new ArrayList<>();
   private final Random random = new Random();
   private int previousParticleCount;
   private long lastSpawnTime = 0L;

   public static Particles method2826() {
      return Helper222.method1979(Particles.class);
   }

   public Particles() {
      super("Particles", "Particles", Helper269.RENDER);
      this.setup(
         new Helper264[]{
            this.particleType,
            this.spawnFromGround,
            this.collision,
            this.scale,
            this.particleCount,
            this.range,
            this.size,
            this.maxParticles,
            this.spawnRate,
            this.spawnHeight,
            this.particleGravity,
            this.motionPower,
            this.inclineX,
            this.inclineZ,
            this.particleSize,
            this.lifeTime,
            this.spawnRange,
            this.particleColor,
            this.totemPop,
            this.totemCount,
            this.totemSpeed,
            this.totemLifetime
         }
      );
      this.previousParticleCount = this.particleCount.method2080();
      this.lastSpawnTime = System.currentTimeMillis();
   }

   @Override
   public void activate() {
      super.activate();
      if (this.modetype.method2386().equals("3D")) {
         this.method2830();
      }

      this.previousParticleCount = this.particleCount.method2080();
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.crystalList.clear();
      this.particles.clear();
      this.totemParticles.clear();
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (mc.player != null) {
         Helper146.INSTANCE.method1221();
         if (this.modetype.method2386().equals("3D")) {
            int var2 = this.particleCount.method2080();
            if (var2 != this.previousParticleCount) {
               this.method2827(var2);
               this.previousParticleCount = var2;
            }

            this.method2832();
            this.method2836(var1.method3708());
         } else {
            long var9 = System.currentTimeMillis();
            double var4 = 1000.0 / this.spawnRate.method2082();
            if (var9 - this.lastSpawnTime >= var4 && this.particles.size() < this.maxParticles.method2080()) {
               this.method2838();
               this.lastSpawnTime = var9;
            }

            if (this.particles.size() > this.maxParticles.method2080()) {
               Iterator var6 = this.particles.iterator();

               while (var6.hasNext() && this.particles.size() > this.maxParticles.method2080()) {
                  var6.next();
                  var6.remove();
               }
            }

            Iterator var10 = this.particles.iterator();

            while (var10.hasNext()) {
               Helper288 var7 = (Helper288)var10.next();
               var7.method2825();
               if (var7.method2822()) {
                  var10.remove();
               }
            }

            Iterator var11 = this.totemParticles.iterator();

            while (var11.hasNext()) {
               Helper288 var8 = (Helper288)var11.next();
               var8.method2825();
               if (var8.method2822()) {
                  var11.remove();
               }
            }

            this.method2841(var1.method3708(), this.particles);
            this.method2841(var1.method3708(), this.totemParticles);
         }
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (this.totemPop.method2200() && mc.world != null && this.modetype.method2385("2D")) {
         if (var1.method3895() instanceof EntityStatusS2CPacket var2) {
            if (var2.getStatus() == 35) {
               if (var2.getEntity(mc.world) instanceof LivingEntity var5) {
                  this.method2839(var5.getX(), var5.getY() + var5.getHeight() * 0.5, var5.getZ());
               }
            }
         }
      }
   }

   private void method2827(int var1) {
      int var2 = this.crystalList.size();
      if (var1 > var2) {
         this.method2828(var1 - var2);
      } else if (var1 < var2) {
         this.method2829(var2 - var1);
      }
   }

   private void method2828(int var1) {
      if (mc.player != null) {
         Vec3d var2 = mc.player.getPos();
         float var3 = this.range.method2082();

         for (int var4 = 0; var4 < var1; var4++) {
            int var6 = 0;

            Vec3d var5;
            do {
               double var7 = var2.x + (this.random.nextDouble() - 0.5) * 2.0 * var3;
               double var9 = var2.y + (this.random.nextDouble() - 0.5) * var3;
               double var11 = var2.z + (this.random.nextDouble() - 0.5) * 2.0 * var3;
               var5 = new Vec3d(var7, var9, var11);
            } while (!this.method2835(var5) && ++var6 < 20);

            Vec3d var13 = new Vec3d((this.random.nextDouble() - 0.5) * 0.02, (this.random.nextDouble() - 0.5) * 0.02, (this.random.nextDouble() - 0.5) * 0.02);
            Vec3d var8 = new Vec3d(this.random.nextDouble() * 360.0, this.random.nextDouble() * 360.0, this.random.nextDouble() * 360.0);
            this.crystalList.add(new Helper287(var5, var13, var8));
         }
      }
   }

   private void method2829(int var1) {
      int var2 = 0;

      for (Helper287 var4 : this.crystalList) {
         if (var2 >= var1) {
            break;
         }

         if (!var4.markedForDeath && !var4.isFadingOut) {
            var4.markedForDeath = true;
            var4.isFadingOut = true;
            var2++;
         }
      }
   }

   private void method2830() {
      this.crystalList.clear();
      if (mc.player != null) {
         Vec3d var1 = mc.player.getPos();
         int var2 = this.particleCount.method2080();
         float var3 = this.range.method2082();

         for (int var4 = 0; var4 < var2; var4++) {
            int var6 = 0;

            Vec3d var5;
            do {
               double var7 = var1.x + (this.random.nextDouble() - 0.5) * 2.0 * var3;
               double var9 = var1.y + (this.random.nextDouble() - 0.5) * var3;
               double var11 = var1.z + (this.random.nextDouble() - 0.5) * 2.0 * var3;
               var5 = new Vec3d(var7, var9, var11);
            } while (!this.method2835(var5) && ++var6 < 20);

            Vec3d var13 = new Vec3d((this.random.nextDouble() - 0.5) * 0.02, (this.random.nextDouble() - 0.5) * 0.02, (this.random.nextDouble() - 0.5) * 0.02);
            Vec3d var8 = new Vec3d(this.random.nextDouble() * 360.0, this.random.nextDouble() * 360.0, this.random.nextDouble() * 360.0);
            this.crystalList.add(new Helper287(var5, var13, var8));
         }
      }
   }

   private boolean method2831(Vec3d var1) {
      if (mc.world != null && mc.player != null) {
         Vec3d var2 = mc.gameRenderer.getCamera().getPos();
         Vec3d var3 = var1.subtract(var2).normalize();
         double var4 = var1.distanceTo(var2);
         double var6 = 0.5;

         for (double var8 = 0.0; var8 < var4; var8 += var6) {
            Vec3d var10 = var2.add(var3.multiply(var8));
            BlockPos var11 = BlockPos.ofFloored(var10);
            if (!mc.world.getBlockState(var11).isAir()) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void method2832() {
      if (mc.player != null) {
         Vec3d var1 = mc.player.getPos();
         float var2 = this.range.method2082();
         float var3 = 0.05F;
         Iterator var4 = this.crystalList.iterator();

         while (var4.hasNext()) {
            Helper287 var5 = (Helper287)var4.next();
            var5.prevPosition = var5.position;
            var5.position = var5.position.add(var5.velocity);
            boolean var6 = this.method2831(var5.position);
            boolean var7 = this.method2835(var5.position);
            if (var5.markedForDeath) {
               var5.fadeAlpha -= var3;
               if (var5.fadeAlpha <= 0.0F) {
                  var4.remove();
               }
            } else {
               if (!var6 && var7) {
                  if (var5.isFadingOut) {
                     var5.isFadingOut = false;
                  }
               } else if (!var5.isFadingOut) {
                  var5.isFadingOut = true;
               }

               if (var5.isFadingOut) {
                  var5.fadeAlpha -= var3;
                  if (var5.fadeAlpha <= 0.0F) {
                     var5.fadeAlpha = 0.0F;
                     int var9 = 0;

                     Vec3d var8;
                     do {
                        double var10 = var1.x + (this.random.nextDouble() - 0.5) * 2.0 * var2;
                        double var12 = var1.y + (this.random.nextDouble() - 0.5) * var2;
                        double var14 = var1.z + (this.random.nextDouble() - 0.5) * 2.0 * var2;
                        var8 = new Vec3d(var10, var12, var14);
                     } while (!this.method2835(var8) && ++var9 < 20);

                     var5.position = var8;
                     var5.prevPosition = var5.position;
                     var5.isFadingOut = false;
                  }
               } else {
                  var5.fadeAlpha += var3;
                  if (var5.fadeAlpha > 1.0F) {
                     var5.fadeAlpha = 1.0F;
                  }
               }

               if (var5.position.distanceTo(var1) > var2 * 1.5) {
                  int var17 = 0;

                  Vec3d var16;
                  do {
                     double var18 = var1.x + (this.random.nextDouble() - 0.5) * 2.0 * var2;
                     double var19 = var1.y + (this.random.nextDouble() - 0.5) * var2;
                     double var20 = var1.z + (this.random.nextDouble() - 0.5) * 2.0 * var2;
                     var16 = new Vec3d(var18, var19, var20);
                  } while (!this.method2835(var16) && ++var17 < 20);

                  var5.position = var16;
                  var5.prevPosition = var5.position;
                  var5.fadeAlpha = 0.0F;
                  var5.isFadingOut = false;
               }
            }
         }
      }
   }

   float method2833() {
      Camera var1 = mc.gameRenderer.getCamera();
      return var1.getYaw();
   }

   private Vec3d method2834() {
      Camera var1 = mc.gameRenderer.getCamera();
      return Vec3d.fromPolar(var1.getPitch(), var1.getYaw());
   }

   boolean method2835(Vec3d var1) {
      if (mc.gameRenderer.getCamera() == null) {
         return true;
      } else {
         Camera var2 = mc.gameRenderer.getCamera();
         Vec3d var3 = var2.getPos();
         Vec3d var4 = this.method2834();
         Vec3d var5 = var1.subtract(var3).normalize();
         return var4.dotProduct(var5) > 0.1;
      }
   }

   private void method2836(MatrixStack var1) {
      if (mc.player != null && !this.crystalList.isEmpty()) {
         Camera var2 = mc.gameRenderer.getCamera();
         RenderSystem.enableDepthTest();
         RenderSystem.depthFunc(515);

         for (Helper287 var4 : this.crystalList) {
            if (!(var4.fadeAlpha <= 0.0F)) {
               float var5 = mc.getRenderTickCounter().getTickDelta(false);
               Vec3d var6 = var4.prevPosition.lerp(var4.position, var5);
               if (this.method2835(var6) || var4.isFadingOut) {
                  var1.push();
                  var1.translate(var6.x, var6.y, var6.z);
                  float var7 = 1.0F + (float)(Math.sin(System.currentTimeMillis() / 500.0) * 0.1F);
                  var1.scale(var7, var7, var7);
                  float var8 = (float)(System.currentTimeMillis() % 36000L) / 100.0F * var4.rotationSpeed;
                  var1.multiply(RotationAxis.POSITIVE_X.rotationDegrees((float)var4.rotation.x));
                  var1.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float)var4.rotation.y + var8));
                  var1.multiply(RotationAxis.POSITIVE_Z.rotationDegrees((float)var4.rotation.z));
                  var4.method2817(var1, this.particleColor.method2553(), var2, this.size.method2082(), 8.0F);
                  var1.pop();
               }
            }
         }
      }
   }

   private Vec3d method2837() {
      return new Vec3d((this.random.nextDouble() - 0.5) * 0.08, this.random.nextDouble() * 0.05, (this.random.nextDouble() - 0.5) * 0.08);
   }

   private void method2838() {
      if (mc.player != null && mc.world != null) {
         double var1 = this.spawnRange.method2082();
         double var3 = (this.random.nextDouble() - 0.5) * 2.0 * var1;
         double var5 = (this.random.nextDouble() - 0.5) * 2.0 * var1;
         Vec3d var7 = mc.player.getPos().add(var3, 0.0, var5);
         BlockPos var8;
         if (this.spawnFromGround.method2200()) {
            var8 = mc.world.getTopPosition(Type.MOTION_BLOCKING, BlockPos.ofFloored(var7));
         } else {
            double var9 = this.random.nextDouble() * this.spawnHeight.method2082();
            var8 = BlockPos.ofFloored(mc.player.getPos().add(var3, var9, var5));
         }

         Vec3d var14 = new Vec3d(var8.getX() + 0.5, var8.getY(), var8.getZ() + 0.5);
         BlockPos var10 = BlockPos.ofFloored(var14);
         if (mc.world.getBlockState(var10).isAir() && this.method2835(var14)) {
            Vec3d var11 = this.method2837().multiply(this.motionPower.method2082());
            int var12 = (int)this.lifeTime.method2082() + this.random.nextInt(50) - 25;
            var12 = Math.max(150, var12);
            int var13 = this.particleColor.method2553();
            this.particles.add(new Helper288(this, var14, var11, var12, var13));
         }
      }
   }

   private void method2839(double var1, double var3, double var5) {
      int var7 = this.totemCount.method2080();
      int var8 = (int)this.totemLifetime.method2082();
      double var9 = this.totemSpeed.method2082() * 0.01;

      for (int var11 = 0; var11 < var7; var11++) {
         double var12 = this.random.nextDouble() * Math.PI * 2.0;
         double var14 = this.random.nextDouble() * Math.PI;
         double var16 = 0.5 + this.random.nextDouble() * 0.5;
         Vec3d var18 = new Vec3d(Math.sin(var12) * Math.sin(var14) * var16, Math.cos(var14) * var16, Math.cos(var12) * Math.sin(var14) * var16).multiply(var9);
         Vec3d var19 = new Vec3d(var1 + this.method2840(-0.3, 0.3), var3 + this.method2840(-0.3, 0.3), var5 + this.method2840(-0.3, 0.3));
         int var20 = this.random.nextDouble() < 0.7 ? new Color(0, 255, 0, 255).getRGB() : new Color(255, 255, 0, 255).getRGB();
         this.totemParticles.add(new Helper288(this, var19, var18, var8, var20));
      }
   }

   private double method2840(double var1, double var3) {
      return this.random.nextDouble() * (var3 - var1) + var1;
   }

   private void method2841(MatrixStack var1, List<Helper288> var2) {
      Camera var3 = mc.gameRenderer.getCamera();
      Vec3d var4 = var3.getPos();
      RenderSystem.enableDepthTest();
      RenderSystem.depthFunc(515);
      RenderSystem.depthMask(true);
      String var6 = this.particleType.method2386();

      String var5 = switch (var6) {
         case "Снег" -> "textures/particles/show1.png";
         case "Череп" -> "textures/particles/ded1.png";
         case "Сердечко" -> "textures/particles/heart1.png";
         case "Снежинки" -> "textures/particles/snownew1.png";
         case "Глоу" -> "textures/particles/glow.png";
         default -> "textures/particles/star1.png";
      };
      Identifier var27 = Identifier.of(var5);

      for (Helper288 var8 : var2) {
         float var9 = var8.method2823();
         if (!(var9 <= 0.0F) && !this.method2831(var8.pos)) {
            float var10 = var8.method2824();
            Color var11 = new Color(var8.colorInt);
            int var12 = var11.getRed();
            int var13 = var11.getGreen();
            int var14 = var11.getBlue();
            int var16 = (int)(var9 * 255.0F);
            int var17 = new Color(var12, var13, var14, var16).getRGB();
            double var18 = var8.pos.x - var4.x;
            double var20 = var8.pos.y - var4.y;
            double var22 = var8.pos.z - var4.z;
            MatrixStack var24 = new MatrixStack();
            var24.push();
            var24.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var3.getPitch()));
            var24.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var3.getYaw() + 180.0F));
            var24.translate(var18, var20, var22);
            var24.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-var3.getYaw()));
            var24.multiply(RotationAxis.POSITIVE_X.rotationDegrees(var3.getPitch()));
            float var25 = this.particleSize.method2082();
            float var26 = var25 * var10;
            Helper183.method1568(var24.peek(), var27, -var26 / 1.0F, -var26 / 2.0F, var26, var26, new Vector4i(var17), false);
            var24.pop();
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableDepthTest();
   }
}
