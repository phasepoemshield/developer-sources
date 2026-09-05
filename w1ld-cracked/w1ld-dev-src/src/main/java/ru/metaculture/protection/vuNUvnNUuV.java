package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import net.minecraft.class_1041;
import net.minecraft.class_10868;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;

public final class vuNUvnNUuV implements AutoCloseable {
   private static final vuNUvnNUuV UuUVuuUu = new vuNUvnNUuV();
   private static final String C00OOC00oO = "assets/wild/shaders/world/world_volume.vert";
   private static final String uUnuvNvvNU = "assets/wild/shaders/postfx/motion_blur.frag";
   private static final float vVvUvVVuuNvV = 1.0E-5F;
   private final vuNUvnNUuV.uunvUUVnuNn uNNnnnuuuN = new vuNUvnNUuV.uunvUUVnuNn();
   private final Matrix4f nuUnNvnuUu = new Matrix4f();
   private final Matrix4f VVuuUN = new Matrix4f();
   private class_243 vNUvnnVnUvu = class_243.field_1353;
   private float uVUuuVnNVU;
   private float vuuuNvNuv;
   private vuNUvnNUuV.VvunVVUvUNnv nvUVNnuu;
   private int UuuNnUvUuv;
   private int nUUVuvU;
   private int UnUNVVVNuv;
   private int vNVuvnUUnuUn;
   private boolean UvnvNVnnnnNU;
   private boolean uVUVnuvnuVuv;
   private boolean NVNnnvnuunNv;

   private vuNUvnNUuV() {
   }

