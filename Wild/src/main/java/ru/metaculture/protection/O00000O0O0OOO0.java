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
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O00000O0O0OOO0 {
   public static final int O00000000 = 10;
   private static final String O000000000 = "assets/wild/shaders/world/hit_refraction.vsh";
   private static final String O0000000000 = "assets/wild/shaders/world/hit_refraction.frag";
   private static final O00000O0O0OOO0 O00000000000 = new O00000O0O0OOO0();
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
   private int O0000000000OOO = -1;
   private int O000000000O = -1;
   private int O000000000O0;
   private int O000000000O00;
   private int O000000000O000;
   private int O000000000O00O;
   private int O000000000O0O;
   private int O000000000O0O0;
   private int O000000000O0OO;
   private int O000000000OO;
   private final FloatBuffer O000000000OO0 = BufferUtils.createFloatBuffer(16);
   private final FloatBuffer O000000000OO00 = BufferUtils.createFloatBuffer(16);
   private final FloatBuffer O000000000OO0O = BufferUtils.createFloatBuffer(30);
   private final FloatBuffer O000000000OOO = BufferUtils.createFloatBuffer(30);
   private final FloatBuffer O000000000OOO0 = BufferUtils.createFloatBuffer(40);
   private final FloatBuffer O000000000OOOO = BufferUtils.createFloatBuffer(30);
   private final Matrix4f O00000000O = new Matrix4f();
   private final Vector4f O00000000O0 = new Vector4f();
   private final Vector3f O00000000O00 = new Vector3f();

   private O00000O0O0OOO0() {
   }

   public static O00000O0O0OOO0 O00000000() {
      return O00000000000;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(
      MinecraftClient minecraftClient, List<O00000O0O0OOOO> list, Matrix4f matrix4f, Matrix4f matrix4f2, Vec3d vec3d, boolean bl, boolean bl2, float f
   ) {
      if (RenderSystem.isOnRenderThread()) {
         if (minecraftClient != null && list != null && !list.isEmpty() && matrix4f != null && matrix4f2 != null && vec3d != null) {
            Window var9 = minecraftClient.getWindow();
            if (var9 != null && !var9.hasZeroWidthOrHeight()) {
               int var10 = var9.getFramebufferWidth();
               int var11 = var9.getFramebufferHeight();
               if (var10 > 0 && var11 > 0) {
                  long var12 = System.currentTimeMillis();
                  this.O000000000OO0O.clear();
                  this.O000000000OOO.clear();
                  this.O000000000OOO0.clear();
                  this.O000000000OOOO.clear();
                  int var14 = 0;

                  for (O00000O0O0OOOO var16 : list) {
                     if (var14 >= 10) {
                        break;
                     }

                     float var17 = var16.O00000000(var12);
                     if (!(var17 >= 1.0F)) {
                        float var18 = 1.0F - (float)Math.pow(2.0, -9.0 * var17);
                        float var19 = var16.O00000000000O0() * var18;
                        float var20 = var16.O00000000000O0() * 0.16F * (0.45F + 0.55F * (1.0F - var17));
                        float var21 = O00000000(0.0F, 0.1F, var17);
                        float var22 = 1.0F - O00000000(0.5F, 1.0F, var17);
                        float var23 = O000000000(var21 * var22, 0.0F, 1.0F);
                        if (!(var23 <= 8.0E-4F)) {
                           float var24 = var16.O00000000000OO() * (0.7F + 0.3F * (1.0F - O00000000(0.15F, 1.0F, var17)));
                           this.O00000000O0
                              .set((float)(var16.O00000000() - vec3d.x), (float)(var16.O000000000() - vec3d.y), (float)(var16.O0000000000() - vec3d.z), 1.0F);
                           matrix4f.transform(this.O00000000O0);
                           float var25 = this.O00000000O0.x;
                           float var26 = this.O00000000O0.y;
                           float var27 = this.O00000000O0.z;
                           if (!(var27 > var19 + var20 + 0.1F)) {
                              this.O00000000O00.set((float)var16.O00000000000(), (float)var16.O000000000000(), (float)var16.O0000000000000());
                              matrix4f.transformDirection(this.O00000000O00);
                              float var28 = this.O00000000O00.length();
                              if (var28 < 1.0E-5F) {
                                 this.O00000000O00.set(0.0F, 1.0F, 0.0F);
                              } else {
                                 this.O00000000O00.div(var28);
                              }

                              this.O000000000OO0O.put(var25).put(var26).put(var27);
                              this.O000000000OOO.put(this.O00000000O00.x).put(this.O00000000O00.y).put(this.O00000000O00.z);
                              this.O000000000OOO0.put(var19).put(var20).put(var23).put(var24);
                              int var29 = var16.O0000000000O();
                              this.O000000000OOOO.put((var29 >> 16 & 0xFF) / 255.0F).put((var29 >> 8 & 0xFF) / 255.0F).put((var29 & 0xFF) / 255.0F);
                              var14++;
                           }
                        }
                     }
                  }

                  if (var14 != 0) {
                     this.O000000000OO0O.flip();
                     this.O000000000OOO.flip();
                     this.O000000000OOO0.flip();
                     this.O000000000OOOO.flip();
                     this.O0000000000();
                     if (this.O000000000000 != null && this.O000000000O0OO != 0 && this.O0000000000000 >= 0) {
                        if (this.O00000000(var10, var11)) {
                           int var34 = this.O00000000(minecraftClient);
                           if (var34 > 0) {
                              int var35 = bl2 ? this.O000000000(minecraftClient) : 0;
                              if (this.O00000000(var34, var10, var11)) {
                                 this.O000000000OO0.clear();
                                 matrix4f2.get(this.O000000000OO0);
                                 this.O00000000O.set(matrix4f2).invert();
                                 this.O000000000OO00.clear();
                                 this.O00000000O.get(this.O000000000OO00);
                                 O0000O00O0OOO0.W373 var36 = O0000O00O0OOO0.O00000000();
                                 boolean var32 = false /* VF: Semaphore variable */;

                                 label317: {
                                    try {
                                       var32 = true;
                                       if (this.O000000000O0O0 == 0) {
                                          this.O000000000O0O0 = GL30.glGenFramebuffers();
                                       }

                                       GL30.glBindFramebuffer(36160, this.O000000000O0O0);
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, var34, 0);
                                       GL11.glDrawBuffer(36064);
                                       if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                          var32 = false;
                                          break label317;
                                       }

                                       GL11.glViewport(0, 0, var10, var11);
                                       GL11.glDisable(3089);
                                       GL11.glDisable(2884);
                                       GL11.glDisable(2929);
                                       GL11.glDisable(3042);
                                       GL11.glDisable(36281);
                                       GL11.glColorMask(true, true, true, true);
                                       GL11.glDepthMask(false);
                                       this.O000000000000.O00000000();
                                       GL20.glUniform1i(this.O0000000000000, 0);
                                       if (this.O000000000000O >= 0) {
                                          GL20.glUniform1i(this.O000000000000O, 1);
                                       }

                                       if (this.O00000000000O >= 0) {
                                          GL20.glUniformMatrix4fv(this.O00000000000O, false, this.O000000000OO0);
                                       }

                                       if (this.O00000000000O0 >= 0) {
                                          GL20.glUniformMatrix4fv(this.O00000000000O0, false, this.O000000000OO00);
                                       }

                                       if (this.O00000000000OO >= 0) {
                                          GL20.glUniform2f(this.O00000000000OO, var10, var11);
                                       }

                                       if (this.O0000000000O >= 0) {
                                          GL20.glUniform1f(this.O0000000000O, f);
                                       }

                                       if (this.O0000000000O0 >= 0) {
                                          GL20.glUniform1i(this.O0000000000O0, var14);
                                       }

                                       if (this.O0000000000O00 >= 0) {
                                          GL20.glUniform1i(this.O0000000000O00, bl ? 1 : 0);
                                       }

                                       if (this.O0000000000O0O >= 0) {
                                          GL20.glUniform1i(this.O0000000000O0O, var35 > 0 ? 1 : 0);
                                       }

                                       if (this.O0000000000OO >= 0) {
                                          GL20.glUniform3fv(this.O0000000000OO, this.O000000000OO0O);
                                       }

                                       if (this.O0000000000OO0 >= 0) {
                                          GL20.glUniform3fv(this.O0000000000OO0, this.O000000000OOO);
                                       }

                                       if (this.O0000000000OOO >= 0) {
                                          GL20.glUniform4fv(this.O0000000000OOO, this.O000000000OOO0);
                                       }

                                       if (this.O000000000O >= 0) {
                                          GL20.glUniform3fv(this.O000000000O, this.O000000000OOOO);
                                       }

                                       GL13.glActiveTexture(33984);
                                       GL11.glBindTexture(3553, this.O000000000O00);
                                       GL13.glActiveTexture(33985);
                                       GL11.glBindTexture(3553, var35);
                                       GL13.glActiveTexture(33984);
                                       GL30.glBindVertexArray(this.O000000000O0OO);
                                       GL11.glDrawArrays(4, 0, 6);
                                       GL30.glBindVertexArray(0);
                                       var32 = false;
                                    } finally {
                                       if (var32) {
                                          if (this.O000000000O0O0 != 0) {
                                             GL30.glBindFramebuffer(36160, this.O000000000O0O0);
                                             GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                          }

                                          GL13.glActiveTexture(33985);
                                          GL11.glBindTexture(3553, 0);
                                          GL13.glActiveTexture(33984);
                                          GL11.glBindTexture(3553, 0);
                                          GL20.glUseProgram(0);
                                          O0000O00O0OOO0.O00000000(var36);
                                       }
                                    }

                                    if (this.O000000000O0O0 != 0) {
                                       GL30.glBindFramebuffer(36160, this.O000000000O0O0);
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                    }

                                    GL13.glActiveTexture(33985);
                                    GL11.glBindTexture(3553, 0);
                                    GL13.glActiveTexture(33984);
                                    GL11.glBindTexture(3553, 0);
                                    GL20.glUseProgram(0);
                                    O0000O00O0OOO0.O00000000(var36);
                                    return;
                                 }

                                 if (this.O000000000O0O0 != 0) {
                                    GL30.glBindFramebuffer(36160, this.O000000000O0O0);
                                    GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                 }

                                 GL13.glActiveTexture(33985);
                                 GL11.glBindTexture(3553, 0);
                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, 0);
                                 GL20.glUseProgram(0);
                                 O0000O00O0OOO0.O00000000(var36);
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

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean O00000000(int i, int j, int k) {
      O0000O00O0OOO0.W373 var4 = O0000O00O0OOO0.O00000000();
      boolean var8 = false /* VF: Semaphore variable */;

      boolean var10;
      label70: {
         try {
            var8 = true;
            if (this.O000000000O0O == 0) {
               this.O000000000O0O = GL30.glGenFramebuffers();
            }

            GL11.glDisable(3089);
            GL11.glDisable(3042);
            GL11.glDisable(2884);
            GL11.glDisable(2929);
            GL11.glDisable(36281);
            GL30.glBindFramebuffer(36008, this.O000000000O0O);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, i, 0);
            if (GL30.glCheckFramebufferStatus(36008) != 36053) {
               var10 = false;
               var8 = false;
               break label70;
            }

            GL30.glBindFramebuffer(36009, this.O000000000O0);
            GL11.glReadBuffer(36064);
            GL11.glDrawBuffer(36064);
            GL30.glBlitFramebuffer(0, 0, j, k, 0, 0, j, k, 16384, 9728);
            var10 = true;
            var8 = false;
         } finally {
            if (var8) {
               if (this.O000000000O0O != 0) {
                  GL30.glBindFramebuffer(36008, this.O000000000O0O);
                  GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
               }

               O0000O00O0OOO0.O00000000(var4);
            }
         }

         if (this.O000000000O0O != 0) {
            GL30.glBindFramebuffer(36008, this.O000000000O0O);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
         }

         O0000O00O0OOO0.O00000000(var4);
         return var10;
      }

      if (this.O000000000O0O != 0) {
         GL30.glBindFramebuffer(36008, this.O000000000O0O);
         GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
      }

      O0000O00O0OOO0.O00000000(var4);
      return var10;
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

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean O00000000(int i, int j) {
      if (this.O000000000O00 != 0 && (this.O000000000O000 != i || this.O000000000O00O != j || this.O000000000O0 == 0)) {
         this.O00000000000();
      }

      O0000O00O0OOO0.W373 var3;
      boolean var4;
      label70: {
         if (this.O000000000O00 == 0) {
            var3 = O0000O00O0OOO0.O00000000();
            boolean var7 = false /* VF: Semaphore variable */;

            try {
               var7 = true;
               this.O000000000O00 = GL11.glGenTextures();
               GL11.glBindTexture(3553, this.O000000000O00);
               GL11.glTexParameteri(3553, 10241, 9729);
               GL11.glTexParameteri(3553, 10240, 9729);
               GL11.glTexParameteri(3553, 10242, 33071);
               GL11.glTexParameteri(3553, 10243, 33071);
               O0000O00O0OOOO.O00000000(32856, i, j, 6408, 5121);
               this.O000000000O0 = GL30.glGenFramebuffers();
               GL30.glBindFramebuffer(36160, this.O000000000O0);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, this.O000000000O00, 0);
               GL11.glDrawBuffer(36064);
               if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                  this.O00000000000();
                  var4 = false;
                  var7 = false;
                  break label70;
               }

               var7 = false;
            } finally {
               if (var7) {
                  O0000O00O0OOO0.O00000000(var3);
               }
            }

            O0000O00O0OOO0.O00000000(var3);
         }

         this.O000000000O000 = i;
         this.O000000000O00O = j;
         return true;
      }

      O0000O00O0OOO0.O00000000(var3);
      return var4;
   }

   private void O0000000000() {
      if (this.O000000000O0OO == 0) {
         O0000O00O0OOO0.W373 var1 = O0000O00O0OOO0.O00000000();

         try {
            this.O000000000O0OO = GL30.glGenVertexArrays();
            this.O000000000OO = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O000000000O0OO);
            GL15.glBindBuffer(34962, this.O000000000OO);
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
            this.O000000000000 = O0000O00OO0.O00000000("assets/wild/shaders/world/hit_refraction.vsh", "assets/wild/shaders/world/hit_refraction.frag");
            this.O0000000000000 = this.O000000000000.O00000000("u_scene");
            this.O000000000000O = this.O000000000000.O00000000("u_depth");
            this.O00000000000O = this.O000000000000.O00000000("u_proj");
            this.O00000000000O0 = this.O000000000000.O00000000("u_invProj");
            this.O00000000000OO = this.O000000000000.O00000000("u_resolution");
            this.O0000000000O = this.O000000000000.O00000000("u_time");
            this.O0000000000O0 = this.O000000000000.O00000000("u_count");
            this.O0000000000O00 = this.O000000000000.O00000000("u_chroma");
            this.O0000000000O0O = this.O000000000000.O00000000("u_depthOcclusion");
            this.O0000000000OO = this.O000000000000.O00000000("u_center[0]");
            this.O0000000000OO0 = this.O000000000000.O00000000("u_axis[0]");
            this.O0000000000OOO = this.O000000000000.O00000000("u_shape[0]");
            this.O000000000O = this.O000000000000.O00000000("u_glow[0]");
         } catch (Throwable var7) {
            this.O000000000000 = null;
         }
      }
   }

   private void O00000000000() {
      if (this.O000000000O0 != 0) {
         GL30.glDeleteFramebuffers(this.O000000000O0);
         this.O000000000O0 = 0;
      }

      if (this.O000000000O00 != 0) {
         GL11.glDeleteTextures(this.O000000000O00);
         this.O000000000O00 = 0;
      }

      this.O000000000O000 = 0;
      this.O000000000O00O = 0;
   }

   public void O000000000() {
      if (RenderSystem.isOnRenderThread()) {
         this.O00000000000();
         if (this.O000000000O0O != 0) {
            GL30.glDeleteFramebuffers(this.O000000000O0O);
            this.O000000000O0O = 0;
         }

         if (this.O000000000O0O0 != 0) {
            GL30.glDeleteFramebuffers(this.O000000000O0O0);
            this.O000000000O0O0 = 0;
         }

         if (this.O000000000OO != 0) {
            GL15.glDeleteBuffers(this.O000000000OO);
            this.O000000000OO = 0;
         }

         if (this.O000000000O0OO != 0) {
            GL30.glDeleteVertexArrays(this.O000000000O0OO);
            this.O000000000O0OO = 0;
         }

         if (this.O000000000000 != null) {
            this.O000000000000.O000000000();
            this.O000000000000 = null;
         }
      }
   }

   private static float O00000000(float f, float g, float h) {
      if (f == g) {
         return h < f ? 0.0F : 1.0F;
      } else {
         float var3 = O000000000((h - f) / (g - f), 0.0F, 1.0F);
         return var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   private static float O000000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }
}
