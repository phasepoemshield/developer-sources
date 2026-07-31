package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Pair;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext.ShapeType;

public class Helper346 implements Helper160 {
   private static final int DATASET_SWITCH_MIN_HITS = 15;
   private static final int DATASET_SWITCH_MAX_HITS = 17;
   private static final int POINT_SWITCH_MIN_TICKS = 41;
   private static final int POINT_SWITCH_MAX_TICKS = 45;
   private static final int TELEPORT_TOP_CANDIDATES = 4;
   private static final double MAX_OFFSET_LENGTH = 0.5;
   private static final Helper342 DEFAULT_PRESET = new Helper342(
      new Helper345(0.0, 0.94, 0.0),
      new Helper345(0.0, 0.86, 0.0),
      new Helper345(0.0, 0.78, 0.0),
      new Helper345(0.0, 0.7, 0.0),
      new Helper345(0.0, 0.62, 0.0),
      new Helper345(0.0, 0.54, 0.0),
      new Helper345(0.0, 0.46, 0.0),
      new Helper345(0.24, 0.86, 0.0),
      new Helper345(-0.24, 0.86, 0.0),
      new Helper345(0.0, 0.86, 0.24),
      new Helper345(0.0, 0.86, -0.24),
      new Helper345(0.24, 0.78, 0.24),
      new Helper345(0.24, 0.78, -0.24),
      new Helper345(-0.24, 0.78, 0.24),
      new Helper345(-0.24, 0.78, -0.24),
      new Helper345(0.36, 0.7, 0.0),
      new Helper345(-0.36, 0.7, 0.0),
      new Helper345(0.0, 0.7, 0.36),
      new Helper345(0.0, 0.7, -0.36),
      new Helper345(0.22, 0.62, 0.22),
      new Helper345(0.22, 0.62, -0.22),
      new Helper345(-0.22, 0.62, 0.22),
      new Helper345(-0.22, 0.62, -0.22)
   );
   private static final Helper342 SPOOKY_PRESET = method3382();
   private static final Helper343[] DATASETS = new Helper343[]{
      new Helper343(0.14, 0.94, 0.7, 6, 0.24, true, 0.25, 0.0, 0.12, 0.16, 0.78),
      new Helper343(0.24, 0.98, 0.84, 10, 0.32, true, 0.2, 0.01, 0.16, 0.2, 0.66),
      new Helper343(0.1, 0.86, 0.54, 8, 0.38, true, 0.28, 0.02, 0.18, 0.24, 0.62),
      new Helper343(0.34, 0.99, 0.9, 12, 0.28, true, 0.18, 0.0, 0.14, 0.18, 0.7),
      new Helper343(0.42, 0.96, 0.78, 7, 0.18, false, 0.35, 0.03, 0.08, 0.1, 0.74),
      new Helper343(0.18, 0.74, 0.58, 9, 0.44, true, 0.22, 0.01, 0.22, 0.26, 0.58),
      new Helper343(0.52, 1.0, 0.92, 11, 0.2, true, 0.42, 0.0, 0.1, 0.14, 0.72),
      new Helper343(0.06, 0.68, 0.42, 7, 0.34, true, 0.3, 0.04, 0.2, 0.22, 0.6),
      new Helper343(0.3, 0.88, 0.64, 13, 0.46, true, 0.16, 0.02, 0.26, 0.28, 0.52),
      new Helper343(0.6, 0.99, 0.86, 6, 0.4, true, 0.24, 0.0, 0.18, 0.2, 0.64),
      new Helper343(0.12, 0.98, 0.76, 15, 0.12, false, 0.12, 0.06, 0.14, 0.12, 0.8),
      new Helper343(0.2, 0.9, 0.7, 5, 0.5, true, 0.26, 0.0, 0.3, 0.3, 0.48),
      new Helper343(0.36, 0.82, 0.72, 8, 0.26, true, 0.38, 0.02, 0.12, 0.18, 0.68),
      new Helper343(0.08, 0.52, 0.36, 6, 0.42, true, 0.32, 0.03, 0.24, 0.24, 0.56),
      new Helper343(0.7, 1.0, 0.94, 9, 0.3, true, 0.34, 0.01, 0.16, 0.16, 0.76),
      new Helper343(0.16, 0.92, 0.62, 12, 0.56, true, 0.18, 0.01, 0.34, 0.32, 0.44),
      new Helper343(0.28, 0.94, 0.82, 10, 0.08, false, 0.48, 0.08, 0.06, 0.08, 0.86),
      new Helper343(0.04, 0.98, 0.5, 16, 0.36, true, 0.1, 0.03, 0.28, 0.26, 0.5),
      new Helper343(0.48, 0.98, 0.88, 14, 0.52, true, 0.2, 0.0, 0.32, 0.34, 0.46),
      new Helper343(0.22, 0.78, 0.66, 4, 0.16, false, 0.55, 0.1, 0.04, 0.06, 0.9),
      new Helper343(0.1, 1.0, 0.8, 18, 0.48, true, 0.14, 0.02, 0.36, 0.36, 0.42),
      new Helper343(0.4, 0.9, 0.56, 9, 0.6, true, 0.24, 0.0, 0.4, 0.38, 0.4),
      new Helper343(0.58, 0.98, 0.74, 7, 0.24, true, 0.3, 0.04, 0.18, 0.18, 0.66)
   };
   private final Random random = new SecureRandom();
   private Vec3d offset = Vec3d.ZERO;
   private int datasetIndex = 0;
   private int lockedCandidateIndex = -1;
   private int lockedDatasetIndex = -1;
   private int lockedEntityId = -1;
   private int pointHoldTicks = 0;
   private int nextPointSwitchTicks = 0;
   private int lastAttackCount = 0;
   private int nextDatasetSwitchHitCount = -1;

