package zenith;

import com.mojang.authlib.GameProfile;
import java.nio.file.Path;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity.LootPool29;
import zenith.zov.client.screens.entity.ImplOtherClientPlayerEntity;

public class MinecraftClientHolder_5 {
   private static final net.minecraft.client.MinecraftClient l1II11IllIl1IIII1l1lIllI1l1 = net.minecraft.client.MinecraftClient.getInstance();
   private final UUID Il1II11IIIl1I1Il1Il1I1Illl11;
   private ImplOtherClientPlayerEntity lI11I111IlIIIlII11l11I1II1;
   private String ll1IIIII1I11l11 = "";
   private net.minecraft.util.math.Vec3d l1l111I11I1I;
   private net.minecraft.util.math.Vec3d l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = net.minecraft.util.math.Vec3d.ZERO;
   private float l1l11lIIlIlll1llI = ThreadLocalRandom.current().nextFloat() * 360.0F;
   private float llII1lIlI1l11lIIlI11IllIlIII;
   private float l11ll1l1I1I1I1lIl1ll11IlI1IlI;
   private net.minecraft.util.math.Vec3d lI1IIllII11I;
   private net.minecraft.util.math.Vec3d lI11l11111lI1lII;
   private float lIIIIl11ll1l1lll1l1I11I1llll;
   private float Ill1lIll111;
   private float Il11l1I1Ill1IIIIl;
   private boolean III1l1I1I1IlI;
   private boolean II1lll1l1l1lII1l111;
   private boolean lIIlllI1lIIl1ll1l111II1Il;
   private long IIlIIII11Il = System.currentTimeMillis();
   private double I1Il11II1llIII;
   private double lIlIll11l1l;
   private int I111lIlIl1111I1IIIIII11I = ThreadLocalRandom.current().nextBoolean() ? 1 : -1;
   private long llllllIllIIl1Il1lIlI1I1lIIl11l = 0L;
   private boolean lI1111I1l1l1llI = false;
   private int IllIlIl1l11l111lII1lIlIlIl1l1 = 0;
   private static final double lIlII1II11II = 0.12;
   private static final double lIllI1I1I1 = 0.72;

   public MinecraftClientHolder_5(UUID uuid) {
      this.Il1II11IIIl1I1Il1Il1I1Illl11 = UUID.nameUUIDFromBytes(("zenith-pet:" + uuid.toString()).getBytes());
   }

   public void StringHolder_8(ClientWorld ClientWorld, net.minecraft.util.math.Vec3d Vec3d) {
      this.StringHolder_7();
      this.ll1IIIII1I11l11 = "";
      this.lI11I111IlIIIlII11l11I1II1 = new ImplOtherClientPlayerEntity(ClientWorld, new GameProfile(this.Il1II11IIIl1I1Il1Il1I1Illl11, ""));
      this.lI11I111IlIIIlII11l11I1II1.setId(Integer.MAX_VALUE - ThreadLocalRandom.current().nextInt(1, 100000));
      this.lI11I111IlIIIlII11l11I1II1.setCustomNameVisible(false);
      this.lI11I111IlIIIlII11l11I1II1.setInvisible(false);
      this.lI11I111IlIIIlII11l11I1II1.setNoGravity(true);
      this.CallableImpl(ZenithClient.getInstance().BlockPosHolder().SetColorHandler_2());
      EntityAttributeInstance EntityAttributeInstance = this.lI11I111IlIIIlII11l11I1II1.getAttributeInstance(EntityAttributes.STEP_HEIGHT);
      if (EntityAttributeInstance != null) {
         EntityAttributeInstance.setBaseValue(0.6);
      }

      this.l1l111I11I1I = Vec3d;
      this.lI1IIllII11I = Vec3d;
      this.lI11l11111lI1lII = Vec3d;
      this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = net.minecraft.util.math.Vec3d.ZERO;
      this.lIIIIl11ll1l1lll1l1I11I1llll = 0.0F;
      this.Ill1lIll111 = 0.0F;
      this.Il11l1I1Ill1IIIIl = 0.0F;
      this.llII1lIlI1l11lIIlI11IllIlIII = 0.0F;
      this.l11ll1l1I1I1I1lIl1ll11IlI1IlI = 0.0F;
      this.I1Il11II1llIII = Vec3d.x;
      this.lIlIll11l1l = Vec3d.z;
      this.IIlIIII11Il = System.currentTimeMillis();
      this.lI11I111IlIIIlII11l11I1II1.updateTrackedPositionAndAngles(Vec3d.x, Vec3d.y, Vec3d.z, 0.0F, 0.0F, 0);
      this.lI11I111IlIIIlII11l11I1II1.setHeadYaw(0.0F);
      ClientWorld.addEntity(this.lI11I111IlIIIlII11l11I1II1);
   }

