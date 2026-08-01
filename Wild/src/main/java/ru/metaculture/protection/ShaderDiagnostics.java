package ru.metaculture.protection;

import java.util.Locale;

public final class ShaderDiagnostics {
   public static final int O00000000 = 3;
   public static final int O000000000 = 14;
   private static final String O0000000000 = "none";
   private static final String O00000000000 = "uniform";
   private static final String O000000000000 = "varying";
   private static final String O0000000000000 = "link";
   private static final String O000000000000O = "compile";
   private static final String O00000000000O = "sampler";
   private static final String O00000000000O0 = "bind";

   private ShaderDiagnostics() {
   }

   public static String O00000000(String string, int i) {
      return "SHADER FAILURE #" + i + " stage=" + O0000000000(string, 96);
   }

   public static String O00000000(int i, Throwable throwable) {
      return throwable == null ? "cause[" + i + "]=unknown" : "cause[" + i + "]=" + throwable.getClass().getName();
   }

   public static String O00000000(Throwable throwable) {
      return throwable == null ? "message=no throwable" : "message=" + O0000000000(throwable.getMessage(), 260);
   }

   public static String O000000000(Throwable throwable) {
      String var1 = O0000000000(throwable).toLowerCase(Locale.ROOT);
      if (var1.contains("uniform")) {
         return "GLSL DETAIL broken uniform binding/type; check declared name, std140 layout and Java upload type";
      } else if (var1.contains("varying") || var1.contains("in/out")) {
         return "GLSL DETAIL varying mismatch; check vertex output and fragment input names/types";
      } else if (var1.contains("link")) {
         return "GLSL DETAIL program link failed; inspect attached shader interface and sampler layout";
      } else if (var1.contains("compile")) {
         return "GLSL DETAIL shader compile failed; inspect syntax, version and include expansion";
      } else {
         return !var1.contains("sampler") && !var1.contains("bind")
            ? "none"
            : "GLSL DETAIL sampler/binding failure; check texture view lifetime and texture unit isolation";
      }
   }

   public static String O00000000(StackTraceElement stackTraceElement) {
      return stackTraceElement == null
         ? "none"
         : "  at "
            + stackTraceElement.getClassName()
            + "."
            + stackTraceElement.getMethodName()
            + "("
            + stackTraceElement.getFileName()
            + ":"
            + stackTraceElement.getLineNumber()
            + ")";
   }

   public static String O000000000(String string, int i) {
      return "OPENGL ERROR stage="
         + O0000000000(string, 96)
         + " code=0x"
         + Integer.toHexString(i).toUpperCase(Locale.ROOT)
         + " name="
         + O00000000OO0.O00000000(i);
   }

   public static String O00000000() {
      return "GL STATE program=" + O00000000OO0.O00000000() + " activeTexture=" + O00000000OO0.O000000000() + " texture2D=" + O00000000OO0.O0000000000();
   }

   private static String O0000000000(Throwable throwable) {
      if (throwable == null) {
         return "none";
      } else {
         String var1 = throwable.getMessage();
         return var1 != null && !var1.isBlank() ? var1 : throwable.getClass().getName();
      }
   }

   private static String O0000000000(String string, int i) {
      if (string != null && !string.isBlank()) {
         String var2 = string.replace('\n', ' ').replace('\r', ' ').trim();
         return var2.length() <= i ? var2 : var2.substring(0, Math.max(0, i - 3)) + "...";
      } else {
         return "none";
      }
   }
}
