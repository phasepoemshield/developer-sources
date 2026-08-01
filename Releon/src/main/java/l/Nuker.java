package l;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public class Nuker extends Helper242 {
   private static final double MINING_REACH = 4.5;
   public BlockPos pos;
   private VoxelShape shape;
   private BlockPos lockedTarget;
   private final List<float[]> recordedFrames = new ArrayList<>();
   private int replayIndex;
   private float lastYaw;
   private float lastPitch;
   private final Setting5 modeSetting = new Setting5("Режим", "Режим работы Nuker").method2381("Авто", "Record", "Replay").method2383("Авто");
   private final Setting3 rotateSetting = new Setting3("Ротация", "Копать только после наведения на цель").method2201(true);
   private final Setting3 silentRotateSetting = new Setting3("Тихая ротация", "Поворачивать серверно без дёргания камеры")
      .method2201(true)
      .method2199(this.rotateSetting::method2200);
   private final Setting3 fastAimSetting = new Setting3("Быстрая наводка", "Мгновенное наведение в движении")
      .method2201(false)
      .method2199(this.rotateSetting::method2200);
   private final Setting3 runMineSetting = new Setting3("Копать на бегу", "В режиме Авто копать в движении без строгой проверки прицела")
      .method2201(true);
   private final Setting3 prioritizeOresSetting = new Setting3("Приоритет руд", "В режиме Авто предпочитать руды обычным блокам")
      .method2201(true)
      .method2199(() -> this.modeSetting.method2385("Авто"));
   private final Setting8 targetBlocksSetting = new Setting8("Целевые блоки", "Копать только выбранные блоки")
      .method2585("Алмаз", "Древние обломки", "Изумруд", "Золото", "Железо", "Лазурит", "Редстоун", "Уголь", "Медь", "Кварц", "Камень")
      .method2586("Алмаз", "Древние обломки", "Изумруд", "Золото", "Железо", "Камень");
   private final Setting3 downSetting = new Setting3("Копать вниз", "Разрешить копать блоки ниже игрока").method2201(true);
   private final Setting2 radiusSetting = new Setting2("Радиус", "Копать блоки в радиусе вокруг игрока").method2086(3.0F).method2079(1, 6);
   private final Setting2 breakDelaySetting = new Setting2("Скорость копания", "Задержка между ударами по блоку (тики)")
      .method2086(2.0F)
      .method2079(0, 10);
   private final Setting2 rotateSmoothSetting = new Setting2("Скорость ротации", "Сглаживание поворота камеры")
      .method2086(0.35F)
      .method2078(0.05F, 1.0F)
      .method2081(this.rotateSetting::method2200);
   private final Setting2 yawStepSetting = new Setting2("Шаг Yaw", "Максимальное изменение yaw за тик")
      .method2086(8.0F)
      .method2078(1.0F, 30.0F)
      .method2081(this.rotateSetting::method2200);
   private final Setting2 pitchStepSetting = new Setting2("Шаг Pitch", "Максимальное изменение pitch за тик")
      .method2086(6.0F)
      .method2078(1.0F, 30.0F)
      .method2081(this.rotateSetting::method2200);
   private final Setting2 replayInfluenceSetting = new Setting2("Влияние повтора", "Насколько записанный стиль влияет на повтор")
      .method2086(0.8F)
      .method2078(0.0F, 1.0F)
      .method2081(() -> this.rotateSetting.method2200() && this.modeSetting.method2385("Replay"));
   private final Setting2 aimToleranceSetting = new Setting2("Допуск наведения", "Максимальная ошибка прицеливания перед копанием")
      .method2086(10.0F)
      .method2078(1.0F, 25.0F)
      .method2081(this.rotateSetting::method2200);
   private int breakTickCounter;
   private int retargetCooldownTicks;

   public Nuker() {
      super("Nuker", Helper269.PLAYER);
      this.setup(
         new Helper264[]{
            this.modeSetting,
            this.rotateSetting,
            this.silentRotateSetting,
            this.fastAimSetting,
            this.runMineSetting,
            this.prioritizeOresSetting,
            this.targetBlocksSetting,
            this.downSetting,
            this.radiusSetting,
            this.breakDelaySetting,
            this.rotateSmoothSetting,
            this.yawStepSetting,
            this.pitchStepSetting,
            this.replayInfluenceSetting,
            this.aimToleranceSetting
         }
      );
   }

   @Override
   public void activate() {
      super.activate();
      if (mc.player != null) {
         this.lastYaw = mc.player.getYaw();
         this.lastPitch = mc.player.getPitch();
      }

      this.replayIndex = 0;
      this.breakTickCounter = 0;
      this.retargetCooldownTicks = 0;
      if (this.modeSetting.method2385("Record")) {
         this.recordedFrames.clear();
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (this.pos != null && this.shape != null && !this.shape.isEmpty()) {
         Helper183.method1542(this.pos, this.shape, Helper133.method1162(), 2.0F);
      }
   }

   @Helper104
   public void onRotationUpdate(Event28 var1) {
      if (var1.method4225() == 0) {
         if (this.retargetCooldownTicks > 0) {
            this.retargetCooldownTicks--;
         }

         if (this.modeSetting.method2385("Record")) {
            this.method2243();
            return;
         }

         if (this.modeSetting.method2385("Replay")) {
            this.method2244();
            return;
         }

         if (this.lockedTarget == null || !this.method2257(this.lockedTarget) || this.retargetCooldownTicks <= 0 && this.method2247(this.lockedTarget)) {
            this.lockedTarget = this.method2246();
            if (this.lockedTarget != null) {
               this.retargetCooldownTicks = 3;
            }
         }

         this.pos = this.lockedTarget;
         if (this.pos != null) {
            if (this.method2252()) {
               this.method2253(this.pos);
            }

            this.shape = mc.world.getBlockState(this.pos).getOutlineShape(mc.world, this.pos);
            Direction var2 = this.method2261(this.pos);
            if (this.method2255(this.pos, var2) && this.breakTickCounter <= 0) {
               mc.interactionManager.updateBlockBreakingProgress(this.pos, var2);
               mc.player.swingHand(Hand.MAIN_HAND);
               this.breakTickCounter = this.breakDelaySetting.method2080();
            } else {
               this.breakTickCounter--;
            }
         } else {
            this.shape = null;
            this.breakTickCounter = 0;
         }
      }
   }

   private void method2243() {
      if (mc.player != null) {
         float var1 = mc.player.getYaw();
         float var2 = mc.player.getPitch();
         float var3 = MathHelper.wrapDegrees(var1 - this.lastYaw);
         float var4 = var2 - this.lastPitch;
         if (Math.abs(var3) > 0.01F || Math.abs(var4) > 0.01F) {
            this.recordedFrames.add(new float[]{var3, var4});
            if (this.recordedFrames.size() > 600) {
               this.recordedFrames.remove(0);
            }
         }

         this.lastYaw = var1;
         this.lastPitch = var2;
         this.pos = null;
         this.shape = null;
      }
   }

   private void method2244() {
      if (mc.player == null) {
         this.pos = null;
         this.shape = null;
      } else {
         if (this.lockedTarget == null || !this.method2257(this.lockedTarget) || this.method2248(this.lockedTarget)) {
            this.lockedTarget = this.method2245();
         }

         this.pos = this.lockedTarget;
         if (this.pos == null) {
            this.shape = null;
            this.breakTickCounter = 0;
         } else {
            float var1 = 0.0F;
            float var2 = 0.0F;
            if (!this.recordedFrames.isEmpty()) {
               if (this.replayIndex >= this.recordedFrames.size()) {
                  this.replayIndex = 0;
               }

               float[] var3 = this.recordedFrames.get(this.replayIndex++);
               var1 = var3[0];
               var2 = var3[1];
            }

            if (this.rotateSetting.method2200()) {
               if (this.fastAimSetting.method2200()) {
                  this.method2253(this.pos);
               } else {
                  Helper336 var21 = Helper349.method3471(this.pos.toCenterPos());
                  float var4 = MathHelper.clamp(this.rotateSmoothSetting.method2082(), 0.05F, 1.0F);
                  float var5 = mc.player.getYaw();
                  float var6 = mc.player.getPitch();
                  float var7 = MathHelper.wrapDegrees(var21.method3333() - var5);
                  float var8 = var21.method3334() - var6;
                  float var9 = MathHelper.clamp(this.yawStepSetting.method2082(), 1.0F, 30.0F);
                  float var10 = MathHelper.clamp(this.pitchStepSetting.method2082(), 1.0F, 30.0F);
                  float var11 = MathHelper.clamp(this.replayInfluenceSetting.method2082(), 0.0F, 1.0F);
                  float var12 = Math.max(1.0F, Math.abs(var1));
                  float var13 = Math.max(1.0F, Math.abs(var2));
                  float var14 = MathHelper.lerp(var11, var9, var12);
                  float var15 = MathHelper.lerp(var11, var10, var13);
                  float var16 = var5 + MathHelper.clamp(var7 * var4, -var14, var14);
                  float var17 = var6 + MathHelper.clamp(var8 * var4, -var15, var15);
                  float var18 = 0.1F * var11;
                  float var19 = var16 + var1 * var18;
                  float var20 = MathHelper.clamp(var17 + var2 * var18, -89.0F, 89.0F);
                  this.method2254(var19, var20);
               }
            }

            this.shape = mc.world.getBlockState(this.pos).getOutlineShape(mc.world, this.pos);
            Direction var22 = this.method2261(this.pos);
            if (this.method2255(this.pos, var22) && this.breakTickCounter <= 0) {
               mc.interactionManager.updateBlockBreakingProgress(this.pos, var22);
               mc.player.swingHand(Hand.MAIN_HAND);
               this.breakTickCounter = this.breakDelaySetting.method2080();
            } else {
               this.breakTickCounter--;
            }
         }
      }
   }

   private BlockPos method2245() {
      if (mc.player == null) {
         return null;
      } else {
         List<net.minecraft.util.math.BlockPos> var1 = Helper38.method533(
               mc.player.getBlockPos(), this.radiusSetting.method2080(), this.radiusSetting.method2080(), this.downSetting.method2200()
            )
            .stream()
            .filter(this::method2257)
            .toList();
         if (var1.isEmpty()) {
            return null;
         } else {
            Vec3d var2 = this.method2249();
            Vec3d var3 = mc.player.getEyePos();
            return var1.stream().min(Comparator.comparingDouble(var2x -> {
               Vec3d var3x = var2x.toCenterPos();
               Vec3d var4 = var3x.subtract(var3);
               double var5 = var4.length();
               if (var5 < 1.0E-4) {
                  return Double.MAX_VALUE;
               } else {
                  Vec3d var7 = var4.normalize();
                  double var8 = var7.dotProduct(var2);
                  double var10 = var8 < 0.0 ? 100.0 : 0.0;
                  double var12 = (1.0 - var8) * 1.8;
                  double var14 = Math.abs(var7.crossProduct(var2).y) * 1.6;
                  return var5 + var12 + var14 + var10;
               }
            })).orElse(null);
         }
      }
   }

   private BlockPos method2246() {
      if (mc.player == null) {
         return null;
      } else if (this.method2251()) {
         return this.method2245();
      } else {
         return this.prioritizeOresSetting.method2200()
            ? Helper38.method533(mc.player.getBlockPos(), this.radiusSetting.method2080(), this.radiusSetting.method2080(), this.downSetting.method2200())
               .stream()
               .filter(this::method2257)
               .min(Comparator.comparingDouble(this::method2256))
               .orElse(null)
            : Helper38.method533(mc.player.getBlockPos(), this.radiusSetting.method2080(), this.radiusSetting.method2080(), this.downSetting.method2200())
               .stream()
               .filter(this::method2257)
               .min(Comparator.comparingDouble(var0 -> mc.player.squaredDistanceTo(var0.toCenterPos())))
               .orElse(null);
      }
   }

   private boolean method2247(BlockPos var1) {
      if (var1 == null) {
         return true;
      } else {
         return this.method2251() ? this.method2248(var1) : false;
      }
   }

   private boolean method2248(BlockPos var1) {
      if (mc.player != null && var1 != null) {
         Vec3d var2 = this.method2249();
         Vec3d var3 = var1.toCenterPos().subtract(mc.player.getEyePos());
         if (var3.lengthSquared() < 0.001) {
            return false;
         } else {
            double var4 = var3.normalize().dotProduct(var2);
            return var4 < -0.45;
         }
      } else {
         return true;
      }
   }

   private Vec3d method2249() {
      if (mc.player == null) {
         return new Vec3d(0.0, 0.0, 1.0);
      } else {
         Vec3d var1 = mc.player.getVelocity();
         Vec3d var2 = new Vec3d(var1.x, 0.0, var1.z);
         if (var2.lengthSquared() > 0.0025) {
            return var2.normalize();
         } else {
            float var3 = mc.player.getYaw() * (float) (Math.PI / 180.0);
            return new Vec3d(-MathHelper.sin(var3), 0.0, MathHelper.cos(var3)).normalize();
         }
      }
   }

   private boolean method2250() {
      if (mc.player == null) {
         return false;
      } else {
         Vec3d var1 = mc.player.getVelocity();
         return var1.x * var1.x + var1.z * var1.z > 0.0025;
      }
   }

   private boolean method2251() {
      if (mc.player == null || mc.options == null) {
         return false;
      } else {
         return !this.method2250()
            ? false
            : mc.player.forwardSpeed > 0.0F
               && Math.abs(mc.player.sidewaysSpeed) < 0.05F
               && mc.options.forwardKey.isPressed()
               && !mc.options.backKey.isPressed();
      }
   }

   private boolean method2252() {
      return !this.rotateSetting.method2200() ? false : !this.modeSetting.method2385("Авто") || !this.runMineSetting.method2200() || !this.method2250();
   }

   private void method2253(BlockPos var1) {
      if (mc.player != null) {
         Helper336 var2 = Helper349.method3471(var1.toCenterPos());
         if (this.fastAimSetting.method2200()) {
            float var12 = var2.method3333();
            float var13 = MathHelper.clamp(var2.method3334(), -89.0F, 89.0F);
            this.method2254(var12, var13);
         } else {
            float var3 = MathHelper.clamp(this.rotateSmoothSetting.method2082(), 0.05F, 1.0F);
            float var4 = mc.player.getYaw();
            float var5 = mc.player.getPitch();
            float var6 = MathHelper.wrapDegrees(var2.method3333() - var4);
            float var7 = var2.method3334() - var5;
            float var8 = MathHelper.clamp(this.yawStepSetting.method2082(), 1.0F, 30.0F);
            float var9 = MathHelper.clamp(this.pitchStepSetting.method2082(), 1.0F, 30.0F);
            float var10 = var4 + MathHelper.clamp(var6 * var3, -var8, var8);
            float var11 = var5 + MathHelper.clamp(var7 * var3, -var9, var9);
            var11 = MathHelper.clamp(var11, -89.0F, 89.0F);
            this.method2254(var10, var11);
         }
      }
   }

   private void method2254(float var1, float var2) {
      float var3 = MathHelper.clamp(var2, -89.0F, 89.0F);
      if (!this.silentRotateSetting.method2200()) {
         mc.player.setYaw(var1);
         mc.player.setPitch(var3);
         mc.player.setHeadYaw(var1);
         mc.player.setBodyYaw(var1);
      }

      Helper351.INSTANCE.method3502(new Helper336(var1, var3), Helper334.DEFAULT, Helper153.HIGH_IMPORTANCE_1, this);
   }

   private boolean method2255(BlockPos var1, Direction var2) {
      if (mc.player == null || var1 == null || var2 == null) {
         return false;
      } else if (this.modeSetting.method2385("Авто") && this.runMineSetting.method2200() && this.method2250()) {
         return true;
      } else if (this.silentRotateSetting.method2200()) {
         return true;
      } else if (!this.method2262(var1)) {
         return false;
      } else if (!this.rotateSetting.method2200()) {
         return true;
      } else {
         Helper336 var3 = Helper349.method3471(var1.toCenterPos());
         float var4 = Math.abs(MathHelper.wrapDegrees(var3.method3333() - mc.player.getYaw()));
         float var5 = Math.abs(var3.method3334() - mc.player.getPitch());
         float var6 = MathHelper.clamp(this.aimToleranceSetting.method2082(), 1.0F, 25.0F);
         return var4 <= var6 && var5 <= var6;
      }
   }

   private double method2256(BlockPos var1) {
      String var2 = mc.world.getBlockState(var1).getBlock().getTranslationKey().replace("block.minecraft.", "");
      double var3 = mc.player.squaredDistanceTo(var1.toCenterPos());

      return switch (var2) {
         case "diamond_ore", "deepslate_diamond_ore" -> 0.0 + var3 * 0.01;
         case "ancient_debris" -> 0.2 + var3 * 0.01;
         case "emerald_ore", "deepslate_emerald_ore" -> 0.4 + var3 * 0.01;
         case "gold_ore", "deepslate_gold_ore", "nether_gold_ore" -> 0.6 + var3 * 0.01;
         case "iron_ore", "deepslate_iron_ore" -> 0.8 + var3 * 0.01;
         case "lapis_ore", "deepslate_lapis_ore" -> 1.0 + var3 * 0.01;
         case "redstone_ore", "deepslate_redstone_ore" -> 1.2 + var3 * 0.01;
         case "coal_ore", "deepslate_coal_ore" -> 1.4 + var3 * 0.01;
         case "copper_ore", "deepslate_copper_ore" -> 1.6 + var3 * 0.01;
         case "quartz_ore" -> 1.8 + var3 * 0.01;
         case "stone" -> 1.8 + var3 * 0.01;
         default -> 10.0 + var3;
      };
   }

   private boolean method2257(BlockPos var1) {
      BlockState var2 = Objects.requireNonNull(mc.world).getBlockState(var1);
      String var3 = var2.getBlock().getTranslationKey().replace("block.minecraft.", "");
      boolean var4 = var2.isIn(BlockTags.LOGS)
         || var2.isIn(BlockTags.LEAVES)
         || var3.contains("_log")
         || var3.contains("_wood")
         || var3.contains("_leaves")
         || var3.contains("planks");
      boolean var5 = this.method2258(var3);
      return !Helper38.method547(var2)
         && var2.getBlock() != Blocks.WATER
         && var2.getBlock() != Blocks.LAVA
         && var2.getBlock() != Blocks.BEDROCK
         && var2.getBlock() != Blocks.BARRIER
         && !var4
         && var5
         && mc.player.squaredDistanceTo(var1.toCenterPos()) <= 20.25
         && this.method2259(var1);
   }

   private boolean method2258(String var1) {
      return this.targetBlocksSetting.method2590().isEmpty()
         ? false
         : this.targetBlocksSetting.method2588("Алмаз") && (var1.equals("diamond_ore") || var1.equals("deepslate_diamond_ore"))
            || this.targetBlocksSetting.method2588("Древние обломки") && var1.equals("ancient_debris")
            || this.targetBlocksSetting.method2588("Изумруд") && (var1.equals("emerald_ore") || var1.equals("deepslate_emerald_ore"))
            || this.targetBlocksSetting.method2588("Золото")
               && (var1.equals("gold_ore") || var1.equals("deepslate_gold_ore") || var1.equals("nether_gold_ore"))
            || this.targetBlocksSetting.method2588("Железо") && (var1.equals("iron_ore") || var1.equals("deepslate_iron_ore"))
            || this.targetBlocksSetting.method2588("Лазурит") && (var1.equals("lapis_ore") || var1.equals("deepslate_lapis_ore"))
            || this.targetBlocksSetting.method2588("Редстоун") && (var1.equals("redstone_ore") || var1.equals("deepslate_redstone_ore"))
            || this.targetBlocksSetting.method2588("Уголь") && (var1.equals("coal_ore") || var1.equals("deepslate_coal_ore"))
            || var1.equals("cobbled_deepslate")
            || this.targetBlocksSetting.method2588("Медь") && (var1.equals("copper_ore") || var1.equals("deepslate_copper_ore"))
            || this.targetBlocksSetting.method2588("Кварц") && var1.equals("quartz_ore")
            || this.targetBlocksSetting.method2588("Камень")
               && (
                  var1.equals("stone")
                     || var1.contains("stone")
                     || var1.contains("cobblestone")
                     || var1.contains("deepslate")
                     || var1.contains("blackstone")
                     || var1.contains("andesite")
                     || var1.contains("diorite")
                     || var1.contains("granite")
                     || var1.contains("tuff")
                     || var1.contains("basalt")
               );
   }

   private boolean method2259(BlockPos var1) {
      if (mc.player != null && mc.world != null) {
         Vec3d var2 = mc.player.getEyePos();
         Vec3d var3 = var1.toCenterPos();
         BlockHitResult var4 = mc.world.raycast(new RaycastContext(var2, var3, ShapeType.OUTLINE, FluidHandling.NONE, mc.player));
         return var4 != null && var4.getType() == Type.BLOCK ? var4.getBlockPos().equals(var1) : false;
      } else {
         return false;
      }
   }

   private Direction method2260(BlockPos var1) {
      if (mc.player != null && mc.world != null && var1 != null) {
         BlockHitResult var2 = mc.world
            .raycast(new RaycastContext(mc.player.getEyePos(), var1.toCenterPos(), ShapeType.OUTLINE, FluidHandling.NONE, mc.player));
         if (var2 == null || var2.getType() != Type.BLOCK) {
            return null;
         } else {
            return !var2.getBlockPos().equals(var1) ? null : var2.getSide();
         }
      } else {
         return null;
      }
   }

   private Direction method2261(BlockPos var1) {
      Direction var2 = this.method2260(var1);
      return var2 != null ? var2 : Direction.UP;
   }

   private boolean method2262(BlockPos var1) {
      if (mc.player != null && var1 != null) {
         HitResult var2 = mc.player.raycast(4.5, 1.0F, false);
         if (var2 != null && var2.getType() == Type.BLOCK) {
            BlockHitResult var3 = (BlockHitResult)var2;
            return var3.getBlockPos().equals(var1);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public BlockPos method2263() {
      return this.pos;
   }

   public VoxelShape method2264() {
      return this.shape;
   }

   public BlockPos method2265() {
      return this.lockedTarget;
   }

   public List<float[]> method2266() {
      return this.recordedFrames;
   }

   public int method2267() {
      return this.replayIndex;
   }

   public float method2268() {
      return this.lastYaw;
   }

   public float method2269() {
      return this.lastPitch;
   }

   public Setting5 method2270() {
      return this.modeSetting;
   }

   public Setting3 method2271() {
      return this.rotateSetting;
   }

   public Setting3 method2272() {
      return this.silentRotateSetting;
   }

   public Setting3 method2273() {
      return this.fastAimSetting;
   }

   public Setting3 method2274() {
      return this.runMineSetting;
   }

   public Setting3 method2275() {
      return this.prioritizeOresSetting;
   }

   public Setting8 method2276() {
      return this.targetBlocksSetting;
   }

   public Setting3 method2277() {
      return this.downSetting;
   }

   public Setting2 method2278() {
      return this.radiusSetting;
   }

   public Setting2 method2279() {
      return this.breakDelaySetting;
   }

   public Setting2 method2280() {
      return this.rotateSmoothSetting;
   }

   public Setting2 method2281() {
      return this.yawStepSetting;
   }

   public Setting2 method2282() {
      return this.pitchStepSetting;
   }

   public Setting2 method2283() {
      return this.replayInfluenceSetting;
   }

   public Setting2 method2284() {
      return this.aimToleranceSetting;
   }

   public int method2285() {
      return this.breakTickCounter;
   }

   public int method2286() {
      return this.retargetCooldownTicks;
   }
}
