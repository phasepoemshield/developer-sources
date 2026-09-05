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
import org.joml.Vector4f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class NvvNNvNnnNnN {
   public static final int UuUVuuUu = 12;
   private static final String C00OOC00oO = "assets/wild/shaders/world/plasma_pinch.vsh";
   private static final String uUnuvNvvNU = "assets/wild/shaders/world/plasma_pinch.frag";
   private static final NvvNNvNnnNnN vVvUvVVuuNvV = new NvvNNvNnnNnN();
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
   private int uVUVnuvnuVuv;
   private int NVNnnvnuunNv;
   private int uVunuUNVVUUV;
   private final FloatBuffer UNnVVNvvnVvU = BufferUtils.createFloatBuffer(16);
   private final FloatBuffer uNnUnnuNUnNu = BufferUtils.createFloatBuffer(16);
   private final FloatBuffer NnUuNNU = BufferUtils.createFloatBuffer(36);
   private final FloatBuffer nNvNUVU = BufferUtils.createFloatBuffer(12);
   private final FloatBuffer UnUNuUU = BufferUtils.createFloatBuffer(48);
   private final FloatBuffer uUVuVvuNUvnu = BufferUtils.createFloatBuffer(36);
   private final Matrix4f UvUvUNuvNU = new Matrix4f();
   private final Vector4f c0oOOCcCoC0 = new Vector4f();

   private NvvNNvNnnNnN() {
   }

   public static NvvNNvNnnNnN UuUVuuUu() {
      return vVvUvVVuuNvV;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(class_310 var1, List<VVVUNvUNuvV> var2, Matrix4f var3, Matrix4f var4, class_243 var5, float var6) {
      if (RenderSystem.isOnRenderThread()) {
         if (var1 != null && var2 != null && !var2.isEmpty() && var3 != null && var4 != null && var5 != null) {
            class_1041 var7 = var1.method_22683();
            if (var7 != null && !var7.method_65966()) {
               int var8 = var7.method_4489();
               int var9 = var7.method_4506();
               if (var8 > 0 && var9 > 0) {
                  long var10 = System.currentTimeMillis();
                  this.NnUuNNU.clear();
                  this.nNvNUVU.clear();
                  this.UnUNuUU.clear();
                  this.uUVuVvuNUvnu.clear();
                  int var12 = 0;

                  for (VVVUNvUNuvV var14 : var2) {
                     if (var12 >= 12) {
                        break;
                     }

                     float var15 = var14.UuUVuuUu(var10);
                     if (!(var15 >= 1.0F)) {
                        this.c0oOOCcCoC0
                           .set(
                              (float)(var14.UuUVuuUu() - var5.field_1352),
                              (float)(var14.C00OOC00oO() - var5.field_1351),
                              (float)(var14.uUnuvNvvNU() - var5.field_1350),
                              1.0F
                           );
                        var3.transform(this.c0oOOCcCoC0);
                        float var16 = this.c0oOOCcCoC0.x;
                        float var17 = this.c0oOOCcCoC0.y;
                        float var18 = this.c0oOOCcCoC0.z;
                        if (!(var18 > var14.nUUVuvU() + 0.1F)) {
                           this.NnUuNNU.put(var16).put(var17).put(var18);
                           this.nNvNUVU.put(var15);
                           this.UnUNuUU.put(var14.uVUuuVnNVU()).put(var14.vuuuNvNuv()).put(var14.UuuNnUvUuv()).put(var14.nvUVNnuu());
                           int var19 = var14.UnUNVVVNuv();
                           this.uUVuVvuNUvnu.put((var19 >> 16 & 0xFF) / 255.0F).put((var19 >> 8 & 0xFF) / 255.0F).put((var19 & 0xFF) / 255.0F);
                           var12++;
                        }
                     }
                  }

                  if (var12 != 0) {
                     this.NnUuNNU.flip();
                     this.nNvNUVU.flip();
                     this.UnUNuUU.flip();
                     this.uUVuVvuNUvnu.flip();
                     this.uUnuvNvvNU();
                     if (this.uNNnnnuuuN != null && this.NVNnnvnuunNv != 0) {
                        int var24 = this.UuUVuuUu(var1);
                        if (var24 > 0) {
                           int var25 = this.C00OOC00oO(var1);
                           this.UNnVVNvvnVvU.clear();
                           var4.get(this.UNnVVNvvnVvU);
                           this.UvUvUNuvNU.set(var4).invert();
                           this.uNnUnnuNUnNu.clear();
                           this.UvUvUNuvNU.get(this.uNnUnnuNUnNu);
                           VvuuVNVUn.NVnVnNnN var26 = VvuuVNVUn.UuUVuuUu();
                           boolean var22 = false /* VF: Semaphore variable */;

                           label269: {
                              try {
                                 var22 = true;
                                 if (this.uVUVnuvnuVuv == 0) {
                                    this.uVUVnuvnuVuv = GL30.glGenFramebuffers();
                                 }

                                 GL30.glBindFramebuffer(36160, this.uVUVnuvnuVuv);
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, var24, 0);
                                 GL11.glDrawBuffer(36064);
                                 if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                    var22 = false;
                                    break label269;
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
                                 this.uNNnnnuuuN.UuUVuuUu();
                                 if (this.nuUnNvnuUu >= 0) {
                                    GL20.glUniform1i(this.nuUnNvnuUu, 0);
                                 }

                                 if (this.VVuuUN >= 0) {
                                    GL20.glUniformMatrix4fv(this.VVuuUN, false, this.UNnVVNvvnVvU);
                                 }

                                 if (this.vNUvnnVnUvu >= 0) {
                                    GL20.glUniformMatrix4fv(this.vNUvnnVnUvu, false, this.uNnUnnuNUnNu);
                                 }

                                 if (this.uVUuuVnNVU >= 0) {
                                    GL20.glUniform2f(this.uVUuuVnNVU, var8, var9);
                                 }

                                 if (this.vuuuNvNuv >= 0) {
                                    GL20.glUniform1f(this.vuuuNvNuv, var6);
                                 }

                                 if (this.nvUVNnuu >= 0) {
                                    GL20.glUniform1i(this.nvUVNnuu, var12);
                                 }

                                 if (this.UuuNnUvUuv >= 0) {
                                    GL20.glUniform1i(this.UuuNnUvUuv, var25 > 0 ? 1 : 0);
                                 }

                                 if (this.nUUVuvU >= 0) {
                                    GL20.glUniform3fv(this.nUUVuvU, this.NnUuNNU);
                                 }

                                 if (this.UnUNVVVNuv >= 0) {
                                    GL20.glUniform1fv(this.UnUNVVVNuv, this.nNvNUVU);
                                 }

                                 if (this.vNVuvnUUnuUn >= 0) {
                                    GL20.glUniform4fv(this.vNVuvnUUnuUn, this.UnUNuUU);
                                 }

                                 if (this.UvnvNVnnnnNU >= 0) {
                                    GL20.glUniform3fv(this.UvnvNVnnnnNU, this.uUVuVvuNUvnu);
                                 }

                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, var25);
                                 GL30.glBindVertexArray(this.NVNnnvnuunNv);
                                 GL11.glDrawArrays(4, 0, 6);
                                 GL30.glBindVertexArray(0);
                                 var22 = false;
                              } finally {
                                 if (var22) {
                                    if (this.uVUVnuvnuVuv != 0) {
                                       GL30.glBindFramebuffer(36160, this.uVUVnuvnuVuv);
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                    }

                                    GL13.glActiveTexture(33984);
                                    GL11.glBindTexture(3553, 0);
                                    GL20.glUseProgram(0);
                                    VvuuVNVUn.uUnuvNvvNU(var26);
                                 }
                              }

                              if (this.uVUVnuvnuVuv != 0) {
                                 GL30.glBindFramebuffer(36160, this.uVUVnuvnuVuv);
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                              }

                              GL13.glActiveTexture(33984);
                              GL11.glBindTexture(3553, 0);
                              GL20.glUseProgram(0);
                              VvuuVNVUn.uUnuvNvvNU(var26);
                              return;
                           }

                           if (this.uVUVnuvnuVuv != 0) {
                              GL30.glBindFramebuffer(36160, this.uVUVnuvnuVuv);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           }

                           GL13.glActiveTexture(33984);
                           GL11.glBindTexture(3553, 0);
                           GL20.glUseProgram(0);
                           VvuuVNVUn.uUnuvNvvNU(var26);
                        }
                     }
                  }
               }
            }
         }
      }
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

   private void uUnuvNvvNU() {
      if (this.NVNnnvnuunNv == 0) {
         VvuuVNVUn.NVnVnNnN var1 = VvuuVNVUn.UuUVuuUu();

         try {
            this.NVNnnvnuunNv = GL30.glGenVertexArrays();
            this.uVunuUNVVUUV = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.NVNnnvnuunNv);
            GL15.glBindBuffer(34962, this.uVunuUNVVUUV);
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
            this.uNNnnnuuuN = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/world/plasma_pinch.vsh", "assets/wild/shaders/world/plasma_pinch.frag");
            this.nuUnNvnuUu = this.uNNnnnuuuN.UuUVuuUu("u_DepthTexture");
            this.VVuuUN = this.uNNnnnuuuN.UuUVuuUu("u_Proj");
            this.vNUvnnVnUvu = this.uNNnnnuuuN.UuUVuuUu("u_InvProj");
            this.uVUuuVnNVU = this.uNNnnnuuuN.UuUVuuUu("u_Resolution");
            this.vuuuNvNuv = this.uNNnnnuuuN.UuUVuuUu("u_Time");
            this.nvUVNnuu = this.uNNnnnuuuN.UuUVuuUu("u_Count");
            this.UuuNnUvUuv = this.uNNnnnuuuN.UuUVuuUu("u_DepthAvailable");
            this.nUUVuvU = this.uNNnnnuuuN.UuUVuuUu("u_Center[0]");
            this.UnUNVVVNuv = this.uNNnnnuuuN.UuUVuuUu("u_LifeTime[0]");
            this.vNVuvnUUnuUn = this.uNNnnnuuuN.UuUVuuUu("u_Params[0]");
            this.UvnvNVnnnnNU = this.uNNnnnuuuN.UuUVuuUu("u_CoreTint[0]");
         } catch (Throwable var7) {
            this.uNNnnnuuuN = null;
         }
      }
   }

   public void C00OOC00oO() {
      if (RenderSystem.isOnRenderThread()) {
         if (this.uVUVnuvnuVuv != 0) {
            GL30.glDeleteFramebuffers(this.uVUVnuvnuVuv);
            this.uVUVnuvnuVuv = 0;
         }

         if (this.uVunuUNVVUUV != 0) {
            GL15.glDeleteBuffers(this.uVunuUNVVUUV);
            this.uVunuUNVVUUV = 0;
         }

         if (this.NVNnnvnuunNv != 0) {
            GL30.glDeleteVertexArrays(this.NVNnnvnuunNv);
            this.NVNnnvnuunNv = 0;
         }

         if (this.uNNnnnuuuN != null) {
            this.uNNnnnuuuN.C00OOC00oO();
            this.uNNnnnuuuN = null;
         }
      }
   }
}