   public Helper346() {
   }

   private static Helper342 method3382() {
      ArrayList<Helper345> var0 = new ArrayList<>();
      double[] var1 = new double[]{0.98, 0.94, 0.9, 0.86, 0.82, 0.78, 0.74, 0.7, 0.66, 0.62, 0.58, 0.54};

      for (double var5 : var1) {
         var0.add(new Helper345(0.0, var5, 0.0));
      }

      double[] var10 = new double[]{0.94, 0.9, 0.86};
      double[] var11 = new double[]{0.8, 0.74};
      double[] var12 = new double[]{0.68, 0.6};

      for (double var8 : var10) {
         method3383(var0, var8, 0.12);
         method3383(var0, var8, 0.2);
         method3384(var0, var8, 0.14);
      }

      for (double var20 : var11) {
         method3383(var0, var20, 0.16);
         method3383(var0, var20, 0.28);
         method3383(var0, var20, 0.38);
         method3384(var0, var20, 0.18);
         method3384(var0, var20, 0.28);
      }

      for (double var21 : var12) {
         method3383(var0, var21, 0.18);
         method3383(var0, var21, 0.32);
         method3384(var0, var21, 0.22);
         method3384(var0, var21, 0.32);
      }

      return new Helper342(var0.toArray(Helper345[]::new));
   }

   private static void method3383(List<Helper345> var0, double var1, double var3) {
      var0.add(new Helper345(var3, var1, 0.0));
      var0.add(new Helper345(-var3, var1, 0.0));
      var0.add(new Helper345(0.0, var1, var3));
      var0.add(new Helper345(0.0, var1, -var3));
   }

   private static void method3384(List<Helper345> var0, double var1, double var3) {
      var0.add(new Helper345(var3, var1, var3));
      var0.add(new Helper345(var3, var1, -var3));
      var0.add(new Helper345(-var3, var1, var3));
      var0.add(new Helper345(-var3, var1, -var3));
   }

   public Pair<Vec3d, Box> method3385(LivingEntity var1, float var2, Helper336 var3, Vec3d var4, boolean var5) {
      if (this.method3401()) {
         Pair var10 = this.method3387(var1, var2, var5);
         Vec3d var11 = this.method3394(var1, (List<Vec3d>)var10.getLeft(), (Box)var10.getRight(), var3, this.method3404());
         this.offset = Vec3d.ZERO;
         Vec3d var12 = var1.getEyePos();
         return new Pair<>((var11 == null ? var12 : var11).add(this.offset), (Box)var10.getRight());
      } else {
         Helper343 var6 = this.method3404();
         Pair var7 = this.method3389(var1, var2, var5, this.method3402());
         Vec3d var8 = this.method3394(var1, (List<Vec3d>)var7.getLeft(), (Box)var7.getRight(), var3, var6);
         Vec3d var9 = var1.getEyePos();
         return new Pair<>(var8 == null ? var9 : var8, (Box)var7.getRight());
      }
   }