   public static vuNUvnNUuV UuUVuuUu() {
      return UuUVuuUu;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(class_310 var1, class_4184 var2, Matrix4f var3, Matrix4f var4, vuNUvnNUuV.nvnNNunvv var5) {
      if (!this.uVUVnuvnuVuv && var1 != null && var2 != null && var3 != null && var4 != null && var5 != null) {
         if (var1.field_1687 != null && var1.field_1724 != null && UuUVuuUu(var1)) {
            class_1041 var6 = var1.method_22683();
            int var7 = var6.method_4489();
            int var8 = var6.method_4506();
            if (var7 > 1 && var8 > 1 && !(var5.UuUVuuUu <= 1.0E-5F)) {
               class_276 var9 = var1.method_1522();
               if (var9 == null) {
                  this.C00OOC00oO();
               } else {
                  int var10 = UuUVuuUu(var9.method_30277());
                  int var11 = UuUVuuUu(var9.method_30278());
                  if (var10 > 0 && var11 > 0) {
                     float var12 = this.UuUVuuUu(var2);
                     float var13 = this.NVNnnvnuunNv ? UuUVuuUu(UuUVuuUu(var2.method_19330() - this.uVUuuVnNVU) * 0.0062F, -0.24F, 0.24F) : 0.0F;
                     float var14 = this.NVNnnvnuunNv ? UuUVuuUu((var2.method_19329() - this.vuuuNvNuv) * -0.0074F, -0.24F, 0.24F) : 0.0F;
                     if (this.NVNnnvnuunNv && !(var12 < var5.uVUuuVnNVU * 4.0E-5F)) {
                        VvuuVNVUn.NVnVnNnN var15 = VvuuVNVUn.UuUVuuUu();
                        boolean var16 = false;
                        boolean var24 = false /* VF: Semaphore variable */;

                        label231: {
                           label219: {
                              label232: {
                                 try {
                                    var24 = true;
                                    this.uUnuvNvvNU();
                                    if (!this.uVUVnuvnuVuv && this.UuUVuuUu(this.uNNnnnuuuN, var7, var8)) {
                                       if (!this.UuUVuuUu(var10, var7, var8, this.uNNnnnuuuN)) {
                                          this.UuUVuuUu(var2, var3, var4);
                                          var24 = false;
                                          break label231;
                                       }

                                       Matrix4f var17 = new Matrix4f(var4).invert();
                                       Matrix4f var18 = new Matrix4f(var3).invert();
                                       class_243 var19 = var2.method_19326();
                                       var18.m30((float)var19.field_1352);
                                       var18.m31((float)var19.field_1351);
                                       var18.m32((float)var19.field_1350);
                                       vuNUvnNUuV.NVnVnNnN var20 = new vuNUvnNUuV.NVnVnNnN(
                                          var7, var8, this.uNNnnnuuuN.C00OOC00oO, var11, var19, var17, var18, var5, var12, var13, var14
                                       );
                                       var16 = this.UuUVuuUu(var10, var20);
                                       this.UuUVuuUu(var2, var3, var4);
                                       var24 = false;
                                       break label219;
                                    }

                                    this.UuUVuuUu(var2, var3, var4);
                                    var24 = false;
                                    break label232;
                                 } catch (Throwable var25) {
                                    this.uVUVnuvnuVuv = true;
                                    System.err.println("[SilkFlow] renderer disabled: " + var25.getMessage());
                                    var25.printStackTrace();
                                    var24 = false;
                                 } finally {
                                    if (var24) {
                                       if (var16 && this.nUUVuvU != 0) {
                                          GL30.glBindFramebuffer(36160, this.nUUVuvU);
                                          GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                       }

                                       GL13.glActiveTexture(33985);
                                       GL11.glBindTexture(3553, 0);
                                       GL13.glActiveTexture(33984);
                                       GL11.glBindTexture(3553, 0);
                                       GL20.glUseProgram(0);
                                       VvuuVNVUn.uUnuvNvvNU(var15);
                                    }
                                 }

                                 if (var16 && this.nUUVuvU != 0) {
                                    GL30.glBindFramebuffer(36160, this.nUUVuvU);
                                    GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                 }

                                 GL13.glActiveTexture(33985);
                                 GL11.glBindTexture(3553, 0);
                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, 0);
                                 GL20.glUseProgram(0);
                                 VvuuVNVUn.uUnuvNvvNU(var15);
                                 return;
                              }

                              if (var16 && this.nUUVuvU != 0) {
                                 GL30.glBindFramebuffer(36160, this.nUUVuvU);
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                              }

                              GL13.glActiveTexture(33985);
                              GL11.glBindTexture(3553, 0);
                              GL13.glActiveTexture(33984);
                              GL11.glBindTexture(3553, 0);
                              GL20.glUseProgram(0);
                              VvuuVNVUn.uUnuvNvvNU(var15);
                              return;
                           }

                           if (var16 && this.nUUVuvU != 0) {
                              GL30.glBindFramebuffer(36160, this.nUUVuvU);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           }

                           GL13.glActiveTexture(33985);
                           GL11.glBindTexture(3553, 0);
                           GL13.glActiveTexture(33984);
                           GL11.glBindTexture(3553, 0);
                           GL20.glUseProgram(0);
                           VvuuVNVUn.uUnuvNvvNU(var15);
                           return;
                        }

                        if (var16 && this.nUUVuvU != 0) {
                           GL30.glBindFramebuffer(36160, this.nUUVuvU);
                           GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                        }

                        GL13.glActiveTexture(33985);
                        GL11.glBindTexture(3553, 0);
                        GL13.glActiveTexture(33984);
                        GL11.glBindTexture(3553, 0);
                        GL20.glUseProgram(0);
                        VvuuVNVUn.uUnuvNvvNU(var15);
                     } else {
                        this.UuUVuuUu(var2, var3, var4);
                     }
                  } else {
                     this.UuUVuuUu(var2, var3, var4);
                  }
               }
            } else {
               this.UuUVuuUu(var2, var3, var4);
            }
         } else {
            this.C00OOC00oO();
         }
      }
   }

   public void UuUVuuUu(int var1, int var2) {
      this.C00OOC00oO();
      if (var1 > 0 && var2 > 0) {
         if (this.uNNnnnuuuN.uUnuvNvvNU > 0 && (this.uNNnnnuuuN.uUnuvNvvNU != var1 || this.uNNnnnuuuN.vVvUvVVuuNvV != var2)) {
            this.UuUVuuUu(this.uNNnnnuuuN);
         }
      } else {
         this.UuUVuuUu(this.uNNnnnuuuN);
      }
   }

   public void C00OOC00oO() {
      this.NVNnnvnuunNv = false;
      this.vNUvnnVnUvu = class_243.field_1353;
      this.uVUuuVnNVU = 0.0F;
      this.vuuuNvNuv = 0.0F;
      this.nuUnNvnuUu.identity();
      this.VVuuUN.identity();
   }

