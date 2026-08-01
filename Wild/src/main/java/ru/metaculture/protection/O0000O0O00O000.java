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

public final class O0000O0O00O000 implements AutoCloseable {
   private static final O0000O0O00O000 O00000000 = new O0000O0O00O000();
   private static final String O000000000 = "assets/wild/shaders/world/world_volume.vert";
   private static final String O0000000000 = "assets/wild/shaders/world/world_fog_fresnel.frag";
   private static final String O00000000000 = "assets/wild/shaders/world/ambient_particles.frag";
   private static final String O000000000000 = "assets/wild/shaders/world/world_copy.frag";
   private static final float O0000000000000 = 1.0E-4F;
   private final O0000O0O00O000.W405 O000000000000O = new O0000O0O00O000.W405();
   private final O0000O0O00O000.W405 O00000000000O = new O0000O0O00O000.W405();
   private O0000O0O00O000.W404 O00000000000O0;
   private O0000O0O00O000.W404 O00000000000OO;
   private O0000O0O00O000.W404 O0000000000O;
   private int O0000000000O0;
   private int O0000000000O00;
   private int O0000000000O0O;
   private int O0000000000OO;
   private boolean O0000000000OO0;
   private boolean O0000000000OOO;

   private O0000O0O00O000() {
   }

   public static O0000O0O00O000 O00000000() {
      return O00000000;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(MinecraftClient minecraftClient, Camera camera, Matrix4f matrix4f, Matrix4f matrix4f2, O0000O0O00O000.W403 o000000000) {
      if (!this.O0000000000OOO && minecraftClient != null && camera != null && matrix4f != null && matrix4f2 != null && o000000000 != null) {
         if (minecraftClient.world != null && minecraftClient.player != null && O00000000(minecraftClient)) {
            Window var6 = minecraftClient.getWindow();
            int var7 = var6.getFramebufferWidth();
            int var8 = var6.getFramebufferHeight();
            if (var7 > 1 && var8 > 1) {
               Framebuffer var9 = minecraftClient.getFramebuffer();
               if (var9 != null) {
                  int var10 = O00000000(var9.getColorAttachment());
                  int var11 = O00000000(var9.getDepthAttachment());
                  if (var10 > 0 && var11 > 0) {
                     O0000O00O0OOO0.W373 var12 = O0000O00O0OOO0.O00000000();
                     boolean var23 = false /* VF: Semaphore variable */;

                     label188: {
                        label178: {
                           label189: {
                              try {
                                 var23 = true;
                                 this.O000000000();
                                 if (!this.O0000000000OOO) {
                                    if (this.O00000000(this.O000000000000O, var7, var8)) {
                                       if (this.O00000000(this.O00000000000O, var7, var8)) {
                                          if (!this.O00000000(var10, var7, var8, this.O000000000000O)) {
                                             var23 = false;
                                             break label188;
                                          }

                                          Vec3d var13 = camera.getPos();
                                          Matrix4f var14 = new Matrix4f(matrix4f2).invert();
                                          Matrix4f var15 = new Matrix4f(matrix4f).invert();
                                          var15.m30((float)var13.x);
                                          var15.m31((float)var13.y);
                                          var15.m32((float)var13.z);
                                          Matrix4f var16 = new Matrix4f(var15).mul(var14);
                                          O0000O0O00O000.W402 var17 = new O0000O0O00O000.W402(var7, var8, var11, var13, var14, var15, var16, o000000000);
                                          int var18 = this.O000000000000O.O000000000;
                                          int var19 = this.O00000000000O.O000000000;
                                          if (o000000000.O000000000000 > 1.0E-4F) {
                                             this.O00000000(this.O00000000000O0, var18, var19, var17);
                                             var18 = var19;
                                             var19 = this.O000000000000O.O000000000;
                                          }

                                          this.O00000000(this.O00000000000OO, var18, var19, var17);
                                          this.O00000000(this.O0000000000O, var19, var10, var17);
                                          var23 = false;
                                          break label178;
                                       }

                                       var23 = false;
                                    } else {
                                       var23 = false;
                                    }
                                 } else {
                                    var23 = false;
                                 }
                                 break label189;
                              } catch (Throwable var24) {
                                 this.O0000000000OOO = true;
                                 System.err.println("[WorldTweaks] renderer disabled: " + var24.getMessage());
                                 var24.printStackTrace();
                                 var23 = false;
                              } finally {
                                 if (var23) {
                                    if (this.O0000000000O00 != 0) {
                                       GL30.glBindFramebuffer(36160, this.O0000000000O00);
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                    }

                                    GL20.glUseProgram(0);
                                    O0000O00O0OOO0.O00000000(var12);
                                 }
                              }

                              if (this.O0000000000O00 != 0) {
                                 GL30.glBindFramebuffer(36160, this.O0000000000O00);
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                              }

                              GL20.glUseProgram(0);
                              O0000O00O0OOO0.O00000000(var12);
                              return;
                           }

                           if (this.O0000000000O00 != 0) {
                              GL30.glBindFramebuffer(36160, this.O0000000000O00);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           }

                           GL20.glUseProgram(0);
                           O0000O00O0OOO0.O00000000(var12);
                           return;
                        }

                        if (this.O0000000000O00 != 0) {
                           GL30.glBindFramebuffer(36160, this.O0000000000O00);
                           GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                        }

                        GL20.glUseProgram(0);
                        O0000O00O0OOO0.O00000000(var12);
                        return;
                     }

                     if (this.O0000000000O00 != 0) {
                        GL30.glBindFramebuffer(36160, this.O0000000000O00);
                        GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                     }

                     GL20.glUseProgram(0);
                     O0000O00O0OOO0.O00000000(var12);
                  }
               }
            }
         }
      }
   }

   public void O00000000(int i, int j) {
      if (i > 0 && j > 0) {
         if (this.O000000000000O.O0000000000 > 0 && (this.O000000000000O.O0000000000 != i || this.O000000000000O.O00000000000 != j)
            || this.O00000000000O.O0000000000 > 0 && (this.O00000000000O.O0000000000 != i || this.O00000000000O.O00000000000 != j)) {
            this.O00000000(this.O000000000000O);
            this.O00000000(this.O00000000000O);
         }
      } else {
         this.O00000000(this.O000000000000O);
         this.O00000000(this.O00000000000O);
      }
   }

   private void O00000000(O0000O0O00O000.W404 o0000000000, int i, int j, O0000O0O00O000.W402 o00000000) {
      if (o0000000000 != null && i > 0 && j > 0 && o00000000 != null) {
         if (this.O0000000000O00 == 0) {
            this.O0000000000O00 = GL30.glGenFramebuffers();
         }

         GL30.glBindFramebuffer(36160, this.O0000000000O00);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, j, 0);
         GL11.glDrawBuffer(36064);
         if (GL30.glCheckFramebufferStatus(36160) == 36053) {
            GL11.glViewport(0, 0, o00000000.O00000000, o00000000.O000000000);
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(3042);
            GL11.glDisable(36281);
            GL11.glColorMask(true, true, true, true);
            GL11.glDepthMask(false);
            o0000000000.O00000000.O00000000();
            this.O00000000(o0000000000, i, o00000000);
            GL30.glBindVertexArray(this.O0000000000O0O);
            O0000O00OO0O.O00000000().O00000000(2);
            GL11.glDrawArrays(4, 0, 6);
            GL30.glBindVertexArray(0);
         }
      }
   }