   public void StringHolder_7() {
      if (this.lI11I111IlIIIlII11l11I1II1 != null) {
         this.lI11I111IlIIIlII11l11I1II1.setRemoved(LootPool29.KILLED);
         this.lI11I111IlIIIlII11l11I1II1.onRemoved();
         this.lI11I111IlIIIlII11l11I1II1 = null;
      }

      StringHolder_23.I11Il1lIIllII1l1I1I11.remove(this.Il1II11IIIl1I1Il1Il1I1Illl11);
   }

   public boolean Vec3dHolder() {
      if (this.lI11I111IlIIIlII11l11I1II1 == null || this.lI11I111IlIIIlII11l11I1II1.isRemoved()) {
         return false;
      } else {
         return l1II11IllIl1IIII1l1lIllI1l1.world == null
            ? false
            : l1II11IllIl1IIII1l1lIllI1l1.world.getEntityById(this.lI11I111IlIIIlII11l11I1II1.getId()) == this.lI11I111IlIIIlII11l11I1II1;
      }
   }

   public void CallableImpl(float f) {
      if (this.lI11I111IlIIIlII11l11I1II1 != null) {
         EntityAttributeInstance EntityAttributeInstance = this.lI11I111IlIIIlII11l11I1II1.getAttributeInstance(EntityAttributes.SCALE);
         if (EntityAttributeInstance != null) {
            EntityAttributeInstance.setBaseValue((double)f);
         }
      }
   }

   public void ScreenHolder(String s) {
      if (s != null && !s.isBlank()) {
         if (!s.equals(this.ll1IIIII1I11l11)) {
            this.ll1IIIII1I11l11 = s;
            StringHolder_23.EventBus(this.Il1II11IIIl1I1Il1Il1I1Illl11, s);
         }
      } else {
         StringHolder_23.I11Il1lIIllII1l1I1I11.remove(this.Il1II11IIIl1I1Il1Il1I1Illl11);
         this.ll1IIIII1I11l11 = "";
      }
   }

   public void EventTarget(Path path) {
      if (path == null) {
         StringHolder_23.I11Il1lIIllII1l1I1I11.remove(this.Il1II11IIIl1I1Il1Il1I1Illl11);
         this.ll1IIIII1I11l11 = "";
      } else {
         String s = StringHolder_23.ZenithInternal095(path);
         if (!s.equals(this.ll1IIIII1I11l11)) {
            this.ll1IIIII1I11l11 = s;
            StringHolder_23.StringHolder_8(this.Il1II11IIIl1I1Il1Il1I1Illl11, path);
         }
      }
   }

