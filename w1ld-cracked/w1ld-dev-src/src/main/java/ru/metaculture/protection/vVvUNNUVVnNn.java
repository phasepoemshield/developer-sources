package ru.metaculture.protection;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryStack;

public final class vVvUNNUVVnNn {
   private static final int UuUVuuUu = 262144;
   private final int C00OOC00oO;

   public vVvUNNUVVnNn(String var1, String var2) {
      this(var1, var2, "inline");
   }

   public vVvUNNUVVnNn(String var1, String var2, String var3) {
      C00OOC00oO(var3);
      VUUUNuNNn.UuUVuuUu("shader build " + var3);
      int var4 = UuUVuuUu(35633, var1, var3 + ":vertex");

      int var5;
      try {
         var5 = UuUVuuUu(35632, var2, var3 + ":fragment");
      } catch (RuntimeException var10) {
         GL20.glDeleteShader(var4);
         throw var10;
      }

      this.C00OOC00oO = GL20.glCreateProgram();
      if (this.C00OOC00oO == 0) {
         GL20.glDeleteShader(var4);
         GL20.glDeleteShader(var5);
         throw new IllegalStateException("glCreateProgram returned 0 for " + var3 + " (" + VUUUNuNNn.uUnuvNvvNU() + ")");
      } else {
         GL20.glAttachShader(this.C00OOC00oO, var4);
         GL20.glAttachShader(this.C00OOC00oO, var5);
         GL20.glLinkProgram(this.C00OOC00oO);
         MemoryStack var6 = MemoryStack.stackPush();

         try {
            IntBuffer var7 = var6.mallocInt(1);
            GL20.glGetProgramiv(this.C00OOC00oO, 35714, var7);
            if (var7.get(0) == 0) {
               String var8 = GL20.glGetProgramInfoLog(this.C00OOC00oO);
               GL20.glDeleteShader(var4);
               GL20.glDeleteShader(var5);
               GL20.glDeleteProgram(this.C00OOC00oO);
               VUUUNuNNn.C00OOC00oO("shader", "link failed " + var3 + ": " + var8);
               throw new IllegalStateException("Program link failed (" + var3 + "): " + var8);
            }
         } catch (Throwable var11) {
            if (var6 != null) {
               try {
                  var6.close();
               } catch (Throwable var9) {
                  var11.addSuppressed(var9);
               }
            }

            throw var11;
         }

         if (var6 != null) {
            var6.close();
         }

         GL20.glDetachShader(this.C00OOC00oO, var4);
         GL20.glDetachShader(this.C00OOC00oO, var5);
         GL20.glDeleteShader(var4);
         GL20.glDeleteShader(var5);
         VUUUNuNNn.UuUVuuUu("shader", "built " + var3 + " id=" + this.C00OOC00oO);
      }
   }

   public static vVvUNNUVVnNn UuUVuuUu(String var0, String var1) {
      String var2 = UvnUNnnVnu.UuUVuuUu(var0);
      String var3 = UvnUNnnVnu.UuUVuuUu(var1);
      return new vVvUNNUVVnNn(var2, var3, var0 + " + " + var1);
   }

   private static void C00OOC00oO(String var0) {
      if (!VUUUNuNNn.C00OOC00oO()) {
         VUUUNuNNn.C00OOC00oO("shader", "no GL context for " + var0 + " thread=" + Thread.currentThread().getName());
         throw new IllegalStateException("No current GL context while building " + var0 + " on thread " + Thread.currentThread().getName());
      }
   }

   private static int UuUVuuUu(int var0, String var1, String var2) {
      String var3 = var0 == 35633 ? "vertex" : "fragment";
      if (var1 != null && !var1.isBlank()) {
         if (var1.length() > 262144) {
            VUUUNuNNn.C00OOC00oO("shader", "oversized source " + var2 + " chars=" + var1.length());
            throw new IllegalStateException("Shader source too large for " + var2 + ": " + var1.length());
         } else {
            VUUUNuNNn.UuUVuuUu("shader", "compiling " + var2 + " chars=" + var1.length());
            int var4 = GL20.glCreateShader(var0);
            if (var4 == 0) {
               int var11 = GL11.glGetError();
               VUUUNuNNn.C00OOC00oO("shader", "glCreateShader returned 0 for " + var2 + " glError=" + VUUUNuNNn.UuUVuuUu(var11) + " " + VUUUNuNNn.uUnuvNvvNU());
               throw new IllegalStateException("glCreateShader returned 0 for " + var2 + " (glError=" + VUUUNuNNn.UuUVuuUu(var11) + ")");
            } else {
               GL20.glShaderSource(var4, var1);
               int var5 = GL11.glGetError();
               if (var5 != 0) {
                  GL20.glDeleteShader(var4);
                  VUUUNuNNn.C00OOC00oO("shader", "glShaderSource failed " + var2 + " glError=" + VUUUNuNNn.UuUVuuUu(var5));
                  throw new IllegalStateException("glShaderSource failed for " + var2 + " (glError=" + VUUUNuNNn.UuUVuuUu(var5) + ")");
               } else {
                  GL20.glCompileShader(var4);
                  MemoryStack var6 = MemoryStack.stackPush();

                  try {
                     IntBuffer var7 = var6.mallocInt(1);
                     GL20.glGetShaderiv(var4, 35713, var7);
                     if (var7.get(0) == 0) {
                        String var8 = GL20.glGetShaderInfoLog(var4);
                        GL20.glDeleteShader(var4);
                        VUUUNuNNn.C00OOC00oO("shader", "compile failed " + var2 + ": " + var8);
                        throw new IllegalStateException("Shader compile failed (" + var2 + "): " + var8);
                     }
                  } catch (Throwable var10) {
                     if (var6 != null) {
                        try {
                           var6.close();
                        } catch (Throwable var9) {
                           var10.addSuppressed(var9);
                        }
                     }

                     throw var10;
                  }

                  if (var6 != null) {
                     var6.close();
                  }

                  return var4;
               }
            }
         }
      } else {
         VUUUNuNNn.C00OOC00oO("shader", "empty source " + var2);
         throw new IllegalStateException("Empty " + var3 + " source for " + var2);
      }
   }

   public void UuUVuuUu() {
      GL20.glUseProgram(this.C00OOC00oO);
   }

   public void C00OOC00oO() {
      GL20.glDeleteProgram(this.C00OOC00oO);
   }

   public int uUnuvNvvNU() {
      return this.C00OOC00oO;
   }

   public int UuUVuuUu(String var1) {
      return GL20.glGetUniformLocation(this.C00OOC00oO, var1);
   }
}
