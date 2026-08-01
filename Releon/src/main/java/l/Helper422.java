package l;

import fat.releon.teremok.impl.combat.Aura;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class Helper422 {
   static final float NEURO_ASSIST_WHEN_MANUAL = 0.35F;
   static final float NEURO_BASE_STRENGTH = 0.88F;
   static final float NEURO_RAMP_MS = 360.0F;
   static final float NEURO_OVERSHOOT_PROB = 0.21F;
   static final float NEURO_OVERSHOOT_MIN = 0.94F;
   static final float NEURO_OVERSHOOT_MAX = 1.15F;
   static final float NEURO_NOISE_YAW_MIN = 0.06F;
   static final float NEURO_NOISE_YAW_MAX = 0.38F;
   static final float NEURO_NOISE_PITCH_MIN = 0.04F;
   static final float NEURO_NOISE_PITCH_MAX = 0.22F;
   static final float NEURO_NOISE_FREQ_MIN = 0.55F;
   static final float NEURO_NOISE_FREQ_MAX = 1.65F;
   static final float NEURO_MANUAL_CATCH_MIN = 0.005F;
   static final float NEURO_MANUAL_CATCH_MAX = 0.014F;
   static final long NEURO_TOGGLE_BLEND_MS = 480L;
   static final long NEURO_LOST_SHAKE_MS = 480L;
   static final float NEURO_LOST_SHAKE_YAW_MIN = 4.0F;
   static final float NEURO_LOST_SHAKE_YAW_MAX = 11.0F;
   static final float AIM_MAX_YAW_DELTA = 38.0F;
   static final float AIM_MAX_PITCH_DELTA = 28.0F;
   static final float FALLBACK_GATE_CONF = 0.28F;
   static final float FALLBACK_POINT_GATE = 0.32F;
   static final float FALLBACK_MIN_CONFIDENCE = 0.22F;
   static final float HUMAN_JITTER_SCALE = 7.5F;
   static final float HUMAN_SPEED_SCALE = 18.0F;
   static final float HUMAN_AMP_SCALE = 26.0F;
   static final float GCD_MIN = 0.006F;
   static final float GCD_MAX = 0.45F;
   static final float NEURO_LEARN_RATE_TRACK = 0.1F;
   static final float NEURO_LEARN_RATE_ATTACK = 0.16F;
   static final long NEURO_SAVE_EVERY_MS = 4500L;
   static final float NEURO_CONF_EMA_ALPHA = 0.18F;
   static final float NEURO_POINT_CONF_EMA_ALPHA = 0.16F;
   static final long NEURO_CONF_DROP_HOLD_MS = 140L;
   static final float NEURO_OUTPUT_HOLD_BLEND = 0.68F;
   static final float NEURO_STYLE_EMA_ALPHA = 0.2F;
   static final float NEURO_DELTA_SOFT_YAW = 22.0F;
   static final float NEURO_DELTA_SOFT_PITCH = 16.0F;
   static final float NEURO_DELTA_HARD_YAW = 38.0F;
   static final float NEURO_DELTA_HARD_PITCH = 28.0F;
   Helper421 model = new Helper421();
   final Helper415 perlin = new Helper415(1337);
   boolean loaded;
   boolean initialized;
   private int learnPrevSwingTicks;
   float manualFactor;
   float noiseYaw;
   float noisePitch;
   float noiseFreqYaw;
   float noiseFreqPitch;
   float noisePhaseYaw;
   float noisePhasePitch;
   long toggleBlendStart;
   long toggleBlendUntil;
   boolean toggleBlend;
   boolean savedViewValid;
   float savedYaw;
   float savedPitch;
   boolean returnActive;
   long returnStartTime;
   long returnEndTime;
   long returnLastTime;
   float returnYaw;
   float returnPitch;
   float returnVelYaw;
   float returnVelPitch;
   boolean postReturnRelease;
   boolean lostShakeActive;
   long lostShakeStartTime;
   long lostShakeEndTime;
   long lostShakeLastTime;
   float lostShakeYaw;
   float lostShakePitch;
   int lostShakePhase;
   boolean lostShakeArmed;
   private int lostShakePrevSwingTicks;
   private int execPrevSwingTicks;
   private int hitPendingTargetId = -1;
   private int hitPendingPrevHurt = 0;
   private long hitPendingUntil = 0L;
   private long lastHitConfirmMs = 0L;
   int aimSmoothTargetId = -1;
   long aimSmoothLastTime;
   float aimSmoothedDy;
   float aimSmoothedDp;
   long aimEngageStart;
   long aimEngageUntil;
   int aimEngageTargetId = -1;
   boolean aimEngage;
   Helper417 predCache;
   long predCacheTime;
   int predTargetId;
   boolean predCacheAttack;
   private Vec3d mpRvCur = Vec3d.ZERO;
   private Vec3d mpRvFrom = Vec3d.ZERO;
   private Vec3d mpRvTo = Vec3d.ZERO;
   private long mpRvStartMs = 0L;
   private long mpRvEndMs = 0L;
   private int mpRvLastTid = Integer.MIN_VALUE;
   private float mpRvOrbit = 0.0F;
   private int mpPointTid = Integer.MIN_VALUE;
   private Vec3d mpPointCurRv = Vec3d.ZERO;
   private Vec3d mpPointFromRv = Vec3d.ZERO;
   private Vec3d mpPointToRv = Vec3d.ZERO;
   private long mpPointStartMs = 0L;
   private long mpPointEndMs = 0L;
   private float mpPointOrbit = 0.0F;
   private Vec3d mpPointCur = null;
   private long mpPointLastMs = 0L;
   private long lastModelSaveMs = 0L;
   private boolean modelDirty = false;
   private long learnLastMs = 0L;
   private float learnPrevDy = 0.0F;
   private float learnPrevDp = 0.0F;
   float confEma;
   float pointConfEma;
   long confDropHoldUntil;
   float lastStableOutYaw;
   float lastStableOutPitch;
   long lastStableOutMs;
   float styleYawSpeedEma;
   float stylePitchSpeedEma;
   float styleYawJitterEma;
   float stylePitchJitterEma;
   float styleAmpEma;
   float styleGcdYawEma;
   float styleGcdPitchEma;

   public Helper422() {
   }

   void method4273(Aura var1) {
      this.manualFactor = 0.0F;
      this.noiseYaw = 0.0F;
      this.noisePitch = 0.0F;
      this.noiseFreqYaw = 1.0F;
      this.noiseFreqPitch = 1.0F;
      this.noisePhaseYaw = method4317(0.0F, 999.0F);
      this.noisePhasePitch = method4317(0.0F, 999.0F);
      this.toggleBlendStart = 0L;
      this.toggleBlendUntil = 0L;
      this.toggleBlend = false;
      this.savedViewValid = false;
      this.savedYaw = 0.0F;
      this.savedPitch = 0.0F;
      this.returnActive = false;
      this.returnStartTime = 0L;
      this.returnEndTime = 0L;
      this.returnLastTime = 0L;
      this.returnYaw = 0.0F;
      this.returnPitch = 0.0F;
      this.returnVelYaw = 0.0F;
      this.returnVelPitch = 0.0F;
      this.postReturnRelease = false;
      this.lostShakeActive = false;
      this.lostShakeStartTime = 0L;
      this.lostShakeEndTime = 0L;
      this.lostShakeLastTime = 0L;
      this.lostShakeYaw = 0.0F;
      this.lostShakePitch = 0.0F;
      this.lostShakePhase = 0;
      this.lostShakeArmed = false;
      this.lostShakePrevSwingTicks = 0;
      this.execPrevSwingTicks = 0;
      this.learnPrevSwingTicks = 0;
      this.hitPendingTargetId = -1;
      this.hitPendingPrevHurt = 0;
      this.hitPendingUntil = 0L;
      this.lastHitConfirmMs = 0L;
      this.aimSmoothTargetId = -1;
      this.aimSmoothLastTime = 0L;
      this.aimSmoothedDy = 0.0F;
      this.aimSmoothedDp = 0.0F;
      this.aimEngageStart = 0L;
      this.aimEngageUntil = 0L;
      this.aimEngageTargetId = -1;
      this.aimEngage = false;
      this.predCache = null;
      this.predCacheTime = 0L;
      this.predTargetId = -1;
      this.predCacheAttack = false;
      this.mpRvCur = Vec3d.ZERO;
      this.mpRvFrom = Vec3d.ZERO;
      this.mpRvTo = Vec3d.ZERO;
      this.mpRvStartMs = 0L;
      this.mpRvEndMs = 0L;
      this.mpRvLastTid = Integer.MIN_VALUE;
      this.mpRvOrbit = 0.0F;
      this.mpPointTid = Integer.MIN_VALUE;
      this.mpPointCurRv = Vec3d.ZERO;
      this.mpPointFromRv = Vec3d.ZERO;
      this.mpPointToRv = Vec3d.ZERO;
      this.mpPointStartMs = 0L;
      this.mpPointEndMs = 0L;
      this.mpPointOrbit = 0.0F;
      this.mpPointCur = null;
      this.mpPointLastMs = 0L;
      this.lastModelSaveMs = 0L;
      this.modelDirty = false;
      this.learnLastMs = 0L;
      this.learnPrevDy = 0.0F;
      this.learnPrevDp = 0.0F;
      this.confEma = 0.0F;
      this.pointConfEma = 0.0F;
      this.confDropHoldUntil = 0L;
      this.lastStableOutYaw = 0.0F;
      this.lastStableOutPitch = 0.0F;
      this.lastStableOutMs = 0L;
      this.styleYawSpeedEma = 0.0F;
      this.stylePitchSpeedEma = 0.0F;
      this.styleYawJitterEma = 0.0F;
      this.stylePitchJitterEma = 0.0F;
      this.styleAmpEma = 0.0F;
      this.styleGcdYawEma = 0.0F;
      this.styleGcdPitchEma = 0.0F;
      this.loaded = false;
      this.initialized = false;
   }

   void method4274(Aura var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player != null) {
         this.method4312(true);

         try {
            if (var1 != null && var1.neuroShakeEnabled() && this.lostShakeArmed && !this.lostShakeActive && !this.returnActive) {
               this.lostShakeArmed = false;
               this.method4288(var1, true);
               this.method4290(var1);
            } else {
               if (this.savedViewValid) {
                  this.method4285(var1, this.savedYaw, this.savedPitch);
               } else {
                  this.method4284(var1);
               }

               this.postReturnRelease = true;
            }
         } catch (Exception var4) {
         }
      }
   }

   void method4275(Aura var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player != null) {
         if (!this.loaded) {
            this.loaded = true;

            try {
               this.model.load();
            } catch (Exception var12) {
            }
         }

         if (!this.initialized) {
            this.initialized = true;
            this.predCache = null;
            this.predCacheTime = 0L;
            this.predTargetId = -1;
            this.predCacheAttack = false;
            this.execPrevSwingTicks = method4313(var2.player);
            this.lostShakePrevSwingTicks = method4313(var2.player);
            this.learnPrevSwingTicks = method4313(var2.player);
            this.lostShakeArmed = false;
            this.hitPendingTargetId = -1;
            this.hitPendingPrevHurt = 0;
            this.hitPendingUntil = 0L;
            this.lastHitConfirmMs = 0L;
            this.mpRvCur = Vec3d.ZERO;
            this.mpRvFrom = Vec3d.ZERO;
            this.mpRvTo = Vec3d.ZERO;
            this.mpRvStartMs = 0L;
            this.mpRvEndMs = 0L;
            this.mpRvLastTid = Integer.MIN_VALUE;
            this.mpRvOrbit = 0.0F;
            this.mpPointTid = Integer.MIN_VALUE;
            this.mpPointCurRv = Vec3d.ZERO;
            this.mpPointFromRv = Vec3d.ZERO;
            this.mpPointToRv = Vec3d.ZERO;
            this.mpPointStartMs = 0L;
            this.mpPointEndMs = 0L;
            this.mpPointOrbit = 0.0F;
            this.mpPointCur = null;
            this.mpPointLastMs = 0L;
            this.confEma = 0.0F;
            this.pointConfEma = 0.0F;
            this.confDropHoldUntil = 0L;
            this.lastStableOutMs = 0L;
            this.styleYawSpeedEma = 0.0F;
            this.stylePitchSpeedEma = 0.0F;
            this.styleYawJitterEma = 0.0F;
            this.stylePitchJitterEma = 0.0F;
            this.styleAmpEma = 0.0F;
            this.styleGcdYawEma = 0.0F;
            this.styleGcdPitchEma = 0.0F;
         }

         long var3 = System.currentTimeMillis();
         this.method4292(var2, var1);
         LivingEntity var5 = var1 != null ? var1.getTarget() : null;
         if (var5 != null) {
            int var6 = var5.getId();
            float var7 = 0.035F;
            this.noisePhaseYaw += var7 * (0.65F + 0.35F * (var6 * 1103515245 & 0xFF) / 255.0F);
            this.noisePhasePitch += var7 * (0.65F + 0.35F * (var6 * 1664525 & 0xFF) / 255.0F);
         } else {
            this.noisePhaseYaw += 0.02F;
            this.noisePhasePitch += 0.02F;
         }

         boolean var13 = var1 != null && var1.neuroExec();
         boolean var14 = var1 != null && var1.neuroEnabled();
         if (var13) {
            this.method4291(var2);
         } else {
            this.manualFactor = 0.0F;
            this.aimEngage = false;
            this.aimEngageStart = 0L;
            this.aimEngageUntil = 0L;
            this.aimEngageTargetId = -1;
         }

         int var8 = method4313(var2.player);
         if (this.learnPrevSwingTicks == 0) {
            this.learnPrevSwingTicks = var8;
         } else {
            this.learnPrevSwingTicks = var8;
         }

         boolean var9 = false;
         if (this.execPrevSwingTicks == 0) {
            this.execPrevSwingTicks = var8;
         } else {
            var9 = method4314(this.execPrevSwingTicks, var8);
            this.execPrevSwingTicks = var8;
            if (var9) {
               LivingEntity var10 = var13 ? var1.getTarget() : null;
               if (var10 != null) {
                  this.hitPendingTargetId = var10.getId();
                  this.hitPendingPrevHurt = method4315(var10);
                  this.hitPendingUntil = var3 + 240L;
               }
            }
         }

         if (this.lostShakePrevSwingTicks == 0) {
            this.lostShakePrevSwingTicks = var8;
         } else {
            this.lostShakePrevSwingTicks = var8;
         }

         if (this.hitPendingUntil != 0L) {
            if (var3 <= this.hitPendingUntil) {
               LivingEntity var16 = var13 ? var1.getTarget() : null;
               if (var16 != null && var16.getId() == this.hitPendingTargetId) {
                  int var11 = method4315(var16);
                  if (var11 > this.hitPendingPrevHurt && var11 > 0) {
                     this.lostShakeArmed = true;
                     this.lastHitConfirmMs = var3;
                     this.hitPendingUntil = 0L;
                     this.hitPendingTargetId = -1;
                  }
               } else {
                  this.hitPendingUntil = 0L;
                  this.hitPendingTargetId = -1;
               }
            } else {
               this.hitPendingUntil = 0L;
               this.hitPendingTargetId = -1;
            }
         }

         if (var14 && var2.player != null) {
            if (!this.toggleBlend && var13) {
               this.toggleBlend = true;
               this.toggleBlendStart = var3;
               this.toggleBlendUntil = var3 + this.method4296(var1);
            } else if (this.toggleBlend && !var13) {
               this.toggleBlend = false;
               this.toggleBlendStart = 0L;
               this.toggleBlendUntil = 0L;
            }
         }

         this.method4312(false);
      }
   }

   boolean method4276(Aura var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player == null) {
         return false;
      } else {
         if (this.lostShakeActive && (var1 == null || !var1.neuroExec())) {
            this.method4289();
         }

         if (this.returnActive && var1 != null && var1.neuroExec() && var1.getTarget() != null) {
            this.method4286();
         }

         if (this.lostShakeActive) {
            this.method4290(var1);
            return true;
         } else if (this.returnActive) {
            this.method4287(var1);
            return true;
         } else {
            return false;
         }
      }
   }

   boolean method4277(Aura var1) {
      return this.lostShakeActive || this.returnActive;
   }

   boolean method4278(Aura var1, LivingEntity var2) {
      MinecraftClient var3 = MinecraftClient.getInstance();
      if (var1 != null && var1.neuroShakeEnabled() && var2 != null && !this.lostShakeActive && !this.returnActive && this.lostShakeArmed) {
         this.lostShakeArmed = false;
         this.method4288(var1, false);
         this.method4290(var1);
         return true;
      } else if (!this.returnActive && this.savedViewValid && var3.player != null) {
         this.method4285(var1, this.savedYaw, this.savedPitch);
         return true;
      } else {
         if (!this.returnActive) {
            this.method4299();
         }

         return false;
      }
   }

   void method4279(Aura var1, LivingEntity var2) {
      if (var2 != null) {
         long var3 = System.currentTimeMillis();
         this.method4293(var2.getId(), var3, var1);
         this.predCache = null;
         this.predCacheTime = 0L;
         this.predTargetId = -1;
         this.predCacheAttack = false;
         this.noisePhaseYaw = method4317(0.0F, 999.0F);
         this.noisePhasePitch = method4317(0.0F, 999.0F);
         this.confDropHoldUntil = 0L;
         this.lastStableOutMs = 0L;
      }
   }

   boolean method4280(Aura var1, Helper326 var2, Helper331 var3, Helper351 var4, Helper334 var5) throws java.io.IOException {
      if (var1 == null || !var1.neuroExec()) {
         return false;
      } else if (var1.getTarget() == null) {
         return false;
      } else if (var4 != null && var5 != null) {
         MinecraftClient var6 = MinecraftClient.getInstance();
         if (var6.player == null) {
            return false;
         } else {
            LivingEntity var7 = var1.getTarget();
            int var8 = var7.getId();
            long var9 = System.currentTimeMillis();
            boolean var11 = var3 != null && var3.method3283(var2, 5);
            Helper417 var12;
            if (this.predCache != null && this.predTargetId == var8 && this.predCacheAttack == var11 && var9 - this.predCacheTime <= 200L) {
               var12 = this.predCache;
            } else {
               var12 = this.model.method4258(var7, var11);
            }

            Helper418 var13 = this.model.method4259(var7, var11);
            this.method4302(var12, var9);
            Helper336 var14 = var2 != null ? var2.method3236() : null;
            Box var15 = var7.getBoundingBox();
            Vec3d var16 = null;
            if (var12 != null) {
               try {
                  var16 = this.model.method4260(var7, var12);
               } catch (Exception var77) {
               }
            }

            Vec3d var17 = null;

            try {
               var17 = this.method4281(var1);
            } catch (Exception var76) {
            }

            Vec3d var18 = null;
            if (var17 != null) {
               double var19 = 0.5 + var17.x * 0.5;
               double var21 = var17.y;
               double var23 = 0.5 + var17.z * 0.5;
               var19 = method4319(var19, 0.0, 1.0);
               var21 = method4319(var21, 0.0, 1.0);
               var23 = method4319(var23, 0.0, 1.0);
               if (var21 < 0.36) {
                  var21 = 0.36;
               }

               if (var21 > 0.82) {
                  var21 = 0.82;
               }

               double var25 = var15.minX + (var15.maxX - var15.minX) * var19;
               double var27 = var15.minY + (var15.maxY - var15.minY) * var21;
               double var29 = var15.minZ + (var15.maxZ - var15.minZ) * var23;
               var18 = new Vec3d(
                  method4319(var25, var15.minX + 1.0E-4, var15.maxX - 1.0E-4),
                  method4319(var27, var15.minY + 1.0E-4, var15.maxY - 1.0E-4),
                  method4319(var29, var15.minZ + 1.0E-4, var15.maxZ - 1.0E-4)
               );
            }

            Vec3d var79 = null;
            if (var18 != null && var16 != null && var12 != null) {
               float var20 = MathHelper.clamp(var12.pointConfidence / 100.0F, 0.0F, 1.0F);
               float var83 = MathHelper.clamp(var12.confidence, 0.0F, 1.0F);
               float var22 = MathHelper.clamp(var20 * 0.65F + this.pointConfEma * 0.35F, 0.0F, 1.0F);
               float var88 = MathHelper.clamp(var83 * 0.6F + this.confEma * 0.4F, 0.0F, 1.0F);
               if (!(var22 < 0.35F) && !(var88 < 0.25F)) {
                  float var24 = 0.55F + 0.35F * (1.0F - (var22 * 0.65F + var88 * 0.35F));
                  var24 = MathHelper.clamp(var24, 0.45F, 0.9F);
                  var79 = new Vec3d(var16.x + (var18.x - var16.x) * var24, var16.y + (var18.y - var16.y) * var24, var16.z + (var18.z - var16.z) * var24);
               } else {
                  var79 = var18;
               }
            } else if (var18 != null) {
               var79 = var18;
            } else if (var16 != null) {
               var79 = var16;
            }

            if (var79 != null) {
               Helper336 var80 = this.method4295(var79);
               if (var80 != null) {
                  var14 = var80;
               }
            }

            if (var14 == null) {
               var14 = var2 != null ? var2.method3236() : new Helper336(0.0F, 0.0F);
            }

            Helper420 var81 = this.model.method4261(var14);
            float var84 = this.method4306(var1);
            float var85 = 1.0F - this.manualFactor * 0.65F;
            var85 = MathHelper.clamp(var85, 0.15F, 1.0F);
            float var89 = var12 != null ? MathHelper.clamp(var12.confidence, 0.0F, 1.0F) : 0.0F;
            float var91 = var12 != null ? MathHelper.clamp(var12.pointConfidence / 100.0F, 0.0F, 1.0F) : 0.0F;
            float var92 = MathHelper.clamp(var89 * 0.58F + this.confEma * 0.42F, 0.0F, 1.0F);
            float var26 = MathHelper.clamp(var91 * 0.62F + this.pointConfEma * 0.38F, 0.0F, 1.0F);
            float var94 = var13 != null ? var13.confidence : 0.0F;
            boolean var28 = var12 == null || var92 < 0.28F || var26 < 0.32F || var94 > var92 + 0.1F && var94 >= 0.22F;
            float var95 = var12 != null ? MathHelper.clamp(var12.yawDeltaDeg, -38.0F, 38.0F) : 0.0F;
            float var30 = var12 != null ? MathHelper.clamp(var12.pitchDeltaDeg, -28.0F, 28.0F) : 0.0F;
            if (var13 != null) {
               float var31 = MathHelper.clamp(var13.yawDeltaDeg, -38.0F, 38.0F);
               float var32 = MathHelper.clamp(var13.pitchDeltaDeg, -28.0F, 28.0F);
               if (var28) {
                  var95 = var31;
                  var30 = var32;
                  var92 = var94;
                  var26 = Math.max(var26, MathHelper.clamp(var94, 0.0F, 1.0F));
               } else {
                  float var33 = MathHelper.clamp((0.28F - var92) / 0.28F, 0.0F, 1.0F);
                  var33 *= MathHelper.clamp(var94, 0.0F, 1.0F);
                  var33 *= MathHelper.lerp(var84, 1.0F, 0.82F);
                  var95 += (var31 - var95) * var33;
                  var30 += (var32 - var30) * var33;
               }
            }

            var95 = method4304(var95, 22.0F, 38.0F);
            var30 = method4304(var30, 16.0F, 28.0F);
            float var98 = method4307(var1);
            if (var98 < 179.0F) {
               float var99 = var6.player.getYaw();
               float var103 = var81.yaw + var95;
               float var34 = Math.abs(MathHelper.wrapDegrees(var103 - var99));
               float var35 = var98 * 0.5F;
               if (!var11 && var34 > var35) {
                  return false;
               }

               if (var11 && var34 > var35 + 25.0F) {
                  return false;
               }
            }

            float var100 = MathHelper.clamp(0.25F + 0.75F * MathHelper.clamp(var92, 0.0F, 1.0F), 0.25F, 1.0F);
            float var104 = 0.88F * var85 * var100;
            var104 = MathHelper.clamp(var104, 0.05F, 1.0F);
            float var107 = 1.0F;
            if (this.toggleBlend && var9 <= this.toggleBlendUntil && this.toggleBlendUntil > this.toggleBlendStart) {
               float var108 = (float)(var9 - this.toggleBlendStart) / (float)(this.toggleBlendUntil - this.toggleBlendStart);
               var107 = method4298(var108);
            }

            var104 *= var107;
            if (!this.aimEngage || this.aimEngageTargetId != var8) {
               this.method4293(var8, var9, var1);
            }

            if (this.aimEngage && var9 <= this.aimEngageUntil && this.aimEngageUntil > this.aimEngageStart) {
               float var109 = (float)(var9 - this.aimEngageStart) / (float)(this.aimEngageUntil - this.aimEngageStart);
               var104 *= method4298(var109);
            }

            float var110 = 1.0F;
            float var36 = 0.21F;
            if (var11) {
               var36 *= 1.12F;
            }

            var36 *= MathHelper.lerp(var84, 1.0F, 0.92F);
            if (ThreadLocalRandom.current().nextFloat() < var36) {
               var110 = method4317(0.94F, 1.15F);
            }

            if (this.aimSmoothTargetId != var8) {
               this.aimSmoothTargetId = var8;
               this.aimSmoothedDy = 0.0F;
               this.aimSmoothedDp = 0.0F;
               this.aimSmoothLastTime = 0L;
               this.method4293(var8, var9, var1);
            }

            long var37 = var9 - this.aimSmoothLastTime;
            if (this.aimSmoothLastTime == 0L) {
               var37 = 50L;
            }

            if (var37 < 1L) {
               var37 = 1L;
            }

            if (var37 > 120L) {
               var37 = 120L;
            }

            this.aimSmoothLastTime = var9;
            float var39 = MathHelper.lerp(var84, var11 ? 16.5F : 18.0F, var11 ? 4.0F : 4.2F);
            float var40 = MathHelper.lerp(var84, var11 ? 12.8F : 14.0F, var11 ? 3.0F : 3.4F);
            float var41 = var39 * ((float)var37 / 50.0F);
            float var42 = var40 * ((float)var37 / 50.0F);
            float var43 = MathHelper.wrapDegrees(var95 - this.aimSmoothedDy);
            float var44 = MathHelper.wrapDegrees(var30 - this.aimSmoothedDp);
            this.aimSmoothedDy = this.aimSmoothedDy + MathHelper.clamp(var43, -var41, var41);
            this.aimSmoothedDp = this.aimSmoothedDp + MathHelper.clamp(var44, -var42, var42);
            this.aimSmoothedDy = MathHelper.clamp(this.aimSmoothedDy, -38.0F, 38.0F);
            this.aimSmoothedDp = MathHelper.clamp(this.aimSmoothedDp, -28.0F, 28.0F);
            float var45 = var81.yaw + this.aimSmoothedDy * var104 * var110;
            float var46 = var81.pitch + this.aimSmoothedDp * var104 * var110;
            float var47 = 1.0F - MathHelper.clamp(var92, 0.0F, 1.0F);
            var47 *= var47;
            if (var11) {
               var47 *= 0.55F;
            }

            var47 *= MathHelper.lerp(var84, 1.05F, 0.85F);
            float var48 = MathHelper.clamp(this.manualFactor, 0.0F, 1.0F);
            var47 *= 1.0F - var48 * 0.55F;
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            if (var12 != null) {
               float var54 = this.styleYawJitterEma != 0.0F ? this.styleYawJitterEma : Math.abs(var12.yawJitter);
               float var55 = this.stylePitchJitterEma != 0.0F ? this.stylePitchJitterEma : Math.abs(var12.pitchJitter);
               float var56 = this.styleYawSpeedEma != 0.0F ? this.styleYawSpeedEma : Math.abs(var12.yawSpeed);
               float var57 = this.stylePitchSpeedEma != 0.0F ? this.stylePitchSpeedEma : Math.abs(var12.pitchSpeed);
               float var58 = this.styleAmpEma != 0.0F ? this.styleAmpEma : Math.abs(var12.amp);
               var49 = MathHelper.clamp((var54 + var55) / 7.5F, 0.0F, 1.0F);
               var50 = MathHelper.clamp((var56 + var57) / 18.0F, 0.0F, 1.0F);
               var51 = MathHelper.clamp(var58 / 26.0F, 0.0F, 1.0F);
               var52 = this.styleGcdYawEma > 0.0F ? this.styleGcdYawEma : var12.gcdYaw;
               var53 = this.styleGcdPitchEma > 0.0F ? this.styleGcdPitchEma : var12.gcdPitch;
            }

            float var117 = 0.2F + 0.8F * (0.55F * var49 + 0.3F * var50 + 0.15F * var51);
            var117 = MathHelper.clamp(var117, 0.2F, 1.15F);
            float var119 = MathHelper.lerp(var47, 0.06F, 0.38F) * var117;
            float var120 = MathHelper.lerp(var47, 0.04F, 0.22F) * var117;
            float var121 = MathHelper.lerp(var47, 0.55F, 1.65F) * (0.85F + 0.55F * var50);
            float var122 = MathHelper.lerp(var47, 0.55F, 1.65F) * (0.85F + 0.55F * var50);
            float var59 = (float)(var9 % 100000L / 1000.0);
            float var60 = this.perlin.method4234(var59 * var121 + this.noisePhaseYaw, (float)(var8 * 0.013 + 0.11), 4, 2.0F, 0.55F);
            float var61 = this.perlin.method4234(var59 * var122 + this.noisePhasePitch, (float)(var8 * 0.017 + 37.7), 4, 2.0F, 0.55F);
            float var62 = this.perlin.method4233(var59 * 0.22F + this.noisePhaseYaw * 0.07F, (float)(var8 * 0.009 + 9.3));
            float var63 = this.perlin.method4233(var59 * 0.19F + this.noisePhasePitch * 0.07F, (float)(var8 * 0.011 + 3.7));
            float var64 = (var60 * 0.72F + var62 * 0.28F) * var119;
            float var65 = (var61 * 0.72F + var63 * 0.28F) * var120;
            float var66 = var104 * (var11 ? 0.62F : 0.72F);
            var64 *= var66;
            var65 *= var66;
            var45 += var64;
            var46 += var65;
            float var67 = var6.player.getYaw();
            float var68 = var6.player.getPitch();
            float var69 = var45;
            float var70 = var46;
            float var71 = MathHelper.clamp(var52 == 0.0F ? 0.0F : Math.abs(var52), 0.006F, 0.45F);
            float var72 = MathHelper.clamp(var53 == 0.0F ? 0.0F : Math.abs(var53), 0.006F, 0.45F);
            if (var71 > 0.0F) {
               float var73 = MathHelper.wrapDegrees(var45 - var67);
               float var74 = method4320(var73, var71);
               var69 = var67 + var74;
            }

            if (var72 > 0.0F) {
               float var126 = MathHelper.wrapDegrees(var46 - var68);
               float var128 = method4320(var126, var72);
               var70 = var68 + var128;
            }

            if (this.confDropHoldUntil > var9 && this.lastStableOutMs != 0L) {
               var69 = method4305(var69, this.lastStableOutYaw, 0.68F);
               var70 = MathHelper.lerp(0.68F, var70, this.lastStableOutPitch);
            }

            var70 = MathHelper.clamp(var70, -90.0F, 90.0F);
            if (var92 >= 0.34F) {
               this.lastStableOutYaw = var69;
               this.lastStableOutPitch = var70;
               this.lastStableOutMs = var9;
            }

            Helper336 var127 = this.model.method4262(var69, var70);
            Helper335 var129 = new Helper335(var127, var127.method3329());
            int var75;
            if (var11) {
               var75 = 40;
            } else {
               var75 = (int)MathHelper.lerp(var84, 28.0F, 14.0F);
               if (var75 < 6) {
                  var75 = 6;
               }

               if (var75 > 40) {
                  var75 = 40;
               }
            }

            if (var11) {
               var4.method3509();
            }

            var4.method3500(var129, var7, var75, var5, Helper153.HIGH_IMPORTANCE_1, var1);
            Aura.shouldRotate = true;
            Aura.fakeRotate = false;
            this.predCache = var12;
            this.predCacheTime = var9;
            this.predTargetId = var8;
            this.predCacheAttack = var11;
            return true;
         }
      } else {
         return false;
      }
   }

   public Vec3d method4281(Aura var1) {
      long var2 = System.currentTimeMillis();
      LivingEntity var4 = var1 != null ? var1.getTarget() : null;
      if (var4 == null) {
         this.mpRvCur = Vec3d.ZERO;
         this.mpRvFrom = Vec3d.ZERO;
         this.mpRvTo = Vec3d.ZERO;
         this.mpRvStartMs = 0L;
         this.mpRvEndMs = 0L;
         this.mpRvLastTid = Integer.MIN_VALUE;
         this.mpRvOrbit = 0.0F;
         return Vec3d.ZERO;
      } else {
         int var5;
         try {
            var5 = var4.getId();
         } catch (Exception var14) {
            var5 = System.identityHashCode(var4);
         }

         if (var5 != this.mpRvLastTid) {
            this.mpRvLastTid = var5;
            this.mpRvCur = Vec3d.ZERO;
            this.mpRvFrom = Vec3d.ZERO;
            this.mpRvTo = Vec3d.ZERO;
            this.mpRvStartMs = var2;
            this.mpRvEndMs = 0L;
            this.mpRvOrbit = method4317(0.0F, (float) (Math.PI * 2));
         }

         long var6 = var2 - this.mpRvStartMs;
         if (var6 < 1L) {
            var6 = 1L;
         }

         if (var6 > 60L) {
            var6 = 60L;
         }

         this.mpRvStartMs = var2;
         float var8 = this.method4306(var1);
         float var9 = MathHelper.lerp(var8, 0.46F, 0.28F);
         float var10 = (float)var6 / 50.0F;
         this.mpRvOrbit = this.mpRvOrbit + (var9 * var10 + method4317(-0.018F, 0.018F) * var10);
         Vec3d var11 = this.method4282(var1);
         float var12 = MathHelper.lerp(var8, 140.0F, 85.0F);
         float var13 = (float)var6 / var12;
         var13 = MathHelper.clamp(var13, 0.0F, 1.0F);
         var13 = var13 * var13 * (3.0F - 2.0F * var13);
         if (this.mpRvCur == Vec3d.ZERO) {
            this.mpRvCur = var11;
            return this.mpRvCur;
         } else {
            this.mpRvCur = new Vec3d(
               method4318(this.mpRvCur.x, var11.x, var13), method4318(this.mpRvCur.y, var11.y, var13), method4318(this.mpRvCur.z, var11.z, var13)
            );
            return this.mpRvCur;
         }
      }
   }

   private Vec3d method4282(Aura var1) {
      float var2 = this.method4306(var1);
      float var3 = this.mpRvOrbit;
      float var4 = 0.56F
         + 0.1F * (float)Math.sin(var3 * 0.74F + 0.9F)
         + 0.06F * (float)Math.sin(var3 * 1.28F + 2.2F)
         - 0.05F * (float)(0.5 + 0.5 * Math.sin(var3 * 0.35F + 1.7F));
      float var5 = 0.22F * (float)Math.sin(var3) + 0.06F * (float)Math.sin(var3 * 1.85F + 0.25F);
      float var6 = 0.08F * (float)Math.cos(var3 * 0.92F + 0.4F) + 0.03F * (float)Math.sin(var3 * 1.35F + 1.1F);
      float var7 = MathHelper.lerp(var2, 0.03F, 0.014F);
      var5 += method4317(-var7, var7);
      var6 += method4317(-var7, var7);
      var4 += method4317(-var7 * 0.55F, var7 * 0.55F);
      float var8 = MathHelper.lerp(var2, 0.5F, 0.42F);
      float var9 = MathHelper.lerp(var2, 0.4F, 0.34F);
      var5 = MathHelper.clamp(var5, -var8, var8);
      var6 = MathHelper.clamp(var6, -var9, var9);
      var4 = MathHelper.clamp(var4, 0.36F, 0.82F);
      if (var1 == null || !var1.neuroExec()) {
         var5 *= 0.75F;
         var6 *= 0.75F;
         var4 = MathHelper.clamp(var4, 0.4F, 0.8F);
      }

      return new Vec3d(var5, var4, var6);
   }

   public Vec3d method4283(Aura var1, LivingEntity var2, Box var3, Vec3d var4) throws java.io.IOException {
      if (var2 == null) {
         return var4;
      } else if (var4 == null) {
         return null;
      } else {
         Box var5 = var3 != null ? var3 : var2.getBoundingBox();
         boolean var6 = var1 != null && var1.neuroExec();
         long var8 = System.currentTimeMillis();
         Helper417 var7;
         if (this.predCache != null && this.predTargetId == var2.getId() && var8 - this.predCacheTime <= 220L) {
            var7 = this.predCache;
         } else {
            var7 = this.model.method4258(var2, var6);
         }

         Vec3d var10 = null;
         if (var7 != null) {
            try {
               var10 = this.model.method4260(var2, var7);
            } catch (Exception var32) {
            }
         }

         float var11 = this.method4306(var1);
         double var12 = var4.x;
         double var14 = var4.y;
         double var16 = var4.z;
         if (var10 != null) {
            float var18 = var7.confidence;
            float var19 = MathHelper.clamp(var7.pointConfidence / 100.0F, 0.0F, 1.0F);
            float var20 = 0.2F + 0.8F * (var18 * 0.65F + var19 * 0.35F);
            var20 = MathHelper.clamp(var20, 0.08F, 0.95F);
            var20 *= MathHelper.lerp(var11, 1.0F, 0.85F);
            var12 += (var10.x - var12) * var20;
            var14 += (var10.y - var14) * var20;
            var16 += (var10.z - var16) * var20;
         }

         if (var1 != null) {
            Vec3d var36 = this.method4281(var1);
            if (var36 != null && var36 != Vec3d.ZERO) {
               double var37 = 0.5 + var36.x * 0.5;
               double var21 = var36.y;
               double var23 = 0.5 + var36.z * 0.5;
               var37 = method4319(var37, 0.0, 1.0);
               var21 = method4319(var21, 0.0, 1.0);
               var23 = method4319(var23, 0.0, 1.0);
               double var25 = var5.minX + (var5.maxX - var5.minX) * var37;
               double var27 = var5.minY + (var5.maxY - var5.minY) * var21;
               double var29 = var5.minZ + (var5.maxZ - var5.minZ) * var23;
               float var31 = MathHelper.lerp(var11, 0.62F, 0.45F);
               if (!var1.neuroExec()) {
                  var31 = MathHelper.lerp(var11, 0.72F, 0.52F);
               }

               var12 += (var25 - var12) * var31;
               var14 += (var27 - var14) * var31;
               var16 += (var29 - var16) * var31;
            }
         }

         var12 = method4319(var12, var5.minX + 1.0E-4, var5.maxX - 1.0E-4);
         var14 = method4319(var14, var5.minY + 1.0E-4, var5.maxY - 1.0E-4);
         var16 = method4319(var16, var5.minZ + 1.0E-4, var5.maxZ - 1.0E-4);
         return new Vec3d(var12, var14, var16);
      }
   }

   void method4284(Aura var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player != null) {
         this.savedYaw = var2.player.getYaw();
         this.savedPitch = var2.player.getPitch();
         this.savedViewValid = true;
         this.method4285(var1, this.savedYaw, this.savedPitch);
      }
   }

   void method4285(Aura var1, float var2, float var3) {
      MinecraftClient var4 = MinecraftClient.getInstance();
      if (var4.player != null) {
         this.savedYaw = var2;
         this.savedPitch = var3;
         this.returnActive = true;
         this.returnStartTime = System.currentTimeMillis();
         this.returnEndTime = this.returnStartTime + this.method4297(var1);
         this.returnLastTime = this.returnStartTime;
         this.returnYaw = var4.player.getYaw();
         this.returnPitch = var4.player.getPitch();
         this.returnVelYaw = 0.0F;
         this.returnVelPitch = 0.0F;
         this.postReturnRelease = false;
         Aura.shouldRotate = true;
         Aura.fakeRotate = false;
      }
   }

   void method4286() {
      this.returnActive = false;
      this.returnStartTime = 0L;
      this.returnEndTime = 0L;
      this.returnLastTime = 0L;
      this.returnVelYaw = 0.0F;
      this.returnVelPitch = 0.0F;
   }

   void method4287(Aura var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player == null) {
         this.method4286();
      } else {
         long var3 = System.currentTimeMillis();
         if (var3 < this.returnEndTime && this.returnEndTime > this.returnStartTime) {
            long var5 = var3 - this.returnLastTime;
            if (var5 < 1L) {
               var5 = 1L;
            }

            if (var5 > 120L) {
               var5 = 120L;
            }

            this.returnLastTime = var3;
            float var7 = (float)var5 / 1000.0F;
            float var8 = this.savedYaw;
            float var9 = this.savedPitch;
            float var10 = this.method4306(var1);
            float var11 = 14.0F - 4.0F * var10;
            if (var11 < 8.0F) {
               var11 = 8.0F;
            }

            if (var11 > 14.0F) {
               var11 = 14.0F;
            }

            float var12 = 1.0F;
            float var13 = MathHelper.wrapDegrees(var8 - this.returnYaw);
            float var14 = MathHelper.wrapDegrees(var9 - this.returnPitch);
            float var15 = var11 * var11 * var13 - 2.0F * var12 * var11 * this.returnVelYaw;
            float var16 = var11 * var11 * var14 - 2.0F * var12 * var11 * this.returnVelPitch;
            this.returnVelYaw += var15 * var7;
            this.returnVelPitch += var16 * var7;
            float var17 = 210.0F;
            this.returnVelYaw = MathHelper.clamp(this.returnVelYaw, -var17, var17);
            this.returnVelPitch = MathHelper.clamp(this.returnVelPitch, -var17, var17);
            this.returnYaw = this.returnYaw + this.returnVelYaw * var7;
            this.returnPitch = this.returnPitch + this.returnVelPitch * var7;
            var2.player.setYaw(this.returnYaw);
            var2.player.setPitch(MathHelper.clamp(this.returnPitch, -90.0F, 90.0F));
         } else {
            var2.player.setYaw(this.savedYaw);
            var2.player.setPitch(this.savedPitch);
            this.method4286();
            if (this.postReturnRelease) {
               this.postReturnRelease = false;
               this.method4299();
            }
         }
      }
   }

   void method4288(Aura var1, boolean var2) {
      MinecraftClient var3 = MinecraftClient.getInstance();
      if (var3.player != null) {
         this.lostShakeActive = true;
         this.lostShakeStartTime = System.currentTimeMillis();
         this.lostShakeEndTime = this.lostShakeStartTime + 480L;
         this.lostShakeLastTime = this.lostShakeStartTime;
         this.lostShakeYaw = var3.player.getYaw();
         this.lostShakePitch = var3.player.getPitch();
         this.lostShakePhase = 0;
         this.postReturnRelease = var2;
         Aura.shouldRotate = true;
         Aura.fakeRotate = false;
      }
   }

   void method4289() {
      this.lostShakeActive = false;
      this.lostShakeStartTime = 0L;
      this.lostShakeEndTime = 0L;
      this.lostShakeLastTime = 0L;
      this.lostShakePhase = 0;
   }

   void method4290(Aura var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player == null) {
         this.method4289();
      } else {
         long var3 = System.currentTimeMillis();
         if (var3 < this.lostShakeEndTime && this.lostShakeEndTime > this.lostShakeStartTime) {
            long var5 = var3 - this.lostShakeLastTime;
            if (var5 < 1L) {
               var5 = 1L;
            }

            if (var5 > 120L) {
               var5 = 120L;
            }

            this.lostShakeLastTime = var3;
            float var7 = (float)(var3 - this.lostShakeStartTime) / (float)(this.lostShakeEndTime - this.lostShakeStartTime);
            float var8 = 1.0F - var7;
            float var9 = method4317(4.0F, 11.0F) * var8;
            float var10 = this.lostShakePhase++ % 2 == 0 ? 1.0F : -1.0F;
            float var11 = method4317(-0.9F, 0.9F) * 0.65F;
            float var12 = (var9 + var11) * var10;
            float var13 = method4317(-0.55F, 0.35F) * var8;
            this.lostShakeYaw += var12;
            this.lostShakePitch += var13;
            var2.player.setYaw(this.lostShakeYaw);
            var2.player.setPitch(MathHelper.clamp(this.lostShakePitch, -90.0F, 90.0F));
         } else {
            this.method4289();
            if (this.savedViewValid) {
               this.method4285(var1, this.savedYaw, this.savedPitch);
            } else {
               this.method4284(var1);
            }
         }
      }
   }

   private void method4291(MinecraftClient var1) {
      if (var1.player != null) {
         float var2 = Math.abs(MathHelper.wrapDegrees(var1.player.getYaw() - this.savedYaw));
         float var3 = Math.abs(MathHelper.wrapDegrees(var1.player.getPitch() - this.savedPitch));
         float var4 = (var2 + var3) * 0.5F;
         float var5 = method4317(0.005F, 0.014F);
         float var6 = MathHelper.clamp(var4 * var5, 0.0F, 1.0F);
         this.manualFactor = this.manualFactor + (var6 - this.manualFactor) * 0.12F;
         this.manualFactor = MathHelper.clamp(this.manualFactor, 0.0F, 1.0F);
      }
   }

   private void method4292(MinecraftClient var1, Aura var2) {
      if (var1.player != null) {
         if (!this.savedViewValid) {
            this.savedViewValid = true;
            this.savedYaw = var1.player.getYaw();
            this.savedPitch = var1.player.getPitch();
         } else {
            float var3 = MathHelper.clamp(this.manualFactor, 0.0F, 1.0F);
            LivingEntity var4 = var2 != null ? var2.getTarget() : null;
            if (var3 > 0.1F || var4 == null) {
               this.savedYaw = var1.player.getYaw();
               this.savedPitch = var1.player.getPitch();
            }
         }
      }
   }

   private void method4293(int var1, long var2, Aura var4) {
      this.aimEngage = true;
      this.aimEngageTargetId = var1;
      this.aimEngageStart = var2;
      this.aimEngageUntil = var2 + this.method4294(var4);
   }

   private long method4294(Aura var1) {
      float var2 = this.method4306(var1);
      long var3 = (long)MathHelper.lerp(var2, 520.0F, 240.0F);
      if (var3 < 180L) {
         var3 = 180L;
      }

      if (var3 > 650L) {
         var3 = 650L;
      }

      return var3;
   }

   Helper336 method4295(Vec3d var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player != null && var1 != null) {
         Vec3d var3 = var2.player.getCameraPosVec(1.0F);
         Vec3d var4 = var1.subtract(var3);
         return Helper349.method3469(var4);
      } else {
         return new Helper336(0.0F, 0.0F);
      }
   }

   private long method4296(Aura var1) {
      float var2 = this.method4306(var1);
      long var3 = (long)MathHelper.lerp(var2, 560.0F, 420.0F);
      if (var3 < 320L) {
         var3 = 320L;
      }

      if (var3 > 720L) {
         var3 = 720L;
      }

      return var3;
   }

   private long method4297(Aura var1) {
      float var2 = this.method4306(var1);
      long var3 = (long)MathHelper.lerp(var2, 540.0F, 420.0F);
      if (var3 < 360L) {
         var3 = 360L;
      }

      if (var3 > 680L) {
         var3 = 680L;
      }

      return var3;
   }

   private static float method4298(float var0) {
      float var1 = MathHelper.clamp(var0, 0.0F, 1.0F);
      float var2 = 1.0F - var1;
      return 1.0F - var2 * var2 * var2;
   }

   private void method4299() {
      try {
         Helper351.INSTANCE.method3509();
      } catch (Exception var2) {
      }

      Aura.fakeRotate = false;
      Aura.shouldRotate = false;
      this.returnActive = false;
      this.returnStartTime = 0L;
      this.returnEndTime = 0L;
      this.returnLastTime = 0L;
      this.lostShakeActive = false;
      this.lostShakeStartTime = 0L;
      this.lostShakeEndTime = 0L;
      this.lostShakeLastTime = 0L;
      this.aimEngage = false;
      this.aimEngageStart = 0L;
      this.aimEngageUntil = 0L;
      this.aimEngageTargetId = -1;
      this.confDropHoldUntil = 0L;
      this.lastStableOutMs = 0L;
      this.confEma = 0.0F;
      this.pointConfEma = 0.0F;
   }

   void method4300() {
      this.modelDirty = true;
   }

   void method4301() {
      this.modelDirty = true;
      this.predCache = null;
      this.predCacheTime = 0L;
      this.predTargetId = -1;
      this.predCacheAttack = false;
      this.confEma = 0.0F;
      this.pointConfEma = 0.0F;
      this.confDropHoldUntil = 0L;
      this.lastStableOutMs = 0L;
      this.aimSmoothTargetId = -1;
      this.aimSmoothLastTime = 0L;
      this.aimSmoothedDy = 0.0F;
      this.aimSmoothedDp = 0.0F;
   }

   private void method4302(Helper417 var1, long var2) {
      float var4 = this.confEma;
      float var5 = var1 != null ? MathHelper.clamp(var1.confidence, 0.0F, 1.0F) : 0.0F;
      float var6 = var1 != null ? MathHelper.clamp(var1.pointConfidence / 100.0F, 0.0F, 1.0F) : 0.0F;
      if (var4 > 0.34F && var5 < 0.14F) {
         this.confDropHoldUntil = var2 + 140L;
      }

      this.confEma = method4303(this.confEma, var5, 0.18F);
      this.pointConfEma = method4303(this.pointConfEma, var6, 0.16F);
      if (var1 != null) {
         this.styleYawSpeedEma = method4303(this.styleYawSpeedEma, Math.abs(var1.yawSpeed), 0.2F);
         this.stylePitchSpeedEma = method4303(this.stylePitchSpeedEma, Math.abs(var1.pitchSpeed), 0.2F);
         this.styleYawJitterEma = method4303(this.styleYawJitterEma, Math.abs(var1.yawJitter), 0.2F);
         this.stylePitchJitterEma = method4303(this.stylePitchJitterEma, Math.abs(var1.pitchJitter), 0.2F);
         this.styleAmpEma = method4303(this.styleAmpEma, Math.abs(var1.amp), 0.2F);
         if (var1.gcdYaw > 0.0F) {
            this.styleGcdYawEma = this.styleGcdYawEma == 0.0F ? var1.gcdYaw : method4303(this.styleGcdYawEma, var1.gcdYaw, 0.12F);
         }

         if (var1.gcdPitch > 0.0F) {
            this.styleGcdPitchEma = this.styleGcdPitchEma == 0.0F ? var1.gcdPitch : method4303(this.styleGcdPitchEma, var1.gcdPitch, 0.12F);
         }
      }
   }

   private static float method4303(float var0, float var1, float var2) {
      if (var2 <= 0.0F) {
         return var0;
      } else {
         return var0 == 0.0F ? var1 : var0 + (var1 - var0) * MathHelper.clamp(var2, 0.0F, 1.0F);
      }
   }

   private static float method4304(float var0, float var1, float var2) {
      float var3 = Math.abs(var0);
      if (var3 <= var1) {
         return var0;
      } else if (var3 >= var2) {
         return Math.copySign(var2, var0);
      } else {
         float var4 = (var3 - var1) / Math.max(1.0E-6F, var2 - var1);
         var4 = MathHelper.clamp(var4, 0.0F, 1.0F);
         float var5 = var4 * var4 * (3.0F - 2.0F * var4);
         float var6 = var1 + (var2 - var1) * var5;
         return Math.copySign(var6, var0);
      }
   }

   private static float method4305(float var0, float var1, float var2) {
      float var3 = MathHelper.wrapDegrees(var1 - var0);
      return var0 + var3 * MathHelper.clamp(var2, 0.0F, 1.0F);
   }

   private float method4306(Aura var1) {
      float var2 = 0.76F;
      if (var1 != null) {
         try {
            var2 = var1.neuroSmoothValue();
         } catch (Exception var4) {
         }
      }

      if (var2 < 0.2F) {
         var2 = 0.2F;
      }

      if (var2 > 0.95F) {
         var2 = 0.95F;
      }

      return var2;
   }

   private static float method4307(Aura var0) {
      if (var0 == null) {
         return 180.0F;
      } else {
         Float var1 = method4308(var0, "neuroFovValue");
         if (var1 == null) {
            var1 = method4308(var0, "getNeuroFov");
         }

         if (var1 == null) {
            var1 = method4308(var0, "neuroFov");
         }

         if (var1 == null) {
            var1 = method4308(var0, "fovValue");
         }

         if (var1 == null) {
            var1 = method4308(var0, "getFov");
         }

         if (var1 == null) {
            var1 = method4308(var0, "fov");
         }

         if (var1 == null) {
            Object var2 = method4309(var0, "neuroFov");
            if (var2 == null) {
               var2 = method4309(var0, "fov");
            }

            if (var2 == null) {
               var2 = method4309(var0, "fovSetting");
            }

            if (var2 == null) {
               var2 = method4309(var0, "aimFov");
            }

            if (var2 != null) {
               var1 = method4308(var2, "getValue");
               if (var1 == null) {
                  var1 = method4308(var2, "get");
               }

               if (var1 == null && var2 instanceof Number) {
                  var1 = ((Number)var2).floatValue();
               }
            }
         }

         if (var1 != null && !Float.isNaN(var1) && !Float.isInfinite(var1)) {
            var1 = MathHelper.clamp(var1, 1.0F, 180.0F);
            return var1;
         } else {
            return 180.0F;
         }
      }
   }

   private static Float method4308(Object var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         try {
            Method var2 = var0.getClass().getMethod(var1);
            var2.setAccessible(true);
            Object var3 = var2.invoke(var0);
            if (var3 instanceof Number) {
               return ((Number)var3).floatValue();
            }
         } catch (Exception var5) {
         }

         try {
            Method var6 = var0.getClass().getDeclaredMethod(var1);
            var6.setAccessible(true);
            Object var7 = var6.invoke(var0);
            if (var7 instanceof Number) {
               return ((Number)var7).floatValue();
            }
         } catch (Exception var4) {
         }

         return null;
      }
   }

   private static Object method4309(Object var0, String var1) {
      if (var0 == null) {
         return null;
      } else {
         try {
            Field var5 = var0.getClass().getDeclaredField(var1);
            var5.setAccessible(true);
            return var5.get(var0);
         } catch (Exception var4) {
            try {
               Field var2 = var0.getClass().getField(var1);
               var2.setAccessible(true);
               return var2.get(var0);
            } catch (Exception var3) {
               return null;
            }
         }
      }
   }

   private boolean method4310(Aura var1, LivingEntity var2, boolean var3) throws java.io.IOException {
      MinecraftClient var4 = MinecraftClient.getInstance();
      if (var4.player != null && var2 != null) {
         long var5 = System.currentTimeMillis();
         Vec3d var7 = this.method4311(var4, var2);
         if (var7 == null) {
            var7 = var2.getBoundingBox().getCenter();
         }

         Helper336 var8 = this.method4295(var7);
         Helper420 var9 = this.model.method4261(var8);
         float var10 = var4.player.getYaw();
         float var11 = var4.player.getPitch();
         float var12 = MathHelper.wrapDegrees(var10 - var9.yaw);
         float var13 = MathHelper.wrapDegrees(var11 - var9.pitch);
         var12 = MathHelper.clamp(var12, -38.0F, 38.0F);
         var13 = MathHelper.clamp(var13, -28.0F, 28.0F);
         Box var14 = var2.getBoundingBox();
         double var15 = var14.maxX - var14.minX;
         double var17 = var14.maxY - var14.minY;
         double var19 = var14.maxZ - var14.minZ;
         double var21 = var15 <= 1.0E-9 ? 0.5 : (var7.x - var14.minX) / var15;
         double var23 = var17 <= 1.0E-9 ? 0.5 : (var7.y - var14.minY) / var17;
         double var25 = var19 <= 1.0E-9 ? 0.5 : (var7.z - var14.minZ) / var19;
         float var27 = (float)MathHelper.clamp(var21, 0.0, 1.0);
         float var28 = (float)MathHelper.clamp(var23, 0.0, 1.0);
         float var29 = (float)MathHelper.clamp(var25, 0.0, 1.0);
         long var30 = var5 - this.learnLastMs;
         if (this.learnLastMs == 0L) {
            var30 = 50L;
         }

         if (var30 < 1L) {
            var30 = 1L;
         }

         if (var30 > 120L) {
            var30 = 120L;
         }

         this.learnLastMs = var5;
         float var32 = (float)var30 / 1000.0F;
         float var33 = var32 <= 0.0F ? 0.0F : Math.abs(MathHelper.wrapDegrees(var12 - this.learnPrevDy)) / var32;
         float var34 = var32 <= 0.0F ? 0.0F : Math.abs(MathHelper.wrapDegrees(var13 - this.learnPrevDp)) / var32;
         float var35 = MathHelper.wrapDegrees(var12 - this.learnPrevDy);
         float var36 = MathHelper.wrapDegrees(var13 - this.learnPrevDp);
         float var37 = (float)Math.sqrt(var12 * var12 + var13 * var13);
         this.learnPrevDy = var12;
         this.learnPrevDp = var13;
         float var38 = var3 ? 0.16F : 0.1F;
         boolean var39 = this.model.method4256(var2, var3, var12, var13, var27, var28, var29, var33, var34, var35, var36, 0.0F, 0.0F, var37, var38);
         if (var39) {
            this.modelDirty = true;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private Vec3d method4311(MinecraftClient var1, LivingEntity var2) {
      if (var1 != null && var1.player != null && var2 != null) {
         Vec3d var3 = var1.player.getCameraPosVec(1.0F);
         Vec3d var4 = var1.player.getRotationVec(1.0F);
         double var5 = 8.0;
         Vec3d var7 = var3.add(var4.x * var5, var4.y * var5, var4.z * var5);
         Box var8 = var2.getBoundingBox();

         try {
            Optional var9 = var8.raycast(var3, var7);
            if (var9 != null && var9.isPresent()) {
               return (Vec3d)var9.get();
            }
         } catch (Exception var11) {
         }

         Vec3d var12 = var8.getCenter();
         return new Vec3d(
            method4319(var12.x, var8.minX + 1.0E-4, var8.maxX - 1.0E-4),
            method4319(var12.y, var8.minY + 1.0E-4, var8.maxY - 1.0E-4),
            method4319(var12.z, var8.minZ + 1.0E-4, var8.maxZ - 1.0E-4)
         );
      } else {
         return null;
      }
   }

   private void method4312(boolean var1) {
      if (this.modelDirty || var1) {
         long var2 = System.currentTimeMillis();
         if (var1 || this.lastModelSaveMs == 0L || var2 - this.lastModelSaveMs >= 4500L) {
            this.lastModelSaveMs = var2;

            try {
               this.model.method4266();
               this.modelDirty = false;
            } catch (Exception var5) {
            }
         }
      }
   }

   static int method4313(Object var0) {
      Integer var1 = method4316(var0, "handSwingTicks");
      if (var1 != null) {
         return var1;
      } else {
         var1 = method4316(var0, "handSwingProgressInt");
         if (var1 != null) {
            return var1;
         } else {
            var1 = method4316(var0, "handSwingingTicks");
            if (var1 != null) {
               return var1;
            } else {
               var1 = method4316(var0, "ticksSinceLastSwing");
               return var1 != null ? var1 : 0;
            }
         }
      }
   }

   static boolean method4314(int var0, int var1) {
      if (var1 < var0) {
         return true;
      } else {
         return var0 == 0 && var1 > 0 ? true : var0 > 0 && var1 == 0;
      }
   }

   static int method4315(Object var0) {
      if (var0 == null) {
         return 0;
      } else {
         Integer var1 = method4316(var0, "hurtTime");
         if (var1 != null) {
            return var1;
         } else {
            var1 = method4316(var0, "maxHurtTime");
            return var1 != null ? var1 : 0;
         }
      }
   }

   static Integer method4316(Object var0, String var1) {
      try {
         Field var5 = var0.getClass().getDeclaredField(var1);
         var5.setAccessible(true);
         return (Integer)var5.get(var0);
      } catch (Exception var4) {
         try {
            Field var2 = var0.getClass().getField(var1);
            var2.setAccessible(true);
            return (Integer)var2.get(var0);
         } catch (Exception var3) {
            return null;
         }
      }
   }

   private static float method4317(float var0, float var1) {
      return var1 <= var0 ? var0 : var0 + ThreadLocalRandom.current().nextFloat() * (var1 - var0);
   }

   private static double method4318(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   private static double method4319(double var0, double var2, double var4) {
      return var0 < var2 ? var2 : (var0 > var4 ? var4 : var0);
   }

   private static float method4320(float var0, float var1) {
      if (var1 <= 0.0F) {
         return var0;
      } else {
         float var2 = Math.abs(var1);
         return Math.round(var0 / var2) * var2;
      }
   }
}
