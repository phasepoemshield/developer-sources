package l;

import fat.releon.teremok.impl.combat.Aura;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Optional;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

final class Helper425 {
   private static final float NEURO_LEARN_RATE_TRACK = 0.1F;
   private static final float NEURO_LEARN_RATE_ATTACK = 0.16F;
   private static final float TRACK_ERR_SOFT = 28.0F;
   private static final float TRACK_ERR_HARD = 85.0F;
   private static final float ATTACK_ERR_SOFT = 38.0F;
   private static final float ATTACK_ERR_HARD = 105.0F;
   private static final float MIN_LR_MUL = 0.02F;
   private static final float MAX_LR_MUL = 1.35F;
   private static final int PATTERN_SAMPLES_TRACK = 2;
   private static final int PATTERN_SAMPLES_ATTACK = 4;
   private static final int POINT_SAMPLES_TRACK = 3;
   private static final int POINT_SAMPLES_ATTACK = 6;
   private static final float CAM_VEL_EMA = 0.18F;
   private static final long EXEC_NOTIFY_COOLDOWN_MS = 220L;
   private static final float EXEC_GCD_MIN = 0.006F;
   private static final float EXEC_GCD_MAX = 0.45F;
   private static Method turnsGetYaw;
   private static Method turnsGetPitch;
   private static Field turnsYawField;
   private static Field turnsPitchField;
   private static Constructor<?> turnsCtorFF;
   private static Constructor<?> turnsCtorDD;
   private static boolean turnsCtorTried = false;
   private static Field swingTicksFieldA;
   private static Field swingTicksFieldB;
   private static Field swingTicksFieldC;
   private static Method swingTicksMethod;
   private static Field auraAimModeField;
   private static Field auraNeuroModeField;
   private final Helper424 model = new Helper424();
   private Helper422 exec;
   private boolean execReplayLoaded = false;
   private long lastExecNotifyMs = 0L;
   private boolean loaded = false;
   private int prevSwingTicks = 0;
   private int attackBurstTicks = 0;
   private float prevCamYaw = 0.0F;
   private float prevCamPitch = 0.0F;
   private float emaCamVelYaw = 0.0F;
   private float emaCamVelPitch = 0.0F;
   private float lastClampedYaw = 0.0F;
   private float lastClampedPitch = 0.0F;
   private boolean hasLastClamped = false;
   private int lastTargetId = Integer.MIN_VALUE;
   private int targetStableTicks = 0;
   private boolean dirty = false;

   Helper425() {
   }

   Helper424 method4342() {
      return this.model;
   }

   Helper424 method4343() {
      return this.model;
   }

   void method4344(Helper422 var1) {
      this.exec = var1;
      this.execReplayLoaded = false;
      this.lastExecNotifyMs = 0L;
   }

   void method4345(Helper422 var1) {
      this.method4344(var1);
   }

   void method4346(Helper422 var1) {
      this.method4344(var1);
   }

   Helper421 method4347() {
      return this.exec == null ? null : this.exec.model;
   }

   Helper423 method4348(LivingEntity var1, boolean var2) {
      float var3 = (float)Math.sqrt(this.emaCamVelYaw * this.emaCamVelYaw + this.emaCamVelPitch * this.emaCamVelPitch);
      return this.model.method4330(var1, var2, var3);
   }