   public Pair<List<Vec3d>, Box> method3386(LivingEntity var1, float var2, boolean var3) {
      return this.method3401() ? this.method3387(var1, var2, var3) : this.method3389(var1, var2, var3, this.method3402());
   }

   private Pair<List<Vec3d>, Box> method3387(LivingEntity var1, float var2, boolean var3) {
      Box var4 = var1.getBoundingBox();
      double var5 = var4.getLengthY() / 10.0;
      double var7 = var5 <= 0.0 ? 0.1 : var5;
      ArrayList var9 = new ArrayList();

      for (double var10 = var4.minY; var10 <= var4.maxY + 1.0E-4; var10 += var7) {
         Vec3d var12 = new Vec3d(var4.getCenter().x, var10, var4.getCenter().z);
         if (this.method3392(mc.player.getEyePos(), var12, var2, var3)) {
            var9.add(var12);
         }
      }

      return new Pair<>(var9, var4);
   }

   private Pair<List<Vec3d>, Box> method3388(LivingEntity var1, float var2, boolean var3, Helper343 var4) {
      Box var5 = var1.getBoundingBox();
      Vec3d var6 = var5.getCenter();
      double var7 = Math.max(var5.getLengthY(), 0.1);
      double var9 = var5.minY + var7 * var4.minHeight;
      double var11 = var5.minY + var7 * var4.maxHeight;
      double var13 = Math.max((var11 - var9) / Math.max(var4.verticalSamples, 1), 0.05);
      double var15 = Math.min(var5.getLengthX(), var5.getLengthZ()) * var4.lateralRadius;
      ArrayList var17 = new ArrayList();

      for (double var18 = var9; var18 <= var11 + 1.0E-4; var18 += var13) {
         this.method3391(var17, mc.player.getEyePos(), new Vec3d(var6.x, var18, var6.z), var2, var3);
         if (!(var15 <= 0.0)) {
            this.method3391(var17, mc.player.getEyePos(), new Vec3d(var6.x + var15, var18, var6.z), var2, var3);
            this.method3391(var17, mc.player.getEyePos(), new Vec3d(var6.x - var15, var18, var6.z), var2, var3);
            this.method3391(var17, mc.player.getEyePos(), new Vec3d(var6.x, var18, var6.z + var15), var2, var3);
            this.method3391(var17, mc.player.getEyePos(), new Vec3d(var6.x, var18, var6.z - var15), var2, var3);
            if (var4.diagonalPoints) {
               double var20 = var15 * 0.70710678118;
               this.method3391(var17, mc.player.getEyePos(), new Vec3d(var6.x + var20, var18, var6.z + var20), var2, var3);
               this.method3391(var17, mc.player.getEyePos(), new Vec3d(var6.x + var20, var18, var6.z - var20), var2, var3);
               this.method3391(var17, mc.player.getEyePos(), new Vec3d(var6.x - var20, var18, var6.z + var20), var2, var3);
               this.method3391(var17, mc.player.getEyePos(), new Vec3d(var6.x - var20, var18, var6.z - var20), var2, var3);
            }
         }
      }

      return new Pair<>(var17, var5);
   }

   private Pair<List<Vec3d>, Box> method3389(LivingEntity var1, float var2, boolean var3, Helper342 var4) {
      Box var5 = var1.getBoundingBox();
      Vec3d var6 = var5.getCenter();
      double var7 = Math.max(var5.getLengthY(), 0.1);
      double var9 = var5.getLengthX() * 0.5;
      double var11 = var5.getLengthZ() * 0.5;
      ArrayList var13 = new ArrayList();

      for (Helper345 var17 : var4.points) {
         Vec3d var18 = new Vec3d(var6.x + var9 * var17.x, var5.minY + var7 * var17.y, var6.z + var11 * var17.z);
         this.method3391(var13, mc.player.getEyePos(), var18, var2, var3);
      }

      return new Pair<>(var13, var5);
   }

