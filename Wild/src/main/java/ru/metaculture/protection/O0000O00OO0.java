package ru.metaculture.protection;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL20;
import org.lwjgl.system.MemoryStack;

public final class O0000O00OO0 {
   private final int O00000000;

   public O0000O00OO0(String string, String string2) {
      int var3 = O00000000(35633, string);
      int var4 = O00000000(35632, string2);
      this.O00000000 = GL20.glCreateProgram();
      GL20.glAttachShader(this.O00000000, var3);
      GL20.glAttachShader(this.O00000000, var4);
      GL20.glLinkProgram(this.O00000000);
      MemoryStack var5 = MemoryStack.stackPush();

      try {
         IntBuffer var6 = var5.mallocInt(1);
         GL20.glGetProgramiv(this.O00000000, 35714, var6);
         if (var6.get(0) == 0) {
            String var7 = GL20.glGetProgramInfoLog(this.O00000000);
            GL20.glDeleteShader(var3);
            GL20.glDeleteShader(var4);
            GL20.glDeleteProgram(this.O00000000);
            throw new IllegalStateException("Program link failed: " + var7);
         }
      } catch (Throwable var9) {
         if (var5 != null) {
            try {
               var5.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (var5 != null) {
         var5.close();
      }

      GL20.glDetachShader(this.O00000000, var3);
      GL20.glDetachShader(this.O00000000, var4);
      GL20.glDeleteShader(var3);
      GL20.glDeleteShader(var4);
   }

   public static O0000O00OO0 O00000000(String string, String string2) {
      String var2 = O0000O00OO.O00000000(string);
      String var3 = O0000O00OO.O00000000(string2);
      return new O0000O00OO0(var2, var3);
   }

   private static int O00000000(int i, String string) {
      int var2 = GL20.glCreateShader(i);
      GL20.glShaderSource(var2, string);
      GL20.glCompileShader(var2);
      MemoryStack var3 = MemoryStack.stackPush();

      try {
         IntBuffer var4 = var3.mallocInt(1);
         GL20.glGetShaderiv(var2, 35713, var4);
         if (var4.get(0) == 0) {
            String var5 = GL20.glGetShaderInfoLog(var2);
            GL20.glDeleteShader(var2);
            throw new IllegalStateException("Shader compile failed: " + var5);
         }
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

      return var2;
   }

   public void O00000000() {
      GL20.glUseProgram(this.O00000000);
   }

   public void O000000000() {
      GL20.glDeleteProgram(this.O00000000);
   }

   public int O0000000000() {
      return this.O00000000;
   }

   public int O00000000(String string) {
      return GL20.glGetUniformLocation(this.O00000000, string);
   }
}
