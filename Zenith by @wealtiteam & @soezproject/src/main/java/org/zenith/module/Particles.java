package org.zenith.module;

import org.zenith.config.ConfigJsonUtil;
import org.zenith.core.NbtEditor;
import org.zenith.core.TextScanner;
import org.zenith.event.ChatMessageEvent;
import org.zenith.event.EventInteractBlock;
import org.zenith.event.EventMouseScrollHook;
import org.zenith.setting.Setting;

import org.zenith.module.ModuleInfo;

import org.zenith.util.ArgbColor;
import org.zenith.module.Category;
import org.zenith.util.ColorUtils;
import org.zenith.event.Event18;
import org.zenith.module.Module;
import org.zenith.core.ProfileItemBuilder;
import org.zenith.ZenithClient;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.StringCodec;
import org.zenith.render.ScreenProjection;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.HudPreviewItem;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import org.zenith.event.AttackEntityEvent;
import org.zenith.event.Event01;
import org.zenith.event.Event08;
import org.zenith.event.Event09;
import org.zenith.event.Event13;
import org.zenith.event.Event19;
import org.zenith.event.Event20;
import org.zenith.event.Event49;
import org.zenith.event.EventEntityCollision;
import org.zenith.event.EventGetBasicProjectionMatrixHook2;
import org.zenith.event.EventHookWorldRender;
import org.zenith.event.EventInjectPlaced;
import org.zenith.event.DataChangedEvent;
import org.zenith.event.VelocityChangeEvent;

import org.zenith.setting.BooleanSetting;
import org.zenith.setting.ColorSetting;
import org.zenith.setting.ModeSetting;
import org.zenith.setting.ModeSetting3;
import org.zenith.setting.NumberSetting;





import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventTarget;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;

