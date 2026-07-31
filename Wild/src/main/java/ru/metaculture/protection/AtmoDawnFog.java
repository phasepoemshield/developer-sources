package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.FloatBuffer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.Window;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AtmoDawnFog",
   O000000000 = "Кинематографичная атмосфера: туман, лучи света, заря",
   O0000000000 = Category.Visuals
)
public class AtmoDawnFog extends Module {
   private static final String O000000000OO0 = "assets/wild/shaders/world/world_volume.vert";
   private static final String O000000000OO00 = "assets/wild/shaders/dawnfog/world_fog_fresnel.frag";
   private static final String O000000000OO0O = "Рассвет";
   private static final String O000000000OOO = "Сумерки";
   private static final String O000000000OOO0 = "Тема";
   private static final float O000000000OOOO = 18.0F;
   private static final float O00000000O = 1.0E-4F;
   private static final int O00000000O0 = 13203624;
   private static final int O00000000O00 = 8230143;
   public final ModeSetting O000000000O = new ModeSetting("Режим", "Рассвет", "Рассвет", "Сумерки", "Тема");
   public final NumberSetting O000000000O0 = new NumberSetting("Плотность", 0.35F, 0.05F, 0.8F, 0.01F, false);
   public final NumberSetting O000000000O00 = new NumberSetting("Высота рассеивания", 76.0F, 60.0F, 120.0F, 1.0F, false);
   public final NumberSetting O000000000O000 = new NumberSetting("Лучи света", 0.75F, 0.0F, 1.0F, 0.01F, true);
   public final NumberSetting O000000000O00O = new NumberSetting("Мягкость", 0.6F, 0.0F, 1.0F, 0.01F, true);
   public final BooleanSetting O000000000O0O = new BooleanSetting("Радуга", true);
   public final NumberSetting O000000000O0O0 = new NumberSetting("Яркость радуги", 0.55F, 0.1F, 1.0F, 0.01F, true)
      .O00000000(() -> !this.O000000000O0O.O0000000000());
   public final NumberSetting O000000000O0OO = new NumberSetting("Размер радуги", 54.0F, 46.0F, 60.0F, 0.5F, false)
      .O00000000(() -> !this.O000000000O0O.O0000000000());
   public final O0000000OOOO O000000000OO = new O0000000OOOO("Цвет зари", new Color(255, 173, 122)).O00000000(() -> !this.O000000000O.O000000000("Рассвет"));
   private final Matrix4f O00000000O000 = new Matrix4f();
   private final Matrix4f O00000000O0000 = new Matrix4f();
   private final Matrix4f O00000000O000O = new Matrix4f();
   private final Matrix4f O00000000O00O = new Matrix4f();
   private final Vector4f O00000000O00O0 = new Vector4f();
   private final FloatBuffer O00000000O00OO = BufferUtils.createFloatBuffer(16);
   private O0000O00OO0 O00000000O0O;
   private int O00000000O0O0 = -1;
   private int O00000000O0O00 = -1;
   private int O00000000O0O0O = -1;
   private int O00000000O0OO = -1;
   private int O00000000O0OO0 = -1;
   private int O00000000O0OOO = -1;
   private int O00000000OO = -1;
   private int O00000000OO0 = -1;
   private int O00000000OO00 = -1;
   private int O00000000OO000 = -1;
   private int O00000000OO00O = -1;
   private int O00000000OO0O = -1;
   private int O00000000OO0O0 = -1;
   private int O00000000OO0OO = -1;
   private int O00000000OOO = -1;
   private int O00000000OOO0 = -1;
   private int O00000000OOO00 = -1;
   private int O00000000OOO0O = -1;
   private int O00000000OOOO = -1;
   private int O00000000OOOO0 = -1;
   private int O00000000OOOOO = -1;
   private int O0000000O = -1;
   private int O0000000O0 = -1;
   private int O0000000O00 = -1;
   private int O0000000O000;
   private int O0000000O0000;
   private int O0000000O00000;
   private int O0000000O0000O;
   private int O0000000O000O;
   private int O0000000O000O0;
   private int O0000000O000OO;
   private int O0000000O00O;
   private boolean O0000000O00O0;
   private boolean O0000000O00O00;
   private float O0000000O00O0O = 0.5F;
   private float O0000000O00OO = 0.5F;
   private float O0000000O00OO0;
   private float O0000000O00OOO;
   private float O0000000O0O = -0.39F;
   private final float[] O0000000O0O0 = new float[18];