   public boolean method3390(LivingEntity var1, float var2, boolean var3) {
      return this.method3401() ? !this.method3387(var1, var2, var3).getLeft().isEmpty() : !this.method3386(var1, var2, var3).getLeft().isEmpty();
   }

   private void method3391(List<Vec3d> var1, Vec3d var2, Vec3d var3, float var4, boolean var5) {
      if (this.method3392(var2, var3, var4, var5)) {
         var1.add(var3);
      }
   }

   private boolean method3392(Vec3d var1, Vec3d var2, float var3, boolean var4) {
      return var1.distanceTo(var2) <= var3 && (var4 || Helper324.method3225(var1, var2, ShapeType.COLLIDER).getType() != Type.BLOCK);
   }

   private Vec3d method3393(List<Vec3d> var1, Box var2, Helper336 var3, Helper343 var4) {
      return var1.stream().min(Comparator.comparingDouble(var4x -> this.method3397(mc.player.getEyePos(), var4x, var2, var3, var4))).orElse(null);
   }

   private Vec3d method3394(LivingEntity var1, List<Vec3d> var2, Box var3, Helper336 var4, Helper343 var5) {
      if (var2.isEmpty()) {
         this.method3405();
         return null;
      } else {
         this.pointHoldTicks++;
         boolean var6 = this.lockedEntityId != var1.getId();
         boolean var7 = this.nextPointSwitchTicks <= 0 || this.pointHoldTicks >= this.nextPointSwitchTicks;
         if (var6 || this.lockedDatasetIndex != this.datasetIndex || this.lockedCandidateIndex < 0 || this.lockedCandidateIndex >= var2.size() || var7) {
            this.lockedCandidateIndex = this.method3395(var2, var3, var4, var5, this.lockedCandidateIndex);
            this.lockedDatasetIndex = this.datasetIndex;
            this.lockedEntityId = var1.getId();
            this.pointHoldTicks = 0;
            this.nextPointSwitchTicks = this.method3406();
         }

         return (Vec3d)var2.get(this.lockedCandidateIndex);
      }
   }

   private int method3395(List<Vec3d> var1, Box var2, Helper336 var3, Helper343 var4, int var5) {
      ArrayList var6 = new ArrayList();

      for (int var7 = 0; var7 < var1.size(); var7++) {
         double var8 = this.method3397(mc.player.getEyePos(), (Vec3d)var1.get(var7), var2, var3, var4);
         var6.add(new Helper344(var7, var8));
      }

      var6.sort(Comparator.comparingDouble(Helper344::method3381));
      int var12 = Math.min(4, var6.size());
      if (var12 <= 1) {
         return ((Helper344)var6.get(0)).method3380();
      } else {
         ArrayList var13 = new ArrayList();
         Vec3d var9 = var5 >= 0 && var5 < var1.size() ? (Vec3d)var1.get(var5) : null;

         for (int var10 = 0; var10 < var12; var10++) {
            int var11 = ((Helper344)var6.get(var10)).method3380();
            if (var11 != var5 && (var9 == null || !(var9.distanceTo((Vec3d)var1.get(var11)) < 0.045))) {
               var13.add(var11);
            }
         }

         if (var13.isEmpty()) {
            for (int var14 = 0; var14 < var12; var14++) {
               int var15 = ((Helper344)var6.get(var14)).method3380();
               if (var15 != var5) {
                  var13.add(var15);
               }
            }
         }

         return var13.isEmpty() ? ((Helper344)var6.get(0)).method3380() : (Integer)var13.get(this.random.nextInt(var13.size()));
      }
   }

   private Vec3d method3396(List<Vec3d> var1, Helper336 var2) {
      return var1.stream().min(Comparator.comparingDouble(var2x -> this.method3398(mc.player.getEyePos(), var2x, var2))).orElse(null);
   }

   private double method3397(Vec3d var1, Vec3d var2, Box var3, Helper336 var4, Helper343 var5) {
      double var6 = this.method3398(var1, var2, var4);
      double var8 = Math.max(var3.getLengthY(), 0.1);
      double var10 = (var2.y - var3.minY) / var8;
      double var12 = Math.abs(var10 - var5.preferredHeight) * var5.heightBias;
      double var14 = Math.hypot(var2.x - var3.getCenter().x, var2.z - var3.getCenter().z);
      double var16 = var14 * var5.lateralBias;
      double var18 = this.random.nextDouble() * var5.randomScore;
      return var6 + var12 + var16 + var18;
   }