@ModuleInfo(
   name = "Particles",
   category = Category.RENDER,
   description = "module.particles.description"
)
public class Particles extends Module {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final Particles particles = new Particles();
   public static final Identifier identifier3 = Identifier.of("zenith", "visuals/jumpcircle/glowboost.png");
   public static final int[] val100 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 0, 2, 1, 3, 4, 6, 5, 7, 0, 4, 1, 5, 2, 6, 3, 7};
   public static final int[] val325 = new int[]{0, 1, 1, 2, 2, 3, 3, 0, 0, 4, 1, 4, 2, 4, 3, 4};
   public static final float float146 = 0.6F;
   public static final float float147 = 1.6F;
   public static final int int215 = 200;
   public static final long long121 = 50L;
   public static final double double87 = 2.5;
   public static final int int216 = 12;
   public static final double double88 = 1.5;
   public final ModeSetting modeSetting14 = ModeSetting.on23(
      "module.particles.effects",
      "module.particles.effects.desc",
      List.of(
         "module.particles.meteor",
         "module.particles.cubes",
         "module.particles.pyramids",
         "module.particles.totem",
         "module.particles.crescent",
         "module.particles.heart",
         "module.particles.stars"
      )
   );
   public final NumberSetting count3 = new NumberSetting(
      "module.particles.count", 14.0F, 1.0F, 80.0F, 1.0F, "module.particles.count.desc", ""
   );
   public final NumberSetting lifetime3 = new NumberSetting(
      "module.particles.lifetime", 1600.0F, 500.0F, 5000.0F, 100.0F, "module.particles.lifetime.desc", "ms"
   );
   public final NumberSetting size3 = new NumberSetting(
      "module.particles.size", 0.45F, 0.1F, 1.5F, 0.05F, "module.particles.size.desc", "x"
   );
   public final NumberSetting radius2 = new NumberSetting(
      "module.particles.radius", 8.0F, 0.1F, 80.0F, 0.5F, "module.particles.radius.desc", ""
   );
   public final NumberSetting tailLength = new NumberSetting(
      "module.particles.tailLength",
      0.3F,
      0.05F,
      0.7F,
      0.05F,
      "module.particles.tailLength.desc",
      "x",
      () -> this.modeSetting14.ConfigJsonUtil(0),
      null
   );
   public final BooleanSetting hit = new BooleanSetting("module.particles.hit", "module.particles.hit.desc", false);
   public final NumberSetting glow2 = new NumberSetting(
      "module.particles.glow",
      1.0F,
      0.0F,
      3.0F,
      0.1F,
      "module.particles.glow.desc",
      "x",
      () -> this.modeSetting14.ConfigJsonUtil(1)
            || this.modeSetting14.ConfigJsonUtil(2)
            || this.modeSetting14.ConfigJsonUtil(3)
            || this.modeSetting14.ConfigJsonUtil(4)
            || this.modeSetting14.ConfigJsonUtil(5)
            || this.modeSetting14.ConfigJsonUtil(6)
            || this.hit.isEnabled(),
      null
   );
   public final ModeSetting modeSetting15 = ModeSetting.on23(
      "module.particles.hitTypes", "module.particles.hitTypes.desc", List.of("module.particles.cubes", "module.particles.diamond", "module.particles.triangle")
   );
   public final ModeSetting3 hitPhysics = new ModeSetting3(
      "module.particles.hitPhysics",
      "module.particles.hitPhysics.desc",
      this.hit::isEnabled,
      "module.particles.drop",
      "module.particles.fly",
      "module.particles.both"
   );
   public final NumberSetting hitCount = new NumberSetting(
      "module.particles.hitCount", 10.0F, 1.0F, 20.0F, 1.0F, "module.particles.hitCount.desc", "", this.hit::isEnabled, null
   );
   public final NumberSetting hitLifetime = new NumberSetting(
      "module.particles.hitLifetime", 1000.0F, 100.0F, 3000.0F, 50.0F, "module.particles.hitLifetime.desc", "ms", this.hit::isEnabled, null
   );
   public final NumberSetting hitSpeed = new NumberSetting(
      "module.particles.hitSpeed", 1.0F, 0.1F, 3.0F, 0.1F, "module.particles.hitSpeed.desc", "x", this.hit::isEnabled, null
   );
   public final NumberSetting hitScale = new NumberSetting(
      "module.particles.hitScale", 1.0F, 0.5F, 1.5F, 0.1F, "module.particles.hitScale.desc", "x", this.hit::isEnabled, null
   );
   public final BooleanSetting hitOnlyCrit = new BooleanSetting(
      "module.particles.hitOnlyCrit", "module.particles.hitOnlyCrit.desc", false, this.hit::isEnabled
   );
   public final BooleanSetting hitBounce = new BooleanSetting(
      "module.particles.hitBounce", "module.particles.hitBounce.desc", false, () -> this.hit.isEnabled() && !this.hitPhysics.is(1)
   );
   public final ModeSetting3 color3 = new ModeSetting3(
      "module.particles.color", "module.particles.colorMode.desc", "module.particles.sync", "module.particles.custom"
   );
   public final ColorSetting customColor4 = new ColorSetting(
      "module.particles.customColor", "module.particles.customColor.desc", ArgbColor.var11934, () -> this.color3.is(1)
   );
   public final List<Particles_Var155> list59 = new ArrayList<>();
   public final List<Particles_Var159> list60 = new ArrayList<>();
   public final List<Particles_Var159> list61 = new ArrayList<>();
   public final List<Particles_Var159> list62 = new ArrayList<>();
   public final List<Particles_Var159> list63 = new ArrayList<>();
   public final List<Particles_Var159> list64 = new ArrayList<>();
   public final List<Particles_Var159> list65 = new ArrayList<>();
   public final List<Particles_Var165> list66 = new ArrayList<>();
   public final List<Particles_Var165> list67 = new ArrayList<>();
   public final List<Particles_Var165> list68 = new ArrayList<>();
   public long long122;
   public final Random random2 = new Random();
   public final Vector3f[] val009 = new Vector3f[8];
   public final Vector3f vector3f3 = new Vector3f();
   public final Vector3f vector3f4 = new Vector3f();
   public final Vector3f vector3f5 = new Vector3f();
   public final Vector3f vector3f6 = new Vector3f();
   public final Vector3f vector3f7 = new Vector3f();
   public final Vector3f vector3f8 = new Vector3f();
   public final Matrix3f matrix3f2 = new Matrix3f();
   public final Vector3f vector3f9 = new Vector3f();
   public final Vector3f vector3f10 = new Vector3f();
   public final Matrix4f matrix4f2 = new Matrix4f();
   public final Matrix4f matrix4f3 = new Matrix4f();
   public final Matrix4f matrix4f4 = new Matrix4f();
   public final Matrix4f matrix4f5 = new Matrix4f();
   public final Vector3f vector3f11 = new Vector3f();
   public double double89;
   public double double90;
   public double double91;
   public float float148;
   public long long123;
   public boolean boolean124;
   public boolean boolean125;
   public boolean boolean126;
   public boolean boolean127;
   public boolean boolean128;
   public boolean boolean129;
   public boolean boolean130;
   public boolean boolean131;
   public final int[] val326 = new int[180];
   public final long[] val452 = new long[180];
   public boolean boolean132;
   public int int217;
   public float[] val022 = new float[6144];
   public int[] val101 = new int[1024];
   public int int218;
   public float[] val023 = new float[1536];
   public int[] val102 = new int[256];
   public int int219;
   public int int220;
   public float float149 = Float.NaN;
   public int int221;
   public float[] val153;
   public float[] val154;
   public float[] val155;
   public float[] val156;
   public boolean boolean133;
   public boolean boolean134;
   public boolean boolean135;
   public static final float float150 = 0.985F;

   public Particles() {
      for (int i = 0; i < 8; i++) {
         this.val009[i] = new Vector3f();
      }
   }

   @Override
   public void onEnable() {
      super.onEnable();
      this.list59.clear();
      this.list60.clear();
      this.list61.clear();
      this.list62.clear();
      this.list63.clear();
      this.list64.clear();
      this.list65.clear();
      this.float382();
      this.long122 = System.currentTimeMillis();
   }

   @Override
   public void onDisable() {
      super.onDisable();
      this.list59.clear();
      this.list60.clear();
      this.list61.clear();
      this.list62.clear();
      this.list63.clear();
      this.list64.clear();
      this.list65.clear();
      this.float382();
   }

   @EventTarget
   public void ProfileItemBuilder(EventHookWorldRender var1) {
      ClientPlayerEntity clientplayerentity = minecraftClient3.player;
      if (clientplayerentity != null && minecraftClient3.world != null) {
         long i = System.currentTimeMillis();
         this.long123++;
         this.boolean124 = this.modeSetting14.ConfigJsonUtil(0);
         this.boolean125 = this.modeSetting14.ConfigJsonUtil(1);
         this.boolean126 = this.modeSetting14.ConfigJsonUtil(2);
         this.boolean127 = this.modeSetting14.ConfigJsonUtil(3);
         this.boolean128 = this.modeSetting14.ConfigJsonUtil(4);
         this.boolean129 = this.modeSetting14.ConfigJsonUtil(5);
         this.boolean130 = this.modeSetting14.ConfigJsonUtil(6);
         this.boolean131 = this.hit.isEnabled();
         this.boolean132 = this.color3.is(1);
         if (this.boolean132) {
            this.int217 = this.customColor4.getColor().call001();
         }

         this.Event18(i);
         this.on23(i, clientplayerentity.getPos());
         Camera camera = minecraftClient3.getEntityRenderDispatcher().camera;
         Vec3d vec3d = camera.getPos();
         this.double89 = vec3d.x;
         this.double90 = vec3d.y;
         this.double91 = vec3d.z;
         float f = camera.getPitch();
         float f1 = camera.getYaw();
         float f2 = f * (float) (Math.PI / 180.0);
         float f3 = f1 * (float) (Math.PI / 180.0);
         float f4 = (f1 + 180.0F) * (float) (Math.PI / 180.0);
         this.matrix4f2.identity().rotateX(f2).rotateY(f4);
         this.matrix4f3.identity().rotateY(-f3).rotateX(f2);
         this.matrix4f5.set(this.matrix4f2).mul(this.matrix4f3);
         this.matrix4f4.set(this.matrix4f5);
         boolean flag = this.boolean125
            || this.boolean126
            || this.boolean127
            || this.boolean128
            || this.boolean129
            || this.boolean130
            || this.boolean131;
         this.float148 = flag ? Math.max(0.0F, this.glow2.getCurrent()) : 0.0F;
         if (this.boolean124 && !this.list59.isEmpty()) {
            this.Event08(i);
         }

         if (this.boolean125 && !this.list60.isEmpty()) {
            this.Event01(i);
         }

         if (this.boolean126 && !this.list61.isEmpty()) {
            this.Event19(i);
         }

         if (this.boolean127 && !this.list62.isEmpty()) {
            this.Event49(i);
         }

         if (this.boolean128 && !this.list63.isEmpty()) {
            this.Event20(i);
         }

         if (this.boolean129 && !this.list64.isEmpty()) {
            this.Event09(i);
         }

         if (this.boolean130 && !this.list65.isEmpty()) {
            this.Event13(i);
         }

         if (this.boolean131) {
            this.VelocityChangeEvent(i);
            this.EventGetBasicProjectionMatrixHook2(i);
         } else if (this.float383()) {
            this.float382();
         }

         if (this.float148 > 0.0F) {
            this.DataChangedEvent(i);
         }

         this.on23(var1.ClanUpgrade());
      }
   }

   @EventTarget
   public void ColorAnimator(AttackEntityEvent var1) {
      if (var1.ElytraTarget() == AttackEntityEvent.on23.call077) {
         if (this.hit.isEnabled()) {
            Entity entity = var1.ElytraMotion();
            if (entity instanceof LivingEntity && entity != minecraftClient3.player) {
               if (!this.hitOnlyCrit.isEnabled() || this.float381()) {
                  Vec3d vec3d = this.StringCodec(entity);
                  this.StringCodec(vec3d);
               }
            }
         }
      }
   }

   public Vec3d StringCodec(Entity var1) {
      Vec3d vec3d = var1.getPos();
      Vec3d vec3d1 = vec3d.add(0.0, (double)var1.getHeight() * 0.5, 0.0);
      if (minecraftClient3.player == null) {
         return vec3d1;
      } else {
         Vec3d vec3d2 = minecraftClient3.player.getEyePos();
         Vec3d vec3d3 = minecraftClient3.player.getRotationVec(1.0F);
         Box box = var1.getBoundingBox();
         Vec3d vec3d4 = on23(vec3d2, vec3d3, box);
         if (vec3d4 != null) {
            return vec3d4;
         } else {
            Vec3d vec3d5 = vec3d1.subtract(vec3d2);
            double d0 = vec3d3.dotProduct(vec3d5);
            if (d0 <= 0.0) {
               return vec3d1;
            } else {
               double d1 = (double)Math.max(var1.getWidth(), var1.getHeight()) * 0.4;
               double d2 = Math.max(0.0, d0 - d1);
               return vec3d2.add(vec3d3.multiply(d2));
            }
         }
      }
   }

   public static Vec3d on23(Vec3d var0, Vec3d var1, Box var2) {
      double d0 = Double.NEGATIVE_INFINITY;
      double d1 = Double.POSITIVE_INFINITY;
      if (Math.abs(var1.x) < 1.0E-9) {
         if (var0.x < var2.minX || var0.x > var2.maxX) {
            return null;
         }
      } else {
         double d2 = (var2.minX - var0.x) / var1.x;
         double d3 = (var2.maxX - var0.x) / var1.x;
         if (d2 > d3) {
            double d4 = d2;
            d2 = d3;
            d3 = d4;
         }

         d0 = d2;
         d1 = d3;
      }

      if (Math.abs(var1.y) < 1.0E-9) {
         if (var0.y < var2.minY || var0.y > var2.maxY) {
            return null;
         }
      } else {
         double d5 = (var2.minY - var0.y) / var1.y;
         double d8 = (var2.maxY - var0.y) / var1.y;
         if (d5 > d8) {
            double d10 = d5;
            d5 = d8;
            d8 = d10;
         }

         if (d5 > d0) {
            d0 = d5;
         }

         if (d8 < d1) {
            d1 = d8;
         }
      }

      if (d0 > d1) {
         return null;
      } else {
         if (Math.abs(var1.z) < 1.0E-9) {
            if (var0.z < var2.minZ || var0.z > var2.maxZ) {
               return null;
            }
         } else {
            double d6 = (var2.minZ - var0.z) / var1.z;
            double d9 = (var2.maxZ - var0.z) / var1.z;
            if (d6 > d9) {
               double d11 = d6;
               d6 = d9;
               d9 = d11;
            }

            if (d6 > d0) {
               d0 = d6;
            }

            if (d9 < d1) {
               d1 = d9;
            }
         }

         if (d0 > d1) {
            return null;
         } else {
            double d7 = d0 > 0.0 ? d0 : (double)(d1 > 0.0 ? 0 : -1);
            return d7 < 0.0 ? null : var0.add(var1.multiply(d7));
         }
      }
   }

   public boolean float381() {
      ClientPlayerEntity clientplayerentity = minecraftClient3.player;
      return clientplayerentity != null
         && clientplayerentity.fallDistance > 0.0F
         && !clientplayerentity.isOnGround()
         && !clientplayerentity.isClimbing()
         && !clientplayerentity.isTouchingWater()
         && !clientplayerentity.hasVehicle()
         && !clientplayerentity.isSprinting();
   }

   public void StringCodec(Vec3d var1) {
      boolean flag = this.modeSetting15.ConfigJsonUtil(0);
      boolean flag1 = this.modeSetting15.ConfigJsonUtil(1);
      boolean flag2 = this.modeSetting15.ConfigJsonUtil(2);
      if (flag || flag1 || flag2) {
         int i = Math.max(1, (int)this.hitCount.getCurrent());
         long j = System.currentTimeMillis();
         int k = 0;

         for (int l = 0; l < i; l++) {
            for (int i1 = 0; i1 < 3; i1++) {
               Particles_Var160 ii1l11il1iililiil_Var160 = switch (k++ % 3) {
                  case 0 -> Particles_Var160.val132;
                  case 1 -> Particles_Var160.val133;
                  default -> Particles_Var160.val134;
               };
               if ((ii1l11il1iililiil_Var160 != Particles_Var160.val132 || flag)
                  && (ii1l11il1iililiil_Var160 != Particles_Var160.val133 || flag1)
                  && (ii1l11il1iililiil_Var160 != Particles_Var160.val134 || flag2)) {
                  var list = this.on23(ii1l11il1iililiil_Var160);
                  if (list.size() < 200) {
                     list.add(this.on23(var1, j));
                  }
                  break;
               }
            }
         }
      }
   }

   public Particles_Var165 on23(Vec3d var1, long var2) {
      boolean flag = this.hitPhysics.is(0) || this.hitPhysics.is(2) && this.random2.nextBoolean();
      double d0;
      double d1;
      double d2;
      if (flag) {
         d0 = -1.0 + this.random2.nextDouble() * 2.0;
         d1 = 0.2 + this.random2.nextDouble() * 0.8;
         d2 = -1.0 + this.random2.nextDouble() * 2.0;
      } else {
         d0 = -1.0 + this.random2.nextDouble() * 2.0;
         d1 = -0.75 + this.random2.nextDouble() * 1.5;
         d2 = -1.0 + this.random2.nextDouble() * 2.0;
      }

      double d3 = d0 * d0 + d1 * d1 + d2 * d2;
      if (d3 < 1.0E-4) {
         d0 = 0.0;
         d1 = 1.0;
         d2 = 0.0;
         d3 = 1.0;
      }

      double d4 = 1.0 / Math.sqrt(d3);
      double d5 = (double)this.hitSpeed.getCurrent() * 2.0;
      d0 *= d4 * d5;
      d1 *= d4 * d5;
      d2 *= d4 * d5;
      float f = this.random2.nextFloat() * 2.0F - 1.0F;
      float f1 = this.random2.nextFloat() * 2.0F - 1.0F;
      float f2 = this.random2.nextFloat() * 2.0F - 1.0F;
      long i = this.DataChangedEvent(this.hitLifetime.getCurrent());
      float f3 = (float)((0.1 + this.random2.nextDouble() * 0.2) * (double)this.hitScale.getCurrent());
      int j = this.random2.nextInt(180);
      return new Particles_Var165(var1, var2, i, f3, d0, d1, d2, f, f1, f2, flag, this.hitBounce.isEnabled(), j);
   }

   public List<Particles_Var165> on23(Particles_Var160 var1) {
      return switch (var1) {
         case val132 -> this.list66;
         case val133 -> this.list67;
         case val134 -> this.list68;
      };
   }

   public void float382() {
      this.list66.clear();
      this.list67.clear();
      this.list68.clear();
   }

   public boolean float383() {
      return !this.list66.isEmpty() || !this.list67.isEmpty() || !this.list68.isEmpty();
   }

   public void on23(long var1, Vec3d var3) {
      if (this.boolean124
         || this.boolean125
         || this.boolean126
         || this.boolean127
         || this.boolean128
         || this.boolean129
         || this.boolean130) {
         float f = this.radius2.getCurrent();
         double d0 = Math.max(1.5, (double)f);
         int i = Math.max(1, (int)this.count3.getCurrent());
         if (this.boolean124) {
            this.on23(var3, d0, var1, f, i);
         }

         if (this.boolean125) {
            this.on23(this.list60, var3, d0, var1, i, 6.0F);
         }

         if (this.boolean126) {
            this.on23(this.list61, var3, d0, var1, i, 7.0F);
         }

         if (this.boolean127) {
            this.on23(this.list62, var3, d0, var1, i, 5.0F, 8.0F, 5.0F);
         }

         if (this.boolean128) {
            this.on23(this.list63, var3, d0, var1, i, 6.0F);
         }

         if (this.boolean129) {
            this.on23(this.list64, var3, d0, var1, i, 6.0F);
         }

         if (this.boolean130) {
            this.on23(this.list65, var3, d0, var1, i, 6.0F);
         }
      }
   }

   public void on23(Vec3d var1, double var2, long var4, float var6, int var7) {
      this.UiAnimation(this.list59, var7);

      while (this.list59.size() < var7) {
         this.list59.add(this.on23(var1, var2, var4, var6));
      }
   }

   public void on23(List<Particles_Var159> var1, Vec3d var2, double var3, long var5, int var7, float var8) {
      this.on23(var1, var2, var3, var5, var7, var8, var8, var8);
   }

   public void on23(
      List<Particles_Var159> var1, Vec3d var2, double var3, long var5, int var7, float var8, float var9, float var10
   ) {
      this.UiAnimation(var1, var7);

      while (var1.size() < var7) {
         var1.add(this.on23(var2, var3, var5, var8, var9, var10));
      }
   }

   public <T> void UiAnimation(List<T> var1, int var2) {
      int i = var1.size() - var2;
      if (i > 0) {
         var1.subList(0, i).clear();
      }
   }

   public boolean UiAnimation(double var1, double var3, double var5, double var7) {
      return !ScreenProjection.NbtEditor(new Box(var1 - var7, var3 - var7, var5 - var7, var1 + var7, var3 + var7, var5 + var7));
   }

   public boolean on23(Particles_Var159 var1, double var2, double var4, double var6) {
      if (var1.val044 != this.long123) {
         var1.val045 = this.UiAnimation(var2, var4, var6, 2.5);
         var1.val044 = this.long123;
      }

      return var1.val045;
   }

   public boolean on23(Particles_Var155 var1, double var2, double var4, double var6) {
      if (var1.val044 != this.long123) {
         var1.val045 = this.UiAnimation(var2, var4, var6, 8.0);
         var1.val044 = this.long123;
      }

      return var1.val045;
   }

   public boolean on23(Particles_Var165 var1, double var2, double var4, double var6) {
      if (var1.val044 != this.long123) {
         var1.val045 = this.UiAnimation(var2, var4, var6, 2.5);
         var1.val044 = this.long123;
      }

      return var1.val045;
   }

   public Particles_Var155 on23(Vec3d var1, double var2, long var4, float var6) {
      double d0 = this.random2.nextDouble() * Math.PI * 2.0;
      double d1 = Math.acos(2.0 * this.random2.nextDouble() - 1.0);
      double d2 = 1.5 + this.random2.nextDouble() * (var2 - 1.5);
      double d3 = Math.sin(d1);
      Vec3d vec3d = new Vec3d(var1.x + d3 * Math.cos(d0) * d2, var1.y + 1.0 + Math.cos(d1) * d2, var1.z + d3 * Math.sin(d0) * d2);
      return new Particles_Var155(
         vec3d, d0, var4, this.DataChangedEvent(this.lifetime3.getCurrent()), this.random2, this.random2.nextInt(180), var6
      );
   }

   public Particles_Var159 on23(Vec3d var1, double var2, long var4, float var6, float var7, float var8) {
      double d0 = this.random2.nextDouble() * Math.PI * 2.0;
      double d1 = Math.acos(2.0 * this.random2.nextDouble() - 1.0);
      double d2 = 1.5 + this.random2.nextDouble() * (var2 - 1.5);
      double d3 = Math.sin(d1);
      Vec3d vec3d = new Vec3d(var1.x + d3 * Math.cos(d0) * d2, var1.y + 1.0 + Math.cos(d1) * d2, var1.z + d3 * Math.sin(d0) * d2);
      double d4 = this.random2.nextDouble() * Math.PI * 2.0;
      double d5 = Math.acos(2.0 * this.random2.nextDouble() - 1.0);
      double d6 = 1.6 + this.random2.nextDouble() * 1.8;
      double d7 = Math.sin(d5);
      double d8 = d7 * Math.cos(d4) * d6;
      double d9 = Math.cos(d5) * d6;
      double d10 = d7 * Math.sin(d4) * d6;
      return new Particles_Var159(
         vec3d,
         d0,
         var4,
         this.DataChangedEvent(this.lifetime3.getCurrent()),
         this.random2.nextInt(180),
         (this.random2.nextFloat() - 0.5F) * var6,
         (this.random2.nextFloat() - 0.5F) * var7,
         (this.random2.nextFloat() - 0.5F) * var8,
         d8,
         d9,
         d10
      );
   }

   public long DataChangedEvent(float var1) {
      float f = 0.75F + this.random2.nextFloat() * 0.5F;
      return Math.max(50L, (long)Math.round(var1 * f));
   }

   public float on23(long var1, long var3, long var5) {
      return var5 <= 0L ? 1.0F : (float)(var1 - var3) / (float)var5;
   }

   public void Event18(long var1) {
      if (this.boolean124) {
         on23(this.list59, var1);
      } else {
         this.list59.clear();
      }

      if (this.boolean125) {
         on23(this.list60, var1);
      } else {
         this.list60.clear();
      }

      if (this.boolean126) {
         on23(this.list61, var1);
      } else {
         this.list61.clear();
      }

      if (this.boolean127) {
         on23(this.list62, var1);
      } else {
         this.list62.clear();
      }

      if (this.boolean128) {
         on23(this.list63, var1);
      } else {
         this.list63.clear();
      }

      if (this.boolean129) {
         on23(this.list64, var1);
      } else {
         this.list64.clear();
      }

      if (this.boolean130) {
         on23(this.list65, var1);
      } else {
         this.list65.clear();
      }
   }

   public static <T extends Particles_Var7> void on23(List<T> var0, long var1) {
      int i = var0.size();
      int j = 0;

      for (int k = 0; k < i; k++) {
         T ii1l11il1iililiil_liil11l111liil1ll = var0.get(k);
         if (!ii1l11il1iililiil_liil11l111liil1ll.EventInjectPlaced(var1)) {
            if (j != k) {
               var0.set(j, ii1l11il1iililiil_liil11l111liil1ll);
            }

            j++;
         }
      }

      if (j < i) {
         var0.subList(j, i).clear();
      }
   }

   public void Event08(long var1) {
      float f = this.size3.getCurrent();
      float f1 = Math.max(0.025F, f * 0.24F);
      float f2 = this.tailLength.getCurrent();
      RenderSystem.enableBlend();
      RenderSystem.disableCull();
      RenderSystem.blendFuncSeparate(SrcFactor.SRC_ALPHA, DstFactor.ONE, SrcFactor.ZERO, DstFactor.ONE);
      RenderSystem.enableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, identifier3);
      BufferBuilder bufferbuilder = null;

      for (Particles_Var155 ii1l11il1iililiil_i1liiii1iii1lilil1l : this.list59) {
         float f3 = this.on23(var1, ii1l11il1iililiil_i1liiii1iii1lilil1l.val299, ii1l11il1iililiil_i1liiii1iii1lilil1l.val182);
         if (!(f3 >= 1.0F)) {
            double d0 = ii1l11il1iililiil_i1liiii1iii1lilil1l.val181.x
               + ii1l11il1iililiil_i1liiii1iii1lilil1l.val394 * (double)f3;
            double d1 = ii1l11il1iililiil_i1liiii1iii1lilil1l.val181.y
               + ii1l11il1iililiil_i1liiii1iii1lilil1l.val395 * (double)f3;
            double d2 = ii1l11il1iililiil_i1liiii1iii1lilil1l.val181.z
               + ii1l11il1iililiil_i1liiii1iii1lilil1l.val396 * (double)f3;
            ii1l11il1iililiil_i1liiii1iii1lilil1l.on23(d0, d1, d2, var1);
            if (!this.on23(ii1l11il1iililiil_i1liiii1iii1lilil1l, d0, d1, d2)) {
               float f4 = this.EventInjectPlaced(f3);
               int i = this.on23(ii1l11il1iililiil_i1liiii1iii1lilil1l);
               long j = (long)((float)ii1l11il1iililiil_i1liiii1iii1lilil1l.val182 * f2);
               float f5 = j > 0L ? 1.0F / (float)j : 0.0F;
               if (bufferbuilder == null) {
                  bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
               }

               int k = ii1l11il1iililiil_i1liiii1iii1lilil1l.count - 1;

               while (k > 0 && var1 - ii1l11il1iililiil_i1liiii1iii1lilil1l.val043[k] > j) {
                  k--;
               }

               for (int l = k; l > 0; l--) {
                  double d3 = ii1l11il1iililiil_i1liiii1iii1lilil1l.val030[l];
                  double d4 = ii1l11il1iililiil_i1liiii1iii1lilil1l.val061[l];
                  double d5 = ii1l11il1iililiil_i1liiii1iii1lilil1l.val062[l];
                  double d6 = ii1l11il1iililiil_i1liiii1iii1lilil1l.val030[l - 1];
                  double d7 = ii1l11il1iililiil_i1liiii1iii1lilil1l.val061[l - 1];
                  double d8 = ii1l11il1iililiil_i1liiii1iii1lilil1l.val062[l - 1];
                  double d9 = d6 - d3;
                  double d10 = d7 - d4;
                  double d11 = d8 - d5;
                  double d12 = Math.sqrt(d9 * d9 + d10 * d10 + d11 * d11);
                  int i1 = Math.min(12, Math.max(1, (int)Math.ceil(d12 / (double)f1)));
                  float f6 = 1.0F / (float)i1;

                  for (int j1 = 0; j1 < i1; j1++) {
                     float f7 = (float)j1 * f6;
                     long k1 = ii1l11il1iililiil_i1liiii1iii1lilil1l.val043[l]
                        + (long)(
                           (double)(ii1l11il1iililiil_i1liiii1iii1lilil1l.val043[l - 1] - ii1l11il1iililiil_i1liiii1iii1lilil1l.val043[l])
                              * (double)f7
                        );
                     float f8 = j <= 0L ? 1.0F : MathHelper.clamp((float)(var1 - k1) * f5, 0.0F, 1.0F);
                     float f9 = (1.0F - f8) * (1.0F - f8);
                     if (!(f9 <= 0.0F)) {
                        float f10 = f * (0.34F + (float)Math.sqrt((double)f9) * 0.86F);
                        this.on23(
                           bufferbuilder, d3 + d9 * (double)f7, d4 + d10 * (double)f7, d5 + d11 * (double)f7, f10, i, f4 * f9 * 0.5F, false
                        );
                     }
                  }
               }

               if (ii1l11il1iililiil_i1liiii1iii1lilil1l.count > 0) {
                  this.on23(
                     bufferbuilder,
                     ii1l11il1iililiil_i1liiii1iii1lilil1l.val030[0],
                     ii1l11il1iililiil_i1liiii1iii1lilil1l.val061[0],
                     ii1l11il1iililiil_i1liiii1iii1lilil1l.val062[0],
                     f,
                     i,
                     f4,
                     true
                  );
               }
            }
         }
      }

      if (bufferbuilder != null) {
         BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
      RenderSystem.defaultBlendFunc();
   }

   public void on23(BufferBuilder var1, double var2, double var4, double var6, float var8, int var9, float var10, boolean var11) {
      this.vector3f11
         .set((float)(var2 - this.double89), (float)(var4 - this.double90), (float)(var6 - this.double91));
      this.matrix4f2.transformPosition(this.vector3f11);
      this.matrix4f4.setTranslation(this.vector3f11);
      int i = ColorUtils.ColorAnimator(var9, var10);
      int j = var11 ? ColorUtils.ColorAnimator(var9, var10 * 0.45F) : i;
      float f = var8 * 0.5F;
      float f1 = var8 * 0.95F;
      var1.vertex(this.matrix4f4, f1, -f1, 0.0F).texture(0.0F, 1.0F).color(j);
      var1.vertex(this.matrix4f4, -f1, -f1, 0.0F).texture(1.0F, 1.0F).color(j);
      var1.vertex(this.matrix4f4, -f1, f1, 0.0F).texture(1.0F, 0.0F).color(j);
      var1.vertex(this.matrix4f4, f1, f1, 0.0F).texture(0.0F, 0.0F).color(j);
      if (var11) {
         var1.vertex(this.matrix4f4, f, -f, 0.0F).texture(0.0F, 1.0F).color(i);
         var1.vertex(this.matrix4f4, -f, -f, 0.0F).texture(1.0F, 1.0F).color(i);
         var1.vertex(this.matrix4f4, -f, f, 0.0F).texture(1.0F, 0.0F).color(i);
         var1.vertex(this.matrix4f4, f, f, 0.0F).texture(0.0F, 0.0F).color(i);
      }
   }

   public void Event01(long var1) {
      float f = this.size3.getCurrent() * 0.6F;

      for (Particles_Var159 ii1l11il1iililiil_ii1il11l111ii11iil : this.list60) {
         float f1 = this.on23(var1, ii1l11il1iililiil_ii1il11l111ii11iil.val031, ii1l11il1iililiil_ii1il11l111ii11iil.val032);
         if (!(f1 >= 1.0F)) {
            this.UiAnimation(ii1l11il1iililiil_ii1il11l111ii11iil, f1);
            if (!this.on23(
               ii1l11il1iililiil_ii1il11l111ii11iil,
               ii1l11il1iililiil_ii1il11l111ii11iil.val006,
               ii1l11il1iililiil_ii1il11l111ii11iil.val007,
               ii1l11il1iililiil_ii1il11l111ii11iil.val008
            )) {
               float f2 = this.EventInjectPlaced(f1);
               float f3 = f * (0.6F + f1 * 0.6F);
               float f4 = f3 * 0.5F;
               this.matrix3f2
                  .rotationYXZ(
                     ii1l11il1iililiil_ii1il11l111ii11iil.val064 * f1,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val063 * f1,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val065 * f1
                  );

               for (int i = 0; i < 8; i++) {
                  this.val009[i].set((i & 1) == 0 ? -f4 : f4, (i & 2) == 0 ? -f4 : f4, (i & 4) == 0 ? -f4 : f4);
                  this.matrix3f2.transform(this.val009[i]);
               }

               int j = ColorUtils.ColorAnimator(this.on23(ii1l11il1iililiil_ii1il11l111ii11iil), f2);

               for (byte b0 = 0; b0 < val100.length; b0 += 2) {
                  this.on23(
                     this.val009[val100[b0]],
                     this.val009[val100[b0 + 1]],
                     ii1l11il1iililiil_ii1il11l111ii11iil.val006,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val007,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val008,
                     j
                  );
               }
            }
         }
      }
   }

   public void Event19(long var1) {
      float f = this.size3.getCurrent() * 0.75F;

      for (Particles_Var159 ii1l11il1iililiil_ii1il11l111ii11iil : this.list61) {
         float f1 = this.on23(var1, ii1l11il1iililiil_ii1il11l111ii11iil.val031, ii1l11il1iililiil_ii1il11l111ii11iil.val032);
         if (!(f1 >= 1.0F)) {
            this.UiAnimation(ii1l11il1iililiil_ii1il11l111ii11iil, f1);
            if (!this.on23(
               ii1l11il1iililiil_ii1il11l111ii11iil,
               ii1l11il1iililiil_ii1il11l111ii11iil.val006,
               ii1l11il1iililiil_ii1il11l111ii11iil.val007,
               ii1l11il1iililiil_ii1il11l111ii11iil.val008
            )) {
               float f2 = this.EventInjectPlaced(f1);
               float f3 = f * (0.65F + f1 * 0.55F);
               float f4 = f3 * 0.5F;
               this.matrix3f2
                  .rotationYXZ(
                     ii1l11il1iililiil_ii1il11l111ii11iil.val064 * f1,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val063 * f1,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val065 * f1
                  );
               this.val009[0].set(-f4, -f4, -f4);
               this.matrix3f2.transform(this.val009[0]);
               this.val009[1].set(f4, -f4, -f4);
               this.matrix3f2.transform(this.val009[1]);
               this.val009[2].set(f4, -f4, f4);
               this.matrix3f2.transform(this.val009[2]);
               this.val009[3].set(-f4, -f4, f4);
               this.matrix3f2.transform(this.val009[3]);
               this.val009[4].set(0.0F, f4, 0.0F);
               this.matrix3f2.transform(this.val009[4]);
               int i = ColorUtils.ColorAnimator(this.on23(ii1l11il1iililiil_ii1il11l111ii11iil), f2);

               for (byte b0 = 0; b0 < val325.length; b0 += 2) {
                  this.on23(
                     this.val009[val325[b0]],
                     this.val009[val325[b0 + 1]],
                     ii1l11il1iililiil_ii1il11l111ii11iil.val006,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val007,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val008,
                     i
                  );
               }
            }
         }
      }
   }

   public void Event49(long var1) {
      float[] afloat = this.float387();
      if (afloat != null && afloat.length != 0) {
         float f = this.size3.getCurrent() * 0.78F;

         for (Particles_Var159 ii1l11il1iililiil_ii1il11l111ii11iil : this.list62) {
            float f1 = this.on23(var1, ii1l11il1iililiil_ii1il11l111ii11iil.val031, ii1l11il1iililiil_ii1il11l111ii11iil.val032);
            if (!(f1 >= 1.0F)) {
               this.on23(ii1l11il1iililiil_ii1il11l111ii11iil, f1);
               if (!this.on23(
                  ii1l11il1iililiil_ii1il11l111ii11iil,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val006,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val007,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val008
               )) {
                  float f2 = this.EventInjectPlaced(f1);
                  float f3 = f * (0.75F + f1 * 0.35F);
                  this.matrix3f2
                     .rotationYXZ(
                        ii1l11il1iililiil_ii1il11l111ii11iil.val064 * f1,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val063 * f1,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val065 * f1
                     );
                  int i = ColorUtils.ColorAnimator(this.on23(ii1l11il1iililiil_ii1il11l111ii11iil), f2);

                  for (byte b0 = 0; b0 < afloat.length; b0 += 6) {
                     this.vector3f9.set(afloat[b0] * f3, afloat[b0 + 1] * f3, afloat[b0 + 2] * f3);
                     this.vector3f10.set(afloat[b0 + 3] * f3, afloat[b0 + 4] * f3, afloat[b0 + 5] * f3);
                     this.matrix3f2.transform(this.vector3f9);
                     this.matrix3f2.transform(this.vector3f10);
                     this.on23(
                        ii1l11il1iililiil_ii1il11l111ii11iil.val006 + (double)this.vector3f9.x,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val007 + (double)this.vector3f9.y,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val008 + (double)this.vector3f9.z,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val006 + (double)this.vector3f10.x,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val007 + (double)this.vector3f10.y,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val008 + (double)this.vector3f10.z,
                        i
                     );
                  }
               }
            }
         }
      }
   }

   public void Event20(long var1) {
      float[] afloat = this.float386();
      float f = this.size3.getCurrent() * 0.72F;

      for (Particles_Var159 ii1l11il1iililiil_ii1il11l111ii11iil : this.list63) {
         float f1 = this.on23(var1, ii1l11il1iililiil_ii1il11l111ii11iil.val031, ii1l11il1iililiil_ii1il11l111ii11iil.val032);
         if (!(f1 >= 1.0F)) {
            this.UiAnimation(ii1l11il1iililiil_ii1il11l111ii11iil, f1);
            if (!this.on23(
               ii1l11il1iililiil_ii1il11l111ii11iil,
               ii1l11il1iililiil_ii1il11l111ii11iil.val006,
               ii1l11il1iililiil_ii1il11l111ii11iil.val007,
               ii1l11il1iililiil_ii1il11l111ii11iil.val008
            )) {
               float f2 = this.EventInjectPlaced(f1);
               float f3 = f * (0.7F + f1 * 0.45F);
               this.matrix3f2
                  .rotationYXZ(
                     ii1l11il1iililiil_ii1il11l111ii11iil.val064 * f1,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val063 * f1,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val065 * f1
                  );
               int i = ColorUtils.ColorAnimator(this.on23(ii1l11il1iililiil_ii1il11l111ii11iil), f2);

               for (byte b0 = 0; b0 < afloat.length; b0 += 6) {
                  this.vector3f9.set(afloat[b0] * f3, afloat[b0 + 1] * f3, afloat[b0 + 2] * f3);
                  this.vector3f10.set(afloat[b0 + 3] * f3, afloat[b0 + 4] * f3, afloat[b0 + 5] * f3);
                  this.matrix3f2.transform(this.vector3f9);
                  this.matrix3f2.transform(this.vector3f10);
                  this.on23(
                     ii1l11il1iililiil_ii1il11l111ii11iil.val006 + (double)this.vector3f9.x,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val007 + (double)this.vector3f9.y,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val008 + (double)this.vector3f9.z,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val006 + (double)this.vector3f10.x,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val007 + (double)this.vector3f10.y,
                     ii1l11il1iililiil_ii1il11l111ii11iil.val008 + (double)this.vector3f10.z,
                     i
                  );
               }
            }
         }
      }
   }

   public void Event09(long var1) {
      float[] afloat = this.float384();
      if (afloat != null && afloat.length != 0) {
         float f = this.size3.getCurrent() * 0.7F;

         for (Particles_Var159 ii1l11il1iililiil_ii1il11l111ii11iil : this.list64) {
            float f1 = this.on23(var1, ii1l11il1iililiil_ii1il11l111ii11iil.val031, ii1l11il1iililiil_ii1il11l111ii11iil.val032);
            if (!(f1 >= 1.0F)) {
               this.UiAnimation(ii1l11il1iililiil_ii1il11l111ii11iil, f1);
               if (!this.on23(
                  ii1l11il1iililiil_ii1il11l111ii11iil,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val006,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val007,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val008
               )) {
                  float f2 = this.EventInjectPlaced(f1);
                  float f3 = f * (0.7F + f1 * 0.45F);
                  this.matrix3f2
                     .rotationYXZ(
                        ii1l11il1iililiil_ii1il11l111ii11iil.val064 * f1,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val063 * f1,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val065 * f1
                     );
                  int i = ColorUtils.ColorAnimator(this.on23(ii1l11il1iililiil_ii1il11l111ii11iil), f2);

                  for (byte b0 = 0; b0 < afloat.length; b0 += 6) {
                     this.vector3f9.set(afloat[b0] * f3, afloat[b0 + 1] * f3, afloat[b0 + 2] * f3);
                     this.vector3f10.set(afloat[b0 + 3] * f3, afloat[b0 + 4] * f3, afloat[b0 + 5] * f3);
                     this.matrix3f2.transform(this.vector3f9);
                     this.matrix3f2.transform(this.vector3f10);
                     this.on23(
                        ii1l11il1iililiil_ii1il11l111ii11iil.val006 + (double)this.vector3f9.x,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val007 + (double)this.vector3f9.y,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val008 + (double)this.vector3f9.z,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val006 + (double)this.vector3f10.x,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val007 + (double)this.vector3f10.y,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val008 + (double)this.vector3f10.z,
                        i
                     );
                  }
               }
            }
         }
      }
   }

   public void Event13(long var1) {
      float[] afloat = this.boolean199();
      if (afloat != null && afloat.length != 0) {
         float f = this.size3.getCurrent() * 0.9F;

         for (Particles_Var159 ii1l11il1iililiil_ii1il11l111ii11iil : this.list65) {
            float f1 = this.on23(var1, ii1l11il1iililiil_ii1il11l111ii11iil.val031, ii1l11il1iililiil_ii1il11l111ii11iil.val032);
            if (!(f1 >= 1.0F)) {
               this.UiAnimation(ii1l11il1iililiil_ii1il11l111ii11iil, f1);
               if (!this.on23(
                  ii1l11il1iililiil_ii1il11l111ii11iil,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val006,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val007,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val008
               )) {
                  float f2 = this.EventInjectPlaced(f1);
                  float f3 = f * (0.7F + f1 * 0.45F);
                  this.matrix3f2
                     .rotationYXZ(
                        ii1l11il1iililiil_ii1il11l111ii11iil.val064 * f1,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val063 * f1,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val065 * f1
                     );
                  int i = ColorUtils.ColorAnimator(this.on23(ii1l11il1iililiil_ii1il11l111ii11iil), f2);

                  for (byte b0 = 0; b0 < afloat.length; b0 += 6) {
                     this.vector3f9.set(afloat[b0] * f3, afloat[b0 + 1] * f3, afloat[b0 + 2] * f3);
                     this.vector3f10.set(afloat[b0 + 3] * f3, afloat[b0 + 4] * f3, afloat[b0 + 5] * f3);
                     this.matrix3f2.transform(this.vector3f9);
                     this.matrix3f2.transform(this.vector3f10);
                     this.on23(
                        ii1l11il1iililiil_ii1il11l111ii11iil.val006 + (double)this.vector3f9.x,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val007 + (double)this.vector3f9.y,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val008 + (double)this.vector3f9.z,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val006 + (double)this.vector3f10.x,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val007 + (double)this.vector3f10.y,
                        ii1l11il1iililiil_ii1il11l111ii11iil.val008 + (double)this.vector3f10.z,
                        i
                     );
                  }
               }
            }
         }
      }
   }

   public float[] boolean199() {
      if (this.boolean135) {
         return this.val156;
      } else {
         this.boolean135 = true;
         InputStream inputstream = Particles.class.getResourceAsStream("/assets/zenith/visuals/particles/fire_nether_star.obj");
         if (inputstream == null) {
            return null;
         } else {
            try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, StandardCharsets.UTF_8))) {
               var arraylist = new ArrayList();
               var hashmap = new HashMap();
               float f = Float.POSITIVE_INFINITY;
               float f1 = Float.POSITIVE_INFINITY;
               float f2 = Float.POSITIVE_INFINITY;
               float f3 = Float.NEGATIVE_INFINITY;
               float f4 = Float.NEGATIVE_INFINITY;
               float f5 = Float.NEGATIVE_INFINITY;

               String s;
               while ((s = bufferedreader.readLine()) != null) {
                  s = s.trim();
                  if (s.startsWith("v ")) {
                     String[] astring2 = s.split("\\s+");
                     float f7 = Float.parseFloat(astring2[1]);
                     float f9 = Float.parseFloat(astring2[2]);
                     float f11 = Float.parseFloat(astring2[3]);
                     arraylist.add(new Vector3f(f7, f9, f11));
                     if (f7 < f) {
                        f = f7;
                     }

                     if (f7 > f3) {
                        f3 = f7;
                     }

                     if (f9 < f1) {
                        f1 = f9;
                     }

                     if (f9 > f4) {
                        f4 = f9;
                     }

                     if (f11 < f2) {
                        f2 = f11;
                     }

                     if (f11 > f5) {
                        f5 = f11;
                     }
                  } else if (s.startsWith("f ")) {
                     String[] astring = s.split("\\s+");

                     for (int i = 1; i < astring.length; i++) {
                        int j = i == astring.length - 1 ? 1 : i + 1;
                        int k = Integer.parseInt(astring[i].split("/")[0]) - 1;
                        int l = Integer.parseInt(astring[j].split("/")[0]) - 1;
                        if (k != l) {
                           String[] astring1 = astring[i].split("/");
                           int i1 = astring1.length > 2 && !astring1[2].isEmpty() ? Integer.parseInt(astring1[2]) - 1 : -1;
                           long j1 = (long)Math.min(k, l) << 32 | (long)Math.max(k, l) & 4294967295L;
                           Particles_Var134 ii1l11il1iililiil_l1iil11li = (Particles_Var134)hashmap.get(j1);
                           if (ii1l11il1iililiil_l1iil11li == null) {
                              Vector3f vector3f = (Vector3f)arraylist.get(k);
                              Vector3f vector3f1 = (Vector3f)arraylist.get(l);
                              hashmap.put(j1, new Particles_Var134(vector3f.x, vector3f.y, vector3f.z, vector3f1.x, vector3f1.y, vector3f1.z, i1));
                           } else {
                              ii1l11il1iililiil_l1iil11li.count++;
                              if (ii1l11il1iililiil_l1iil11li.val309 != i1) {
                                 ii1l11il1iililiil_l1iil11li.val066 = false;
                              }
                           }
                        }
                     }
                  }
               }

               float f6 = (f + f3) * 0.5F;
               float f8 = (f1 + f4) * 0.5F;
               float f10 = (f2 + f5) * 0.5F;
               float f12 = Math.max(f3 - f, Math.max(f4 - f1, f5 - f2));
               float f13 = f12 > 1.0E-5F ? 1.0F / f12 : 1.0F;
               var arraylist1 = new ArrayList();

               for (Particles_Var134 ii1l11il1iililiil_l1iil11li1 : (Iterable<Particles_Var134>)(Object)(hashmap.values())) {
                  if (ii1l11il1iililiil_l1iil11li1.count == 1 || !ii1l11il1iililiil_l1iil11li1.val066) {
                     arraylist1.add((ii1l11il1iililiil_l1iil11li1.val303 - f6) * f13);
                     arraylist1.add((ii1l11il1iililiil_l1iil11li1.val304 - f8) * f13);
                     arraylist1.add((ii1l11il1iililiil_l1iil11li1.val305 - f10) * f13);
                     arraylist1.add((ii1l11il1iililiil_l1iil11li1.val306 - f6) * f13);
                     arraylist1.add((ii1l11il1iililiil_l1iil11li1.val307 - f8) * f13);
                     arraylist1.add((ii1l11il1iililiil_l1iil11li1.val308 - f10) * f13);
                  }
               }

               this.val156 = new float[arraylist1.size()];

               for (int k1 = 0; k1 < arraylist1.size(); k1++) {
                  this.val156[k1] = (Float)arraylist1.get(k1);
               }
            } catch (Exception exception) {
               this.val156 = null;
            }

            return this.val156;
         }
      }
   }

   public void VelocityChangeEvent(long var1) {
      if (minecraftClient3.world != null) {
         long i = var1 - this.long122;
         if (i >= 50L) {
            int j = (int)Math.min(4L, i / 50L);
            this.long122 = var1 - i % 50L;

            for (int k = 0; k < j; k++) {
               this.UiAnimation(this.list66, var1);
               this.UiAnimation(this.list67, var1);
               this.UiAnimation(this.list68, var1);
            }
         }
      }
   }

   public void UiAnimation(List<Particles_Var165> var1, long var2) {
      if (!var1.isEmpty()) {
         ClientWorld clientworld = minecraftClient3.world;
         var1.removeIf(var2x -> var2x.EventInteractBlock(var2));

         for (Particles_Var165 ii1l11il1iililiil_illi1l1l1 : var1) {
            ii1l11il1iililiil_illi1l1l1.on23(clientworld);
         }
      }
   }

   public void EventGetBasicProjectionMatrixHook2(long var1) {
      float f = MathHelper.clamp((float)(var1 - this.long122) / 50.0F, 0.0F, 1.0F);
      if (!this.list66.isEmpty()) {
         this.on23(this.list66, Particles_Var160.val132, var1, f);
      }

      if (!this.list67.isEmpty()) {
         this.on23(this.list67, Particles_Var160.val133, var1, f);
      }

      if (!this.list68.isEmpty()) {
         this.on23(this.list68, Particles_Var160.val134, var1, f);
      }
   }

   public void on23(List<Particles_Var165> var1, Particles_Var160 var2, long var3, float var5) {
      for (Particles_Var165 ii1l11il1iililiil_illi1l1l1 : var1) {
         float f = ii1l11il1iililiil_illi1l1l1.EventMouseScrollHook(var3);
         if (!(f <= 0.0F)) {
            ii1l11il1iililiil_illi1l1l1.on23(var5, this.long123);
            if (!this.on23(
               ii1l11il1iililiil_illi1l1l1,
               ii1l11il1iililiil_illi1l1l1.val006,
               ii1l11il1iililiil_illi1l1l1.val007,
               ii1l11il1iililiil_illi1l1l1.val008
            )) {
               float f1 = ii1l11il1iililiil_illi1l1l1.val187;
               float f2 = ii1l11il1iililiil_illi1l1l1.ChatMessageEvent(var3);
               this.matrix3f2
                  .rotationXYZ(
                     ii1l11il1iililiil_illi1l1l1.val400 * f2,
                     ii1l11il1iililiil_illi1l1l1.val301 * f2,
                     ii1l11il1iililiil_illi1l1l1.val401 * f2
                  );
               int i = ColorUtils.ColorAnimator(this.on23(ii1l11il1iililiil_illi1l1l1), f);
               switch (var2) {
                  case val132:
                     this.on23(
                        ii1l11il1iililiil_illi1l1l1.val006,
                        ii1l11il1iililiil_illi1l1l1.val007,
                        ii1l11il1iililiil_illi1l1l1.val008,
                        f1,
                        i
                     );
                     break;
                  case val133:
                     this.UiAnimation(
                        ii1l11il1iililiil_illi1l1l1.val006,
                        ii1l11il1iililiil_illi1l1l1.val007,
                        ii1l11il1iililiil_illi1l1l1.val008,
                        f1,
                        i
                     );
                     break;
                  case val134:
                     this.Easing(
                        ii1l11il1iililiil_illi1l1l1.val006,
                        ii1l11il1iililiil_illi1l1l1.val007,
                        ii1l11il1iililiil_illi1l1l1.val008,
                        f1,
                        i
                     );
               }
            }
         }
      }
   }

   public void on23(double var1, double var3, double var5, float var7, int var8) {
      float f = var7 * 0.5F;

      for (int i = 0; i < 8; i++) {
         this.val009[i].set((i & 1) == 0 ? -f : f, (i & 2) == 0 ? -f : f, (i & 4) == 0 ? -f : f);
         this.matrix3f2.transform(this.val009[i]);
      }

      for (byte b0 = 0; b0 < val100.length; b0 += 2) {
         this.on23(this.val009[val100[b0]], this.val009[val100[b0 + 1]], var1, var3, var5, var8);
      }
   }

   public void UiAnimation(double var1, double var3, double var5, float var7, int var8) {
      float f = var7 * 0.56F;
      float f1 = var7 * 0.4F;
      this.vector3f3.set(0.0F, f, 0.0F);
      this.matrix3f2.transform(this.vector3f3);
      this.vector3f4.set(0.0F, -f, 0.0F);
      this.matrix3f2.transform(this.vector3f4);
      this.vector3f5.set(f1, 0.0F, 0.0F);
      this.matrix3f2.transform(this.vector3f5);
      this.vector3f6.set(-f1, 0.0F, 0.0F);
      this.matrix3f2.transform(this.vector3f6);
      this.vector3f7.set(0.0F, 0.0F, f1);
      this.matrix3f2.transform(this.vector3f7);
      this.vector3f8.set(0.0F, 0.0F, -f1);
      this.matrix3f2.transform(this.vector3f8);
      this.on23(this.vector3f3, this.vector3f5, var1, var3, var5, var8);
      this.on23(this.vector3f3, this.vector3f6, var1, var3, var5, var8);
      this.on23(this.vector3f3, this.vector3f7, var1, var3, var5, var8);
      this.on23(this.vector3f3, this.vector3f8, var1, var3, var5, var8);
      this.on23(this.vector3f4, this.vector3f5, var1, var3, var5, var8);
      this.on23(this.vector3f4, this.vector3f6, var1, var3, var5, var8);
      this.on23(this.vector3f4, this.vector3f7, var1, var3, var5, var8);
      this.on23(this.vector3f4, this.vector3f8, var1, var3, var5, var8);
      this.on23(this.vector3f5, this.vector3f8, var1, var3, var5, var8);
      this.on23(this.vector3f8, this.vector3f6, var1, var3, var5, var8);
      this.on23(this.vector3f6, this.vector3f7, var1, var3, var5, var8);
      this.on23(this.vector3f7, this.vector3f5, var1, var3, var5, var8);
   }

   public void Easing(double var1, double var3, double var5, float var7, int var8) {
      this.vector3f3.set(0.0F, var7 * 0.62F, 0.0F);
      this.matrix3f2.transform(this.vector3f3);
      this.vector3f5.set(var7 * 0.56F, -var7 * 0.24F, 0.0F);
      this.matrix3f2.transform(this.vector3f5);
      this.vector3f7.set(-var7 * 0.28F, -var7 * 0.24F, var7 * 0.4816F);
      this.matrix3f2.transform(this.vector3f7);
      this.vector3f8.set(-var7 * 0.28F, -var7 * 0.24F, -var7 * 0.4816F);
      this.matrix3f2.transform(this.vector3f8);
      this.on23(this.vector3f3, this.vector3f5, var1, var3, var5, var8);
      this.on23(this.vector3f3, this.vector3f7, var1, var3, var5, var8);
      this.on23(this.vector3f3, this.vector3f8, var1, var3, var5, var8);
      this.on23(this.vector3f5, this.vector3f7, var1, var3, var5, var8);
      this.on23(this.vector3f7, this.vector3f8, var1, var3, var5, var8);
      this.on23(this.vector3f8, this.vector3f5, var1, var3, var5, var8);
   }

   public float[] float384() {
      if (this.boolean134) {
         return this.val155;
      } else {
         this.boolean134 = true;
         InputStream inputstream = Particles.class.getResourceAsStream("/assets/zenith/visuals/particles/heart.gltf");
         if (inputstream == null) {
            return null;
         } else {
            try {
               byte[] abyte = inputstream.readAllBytes();
               JsonObject jsonobject = JsonParser.parseString(new String(abyte, StandardCharsets.UTF_8)).getAsJsonObject();
               String s = jsonobject.getAsJsonArray("buffers").get(0).getAsJsonObject().get("uri").getAsString();
               int i = s.indexOf(44);
               byte[] abyte1 = Base64.getDecoder().decode(s.substring(i + 1));
               ByteBuffer bytebuffer = ByteBuffer.wrap(abyte1).order(ByteOrder.LITTLE_ENDIAN);
               JsonArray jsonarray = jsonobject.getAsJsonArray("bufferViews");
               int[] aint = new int[jsonarray.size()];

               for (int j = 0; j < jsonarray.size(); j++) {
                  JsonObject jsonobject1 = jsonarray.get(j).getAsJsonObject();
                  aint[j] = jsonobject1.has("byteOffset") ? jsonobject1.get("byteOffset").getAsInt() : 0;
               }

               JsonArray jsonarray2 = jsonobject.getAsJsonArray("accessors");
               int[] aint6 = new int[jsonarray2.size()];
               int[] aint1 = new int[jsonarray2.size()];
               int[] aint2 = new int[jsonarray2.size()];
               int[] aint3 = new int[jsonarray2.size()];

               for (int k = 0; k < jsonarray2.size(); k++) {
                  JsonObject jsonobject2 = jsonarray2.get(k).getAsJsonObject();
                  aint6[k] = jsonobject2.get("bufferView").getAsInt();
                  aint1[k] = jsonobject2.get("componentType").getAsInt();
                  aint2[k] = jsonobject2.get("count").getAsInt();
                  aint3[k] = jsonobject2.has("byteOffset") ? jsonobject2.get("byteOffset").getAsInt() : 0;
               }

               JsonArray jsonarray3 = jsonobject.getAsJsonArray("nodes");
               float[][] afloat1 = new float[jsonarray3.size()][3];
               boolean[] aboolean = new boolean[jsonarray3.size()];
               int l = jsonobject.has("scene") ? jsonobject.get("scene").getAsInt() : 0;
               JsonArray jsonarray1 = jsonobject.getAsJsonArray("scenes").get(l).getAsJsonObject().getAsJsonArray("nodes");

               for (int i1 = 0; i1 < jsonarray1.size(); i1++) {
                  on23(jsonarray3, jsonarray1.get(i1).getAsInt(), 0.0F, 0.0F, 0.0F, afloat1, aboolean);
               }

               JsonArray jsonarray4 = jsonobject.getAsJsonArray("meshes");
               int[] aint4 = new int[jsonarray4.size()];
               int[] aint5 = new int[jsonarray4.size()];

               for (int j1 = 0; j1 < jsonarray4.size(); j1++) {
                  JsonObject jsonobject3 = jsonarray4.get(j1).getAsJsonObject().getAsJsonArray("primitives").get(0).getAsJsonObject();
                  aint4[j1] = jsonobject3.getAsJsonObject("attributes").get("POSITION").getAsInt();
                  aint5[j1] = jsonobject3.get("indices").getAsInt();
               }

               var hashmap = new HashMap();
               float f27 = Float.POSITIVE_INFINITY;
               float f = Float.POSITIVE_INFINITY;
               float f1 = Float.POSITIVE_INFINITY;
               float f2 = Float.NEGATIVE_INFINITY;
               float f3 = Float.NEGATIVE_INFINITY;
               float f4 = Float.NEGATIVE_INFINITY;

               for (int k1 = 0; k1 < jsonarray3.size(); k1++) {
                  JsonObject jsonobject4 = jsonarray3.get(k1).getAsJsonObject();
                  if (jsonobject4.has("mesh")) {
                     int l1 = jsonobject4.get("mesh").getAsInt();
                     int i2 = aint4[l1];
                     int j2 = aint5[l1];
                     int k2 = aint2[i2];
                     int l2 = aint[aint6[i2]] + aint3[i2];
                     float[] afloat = new float[k2 * 3];

                     for (int i3 = 0; i3 < k2; i3++) {
                        float f5 = bytebuffer.getFloat(l2 + i3 * 12) + afloat1[k1][0];
                        float f6 = bytebuffer.getFloat(l2 + i3 * 12 + 4) + afloat1[k1][1];
                        float f7 = bytebuffer.getFloat(l2 + i3 * 12 + 8) + afloat1[k1][2];
                        afloat[i3 * 3] = f5;
                        afloat[i3 * 3 + 1] = f6;
                        afloat[i3 * 3 + 2] = f7;
                        if (f5 < f27) {
                           f27 = f5;
                        }

                        if (f5 > f2) {
                           f2 = f5;
                        }

                        if (f6 < f) {
                           f = f6;
                        }

                        if (f6 > f3) {
                           f3 = f6;
                        }

                        if (f7 < f1) {
                           f1 = f7;
                        }

                        if (f7 > f4) {
                           f4 = f7;
                        }
                     }

                     int k4 = aint2[j2];
                     int l4 = aint[aint6[j2]] + aint3[j2];
                     int i5 = aint1[j2];
                     int[] aint7 = new int[k4];

                     for (int j3 = 0; j3 < k4; j3++) {
                        if (i5 == 5123) {
                           aint7[j3] = bytebuffer.getShort(l4 + j3 * 2) & '\uffff';
                        } else if (i5 == 5125) {
                           aint7[j3] = bytebuffer.getInt(l4 + j3 * 4);
                        } else {
                           aint7[j3] = bytebuffer.get(l4 + j3) & 255;
                        }
                     }

                     for (byte b0 = 0; b0 < k4; b0 += 3) {
                        int k3 = aint7[b0];
                        int l3 = aint7[b0 + 1];
                        int i4 = aint7[b0 + 2];
                        float f8 = afloat[k3 * 3];
                        float f9 = afloat[k3 * 3 + 1];
                        float f10 = afloat[k3 * 3 + 2];
                        float f11 = afloat[l3 * 3];
                        float f12 = afloat[l3 * 3 + 1];
                        float f13 = afloat[l3 * 3 + 2];
                        float f14 = afloat[i4 * 3];
                        float f15 = afloat[i4 * 3 + 1];
                        float f16 = afloat[i4 * 3 + 2];
                        float f17 = f11 - f8;
                        float f18 = f12 - f9;
                        float f19 = f13 - f10;
                        float f20 = f14 - f8;
                        float f21 = f15 - f9;
                        float f22 = f16 - f10;
                        float f23 = f18 * f22 - f19 * f21;
                        float f24 = f19 * f20 - f17 * f22;
                        float f25 = f17 * f21 - f18 * f20;
                        float f26 = (float)Math.sqrt((double)(f23 * f23 + f24 * f24 + f25 * f25));
                        if (!(f26 < 1.0E-8F)) {
                           f23 /= f26;
                           f24 /= f26;
                           f25 /= f26;
                           on23(hashmap, f8, f9, f10, f11, f12, f13, f23, f24, f25);
                           on23(hashmap, f11, f12, f13, f14, f15, f16, f23, f24, f25);
                           on23(hashmap, f14, f15, f16, f8, f9, f10, f23, f24, f25);
                        }
                     }
                  }
               }

               float f28 = (f27 + f2) * 0.5F;
               float f29 = (f + f3) * 0.5F;
               float f30 = (f1 + f4) * 0.5F;
               float f31 = Math.max(f2 - f27, Math.max(f3 - f, f4 - f1));
               float f32 = f31 > 1.0E-5F ? 1.2F / f31 : 1.0F;
               var arraylist = new ArrayList(hashmap.size() * 6);

               for (Particles_Var143 ii1l11il1iililiil_l1i1illlili : (Iterable<Particles_Var143>)(Object)(hashmap.values())) {
                  if (ii1l11il1iililiil_l1i1illlili.count == 1 || !ii1l11il1iililiil_l1i1illlili.val412) {
                     arraylist.add((ii1l11il1iililiil_l1i1illlili.val403 - f28) * f32);
                     arraylist.add((ii1l11il1iililiil_l1i1illlili.val404 - f29) * f32);
                     arraylist.add((ii1l11il1iililiil_l1i1illlili.val405 - f30) * f32);
                     arraylist.add((ii1l11il1iililiil_l1i1illlili.val406 - f28) * f32);
                     arraylist.add((ii1l11il1iililiil_l1i1illlili.val407 - f29) * f32);
                     arraylist.add((ii1l11il1iililiil_l1i1illlili.val408 - f30) * f32);
                  }
               }

               this.val155 = new float[arraylist.size()];

               for (int j4 = 0; j4 < arraylist.size(); j4++) {
                  this.val155[j4] = (Float)arraylist.get(j4);
               }
            } catch (Exception exception) {
               this.val155 = null;
            }

            return this.val155;
         }
      }
   }

   public static void on23(JsonArray var0, int var1, float var2, float var3, float var4, float[][] var5, boolean[] var6) {
      if (var1 >= 0 && var1 < var0.size() && !var6[var1]) {
         var6[var1] = true;
         JsonObject jsonobject = var0.get(var1).getAsJsonObject();
         float f = var2;
         float f1 = var3;
         float f2 = var4;
         if (jsonobject.has("translation")) {
            JsonArray jsonarray = jsonobject.getAsJsonArray("translation");
            f = var2 + jsonarray.get(0).getAsFloat();
            f1 = var3 + jsonarray.get(1).getAsFloat();
            f2 = var4 + jsonarray.get(2).getAsFloat();
         }

         var5[var1][0] = f;
         var5[var1][1] = f1;
         var5[var1][2] = f2;
         if (jsonobject.has("children")) {
            JsonArray jsonarray1 = jsonobject.getAsJsonArray("children");

            for (int i = 0; i < jsonarray1.size(); i++) {
               on23(var0, jsonarray1.get(i).getAsInt(), f, f1, f2, var5, var6);
            }
         }
      }
   }

   public static void on23(
      Map<String, Particles_Var143> var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9
   ) {
      int i = Math.round(var1 * 10000.0F);
      int j = Math.round(var2 * 10000.0F);
      int k = Math.round(var3 * 10000.0F);
      int l = Math.round(var4 * 10000.0F);
      int i1 = Math.round(var5 * 10000.0F);
      int j1 = Math.round(var6 * 10000.0F);
      boolean flag;
      if (i != l) {
         flag = i > l;
      } else if (j != i1) {
         flag = j > i1;
      } else {
         flag = k > j1;
      }

      String s = flag ? l + "," + i1 + "," + j1 + "|" + i + "," + j + "," + k : i + "," + j + "," + k + "|" + l + "," + i1 + "," + j1;
      Particles_Var143 ii1l11il1iililiil_l1i1illlili = (Particles_Var143)var0.get(s);
      if (ii1l11il1iililiil_l1i1illlili == null) {
         var0.put(s, new Particles_Var143(var1, var2, var3, var4, var5, var6, var7, var8, var9));
      } else {
         ii1l11il1iililiil_l1i1illlili.count++;
         float f = ii1l11il1iililiil_l1i1illlili.val409 * var7
            + ii1l11il1iililiil_l1i1illlili.val410 * var8
            + ii1l11il1iililiil_l1i1illlili.val411 * var9;
         if (Math.abs(f) < 0.985F) {
            ii1l11il1iililiil_l1i1illlili.val412 = false;
         }
      }
   }

   public float[] float386() {
      if (this.val154 != null) {
         return this.val154;
      } else {
         float f = 0.5F;
         float f1 = 0.42F;
         float f2 = 0.3F;
         float f3 = 0.13F;
         float f4 = 0.022F;
         float f5 = (f * f - f1 * f1 + f2 * f2) / (2.0F * f2);
         float f6 = (float)Math.sqrt((double)Math.max(0.0F, f * f - f5 * f5));
         float f7 = (float)Math.atan2((double)f6, (double)f5);
         float f8 = (float)Math.atan2((double)f6, (double)(f5 - f2));
         byte b0 = 18;
         byte b1 = 3;
         float f9 = (f - f5) * 0.5F;
         float f10 = (float) (Math.PI * 2) - 2.0F * f7;
         float f11 = f10 / (float)b0;
         float f12 = (float) (Math.PI * 2) - 2.0F * f8;
         float f13 = f12 / (float)b0;
         float[] afloat = new float[b0 + 1];
         float[] afloat1 = new float[b0 + 1];
         float[] afloat2 = new float[b0 + 1];

         for (int i = 0; i <= b0; i++) {
            float f14 = f7 + f11 * (float)i;
            afloat[i] = (float)Math.cos((double)f14) * f + f9;
            afloat1[i] = (float)Math.sin((double)f14) * f;
            float f15 = (f14 - f7) / f10;
            afloat2[i] = f4 + (f3 - f4) * (float)Math.sin((double)f15 * Math.PI);
         }

         float[] afloat3 = new float[b0 + 1];
         float[] afloat4 = new float[b0 + 1];
         float[] afloat5 = new float[b0 + 1];

         for (int j = 0; j <= b0; j++) {
            float f16 = f8 + f13 * (float)j;
            afloat3[j] = (float)Math.cos((double)f16) * f1 + f2 + f9;
            afloat4[j] = (float)Math.sin((double)f16) * f1;
            float f17 = (f16 - f8) / f12;
            afloat5[j] = f4 + (f3 - f4) * (float)Math.sin((double)f17 * Math.PI);
         }

         var arraylist = new ArrayList(b0 * 28 + 64);

         for (int k = 0; k < b0; k++) {
            arraylist.add(afloat[k]);
            arraylist.add(afloat1[k]);
            arraylist.add(afloat2[k]);
            arraylist.add(afloat[k + 1]);
            arraylist.add(afloat1[k + 1]);
            arraylist.add(afloat2[k + 1]);
            arraylist.add(afloat[k]);
            arraylist.add(afloat1[k]);
            arraylist.add(-afloat2[k]);
            arraylist.add(afloat[k + 1]);
            arraylist.add(afloat1[k + 1]);
            arraylist.add(-afloat2[k + 1]);
         }

         for (int l = 0; l < b0; l++) {
            arraylist.add(afloat3[l]);
            arraylist.add(afloat4[l]);
            arraylist.add(afloat5[l]);
            arraylist.add(afloat3[l + 1]);
            arraylist.add(afloat4[l + 1]);
            arraylist.add(afloat5[l + 1]);
            arraylist.add(afloat3[l]);
            arraylist.add(afloat4[l]);
            arraylist.add(-afloat5[l]);
            arraylist.add(afloat3[l + 1]);
            arraylist.add(afloat4[l + 1]);
            arraylist.add(-afloat5[l + 1]);
         }

         for (byte b2 = 0; b2 <= b0; b2 += b1) {
            arraylist.add(afloat[b2]);
            arraylist.add(afloat1[b2]);
            arraylist.add(afloat2[b2]);
            arraylist.add(afloat[b2]);
            arraylist.add(afloat1[b2]);
            arraylist.add(-afloat2[b2]);
         }

         for (byte b3 = b1; b3 < b0; b3 += b1) {
            arraylist.add(afloat3[b3]);
            arraylist.add(afloat4[b3]);
            arraylist.add(afloat5[b3]);
            arraylist.add(afloat3[b3]);
            arraylist.add(afloat4[b3]);
            arraylist.add(-afloat5[b3]);
         }

         this.val154 = new float[arraylist.size()];

         for (int i1 = 0; i1 < arraylist.size(); i1++) {
            this.val154[i1] = (Float)arraylist.get(i1);
         }

         return this.val154;
      }
   }

   public void on23(Vector3f var1, Vector3f var2, double var3, double var5, double var7, int var9) {
      this.on23(
         var3 + (double)var1.x, var5 + (double)var1.y, var7 + (double)var1.z, var3 + (double)var2.x, var5 + (double)var2.y, var7 + (double)var2.z, var9
      );
   }

   public void on23(double var1, double var3, double var5, double var7, double var9, double var11, int var13) {
      float f = (float)(var1 - this.double89);
      float f1 = (float)(var3 - this.double90);
      float f2 = (float)(var5 - this.double91);
      float f3 = (float)(var7 - this.double89);
      float f4 = (float)(var9 - this.double90);
      float f5 = (float)(var11 - this.double91);
      float f6 = this.float148;
      if (f6 > 0.05F) {
         int i = (this.int219 + 1) * 6;
         if (i > this.val023.length) {
            this.val023 = Arrays.copyOf(this.val023, this.val023.length * 2);
         }

         if (this.int219 >= this.val102.length) {
            this.val102 = Arrays.copyOf(this.val102, this.val102.length * 2);
         }

         int j = this.int219 * 6;
         this.val023[j] = f;
         this.val023[j + 1] = f1;
         this.val023[j + 2] = f2;
         this.val023[j + 3] = f3;
         this.val023[j + 4] = f4;
         this.val023[j + 5] = f5;
         if (var13 != this.int220 || f6 != this.float149) {
            this.int220 = var13;
            this.float149 = f6;
            this.int221 = ColorUtils.ColorAnimator(var13, 0.22F + 0.1F * f6);
         }

         this.val102[this.int219++] = this.int221;
      }

      int k = (this.int218 + 1) * 6;
      if (k > this.val022.length) {
         this.val022 = Arrays.copyOf(this.val022, this.val022.length * 2);
      }

      if (this.int218 >= this.val101.length) {
         this.val101 = Arrays.copyOf(this.val101, this.val101.length * 2);
      }

      int l = this.int218 * 6;
      this.val022[l] = f;
      this.val022[l + 1] = f1;
      this.val022[l + 2] = f2;
      this.val022[l + 3] = f3;
      this.val022[l + 4] = f4;
      this.val022[l + 5] = f5;
      this.val101[this.int218++] = var13;
   }

   public void on23(MatrixStack var1) {
      if (this.int218 != 0 || this.int219 != 0) {
         GL11.glEnable(2881);
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_CONSTANT_ALPHA);
         RenderSystem.setShader(ShaderProgramKeys.RENDERTYPE_LINES);
         var entry = var1.peek();
         if (this.int219 > 0) {
            RenderSystem.lineWidth(5.1200004F);
            this.on23(entry, this.val023, this.val102, this.int219);
         }

         if (this.int218 > 0) {
            RenderSystem.lineWidth(1.6F);
            this.on23(entry, this.val022, this.val101, this.int218);
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
         GL11.glDisable(2881);
         this.int218 = 0;
         this.int219 = 0;
      }
   }

   public void on23(Entry var1, float[] var2, int[] var3, int var4) {
      BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.LINES, VertexFormats.LINES);

      for (int i = 0; i < var4; i++) {
         int j = i * 6;
         float f = var2[j];
         float f1 = var2[j + 1];
         float f2 = var2[j + 2];
         float f3 = var2[j + 3];
         float f4 = var2[j + 4];
         float f5 = var2[j + 5];
         int k = var3[i];
         float f6 = f3 - f;
         float f7 = f4 - f1;
         float f8 = f5 - f2;
         float f9 = f6 * f6 + f7 * f7 + f8 * f8;
         float f10 = f9 > 1.0E-12F ? 1.0F / (float)Math.sqrt((double)f9) : 1.0F;
         float f11 = f6 * f10;
         float f12 = f7 * f10;
         float f13 = f8 * f10;
         bufferbuilder.vertex(var1, f, f1, f2).color(k).normal(var1, f11, f12, f13);
         bufferbuilder.vertex(var1, f3, f4, f5).color(k).normal(var1, f11, f12, f13);
      }

      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
   }

   public void DataChangedEvent(long var1) {
      boolean flag = this.boolean125 && !this.list60.isEmpty();
      boolean flag1 = this.boolean126 && !this.list61.isEmpty();
      boolean flag2 = this.boolean127 && !this.list62.isEmpty();
      boolean flag3 = this.boolean128 && !this.list63.isEmpty();
      boolean flag4 = this.boolean129 && !this.list64.isEmpty();
      boolean flag5 = this.boolean130 && !this.list65.isEmpty();
      boolean flag6 = this.boolean131 && this.float383();
      if (flag || flag1 || flag2 || flag3 || flag4 || flag5 || flag6) {
         float f = this.size3.getCurrent();
         float f1 = this.float148;
         RenderSystem.enableBlend();
         RenderSystem.disableCull();
         RenderSystem.blendFuncSeparate(SrcFactor.SRC_ALPHA, DstFactor.ONE, SrcFactor.ZERO, DstFactor.ONE);
         RenderSystem.enableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
         RenderSystem.setShaderTexture(0, identifier3);
         BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         if (flag) {
            this.on23(bufferbuilder, this.list60, f * 1.7F, f1, var1, false);
         }

         if (flag1) {
            this.on23(bufferbuilder, this.list61, f * 1.7F, f1, var1, false);
         }

         if (flag2) {
            this.on23(bufferbuilder, this.list62, f * 2.0F, f1, var1, true);
         }

         if (flag3) {
            this.on23(bufferbuilder, this.list63, f * 1.8F, f1, var1, false);
         }

         if (flag4) {
            this.on23(bufferbuilder, this.list64, f * 1.8F, f1, var1, false);
         }

         if (flag5) {
            this.on23(bufferbuilder, this.list65, f * 1.8F, f1, var1, false);
         }

         if (flag6) {
            float f2 = MathHelper.clamp((float)(var1 - this.long122) / 50.0F, 0.0F, 1.0F);
            this.on23(bufferbuilder, this.list66, f1, var1, f2);
            this.on23(bufferbuilder, this.list67, f1, var1, f2);
            this.on23(bufferbuilder, this.list68, f1, var1, f2);
         }

         BuiltBuffer builtbuffer = bufferbuilder.endNullable();
         if (builtbuffer != null) {
            BufferRenderer.drawWithGlobalProgram(builtbuffer);
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.defaultBlendFunc();
      }
   }

   public void on23(BufferBuilder var1, List<Particles_Var165> var2, float var3, long var4, float var6) {
      float f = Math.min(1.0F, var3);

      for (Particles_Var165 ii1l11il1iililiil_illi1l1l1 : var2) {
         float f1 = ii1l11il1iililiil_illi1l1l1.EventMouseScrollHook(var4);
         if (!(f1 <= 0.0F)) {
            if (ii1l11il1iililiil_illi1l1l1.val097 != this.long123) {
               ii1l11il1iililiil_illi1l1l1.on23(var6, this.long123);
            }

            if (!this.on23(
               ii1l11il1iililiil_illi1l1l1,
               ii1l11il1iililiil_illi1l1l1.val006,
               ii1l11il1iililiil_illi1l1l1.val007,
               ii1l11il1iililiil_illi1l1l1.val008
            )) {
               int i = this.on23(ii1l11il1iililiil_illi1l1l1);
               float f2 = f1 * 0.55F * f;
               float f3 = f1 * 0.22F * var3;
               float f4 = ii1l11il1iililiil_illi1l1l1.ChatMessageEvent(var4);
               float f5 = 0.85F + 0.15F * MathHelper.sin(ii1l11il1iililiil_illi1l1l1.val301 * 3.0F + f4 * 6.0F);
               float f6 = ii1l11il1iililiil_illi1l1l1.val187 * 1.1F * f5;
               float f7 = ii1l11il1iililiil_illi1l1l1.val187 * 1.9F * f5;
               this.on23(
                  var1,
                  ii1l11il1iililiil_illi1l1l1.val006,
                  ii1l11il1iililiil_illi1l1l1.val007,
                  ii1l11il1iililiil_illi1l1l1.val008,
                  f7,
                  i,
                  f3
               );
               this.on23(
                  var1,
                  ii1l11il1iililiil_illi1l1l1.val006,
                  ii1l11il1iililiil_illi1l1l1.val007,
                  ii1l11il1iililiil_illi1l1l1.val008,
                  f6,
                  i,
                  f2
               );
            }
         }
      }
   }

   public void on23(BufferBuilder var1, List<Particles_Var159> var2, float var3, float var4, long var5, boolean var7) {
      float f = Math.min(1.0F, var4);

      for (Particles_Var159 ii1l11il1iililiil_ii1il11l111ii11iil : var2) {
         float f1 = this.on23(var5, ii1l11il1iililiil_ii1il11l111ii11iil.val031, ii1l11il1iililiil_ii1il11l111ii11iil.val032);
         if (!(f1 >= 1.0F)) {
            if (ii1l11il1iililiil_ii1il11l111ii11iil.val097 != this.long123) {
               if (var7) {
                  this.on23(ii1l11il1iililiil_ii1il11l111ii11iil, f1);
               } else {
                  this.UiAnimation(ii1l11il1iililiil_ii1il11l111ii11iil, f1);
               }
            }

            if (!this.on23(
               ii1l11il1iililiil_ii1il11l111ii11iil,
               ii1l11il1iililiil_ii1il11l111ii11iil.val006,
               ii1l11il1iililiil_ii1il11l111ii11iil.val007,
               ii1l11il1iililiil_ii1il11l111ii11iil.val008
            )) {
               int i = this.on23(ii1l11il1iililiil_ii1il11l111ii11iil);
               float f2 = this.EventInjectPlaced(f1);
               float f3 = f2 * 0.55F * f;
               float f4 = f2 * 0.22F * var4;
               float f5 = 0.85F + 0.15F * MathHelper.sin((float)ii1l11il1iililiil_ii1il11l111ii11iil.val300 * 3.0F + f1 * 6.0F);
               float f6 = var3 * 0.55F * (0.9F + f1 * 0.2F) * f5;
               float f7 = var3 * (0.95F + f1 * 0.25F) * f5;
               this.on23(
                  var1,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val006,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val007,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val008,
                  f7,
                  i,
                  f4
               );
               this.on23(
                  var1,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val006,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val007,
                  ii1l11il1iililiil_ii1il11l111ii11iil.val008,
                  f6,
                  i,
                  f3
               );
            }
         }
      }
   }

   public void on23(BufferBuilder var1, double var2, double var4, double var6, float var8, int var9, float var10) {
      if (!(var10 <= 0.0F)) {
         this.vector3f11
            .set((float)(var2 - this.double89), (float)(var4 - this.double90), (float)(var6 - this.double91));
         this.matrix4f2.transformPosition(this.vector3f11);
         this.matrix4f4.setTranslation(this.vector3f11);
         int i = ColorUtils.ColorAnimator(var9, var10);
         var1.vertex(this.matrix4f4, var8, -var8, 0.0F).texture(0.0F, 1.0F).color(i);
         var1.vertex(this.matrix4f4, -var8, -var8, 0.0F).texture(1.0F, 1.0F).color(i);
         var1.vertex(this.matrix4f4, -var8, var8, 0.0F).texture(1.0F, 0.0F).color(i);
         var1.vertex(this.matrix4f4, var8, var8, 0.0F).texture(0.0F, 0.0F).color(i);
      }
   }

   public float EventInjectPlaced(float var1) {
      if (var1 < 0.15F) {
         return var1 / 0.15F;
      } else {
         return var1 > 0.75F ? Math.max(0.0F, (1.0F - var1) / 0.25F) : 1.0F;
      }
   }

   public void on23(Particles_Var159 var1, float var2) {
      Vec3d vec3d = var1.val130;
      double d0 = var1.val300;
      float f = MathHelper.sin((float)d0 * 7.0F + var2 * 4.0F) * 0.6F;
      float f1 = MathHelper.cos((float)d0 * 9.0F + var2 * 5.0F) * 0.6F;
      float f2 = MathHelper.sin((float)d0 * 5.0F + var2 * 3.0F) * 0.4F + var2 * 0.6F;
      var1.val006 = vec3d.x + (double)f;
      var1.val007 = vec3d.y + (double)f2;
      var1.val008 = vec3d.z + (double)f1;
      var1.val097 = this.long123;
   }

   public void UiAnimation(Particles_Var159 var1, float var2) {
      var1.val006 = var1.val130.x + var1.val033 * (double)var2;
      var1.val007 = var1.val130.y + var1.val016 * (double)var2;
      var1.val008 = var1.val130.z + var1.val034 * (double)var2;
      var1.val097 = this.long123;
   }

   public float[] float387() {
      if (this.boolean133) {
         return this.val153;
      } else {
         this.boolean133 = true;
         InputStream inputstream = Particles.class.getResourceAsStream("/assets/zenith/visuals/particles/totem_undying.obj");
         if (inputstream == null) {
            return null;
         } else {
            try (BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, StandardCharsets.UTF_8))) {
               var arraylist = new ArrayList();
               var hashmap = new HashMap();

               String s;
               while ((s = bufferedreader.readLine()) != null) {
                  s = s.trim();
                  if (s.startsWith("v ")) {
                     String[] astring2 = s.split("\\s+");
                     arraylist.add(new Vector3f(Float.parseFloat(astring2[1]), Float.parseFloat(astring2[2]) - 0.75F, Float.parseFloat(astring2[3])));
                  } else if (s.startsWith("f ")) {
                     String[] astring = s.split("\\s+");

                     for (int i = 1; i < astring.length; i++) {
                        int j = i == astring.length - 1 ? 1 : i + 1;
                        int k = Integer.parseInt(astring[i].split("/")[0]) - 1;
                        int l = Integer.parseInt(astring[j].split("/")[0]) - 1;
                        if (k != l) {
                           String[] astring1 = astring[i].split("/");
                           int i1 = astring1.length > 2 && !astring1[2].isEmpty() ? Integer.parseInt(astring1[2]) - 1 : -1;
                           long j1 = (long)Math.min(k, l) << 32 | (long)Math.max(k, l) & 4294967295L;
                           Particles_Var134 ii1l11il1iililiil_l1iil11li = (Particles_Var134)hashmap.get(j1);
                           if (ii1l11il1iililiil_l1iil11li == null) {
                              Vector3f vector3f = (Vector3f)arraylist.get(k);
                              Vector3f vector3f1 = (Vector3f)arraylist.get(l);
                              hashmap.put(j1, new Particles_Var134(vector3f.x, vector3f.y, vector3f.z, vector3f1.x, vector3f1.y, vector3f1.z, i1));
                           } else {
                              ii1l11il1iililiil_l1iil11li.count++;
                              if (ii1l11il1iililiil_l1iil11li.val309 != i1) {
                                 ii1l11il1iililiil_l1iil11li.val066 = false;
                              }
                           }
                        }
                     }
                  }
               }

               var arraylist1 = new ArrayList();

               for (Particles_Var134 ii1l11il1iililiil_l1iil11li1 : (Iterable<Particles_Var134>)(Object)(hashmap.values())) {
                  if (ii1l11il1iililiil_l1iil11li1.count == 1 || !ii1l11il1iililiil_l1iil11li1.val066) {
                     arraylist1.add(ii1l11il1iililiil_l1iil11li1.val303);
                     arraylist1.add(ii1l11il1iililiil_l1iil11li1.val304);
                     arraylist1.add(ii1l11il1iililiil_l1iil11li1.val305);
                     arraylist1.add(ii1l11il1iililiil_l1iil11li1.val306);
                     arraylist1.add(ii1l11il1iililiil_l1iil11li1.val307);
                     arraylist1.add(ii1l11il1iililiil_l1iil11li1.val308);
                  }
               }

               this.val153 = new float[arraylist1.size()];

               for (int k1 = 0; k1 < arraylist1.size(); k1++) {
                  this.val153[k1] = (Float)arraylist1.get(k1);
               }
            } catch (Exception exception) {
               this.val153 = null;
            }

            return this.val153;
         }
      }
   }

   public int EventEntityCollision(int var1) {
      if (this.boolean132) {
         return this.int217;
      } else {
         int i = MathHelper.clamp(var1, 0, this.val326.length - 1);
         if (this.val452[i] != this.long123) {
            this.val326[i] = ZenithClient.on23().TextScanner().getClientColor(i).call001();
            this.val452[i] = this.long123;
         }

         return this.val326[i];
      }
   }

   public int on23(Particles_Var155 var1) {
      if (var1.val046 != this.long123) {
         var1.int92 = this.EventEntityCollision(var1.val393);
         var1.val046 = this.long123;
      }

      return var1.int92;
   }

   public int on23(Particles_Var159 var1) {
      if (var1.val046 != this.long123) {
         var1.int92 = this.EventEntityCollision(var1.val398);
         var1.val046 = this.long123;
      }

      return var1.int92;
   }

   public int on23(Particles_Var165 var1) {
      if (var1.val046 != this.long123) {
         var1.int92 = this.EventEntityCollision(var1.val399);
         var1.val046 = this.long123;
      }

      return var1.int92;
   }

   public float[] getThis() {
      return this.float387();
   }

   public float[] getThis2() {
      return this.boolean199();
   }
}