   private boolean UuUVuuUu(int var1, vuNUvnNUuV.NVnVnNnN var2) {
      if (this.nUUVuvU == 0) {
         this.nUUVuvU = GL30.glGenFramebuffers();
      }

      GL30.glBindFramebuffer(36160, this.nUUVuvU);
      GL30.glFramebufferTexture2D(36160, 36064, 3553, var1, 0);
      GL11.glDrawBuffer(36064);
      if (GL30.glCheckFramebufferStatus(36160) != 36053) {
         return true;
      } else {
         GL11.glViewport(0, 0, var2.UuUVuuUu, var2.C00OOC00oO);
         GL11.glDisable(3089);
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         GL11.glDisable(3042);
         GL11.glDisable(36281);
         GL11.glColorMask(true, true, true, true);
         GL11.glDepthMask(false);
         this.nvUVNnuu.UuUVuuUu.UuUVuuUu();
         this.UuUVuuUu(var2);
         GL30.glBindVertexArray(this.UnUNVVVNuv);
         VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
         GL11.glDrawArrays(4, 0, 6);
         GL30.glBindVertexArray(0);
         return true;
      }
   }

   private void UuUVuuUu(vuNUvnNUuV.NVnVnNnN var1) {
      C00OOC00oO(this.nvUVNnuu.C00OOC00oO, 0);
      C00OOC00oO(this.nvUVNnuu.uUnuvNvvNU, 1);
      UuUVuuUu(this.nvUVNnuu.vVvUvVVuuNvV, (float)var1.UuUVuuUu, (float)var1.C00OOC00oO);
      UuUVuuUu(this.nvUVNnuu.uNNnnnuuuN, var1.nuUnNvnuUu);
      UuUVuuUu(this.nvUVNnuu.nuUnNvnuUu, var1.VVuuUN);
      UuUVuuUu(this.nvUVNnuu.VVuuUN, this.VVuuUN);
      UuUVuuUu(this.nvUVNnuu.vNUvnnVnUvu, this.nuUnNvnuUu);
      UuUVuuUu(this.nvUVNnuu.uVUuuVnNVU, (float)var1.uNNnnnuuuN.field_1352, (float)var1.uNNnnnuuuN.field_1351, (float)var1.uNNnnnuuuN.field_1350);
      UuUVuuUu(this.nvUVNnuu.vuuuNvNuv, (float)this.vNUvnnVnUvu.field_1352, (float)this.vNUvnnVnUvu.field_1351, (float)this.vNUvnnVnUvu.field_1350);
      UuUVuuUu(this.nvUVNnuu.nvUVNnuu, UuUVuuUu(var1.vNUvnnVnUvu.UuUVuuUu, 0.0F, 1.0F));
      UuUVuuUu(this.nvUVNnuu.UuuNnUvUuv, UuUVuuUu(var1.vNUvnnVnUvu.C00OOC00oO, 0.05F, 4.0F));
      UuUVuuUu(this.nvUVNnuu.nUUVuvU, UuUVuuUu(var1.vNUvnnVnUvu.vVvUvVVuuNvV, 1.0F, 128.0F));
      UuUVuuUu(this.nvUVNnuu.UnUNVVVNuv, UuUVuuUu(var1.vNUvnnVnUvu.uNNnnnuuuN, 0.02F, 4.0F));
      UuUVuuUu(this.nvUVNnuu.vNVuvnUUnuUn, UuUVuuUu(var1.vNUvnnVnUvu.nuUnNvnuUu, 0.0F, 3.0F));
      UuUVuuUu(this.nvUVNnuu.UvnvNVnnnnNU, UuUVuuUu(var1.vNUvnnVnUvu.VVuuUN, 0.0F, 1.0F));
      UuUVuuUu(this.nvUVNnuu.uVUVnuvnuVuv, UuUVuuUu(var1.vNUvnnVnUvu.vNUvnnVnUvu, 0.2F, 8.0F));
      UuUVuuUu(this.nvUVNnuu.NVNnnvnuunNv, UuUVuuUu(var1.vNUvnnVnUvu.uVUuuVnNVU, 0.01F, 4.0F));
      UuUVuuUu(this.nvUVNnuu.uVunuUNVVUUV, var1.uVUuuVnNVU);
      UuUVuuUu(this.nvUVNnuu.UNnVVNvvnVvU, var1.vuuuNvNuv, var1.nvUVNnuu);
      C00OOC00oO(this.nvUVNnuu.uNnUnnuNUnNu, Math.max(3, Math.min(12, var1.vNUvnnVnUvu.uUnuvNvvNU)));
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, var1.uUnuvNvvNU);
      GL13.glActiveTexture(33985);
      GL11.glBindTexture(3553, var1.vVvUvVVuuNvV);
      GL13.glActiveTexture(33984);
   }

   private boolean UuUVuuUu(int var1, int var2, int var3, vuNUvnNUuV.uunvUUVnuNn var4) {
      if (var1 > 0 && var4 != null && var4.UuUVuuUu > 0 && var2 > 0 && var3 > 0) {
         if (this.UuuNnUvUuv == 0) {
            this.UuuNnUvUuv = GL30.glGenFramebuffers();
         }

         GL30.glBindFramebuffer(36008, this.UuuNnUvUuv);
         GL30.glFramebufferTexture2D(36008, 36064, 3553, var1, 0);
         if (GL30.glCheckFramebufferStatus(36008) != 36053) {
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            return false;
         } else {
            GL30.glBindFramebuffer(36009, var4.UuUVuuUu);
            GL11.glReadBuffer(36064);
            GL11.glDrawBuffer(36064);
            GL30.glBlitFramebuffer(0, 0, var2, var3, 0, 0, var2, var3, 16384, 9728);
            GL30.glBindFramebuffer(36008, this.UuuNnUvUuv);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(vuNUvnNUuV.uunvUUVnuNn var1, int var2, int var3) {
      if (var1 != null && var2 > 0 && var3 > 0) {
         if (var1.C00OOC00oO != 0 && (var1.uUnuvNvvNU != var2 || var1.vVvUvVVuuNvV != var3 || var1.UuUVuuUu == 0)) {
            this.UuUVuuUu(var1);
         }

         if (var1.C00OOC00oO == 0) {
            var1.C00OOC00oO = GL11.glGenTextures();
            GL11.glBindTexture(3553, var1.C00OOC00oO);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            o000OOoCO0OO.UuUVuuUu(32856, var2, var3, 6408, 5121);
            var1.UuUVuuUu = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36160, var1.UuUVuuUu);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, var1.C00OOC00oO, 0);
            GL11.glDrawBuffer(36064);
            if (GL30.glCheckFramebufferStatus(36160) != 36053) {
               this.UuUVuuUu(var1);
               return false;
            }
         }

         var1.uUnuvNvvNU = var2;
         var1.vVvUvVVuuNvV = var3;
         return true;
      } else {
         return false;
      }
   }

   private void uUnuvNvvNU() {
      if (!this.UvnvNVnnnnNU) {
         this.UnUNVVVNuv = GL30.glGenVertexArrays();
         this.vNVuvnUUnuUn = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.UnUNVVVNuv);
         GL15.glBindBuffer(34962, this.vNVuvnUUnuUn);
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
         this.nvUVNnuu = new vuNUvnNUuV.VvunVVUvUNnv();
         this.UvnvNVnnnnNU = true;
      }
   }

   private float UuUVuuUu(class_4184 var1) {
      if (this.NVNnnvnuunNv && var1 != null) {
         class_243 var2 = var1.method_19326();
         float var3 = UuUVuuUu(var1.method_19330() - this.uVUuuVnNVU);
         float var4 = var1.method_19329() - this.vuuuNvNuv;
         double var5 = var2.method_1022(this.vNUvnnVnUvu);
         float var7 = Math.abs(var3) * 0.00175F + Math.abs(var4) * 0.00225F;
         float var8 = (float)Math.min(0.12, var5 * 0.045);
         return var7 + var8;
      } else {
         return 1.0F;
      }
   }

   private void UuUVuuUu(class_4184 var1, Matrix4f var2, Matrix4f var3) {
      if (var1 != null && var2 != null && var3 != null) {
         this.nuUnNvnuUu.set(var2);
         this.VVuuUN.set(var3);
         this.vNUvnnVnUvu = var1.method_19326();
         this.uVUuuVnNVU = var1.method_19330();
         this.vuuuNvNuv = var1.method_19329();
         this.NVNnnvnuunNv = true;
      } else {
         this.C00OOC00oO();
      }
   }

   private static int UuUVuuUu(Object var0) {
      return var0 instanceof class_10868 var1 ? var1.method_68427() : 0;
   }

   private static boolean UuUVuuUu(class_310 var0) {
      if (var0 != null && var0.method_22683() != null) {
         class_1041 var1 = var0.method_22683();
         return !var1.method_65966() && var1.method_4489() > 0 && var1.method_4506() > 0;
      } else {
         return false;
      }
   }

   private static boolean vVvUvVVuuNvV() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private static float UuUVuuUu(float var0) {
      var0 %= 360.0F;
      if (var0 >= 180.0F) {
         var0 -= 360.0F;
      }

      if (var0 < -180.0F) {
         var0 += 360.0F;
      }

      return var0;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }

   private static void C00OOC00oO(int var0, int var1) {
      if (var0 >= 0) {
         GL20.glUniform1i(var0, var1);
      }
   }

   private static void UuUVuuUu(int var0, float var1) {
      if (var0 >= 0) {
         GL20.glUniform1f(var0, var1);
      }
   }

   private static void UuUVuuUu(int var0, float var1, float var2) {
      if (var0 >= 0) {
         GL20.glUniform2f(var0, var1, var2);
      }
   }

   private static void UuUVuuUu(int var0, float var1, float var2, float var3) {
      if (var0 >= 0) {
         GL20.glUniform3f(var0, var1, var2, var3);
      }
   }

   private static void UuUVuuUu(int var0, Matrix4f var1) {
      if (var0 >= 0 && var1 != null) {
         MemoryStack var2 = MemoryStack.stackPush();

         try {
            FloatBuffer var3 = var2.mallocFloat(16);
            var1.get(var3);
            GL20.glUniformMatrix4fv(var0, false, var3);
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

   private void UuUVuuUu(vuNUvnNUuV.uunvUUVnuNn var1) {
      if (var1 != null) {
         if (var1.UuUVuuUu != 0 && vVvUvVVuuNvV()) {
            GL30.glDeleteFramebuffers(var1.UuUVuuUu);
         }

         if (var1.C00OOC00oO != 0 && vVvUvVVuuNvV()) {
            GL11.glDeleteTextures(var1.C00OOC00oO);
         }

         var1.UuUVuuUu = 0;
         var1.C00OOC00oO = 0;
         var1.uUnuvNvvNU = 0;
         var1.vVvUvVVuuNvV = 0;
      }
   }

   @Override
   public void close() {
      this.C00OOC00oO();
      if (!vVvUvVVuuNvV()) {
         this.uNNnnnuuuN();
      } else {
         this.UuUVuuUu(this.uNNnnnuuuN);
         if (this.UuuNnUvUuv != 0) {
            GL30.glDeleteFramebuffers(this.UuuNnUvUuv);
            this.UuuNnUvUuv = 0;
         }

         if (this.nUUVuvU != 0) {
            GL30.glDeleteFramebuffers(this.nUUVuvU);
            this.nUUVuvU = 0;
         }

         if (this.UnUNVVVNuv != 0) {
            GL30.glDeleteVertexArrays(this.UnUNVVVNuv);
            this.UnUNVVVNuv = 0;
         }

         if (this.vNVuvnUUnuUn != 0) {
            GL15.glDeleteBuffers(this.vNVuvnUUnuUn);
            this.vNVuvnUUnuUn = 0;
         }

         if (this.nvUVNnuu != null) {
            this.nvUVNnuu.UuUVuuUu.C00OOC00oO();
            this.nvUVNnuu = null;
         }

         this.UvnvNVnnnnNU = false;
         this.uVUVnuvnuVuv = false;
      }
   }

   private void uNNnnnuuuN() {
      this.uNNnnnuuuN.UuUVuuUu = 0;
      this.uNNnnnuuuN.C00OOC00oO = 0;
      this.uNNnnnuuuN.uUnuvNvvNU = 0;
      this.uNNnnnuuuN.vVvUvVVuuNvV = 0;
      this.UuuNnUvUuv = 0;
      this.nUUVuvU = 0;
      this.UnUNVVVNuv = 0;
      this.vNVuvnUUnuUn = 0;
      this.nvUVNnuu = null;
      this.UvnvNVnnnnNU = false;
      this.uVUVnuvnuVuv = false;
   }

   static final class NVnVnNnN {
      final int UuUVuuUu;
      final int C00OOC00oO;
      final int uUnuvNvvNU;
      final int vVvUvVVuuNvV;
      final class_243 uNNnnnuuuN;
      final Matrix4f nuUnNvnuUu;
      final Matrix4f VVuuUN;
      final vuNUvnNUuV.nvnNNunvv vNUvnnVnUvu;
      final float uVUuuVnNVU;
      final float vuuuNvNuv;
      final float nvUVNnuu;

      NVnVnNnN(
         int var1, int var2, int var3, int var4, class_243 var5, Matrix4f var6, Matrix4f var7, vuNUvnNUuV.nvnNNunvv var8, float var9, float var10, float var11
      ) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
         this.uVUuuVnNVU = var9;
         this.vuuuNvNuv = var10;
         this.nvUVNnuu = var11;
      }
   }

   static final class VvunVVUvUNnv {
      final vVvUNNUVVnNn UuUVuuUu = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/world/world_volume.vert", "assets/wild/shaders/postfx/motion_blur.frag");
      final int C00OOC00oO = this.UuUVuuUu.UuUVuuUu("u_ScreenTexture");
      final int uUnuvNvvNU = this.UuUVuuUu.UuUVuuUu("u_DepthTexture");
      final int vVvUvVVuuNvV = this.UuUVuuUu.UuUVuuUu("u_Resolution");
      final int uNNnnnuuuN = this.UuUVuuUu.UuUVuuUu("u_InverseProjectionMatrix");
      final int nuUnNvnuUu = this.UuUVuuUu.UuUVuuUu("u_InverseViewMatrix");
      final int VVuuUN = this.UuUVuuUu.UuUVuuUu("u_PreviousProjectionMatrix");
      final int vNUvnnVnUvu = this.UuUVuuUu.UuUVuuUu("u_PreviousViewMatrix");
      final int uVUuuVnNVU = this.UuUVuuUu.UuUVuuUu("u_CameraPos");
      final int vuuuNvNuv = this.UuUVuuUu.UuUVuuUu("u_PreviousCameraPos");
      final int nvUVNnuu = this.UuUVuuUu.UuUVuuUu("u_Strength");
      final int UuuNnUvUuv = this.UuUVuuUu.UuUVuuUu("u_TemporalScale");
      final int nUUVuvU = this.UuUVuuUu.UuUVuuUu("u_MaxRadius");
      final int UnUNVVVNuv = this.UuUVuuUu.UuUVuuUu("u_EdgeFocus");
      final int vNVuvnUUnuUn = this.UuUVuuUu.UuUVuuUu("u_ChromaticPhase");
      final int UvnvNVnnnnNU = this.UuUVuuUu.UuUVuuUu("u_DepthGuard");
      final int uVUVnuvnuVuv = this.UuUVuuUu.UuUVuuUu("u_Decay");
      final int NVNnnvnuunNv = this.UuUVuuUu.UuUVuuUu("u_Activation");
      final int uVunuUNVVUUV = this.UuUVuuUu.UuUVuuUu("u_GlobalMotion");
      final int UNnVVNvvnVvU = this.UuUVuuUu.UuUVuuUu("u_CameraVelocity");
      final int uNnUnnuNUnNu = this.UuUVuuUu.UuUVuuUu("u_Samples");
   }

   public static final class nvnNNunvv {
      public float UuUVuuUu = 0.72F;
      public float C00OOC00oO = 1.05F;
      public int uUnuvNvvNU = 7;
      public float vVvUvVVuuNvV = 34.0F;
      public float uNNnnnuuuN = 0.54F;
      public float nuUnNvnuUu = 0.58F;
      public float VVuuUN = 0.72F;
      public float vNUvnnVnUvu = 2.25F;
      public float uVUuuVnNVU = 0.42F;
   }

   static final class uunvUUVnuNn {
      int UuUVuuUu;
      int C00OOC00oO;
      int uUnuvNvvNU;
      int vVvUvVVuuNvV;
   }
}
