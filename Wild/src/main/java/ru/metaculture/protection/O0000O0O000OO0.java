package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.Window;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;

public final class O0000O0O000OO0 implements AutoCloseable {
   private static final O0000O0O000OO0 O00000000 = new O0000O0O000OO0();
   private static final String O000000000 = "assets/wild/shaders/world/world_volume.vert";
   private static final String O0000000000 = "assets/wild/shaders/postfx/motion_blur.frag";
   private static final float O00000000000 = 1.0E-5F;
   private final O0000O0O000OO0.W397 O000000000000 = new O0000O0O000OO0.W397();
   private final Matrix4f O0000000000000 = new Matrix4f();
   private final Matrix4f O000000000000O = new Matrix4f();
   private Vec3d O00000000000O = Vec3d.ZERO;
   private float O00000000000O0;
   private float O00000000000OO;
   private O0000O0O000OO0.W396 O0000000000O;
   private int O0000000000O0;
   private int O0000000000O00;
   private int O0000000000O0O;
   private int O0000000000OO;
   private boolean O0000000000OO0;
   private boolean O0000000000OOO;
   private boolean O000000000O;

   private O0000O0O000OO0() {
   }

   public static O0000O0O000OO0 O00000000() {
      return O00000000;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(MinecraftClient minecraftClient, Camera camera, Matrix4f matrix4f, Matrix4f matrix4f2, O0000O0O000OO0.W395 o000000000) {
      if (!this.O0000000000OOO && minecraftClient != null && camera != null && matrix4f != null && matrix4f2 != null && o000000000 != null) {
         if (minecraftClient.world != null && minecraftClient.player != null && O00000000(minecraftClient)) {
            Window var6 = minecraftClient.getWindow();
            int var7 = var6.getFramebufferWidth();
            int var8 = var6.getFramebufferHeight();
            if (var7 > 1 && var8 > 1 && !(o000000000.O00000000 <= 1.0E-5F)) {
               Framebuffer var9 = minecraftClient.getFramebuffer();
               if (var9 == null) {
                  this.O000000000();
               } else {
                  int var10 = O00000000(var9.getColorAttachment());
                  int var11 = O00000000(var9.getDepthAttachment());
                  if (var10 > 0 && var11 > 0) {
                     float var12 = this.O00000000(camera);
                     float var13 = this.O000000000O ? O00000000(O00000000(camera.getYaw() - this.O00000000000O0) * 0.0062F, -0.24F, 0.24F) : 0.0F;
                     float var14 = this.O000000000O ? O00000000((camera.getPitch() - this.O00000000000OO) * -0.0074F, -0.24F, 0.24F) : 0.0F;
                     if (this.O000000000O && !(var12 < o000000000.O00000000000O0 * 4.0E-5F)) {
                        O0000O00O0OOO0.W373 var15 = O0000O00O0OOO0.O00000000();
                        boolean var16 = false;
                        boolean var24 = false /* VF: Semaphore variable */;

                        label228: {
                           label216: {
                              label229: {
                                 try {
                                    var24 = true;
                                    this.O0000000000();
                                    if (!this.O0000000000OOO && this.O00000000(this.O000000000000, var7, var8)) {
                                       if (!this.O00000000(var10, var7, var8, this.O000000000000)) {
                                          this.O00000000(camera, matrix4f, matrix4f2);
                                          var24 = false;
                                          break label228;
                                       }

                                       Matrix4f var17 = new Matrix4f(matrix4f2).invert();
                                       Matrix4f var18 = new Matrix4f(matrix4f).invert();
                                       Vec3d var19 = camera.getPos();
                                       var18.m30((float)var19.x);
                                       var18.m31((float)var19.y);
                                       var18.m32((float)var19.z);
                                       O0000O0O000OO0.W394 var20 = new O0000O0O000OO0.W394(
                                          var7, var8, this.O000000000000.O000000000, var11, var19, var17, var18, o000000000, var12, var13, var14
                                       );
                                       var16 = this.O00000000(var10, var20);
                                       this.O00000000(camera, matrix4f, matrix4f2);
                                       var24 = false;
                                       break label216;
                                    }

                                    this.O00000000(camera, matrix4f, matrix4f2);
                                    var24 = false;
                                    break label229;
                                 } catch (Throwable var25) {
                                    this.O0000000000OOO = true;
                                    System.err.println("[SilkFlow] renderer disabled: " + var25.getMessage());
                                    var25.printStackTrace();
                                    var24 = false;
                                 } finally {
                                    if (var24) {
                                       if (var16 && this.O0000000000O00 != 0) {
                                          GL30.glBindFramebuffer(36160, this.O0000000000O00);
                                          GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                       }

                                       GL13.glActiveTexture(33985);
                                       GL11.glBindTexture(3553, 0);
                                       GL13.glActiveTexture(33984);
                                       GL11.glBindTexture(3553, 0);
                                       GL20.glUseProgram(0);
                                       O0000O00O0OOO0.O00000000(var15);
                                    }
                                 }

                                 if (var16 && this.O0000000000O00 != 0) {
                                    GL30.glBindFramebuffer(36160, this.O0000000000O00);
                                    GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                 }

                                 GL13.glActiveTexture(33985);
                                 GL11.glBindTexture(3553, 0);
                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, 0);
                                 GL20.glUseProgram(0);
                                 O0000O00O0OOO0.O00000000(var15);
                                 return;
                              }

                              if (var16 && this.O0000000000O00 != 0) {
                                 GL30.glBindFramebuffer(36160, this.O0000000000O00);
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                              }

                              GL13.glActiveTexture(33985);
                              GL11.glBindTexture(3553, 0);
                              GL13.glActiveTexture(33984);
                              GL11.glBindTexture(3553, 0);
                              GL20.glUseProgram(0);
                              O0000O00O0OOO0.O00000000(var15);
                              return;
                           }

                           if (var16 && this.O0000000000O00 != 0) {
                              GL30.glBindFramebuffer(36160, this.O0000000000O00);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           }

                           GL13.glActiveTexture(33985);
                           GL11.glBindTexture(3553, 0);
                           GL13.glActiveTexture(33984);
                           GL11.glBindTexture(3553, 0);
                           GL20.glUseProgram(0);
                           O0000O00O0OOO0.O00000000(var15);
                           return;
                        }

                        if (var16 && this.O0000000000O00 != 0) {
                           GL30.glBindFramebuffer(36160, this.O0000000000O00);
                           GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                        }

                        GL13.glActiveTexture(33985);
                        GL11.glBindTexture(3553, 0);
                        GL13.glActiveTexture(33984);
                        GL11.glBindTexture(3553, 0);
                        GL20.glUseProgram(0);
                        O0000O00O0OOO0.O00000000(var15);
                     } else {
                        this.O00000000(camera, matrix4f, matrix4f2);
                     }
                  } else {
                     this.O00000000(camera, matrix4f, matrix4f2);
                  }
               }
            } else {
               this.O00000000(camera, matrix4f, matrix4f2);
            }
         } else {
            this.O000000000();
         }
      }
   }

