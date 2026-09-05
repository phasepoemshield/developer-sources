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

public final class uUvNNnvNvN implements AutoCloseable {
   private static final uUvNNnvNvN UuUVuuUu = new uUvNNnvNvN();
   private static final String C00OOC00oO = "assets/wild/shaders/world/world_volume.vert";
   private static final String uUnuvNvvNU = "assets/wild/shaders/world/world_fog_fresnel.frag";
   private static final String vVvUvVVuuNvV = "assets/wild/shaders/world/ambient_particles.frag";
   private static final String uNNnnnuuuN = "assets/wild/shaders/world/world_copy.frag";
   private static final float nuUnNvnuUu = 1.0E-4F;
   private final uUvNNnvNvN.uunvUUVnuNn VVuuUN = new uUvNNnvNvN.uunvUUVnuNn();
   private final uUvNNnvNvN.uunvUUVnuNn vNUvnnVnUvu = new uUvNNnvNvN.uunvUUVnuNn();
   private uUvNNnvNvN.VvunVVUvUNnv uVUuuVnNVU;
   private uUvNNnvNvN.VvunVVUvUNnv vuuuNvNuv;
   private uUvNNnvNvN.VvunVVUvUNnv nvUVNnuu;
   private int UuuNnUvUuv;
   private int nUUVuvU;
   private int UnUNVVVNuv;
   private int vNVuvnUUnuUn;
   private boolean UvnvNVnnnnNU;
   private boolean uVUVnuvnuVuv;

   private uUvNNnvNvN() {
   }