   public void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, float f1, boolean flag3, LivingEntity LivingEntity) {
      this.lI11l11111lI1lII = this.lI1IIllII11I;
      this.Il11l1I1Ill1IIIIl = this.lIIIIl11ll1l1lll1l1I11I1llll;
      if (this.l1l111I11I1I == null) {
         this.l1l111I11I1I = Vec3dxxx;
      }

      if (this.l1l111I11I1I.distanceTo(Vec3dxxx) > 10.0) {
         this.l1l111I11I1I = Vec3dxxx;
         this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = net.minecraft.util.math.Vec3d.ZERO;
         this.lI1IIllII11I = this.l1l111I11I1I;
         this.lI11l11111lI1lII = this.l1l111I11I1I;
         this.SimpleFramebufferHolder();
      } else {
         net.minecraft.util.math.Vec3d Vec3dx;
         if (this.III1l1I1I1IlI) {
            double d0 = Vec3dxxx.y - this.l1l111I11I1I.y;
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x, d0 * 0.2, this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z
            );
            Vec3dx = this.l1l111I11I1I.add(this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1);
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x, 0.0, this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z
            );
         } else {
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.add(0.0, -0.08, 0.0);
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.multiply(1.0, 0.98, 1.0);
            if (this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.y < -0.5) {
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
                  this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x, -0.5, this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z
               );
            }

            double d25 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x;
            double d1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.y;
            double d3 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z;
            double d5 = this.l1l111I11I1I.x;
            double d6 = this.l1l111I11I1I.y;
            double d8 = this.l1l111I11I1I.z;
            boolean flag = false;
            if (!EventTarget(d5, d6 + d1, d8)) {
               d6 += d1;
            } else {
               if (d1 < 0.0) {
                  double d10 = d6 + d1;
                  double d12 = d6;

                  for (int i = 0; i < 8; i++) {
                     double d13 = (d10 + d12) * 0.5;
                     if (EventTarget(d5, d13, d8)) {
                        d10 = d13;
                     } else {
                        d12 = d13;
                     }
                  }

                  d6 = d12;
                  flag = true;
               }

               d1 = 0.0;
            }

            if (!flag && EventTarget(d5, d6 - 0.02, d8)) {
               flag = true;
            }

            if (Math.abs(d25) > 1.0E-5) {
               if (!EventTarget(d5 + d25, d6, d8)) {
                  d5 += d25;
               } else {
                  boolean flag1 = false;
                  if (flag) {
                     for (double d11 = 0.1; d11 <= 0.6; d11 += 0.1) {
                        if (!EventTarget(d5 + d25, d6 + d11, d8) && !EventTarget(d5, d6 + d11, d8)) {
                           d6 += d11;
                           d5 += d25;
                           flag1 = true;
                           break;
                        }
                     }
                  }

                  if (!flag1) {
                     if (flag && d1 <= 0.0 && Event(d5 + Math.signum(d25) * 0.35, d6, d8)) {
                        d1 = 0.52;
                     }

                     d25 = 0.0;
                  }
               }
            }

            if (Math.abs(d3) > 1.0E-5) {
               if (!EventTarget(d5, d6, d8 + d3)) {
                  d8 += d3;
               } else {
                  boolean flag2 = false;
                  if (flag) {
                     for (double d33 = 0.1; d33 <= 0.6; d33 += 0.1) {
                        if (!EventTarget(d5, d6 + d33, d8 + d3) && !EventTarget(d5, d6 + d33, d8)) {
                           d6 += d33;
                           d8 += d3;
                           flag2 = true;
                           break;
                        }
                     }
                  }

                  if (!flag2) {
                     if (flag && d1 <= 0.0 && Event(d5, d6, d8 + Math.signum(d3) * 0.35)) {
                        d1 = 0.52;
                     }

                     d3 = 0.0;
                  }
               }
            }

            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(d25, d1, d3);
            Vec3dx = new net.minecraft.util.math.Vec3d(d5, d6, d8);
            this.lIIlllI1lIIl1ll1l111II1Il = flag;
         }

         double d26 = this.lIIlllI1lIIl1ll1l111II1Il ? 1.0 : 0.2;
         if (LivingEntity != null && LivingEntity.isAlive()) {
            net.minecraft.util.math.Box Box = LivingEntity.getBoundingBox().expand(0.1);
            double d2 = (Box.minX + Box.maxX) * 0.5;
            double d30 = (Box.minZ + Box.maxZ) * 0.5;
            double d31 = (Box.maxX - Box.minX) * 0.5;
            double d7 = (Box.maxZ - Box.minZ) * 0.5;
            double d9 = Math.max(d31, d7) + 0.6;
            double d32 = LivingEntity.getY();
            double d34 = Math.abs(Vec3dx.y - d32);
            double d35 = Math.hypot(Vec3dx.x - d2, Vec3dx.z - d30);
            if (d34 > 1.0 && this.lIIlllI1lIIl1ll1l111II1Il || d35 > 4.0) {
               double d36 = Math.atan2(Vec3dxxx.z - d30, Vec3dxxx.x - d2);
               double d37 = d2 + Math.cos(d36) * d9;
               double d38 = d30 + Math.sin(d36) * d9;
               Vec3dx = new net.minecraft.util.math.Vec3d(d37, d32, d38);
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = net.minecraft.util.math.Vec3d.ZERO;
               this.l1l111I11I1I = Vec3dx;
               this.lI1IIllII11I = Vec3dx;
               this.lI11l11111lI1lII = Vec3dx;
               this.IllIlIl1l11l111lII1lIlIlIl1l1 = 0;
               this.SimpleFramebufferHolder();
               return;
            }

            double d14 = Math.atan2(Vec3dx.z - d30, Vec3dx.x - d2);
            double d15 = d14 + 0.3 * (double)this.I111lIlIl1111I1IIIIII11I;
            double d16 = Math.atan2(Vec3dxxx.z - d30, Vec3dxxx.x - d2);
            double d17 = d15 - d16;

            while (d17 > Math.PI) {
               d17 -= Math.PI * 2;
            }

            while (d17 < -Math.PI) {
               d17 += Math.PI * 2;
            }

            double d18 = Math.PI / 2;
            if (d17 > Math.PI / 2) {
               d17 = Math.PI / 2;
               this.I111lIlIl1111I1IIIIII11I = -this.I111lIlIl1111I1IIIIII11I;
            } else if (d17 < -Math.PI / 2) {
               d17 = -Math.PI / 2;
               this.I111lIlIl1111I1IIIIII11I = -this.I111lIlIl1111I1IIIIII11I;
            }

            d15 = d16 + d17;
            double d19 = d2 + Math.cos(d15) * d9;
            double d20 = d30 + Math.sin(d15) * d9;
            double d21 = MathHelper.lerp(0.35, Vec3dx.x, d19);
            double d22 = MathHelper.lerp(0.35, Vec3dx.z, d20);
            double d23 = Vec3dx.x;
            double d24 = Vec3dx.z;
            if (!EventTarget(d21, Vec3dx.y, Vec3dx.z) && ZenithInternal095(d21, Vec3dx.y, Vec3dx.z)) {
               d23 = d21;
            }

            if (!EventTarget(d23, Vec3dx.y, d22) && ZenithInternal095(d23, Vec3dx.y, d22)) {
               d24 = d22;
            }

            Vec3dx = new net.minecraft.util.math.Vec3d(d23, Vec3dx.y, d24);
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(0.0, this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.y, 0.0);
            if (this.lI11I111IlIIIlII11l11I1II1.age % 40 == 0) {
               this.I111lIlIl1111I1IIIIII11I = -this.I111lIlIl1111I1IIIIII11I;
            }

            if (this.lIIlllI1lIIl1ll1l111II1Il) {
               this.IllIlIl1l11l111lII1lIlIlIl1l1++;
               if (this.IllIlIl1l11l111lII1lIlIlIl1l1 >= 3) {
                  this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
                     this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x, 0.45, this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z
                  );
                  this.IllIlIl1l11l111lII1lIlIlIl1l1 = 0;
               }
            } else {
               this.IllIlIl1l11l111lII1lIlIlIl1l1 = 0;
            }

            this.lI1111I1l1l1llI = true;
         } else {
            this.lI1111I1l1l1llI = false;
            double d27 = Vec3dx.distanceTo(Vec3dxxx);
            if (d27 > 2.0) {
               net.minecraft.util.math.Vec3d Vec3dxx = Vec3dxxx.subtract(Vec3dx);
               double d4 = Math.min(1.0, (d27 - 2.0) / 3.0) * d26;
               net.minecraft.util.math.Vec3d Vec3dxxx = Vec3dxx.normalize();
               this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1
                  .add(Vec3dxxx.x * d4, 0.0, Vec3dxxx.z * d4);
            }
         }

         this.StringHolder_8(Vec3dxxx, LivingEntity);
         this.l1l111I11I1I = Vec3dx;
         if (this.l1l111I11I1I.distanceTo(Vec3dxxx) < 0.1) {
            this.l1l11lIIlIlll1llI = ThreadLocalRandom.current().nextFloat() * 360.0F;
            double d28 = -Math.sin(Math.toRadians((double)this.l1l11lIIlIlll1llI)) * 0.1;
            double d29 = Math.cos(Math.toRadians((double)this.l1l11lIIlIlll1llI)) * 0.1;
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.add(d28, 0.0, d29);
         }

         float f = this.lIIlllI1lIIl1ll1l111II1Il ? 0.6F : 0.91F;
         this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1 = new net.minecraft.util.math.Vec3d(
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.x * (double)f,
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.y,
            this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1.z * (double)f
         );
         this.lI1IIllII11I = this.l1l111I11I1I;
         if (Math.abs(this.l1l111I11I1I.x - this.I1Il11II1llIII) > 0.1 || Math.abs(this.l1l111I11I1I.z - this.lIlIll11l1l) > 0.1) {
            this.IIlIIII11Il = System.currentTimeMillis();
         }

         this.I1Il11II1llIII = this.l1l111I11I1I.x;
         this.lIlIll11l1l = this.l1l111I11I1I.z;
         this.SimpleFramebufferHolder();
      }
   }

   private void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, LivingEntity LivingEntity) {
      net.minecraft.util.math.Vec3d Vec3dx = LivingEntity != null && LivingEntity.isAlive() ? LivingEntity.getPos() : Vec3dx;
      double d0 = Vec3dx.x - this.l1l111I11I1I.x;
      double d1 = Vec3dx.z - this.l1l111I11I1I.z;
      float f = (float)Math.toDegrees(Math.atan2(d1, d0)) - 90.0F;
      this.llII1lIlI1l11lIIlI11IllIlIII = f;
      this.l11ll1l1I1I1I1lIl1ll11IlI1IlI = f;
      this.lIIIIl11ll1l1lll1l1I11I1llll = f;
      this.Ill1lIll111 = f;
   }

   public void ZenithInternal004() {
   }

   public void StringHolder_8(net.minecraft.util.math.Vec3d Vec3d, float f, boolean flag) {
      this.lI11l11111lI1lII = this.lI1IIllII11I;
      this.Il11l1I1Ill1IIIIl = this.lIIIIl11ll1l1lll1l1I11I1llll;
      this.l1l111I11I1I = Vec3d;
      this.lI1IIllII11I = Vec3d;
      this.lIIIIl11ll1l1lll1l1I11I1llll = f;
      this.Ill1lIll111 = f;
      this.l11ll1l1I1I1I1lIl1ll11IlI1IlI = f;
      this.SimpleFramebufferHolder();
   }

   public void StringHolder_8(PlayerEntity PlayerEntity) {
      if (this.lI11I111IlIIIlII11l11I1II1 != null && !this.lI11I111IlIIIlII11l11I1II1.isRemoved() && PlayerEntity != null) {
         this.lI11I111IlIIIlII11l11I1II1.getInventory().selectedSlot = PlayerEntity.getInventory().selectedSlot;
         int i = PlayerEntity.getInventory().selectedSlot;
         this.lI11I111IlIIIlII11l11I1II1.getInventory().main.set(i, ((ItemStack)PlayerEntity.getInventory().main.get(i)).copy());
         this.lI11I111IlIIIlII11l11I1II1.getInventory().offHand.set(0, ((ItemStack)PlayerEntity.getInventory().offHand.get(0)).copy());

         for (int j = 0; j < 4; j++) {
            this.lI11I111IlIIIlII11l11I1II1.getInventory().armor.set(j, ((ItemStack)PlayerEntity.getInventory().armor.get(j)).copy());
         }
      }
   }

   public net.minecraft.util.math.Vec3d longHolder_5(float f) {
      return this.lI11l11111lI1lII != null && this.lI1IIllII11I != null
         ? new net.minecraft.util.math.Vec3d(
            MathHelper.lerp((double)f, this.lI11l11111lI1lII.x, this.lI1IIllII11I.x),
            MathHelper.lerp((double)f, this.lI11l11111lI1lII.y, this.lI1IIllII11I.y),
            MathHelper.lerp((double)f, this.lI11l11111lI1lII.z, this.lI1IIllII11I.z)
         )
         : this.lI1IIllII11I;
   }

   private void SimpleFramebufferHolder() {
      if (this.lI11I111IlIIIlII11l11I1II1 != null && !this.lI11I111IlIIIlII11l11I1II1.isRemoved()) {
         this.lI11I111IlIIIlII11l11I1II1
            .updateTrackedPositionAndAngles(this.lI1IIllII11I.x, this.lI1IIllII11I.y, this.lI1IIllII11I.z, this.lIIIIl11ll1l1lll1l1I11I1llll, 0.0F, 3);
         this.lI11I111IlIIIlII11l11I1II1.updateTrackedHeadRotation(this.Ill1lIll111, 3);
         this.lI11I111IlIIIlII11l11I1II1.updateTrackedPosition(this.lI1IIllII11I.x, this.lI1IIllII11I.y, this.lI1IIllII11I.z);
         this.lI11I111IlIIIlII11l11I1II1.setOnGround(this.lIIlllI1lIIl1ll1l111II1Il);
         this.lI11I111IlIIIlII11l11I1II1.setVelocity(this.l1l1IIl11IIl1lIlI1Il1lIIl1I1l1);
      }
   }

   private static boolean StringHolder_8(double d0, double d1, double d2) {
      if (l1II11IllIl1IIII1l1lIllI1l1.world == null) {
         return false;
      } else {
         BlockPos BlockPos = BlockPos.ofFloored(d0, d1, d2);
         return l1II11IllIl1IIII1l1lIllI1l1.world.getBlockState(BlockPos).isSolid();
      }
   }

   private static net.minecraft.util.math.Box EventBus(double d0, double d1, double d2) {
      return new net.minecraft.util.math.Box(d0 - 0.12, d1, d2 - 0.12, d0 + 0.12, d1 + 0.72, d2 + 0.12);
   }

   private static boolean EventTarget(double d0, double d1, double d2) {
      return l1II11IllIl1IIII1l1lIllI1l1.world != null && !l1II11IllIl1IIII1l1lIllI1l1.world.isSpaceEmpty(EventBus(d0, d1, d2));
   }

   private static boolean ZenithInternal095(double d0, double d1, double d2) {
      if (l1II11IllIl1IIII1l1lIllI1l1.world == null) {
         return true;
      } else {
         for (double d3 = 0.01; d3 <= 1.5; d3 += 0.25) {
            if (!l1II11IllIl1IIII1l1lIllI1l1.world.isSpaceEmpty(EventBus(d0, d1 - d3, d2))) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean Event(double d0, double d1, double d2) {
      return l1II11IllIl1IIII1l1lIllI1l1.world == null ? false : !EventTarget(d0, d1 + 1.0, d2);
   }

   private static float Event(float f, float f1, float f2) {
      return f + MathHelper.wrapDegrees(f1 - f) * f2;
   }

   public UUID floatHolder_13() {
      return this.Il1II11IIIl1I1Il1Il1I1Illl11;
   }

   public ImplOtherClientPlayerEntity StringHolder_3() {
      return this.lI11I111IlIIIlII11l11I1II1;
   }

   public String HashMapHolder() {
      return this.ll1IIIII1I11l11;
   }

   public net.minecraft.util.math.Vec3d doubleHolder() {
      return this.lI1IIllII11I;
   }

   public net.minecraft.util.math.Vec3d OnMouseClickedHandler() {
      return this.lI11l11111lI1lII;
   }

   public float ZenithInternal116() {
      return this.lIIIIl11ll1l1lll1l1I11I1llll;
   }

   public float floatHolder_5() {
      return this.Ill1lIll111;
   }

   public float GetHeightHandler() {
      return this.Il11l1I1Ill1IIIIl;
   }

   public boolean OnMouseReleasedHandler() {
      return this.III1l1I1I1IlI;
   }

   public void ListHolder_6(boolean flag) {
      this.III1l1I1I1IlI = flag;
   }
}