   public void O00000000(int i, int j) {
      this.O000000000();
      if (i > 0 && j > 0) {
         if (this.O000000000000.O0000000000 > 0 && (this.O000000000000.O0000000000 != i || this.O000000000000.O00000000000 != j)) {
            this.O00000000(this.O000000000000);
         }
      } else {
         this.O00000000(this.O000000000000);
      }
   }

   public void O000000000() {
      this.O000000000O = false;
      this.O00000000000O = Vec3d.ZERO;
      this.O00000000000O0 = 0.0F;
      this.O00000000000OO = 0.0F;
      this.O0000000000000.identity();
      this.O000000000000O.identity();
   }

   private boolean O00000000(int i, O0000O0O000OO0.W394 o00000000) {
      if (this.O0000000000O00 == 0) {
         this.O0000000000O00 = GL30.glGenFramebuffers();
      }

      GL30.glBindFramebuffer(36160, this.O0000000000O00);
      GL30.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
      GL11.glDrawBuffer(36064);
      if (GL30.glCheckFramebufferStatus(36160) != 36053) {
         return true;
      } else {
         GL11.glViewport(0, 0, o00000000.O00000000, o00000000.O000000000);
         GL11.glDisable(3089);
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         GL11.glDisable(3042);
         GL11.glDisable(36281);
         GL11.glColorMask(true, true, true, true);
         GL11.glDepthMask(false);
         this.O0000000000O.O00000000.O00000000();
         this.O00000000(o00000000);
         GL30.glBindVertexArray(this.O0000000000O0O);
         O0000O00OO0O.O00000000().O00000000(2);
         GL11.glDrawArrays(4, 0, 6);
         GL30.glBindVertexArray(0);
         return true;
      }
   }