   private double method3398(Vec3d var1, Vec3d var2, Helper336 var3) {
      Helper336 var4 = Helper349.method3469(var2.subtract(var1));
      Helper336 var5 = Helper349.method3470(var3, var4);
      return Math.hypot(var5.method3333(), var5.method3334());
   }

   private void method3399(Vec3d var1, Helper343 var2) {
      Vec3d var3 = new Vec3d(
         this.random.nextGaussian() * var2.offsetScale * 0.45,
         this.random.nextGaussian() * var2.offsetScale * 0.22,
         this.random.nextGaussian() * var2.offsetScale * 0.45
      );
      if (var1 == null) {
         this.offset = this.method3403(this.offset.multiply(var2.offsetRetention).add(var3));
      } else {
         Vec3d var4 = new Vec3d(
            this.random.nextGaussian() * var1.x * var2.offsetScale * 2.0,
            this.random.nextGaussian() * var1.y * var2.offsetScale * 1.35,
            this.random.nextGaussian() * var1.z * var2.offsetScale * 2.0
         );
         this.offset = this.method3403(this.offset.multiply(var2.offsetRetention).add(var4).add(var3));
      }
   }

   private void method3400(Vec3d var1) {
      if (var1 == null) {
         this.offset = Vec3d.ZERO;
      } else {
         this.offset = new Vec3d(this.random.nextGaussian() * var1.x, this.random.nextGaussian() * var1.y, this.random.nextGaussian() * var1.z);
      }
   }

   private boolean method3401() {
      Aura var1 = Aura.getInstance();
      return var1 != null && var1.isState() && var1.getAimMode().method2385("FunTime");
   }

   private Helper342 method3402() {
      Aura var1 = Aura.getInstance();
      return var1 != null && var1.isState() && var1.getAimMode().method2385("SpookyTime") ? SPOOKY_PRESET : DEFAULT_PRESET;
   }

   private Vec3d method3403(Vec3d var1) {
      double var2 = var1.length();
      return !(var2 <= 0.5) && var2 != 0.0 ? var1.multiply(0.5 / var2) : var1;
   }

   private Helper343 method3404() {
      Helper331 var1 = Releon.method71().method33().method3250();
      int var2 = var1.method3291();
      if (this.nextDatasetSwitchHitCount >= 0 && var2 >= this.lastAttackCount) {
         this.lastAttackCount = var2;
         if (var2 < this.nextDatasetSwitchHitCount) {
            return DATASETS[this.datasetIndex];
         } else {
            int var3 = 1 + this.random.nextInt(DATASETS.length - 1);
            this.datasetIndex = (this.datasetIndex + var3) % DATASETS.length;
            this.method3405();
            this.nextDatasetSwitchHitCount = var2 + this.method3407();
            return DATASETS[this.datasetIndex];
         }
      } else {
         this.lastAttackCount = var2;
         this.nextDatasetSwitchHitCount = var2 + this.method3407();
         return DATASETS[this.datasetIndex];
      }
   }

   private void method3405() {
      this.lockedCandidateIndex = -1;
      this.lockedDatasetIndex = -1;
      this.lockedEntityId = -1;
      this.pointHoldTicks = 0;
      this.nextPointSwitchTicks = 0;
   }

   private int method3406() {
      return 41 + this.random.nextInt(5);
   }

   private int method3407() {
      return 15 + this.random.nextInt(3);
   }

   public Random method3408() {
      return this.random;
   }

   public Vec3d method3409() {
      return this.offset;
   }

   public int method3410() {
      return this.datasetIndex;
   }

   public int method3411() {
      return this.lockedCandidateIndex;
   }

   public int method3412() {
      return this.lockedDatasetIndex;
   }

   public int method3413() {
      return this.lockedEntityId;
   }

   public int method3414() {
      return this.pointHoldTicks;
   }

   public int method3415() {
      return this.nextPointSwitchTicks;
   }

   public int method3416() {
      return this.lastAttackCount;
   }

   public int method3417() {
      return this.nextDatasetSwitchHitCount;
   }
}
