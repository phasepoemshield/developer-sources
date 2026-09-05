package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import java.util.List;
import net.minecraft.class_1041;
import net.minecraft.class_10868;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class NNUvnNnnvNN {
   public static final int UuUVuuUu = 10;
   private static final String C00OOC00oO = "assets/wild/shaders/world/hit_refraction.vsh";
   private static final String uUnuvNvvNU = "assets/wild/shaders/world/hit_refraction.frag";
   private static final NNUvnNnnvNN vVvUvVVuuNvV = new NNUvnNnnvNN();
   private vVvUNNUVVnNn uNNnnnuuuN;
   private int nuUnNvnuUu = -1;
   private int VVuuUN = -1;
   private int vNUvnnVnUvu = -1;
   private int uVUuuVnNVU = -1;
   private int vuuuNvNuv = -1;
   private int nvUVNnuu = -1;
   private int UuuNnUvUuv = -1;
   private int nUUVuvU = -1;
   private int UnUNVVVNuv = -1;
   private int vNVuvnUUnuUn = -1;
   private int UvnvNVnnnnNU = -1;
   private int uVUVnuvnuVuv = -1;
   private int NVNnnvnuunNv = -1;
   private int uVunuUNVVUUV;
   private int UNnVVNvvnVvU;
   private int uNnUnnuNUnNu;
   private int NnUuNNU;
   private int nNvNUVU;
   private int UnUNuUU;
   private int uUVuVvuNUvnu;
   private int UvUvUNuvNU;
   private final FloatBuffer c0oOOCcCoC0 = BufferUtils.createFloatBuffer(16);
   private final FloatBuffer VVnVNnunVvu = BufferUtils.createFloatBuffer(16);
   private final FloatBuffer unNNVVNnvvV = BufferUtils.createFloatBuffer(30);
   private final FloatBuffer NuunnvnN = BufferUtils.createFloatBuffer(30);
   private final FloatBuffer NVUunUNUN = BufferUtils.createFloatBuffer(40);
   private final FloatBuffer UUVNuUNUvUnV = BufferUtils.createFloatBuffer(30);
   private final Matrix4f vuvnUnVnUNnV = new Matrix4f();
   private final Vector4f nnuUVNUuvvVU = new Vector4f();
   private final Vector3f nVVUuvuNnUN = new Vector3f();

   private NNUvnNnnvNN() {
   }

   public static NNUvnNnnvNN UuUVuuUu() {
      return vVvUvVVuuNvV;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(class_310 var1, List<UVNnuuVnuuU> var2, Matrix4f var3, Matrix4f var4, class_243 var5, boolean var6, boolean var7, float var8) {
      if (RenderSystem.isOnRenderThread()) {
         if (var1 != null && var2 != null && !var2.isEmpty() && var3 != null && var4 != null && var5 != null) {
            class_1041 var9 = var1.method_22683();
            if (var9 != null && !var9.method_65966()) {
               int var10 = var9.method_4489();
               int var11 = var9.method_4506();
               if (var10 > 0 && var11 > 0) {
                  long var12 = System.currentTimeMillis();
                  this.unNNVVNnvvV.clear();
                  this.NuunnvnN.clear();
                  this.NVUunUNUN.clear();
                  this.UUVNuUNUvUnV.clear();
                  int var14 = 0;

                  for (UVNnuuVnuuU var16 : var2) {
                     if (var14 >= 10) {
                        break;
                     }

                     float var17 = var16.UuUVuuUu(var12);
                     if (!(var17 >= 1.0F)) {
                        float var18 = 1.0F - (float)Math.pow(2.0, -9.0 * var17);
                        float var19 = var16.uVUuuVnNVU() * var18;
                        float var20 = var16.uVUuuVnNVU() * 0.16F * (0.45F + 0.55F * (1.0F - var17));
                        float var21 = UuUVuuUu(0.0F, 0.1F, var17);
                        float var22 = 1.0F - UuUVuuUu(0.5F, 1.0F, var17);
                        float var23 = C00OOC00oO(var21 * var22, 0.0F, 1.0F);
                        if (!(var23 <= 8.0E-4F)) {
                           float var24 = var16.vuuuNvNuv() * (0.7F + 0.3F * (1.0F - UuUVuuUu(0.15F, 1.0F, var17)));
                           this.nnuUVNUuvvVU
                              .set(
                                 (float)(var16.UuUVuuUu() - var5.field_1352),
                                 (float)(var16.C00OOC00oO() - var5.field_1351),
                                 (float)(var16.uUnuvNvvNU() - var5.field_1350),
                                 1.0F
                              );
                           var3.transform(this.nnuUVNUuvvVU);
                           float var25 = this.nnuUVNUuvvVU.x;
                           float var26 = this.nnuUVNUuvvVU.y;
                           float var27 = this.nnuUVNUuvvVU.z;
                           if (!(var27 > var19 + var20 + 0.1F)) {
                              this.nVVUuvuNnUN.set((float)var16.vVvUvVVuuNvV(), (float)var16.uNNnnnuuuN(), (float)var16.nuUnNvnuUu());
                              var3.transformDirection(this.nVVUuvuNnUN);
                              float var28 = this.nVVUuvuNnUN.length();
                              if (var28 < 1.0E-5F) {
                                 this.nVVUuvuNnUN.set(0.0F, 1.0F, 0.0F);
                              } else {
                                 this.nVVUuvuNnUN.div(var28);
                              }

                              this.unNNVVNnvvV.put(var25).put(var26).put(var27);
                              this.NuunnvnN.put(this.nVVUuvuNnUN.x).put(this.nVVUuvuNnUN.y).put(this.nVVUuvuNnUN.z);
                              this.NVUunUNUN.put(var19).put(var20).put(var23).put(var24);
                              int var29 = var16.nvUVNnuu();
                              this.UUVNuUNUvUnV.put((var29 >> 16 & 0xFF) / 255.0F).put((var29 >> 8 & 0xFF) / 255.0F).put((var29 & 0xFF) / 255.0F);
                              var14++;
                           }
                        }
                     }
                  }

                  if (var14 != 0) {
                     this.unNNVVNnvvV.flip();
                     this.NuunnvnN.flip();
                     this.NVUunUNUN.flip();
                     this.UUVNuUNUvUnV.flip();
                     this.uUnuvNvvNU();
                     if (this.uNNnnnuuuN != null && this.uUVuVvuNUvnu != 0 && this.nuUnNvnuUu >= 0) {
                        if (this.UuUVuuUu(var10, var11)) {
                           int var34 = this.UuUVuuUu(var1);
                           if (var34 > 0) {
                              int var35 = var7 ? this.C00OOC00oO(var1) : 0;
                              if (this.UuUVuuUu(var34, var10, var11)) {
                                 this.c0oOOCcCoC0.clear();
                                 var4.get(this.c0oOOCcCoC0);
                                 this.vuvnUnVnUNnV.set(var4).invert();
                                 this.VVnVNnunVvu.clear();
                                 this.vuvnUnVnUNnV.get(this.VVnVNnunVvu);
                                 VvuuVNVUn.NVnVnNnN var36 = VvuuVNVUn.UuUVuuUu();
                                 boolean var32 = false /* VF: Semaphore variable */;

                                 label313: {
                                    try {
                                       var32 = true;
                                       if (this.UnUNuUU == 0) {
                                          this.UnUNuUU = GL30.glGenFramebuffers();
                                       }

                                       GL30.glBindFramebuffer(36160, this.UnUNuUU);
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, var34, 0);
                                       GL11.glDrawBuffer(36064);
                                       if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                          var32 = false;
                                          break label313;
                                       }

                                       GL11.glViewport(0, 0, var10, var11);
                                       GL11.glDisable(3089);
                                       GL11.glDisable(2884);
                                       GL11.glDisable(2929);
                                       GL11.glDisable(3042);
                                       GL11.glDisable(36281);
                                       GL11.glColorMask(true, true, true, true);
                                       GL11.glDepthMask(false);
                                       this.uNNnnnuuuN.UuUVuuUu();
                                       GL20.glUniform1i(this.nuUnNvnuUu, 0);
                                       if (this.VVuuUN >= 0) {
                                          GL20.glUniform1i(this.VVuuUN, 1);
                                       }

                                       if (this.vNUvnnVnUvu >= 0) {
                                          GL20.glUniformMatrix4fv(this.vNUvnnVnUvu, false, this.c0oOOCcCoC0);
                                       }

                                       if (this.uVUuuVnNVU >= 0) {
                                          GL20.glUniformMatrix4fv(this.uVUuuVnNVU, false, this.VVnVNnunVvu);
                                       }

                                       if (this.vuuuNvNuv >= 0) {
                                          GL20.glUniform2f(this.vuuuNvNuv, var10, var11);
                                       }

                                       if (this.nvUVNnuu >= 0) {
                                          GL20.glUniform1f(this.nvUVNnuu, var8);
                                       }

                                       if (this.UuuNnUvUuv >= 0) {
                                          GL20.glUniform1i(this.UuuNnUvUuv, var14);
                                       }

                                       if (this.nUUVuvU >= 0) {
                                          GL20.glUniform1i(this.nUUVuvU, var6 ? 1 : 0);
                                       }

                                       if (this.UnUNVVVNuv >= 0) {
                                          GL20.glUniform1i(this.UnUNVVVNuv, var35 > 0 ? 1 : 0);
                                       }

                                       if (this.vNVuvnUUnuUn >= 0) {
                                          GL20.glUniform3fv(this.vNVuvnUUnuUn, this.unNNVVNnvvV);
                                       }

                                       if (this.UvnvNVnnnnNU >= 0) {
                                          GL20.glUniform3fv(this.UvnvNVnnnnNU, this.NuunnvnN);
                                       }

                                       if (this.uVUVnuvnuVuv >= 0) {
                                          GL20.glUniform4fv(this.uVUVnuvnuVuv, this.NVUunUNUN);
                                       }

                                       if (this.NVNnnvnuunNv >= 0) {
                                          GL20.glUniform3fv(this.NVNnnvnuunNv, this.UUVNuUNUvUnV);
                                       }

                                       GL13.glActiveTexture(33984);
                                       GL11.glBindTexture(3553, this.UNnVVNvvnVvU);
                                       GL13.glActiveTexture(33985);
                                       GL11.glBindTexture(3553, var35);
                                       GL13.glActiveTexture(33984);
                                       GL30.glBindVertexArray(this.uUVuVvuNUvnu);
                                       GL11.glDrawArrays(4, 0, 6);
                                       GL30.glBindVertexArray(0);
                                       var32 = false;
                                    } finally {
                                       if (var32) {
                                          if (this.UnUNuUU != 0) {
                                             GL30.glBindFramebuffer(36160, this.UnUNuUU);
                                             GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                          }

                                          GL13.glActiveTexture(33985);
                                          GL11.glBindTexture(3553, 0);
                                          GL13.glActiveTexture(33984);
                                          GL11.glBindTexture(3553, 0);
                                          GL20.glUseProgram(0);
                                          VvuuVNVUn.uUnuvNvvNU(var36);
                                       }
                                    }

                                    if (this.UnUNuUU != 0) {
                                       GL30.glBindFramebuffer(36160, this.UnUNuUU);
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                    }

                                    GL13.glActiveTexture(33985);
                                    GL11.glBindTexture(3553, 0);
                                    GL13.glActiveTexture(33984);
                                    GL11.glBindTexture(3553, 0);
                                    GL20.glUseProgram(0);
                                    VvuuVNVUn.uUnuvNvvNU(var36);
                                    return;
                                 }

                                 if (this.UnUNuUU != 0) {
                                    GL30.glBindFramebuffer(36160, this.UnUNuUU);
                                    GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                 }

                                 GL13.glActiveTexture(33985);
                                 GL11.glBindTexture(3553, 0);
                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, 0);
                                 GL20.glUseProgram(0);
                                 VvuuVNVUn.uUnuvNvvNU(var36);
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
   private boolean UuUVuuUu(int var1, int var2, int var3) {
      VvuuVNVUn.NVnVnNnN var4 = VvuuVNVUn.UuUVuuUu();
      boolean var8 = false /* VF: Semaphore variable */;

      boolean var10;
      label71: {
         try {
            var8 = true;
            if (this.nNvNUVU == 0) {
               this.nNvNUVU = GL30.glGenFramebuffers();
            }

            GL11.glDisable(3089);
            GL11.glDisable(3042);
            GL11.glDisable(2884);
            GL11.glDisable(2929);
            GL11.glDisable(36281);
            GL30.glBindFramebuffer(36008, this.nNvNUVU);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, var1, 0);
            if (GL30.glCheckFramebufferStatus(36008) != 36053) {
               var10 = false;
               var8 = false;
               break label71;
            }

            GL30.glBindFramebuffer(36009, this.uVunuUNVVUUV);
            GL11.glReadBuffer(36064);
            GL11.glDrawBuffer(36064);
            GL30.glBlitFramebuffer(0, 0, var2, var3, 0, 0, var2, var3, 16384, 9728);
            var10 = true;
            var8 = false;
         } finally {
            if (var8) {
               if (this.nNvNUVU != 0) {
                  GL30.glBindFramebuffer(36008, this.nNvNUVU);
                  GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
               }

               VvuuVNVUn.uUnuvNvvNU(var4);
            }
         }

         if (this.nNvNUVU != 0) {
            GL30.glBindFramebuffer(36008, this.nNvNUVU);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
         }

         VvuuVNVUn.uUnuvNvvNU(var4);
         return var10;
      }

      if (this.nNvNUVU != 0) {
         GL30.glBindFramebuffer(36008, this.nNvNUVU);
         GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
      }

      VvuuVNVUn.uUnuvNvvNU(var4);
      return var10;
   }

   private int UuUVuuUu(class_310 var1) {
      class_276 var2 = var1.method_1522();
      if (var2 == null) {
         return 0;
      } else {
         return var2.method_30277() instanceof class_10868 var4 ? var4.method_68427() : 0;
      }
   }

   private int C00OOC00oO(class_310 var1) {
      class_276 var2 = var1.method_1522();
      if (var2 == null) {
         return 0;
      } else {
         return var2.method_30278() instanceof class_10868 var4 ? var4.method_68427() : 0;
      }
   }

   private boolean UuUVuuUu(int var1, int var2) {
      if (this.UNnVVNvvnVvU != 0 && (this.uNnUnnuNUnNu != var1 || this.NnUuNNU != var2 || this.uVunuUNVVUUV == 0)) {
         this.vVvUvVVuuNvV();
      }

      label53:
      if (this.UNnVVNvvnVvU == 0) {
         VvuuVNVUn.NVnVnNnN var3 = VvuuVNVUn.UuUVuuUu();

         boolean var4;
         try {
            this.UNnVVNvvnVvU = GL11.glGenTextures();
            GL11.glBindTexture(3553, this.UNnVVNvvnVvU);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            o000OOoCO0OO.UuUVuuUu(32856, var1, var2, 6408, 5121);
            this.uVunuUNVVUUV = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36160, this.uVunuUNVVUUV);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, this.UNnVVNvvnVvU, 0);
            GL11.glDrawBuffer(36064);
            if (GL30.glCheckFramebufferStatus(36160) == 36053) {
               break label53;
            }

            this.vVvUvVVuuNvV();
            var4 = false;
         } finally {
            VvuuVNVUn.uUnuvNvvNU(var3);
         }

         return var4;
      }

      this.uNnUnnuNUnNu = var1;
      this.NnUuNNU = var2;
      return true;
   }

   private void uUnuvNvvNU() {
      if (this.uUVuVvuNUvnu == 0) {
         VvuuVNVUn.NVnVnNnN var1 = VvuuVNVUn.UuUVuuUu();

         try {
            this.uUVuVvuNUvnu = GL30.glGenVertexArrays();
            this.UvUvUNuvNU = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.uUVuVvuNUvnu);
            GL15.glBindBuffer(34962, this.UvUvUNuvNU);
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
            VvuuVNVUn.uUnuvNvvNU(var1);
         }
      }

      if (this.uNNnnnuuuN == null) {
         try {
            this.uNNnnnuuuN = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/world/hit_refraction.vsh", "assets/wild/shaders/world/hit_refraction.frag");
            this.nuUnNvnuUu = this.uNNnnnuuuN.UuUVuuUu("u_scene");
            this.VVuuUN = this.uNNnnnuuuN.UuUVuuUu("u_depth");
            this.vNUvnnVnUvu = this.uNNnnnuuuN.UuUVuuUu("u_proj");
            this.uVUuuVnNVU = this.uNNnnnuuuN.UuUVuuUu("u_invProj");
            this.vuuuNvNuv = this.uNNnnnuuuN.UuUVuuUu("u_resolution");
            this.nvUVNnuu = this.uNNnnnuuuN.UuUVuuUu("u_time");
            this.UuuNnUvUuv = this.uNNnnnuuuN.UuUVuuUu("u_count");
            this.nUUVuvU = this.uNNnnnuuuN.UuUVuuUu("u_chroma");
            this.UnUNVVVNuv = this.uNNnnnuuuN.UuUVuuUu("u_depthOcclusion");
            this.vNVuvnUUnuUn = this.uNNnnnuuuN.UuUVuuUu("u_center[0]");
            this.UvnvNVnnnnNU = this.uNNnnnuuuN.UuUVuuUu("u_axis[0]");
            this.uVUVnuvnuVuv = this.uNNnnnuuuN.UuUVuuUu("u_shape[0]");
            this.NVNnnvnuunNv = this.uNNnnnuuuN.UuUVuuUu("u_glow[0]");
         } catch (Throwable var7) {
            this.uNNnnnuuuN = null;
         }
      }
   }

   private void vVvUvVVuuNvV() {
      if (this.uVunuUNVVUUV != 0) {
         GL30.glDeleteFramebuffers(this.uVunuUNVVUUV);
         this.uVunuUNVVUUV = 0;
      }

      if (this.UNnVVNvvnVvU != 0) {
         GL11.glDeleteTextures(this.UNnVVNvvnVvU);
         this.UNnVVNvvnVvU = 0;
      }

      this.uNnUnnuNUnNu = 0;
      this.NnUuNNU = 0;
   }

   public void C00OOC00oO() {
      if (RenderSystem.isOnRenderThread()) {
         this.vVvUvVVuuNvV();
         if (this.nNvNUVU != 0) {
            GL30.glDeleteFramebuffers(this.nNvNUVU);
            this.nNvNUVU = 0;
         }

         if (this.UnUNuUU != 0) {
            GL30.glDeleteFramebuffers(this.UnUNuUU);
            this.UnUNuUU = 0;
         }

         if (this.UvUvUNuvNU != 0) {
            GL15.glDeleteBuffers(this.UvUvUNuvNU);
            this.UvUvUNuvNU = 0;
         }

         if (this.uUVuVvuNUvnu != 0) {
            GL30.glDeleteVertexArrays(this.uUVuVvuNUvnu);
            this.uUVuVvuNUvnu = 0;
         }

         if (this.uNNnnnuuuN != null) {
            this.uNNnnnuuuN.C00OOC00oO();
            this.uNNnnnuuuN = null;
         }
      }
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      if (var0 == var1) {
         return var2 < var0 ? 0.0F : 1.0F;
      } else {
         float var3 = C00OOC00oO((var2 - var0) / (var1 - var0), 0.0F, 1.0F);
         return var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }
}