   public static uUvNNnvNvN UuUVuuUu() {
      return UuUVuuUu;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(class_310 var1, class_4184 var2, Matrix4f var3, Matrix4f var4, uUvNNnvNvN.nvnNNunvv var5) {
      if (!this.uVUVnuvnuVuv && var1 != null && var2 != null && var3 != null && var4 != null && var5 != null) {
         if (var1.field_1687 != null && var1.field_1724 != null && UuUVuuUu(var1)) {
            class_1041 var6 = var1.method_22683();
            int var7 = var6.method_4489();
            int var8 = var6.method_4506();
            if (var7 > 1 && var8 > 1) {
               class_276 var9 = var1.method_1522();
               if (var9 != null) {
                  int var10 = UuUVuuUu(var9.method_30277());
                  int var11 = UuUVuuUu(var9.method_30278());
                  if (var10 > 0 && var11 > 0) {
                     VvuuVNVUn.NVnVnNnN var12 = VvuuVNVUn.UuUVuuUu();
                     boolean var23 = false /* VF: Semaphore variable */;

                     label188: {
                        label178: {
                           label189: {
                              try {
                                 var23 = true;
                                 this.C00OOC00oO();
                                 if (!this.uVUVnuvnuVuv) {
                                    if (this.UuUVuuUu(this.VVuuUN, var7, var8)) {
                                       if (this.UuUVuuUu(this.vNUvnnVnUvu, var7, var8)) {
                                          if (!this.UuUVuuUu(var10, var7, var8, this.VVuuUN)) {
                                             var23 = false;
                                             break label188;
                                          }

                                          class_243 var13 = var2.method_19326();
                                          Matrix4f var14 = new Matrix4f(var4).invert();
                                          Matrix4f var15 = new Matrix4f(var3).invert();
                                          var15.m30((float)var13.field_1352);
                                          var15.m31((float)var13.field_1351);
                                          var15.m32((float)var13.field_1350);
                                          Matrix4f var16 = new Matrix4f(var15).mul(var14);
                                          uUvNNnvNvN.NVnVnNnN var17 = new uUvNNnvNvN.NVnVnNnN(var7, var8, var11, var13, var14, var15, var16, var5);
                                          int var18 = this.VVuuUN.C00OOC00oO;
                                          int var19 = this.vNUvnnVnUvu.C00OOC00oO;
                                          if (var5.uNNnnnuuuN > 1.0E-4F) {
                                             this.UuUVuuUu(this.uVUuuVnNVU, var18, var19, var17);
                                             var18 = var19;
                                             var19 = this.VVuuUN.C00OOC00oO;
                                          }

                                          this.UuUVuuUu(this.vuuuNvNuv, var18, var19, var17);
                                          this.UuUVuuUu(this.nvUVNnuu, var19, var10, var17);
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
                                 this.uVUVnuvnuVuv = true;
                                 System.err.println("[WorldTweaks] renderer disabled: " + var24.getMessage());
                                 var24.printStackTrace();
                                 var23 = false;
                              } finally {
                                 if (var23) {
                                    if (this.nUUVuvU != 0) {
                                       GL30.glBindFramebuffer(36160, this.nUUVuvU);
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                    }

                                    GL20.glUseProgram(0);
                                    VvuuVNVUn.uUnuvNvvNU(var12);
                                 }
                              }

                              if (this.nUUVuvU != 0) {
                                 GL30.glBindFramebuffer(36160, this.nUUVuvU);
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                              }

                              GL20.glUseProgram(0);
                              VvuuVNVUn.uUnuvNvvNU(var12);
                              return;
                           }

                           if (this.nUUVuvU != 0) {
                              GL30.glBindFramebuffer(36160, this.nUUVuvU);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           }

                           GL20.glUseProgram(0);
                           VvuuVNVUn.uUnuvNvvNU(var12);
                           return;
                        }

                        if (this.nUUVuvU != 0) {
                           GL30.glBindFramebuffer(36160, this.nUUVuvU);
                           GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                        }

                        GL20.glUseProgram(0);
                        VvuuVNVUn.uUnuvNvvNU(var12);
                        return;
                     }

                     if (this.nUUVuvU != 0) {
                        GL30.glBindFramebuffer(36160, this.nUUVuvU);
                        GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                     }

                     GL20.glUseProgram(0);
                     VvuuVNVUn.uUnuvNvvNU(var12);
                  }
               }
            }
         }
      }
   }

   public void UuUVuuUu(int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         if (this.VVuuUN.uUnuvNvvNU > 0 && (this.VVuuUN.uUnuvNvvNU != var1 || this.VVuuUN.vVvUvVVuuNvV != var2)
            || this.vNUvnnVnUvu.uUnuvNvvNU > 0 && (this.vNUvnnVnUvu.uUnuvNvvNU != var1 || this.vNUvnnVnUvu.vVvUvVVuuNvV != var2)) {
            this.UuUVuuUu(this.VVuuUN);
            this.UuUVuuUu(this.vNUvnnVnUvu);
         }
      } else {
         this.UuUVuuUu(this.VVuuUN);
         this.UuUVuuUu(this.vNUvnnVnUvu);
      }
   }

   private void UuUVuuUu(uUvNNnvNvN.VvunVVUvUNnv var1, int var2, int var3, uUvNNnvNvN.NVnVnNnN var4) {
      if (var1 != null && var2 > 0 && var3 > 0 && var4 != null) {
         if (this.nUUVuvU == 0) {
            this.nUUVuvU = GL30.glGenFramebuffers();
         }

         GL30.glBindFramebuffer(36160, this.nUUVuvU);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, var3, 0);
         GL11.glDrawBuffer(36064);
         if (GL30.glCheckFramebufferStatus(36160) == 36053) {
            GL11.glViewport(0, 0, var4.UuUVuuUu, var4.C00OOC00oO);
            GL11.glDisable(3089);
            GL11.glDisable(2929);
            GL11.glDisable(2884);
            GL11.glDisable(3042);
            GL11.glDisable(36281);
            GL11.glColorMask(true, true, true, true);
            GL11.glDepthMask(false);
            var1.UuUVuuUu.UuUVuuUu();
            this.UuUVuuUu(var1, var2, var4);
            GL30.glBindVertexArray(this.UnUNVVVNuv);
            VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
            GL11.glDrawArrays(4, 0, 6);
            GL30.glBindVertexArray(0);
         }
      }
   }

   private void UuUVuuUu(uUvNNnvNvN.VvunVVUvUNnv var1, int var2, uUvNNnvNvN.NVnVnNnN var3) {
      if (var1.C00OOC00oO >= 0) {
         GL20.glUniform1i(var1.C00OOC00oO, 0);
      }

      if (var1.uUnuvNvvNU >= 0) {
         GL20.glUniform1i(var1.uUnuvNvvNU, 1);
      }

      if (var1.vVvUvVVuuNvV >= 0) {
         GL20.glUniform2f(var1.vVvUvVVuuNvV, var3.UuUVuuUu, var3.C00OOC00oO);
      }

      if (var1.uNNnnnuuuN >= 0) {
         GL20.glUniform1f(var1.uNNnnnuuuN, var3.vNUvnnVnUvu.vNVuvnUUnuUn);
      }

      if (var1.nuUnNvnuUu >= 0) {
         GL20.glUniform3f(var1.nuUnNvnuUu, (float)var3.vVvUvVVuuNvV.field_1352, (float)var3.vVvUvVVuuNvV.field_1351, (float)var3.vVvUvVVuuNvV.field_1350);
      }

      if (var1.VVuuUN >= 0) {
         this.UuUVuuUu(var1.VVuuUN, var3.uNNnnnuuuN);
      }

      if (var1.vNUvnnVnUvu >= 0) {
         this.UuUVuuUu(var1.vNUvnnVnUvu, var3.nuUnNvnuUu);
      }

      if (var1.uVUuuVnNVU >= 0) {
         this.UuUVuuUu(var1.uVUuuVnNVU, var3.VVuuUN);
      }

      if (var1.vuuuNvNuv >= 0) {
         GL20.glUniform3f(var1.vuuuNvNuv, var3.vNUvnnVnUvu.uVUuuVnNVU, var3.vNUvnnVnUvu.vuuuNvNuv, var3.vNUvnnVnUvu.nvUVNnuu);
      }

      if (var1.nvUVNnuu >= 0) {
         GL20.glUniform3f(var1.nvUVNnuu, var3.vNUvnnVnUvu.UuuNnUvUuv, var3.vNUvnnVnUvu.nUUVuvU, var3.vNUvnnVnUvu.UnUNVVVNuv);
      }

      if (var1.UuuNnUvUuv >= 0) {
         GL20.glUniform1f(var1.UuuNnUvUuv, UuUVuuUu(var3.vNUvnnVnUvu.uNNnnnuuuN, 0.0F, 0.1F));
      }

      if (var1.nUUVuvU >= 0) {
         GL20.glUniform1f(var1.nUUVuvU, UuUVuuUu(var3.vNUvnnVnUvu.nuUnNvnuUu, 0.0F, 1.0F));
      }

      if (var1.UnUNVVVNuv >= 0) {
         GL20.glUniform1f(var1.UnUNVVVNuv, UuUVuuUu(var3.vNUvnnVnUvu.VVuuUN, 0.0F, 1.0F));
      }

      if (var1.vNVuvnUUnuUn >= 0) {
         GL20.glUniform1f(var1.vNVuvnUUnuUn, UuUVuuUu(var3.vNUvnnVnUvu.vNUvnnVnUvu, 0.0F, 1.0F));
      }

      if (var1.UvnvNVnnnnNU >= 0) {
         GL20.glUniform1f(var1.UvnvNVnnnnNU, UuUVuuUu(var3.vNUvnnVnUvu.UuUVuuUu, 0.0F, 2.0F));
      }

      if (var1.uVUVnuvnuVuv >= 0) {
         GL20.glUniform3f(var1.uVUVnuvnuVuv, var3.vNUvnnVnUvu.C00OOC00oO, var3.vNUvnnVnUvu.uUnuvNvvNU, var3.vNUvnnVnUvu.vVvUvVVuuNvV);
      }

      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, var2);
      GL13.glActiveTexture(33985);
      GL11.glBindTexture(3553, var3.uUnuvNvvNU);
      GL13.glActiveTexture(33984);
   }

   private void UuUVuuUu(int var1, Matrix4f var2) {
      MemoryStack var3 = MemoryStack.stackPush();

      try {
         FloatBuffer var4 = var3.mallocFloat(16);
         var2.get(var4);
         GL20.glUniformMatrix4fv(var1, false, var4);
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

   private boolean UuUVuuUu(int var1, int var2, int var3, uUvNNnvNvN.uunvUUVnuNn var4) {
      if (var1 > 0 && var4 != null && var4.UuUVuuUu > 0 && var2 > 0 && var3 > 0) {
         if (this.UuuNnUvUuv == 0) {
            this.UuuNnUvUuv = GL30.glGenFramebuffers();
         }

         GL30.glBindFramebuffer(36008, this.UuuNnUvUuv);
         GL30.glFramebufferTexture2D(36008, 36064, 3553, var1, 0);
         if (GL30.glCheckFramebufferStatus(36008) != 36053) {
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

   private boolean UuUVuuUu(uUvNNnvNvN.uunvUUVnuNn var1, int var2, int var3) {
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

   private void C00OOC00oO() {
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
         this.uVUuuVnNVU = new uUvNNnvNvN.VvunVVUvUNnv("assets/wild/shaders/world/world_fog_fresnel.frag");
         this.vuuuNvNuv = new uUvNNnvNvN.VvunVVUvUNnv("assets/wild/shaders/world/ambient_particles.frag");
         this.nvUVNnuu = new uUvNNnvNvN.VvunVVUvUNnv("assets/wild/shaders/world/world_copy.frag");
         this.UvnvNVnnnnNU = true;
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

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }

   private static boolean uUnuvNvvNU() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private void UuUVuuUu(uUvNNnvNvN.uunvUUVnuNn var1) {
      if (var1 != null) {
         if (var1.UuUVuuUu != 0 && uUnuvNvvNU()) {
            GL30.glDeleteFramebuffers(var1.UuUVuuUu);
         }

         if (var1.C00OOC00oO != 0 && uUnuvNvvNU()) {
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
      if (!uUnuvNvvNU()) {
         this.vVvUvVVuuNvV();
      } else {
         this.UuUVuuUu(this.VVuuUN);
         this.UuUVuuUu(this.vNUvnnVnUvu);
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

         UuUVuuUu(this.uVUuuVnNVU);
         UuUVuuUu(this.vuuuNvNuv);
         UuUVuuUu(this.nvUVNnuu);
         this.uVUuuVnNVU = null;
         this.vuuuNvNuv = null;
         this.nvUVNnuu = null;
         this.UvnvNVnnnnNU = false;
         this.uVUVnuvnuVuv = false;
      }
   }

   private void vVvUvVVuuNvV() {
      this.VVuuUN.UuUVuuUu = 0;
      this.VVuuUN.C00OOC00oO = 0;
      this.VVuuUN.uUnuvNvvNU = 0;
      this.VVuuUN.vVvUvVVuuNvV = 0;
      this.vNUvnnVnUvu.UuUVuuUu = 0;
      this.vNUvnnVnUvu.C00OOC00oO = 0;
      this.vNUvnnVnUvu.uUnuvNvvNU = 0;
      this.vNUvnnVnUvu.vVvUvVVuuNvV = 0;
      this.UuuNnUvUuv = 0;
      this.nUUVuvU = 0;
      this.UnUNVVVNuv = 0;
      this.vNVuvnUUnuUn = 0;
      this.uVUuuVnNVU = null;
      this.vuuuNvNuv = null;
      this.nvUVNnuu = null;
      this.UvnvNVnnnnNU = false;
      this.uVUVnuvnuVuv = false;
   }

   private static void UuUVuuUu(uUvNNnvNvN.VvunVVUvUNnv var0) {
      if (var0 != null) {
         var0.UuUVuuUu.C00OOC00oO();
      }
   }

   static final class NVnVnNnN {
      final int UuUVuuUu;
      final int C00OOC00oO;
      final int uUnuvNvvNU;
      final class_243 vVvUvVVuuNvV;
      final Matrix4f uNNnnnuuuN;
      final Matrix4f nuUnNvnuUu;
      final Matrix4f VVuuUN;
      final uUvNNnvNvN.nvnNNunvv vNUvnnVnUvu;

      NVnVnNnN(int var1, int var2, int var3, class_243 var4, Matrix4f var5, Matrix4f var6, Matrix4f var7, uUvNNnvNvN.nvnNNunvv var8) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
      }
   }

   static final class VvunVVUvUNnv {
      final vVvUNNUVVnNn UuUVuuUu;
      final int C00OOC00oO;
      final int uUnuvNvvNU;
      final int vVvUvVVuuNvV;
      final int uNNnnnuuuN;
      final int nuUnNvnuUu;
      final int VVuuUN;
      final int vNUvnnVnUvu;
      final int uVUuuVnNVU;
      final int vuuuNvNuv;
      final int nvUVNnuu;
      final int UuuNnUvUuv;
      final int nUUVuvU;
      final int UnUNVVVNuv;
      final int vNVuvnUUnuUn;
      final int UvnvNVnnnnNU;
      final int uVUVnuvnuVuv;

      VvunVVUvUNnv(String var1) {
         this.UuUVuuUu = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/world/world_volume.vert", var1);
         this.C00OOC00oO = this.UuUVuuUu.UuUVuuUu("u_ScreenTexture");
         this.uUnuvNvvNU = this.UuUVuuUu.UuUVuuUu("u_DepthTexture");
         this.vVvUvVVuuNvV = this.UuUVuuUu.UuUVuuUu("u_Resolution");
         this.uNNnnnuuuN = this.UuUVuuUu.UuUVuuUu("u_Time");
         this.nuUnNvnuUu = this.UuUVuuUu.UuUVuuUu("u_CameraPos");
         this.VVuuUN = this.UuUVuuUu.UuUVuuUu("u_InverseProjectionMatrix");
         this.vNUvnnVnUvu = this.UuUVuuUu.UuUVuuUu("u_InverseViewMatrix");
         this.uVUuuVnNVU = this.UuUVuuUu.UuUVuuUu("u_InverseViewProjectionMatrix");
         this.vuuuNvNuv = this.UuUVuuUu.UuUVuuUu("u_AtmosphereTint");
         this.nvUVNnuu = this.UuUVuuUu.UuUVuuUu("u_SkyColor");
         this.UuuNnUvUuv = this.UuUVuuUu.UuUVuuUu("u_FogDensity");
         this.nUUVuvU = this.UuUVuuUu.UuUVuuUu("u_HorizonDissolve");
         this.UnUNVVVNuv = this.UuUVuuUu.UuUVuuUu("u_SkyLift");
         this.vNVuvnUUnuUn = this.UuUVuuUu.UuUVuuUu("u_EdgeSoftness");
         this.UvnvNVnnnnNU = this.UuUVuuUu.UuUVuuUu("u_WindSpeed");
         this.uVUVnuvnuVuv = this.UuUVuuUu.UuUVuuUu("u_WindDirection");
      }
   }

   public static final class nvnNNunvv {
      public float UuUVuuUu;
      public float C00OOC00oO = 0.819F;
      public float uUnuvNvvNU;
      public float vVvUvVVuuNvV = 0.574F;
      public float uNNnnnuuuN;
      public float nuUnNvnuUu = 0.82F;
      public float VVuuUN = 0.64F;
      public float vNUvnnVnUvu = 0.72F;
      public float uVUuuVnNVU = 0.416F;
      public float vuuuNvNuv = 0.482F;
      public float nvUVNnuu = 0.584F;
      public float UuuNnUvUuv = 0.5F;
      public float nUUVuvU = 0.62F;
      public float UnUNVVVNuv = 0.78F;
      public float vNVuvnUUnuUn;
   }

   static final class uunvUUVnuNn {
      int UuUVuuUu;
      int C00OOC00oO;
      int uUnuvNvvNU;
      int vVvUvVVuuNvV;
   }
}
