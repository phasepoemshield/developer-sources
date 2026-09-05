package ru.metaculture.protection;

import net.minecraft.class_10868;
import net.minecraft.class_276;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL32;

public final class nVnnuvvNunnN {
   private nVnnuvvNunnN() {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void UuUVuuUu(class_310 var0, float var1) {
      if (var0 != null && var0.method_22683() != null && var0.field_1755 instanceof nuUnNNVUUnU var2 && !VvNUnuUUuN.uNNnnnuuuN()) {
         int var28 = var0.method_22683().method_4489();
         int var4 = var0.method_22683().method_4506();
         if (var28 > 0 && var4 > 0) {
            try {
               NVnVnNnN.uVUuuVnNVU();
            } catch (Throwable var25) {
               VNNUVUuN.UuUVuuUu(var2, "modern-gui", false, "renderer initialization failed", var25);
               return;
            }

            UnVNvNnU var5 = NVnVnNnN.UuUVuuUu();
            class_276 var6 = var0.method_1522();
            if (var5 == null || var6 == null) {
               VNNUVUuN.UuUVuuUu(var2, "modern-gui", false, "renderer or main framebuffer unavailable", null);
            } else if (var6.method_30277() instanceof class_10868 var8 && var8.method_68427() > 0) {
               VvuuVNVUn.NVnVnNnN var9 = VvuuVNVUn.UuUVuuUu();
               int var10 = 0;
               int var11 = 0;
               int var12 = 0;
               int var13 = 0;
               boolean var14 = false;
               boolean var22 = false /* VF: Semaphore variable */;

               label316: {
                  label317: {
                     label328: {
                        label329: {
                           try {
                              var22 = true;
                              var10 = NnUuNVvUvvNn.UuUVuuUu();
                              if (var10 == 0) {
                                 VNNUVUuN.UuUVuuUu(var2, "modern-gui", false, "temp fbo unavailable", null);
                                 var22 = false;
                                 break label316;
                              }

                              if (!VvuuVNVUn.UuUVuuUu(36160, var10)) {
                                 NnUuNVvUvvNn.UuUVuuUu(var10);
                                 var10 = 0;
                                 VNNUVUuN.UuUVuuUu(var2, "modern-gui", false, "temp fbo invalid", null);
                                 var22 = false;
                                 break label317;
                              }

                              var11 = GL30.glGetFramebufferAttachmentParameteri(36160, 36064, 36048);
                              if (var11 != 0) {
                                 var12 = GL30.glGetFramebufferAttachmentParameteri(36160, 36064, 36049);
                                 if (var11 == 5890) {
                                    var13 = GL30.glGetFramebufferAttachmentParameteri(36160, 36064, 36050);
                                 }
                              }

                              GL30.glFramebufferTexture2D(36160, 36064, 3553, var8.method_68427(), 0);
                              GL11.glDrawBuffer(36064);
                              if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                 GL30.glDeleteFramebuffers(var10);
                                 NnUuNVvUvvNn.UuUVuuUu(var10);
                                 var10 = 0;
                                 VNNUVUuN.UuUVuuUu(var2, "modern-gui", false, "temp fbo incomplete", null);
                                 var22 = false;
                                 break label328;
                              }

                              GL11.glViewport(0, 0, var28, var4);
                              GL11.glColorMask(true, true, true, true);
                              GL11.glDisable(3089);
                              GL11.glDisable(2929);
                              GL11.glDisable(2884);
                              GL11.glEnable(3042);

                              try {
                                 vNvnnVvvVUu.C00OOC00oO();
                              } catch (Throwable var24) {
                              }

                              var5.UuUVuuUu(var28, var4);
                              var14 = true;
                              var2.UuUVuuUu(var5, null, var28, var4, var1);
                              var5.C00OOC00oO();
                              var14 = false;
                              VvuuVNVUn.UuUVuuUu(36160, var10);
                              GL11.glDrawBuffer(36064);
                              GL11.glViewport(0, 0, var28, var4);

                              try {
                                 NNUuUVvUUU.UuUVuuUu().UuUVuuUu(var1);
                              } catch (Throwable var23) {
                                 NNUuUVvUUU.UuUVuuUu().C00OOC00oO();
                                 VNNUVUuN.UuUVuuUu(var2, "theme-shockwave", false, "theme composition failed", var23);
                              }

                              VvuuVNVUn.UuUVuuUu(36160, var10);
                              GL11.glDrawBuffer(36064);
                              GL11.glViewport(0, 0, var28, var4);
                              oocOO0CCC0O.UuUVuuUu().vVvUvVVuuNvV();
                              VNNUVUuN.UuUVuuUu(var2, "modern-gui", true, "post-vanilla composition complete", null);
                              var22 = false;
                           } catch (Throwable var26) {
                              VNNUVUuN.UuUVuuUu(var2, "modern-gui", false, "post-vanilla composition failed", var26);
                              var22 = false;
                              break label329;
                           } finally {
                              if (var22) {
                                 if (var14) {
                                    var5.UuUVuuUu();
                                 }

                                 if (var10 != 0 && VvuuVNVUn.UuUVuuUu(36160, var10)) {
                                    if (var11 == 5890) {
                                       GL32.glFramebufferTexture(36160, 36064, var12, var13);
                                    } else if (var11 == 36161) {
                                       GL30.glFramebufferRenderbuffer(36160, 36064, 36161, var12);
                                    } else {
                                       GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                    }
                                 }

                                 VvuuVNVUn.uUnuvNvvNU(var9);
                                 VvuuVNVUn.vVvUvVVuuNvV(var9);
                              }
                           }

                           if (var14) {
                              var5.UuUVuuUu();
                           }

                           if (var10 != 0 && VvuuVNVUn.UuUVuuUu(36160, var10)) {
                              if (var11 == 5890) {
                                 GL32.glFramebufferTexture(36160, 36064, var12, var13);
                              } else if (var11 == 36161) {
                                 GL30.glFramebufferRenderbuffer(36160, 36064, 36161, var12);
                              } else {
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                              }
                           }

                           VvuuVNVUn.uUnuvNvvNU(var9);
                           VvuuVNVUn.vVvUvVVuuNvV(var9);
                           return;
                        }

                        if (var14) {
                           var5.UuUVuuUu();
                        }

                        if (var10 != 0 && VvuuVNVUn.UuUVuuUu(36160, var10)) {
                           if (var11 == 5890) {
                              GL32.glFramebufferTexture(36160, 36064, var12, var13);
                           } else if (var11 == 36161) {
                              GL30.glFramebufferRenderbuffer(36160, 36064, 36161, var12);
                           } else {
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           }
                        }

                        VvuuVNVUn.uUnuvNvvNU(var9);
                        VvuuVNVUn.vVvUvVVuuNvV(var9);
                        return;
                     }

                     if (var14) {
                        var5.UuUVuuUu();
                     }

                     if (var10 != 0 && VvuuVNVUn.UuUVuuUu(36160, var10)) {
                        if (var11 == 5890) {
                           GL32.glFramebufferTexture(36160, 36064, var12, var13);
                        } else if (var11 == 36161) {
                           GL30.glFramebufferRenderbuffer(36160, 36064, 36161, var12);
                        } else {
                           GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                        }
                     }

                     VvuuVNVUn.uUnuvNvvNU(var9);
                     VvuuVNVUn.vVvUvVVuuNvV(var9);
                     return;
                  }

                  if (var14) {
                     var5.UuUVuuUu();
                  }

                  if (var10 != 0 && VvuuVNVUn.UuUVuuUu(36160, var10)) {
                     if (var11 == 5890) {
                        GL32.glFramebufferTexture(36160, 36064, var12, var13);
                     } else if (var11 == 36161) {
                        GL30.glFramebufferRenderbuffer(36160, 36064, 36161, var12);
                     } else {
                        GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                     }
                  }

                  VvuuVNVUn.uUnuvNvvNU(var9);
                  VvuuVNVUn.vVvUvVVuuNvV(var9);
                  return;
               }

               if (var14) {
                  var5.UuUVuuUu();
               }

               if (var10 != 0 && VvuuVNVUn.UuUVuuUu(36160, var10)) {
                  if (var11 == 5890) {
                     GL32.glFramebufferTexture(36160, 36064, var12, var13);
                  } else if (var11 == 36161) {
                     GL30.glFramebufferRenderbuffer(36160, 36064, 36161, var12);
                  } else {
                     GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                  }
               }

               VvuuVNVUn.uUnuvNvvNU(var9);
               VvuuVNVUn.vVvUvVVuuNvV(var9);
            } else {
               VNNUVUuN.UuUVuuUu(var2, "modern-gui", false, "main color attachment unavailable", null);
            }
         }
      }
   }
}
