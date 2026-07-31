package zenith;

import zenith.hud.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL20;

public class StringHolder_28 {
   private final int II1llll1l111l11l11Illl1IIlIll;
   private final Map<String, Integer> l111I1llII1l = new HashMap<>();
   private final String lIIl1IlIl1II;
   private final String I1IIl11Il1;

   public StringHolder_28(String s, String s1) {
      this(s, s1, s1);
   }

   public StringHolder_28(String s, String s1, String s2) {
      this.lIIl1IlIl1II = "/assets/gl/shaders/" + s + "/" + s2 + ".vsh";
      this.I1IIl11Il1 = "/assets/gl/shaders/" + s + "/" + s1 + ".fsh";
      int i = this.EventImpl_24(this.lIIl1IlIl1II, 35633);
      int j = this.EventImpl_24(this.I1IIl11Il1, 35632);
      this.II1llll1l111l11l11Illl1IIlIll = GL20.glCreateProgram();
      GL20.glAttachShader(this.II1llll1l111l11l11Illl1IIlIll, i);
      GL20.glAttachShader(this.II1llll1l111l11l11Illl1IIlIll, j);
      GL20.glLinkProgram(this.II1llll1l111l11l11Illl1IIlIll);
      if (GL20.glGetProgrami(this.II1llll1l111l11l11Illl1IIlIll, 35714) == 0) {
         throw new RuntimeException("Failed to link shader program: " + GL20.glGetProgramInfoLog(this.II1llll1l111l11l11Illl1IIlIll));
      } else {
         GL20.glDeleteShader(i);
         GL20.glDeleteShader(j);
      }
   }

   private int EventImpl_24(String s, int i) {
      try {
         String s1 = this.Cooldowns(s);
         int j = GL20.glCreateShader(i);
         GL20.glShaderSource(j, s1);
         GL20.glCompileShader(j);
         if (GL20.glGetShaderi(j, 35713) == 0) {
            throw new RuntimeException("Failed to compile shader: " + s + "\n" + GL20.glGetShaderInfoLog(j));
         } else {
            return j;
         }
      } catch (IOException ioexception) {
         throw new RuntimeException("Failed to load shader: " + s, ioexception);
      }
   }

   private String Cooldowns(String s) throws IOException {
      InputStream inputstream = StringHolder_28.class.getResourceAsStream(s);
      if (inputstream == null) {
         throw new IOException("Shader file not found: " + s);
      } else {
         StringBuilder stringbuilder = new StringBuilder();
         BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));

         try {
            String s1;
            while ((s1 = bufferedreader.readLine()) != null) {
               stringbuilder.append(s1).append("\n");
            }

            bufferedreader.close();
         } catch (Throwable throwable1) {
            try {
               bufferedreader.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }

            throw throwable1;
         }

         return stringbuilder.toString();
      }
   }

   public void bind() {
      GL20.glUseProgram(this.II1llll1l111l11l11Illl1IIlIll);
   }

   public void ll1l1IIlIl1Il1() {
      GL20.glUseProgram(0);
   }

   public void ZenithInternal028(String s, int i) {
      int j = this.Events(s);
      if (j != -1) {
         GL20.glUniform1i(j, i);
      }
   }

   public void StringHolder_8(String s, float f) {
      int i = this.Events(s);
      if (i != -1) {
         GL20.glUniform1f(i, f);
      }
   }

   public void StringHolder_8(String s, float f, float f1) {
      int i = this.Events(s);
      if (i != -1) {
         GL20.glUniform2f(i, f, f1);
      }
   }

   public void StringHolder_8(String s, Vector2f vector2f) {
      this.StringHolder_8(s, vector2f.x, vector2f.y);
   }

   public void StringHolder_8(String s, float f, float f1, float f2, float f3) {
      int i = this.Events(s);
      if (i != -1) {
         GL20.glUniform4f(i, f, f1, f2, f3);
      }
   }

   public void StringHolder_8(String s, float f, float f1, float f2) {
      int i = this.Events(s);
      if (i != -1) {
         GL20.glUniform3f(i, f, f1, f2);
      }
   }

   public void StringHolder_8(String s, Vector3f vector3f) {
      this.StringHolder_8(s, vector3f.x, vector3f.y, vector3f.z);
   }

   public void EventImpl_24(String s, boolean flag) {
      this.ZenithInternal028(s, flag ? 1 : 0);
   }

   public void Il1IllII1I1I1l11l1ll1l1I111() {
      GL20.glDeleteProgram(this.II1llll1l111l11l11Illl1IIlIll);
   }

   private int Events(String s) {
      return this.l111I1llII1l.computeIfAbsent(s, s1 -> GL20.glGetUniformLocation(this.II1llll1l111l11l11Illl1IIlIll, s1));
   }
}
