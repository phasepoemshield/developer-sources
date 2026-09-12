package Nursultan;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.nio.charset.StandardCharsets;
import java.util.function.IntFunction;
import minecraft.class01079;
import minecraft.class06202;
import org.apache.commons.io.IOUtils;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL31;

public class class09322 extends class09306 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public Object N_6;

   @Override
   public void L() {
      this.E();
      this.W();
      ((class09337)this.N_3).y();
      int var1 = 0;
      int var2 = 0;

      try {
         var1 = this.N(35633, (String)this.N_0);
         var2 = this.N(35632, (String)this.N_1);
         GL31.glAttachShader((Integer)super.y_0, var1);
         GL31.glAttachShader((Integer)super.y_0, var2);
         GL31.glLinkProgram((Integer)super.y_0);
         if (GL31.glGetProgrami((Integer)super.y_0, 35714) == 0) {
            throw new IllegalStateException(
               "Shader link failed: " + (String)this.N_0 + ", " + (String)this.N_1 + ". " + GL31.glGetProgramInfoLog((Integer)super.y_0)
            );
         }

         this.N_4 = null;
         this.N_5 = null;
         this.N_6 = null;
      } finally {
         if (var1 != 0) {
            GL31.glDetachShader((Integer)super.y_0, var1);
            GL31.glDeleteShader(var1);
         }

         if (var2 != 0) {
            GL31.glDetachShader((Integer)super.y_0, var2);
            GL31.glDeleteShader(var2);
         }
      }
   }

   public class12003 L(String var1) {
      return this.N(var1, class12003::new, class09353.INT);
   }

   public void M() {
      GL31.glUseProgram((Integer)super.y_0);
   }

   public class12026 M(String var1) {
      return this.N(var1, class12026::new, class09353.SAMPLER_2D);
   }

   public class09322(String var1, String var2, class09337 var3, String var4) {
      super(GL31.glCreateProgram());
      this.E();
      this.N_0 = var1;
      this.N_1 = var2;
      this.N_3 = var3;
      this.N_2 = var4;
      this.L();
   }

   public class09322(String var1, String var2) {
      this(var1, var2, class09337.N, "");
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof class09322 var2)) {
         return false;
      } else if (!var2.N(this)) {
         return false;
      } else {
         String var3 = this.B();
         String var4 = var2.B();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            String var5 = this.R();
            String var6 = var2.R();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               String var7 = this.i();
               String var8 = var2.i();
               return var7 == null ? var8 == null : var7.equals(var8);
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      String var3 = this.B();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.R();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      String var5 = this.i();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }

   public String B() {
      this.E();
      return (String)this.N_0;
   }

   public class11210 B(String var1) {
      return this.N(var1, class11210::new, class09353.IVEC2);
   }

   public Object2ObjectOpenHashMap<String, class12004> Z() {
      this.E();
      return (Object2ObjectOpenHashMap<String, class12004>)this.N_4;
   }

   public class12042 Z(String var1) {
      return this.N(var1, class12042::new, class09353.IVEC4);
   }

   public class11200 i(String var1) {
      return this.N(var1, class11200::new, class09353.FLOAT);
   }

   public String i() {
      this.E();
      return (String)this.N_2;
   }

   private Object2ObjectOpenHashMap<String, class09307> s() {
      this.E();
      if ((Object2ObjectOpenHashMap)this.N_5 != null) {
         return (Object2ObjectOpenHashMap<String, class09307>)this.N_5;
      } else {
         this.N_5 = new Object2ObjectOpenHashMap();
         int var1 = GL31.glGetProgrami((Integer)super.y_0, 35718);
         IntBuffer var2 = BufferUtils.createIntBuffer(1);
         IntBuffer var3 = BufferUtils.createIntBuffer(1);

         for (int var4 = 0; var4 < var1; var4++) {
            var2.clear();
            var3.clear();
            String var5 = GL31.glGetActiveUniform((Integer)super.y_0, var4, var2, var3);
            class09307 var6 = new class09307(var5, var3.get(0), var2.get(0));
            ((Object2ObjectOpenHashMap)this.N_5).put(Y(var5), var6);
            ((Object2ObjectOpenHashMap)this.N_5).put(var5, var6);
         }

         return (Object2ObjectOpenHashMap<String, class09307>)this.N_5;
      }
   }

   private String m(String var1) {
      class01079 var2 = (class01079)class06202.Nq()
         .Nm()
         .method_14486(class11911.N(var1))
         .orElseThrow(() -> new IllegalStateException("Shader resource was not found: " + var1));

      try {
         String var4;
         try (InputStream var3 = var2.method_14482()) {
            var4 = IOUtils.toString(var3, StandardCharsets.UTF_8);
         }

         return var4;
      } catch (IOException var8) {
         throw new IllegalStateException("Failed to read shader source: " + var1, var8);
      }
   }

   public class12017 U(String var1) {
      return this.N(var1, class12017::new, class09353.VEC3);
   }

   public class12038 z(String var1) {
      return this.N(var1, class12038::new, class09353.MAT4);
   }

   public Object2ObjectOpenHashMap<String, class12009> u() {
      this.E();
      return (Object2ObjectOpenHashMap<String, class12009>)this.N_6;
   }

   public class12005 u(String var1) {
      return this.N(var1, class12005::new, class09353.IVEC3);
   }

   public class11170 y(String var1) {
      return this.N(var1, class11170::new, class09353.FLOAT_ARRAY);
   }

   private static String y(int var0) {
      return switch (var0) {
         case 5124 -> "int";
         case 5126 -> "float";
         case 35664 -> "vec2";
         case 35665 -> "vec3";
         case 35666 -> "vec4";
         case 35667 -> "ivec2";
         case 35668 -> "ivec3";
         case 35669 -> "ivec4";
         case 35670 -> "bool";
         case 35676 -> "mat4";
         case 35678 -> "sampler2D";
         default -> "0x" + Integer.toHexString(var0);
      };
   }

   private void E() {
   }

   public class12009 N(String var1, int var2) {
      this.E();
      if ((Object2ObjectOpenHashMap)this.N_6 == null) {
         this.N_6 = new Object2ObjectOpenHashMap();
      } else {
         class12009 var3 = (class12009)((Object2ObjectOpenHashMap)this.N_6).get(var1);
         if (var3 != null) {
            return var3;
         }
      }

      int var5 = GL31.glGetUniformBlockIndex((Integer)super.y_0, var1);
      if (var5 == -1) {
         throw new IllegalArgumentException("Uniform block was not found or is inactive: " + var1 + " in " + (String)this.N_0 + ", " + (String)this.N_1);
      } else {
         GL31.glUniformBlockBinding((Integer)super.y_0, var5, var2);
         class12009 var4 = new class12009(var5, var2);
         ((Object2ObjectOpenHashMap)this.N_6).put(var1, var4);
         return var4;
      }
   }

   public boolean N(Object var1) {
      return var1 instanceof class09322;
   }

   private <T extends class12004> T N(String var1, IntFunction<T> var2, class09353 var3) {
      this.E();
      if ((Object2ObjectOpenHashMap)this.N_4 == null) {
         this.N_4 = new Object2ObjectOpenHashMap();
      } else {
         class12004 var4 = (class12004)((Object2ObjectOpenHashMap)this.N_4).get(var1);
         if (var4 != null) {
            return (T)var4;
         }
      }

      int var6 = GL31.glGetUniformLocation((Integer)super.y_0, var1);
      if (var6 < 0 && !var1.endsWith("[0]")) {
         var6 = GL31.glGetUniformLocation((Integer)super.y_0, var1 + "[0]");
      }

      if (var6 < 0) {
         throw new IllegalArgumentException("Uniform was not found or is inactive: " + var1 + " in " + (String)this.N_0 + ", " + (String)this.N_1);
      } else {
         if (((class09337)this.N_3).N()) {
            this.N(var1, var3);
         }

         class12004 var5 = (class12004)var2.apply(var6);
         ((Object2ObjectOpenHashMap)this.N_4).put(var1, var5);
         return (T)var5;
      }
   }

   private void N(String var1, class09353 var2) {
      this.E();
      class09307 var3 = (class09307)this.s().get(Y(var1));
      if (var3 != null) {
         if (!var2.N(var3.N(), var3.y(), var1.endsWith("]"))) {
            throw new IllegalArgumentException(
               "Uniform type mismatch: "
                  + var1
                  + " in "
                  + (String)this.N_0
                  + ", "
                  + (String)this.N_1
                  + ". Expected "
                  + var2.N()
                  + ", actual "
                  + y(var3.N())
                  + (var3.y() > 1 ? "[" + var3.y() + "]" : "")
            );
         }
      }
   }

   private int N(int var1, String var2) {
      this.E();
      String var3 = ((class09337)this.N_3).N(var1, var2, this.m(var2));
      int var4 = GL31.glCreateShader(var1);
      GL31.glShaderSource(var4, var3);
      GL31.glCompileShader(var4);
      if (GL31.glGetShaderi(var4, 35713) == 0) {
         String var5 = GL31.glGetShaderInfoLog(var4);
         GL31.glDeleteShader(var4);
         throw new IllegalStateException("Shader compile failed: " + var2 + ". " + var5);
      } else {
         return var4;
      }
   }

   public class12043 N(String var1) {
      return this.N(var1, class12043::new, class09353.VEC4);
   }

   public class09337 N() {
      this.E();
      return (class09337)this.N_3;
   }

   private void W() {
      int var1 = GL31.glGetProgrami((Integer)super.y_0, 35717);
      if (var1 > 0) {
         IntBuffer var2 = BufferUtils.createIntBuffer(1);
         IntBuffer var3 = BufferUtils.createIntBuffer(var1);
         GL31.glGetAttachedShaders((Integer)super.y_0, var2, var3);

         for (int var4 = 0; var4 < var2.get(0); var4++) {
            GL31.glDetachShader((Integer)super.y_0, var3.get(var4));
         }
      }
   }

   public String R() {
      this.E();
      return (String)this.N_1;
   }

   public class11993 R(String var1) {
      return this.N(var1, class11993::new, class09353.VEC2);
   }

   private static String Y(String var0) {
      int var1 = var0.indexOf(91);
      return var1 >= 0 ? var0.substring(0, var1) : var0;
   }
}
