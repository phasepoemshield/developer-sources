package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.FloatBuffer;
import net.minecraft.class_1041;
import net.minecraft.class_10868;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_310;
import net.minecraft.class_4184;
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
   UuUVuuUu = "AtmoDawnFog",
   C00OOC00oO = "Кинематографичная атмосфера: туман, лучи света, заря",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class AtmoDawnFog extends Module {
   private static final String c0oOOCcCoC0 = "assets/wild/shaders/world/world_volume.vert";
   private static final String VVnVNnunVvu = "assets/wild/shaders/dawnfog/world_fog_fresnel.frag";
   private static final String unNNVVNnvvV = "Рассвет";
   private static final String NuunnvnN = "Сумерки";
   private static final String NVUunUNUN = "Тема";
   private static final float UUVNuUNUvUnV = 18.0F;
   private static final float vuvnUnVnUNnV = 1.0E-4F;
   private static final int nnuUVNUuvvVU = 13203624;
   private static final int nVVUuvuNnUN = 8230143;
   public final UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Режим", "Рассвет", "Рассвет", "Сумерки", "Тема");
   public final nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Плотность", 0.35F, 0.05F, 0.8F, 0.01F, false);
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Высота рассеивания", 76.0F, 60.0F, 120.0F, 1.0F, false);
   public final nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Лучи света", 0.75F, 0.0F, 1.0F, 0.01F, true);
   public final nNUuNvVn NnUuNNU = new nNUuNvVn("Мягкость", 0.6F, 0.0F, 1.0F, 0.01F, true);
   public final vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Радуга", true);
   public final nNUuNvVn UnUNuUU = new nNUuNvVn("Яркость радуги", 0.55F, 0.1F, 1.0F, 0.01F, true).UuUVuuUu(() -> !this.nNvNUVU.uUnuvNvvNU());
   public final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Размер радуги", 54.0F, 46.0F, 60.0F, 0.5F, false).UuUVuuUu(() -> !this.nNvNUVU.uUnuvNvvNU());
   public final UNvnUnnvUV UvUvUNuvNU = new UNvnUnnvUV("Цвет зари", new Color(255, 173, 122)).UuUVuuUu(() -> !this.NVNnnvnuunNv.C00OOC00oO("Рассвет"));
   private final Matrix4f nNnVnUNVV = new Matrix4f();
   private final Matrix4f nuunNvv = new Matrix4f();
   private final Matrix4f uUVVvVVNvvn = new Matrix4f();
   private final Matrix4f vvUVNVvvNUv = new Matrix4f();
   private final Vector4f UuNnnVnuNNV = new Vector4f();
   private final FloatBuffer uUVvnUuNvvN = BufferUtils.createFloatBuffer(16);
   private vVvUNNUVVnNn UUuUnNVNuuv;
   private int NVuNUuVnVUN = -1;
   private int NVuunNnvvvVu = -1;
   private int vNnNuuvVn = -1;
   private int VUuuVUnun = -1;
   private int vVVuuVVv = -1;
   private int VuunNUUUvu = -1;
   private int NNUUNUuVNNVn = -1;
   private int VvVvnNUnvuvV = -1;
   private int ccOO0COcoco0 = -1;
   private int NUVvUUVuVNVv = -1;
   private int nNuVunNUVu = -1;
   private int UNvvunVVn = -1;
   private int UnvuVuVnNuvu = -1;
   private int UvNNVUVNVuvV = -1;
   private int NnunUUnU = -1;
   private int nvuVvuNnNUnv = -1;
   private int NnVnNVN = -1;
   private int vnvvNvUnVv = -1;
   private int OCOocoOoOO = -1;
   private int o0Ooc0COOoc = -1;
   private int nvvnUnUn = -1;
   private int UnUUVuVunvVu = -1;
   private int nnvuvUNuUnN = -1;
   private int UVnuVUUVnnU = -1;
   private int VunnVNvNV;
   private int NvUVUvVVnUu;
   private int unnUnUNVnN;
   private int NnuUnUNnu;
   private int UnnnvvU;
   private int VUUnuVvVu;
   private int VvVuvUvvNNVv;
   private int UnnNNvuvvUU;
   private boolean VNNnnVUuvv;
   private boolean vUvUvUNNuNvn;
   private float uuVuUuuVVNvN = 0.5F;
   private float VvuUUUNNNv = 0.5F;
   private float uuuVnuvnnNnU;
   private float nNunUnVN;
   private float VnVuuvVvnNv = -0.39F;
   private final float[] vuvvuVuVv = new float[18];

   public AtmoDawnFog() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU
         }
      );
   }

   public static boolean UuuNnUvUuv() {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         AtmoDawnFog var0 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AtmoDawnFog.class);
         return var0 != null && var0.nuUnNvnuUu && !var0.vUvUvUNNuNvn;
      } else {
         return false;
      }
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.UvnvNVnnnnNU();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @vuVvUNNvVNV(
      UuUVuuUu = 1
   )
   public void UuUVuuUu(uUnnuUn var1) {
      if (this.nuUnNvnuUu && !this.vUvUvUNNuNvn && var1 != null) {
         if (RenderSystem.isOnRenderThread()) {
            class_310 var2 = var1.uUnuvNvvNU();
            if (var2 != null && var2.field_1687 != null && var2.field_1724 != null && var1.uNNnnnuuuN() != null) {
               class_4184 var3 = var1.uNNnnnuuuN().UuUVuuUu();
               if (var3 != null) {
                  class_1041 var4 = var2.method_22683();
                  if (var4 != null && !var4.method_65966()) {
                     int var5 = var4.method_4489();
                     int var6 = var4.method_4506();
                     if (var5 > 1 && var6 > 1) {
                        class_276 var7 = var2.method_1522();
                        if (var7 != null) {
                           int var8 = UuUVuuUu(var7.method_30277());
                           int var9 = UuUVuuUu(var7.method_30278());
                           if (var8 > 0 && var9 > 0) {
                              if (!(this.uVunuUNVVUUV.uUnuvNvvNU() <= 1.0E-4F)) {
                                 float var10 = var1.uVUuuVnNVU();
                                 float var11 = ((float)(var2.field_1687.method_8510() % 100000L) + var10) * 0.05F;
                                 float var12 = var2.field_1687.method_8442(var10);
                                 float var13 = -((float)Math.sin(var12));
                                 int var14 = this.nUUVuvU();
                                 float var15 = this.UuUVuuUu(var14);
                                 float var16 = var13 >= 0.0F ? 1.0F : -1.0F;
                                 float var17 = var16 * (float)Math.cos(var15);
                                 float var18 = (float)Math.sin(var15);
                                 float var19 = 0.3F;
                                 this.nNunUnVN = -var16 * (float)Math.cos(var19);
                                 this.VnVuuvVvnNv = -((float)Math.sin(var19));
                                 int var20 = this.C00OOC00oO(var14);
                                 float var21 = 192.0F;
                                 if (var2.field_1690 != null) {
                                    var21 = ((Integer)var2.field_1690.method_42503().method_41753()).intValue() * 16.0F;
                                 }

                                 VvuuVNVUn.NVnVnNnN var22 = VvuuVNVUn.UuUVuuUu();
                                 boolean var27 = false /* VF: Semaphore variable */;

                                 label220: {
                                    label207: {
                                       label221: {
                                          try {
                                             var27 = true;
                                             this.vNVuvnUUnuUn();
                                             if (!this.vUvUvUNNuNvn) {
                                                if (this.C00OOC00oO(var5, var6)) {
                                                   if (!this.UuUVuuUu(var8, var5, var6)) {
                                                      var27 = false;
                                                      break label220;
                                                   }

                                                   class_243 var23 = var3.method_19326();
                                                   this.uUVVvVVNvvn.set(var1.VVuuUN());
                                                   this.vvUVNVvvNUv.set(var1.vNUvnnVnUvu());
                                                   this.UuUVuuUu(var17, var18);
                                                   this.nNnVnUNVV.set(this.vvUVNVvvNUv).invert();
                                                   this.nuunNvv.set(this.uUVVvVVNvvn).invert();
                                                   this.nuunNvv.m30((float)var23.field_1352);
                                                   this.nuunNvv.m31((float)var23.field_1351);
                                                   this.nuunNvv.m32((float)var23.field_1350);
                                                   this.UuUVuuUu(var8, var9, var5, var6, var23, var11, var17, var18, var14, var20, var21);
                                                   var27 = false;
                                                   break label207;
                                                }

                                                var27 = false;
                                             } else {
                                                var27 = false;
                                             }
                                             break label221;
                                          } catch (Throwable var28) {
                                             this.vUvUvUNNuNvn = true;
                                             System.err.println("[AtmoDawnFog] renderer disabled: " + var28.getMessage());
                                             var28.printStackTrace();
                                             var27 = false;
                                          } finally {
                                             if (var27) {
                                                if (this.VUUnuVvVu != 0) {
                                                   GL30.glBindFramebuffer(36160, this.VUUnuVvVu);
                                                   GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                                }

                                                GL13.glActiveTexture(33985);
                                                GL11.glBindTexture(3553, 0);
                                                GL13.glActiveTexture(33984);
                                                GL11.glBindTexture(3553, 0);
                                                GL20.glUseProgram(0);
                                                VvuuVNVUn.uUnuvNvvNU(var22);
                                             }
                                          }

                                          if (this.VUUnuVvVu != 0) {
                                             GL30.glBindFramebuffer(36160, this.VUUnuVvVu);
                                             GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                          }

                                          GL13.glActiveTexture(33985);
                                          GL11.glBindTexture(3553, 0);
                                          GL13.glActiveTexture(33984);
                                          GL11.glBindTexture(3553, 0);
                                          GL20.glUseProgram(0);
                                          VvuuVNVUn.uUnuvNvvNU(var22);
                                          return;
                                       }

                                       if (this.VUUnuVvVu != 0) {
                                          GL30.glBindFramebuffer(36160, this.VUUnuVvVu);
                                          GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                       }

                                       GL13.glActiveTexture(33985);
                                       GL11.glBindTexture(3553, 0);
                                       GL13.glActiveTexture(33984);
                                       GL11.glBindTexture(3553, 0);
                                       GL20.glUseProgram(0);
                                       VvuuVNVUn.uUnuvNvvNU(var22);
                                       return;
                                    }

                                    if (this.VUUnuVvVu != 0) {
                                       GL30.glBindFramebuffer(36160, this.VUUnuVvVu);
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                    }

                                    GL13.glActiveTexture(33985);
                                    GL11.glBindTexture(3553, 0);
                                    GL13.glActiveTexture(33984);
                                    GL11.glBindTexture(3553, 0);
                                    GL20.glUseProgram(0);
                                    VvuuVNVUn.uUnuvNvvNU(var22);
                                    return;
                                 }

                                 if (this.VUUnuVvVu != 0) {
                                    GL30.glBindFramebuffer(36160, this.VUUnuVvVu);
                                    GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                 }

                                 GL13.glActiveTexture(33985);
                                 GL11.glBindTexture(3553, 0);
                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, 0);
                                 GL20.glUseProgram(0);
                                 VvuuVNVUn.uUnuvNvvNU(var22);
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

   private void UuUVuuUu(int var1, int var2, int var3, int var4, class_243 var5, float var6, float var7, float var8, int var9, int var10, float var11) {
      GL30.glBindFramebuffer(36160, this.VUUnuVvVu);
      GL30.glFramebufferTexture2D(36160, 36064, 3553, var1, 0);
      GL11.glDrawBuffer(36064);
      if (GL30.glCheckFramebufferStatus(36160) == 36053) {
         GL11.glViewport(0, 0, var3, var4);
         GL11.glDisable(3089);
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         GL11.glDisable(3042);
         GL11.glDisable(36281);
         GL11.glColorMask(true, true, true, true);
         GL11.glDepthMask(false);
         this.UUuUnNVNuuv.UuUVuuUu();
         float var12 = this.UNnVVNvvnVvU.uUnuvNvvNU();
         float var13 = var12 - 18.0F;
         this.UuUVuuUu(var9, var10);
         if (this.NVuNUuVnVUN >= 0) {
            GL20.glUniform1i(this.NVuNUuVnVUN, 0);
         }

         if (this.NVuunNnvvvVu >= 0) {
            GL20.glUniform1i(this.NVuunNnvvvVu, 1);
         }

         if (this.vNnNuuvVn >= 0) {
            GL20.glUniform2f(this.vNnNuuvVn, var3, var4);
         }

         if (this.VUuuVUnun >= 0) {
            GL20.glUniform1f(this.VUuuVUnun, var6);
         }

         if (this.vVVuuVVv >= 0) {
            GL20.glUniform3f(this.vVVuuVVv, (float)var5.field_1352, (float)var5.field_1351, (float)var5.field_1350);
         }

         if (this.VuunNUUUvu >= 0) {
            this.UuUVuuUu(this.VuunNUUUvu, this.nNnVnUNVV);
         }

         if (this.NNUUNUuVNNVn >= 0) {
            this.UuUVuuUu(this.NNUUNUuVNNVn, this.nuunNvv);
         }

         if (this.VvVvnNUnvuvV >= 0) {
            GL20.glUniform3f(this.VvVvnNUnvuvV, var7, var8, 0.0F);
         }

         if (this.ccOO0COcoco0 >= 0) {
            GL20.glUniform3f(this.ccOO0COcoco0, this.uuVuUuuVVNvN, this.VvuUUUNNNv, this.uuuVnuvnnNnU);
         }

         if (this.NUVvUUVuVNVv >= 0) {
            GL20.glUniform1f(this.NUVvUUVuVNVv, UuUVuuUu(this.uVunuUNVVUUV.uUnuvNvvNU(), 0.05F, 0.8F));
         }

         if (this.nNuVunNUVu >= 0) {
            GL20.glUniform1f(this.nNuVunNUVu, var13);
         }

         if (this.UNvvunVVn >= 0) {
            GL20.glUniform1f(this.UNvvunVVn, var12);
         }

         if (this.UnvuVuVnNuvu >= 0) {
            GL20.glUniform1f(this.UnvuVuVnNuvu, var11);
         }

         if (this.UvNNVUVNVuvV >= 0) {
            GL20.glUniform3f(this.UvNNVUVNVuvV, this.vuvvuVuVv[0], this.vuvvuVuVv[1], this.vuvvuVuVv[2]);
         }

         if (this.NnunUUnU >= 0) {
            GL20.glUniform3f(this.NnunUUnU, this.vuvvuVuVv[3], this.vuvvuVuVv[4], this.vuvvuVuVv[5]);
         }

         if (this.nvuVvuNnNUnv >= 0) {
            GL20.glUniform3f(this.nvuVvuNnNUnv, this.vuvvuVuVv[6], this.vuvvuVuVv[7], this.vuvvuVuVv[8]);
         }

         if (this.NnVnNVN >= 0) {
            GL20.glUniform3f(this.NnVnNVN, this.vuvvuVuVv[9], this.vuvvuVuVv[10], this.vuvvuVuVv[11]);
         }

         if (this.vnvvNvUnVv >= 0) {
            GL20.glUniform3f(this.vnvvNvUnVv, this.vuvvuVuVv[12], this.vuvvuVuVv[13], this.vuvvuVuVv[14]);
         }

         if (this.OCOocoOoOO >= 0) {
            GL20.glUniform3f(this.OCOocoOoOO, this.vuvvuVuVv[15], this.vuvvuVuVv[16], this.vuvvuVuVv[17]);
         }

         if (this.o0Ooc0COOoc >= 0) {
            GL20.glUniform1f(this.o0Ooc0COOoc, this.nNvNUVU.uUnuvNvvNU() ? UuUVuuUu(this.UnUNuUU.uUnuvNvvNU(), 0.0F, 1.0F) : 0.0F);
         }

         if (this.nvvnUnUn >= 0) {
            GL20.glUniform3f(this.nvvnUnUn, this.nNunUnVN, this.VnVuuvVvnNv, 0.0F);
         }

         if (this.UnUUVuVunvVu >= 0) {
            GL20.glUniform1f(this.UnUUVuVunvVu, UuUVuuUu(this.uUVuVvuNUvnu.uUnuvNvvNU(), 40.0F, 64.0F));
         }

         if (this.nnvuvUNuUnN >= 0) {
            GL20.glUniform1f(this.nnvuvUNuUnN, UuUVuuUu(this.uNnUnnuNUnNu.uUnuvNvvNU(), 0.0F, 1.0F));
         }

         if (this.UVnuVUUVnnU >= 0) {
            GL20.glUniform1f(this.UVnuVUUVnnU, UuUVuuUu(this.NnUuNNU.uUnuvNvvNU(), 0.0F, 1.0F));
         }

         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, this.NvUVUvVVnUu);
         GL13.glActiveTexture(33985);
         GL11.glBindTexture(3553, var2);
         GL13.glActiveTexture(33984);
         GL30.glBindVertexArray(this.VvVuvUvvNNVv);
         VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
         GL11.glDrawArrays(4, 0, 6);
         GL30.glBindVertexArray(0);
      }
   }

   private void UuUVuuUu(float var1, float var2) {
      this.uuVuUuuVVNvN = 0.5F;
      this.VvuUUUNNNv = 0.5F;
      this.uuuVnuvnnNnU = 0.0F;
      this.UuNnnVnuNNV.set(var1, var2, 0.0F, 0.0F);
      this.uUVVvVVNvvn.transform(this.UuNnnVnuNNV);
      float var3 = this.UuNnnVnuNNV.x;
      float var4 = this.UuNnnVnuNNV.y;
      float var5 = this.UuNnnVnuNNV.z;
      float var6 = -var5;
      if (!(var6 <= 1.0E-4F)) {
         this.UuNnnVnuNNV.set(var3 * 1000.0F, var4 * 1000.0F, var5 * 1000.0F, 1.0F);
         this.vvUVNVvvNUv.transform(this.UuNnnVnuNNV);
         if (!(this.UuNnnVnuNNV.w <= 1.0E-4F)) {
            this.uuVuUuuVVNvN = this.UuNnnVnuNNV.x / this.UuNnnVnuNNV.w * 0.5F + 0.5F;
            this.VvuUUUNNNv = this.UuNnnVnuNNV.y / this.UuNnnVnuNNV.w * 0.5F + 0.5F;
            this.uuuVnuvnnNnU = UuUVuuUu(var6 * 4.0F, 0.0F, 1.0F);
         }
      }
   }

   private void UuUVuuUu(int var1, int var2) {
      Color var3 = this.UvUvUNuvNU.uUnuvNvvNU();
      float var4 = var3.getRed() / 255.0F;
      float var5 = var3.getGreen() / 255.0F;
      float var6 = var3.getBlue() / 255.0F;
      float var7 = (var2 >> 16 & 0xFF) / 255.0F;
      float var8 = (var2 >> 8 & 0xFF) / 255.0F;
      float var9 = (var2 & 0xFF) / 255.0F;
      if (var1 == 1) {
         UuUVuuUu(this.vuvvuVuVv, 0, 0.135F, 0.125F, 0.3F);
         UuUVuuUu(this.vuvvuVuVv, 3, 0.89F, 0.46F, 0.55F);
         UuUVuuUu(this.vuvvuVuVv, 6, 0.38F, 0.35F, 0.56F);
         UuUVuuUu(this.vuvvuVuVv, 9, 0.8F, 0.52F, 0.62F);
         UuUVuuUu(this.vuvvuVuVv, 12, 0.47F, 0.44F, 0.64F);
         UuUVuuUu(this.vuvvuVuVv, 15, 0.92F, 0.56F, 0.72F);
      } else if (var1 == 2) {
         UuUVuuUu(this.vuvvuVuVv, 0, 0.085F, 0.1F, 0.2F, var7, var8, var9, 0.3F);
         UuUVuuUu(this.vuvvuVuVv, 3, var7, var8, var9, 1.0F, 0.93F, 0.82F, 0.35F);
         UuUVuuUu(this.vuvvuVuVv, 6, 0.52F, 0.58F, 0.74F, var7, var8, var9, 0.28F);
         UuUVuuUu(this.vuvvuVuVv, 9, var7, var8, var9, 0.97F, 0.93F, 0.88F, 0.45F);
         UuUVuuUu(this.vuvvuVuVv, 12, 0.58F, 0.63F, 0.76F, var7, var8, var9, 0.35F);
         UuUVuuUu(this.vuvvuVuVv, 15, var7, var8, var9, 1.0F, 0.96F, 0.88F, 0.3F);
      } else {
         UuUVuuUu(this.vuvvuVuVv, 0, 0.16F, 0.19F, 0.38F, var4, var5, var6, 0.14F);
         UuUVuuUu(this.vuvvuVuVv, 3, UuUVuuUu(var4 * 1.12F, 0.0F, 1.0F), UuUVuuUu(var5 * 0.88F, 0.0F, 1.0F), UuUVuuUu(var6 * 0.62F, 0.0F, 1.0F));
         UuUVuuUu(this.vuvvuVuVv, 6, 0.56F, 0.62F, 0.8F);
         UuUVuuUu(this.vuvvuVuVv, 9, var4, var5, var6, 0.95F, 0.55F, 0.63F, 0.42F);
         UuUVuuUu(this.vuvvuVuVv, 12, 0.6F, 0.67F, 0.82F);
         UuUVuuUu(this.vuvvuVuVv, 15, UuUVuuUu(var4 * 1.08F, 0.0F, 1.0F), UuUVuuUu(var5 * 0.94F, 0.0F, 1.0F), UuUVuuUu(var6 * 0.72F, 0.0F, 1.0F));
      }
   }

   private static void UuUVuuUu(float[] var0, int var1, float var2, float var3, float var4) {
      var0[var1] = var2;
      var0[var1 + 1] = var3;
      var0[var1 + 2] = var4;
   }

   private static void UuUVuuUu(float[] var0, int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = UuUVuuUu(var8, 0.0F, 1.0F);
      float var10 = UuUVuuUu(var2);
      float var11 = UuUVuuUu(var3);
      float var12 = UuUVuuUu(var4);
      float var13 = UuUVuuUu(var5);
      float var14 = UuUVuuUu(var6);
      float var15 = UuUVuuUu(var7);
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
      var0[var1] = C00OOC00oO(var28);
      var0[var1 + 1] = C00OOC00oO(var29);
      var0[var1 + 2] = C00OOC00oO(var30);
   }

   private static float UuUVuuUu(float var0) {
      return var0 <= 0.04045F ? var0 / 12.92F : (float)Math.pow((var0 + 0.055F) / 1.055F, 2.4);
   }

   private static float C00OOC00oO(float var0) {
      var0 = UuUVuuUu(var0, 0.0F, 1.0F);
      return var0 <= 0.0031308F ? var0 * 12.92F : (float)(1.055 * Math.pow(var0, 0.4166666666666667) - 0.055);
   }

   private int nUUVuvU() {
      if (this.NVNnnvnuunNv.C00OOC00oO("Сумерки")) {
         return 1;
      } else {
         return this.NVNnnvnuunNv.C00OOC00oO("Тема") ? 2 : 0;
      }
   }

   private float UuUVuuUu(int var1) {
      if (var1 == 1) {
         return -0.045F;
      } else {
         return var1 == 2 ? 0.13F : 0.11F;
      }
   }

   private int C00OOC00oO(int var1) {
      if (var1 == 1) {
         return 13203624;
      } else if (var1 == 2) {
         try {
            if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null) {
               NvVNvUvunNNu var2 = NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO();
               if (var2 == NvVNvUvunNNu.CUSTOM && NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO != null) {
                  return NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO.vNUvnnVnUvu() & 16777215;
               }

               if (var2 != null && var2.UuUVuuUu() != null) {
                  return var2.UuUVuuUu().getRGB() & 16777215;
               }
            }
         } catch (Throwable var3) {
         }

         return 8230143;
      } else {
         return this.UvUvUNuvNU.vNUvnnVnUvu() & 16777215;
      }
   }

   private boolean UuUVuuUu(int var1, int var2, int var3) {
      if (var1 > 0 && this.VunnVNvNV != 0) {
         if (this.UnnnvvU == 0) {
            this.UnnnvvU = GL30.glGenFramebuffers();
         }

         GL11.glDisable(3089);
         GL11.glDisable(3042);
         GL11.glDisable(2884);
         GL11.glDisable(2929);
         GL11.glDisable(36281);
         GL30.glBindFramebuffer(36008, this.UnnnvvU);
         GL30.glFramebufferTexture2D(36008, 36064, 3553, var1, 0);
         if (GL30.glCheckFramebufferStatus(36008) != 36053) {
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            return false;
         } else {
            GL30.glBindFramebuffer(36009, this.VunnVNvNV);
            GL11.glReadBuffer(36064);
            GL11.glDrawBuffer(36064);
            GL30.glBlitFramebuffer(0, 0, var2, var3, 0, 0, var2, var3, 16384, 9728);
            GL30.glBindFramebuffer(36008, this.UnnnvvU);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            return true;
         }
      } else {
         return false;
      }
   }

   private boolean C00OOC00oO(int var1, int var2) {
      if (var1 > 0 && var2 > 0) {
         if (this.NvUVUvVVnUu != 0 && (this.unnUnUNVnN != var1 || this.NnuUnUNnu != var2 || this.VunnVNvNV == 0)) {
            this.UnUNVVVNuv();
         }

         if (this.NvUVUvVVnUu == 0) {
            this.NvUVUvVVnUu = GL11.glGenTextures();
            GL11.glBindTexture(3553, this.NvUVUvVVnUu);
            GL11.glTexParameteri(3553, 10241, 9729);
            GL11.glTexParameteri(3553, 10240, 9729);
            GL11.glTexParameteri(3553, 10242, 33071);
            GL11.glTexParameteri(3553, 10243, 33071);
            o000OOoCO0OO.UuUVuuUu(32856, var1, var2, 6408, 5121);
            this.VunnVNvNV = GL30.glGenFramebuffers();
            GL30.glBindFramebuffer(36160, this.VunnVNvNV);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, this.NvUVUvVVnUu, 0);
            GL11.glDrawBuffer(36064);
            if (GL30.glCheckFramebufferStatus(36160) != 36053) {
               this.UnUNVVVNuv();
               return false;
            }
         }

         this.unnUnUNVnN = var1;
         this.NnuUnUNnu = var2;
         return true;
      } else {
         return false;
      }
   }

   private void UnUNVVVNuv() {
      if (this.VunnVNvNV != 0) {
         GL30.glDeleteFramebuffers(this.VunnVNvNV);
         this.VunnVNvNV = 0;
      }

      if (this.NvUVUvVVnUu != 0) {
         GL11.glDeleteTextures(this.NvUVUvVVnUu);
         this.NvUVUvVVnUu = 0;
      }

      this.unnUnUNVnN = 0;
      this.NnuUnUNnu = 0;
   }

   private void vNVuvnUUnuUn() {
      if (!this.VNNnnVUuvv) {
         this.UUuUnNVNuuv = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/world/world_volume.vert", "assets/wild/shaders/dawnfog/world_fog_fresnel.frag");
         this.VvVuvUvvNNVv = GL30.glGenVertexArrays();
         this.UnnNNvuvvUU = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.VvVuvUvvNNVv);
         GL15.glBindBuffer(34962, this.UnnNNvuvvUU);
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
         if (this.VUUnuVvVu == 0) {
            this.VUUnuVvVu = GL30.glGenFramebuffers();
         }

         this.NVuNUuVnVUN = this.UUuUnNVNuuv.UuUVuuUu("u_ScreenTexture");
         this.NVuunNnvvvVu = this.UUuUnNVNuuv.UuUVuuUu("u_DepthTexture");
         this.vNnNuuvVn = this.UUuUnNVNuuv.UuUVuuUu("u_Resolution");
         this.VUuuVUnun = this.UUuUnNVNuuv.UuUVuuUu("u_Time");
         this.vVVuuVVv = this.UUuUnNVNuuv.UuUVuuUu("u_CameraPos");
         this.VuunNUUUvu = this.UUuUnNVNuuv.UuUVuuUu("u_InverseProjectionMatrix");
         this.NNUUNUuVNNVn = this.UUuUnNVNuuv.UuUVuuUu("u_InverseViewMatrix");
         this.VvVvnNUnvuvV = this.UUuUnNVNuuv.UuUVuuUu("u_SunDirection");
         this.ccOO0COcoco0 = this.UUuUnNVNuuv.UuUVuuUu("u_SunScreen");
         this.NUVvUUVuVNVv = this.UUuUnNVNuuv.UuUVuuUu("u_FogDensity");
         this.nNuVunNUVu = this.UUuUnNVNuuv.UuUVuuUu("u_FogMinHeight");
         this.UNvvunVVn = this.UUuUnNVNuuv.UuUVuuUu("u_FogMaxHeight");
         this.UnvuVuVnNuvu = this.UUuUnNVNuuv.UuUVuuUu("u_ViewDistance");
         this.UvNNVUVNVuvV = this.UUuUnNVNuuv.UuUVuuUu("u_PaletteZenith");
         this.NnunUUnU = this.UUuUnNVNuuv.UuUVuuUu("u_PaletteHorizonWarm");
         this.nvuVvuNnNUnv = this.UUuUnNVNuuv.UuUVuuUu("u_PaletteHorizonCool");
         this.NnVnNVN = this.UUuUnNVNuuv.UuUVuuUu("u_PaletteFogWarm");
         this.vnvvNvUnVv = this.UUuUnNVNuuv.UuUVuuUu("u_PaletteFogCool");
         this.OCOocoOoOO = this.UUuUnNVNuuv.UuUVuuUu("u_PaletteRay");
         this.o0Ooc0COOoc = this.UUuUnNVNuuv.UuUVuuUu("u_Rainbow");
         this.nvvnUnUn = this.UUuUnNVNuuv.UuUVuuUu("u_RainbowDir");
         this.UnUUVuVunvVu = this.UUuUnNVNuuv.UuUVuuUu("u_RainbowSize");
         this.nnvuvUNuUnN = this.UUuUnNVNuuv.UuUVuuUu("u_GodRays");
         this.UVnuVUUVnnU = this.UUuUnNVNuuv.UuUVuuUu("u_Softness");
         this.VNNnnVUuvv = true;
      }
   }

   private void UvnvNVnnnnNU() {
      if (RenderSystem.isOnRenderThread()) {
         this.UnUNVVVNuv();
         if (this.UnnnvvU != 0) {
            GL30.glDeleteFramebuffers(this.UnnnvvU);
            this.UnnnvvU = 0;
         }

         if (this.VUUnuVvVu != 0) {
            GL30.glDeleteFramebuffers(this.VUUnuVvVu);
            this.VUUnuVvVu = 0;
         }

         if (this.VvVuvUvvNNVv != 0) {
            GL30.glDeleteVertexArrays(this.VvVuvUvvNNVv);
            this.VvVuvUvvNNVv = 0;
         }

         if (this.UnnNNvuvvUU != 0) {
            GL15.glDeleteBuffers(this.UnnNNvuvvUU);
            this.UnnNNvuvvUU = 0;
         }

         if (this.UUuUnNVNuuv != null) {
            this.UUuUnNVNuuv.C00OOC00oO();
            this.UUuUnNVNuuv = null;
         }

         this.VNNnnVUuvv = false;
         this.vUvUvUNNuNvn = false;
      }
   }

   private void UuUVuuUu(int var1, Matrix4f var2) {
      this.uUVvnUuNvvN.clear();
      var2.get(this.uUVvnUuNvvN);
      GL20.glUniformMatrix4fv(var1, false, this.uUVvnUuNvvN);
   }

   private static int UuUVuuUu(Object var0) {
      return var0 instanceof class_10868 var1 ? var1.method_68427() : 0;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }
}
