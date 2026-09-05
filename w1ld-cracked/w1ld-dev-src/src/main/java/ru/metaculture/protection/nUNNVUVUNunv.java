package ru.metaculture.protection;

import java.util.Locale;

public final class nUNNVUVUNunv {
   public static final int UuUVuuUu = 3;
   public static final int C00OOC00oO = 14;
   private static final String uUnuvNvvNU = "none";
   private static final String vVvUvVVuuNvV = "uniform";
   private static final String uNNnnnuuuN = "varying";
   private static final String nuUnNvnuUu = "link";
   private static final String VVuuUN = "compile";
   private static final String vNUvnnVnUvu = "sampler";
   private static final String uVUuuVnNVU = "bind";

   private nUNNVUVUNunv() {
   }

   public static String UuUVuuUu(String var0, int var1) {
      return "SHADER FAILURE #" + var1 + " stage=" + uUnuvNvvNU(var0, 96);
   }

   public static String UuUVuuUu(int var0, Throwable var1) {
      return var1 == null ? "cause[" + var0 + "]=unknown" : "cause[" + var0 + "]=" + var1.getClass().getName();
   }

   public static String UuUVuuUu(Throwable var0) {
      return var0 == null ? "message=no throwable" : "message=" + uUnuvNvvNU(var0.getMessage(), 260);
   }

   public static String C00OOC00oO(Throwable var0) {
      String var1 = uUnuvNvvNU(var0).toLowerCase(Locale.ROOT);
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

   public static String UuUVuuUu(StackTraceElement var0) {
      return var0 == null ? "none" : "  at " + var0.getClassName() + "." + var0.getMethodName() + "(" + var0.getFileName() + ":" + var0.getLineNumber() + ")";
   }

   public static String C00OOC00oO(String var0, int var1) {
      return "OPENGL ERROR stage="
         + uUnuvNvvNU(var0, 96)
         + " code=0x"
         + Integer.toHexString(var1).toUpperCase(Locale.ROOT)
         + " name="
         + UVUuvNVUuVvN.UuUVuuUu(var1);
   }

   public static String UuUVuuUu() {
      return "GL STATE program=" + UVUuvNVUuVvN.UuUVuuUu() + " activeTexture=" + UVUuvNVUuVvN.C00OOC00oO() + " texture2D=" + UVUuvNVUuVvN.uUnuvNvvNU();
   }

   private static String uUnuvNvvNU(Throwable var0) {
      if (var0 == null) {
         return "none";
      } else {
         String var1 = var0.getMessage();
         return var1 != null && !var1.isBlank() ? var1 : var0.getClass().getName();
      }
   }

   private static String uUnuvNvvNU(String var0, int var1) {
      if (var0 != null && !var0.isBlank()) {
         String var2 = var0.replace('\n', ' ').replace('\r', ' ').trim();
         return var2.length() <= var1 ? var2 : var2.substring(0, Math.max(0, var1 - 3)) + "...";
      } else {
         return "none";
      }
   }
}