   public AtmoDawnFog() {
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO
         }
      );
   }

   public static boolean O0000000000O0() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         AtmoDawnFog var0 = WildClient.O00000000.O000000000.O00000000(AtmoDawnFog.class);
         return var0 != null && var0.O0000000000000 && !var0.O0000000O00O00;
      } else {
         return false;
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O0000000000OO0();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @EventHandler(
      O00000000 = 1
   )
   public void O00000000(O0000000OO0O0 o0000000OO0O0) {
      if (this.O0000000000000 && !this.O0000000O00O00 && o0000000OO0O0 != null) {
         if (RenderSystem.isOnRenderThread()) {
            MinecraftClient var2 = o0000000OO0O0.O0000000000();
            if (var2 != null && var2.world != null && var2.player != null && o0000000OO0O0.O000000000000() != null) {
               Camera var3 = o0000000OO0O0.O000000000000().O00000000();
               if (var3 != null) {
                  Window var4 = var2.getWindow();
                  if (var4 != null && !var4.hasZeroWidthOrHeight()) {
                     int var5 = var4.getFramebufferWidth();
                     int var6 = var4.getFramebufferHeight();
                     if (var5 > 1 && var6 > 1) {
                        Framebuffer var7 = var2.getFramebuffer();
                        if (var7 != null) {
                           int var8 = O00000000(var7.getColorAttachment());
                           int var9 = O00000000(var7.getDepthAttachment());
                           if (var8 > 0 && var9 > 0) {
                              if (!(this.O000000000O0.O0000000000() <= 1.0E-4F)) {
                                 float var10 = o0000000OO0O0.O00000000000O0();
                                 float var11 = ((float)(var2.world.getTime() % 100000L) + var10) * 0.05F;
                                 float var12 = var2.world.getSkyAngleRadians(var10);
                                 float var13 = -((float)Math.sin(var12));
                                 int var14 = this.O0000000000O00();
                                 float var15 = this.O00000000(var14);
                                 float var16 = var13 >= 0.0F ? 1.0F : -1.0F;
                                 float var17 = var16 * (float)Math.cos(var15);
                                 float var18 = (float)Math.sin(var15);
                                 float var19 = 0.3F;
                                 this.O0000000O00OOO = -var16 * (float)Math.cos(var19);
                                 this.O0000000O0O = -((float)Math.sin(var19));
                                 int var20 = this.O000000000(var14);
                                 float var21 = 192.0F;
                                 if (var2.options != null) {
                                    var21 = ((Integer)var2.options.getViewDistance().getValue()).intValue() * 16.0F;
                                 }

                                 O0000O00O0OOO0.W373 var22 = O0000O00O0OOO0.O00000000();
                                 boolean var27 = false /* VF: Semaphore variable */;

                                 label219: {
                                    label206: {
                                       label220: {
                                          try {
                                             var27 = true;
                                             this.O0000000000OO();
                                             if (!this.O0000000O00O00) {
                                                if (this.O000000000(var5, var6)) {
                                                   if (!this.O00000000(var8, var5, var6)) {
                                                      var27 = false;
                                                      break label219;
                                                   }

                                                   Vec3d var23 = var3.getPos();
                                                   this.O00000000O000O.set(o0000000OO0O0.O000000000000O());
                                                   this.O00000000O00O.set(o0000000OO0O0.O00000000000O());
                                                   this.O00000000(var17, var18);
                                                   this.O00000000O000.set(this.O00000000O00O).invert();
                                                   this.O00000000O0000.set(this.O00000000O000O).invert();
                                                   this.O00000000O0000.m30((float)var23.x);
                                                   this.O00000000O0000.m31((float)var23.y);
                                                   this.O00000000O0000.m32((float)var23.z);
                                                   this.O00000000(var8, var9, var5, var6, var23, var11, var17, var18, var14, var20, var21);
                                                   var27 = false;
                                                   break label206;
                                                }

                                                var27 = false;
                                             } else {
                                                var27 = false;
                                             }
                                             break label220;
                                          } catch (Throwable var28) {
                                             this.O0000000O00O00 = true;
                                             System.err.println("[AtmoDawnFog] renderer disabled: " + var28.getMessage());
                                             var28.printStackTrace();
                                             var27 = false;
                                          } finally {
                                             if (var27) {
                                                if (this.O0000000O000O0 != 0) {
                                                   GL30.glBindFramebuffer(36160, this.O0000000O000O0);
                                                   GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                                }

                                                GL13.glActiveTexture(33985);
                                                GL11.glBindTexture(3553, 0);
                                                GL13.glActiveTexture(33984);
                                                GL11.glBindTexture(3553, 0);
                                                GL20.glUseProgram(0);
                                                O0000O00O0OOO0.O00000000(var22);
                                             }
                                          }

                                          if (this.O0000000O000O0 != 0) {
                                             GL30.glBindFramebuffer(36160, this.O0000000O000O0);
                                             GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                          }

                                          GL13.glActiveTexture(33985);
                                          GL11.glBindTexture(3553, 0);
                                          GL13.glActiveTexture(33984);
                                          GL11.glBindTexture(3553, 0);
                                          GL20.glUseProgram(0);
                                          O0000O00O0OOO0.O00000000(var22);
                                          return;
                                       }

                                       if (this.O0000000O000O0 != 0) {
                                          GL30.glBindFramebuffer(36160, this.O0000000O000O0);
                                          GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                       }

                                       GL13.glActiveTexture(33985);
                                       GL11.glBindTexture(3553, 0);
                                       GL13.glActiveTexture(33984);
                                       GL11.glBindTexture(3553, 0);
                                       GL20.glUseProgram(0);
                                       O0000O00O0OOO0.O00000000(var22);
                                       return;
                                    }

                                    if (this.O0000000O000O0 != 0) {
                                       GL30.glBindFramebuffer(36160, this.O0000000O000O0);
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                    }

                                    GL13.glActiveTexture(33985);
                                    GL11.glBindTexture(3553, 0);
                                    GL13.glActiveTexture(33984);
                                    GL11.glBindTexture(3553, 0);
                                    GL20.glUseProgram(0);
                                    O0000O00O0OOO0.O00000000(var22);
                                    return;
                                 }

                                 if (this.O0000000O000O0 != 0) {
                                    GL30.glBindFramebuffer(36160, this.O0000000O000O0);
                                    GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                 }

                                 GL13.glActiveTexture(33985);
                                 GL11.glBindTexture(3553, 0);
                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, 0);
                                 GL20.glUseProgram(0);
                                 O0000O00O0OOO0.O00000000(var22);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void O00000000(int i, int j, int k, int l, Vec3d vec3d, float f, float g, float h, int m, int n, float o) {
      GL30.glBindFramebuffer(36160, this.O0000000O000O0);
      GL30.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
      GL11.glDrawBuffer(36064);
      if (GL30.glCheckFramebufferStatus(36160) == 36053) {
         GL11.glViewport(0, 0, k, l);
         GL11.glDisable(3089);
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         GL11.glDisable(3042);
         GL11.glDisable(36281);
         GL11.glColorMask(true, true, true, true);
         GL11.glDepthMask(false);
         this.O00000000O0O.O00000000();
         float var12 = this.O000000000O00.O0000000000();
         float var13 = var12 - 18.0F;
         this.O00000000(m, n);
         if (this.O00000000O0O0 >= 0) {
            GL20.glUniform1i(this.O00000000O0O0, 0);
         }

         if (this.O00000000O0O00 >= 0) {
            GL20.glUniform1i(this.O00000000O0O00, 1);
         }

         if (this.O00000000O0O0O >= 0) {
            GL20.glUniform2f(this.O00000000O0O0O, k, l);
         }

         if (this.O00000000O0OO >= 0) {
            GL20.glUniform1f(this.O00000000O0OO, f);
         }

         if (this.O00000000O0OO0 >= 0) {
            GL20.glUniform3f(this.O00000000O0OO0, (float)vec3d.x, (float)vec3d.y, (float)vec3d.z);
         }

         if (this.O00000000O0OOO >= 0) {
            this.O00000000(this.O00000000O0OOO, this.O00000000O000);
         }

         if (this.O00000000OO >= 0) {
            this.O00000000(this.O00000000OO, this.O00000000O0000);
         }

         if (this.O00000000OO0 >= 0) {
            GL20.glUniform3f(this.O00000000OO0, g, h, 0.0F);
         }

         if (this.O00000000OO00 >= 0) {
            GL20.glUniform3f(this.O00000000OO00, this.O0000000O00O0O, this.O0000000O00OO, this.O0000000O00OO0);
         }

         if (this.O00000000OO000 >= 0) {
            GL20.glUniform1f(this.O00000000OO000, O00000000(this.O000000000O0.O0000000000(), 0.05F, 0.8F));
         }

         if (this.O00000000OO00O >= 0) {
            GL20.glUniform1f(this.O00000000OO00O, var13);
         }

         if (this.O00000000OO0O >= 0) {
            GL20.glUniform1f(this.O00000000OO0O, var12);
         }

         if (this.O00000000OO0O0 >= 0) {
            GL20.glUniform1f(this.O00000000OO0O0, o);
         }

         if (this.O00000000OO0OO >= 0) {
            GL20.glUniform3f(this.O00000000OO0OO, this.O0000000O0O0[0], this.O0000000O0O0[1], this.O0000000O0O0[2]);
         }

         if (this.O00000000OOO >= 0) {
            GL20.glUniform3f(this.O00000000OOO, this.O0000000O0O0[3], this.O0000000O0O0[4], this.O0000000O0O0[5]);
         }

         if (this.O00000000OOO0 >= 0) {
            GL20.glUniform3f(this.O00000000OOO0, this.O0000000O0O0[6], this.O0000000O0O0[7], this.O0000000O0O0[8]);
         }

         if (this.O00000000OOO00 >= 0) {
            GL20.glUniform3f(this.O00000000OOO00, this.O0000000O0O0[9], this.O0000000O0O0[10], this.O0000000O0O0[11]);
         }

         if (this.O00000000OOO0O >= 0) {
            GL20.glUniform3f(this.O00000000OOO0O, this.O0000000O0O0[12], this.O0000000O0O0[13], this.O0000000O0O0[14]);
         }

         if (this.O00000000OOOO >= 0) {
            GL20.glUniform3f(this.O00000000OOOO, this.O0000000O0O0[15], this.O0000000O0O0[16], this.O0000000O0O0[17]);
         }

         if (this.O00000000OOOO0 >= 0) {
            GL20.glUniform1f(this.O00000000OOOO0, this.O000000000O0O.O0000000000() ? O00000000(this.O000000000O0O0.O0000000000(), 0.0F, 1.0F) : 0.0F);
         }

         if (this.O00000000OOOOO >= 0) {
            GL20.glUniform3f(this.O00000000OOOOO, this.O0000000O00OOO, this.O0000000O0O, 0.0F);
         }

         if (this.O0000000O >= 0) {
            GL20.glUniform1f(this.O0000000O, O00000000(this.O000000000O0OO.O0000000000(), 40.0F, 64.0F));
         }

         if (this.O0000000O0 >= 0) {
            GL20.glUniform1f(this.O0000000O0, O00000000(this.O000000000O000.O0000000000(), 0.0F, 1.0F));
         }

         if (this.O0000000O00 >= 0) {
            GL20.glUniform1f(this.O0000000O00, O00000000(this.O000000000O00O.O0000000000(), 0.0F, 1.0F));
         }

         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, this.O0000000O0000);
         GL13.glActiveTexture(33985);
         GL11.glBindTexture(3553, j);
         GL13.glActiveTexture(33984);
         GL30.glBindVertexArray(this.O0000000O000OO);
         O0000O00OO0O.O00000000().O00000000(2);
         GL11.glDrawArrays(4, 0, 6);
         GL30.glBindVertexArray(0);
      }
   }

   private void O00000000(float f, float g) {
      this.O0000000O00O0O = 0.5F;
      this.O0000000O00OO = 0.5F;
      this.O0000000O00OO0 = 0.0F;
      this.O00000000O00O0.set(f, g, 0.0F, 0.0F);
      this.O00000000O000O.transform(this.O00000000O00O0);
      float var3 = this.O00000000O00O0.x;
      float var4 = this.O00000000O00O0.y;
      float var5 = this.O00000000O00O0.z;
      float var6 = -var5;
      if (!(var6 <= 1.0E-4F)) {
         this.O00000000O00O0.set(var3 * 1000.0F, var4 * 1000.0F, var5 * 1000.0F, 1.0F);
         this.O00000000O00O.transform(this.O00000000O00O0);
         if (!(this.O00000000O00O0.w <= 1.0E-4F)) {
            this.O0000000O00O0O = this.O00000000O00O0.x / this.O00000000O00O0.w * 0.5F + 0.5F;
            this.O0000000O00OO = this.O00000000O00O0.y / this.O00000000O00O0.w * 0.5F + 0.5F;
            this.O0000000O00OO0 = O00000000(var6 * 4.0F, 0.0F, 1.0F);
         }
      }
   }

   private void O00000000(int i, int j) {
      Color var3 = this.O000000000OO.O0000000000();
      float var4 = var3.getRed() / 255.0F;
      float var5 = var3.getGreen() / 255.0F;
      float var6 = var3.getBlue() / 255.0F;
      float var7 = (j >> 16 & 0xFF) / 255.0F;
      float var8 = (j >> 8 & 0xFF) / 255.0F;
      float var9 = (j & 0xFF) / 255.0F;
      if (i == 1) {
         O00000000(this.O0000000O0O0, 0, 0.135F, 0.125F, 0.3F);
         O00000000(this.O0000000O0O0, 3, 0.89F, 0.46F, 0.55F);
         O00000000(this.O0000000O0O0, 6, 0.38F, 0.35F, 0.56F);
         O00000000(this.O0000000O0O0, 9, 0.8F, 0.52F, 0.62F);
         O00000000(this.O0000000O0O0, 12, 0.47F, 0.44F, 0.64F);
         O00000000(this.O0000000O0O0, 15, 0.92F, 0.56F, 0.72F);
      } else if (i == 2) {
         O00000000(this.O0000000O0O0, 0, 0.085F, 0.1F, 0.2F, var7, var8, var9, 0.3F);
         O00000000(this.O0000000O0O0, 3, var7, var8, var9, 1.0F, 0.93F, 0.82F, 0.35F);
         O00000000(this.O0000000O0O0, 6, 0.52F, 0.58F, 0.74F, var7, var8, var9, 0.28F);
         O00000000(this.O0000000O0O0, 9, var7, var8, var9, 0.97F, 0.93F, 0.88F, 0.45F);
         O00000000(this.O0000000O0O0, 12, 0.58F, 0.63F, 0.76F, var7, var8, var9, 0.35F);
         O00000000(this.O0000000O0O0, 15, var7, var8, var9, 1.0F, 0.96F, 0.88F, 0.3F);
      } else {
         O00000000(this.O0000000O0O0, 0, 0.16F, 0.19F, 0.38F, var4, var5, var6, 0.14F);
         O00000000(this.O0000000O0O0, 3, O00000000(var4 * 1.12F, 0.0F, 1.0F), O00000000(var5 * 0.88F, 0.0F, 1.0F), O00000000(var6 * 0.62F, 0.0F, 1.0F));
         O00000000(this.O0000000O0O0, 6, 0.56F, 0.62F, 0.8F);
         O00000000(this.O0000000O0O0, 9, var4, var5, var6, 0.95F, 0.55F, 0.63F, 0.42F);
         O00000000(this.O0000000O0O0, 12, 0.6F, 0.67F, 0.82F);
         O00000000(this.O0000000O0O0, 15, O00000000(var4 * 1.08F, 0.0F, 1.0F), O00000000(var5 * 0.94F, 0.0F, 1.0F), O00000000(var6 * 0.72F, 0.0F, 1.0F));
      }
   }

   private static void O00000000(float[] fs, int i, float f, float g, float h) {
      fs[i] = f;
      fs[i + 1] = g;
      fs[i + 2] = h;
   }

   private static void O00000000(float[] fs, int i, float f, float g, float h, float j, float k, float l, float m) {
      float var9 = O00000000(m, 0.0F, 1.0F);
      float var10 = O00000000(f);
      float var11 = O00000000(g);
      float var12 = O00000000(h);
      float var13 = O00000000(j);
      float var14 = O00000000(k);
      float var15 = O00000000(l);
      float var16 = (float)Math.cbrt(0.41222146F * var10 + 0.53633255F * var11 + 0.051445995F * var12);
      float var17 = (float)Math.cbrt(0.2119035F * var10 + 0.6806995F * var11 + 0.10739696F * var12);
      float var18 = (float)Math.cbrt(0.08830246F * var10 + 0.28171885F * var11 + 0.6299787F * var12);
      float var19 = (float)Math.cbrt(0.41222146F * var13 + 0.53633255F * var14 + 0.051445995F * var15);
      float var20 = (float)Math.cbrt(0.2119035F * var13 + 0.6806995F * var14 + 0.10739696F * var15);
      float var21 = (float)Math.cbrt(0.08830246F * var13 + 0.28171885F * var14 + 0.6299787F * var15);
      float var22 = var16 + (var19 - var16) * var9;
      float var23 = var17 + (var20 - var17) * var9;
      float var24 = var18 + (var21 - var18) * var9;
      float var25 = var22 * var22 * var22;
      float var26 = var23 * var23 * var23;
      float var27 = var24 * var24 * var24;
      float var28 = 4.0767417F * var25 - 3.3077116F * var26 + 0.23096994F * var27;
      float var29 = -1.268438F * var25 + 2.6097574F * var26 - 0.34131938F * var27;
      float var30 = -0.0041960864F * var25 - 0.7034186F * var26 + 1.7076147F * var27;
      fs[i] = O000000000(var28);
      fs[i + 1] = O000000000(var29);
      fs[i + 2] = O000000000(var30);
   }

   private static float O00000000(float f) {
      return f <= 0.04045F ? f / 12.92F : (float)Math.pow((f + 0.055F) / 1.055F, 2.4);
   }

   private static float O000000000(float f) {
      f = O00000000(f, 0.0F, 1.0F);
      return f <= 0.0031308F ? f * 12.92F : (float)(1.055 * Math.pow(f, 0.4166666666666667) - 0.055);
   }

   private int O0000000000O00() {
      if (this.O000000000O.O000000000("Сумерки")) {
         return 1;
      } else {
         return this.O000000000O.O000000000("Тема") ? 2 : 0;
      }
   }

   private float O00000000(int i) {
      if (i == 1) {
         return -0.045F;
      } else {
         return i == 2 ? 0.13F : 0.11F;
      }
   }

   private int O000000000(int i) {
      if (i == 1) {
         return 13203624;
      } else if (i == 2) {
         try {
            if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null) {
               Theme var2 = WildClient.O00000000.O0000000000O.O000000000();
               if (var2 == Theme.CUSTOM && WildClient.O00000000.O0000000000O.O000000000 != null) {
                  return WildClient.O00000000.O0000000000O.O000000000.O00000000000O() & 16777215;
               }

               if (var2 != null && var2.O00000000() != null) {
                  return var2.O00000000().getRGB() & 16777215;
               }
            }
         } catch (Throwable var3) {
         }

         return 8230143;
      } else {
         return this.O000000000OO.O00000000000O() & 16777215;
      }
   }

   private boolean O00000000(int i, int j, int k) {
      if (i > 0 && this.O0000000O000 != 0) {
         if (this.O0000000O000O == 0) {
            this.O0000000O000O = GL30.glGenFramebuffers();
         }

         GL11.glDisable(3089);
         GL11.glDisable(3042);
         GL11.glDisable(2884);
         GL11.glDisable(2929);
         GL11.glDisable(36281);
         GL30.glBindFramebuffer(36008, this.O0000000O000O);
         GL30.glFramebufferTexture2D(36008, 36064, 3553, i, 0);
         if (GL30.glCheckFramebufferStatus(36008) != 36053) {
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            return false;
         } else {
            GL30.glBindFramebuffer(36009, this.O0000000O000);
            GL11.glReadBuffer(36064);
            GL11.glDrawBuffer(36064);
            GL30.glBlitFramebuffer(0, 0, j, k, 0, 0, j, k, 16384, 9728);
            GL30.glBindFramebuffer(36008, this.O0000000O000O);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean O000000000(int i, int j) {
      if (i > 0 && j > 0) {
         if (this.O0000000O0000 != 0 && (this.O0000000O00000 != i || this.O0000000O0000O != j || this.O0000000O000 == 0)) {
            this.O0000000000O0O();
         }

         if (this.O0000000O0000 == 0) {
            this.O0000000O0000 = GL11.glGenTextures();
            GL11.glBindTexture(3553, this.O0000000O0000);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            O0000O00O0OOOO.O00000000(32856, i, j, 6408, 5121);
            this.O0000000O000 = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36160, this.O0000000O000);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, this.O0000000O0000, 0);
            GL11.glDrawBuffer(36064);
            if (GL30.glCheckFramebufferStatus(36160) != 36053) {
               this.O0000000000O0O();
               return false;
            }
         }

         this.O0000000O00000 = i;
         this.O0000000O0000O = j;
         return true;
      } else {
         return false;
      }
   }

   private void O0000000000O0O() {
      if (this.O0000000O000 != 0) {
         GL30.glDeleteFramebuffers(this.O0000000O000);
         this.O0000000O000 = 0;
      }

      if (this.O0000000O0000 != 0) {
         GL11.glDeleteTextures(this.O0000000O0000);
         this.O0000000O0000 = 0;
      }

      this.O0000000O00000 = 0;
      this.O0000000O0000O = 0;
   }

   private void O0000000000OO() {
      if (!this.O0000000O00O0) {
         this.O00000000O0O = O0000O00OO0.O00000000("assets/wild/shaders/world/world_volume.vert", "assets/wild/shaders/dawnfog/world_fog_fresnel.frag");
         this.O0000000O000OO = GL30.glGenVertexArrays();
         this.O0000000O00O = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.O0000000O000OO);
         GL15.glBindBuffer(34962, this.O0000000O00O);
         float[] var1 = new float[]{
            -1.0F,
            -1.0F,
            0.0F,
            0.0F,
            1.0F,
            -1.0F,
            1.0F,
            0.0F,
            1.0F,
            1.0F,
            1.0F,
            1.0F,
            -1.0F,
            -1.0F,
            0.0F,
            0.0F,
            1.0F,
            1.0F,
            1.0F,
            1.0F,
            -1.0F,
            1.0F,
            0.0F,
            1.0F
         };
         GL15.glBufferData(34962, var1, 35044);
         byte var2 = 16;
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, var2, 0L);
         GL20.glEnableVertexAttribArray(1);
         GL20.glVertexAttribPointer(1, 2, 5126, false, var2, 8L);
         GL15.glBindBuffer(34962, 0);
         GL30.glBindVertexArray(0);
         if (this.O0000000O000O0 == 0) {
            this.O0000000O000O0 = GL30.glGenFramebuffers();
         }

         this.O00000000O0O0 = this.O00000000O0O.O00000000("u_ScreenTexture");
         this.O00000000O0O00 = this.O00000000O0O.O00000000("u_DepthTexture");
         this.O00000000O0O0O = this.O00000000O0O.O00000000("u_Resolution");
         this.O00000000O0OO = this.O00000000O0O.O00000000("u_Time");
         this.O00000000O0OO0 = this.O00000000O0O.O00000000("u_CameraPos");
         this.O00000000O0OOO = this.O00000000O0O.O00000000("u_InverseProjectionMatrix");
         this.O00000000OO = this.O00000000O0O.O00000000("u_InverseViewMatrix");
         this.O00000000OO0 = this.O00000000O0O.O00000000("u_SunDirection");
         this.O00000000OO00 = this.O00000000O0O.O00000000("u_SunScreen");
         this.O00000000OO000 = this.O00000000O0O.O00000000("u_FogDensity");
         this.O00000000OO00O = this.O00000000O0O.O00000000("u_FogMinHeight");
         this.O00000000OO0O = this.O00000000O0O.O00000000("u_FogMaxHeight");
         this.O00000000OO0O0 = this.O00000000O0O.O00000000("u_ViewDistance");
         this.O00000000OO0OO = this.O00000000O0O.O00000000("u_PaletteZenith");
         this.O00000000OOO = this.O00000000O0O.O00000000("u_PaletteHorizonWarm");
         this.O00000000OOO0 = this.O00000000O0O.O00000000("u_PaletteHorizonCool");
         this.O00000000OOO00 = this.O00000000O0O.O00000000("u_PaletteFogWarm");
         this.O00000000OOO0O = this.O00000000O0O.O00000000("u_PaletteFogCool");
         this.O00000000OOOO = this.O00000000O0O.O00000000("u_PaletteRay");
         this.O00000000OOOO0 = this.O00000000O0O.O00000000("u_Rainbow");
         this.O00000000OOOOO = this.O00000000O0O.O00000000("u_RainbowDir");
         this.O0000000O = this.O00000000O0O.O00000000("u_RainbowSize");
         this.O0000000O0 = this.O00000000O0O.O00000000("u_GodRays");
         this.O0000000O00 = this.O00000000O0O.O00000000("u_Softness");
         this.O0000000O00O0 = true;
      }
   }

   private void O0000000000OO0() {
      if (RenderSystem.isOnRenderThread()) {
         this.O0000000000O0O();
         if (this.O0000000O000O != 0) {
            GL30.glDeleteFramebuffers(this.O0000000O000O);
            this.O0000000O000O = 0;
         }

         if (this.O0000000O000O0 != 0) {
            GL30.glDeleteFramebuffers(this.O0000000O000O0);
            this.O0000000O000O0 = 0;
         }

         if (this.O0000000O000OO != 0) {
            GL30.glDeleteVertexArrays(this.O0000000O000OO);
            this.O0000000O000OO = 0;
         }

         if (this.O0000000O00O != 0) {
            GL15.glDeleteBuffers(this.O0000000O00O);
            this.O0000000O00O = 0;
         }

         if (this.O00000000O0O != null) {
            this.O00000000O0O.O000000000();
            this.O00000000O0O = null;
         }

         this.O0000000O00O0 = false;
         this.O0000000O00O00 = false;
      }
   }

   private void O00000000(int i, Matrix4f matrix4f) {
      this.O00000000O00OO.clear();
      matrix4f.get(this.O00000000O00OO);
      GL20.glUniformMatrix4fv(i, false, this.O00000000O00OO);
   }

   private static int O00000000(Object object) {
      return object instanceof GlTexture var1 ? var1.getGlId() : 0;
   }

   private static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }
}