   void method4349(Aura var1) {
      this.prevSwingTicks = 0;
      this.attackBurstTicks = 0;
      this.hasLastClamped = false;
      this.lastTargetId = Integer.MIN_VALUE;
      this.targetStableTicks = 0;
      this.dirty = false;
      this.loaded = false;
      this.execReplayLoaded = false;
      this.lastExecNotifyMs = 0L;
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player != null) {
         this.prevSwingTicks = method4368(var2.player);
         this.prevCamYaw = var2.player.getYaw();
         this.prevCamPitch = var2.player.getPitch();
         this.emaCamVelYaw = 0.0F;
         this.emaCamVelPitch = 0.0F;
      }
   }

   void method4350(Aura var1) {
      this.method4352(var1);
      if (this.exec != null) {
         try {
            this.exec.method4301();
         } catch (Exception var3) {
         }
      }
   }

   void method4351(Aura var1, boolean var2) {
      if (var1 != null) {
         if (method4359(var1)) {
            MinecraftClient var3 = MinecraftClient.getInstance();
            if (var3.player != null) {
               if (!this.loaded) {
                  this.loaded = true;
                  this.model.load();
                  this.prevSwingTicks = method4368(var3.player);
                  this.prevCamYaw = var3.player.getYaw();
                  this.prevCamPitch = var3.player.getPitch();
                  this.emaCamVelYaw = 0.0F;
                  this.emaCamVelPitch = 0.0F;
               }

               this.method4355();
               LivingEntity var4 = var1.getTarget();
               if (var4 != null) {
                  int var5;
                  try {
                     var5 = var4.getId();
                  } catch (Exception var64) {
                     var5 = System.identityHashCode(var4);
                  }

                  if (var5 != this.lastTargetId) {
                     this.lastTargetId = var5;
                     this.targetStableTicks = 0;
                     this.hasLastClamped = false;
                  } else {
                     this.targetStableTicks++;
                  }

                  int var6 = method4368(var3.player);
                  boolean var7 = method4369(this.prevSwingTicks, var6);
                  this.prevSwingTicks = var6;
                  if (var7) {
                     this.attackBurstTicks = 3;
                  }

                  boolean var8 = var2 || this.attackBurstTicks > 0;
                  float var9 = var3.player.getYaw();
                  float var10 = var3.player.getPitch();
                  float var11 = method4370(var9 - this.prevCamYaw);
                  float var12 = var10 - this.prevCamPitch;
                  this.prevCamYaw = var9;
                  this.prevCamPitch = var10;
                  this.emaCamVelYaw = method4373(this.emaCamVelYaw, var11, 0.18F);
                  this.emaCamVelPitch = method4373(this.emaCamVelPitch, var12, 0.18F);
                  float var13 = (float)Math.sqrt(this.emaCamVelYaw * this.emaCamVelYaw + this.emaCamVelPitch * this.emaCamVelPitch);
                  Helper326 var14 = var1.getCachedConfig() != null ? var1.getCachedConfig() : var1.getConfig();
                  Helper336 var15 = var14 != null ? var14.method3236() : var1.getConfig().method3236();
                  float var16 = method4366(var15, var9);
                  float var17 = method4367(var15, var10);
                  float var18 = method4370(var9 - var16);
                  float var19 = var10 - var17;
                  float var20 = (float)Math.sqrt(var18 * var18 + var19 * var19);
                  float var21 = var8 ? 38.0F : 28.0F;
                  float var22 = var8 ? 105.0F : 85.0F;
                  float var23 = 1.0F;
                  if (var20 > var21) {
                     float var24 = var21 / Math.max(var20, 0.001F);
                     var23 *= method4371(var24, 0.02F, 1.0F);
                  }

                  if (var20 > var22) {
                     float var65 = var22 / Math.max(var20, 0.001F);
                     var23 *= method4371(var65, 0.02F, 1.0F);
                  }

                  float var66 = method4371(0.55F + var13 * 0.11F, 0.55F, 1.25F);
                  float var25 = method4371(0.35F + this.targetStableTicks / 8.0F, 0.35F, 1.0F);
                  float var26 = var8 ? 0.16F : 0.1F;
                  float var27 = var23 * var66 * var25;
                  if (var8 && var7) {
                     var27 *= 1.1F;
                  }

                  var27 = method4371(var27, 0.02F, 1.35F);
                  float var28 = var22 * 1.65F;
                  float var29 = method4371(var18, -var28, var28);
                  float var30 = method4371(var19, -var28, var28);
                  float var31 = var16 + var29;
                  float var32 = var17 + var30;
                  Box var33 = var1.getCachedHitbox();
                  Vec3d var34 = var1.getCachedPoint();
                  Vec3d var35 = this.method4364(var33, var34, var4);
                  int var36 = var8 ? 4 : 2;
                  int var37 = var8 ? 6 : 3;
                  if (var13 > 3.0F) {
                     var37 = Math.min(var37 + 1, var8 ? 8 : 5);
                     var36 = Math.min(var36 + 1, var8 ? 6 : 3);
                  }

                  if (var36 < 1) {
                     var36 = 1;
                  }

                  if (var37 < 1) {
                     var37 = 1;
                  }

                  if (!this.hasLastClamped) {
                     this.lastClampedYaw = var31;
                     this.lastClampedPitch = var32;
                     this.hasLastClamped = true;
                  }

                  float var38 = method4370(var31 - this.lastClampedYaw);
                  float var39 = var32 - this.lastClampedPitch;
                  int var40 = method4374(var3.player.age, var5);
                  int var41 = -1;

                  try {
                     var41 = method4376(var1.getCorrectionType());
                  } catch (Exception var63) {
                  }

                  if (var41 >= 0) {
                     try {
                        this.model.method4331(var4, var8, var26 * var27, var41);
                     } catch (Exception var62) {
                     }
                  }

                  float var42 = Math.abs(var11);
                  float var43 = Math.abs(var12);
                  float var44 = Math.abs(var11 - this.emaCamVelYaw);
                  float var45 = Math.abs(var12 - this.emaCamVelPitch);
                  this.method4353();
                  boolean var46 = false;

                  for (int var47 = 0; var47 < var36; var47++) {
                     float var48 = var36 == 1 ? 1.0F : (float)(var47 + 1) / (var36 + 1);
                     float var49 = this.lastClampedYaw + var38 * var48;
                     float var50 = this.lastClampedPitch + var39 * var48;
                     if (var8) {
                        float var51 = var47 == var36 - 1 ? 1.18F : 1.0F;
                        var49 = this.lastClampedYaw + var38 * var48 * var51;
                        var50 = this.lastClampedPitch + var39 * var48 * var51;
                     }

                     float var68 = method4371(method4370(var49 - var16), -var28, var28);
                     float var52 = method4371(var50 - var17, -var28, var28);
                     float var53 = var16 + var68;
                     float var54 = var17 + var52;
                     Helper336 var55 = method4363(var53, var54);
                     if (var55 == null) {
                        var55 = this.method4362(var53, var54);
                     }

                     if (var55 != null) {
                        float var56 = var26 * var27 * (1.0F / Math.max(1, var36));

                        for (int var57 = 0; var57 < var37; var57++) {
                           Vec3d var58 = this.method4360(var33, var35, var34, var4, var40, var47, var57, var37, var8, var13);
                           if (var58 != null) {
                              float var59 = var56;
                              if (!var8 && var57 > 0) {
                                 var59 = var56 * 0.62F;
                              }

                              if (var8 && var57 > 1) {
                                 var59 *= 0.75F;
                              }

                              try {
                                 this.model.method4332(var4, var15, var55, var33, var58, var59, var8, var13, var42, var43, var44, var45);
                              } catch (Exception var61) {
                              }

                              if (this.method4356(var4, var33, var58, var8, var68, var52, var42, var43, var44, var45, var59, var26, method4358(var68, var52))) {
                                 var46 = true;
                              }
                           }
                        }
                     }
                  }

                  this.lastClampedYaw = var31;
                  this.lastClampedPitch = var32;
                  if (this.attackBurstTicks > 0) {
                     this.attackBurstTicks--;
                  }

                  if (var46) {
                     this.method4357(false);
                  }

                  this.method4354(false);
               }
            }
         }
      }
   }

   void method4352(Aura var1) {
      if (!this.dirty) {
         this.method4357(true);
      } else {
         this.method4354(true);
         this.method4357(true);
      }
   }

   private void method4353() {
      this.dirty = true;
   }

   private void method4354(boolean var1) {
      if (this.dirty || var1) {
         try {
            this.model.method4340();
            this.dirty = false;
         } catch (Exception var3) {
         }
      }
   }

   private void method4355() {
      Helper422 var1 = this.exec;
      if (var1 != null) {
         if (!this.execReplayLoaded) {
            this.execReplayLoaded = true;

            try {
               if (!var1.loaded) {
                  var1.model.load();
                  var1.loaded = true;
               }
            } catch (Exception var3) {
            }
         }
      }
   }

   private boolean method4356(
      LivingEntity var1,
      Box var2,
      Vec3d var3,
      boolean var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13
   ) {
      Helper422 var14 = this.exec;
      if (var14 != null && var1 != null && var3 != null) {
         Helper421 var15 = var14.model;
         if (var15 == null) {
            return false;
         } else {
            Box var16 = var2 != null ? var2 : var1.getBoundingBox();
            if (var16 == null) {
               return false;
            } else {
               double var17 = var16.maxX - var16.minX;
               double var19 = var16.maxY - var16.minY;
               double var21 = var16.maxZ - var16.minZ;
               if (!(var17 <= 1.0E-9) && !(var19 <= 1.0E-9) && !(var21 <= 1.0E-9)) {
                  float var23 = (float)method4372((var3.x - var16.minX) / var17, 0.0, 1.0);
                  float var24 = (float)method4372((var3.y - var16.minY) / var19, 0.0, 1.0);
                  float var25 = (float)method4372((var3.z - var16.minZ) / var21, 0.0, 1.0);
                  float var26 = MathHelper.clamp(var7 * 20.0F, 0.0F, 240.0F);
                  float var27 = MathHelper.clamp(var8 * 20.0F, 0.0F, 240.0F);
                  float var28 = MathHelper.clamp(var9, 0.0F, 48.0F);
                  float var29 = MathHelper.clamp(var10, 0.0F, 48.0F);
                  float var30 = this.model.gcdYawEma > 1.0E-4F ? MathHelper.clamp(this.model.gcdYawEma, 0.006F, 0.45F) : 0.0F;
                  float var31 = this.model.gcdPitchEma > 1.0E-4F ? MathHelper.clamp(this.model.gcdPitchEma, 0.006F, 0.45F) : 0.0F;
                  float var32 = var12 <= 0.0F ? 1.0F : var11 / var12;
                  float var33 = var4 ? 0.16F : 0.1F;
                  float var34 = MathHelper.clamp(var33 * var32, 0.01F, 0.4F);

                  try {
                     boolean var35 = var15.method4256(
                        var1, var4, var5, var6, var23, var24, var25, var26, var27, var28, var29, var30, var31, MathHelper.clamp(var13, 0.0F, 50.0F), var34
                     );
                     if (var35) {
                        var14.method4300();
                        return true;
                     }
                  } catch (Exception var36) {
                  }

                  return false;
               } else {
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   private void method4357(boolean var1) {
      Helper422 var2 = this.exec;
      if (var2 != null) {
         long var3 = System.currentTimeMillis();
         if (!var1 && var3 - this.lastExecNotifyMs < 220L) {
            try {
               var2.method4300();
            } catch (Exception var6) {
            }
         } else {
            this.lastExecNotifyMs = var3;

            try {
               var2.method4301();
            } catch (Exception var7) {
            }
         }
      }
   }

   private static float method4358(float var0, float var1) {
      return (float)Math.sqrt(var0 * var0 + var1 * var1);
   }

   private static boolean method4359(Aura var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            Field var1 = auraAimModeField;
            if (var1 == null) {
               var1 = var0.getClass().getDeclaredField("aimMode");
               var1.setAccessible(true);
               auraAimModeField = var1;
            }

            if (var1.get(var0) instanceof Setting5 var3 && !var3.method2385("Neuro Aura")) {
               return false;
            }
         } catch (Exception var5) {
         }

         try {
            Field var6 = auraNeuroModeField;
            if (var6 == null) {
               var6 = var0.getClass().getDeclaredField("neuroMode");
               var6.setAccessible(true);
               auraNeuroModeField = var6;
            }

            if (var6.get(var0) instanceof Setting5 var8) {
               return var8.method2385("Запоминающий");
            }
         } catch (Exception var4) {
         }

         return true;
      }
   }

   private Vec3d method4360(Box var1, Vec3d var2, Vec3d var3, LivingEntity var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      if (var7 == 0) {
         return var2 != null ? var2 : var3;
      } else if (var7 == 1 && var3 != null) {
         return var3;
      } else if (var1 == null) {
         return var2 != null ? var2 : var3;
      } else {
         double var11 = (var1.minX + var1.maxX) * 0.5;
         double var13 = (var1.minY + var1.maxY) * 0.5;
         double var15 = (var1.minZ + var1.maxZ) * 0.5;
         double var17 = (var1.maxX - var1.minX) * 0.5;
         double var19 = (var1.maxY - var1.minY) * 0.5;
         double var21 = (var1.maxZ - var1.minZ) * 0.5;
         int var23 = var5 ^ var6 * -1640531527 ^ var7 * -2048144789;
         float var24 = method4375(var23);
         float var25 = method4375(var23 ^ 1757159915);
         float var26 = method4375(var23 ^ 48610963);
         float var27 = this.method4361(var4);
         float var28 = var9 ? 0.1F : 0.0F;
         float var29 = var10 > 2.0F ? 0.06F : 0.0F;
         float var30 = 0.0F;
         if (var27 <= -0.55F) {
            float var31 = method4371((-var27 - 0.55F) / 2.25F, 0.0F, 1.0F);
            var30 = 0.18F + 0.3F * var31;
         } else if (var27 >= 0.55F) {
            float var40 = method4371((var27 - 0.55F) / 2.25F, 0.0F, 1.0F);
            var30 = -(0.18F + 0.3F * var40);
         }

         float var41 = (var25 - 0.5F) * 0.9F + var28 + var29 + var30;
         float var32 = (var24 - 0.5F) * 0.95F;
         float var33 = (var26 - 0.5F) * 0.95F;
         if (!var9 && var7 == var8 - 1) {
            if (var27 >= 0.55F) {
               var41 = -0.34F;
            } else if (var27 <= -0.55F) {
               var41 = 0.52F;
            } else {
               var41 = 0.18F;
            }

            var32 *= 0.65F;
            var33 *= 0.65F;
         }

         double var34 = var11 + var32 * var17;
         double var36 = var13 + var41 * var19;
         double var38 = var15 + var33 * var21;
         var34 = method4372(var34, var1.minX + 1.0E-4, var1.maxX - 1.0E-4);
         var36 = method4372(var36, var1.minY + 1.0E-4, var1.maxY - 1.0E-4);
         var38 = method4372(var38, var1.minZ + 1.0E-4, var1.maxZ - 1.0E-4);
         return new Vec3d(var34, var36, var38);
      }
   }

   private float method4361(LivingEntity var1) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      if (var2.player != null && var1 != null) {
         try {
            double var3 = var1.getEyeY() - var2.player.getEyeY();
            return (float)var3;
         } catch (Exception var5) {
            return 0.0F;
         }
      } else {
         return 0.0F;
      }
   }

   private Helper336 method4362(float var1, float var2) {
      try {
         Vec3d var3 = this.model.method4341(var1, var2);
         return Helper349.method3469(var3);
      } catch (Exception var4) {
         return null;
      }
   }

   private static Helper336 method4363(float var0, float var1) {
      try {
         if (!turnsCtorTried) {
            turnsCtorTried = true;

            try {
               Constructor var2 = Helper336.class.getDeclaredConstructor(float.class, float.class);
               var2.setAccessible(true);
               turnsCtorFF = var2;
            } catch (Exception var5) {
            }

            try {
               Constructor var7 = Helper336.class.getDeclaredConstructor(double.class, double.class);
               var7.setAccessible(true);
               turnsCtorDD = var7;
            } catch (Exception var4) {
            }
         }

         if (turnsCtorFF != null && turnsCtorFF.newInstance(var0, var1) instanceof Helper336 var10) {
            return var10;
         }

         if (turnsCtorDD != null && turnsCtorDD.newInstance((double)var0, (double)var1) instanceof Helper336 var3) {
            return var3;
         }
      } catch (Exception var6) {
      }

      return null;
   }

   private Vec3d method4364(Box var1, Vec3d var2, LivingEntity var3) {
      MinecraftClient var4 = MinecraftClient.getInstance();
      if (var4.player == null) {
         return var2;
      } else if (var1 == null) {
         return var2;
      } else {
         Vec3d var5 = var4.player.getEyePos();
         float var6 = var4.player.getYaw();
         float var7 = var4.player.getPitch();

         Vec3d var8;
         try {
            var8 = this.model.method4341(var6, var7);
         } catch (Exception var14) {
            var8 = null;
         }

         if (var8 == null) {
            return var2;
         } else {
            double var9 = 7.0;
            if (var3 != null) {
               try {
                  var9 = Math.max(3.0, var4.player.distanceTo(var3) + 3.5);
               } catch (Exception var13) {
               }
            }

            Vec3d var11 = var5.add(var8.multiply(var9));
            Vec3d var12 = method4365(var1, var5, var11);
            if (var12 != null) {
               return var12;
            } else {
               return var2 != null ? var2 : new Vec3d((var1.minX + var1.maxX) * 0.5, (var1.minY + var1.maxY) * 0.6, (var1.minZ + var1.maxZ) * 0.5);
            }
         }
      }
   }

   private static Vec3d method4365(Box var0, Vec3d var1, Vec3d var2) {
      if (var0 != null && var1 != null && var2 != null) {
         try {
            Method var3 = Box.class.getMethod("raycast", Vec3d.class, Vec3d.class);
            if (var3.invoke(var0, var1, var2) instanceof Optional var5 && var5.orElse(null) instanceof Vec3d var7) {
               return var7;
            }
         } catch (Exception var8) {
         }

         return null;
      } else {
         return null;
      }
   }

   static float method4366(Helper336 var0, float var1) {
      if (var0 == null) {
         return var1;
      } else {
         try {
            Method var2 = turnsGetYaw;
            if (var2 == null) {
               try {
                  var2 = Helper336.class.getMethod("海");
               } catch (Exception var8) {
               }

               if (var2 == null) {
                  try {
                     var2 = Helper336.class.getMethod("yaw");
                  } catch (Exception var7) {
                  }
               }

               turnsGetYaw = var2;
            }

            if (var2 != null && var2.invoke(var0) instanceof Number var12) {
               return var12.floatValue();
            }
         } catch (Exception var9) {
         }

         try {
            Field var10 = turnsYawField;
            if (var10 == null) {
               try {
                  var10 = Helper336.class.getDeclaredField("yaw");
                  var10.setAccessible(true);
               } catch (Exception var5) {
               }

               turnsYawField = var10;
            }

            if (var10 != null && var10.get(var0) instanceof Number var4) {
               return var4.floatValue();
            }
         } catch (Exception var6) {
         }

         return var1;
      }
   }

   static float method4367(Helper336 var0, float var1) {
      if (var0 == null) {
         return var1;
      } else {
         try {
            Method var2 = turnsGetPitch;
            if (var2 == null) {
               try {
                  var2 = Helper336.class.getMethod("川");
               } catch (Exception var8) {
               }

               if (var2 == null) {
                  try {
                     var2 = Helper336.class.getMethod("pitch");
                  } catch (Exception var7) {
                  }
               }

               turnsGetPitch = var2;
            }

            if (var2 != null && var2.invoke(var0) instanceof Number var12) {
               return var12.floatValue();
            }
         } catch (Exception var9) {
         }

         try {
            Field var10 = turnsPitchField;
            if (var10 == null) {
               try {
                  var10 = Helper336.class.getDeclaredField("pitch");
                  var10.setAccessible(true);
               } catch (Exception var5) {
               }

               turnsPitchField = var10;
            }

            if (var10 != null && var10.get(var0) instanceof Number var4) {
               return var4.floatValue();
            }
         } catch (Exception var6) {
         }

         return var1;
      }
   }

   static int method4368(Object var0) {
      if (var0 == null) {
         return 0;
      } else {
         try {
            Field var1 = swingTicksFieldA;
            if (var1 == null) {
               try {
                  var1 = var0.getClass().getDeclaredField("handSwingTicks");
                  var1.setAccessible(true);
               } catch (Exception var10) {
               }

               swingTicksFieldA = var1;
            }

            if (var1 != null && var1.getType() == int.class) {
               return var1.getInt(var0);
            }

            if (var1 != null && var1.get(var0) instanceof Integer var20) {
               return var20;
            }
         } catch (Exception var11) {
         }

         try {
            Field var12 = swingTicksFieldB;
            if (var12 == null) {
               try {
                  var12 = var0.getClass().getDeclaredField("handSwingingTicks");
                  var12.setAccessible(true);
               } catch (Exception var8) {
               }

               swingTicksFieldB = var12;
            }

            if (var12 != null && var12.getType() == int.class) {
               return var12.getInt(var0);
            }

            if (var12 != null && var12.get(var0) instanceof Integer var19) {
               return var19;
            }
         } catch (Exception var9) {
         }

         try {
            Method var13 = swingTicksMethod;
            if (var13 == null) {
               try {
                  var13 = var0.getClass().getMethod("getHandSwingTicks");
               } catch (Exception var6) {
               }

               if (var13 != null) {
                  var13.setAccessible(true);
               }

               swingTicksMethod = var13;
            }

            if (var13 != null && var13.invoke(var0) instanceof Integer var18) {
               return var18;
            }
         } catch (Exception var7) {
         }

         try {
            Field var14 = swingTicksFieldC;
            if (var14 == null) {
               try {
                  var14 = var0.getClass().getDeclaredField("ticksSinceLastSwing");
                  var14.setAccessible(true);
               } catch (Exception var4) {
               }

               swingTicksFieldC = var14;
            }

            if (var14 != null && var14.getType() == int.class) {
               return var14.getInt(var0);
            }

            if (var14 != null && var14.get(var0) instanceof Integer var3) {
               return var3;
            }
         } catch (Exception var5) {
         }

         return 0;
      }
   }

   static boolean method4369(int var0, int var1) {
      if (var1 < var0) {
         return true;
      } else {
         return var0 == 0 && var1 > 0 ? true : var0 > 0 && var1 == 0;
      }
   }

   private static float method4370(float var0) {
      var0 %= 360.0F;
      if (var0 >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   private static float method4371(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   private static double method4372(double var0, double var2, double var4) {
      return var0 < var2 ? var2 : (var0 > var4 ? var4 : var0);
   }

   private static float method4373(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   private static int method4374(int var0, int var1) {
      int var2 = var0 * -1640531527;
      var2 ^= var1 * -2048144789;
      var2 ^= var2 >>> 16;
      var2 *= -1028477387;
      var2 ^= var2 >>> 13;
      var2 *= 668265263;
      return var2 ^ var2 >>> 16;
   }

   private static float method4375(int var0) {
      var0 ^= var0 >>> 16;
      var0 *= 2146121005;
      var0 ^= var0 >>> 15;
      var0 *= -2073254261;
      var0 ^= var0 >>> 16;
      int var1 = var0 & 16777215;
      return var1 / 1.6777215E7F;
   }

   private static int method4376(Setting5 var0) {
      if (var0 == null) {
         return 0;
      } else if (var0.method2385("Focused")) {
         return 1;
      } else if (var0.method2385("Target")) {
         return 2;
      } else if (var0.method2385("Focus V2")) {
         return 2;
      } else if (var0.method2385("Not visible")) {
         return 3;
      } else {
         return var0.method2385("Neuro") ? 0 : 0;
      }
   }
}