   private void O00000000(O0000O0O000OO0.W394 o00000000) {
      O000000000(this.O0000000000O.O000000000, 0);
      O000000000(this.O0000000000O.O0000000000, 1);
      O00000000(this.O0000000000O.O00000000000, (float)o00000000.O00000000, (float)o00000000.O000000000);
      O00000000(this.O0000000000O.O000000000000, o00000000.O0000000000000);
      O00000000(this.O0000000000O.O0000000000000, o00000000.O000000000000O);
      O00000000(this.O0000000000O.O000000000000O, this.O000000000000O);
      O00000000(this.O0000000000O.O00000000000O, this.O0000000000000);
      O00000000(this.O0000000000O.O00000000000O0, (float)o00000000.O000000000000.x, (float)o00000000.O000000000000.y, (float)o00000000.O000000000000.z);
      O00000000(this.O0000000000O.O00000000000OO, (float)this.O00000000000O.x, (float)this.O00000000000O.y, (float)this.O00000000000O.z);
      O00000000(this.O0000000000O.O0000000000O, O00000000(o00000000.O00000000000O.O00000000, 0.0F, 1.0F));
      O00000000(this.O0000000000O.O0000000000O0, O00000000(o00000000.O00000000000O.O000000000, 0.05F, 4.0F));
      O00000000(this.O0000000000O.O0000000000O00, O00000000(o00000000.O00000000000O.O00000000000, 1.0F, 128.0F));
      O00000000(this.O0000000000O.O0000000000O0O, O00000000(o00000000.O00000000000O.O000000000000, 0.02F, 4.0F));
      O00000000(this.O0000000000O.O0000000000OO, O00000000(o00000000.O00000000000O.O0000000000000, 0.0F, 3.0F));
      O00000000(this.O0000000000O.O0000000000OO0, O00000000(o00000000.O00000000000O.O000000000000O, 0.0F, 1.0F));
      O00000000(this.O0000000000O.O0000000000OOO, O00000000(o00000000.O00000000000O.O00000000000O, 0.2F, 8.0F));
      O00000000(this.O0000000000O.O000000000O, O00000000(o00000000.O00000000000O.O00000000000O0, 0.01F, 4.0F));
      O00000000(this.O0000000000O.O000000000O0, o00000000.O00000000000O0);
      O00000000(this.O0000000000O.O000000000O00, o00000000.O00000000000OO, o00000000.O0000000000O);
      O000000000(this.O0000000000O.O000000000O000, Math.max(3, Math.min(12, o00000000.O00000000000O.O0000000000)));
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, o00000000.O0000000000);
      GL13.glActiveTexture(33985);
      GL11.glBindTexture(3553, o00000000.O00000000000);
      GL13.glActiveTexture(33984);
   }

   private boolean O00000000(int i, int j, int k, O0000O0O000OO0.W397 o00000000000) {
      if (i > 0 && o00000000000 != null && o00000000000.O00000000 > 0 && j > 0 && k > 0) {
         if (this.O0000000000O0 == 0) {
            this.O0000000000O0 = GL30.glGenFramebuffers();
         }

         GL30.glBindFramebuffer(36008, this.O0000000000O0);
         GL30.glFramebufferTexture2D(36008, 36064, 3553, i, 0);
         if (GL30.glCheckFramebufferStatus(36008) != 36053) {
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            return false;
         } else {
            GL30.glBindFramebuffer(36009, o00000000000.O00000000);
            GL11.glReadBuffer(36064);
            GL11.glDrawBuffer(36064);
            GL30.glBlitFramebuffer(0, 0, j, k, 0, 0, j, k, 16384, 9728);
            GL30.glBindFramebuffer(36008, this.O0000000000O0);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean O00000000(O0000O0O000OO0.W397 o00000000000, int i, int j) {
      if (o00000000000 != null && i > 0 && j > 0) {
         if (o00000000000.O000000000 != 0 && (o00000000000.O0000000000 != i || o00000000000.O00000000000 != j || o00000000000.O00000000 == 0)) {
            this.O00000000(o00000000000);
         }

         if (o00000000000.O000000000 == 0) {
            o00000000000.O000000000 = GL11.glGenTextures();
            GL11.glBindTexture(3553, o00000000000.O000000000);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            O0000O00O0OOOO.O00000000(32856, i, j, 6408, 5121);
            o00000000000.O00000000 = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36160, o00000000000.O00000000);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, o00000000000.O000000000, 0);
            GL11.glDrawBuffer(36064);
            if (GL30.glCheckFramebufferStatus(36160) != 36053) {
               this.O00000000(o00000000000);
               return false;
            }
         }

         o00000000000.O0000000000 = i;
         o00000000000.O00000000000 = j;
         return true;
      } else {
         return false;
      }
   }

   private void O0000000000() {
      if (!this.O0000000000OO0) {
         this.O0000000000O0O = GL30.glGenVertexArrays();
         this.O0000000000OO = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.O0000000000O0O);
         GL15.glBindBuffer(34962, this.O0000000000OO);
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
         this.O0000000000O = new O0000O0O000OO0.W396();
         this.O0000000000OO0 = true;
      }
   }

   private float O00000000(Camera camera) {
      if (this.O000000000O && camera != null) {
         Vec3d var2 = camera.getPos();
         float var3 = O00000000(camera.getYaw() - this.O00000000000O0);
         float var4 = camera.getPitch() - this.O00000000000OO;
         double var5 = var2.distanceTo(this.O00000000000O);
         float var7 = Math.abs(var3) * 0.00175F + Math.abs(var4) * 0.00225F;
         float var8 = (float)Math.min(0.12, var5 * 0.045);
         return var7 + var8;
      } else {
         return 1.0F;
      }
   }

   private void O00000000(Camera camera, Matrix4f matrix4f, Matrix4f matrix4f2) {
      if (camera != null && matrix4f != null && matrix4f2 != null) {
         this.O0000000000000.set(matrix4f);
         this.O000000000000O.set(matrix4f2);
         this.O00000000000O = camera.getPos();
         this.O00000000000O0 = camera.getYaw();
         this.O00000000000OO = camera.getPitch();
         this.O000000000O = true;
      } else {
         this.O000000000();
      }
   }

   private static int O00000000(Object object) {
      return object instanceof GlTexture var1 ? var1.getGlId() : 0;
   }

   private static boolean O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         Window var1 = minecraftClient.getWindow();
         return !var1.hasZeroWidthOrHeight() && var1.getFramebufferWidth() > 0 && var1.getFramebufferHeight() > 0;
      } else {
         return false;
      }
   }

   private static boolean O00000000000() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private static float O00000000(float f) {
      f %= 360.0F;
      if (f >= 180.0F) {
         f -= 360.0F;
      }

      if (f < -180.0F) {
         f += 360.0F;
      }

      return f;
   }

   private static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }

   private static void O000000000(int i, int j) {
      if (i >= 0) {
         GL20.glUniform1i(i, j);
      }
   }

   private static void O00000000(int i, float f) {
      if (i >= 0) {
         GL20.glUniform1f(i, f);
      }
   }

   private static void O00000000(int i, float f, float g) {
      if (i >= 0) {
         GL20.glUniform2f(i, f, g);
      }
   }

   private static void O00000000(int i, float f, float g, float h) {
      if (i >= 0) {
         GL20.glUniform3f(i, f, g, h);
      }
   }

   private static void O00000000(int i, Matrix4f matrix4f) {
      if (i >= 0 && matrix4f != null) {
         MemoryStack var2 = MemoryStack.stackPush();

         try {
            FloatBuffer var3 = var2.mallocFloat(16);
            matrix4f.get(var3);
            GL20.glUniformMatrix4fv(i, false, var3);
         } catch (Throwable var6) {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var5) {
                  var6.addSuppressed(var5);
               }
            }

            throw var6;
         }

         if (var2 != null) {
            var2.close();
         }
      }
   }

   private void O00000000(O0000O0O000OO0.W397 o00000000000) {
      if (o00000000000 != null) {
         if (o00000000000.O00000000 != 0 && O00000000000()) {
            GL30.glDeleteFramebuffers(o00000000000.O00000000);
         }

         if (o00000000000.O000000000 != 0 && O00000000000()) {
            GL11.glDeleteTextures(o00000000000.O000000000);
         }

         o00000000000.O00000000 = 0;
         o00000000000.O000000000 = 0;
         o00000000000.O0000000000 = 0;
         o00000000000.O00000000000 = 0;
      }
   }

   @Override
   public void close() {
      this.O000000000();
      if (!O00000000000()) {
         this.O000000000000();
      } else {
         this.O00000000(this.O000000000000);
         if (this.O0000000000O0 != 0) {
            GL30.glDeleteFramebuffers(this.O0000000000O0);
            this.O0000000000O0 = 0;
         }

         if (this.O0000000000O00 != 0) {
            GL30.glDeleteFramebuffers(this.O0000000000O00);
            this.O0000000000O00 = 0;
         }

         if (this.O0000000000O0O != 0) {
            GL30.glDeleteVertexArrays(this.O0000000000O0O);
            this.O0000000000O0O = 0;
         }

         if (this.O0000000000OO != 0) {
            GL15.glDeleteBuffers(this.O0000000000OO);
            this.O0000000000OO = 0;
         }

         if (this.O0000000000O != null) {
            this.O0000000000O.O00000000.O000000000();
            this.O0000000000O = null;
         }

         this.O0000000000OO0 = false;
         this.O0000000000OOO = false;
      }
   }

   private void O000000000000() {
      this.O000000000000.O00000000 = 0;
      this.O000000000000.O000000000 = 0;
      this.O000000000000.O0000000000 = 0;
      this.O000000000000.O00000000000 = 0;
      this.O0000000000O0 = 0;
      this.O0000000000O00 = 0;
      this.O0000000000O0O = 0;
      this.O0000000000OO = 0;
      this.O0000000000O = null;
      this.O0000000000OO0 = false;
      this.O0000000000OOO = false;
   }

   static final class W394 {
      final int O00000000;
      final int O000000000;
      final int O0000000000;
      final int O00000000000;
      final Vec3d O000000000000;
      final Matrix4f O0000000000000;
      final Matrix4f O000000000000O;
      final O0000O0O000OO0.W395 O00000000000O;
      final float O00000000000O0;
      final float O00000000000OO;
      final float O0000000000O;

      W394(int i, int j, int k, int l, Vec3d vec3d, Matrix4f matrix4f, Matrix4f matrix4f2, O0000O0O000OO0.W395 o000000000, float f, float g, float h) {
         this.O00000000 = i;
         this.O000000000 = j;
         this.O0000000000 = k;
         this.O00000000000 = l;
         this.O000000000000 = vec3d;
         this.O0000000000000 = matrix4f;
         this.O000000000000O = matrix4f2;
         this.O00000000000O = o000000000;
         this.O00000000000O0 = f;
         this.O00000000000OO = g;
         this.O0000000000O = h;
      }
   }

   public static final class W395 {
      public float O00000000 = 0.72F;
      public float O000000000 = 1.05F;
      public int O0000000000 = 7;
      public float O00000000000 = 34.0F;
      public float O000000000000 = 0.54F;
      public float O0000000000000 = 0.58F;
      public float O000000000000O = 0.72F;
      public float O00000000000O = 2.25F;
      public float O00000000000O0 = 0.42F;
   }

   static final class W396 {
      final O0000O00OO0 O00000000 = O0000O00OO0.O00000000("assets/wild/shaders/world/world_volume.vert", "assets/wild/shaders/postfx/motion_blur.frag");
      final int O000000000 = this.O00000000.O00000000("u_ScreenTexture");
      final int O0000000000 = this.O00000000.O00000000("u_DepthTexture");
      final int O00000000000 = this.O00000000.O00000000("u_Resolution");
      final int O000000000000 = this.O00000000.O00000000("u_InverseProjectionMatrix");
      final int O0000000000000 = this.O00000000.O00000000("u_InverseViewMatrix");
      final int O000000000000O = this.O00000000.O00000000("u_PreviousProjectionMatrix");
      final int O00000000000O = this.O00000000.O00000000("u_PreviousViewMatrix");
      final int O00000000000O0 = this.O00000000.O00000000("u_CameraPos");
      final int O00000000000OO = this.O00000000.O00000000("u_PreviousCameraPos");
      final int O0000000000O = this.O00000000.O00000000("u_Strength");
      final int O0000000000O0 = this.O00000000.O00000000("u_TemporalScale");
      final int O0000000000O00 = this.O00000000.O00000000("u_MaxRadius");
      final int O0000000000O0O = this.O00000000.O00000000("u_EdgeFocus");
      final int O0000000000OO = this.O00000000.O00000000("u_ChromaticPhase");
      final int O0000000000OO0 = this.O00000000.O00000000("u_DepthGuard");
      final int O0000000000OOO = this.O00000000.O00000000("u_Decay");
      final int O000000000O = this.O00000000.O00000000("u_Activation");
      final int O000000000O0 = this.O00000000.O00000000("u_GlobalMotion");
      final int O000000000O00 = this.O00000000.O00000000("u_CameraVelocity");
      final int O000000000O000 = this.O00000000.O00000000("u_Samples");
   }

   static final class W397 {
      int O00000000;
      int O000000000;
      int O0000000000;
      int O00000000000;
   }
}
