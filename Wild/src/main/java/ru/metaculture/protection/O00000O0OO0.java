package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.Window;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O00000O0OO0 {
   public static final int O00000000 = 12;
   private static final String O000000000 = "assets/wild/shaders/world/plasma_pinch.vsh";
   private static final String O0000000000 = "assets/wild/shaders/world/plasma_pinch.frag";
   private static final O00000O0OO0 O00000000000 = new O00000O0OO0();
   private O0000O00OO0 O000000000000;
   private int O0000000000000 = -1;
   private int O000000000000O = -1;
   private int O00000000000O = -1;
   private int O00000000000O0 = -1;
   private int O00000000000OO = -1;
   private int O0000000000O = -1;
   private int O0000000000O0 = -1;
   private int O0000000000O00 = -1;
   private int O0000000000O0O = -1;
   private int O0000000000OO = -1;
   private int O0000000000OO0 = -1;
   private int O0000000000OOO;
   private int O000000000O;
   private int O000000000O0;
   private final FloatBuffer O000000000O00 = BufferUtils.createFloatBuffer(16);
   private final FloatBuffer O000000000O000 = BufferUtils.createFloatBuffer(16);
   private final FloatBuffer O000000000O00O = BufferUtils.createFloatBuffer(36);
   private final FloatBuffer O000000000O0O = BufferUtils.createFloatBuffer(12);
   private final FloatBuffer O000000000O0O0 = BufferUtils.createFloatBuffer(48);
   private final FloatBuffer O000000000O0OO = BufferUtils.createFloatBuffer(36);
   private final Matrix4f O000000000OO = new Matrix4f();
   private final Vector4f O000000000OO0 = new Vector4f();

   private O00000O0OO0() {
   }

   public static O00000O0OO0 O00000000() {
      return O00000000000;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(MinecraftClient minecraftClient, List<O00000O0OO00> list, Matrix4f matrix4f, Matrix4f matrix4f2, Vec3d vec3d, float f) {
      if (RenderSystem.isOnRenderThread()) {
         if (minecraftClient != null && list != null && !list.isEmpty() && matrix4f != null && matrix4f2 != null && vec3d != null) {
            Window var7 = minecraftClient.getWindow();
            if (var7 != null && !var7.hasZeroWidthOrHeight()) {
               int var8 = var7.getFramebufferWidth();
               int var9 = var7.getFramebufferHeight();
               if (var8 > 0 && var9 > 0) {
                  long var10 = System.currentTimeMillis();
                  this.O000000000O00O.clear();
                  this.O000000000O0O.clear();
                  this.O000000000O0O0.clear();
                  this.O000000000O0OO.clear();
                  int var12 = 0;

                  for (O00000O0OO00 var14 : list) {
                     if (var12 >= 12) {
                        break;
                     }

                     float var15 = var14.O00000000(var10);
                     if (!(var15 >= 1.0F)) {
                        this.O000000000OO0
                           .set((float)(var14.O00000000() - vec3d.x), (float)(var14.O000000000() - vec3d.y), (float)(var14.O0000000000() - vec3d.z), 1.0F);
                        matrix4f.transform(this.O000000000OO0);
                        float var16 = this.O000000000OO0.x;
                        float var17 = this.O000000000OO0.y;
                        float var18 = this.O000000000OO0.z;
                        if (!(var18 > var14.O0000000000O00() + 0.1F)) {
                           this.O000000000O00O.put(var16).put(var17).put(var18);
                           this.O000000000O0O.put(var15);
                           this.O000000000O0O0.put(var14.O00000000000O0()).put(var14.O00000000000OO()).put(var14.O0000000000O0()).put(var14.O0000000000O());
                           int var19 = var14.O0000000000O0O();
                           this.O000000000O0OO.put((var19 >> 16 & 0xFF) / 255.0F).put((var19 >> 8 & 0xFF) / 255.0F).put((var19 & 0xFF) / 255.0F);
                           var12++;
                        }
                     }
                  }

                  if (var12 != 0) {
                     this.O000000000O00O.flip();
                     this.O000000000O0O.flip();
                     this.O000000000O0O0.flip();
                     this.O000000000O0OO.flip();
                     this.O0000000000();
                     if (this.O000000000000 != null && this.O000000000O != 0) {
                        int var24 = this.O00000000(minecraftClient);
                        if (var24 > 0) {
                           int var25 = this.O000000000(minecraftClient);
                           this.O000000000O00.clear();
                           matrix4f2.get(this.O000000000O00);
                           this.O000000000OO.set(matrix4f2).invert();
                           this.O000000000O000.clear();
                           this.O000000000OO.get(this.O000000000O000);
                           O0000O00O0OOO0.W373 var26 = O0000O00O0OOO0.O00000000();
                           boolean var22 = false /* VF: Semaphore variable */;

                           label267: {
                              try {
                                 var22 = true;
                                 if (this.O0000000000OOO == 0) {
                                    this.O0000000000OOO = GL30.glGenFramebuffers();
                                 }

                                 GL30.glBindFramebuffer(36160, this.O0000000000OOO);
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, var24, 0);
                                 GL11.glDrawBuffer(36064);
                                 if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                    var22 = false;
                                    break label267;
                                 }

                                 GL11.glViewport(0, 0, var8, var9);
                                 GL11.glDisable(3089);
                                 GL11.glDisable(2884);
                                 GL11.glDisable(2929);
                                 GL11.glDisable(36281);
                                 GL11.glColorMask(true, true, true, true);
                                 GL11.glDepthMask(false);
                                 GL11.glEnable(3042);
                                 GL14.glBlendEquation(32774);
                                 GL11.glBlendFunc(1, 769);
                                 this.O000000000000.O00000000();
                                 if (this.O0000000000000 >= 0) {
                                    GL20.glUniform1i(this.O0000000000000, 0);
                                 }

                                 if (this.O000000000000O >= 0) {
                                    GL20.glUniformMatrix4fv(this.O000000000000O, false, this.O000000000O00);
                                 }

                                 if (this.O00000000000O >= 0) {
                                    GL20.glUniformMatrix4fv(this.O00000000000O, false, this.O000000000O000);
                                 }

                                 if (this.O00000000000O0 >= 0) {
                                    GL20.glUniform2f(this.O00000000000O0, var8, var9);
                                 }

                                 if (this.O00000000000OO >= 0) {
                                    GL20.glUniform1f(this.O00000000000OO, f);
                                 }

                                 if (this.O0000000000O >= 0) {
                                    GL20.glUniform1i(this.O0000000000O, var12);
                                 }

                                 if (this.O0000000000O0 >= 0) {
                                    GL20.glUniform1i(this.O0000000000O0, var25 > 0 ? 1 : 0);
                                 }

                                 if (this.O0000000000O00 >= 0) {
                                    GL20.glUniform3fv(this.O0000000000O00, this.O000000000O00O);
                                 }

                                 if (this.O0000000000O0O >= 0) {
                                    GL20.glUniform1fv(this.O0000000000O0O, this.O000000000O0O);
                                 }

                                 if (this.O0000000000OO >= 0) {
                                    GL20.glUniform4fv(this.O0000000000OO, this.O000000000O0O0);
                                 }

                                 if (this.O0000000000OO0 >= 0) {
                                    GL20.glUniform3fv(this.O0000000000OO0, this.O000000000O0OO);
                                 }

                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, var25);
                                 GL30.glBindVertexArray(this.O000000000O);
                                 GL11.glDrawArrays(4, 0, 6);
                                 GL30.glBindVertexArray(0);
                                 var22 = false;
                              } finally {
                                 if (var22) {
                                    if (this.O0000000000OOO != 0) {
                                       GL30.glBindFramebuffer(36160, this.O0000000000OOO);
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                    }

                                    GL13.glActiveTexture(33984);
                                    GL11.glBindTexture(3553, 0);
                                    GL20.glUseProgram(0);
                                    O0000O00O0OOO0.O00000000(var26);
                                 }
                              }

                              if (this.O0000000000OOO != 0) {
                                 GL30.glBindFramebuffer(36160, this.O0000000000OOO);
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                              }

                              GL13.glActiveTexture(33984);
                              GL11.glBindTexture(3553, 0);
                              GL20.glUseProgram(0);
                              O0000O00O0OOO0.O00000000(var26);
                              return;
                           }

                           if (this.O0000000000OOO != 0) {
                              GL30.glBindFramebuffer(36160, this.O0000000000OOO);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           }

                           GL13.glActiveTexture(33984);
                           GL11.glBindTexture(3553, 0);
                           GL20.glUseProgram(0);
                           O0000O00O0OOO0.O00000000(var26);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private int O00000000(MinecraftClient minecraftClient) {
      Framebuffer var2 = minecraftClient.getFramebuffer();
      if (var2 == null) {
         return 0;
      } else {
         return var2.getColorAttachment() instanceof GlTexture var4 ? var4.getGlId() : 0;
      }
   }

   private int O000000000(MinecraftClient minecraftClient) {
      Framebuffer var2 = minecraftClient.getFramebuffer();
      if (var2 == null) {
         return 0;
      } else {
         return var2.getDepthAttachment() instanceof GlTexture var4 ? var4.getGlId() : 0;
      }
   }

   private void O0000000000() {
      if (this.O000000000O == 0) {
         O0000O00O0OOO0.W373 var1 = O0000O00O0OOO0.O00000000();

         try {
            this.O000000000O = GL30.glGenVertexArrays();
            this.O000000000O0 = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O000000000O);
            GL15.glBindBuffer(34962, this.O000000000O0);
            float[] var2 = new float[]{
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
            GL15.glBufferData(34962, var2, 35044);
            byte var3 = 16;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, var3, 0L);
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, var3, 8L);
         } finally {
            O0000O00O0OOO0.O00000000(var1);
         }
      }

      if (this.O000000000000 == null) {
         try {
            this.O000000000000 = O0000O00OO0.O00000000("assets/wild/shaders/world/plasma_pinch.vsh", "assets/wild/shaders/world/plasma_pinch.frag");
            this.O0000000000000 = this.O000000000000.O00000000("u_DepthTexture");
            this.O000000000000O = this.O000000000000.O00000000("u_Proj");
            this.O00000000000O = this.O000000000000.O00000000("u_InvProj");
            this.O00000000000O0 = this.O000000000000.O00000000("u_Resolution");
            this.O00000000000OO = this.O000000000000.O00000000("u_Time");
            this.O0000000000O = this.O000000000000.O00000000("u_Count");
            this.O0000000000O0 = this.O000000000000.O00000000("u_DepthAvailable");
            this.O0000000000O00 = this.O000000000000.O00000000("u_Center[0]");
            this.O0000000000O0O = this.O000000000000.O00000000("u_LifeTime[0]");
            this.O0000000000OO = this.O000000000000.O00000000("u_Params[0]");
            this.O0000000000OO0 = this.O000000000000.O00000000("u_CoreTint[0]");
         } catch (Throwable var7) {
            this.O000000000000 = null;
         }
      }
   }

   public void O000000000() {
      if (RenderSystem.isOnRenderThread()) {
         if (this.O0000000000OOO != 0) {
            GL30.glDeleteFramebuffers(this.O0000000000OOO);
            this.O0000000000OOO = 0;
         }

         if (this.O000000000O0 != 0) {
            GL15.glDeleteBuffers(this.O000000000O0);
            this.O000000000O0 = 0;
         }

         if (this.O000000000O != 0) {
            GL30.glDeleteVertexArrays(this.O000000000O);
            this.O000000000O = 0;
         }

         if (this.O000000000000 != null) {
            this.O000000000000.O000000000();
            this.O000000000000 = null;
         }
      }
   }
}
