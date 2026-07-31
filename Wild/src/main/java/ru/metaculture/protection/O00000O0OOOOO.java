package ru.metaculture.protection;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.stb.STBImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

public final class O00000O0OOOOO {
   private static final O00000O0OOOOO O00000000 = new O00000O0OOOOO();
   private static final int O000000000 = -1;
   private final Map<String, Integer> O0000000000 = new HashMap<>();

   private O00000O0OOOOO() {
   }

   public static O00000O0OOOOO O00000000() {
      return O00000000;
   }

   public int O00000000(String string, int i, O00000O0OOOO0 o00000O0OOOO0) {
      if (o00000O0OOOO0 == null) {
         return 0;
      } else {
         O00000O0OOOO0.W201 var4 = o00000O0OOOO0.O00000000(i);
         if (var4 != null && var4.O000000000().length != 0) {
            String var5 = string + "|" + i;
            Integer var6 = this.O0000000000.get(var5);
            if (var6 != null) {
               return var6 == -1 ? 0 : var6;
            } else {
               int var7 = this.O00000000(var4);
               this.O0000000000.put(var5, var7 <= 0 ? -1 : var7);
               return var7 <= 0 ? 0 : var7;
            }
         } else {
            return 0;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private int O00000000(O00000O0OOOO0.W201 o0000000000000) {
      byte[] var2 = o0000000000000.O000000000();
      ByteBuffer var3 = MemoryUtil.memAlloc(var2.length);
      boolean var35 = false /* VF: Semaphore variable */;

      int var60;
      label347: {
         int var61;
         label346: {
            int var23;
            label345: {
               byte var24;
               label344: {
                  byte var5;
                  try {
                     var35 = true;
                     var3.put(var2).flip();
                     MemoryStack var4 = MemoryStack.stackPush();

                     label337: {
                        label336: {
                           label335: {
                              try {
                                 IntBuffer var59 = var4.mallocInt(1);
                                 IntBuffer var6 = var4.mallocInt(1);
                                 IntBuffer var7 = var4.mallocInt(1);
                                 ByteBuffer var8 = STBImage.stbi_load_from_memory(var3, var59, var6, var7, 4);
                                 if (var8 == null) {
                                    System.out.println("[Studio] texture decode failed: " + STBImage.stbi_failure_reason());
                                    var60 = 0;
                                    break label336;
                                 }

                                 boolean var43 = false /* VF: Semaphore variable */;

                                 label331: {
                                    label330: {
                                       try {
                                          var43 = true;
                                          var60 = var59.get(0);
                                          int var10 = var6.get(0);
                                          long var11 = (long)var60 * var10 * 4L;
                                          int var13 = GL11.glGetInteger(3379);
                                          if (var60 <= 0 || var10 <= 0 || var60 > var13 || var10 > var13 || var11 > var8.remaining()) {
                                             System.out.println("[Studio] invalid texture dimensions: " + var60 + "x" + var10);
                                             var61 = 0;
                                             var43 = false;
                                             break label331;
                                          }

                                          var61 = GL11.glGetInteger(32873);
                                          int var15 = GL11.glGetInteger(35055);
                                          int var16 = GL11.glGetInteger(3317);
                                          int var17 = GL11.glGetInteger(3314);
                                          int var18 = GL11.glGetInteger(3315);
                                          int var19 = GL11.glGetInteger(3316);
                                          int var20 = GL11.glGetInteger(3312);
                                          int var21 = GL11.glGetInteger(3313);
                                          int var22 = 0;
                                          boolean var51 = false /* VF: Semaphore variable */;

                                          label326: {
                                             try {
                                                var51 = true;
                                                var22 = GL11.glGenTextures();
                                                GL11.glBindTexture(3553, var22);
                                                GL11.glTexParameteri(3553, 10241, 9728);
                                                GL11.glTexParameteri(3553, 10240, 9728);
                                                GL11.glTexParameteri(3553, 10242, 33071);
                                                GL11.glTexParameteri(3553, 10243, 33071);
                                                GL15.glBindBuffer(35052, 0);
                                                GL11.glPixelStorei(3317, 1);
                                                GL11.glPixelStorei(3314, 0);
                                                GL11.glPixelStorei(3315, 0);
                                                GL11.glPixelStorei(3316, 0);
                                                GL11.glPixelStorei(3312, 0);
                                                GL11.glPixelStorei(3313, 0);
                                                GL11.glTexImage2D(3553, 0, 32856, var60, var10, 0, 6408, 5121, var8);
                                                var23 = var22;
                                                var51 = false;
                                             } catch (Throwable var53) {
                                                if (var22 > 0) {
                                                   GL11.glDeleteTextures(var22);
                                                }

                                                System.out
                                                   .println("[Studio] texture upload failed: " + var53.getClass().getSimpleName() + ": " + var53.getMessage());
                                                var24 = 0;
                                                var51 = false;
                                                break label326;
                                             } finally {
                                                if (var51) {
                                                   GL11.glPixelStorei(3313, var21);
                                                   GL11.glPixelStorei(3312, var20);
                                                   GL11.glPixelStorei(3316, var19);
                                                   GL11.glPixelStorei(3315, var18);
                                                   GL11.glPixelStorei(3314, var17);
                                                   GL11.glPixelStorei(3317, var16);
                                                   GL15.glBindBuffer(35052, var15);
                                                   GL11.glBindTexture(3553, var61);
                                                }
                                             }

                                             GL11.glPixelStorei(3313, var21);
                                             GL11.glPixelStorei(3312, var20);
                                             GL11.glPixelStorei(3316, var19);
                                             GL11.glPixelStorei(3315, var18);
                                             GL11.glPixelStorei(3314, var17);
                                             GL11.glPixelStorei(3317, var16);
                                             GL15.glBindBuffer(35052, var15);
                                             GL11.glBindTexture(3553, var61);
                                             var43 = false;
                                             break label330;
                                          }

                                          GL11.glPixelStorei(3313, var21);
                                          GL11.glPixelStorei(3312, var20);
                                          GL11.glPixelStorei(3316, var19);
                                          GL11.glPixelStorei(3315, var18);
                                          GL11.glPixelStorei(3314, var17);
                                          GL11.glPixelStorei(3317, var16);
                                          GL15.glBindBuffer(35052, var15);
                                          GL11.glBindTexture(3553, var61);
                                          var43 = false;
                                       } finally {
                                          if (var43) {
                                             STBImage.stbi_image_free(var8);
                                          }
                                       }

                                       STBImage.stbi_image_free(var8);
                                       break label337;
                                    }

                                    STBImage.stbi_image_free(var8);
                                    break label335;
                                 }

                                 STBImage.stbi_image_free(var8);
                              } catch (Throwable var56) {
                                 if (var4 != null) {
                                    try {
                                       var4.close();
                                    } catch (Throwable var52) {
                                       var56.addSuppressed(var52);
                                    }
                                 }

                                 throw var56;
                              }

                              if (var4 != null) {
                                 var4.close();
                                 var35 = false;
                              } else {
                                 var35 = false;
                              }
                              break label346;
                           }

                           if (var4 != null) {
                              var4.close();
                              var35 = false;
                           } else {
                              var35 = false;
                           }
                           break label345;
                        }

                        if (var4 != null) {
                           var4.close();
                           var35 = false;
                        } else {
                           var35 = false;
                        }
                        break label347;
                     }

                     if (var4 != null) {
                        var4.close();
                        var35 = false;
                     } else {
                        var35 = false;
                     }
                     break label344;
                  } catch (Throwable var57) {
                     System.out.println("[Studio] texture upload failed: " + var57.getClass().getSimpleName() + ": " + var57.getMessage());
                     var5 = 0;
                     var35 = false;
                  } finally {
                     if (var35) {
                        MemoryUtil.memFree(var3);
                     }
                  }

                  MemoryUtil.memFree(var3);
                  return var5;
               }

               MemoryUtil.memFree(var3);
               return var24;
            }

            MemoryUtil.memFree(var3);
            return var23;
         }

         MemoryUtil.memFree(var3);
         return var61;
      }

      MemoryUtil.memFree(var3);
      return var60;
   }

   public void O00000000(String string) {
      String var2 = string + "|";
      this.O0000000000.entrySet().removeIf(entry -> {
         if (entry.getKey().startsWith(var2)) {
            return false;
         } else {
            int var2x = entry.getValue();
            if (var2x > 0) {
               try {
                  GL11.glDeleteTextures(var2x);
               } catch (Throwable var4) {
               }
            }

            return true;
         }
      });
   }
}