   private void O00000000(O0000O0O00O000.W404 o0000000000, int i, O0000O0O00O000.W402 o00000000) {
      if (o0000000000.O000000000 >= 0) {
         GL20.glUniform1i(o0000000000.O000000000, 0);
      }

      if (o0000000000.O0000000000 >= 0) {
         GL20.glUniform1i(o0000000000.O0000000000, 1);
      }

      if (o0000000000.O00000000000 >= 0) {
         GL20.glUniform2f(o0000000000.O00000000000, o00000000.O00000000, o00000000.O000000000);
      }

      if (o0000000000.O000000000000 >= 0) {
         GL20.glUniform1f(o0000000000.O000000000000, o00000000.O00000000000O.O0000000000OO);
      }

      if (o0000000000.O0000000000000 >= 0) {
         GL20.glUniform3f(o0000000000.O0000000000000, (float)o00000000.O00000000000.x, (float)o00000000.O00000000000.y, (float)o00000000.O00000000000.z);
      }

      if (o0000000000.O000000000000O >= 0) {
         this.O00000000(o0000000000.O000000000000O, o00000000.O000000000000);
      }

      if (o0000000000.O00000000000O >= 0) {
         this.O00000000(o0000000000.O00000000000O, o00000000.O0000000000000);
      }

      if (o0000000000.O00000000000O0 >= 0) {
         this.O00000000(o0000000000.O00000000000O0, o00000000.O000000000000O);
      }

      if (o0000000000.O00000000000OO >= 0) {
         GL20.glUniform3f(
            o0000000000.O00000000000OO, o00000000.O00000000000O.O00000000000O0, o00000000.O00000000000O.O00000000000OO, o00000000.O00000000000O.O0000000000O
         );
      }

      if (o0000000000.O0000000000O >= 0) {
         GL20.glUniform3f(
            o0000000000.O0000000000O, o00000000.O00000000000O.O0000000000O0, o00000000.O00000000000O.O0000000000O00, o00000000.O00000000000O.O0000000000O0O
         );
      }

      if (o0000000000.O0000000000O0 >= 0) {
         GL20.glUniform1f(o0000000000.O0000000000O0, O00000000(o00000000.O00000000000O.O000000000000, 0.0F, 0.1F));
      }

      if (o0000000000.O0000000000O00 >= 0) {
         GL20.glUniform1f(o0000000000.O0000000000O00, O00000000(o00000000.O00000000000O.O0000000000000, 0.0F, 1.0F));
      }

      if (o0000000000.O0000000000O0O >= 0) {
         GL20.glUniform1f(o0000000000.O0000000000O0O, O00000000(o00000000.O00000000000O.O000000000000O, 0.0F, 1.0F));
      }

      if (o0000000000.O0000000000OO >= 0) {
         GL20.glUniform1f(o0000000000.O0000000000OO, O00000000(o00000000.O00000000000O.O00000000000O, 0.0F, 1.0F));
      }

      if (o0000000000.O0000000000OO0 >= 0) {
         GL20.glUniform1f(o0000000000.O0000000000OO0, O00000000(o00000000.O00000000000O.O00000000, 0.0F, 2.0F));
      }

      if (o0000000000.O0000000000OOO >= 0) {
         GL20.glUniform3f(
            o0000000000.O0000000000OOO, o00000000.O00000000000O.O000000000, o00000000.O00000000000O.O0000000000, o00000000.O00000000000O.O00000000000
         );
      }

      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, i);
      GL13.glActiveTexture(33985);
      GL11.glBindTexture(3553, o00000000.O0000000000);
      GL13.glActiveTexture(33984);
   }

   private void O00000000(int i, Matrix4f matrix4f) {
      MemoryStack var3 = MemoryStack.stackPush();

      try {
         FloatBuffer var4 = var3.mallocFloat(16);
         matrix4f.get(var4);
         GL20.glUniformMatrix4fv(i, false, var4);
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }
   }

   private boolean O00000000(int i, int j, int k, O0000O0O00O000.W405 o00000000000) {
      if (i > 0 && o00000000000 != null && o00000000000.O00000000 > 0 && j > 0 && k > 0) {
         if (this.O0000000000O0 == 0) {
            this.O0000000000O0 = GL30.glGenFramebuffers();
         }

         GL30.glBindFramebuffer(36008, this.O0000000000O0);
         GL30.glFramebufferTexture2D(36008, 36064, 3553, i, 0);
         if (GL30.glCheckFramebufferStatus(36008) != 36053) {
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

   private boolean O00000000(O0000O0O00O000.W405 o00000000000, int i, int j) {
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

   private void O000000000() {
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
         this.O00000000000O0 = new O0000O0O00O000.W404("assets/wild/shaders/world/world_fog_fresnel.frag");
         this.O00000000000OO = new O0000O0O00O000.W404("assets/wild/shaders/world/ambient_particles.frag");
         this.O0000000000O = new O0000O0O00O000.W404("assets/wild/shaders/world/world_copy.frag");
         this.O0000000000OO0 = true;
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

   private static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }

   private static boolean O0000000000() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private void O00000000(O0000O0O00O000.W405 o00000000000) {
      if (o00000000000 != null) {
         if (o00000000000.O00000000 != 0 && O0000000000()) {
            GL30.glDeleteFramebuffers(o00000000000.O00000000);
         }

         if (o00000000000.O000000000 != 0 && O0000000000()) {
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
      if (!O0000000000()) {
         this.O00000000000();
      } else {
         this.O00000000(this.O000000000000O);
         this.O00000000(this.O00000000000O);
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

         O00000000(this.O00000000000O0);
         O00000000(this.O00000000000OO);
         O00000000(this.O0000000000O);
         this.O00000000000O0 = null;
         this.O00000000000OO = null;
         this.O0000000000O = null;
         this.O0000000000OO0 = false;
         this.O0000000000OOO = false;
      }
   }

   private void O00000000000() {
      this.O000000000000O.O00000000 = 0;
      this.O000000000000O.O000000000 = 0;
      this.O000000000000O.O0000000000 = 0;
      this.O000000000000O.O00000000000 = 0;
      this.O00000000000O.O00000000 = 0;
      this.O00000000000O.O000000000 = 0;
      this.O00000000000O.O0000000000 = 0;
      this.O00000000000O.O00000000000 = 0;
      this.O0000000000O0 = 0;
      this.O0000000000O00 = 0;
      this.O0000000000O0O = 0;
      this.O0000000000OO = 0;
      this.O00000000000O0 = null;
      this.O00000000000OO = null;
      this.O0000000000O = null;
      this.O0000000000OO0 = false;
      this.O0000000000OOO = false;
   }

   private static void O00000000(O0000O0O00O000.W404 o0000000000) {
      if (o0000000000 != null) {
         o0000000000.O00000000.O000000000();
      }
   }

   static final class W402 {
      final int O00000000;
      final int O000000000;
      final int O0000000000;
      final Vec3d O00000000000;
      final Matrix4f O000000000000;
      final Matrix4f O0000000000000;
      final Matrix4f O000000000000O;
      final O0000O0O00O000.W403 O00000000000O;

      W402(int i, int j, int k, Vec3d vec3d, Matrix4f matrix4f, Matrix4f matrix4f2, Matrix4f matrix4f3, O0000O0O00O000.W403 o000000000) {
         this.O00000000 = i;
         this.O000000000 = j;
         this.O0000000000 = k;
         this.O00000000000 = vec3d;
         this.O000000000000 = matrix4f;
         this.O0000000000000 = matrix4f2;
         this.O000000000000O = matrix4f3;
         this.O00000000000O = o000000000;
      }
   }

   public static final class W403 {
      public float O00000000;
      public float O000000000 = 0.819F;
      public float O0000000000;
      public float O00000000000 = 0.574F;
      public float O000000000000;
      public float O0000000000000 = 0.82F;
      public float O000000000000O = 0.64F;
      public float O00000000000O = 0.72F;
      public float O00000000000O0 = 0.416F;
      public float O00000000000OO = 0.482F;
      public float O0000000000O = 0.584F;
      public float O0000000000O0 = 0.5F;
      public float O0000000000O00 = 0.62F;
      public float O0000000000O0O = 0.78F;
      public float O0000000000OO;
   }

   static final class W404 {
      final O0000O00OO0 O00000000;
      final int O000000000;
      final int O0000000000;
      final int O00000000000;
      final int O000000000000;
      final int O0000000000000;
      final int O000000000000O;
      final int O00000000000O;
      final int O00000000000O0;
      final int O00000000000OO;
      final int O0000000000O;
      final int O0000000000O0;
      final int O0000000000O00;
      final int O0000000000O0O;
      final int O0000000000OO;
      final int O0000000000OO0;
      final int O0000000000OOO;

      W404(String string) {
         this.O00000000 = O0000O00OO0.O00000000("assets/wild/shaders/world/world_volume.vert", string);
         this.O000000000 = this.O00000000.O00000000("u_ScreenTexture");
         this.O0000000000 = this.O00000000.O00000000("u_DepthTexture");
         this.O00000000000 = this.O00000000.O00000000("u_Resolution");
         this.O000000000000 = this.O00000000.O00000000("u_Time");
         this.O0000000000000 = this.O00000000.O00000000("u_CameraPos");
         this.O000000000000O = this.O00000000.O00000000("u_InverseProjectionMatrix");
         this.O00000000000O = this.O00000000.O00000000("u_InverseViewMatrix");
         this.O00000000000O0 = this.O00000000.O00000000("u_InverseViewProjectionMatrix");
         this.O00000000000OO = this.O00000000.O00000000("u_AtmosphereTint");
         this.O0000000000O = this.O00000000.O00000000("u_SkyColor");
         this.O0000000000O0 = this.O00000000.O00000000("u_FogDensity");
         this.O0000000000O00 = this.O00000000.O00000000("u_HorizonDissolve");
         this.O0000000000O0O = this.O00000000.O00000000("u_SkyLift");
         this.O0000000000OO = this.O00000000.O00000000("u_EdgeSoftness");
         this.O0000000000OO0 = this.O00000000.O00000000("u_WindSpeed");
         this.O0000000000OOO = this.O00000000.O00000000("u_WindDirection");
      }
   }

   static final class W405 {
      int O00000000;
      int O000000000;
      int O0000000000;
      int O00000000000;
   }
}
