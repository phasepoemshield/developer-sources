package oxxxde;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Pair;
import org.lwjgl.opengl.GL20;

// $VF: Compiled from heavy
public class ثذ {
   private static final HashMap<String, صغ> libraries = new HashMap<>();
   private static final String includeLibOperator = "#include";

   public static خر compileProgram(String uniforms, List<رر> shaders, بِ[] name, HashMap<String, جد<?>> snippets) {
      int programId = GL20.glCreateProgram();
      HashMap<String, جد<?>> allUniforms = new HashMap<>(uniforms);

      try {
         for (رر shader : shaders) {
            GL20.glAttachShader(programId, shader.getId());
            shader.getExtraUniforms().forEach((s, uniformType) -> {
               if (allUniforms.containsKey(s)) {
                  دن.printAndExit(new بت(s));
               }

               allUniforms.put(s, (جد<?>)uniformType);
            });
         }

         bindKnownAttributeLocations(programId, name);
         GL20.glLinkProgram(programId);
         خر var12 = new خر(name, programId, new HashSet<>(Arrays.asList(snippets)), allUniforms);
         اا var13 = var12.getCompileResult();
         if (var13.isFailure()) {
            var12.close();
            دن.printAndExit(new زظ(name, var13.message()));
         }

         return var12;
      } finally {
         shaders.forEach(رر::close);
      }
   }

   public static صغ getShaderLibrary(String name) {
      صغ library = libraries.get(name);
      if (library == null) {
         دن.printAndExit(new صت(name));
      }

      return library;
   }

   public static void registerShaderLibraries(صغ... shaderLibraries) {
      for (صغ shaderLibrary : shaderLibraries) {
         libraries.put(shaderLibrary.libraryEntry().name(), shaderLibrary);
      }
   }

   private static void bindAttributes(int programId, String[] attributes) {
      for (int i = 0; i < attributes.length; i++) {
         GL20.glBindAttribLocation(programId, i, attributes[i]);
      }
   }

   public static void unregisterShaderLibraries(String... names) {
      for (String name : names) {
         libraries.remove(name);
      }
   }

   private static void bindKnownAttributeLocations(int programId, String programName) {
      if ("font".equals(programName)) {
         bindAttributes(programId, new String[]{"Position", "UV0", "Color", "Style0", "OutlineColor0", "Fade0", "Scissor0"});
      } else if ("advanced-rect".equals(programName)) {
         bindAttributes(
            programId,
            new String[]{
               "Position",
               "TopRightColor0",
               "TopLeftColor0",
               "BottomRightColor0",
               "BottomLeftColor0",
               "UV0",
               "Size0",
               "Radius0",
               "Mix0",
               "Alpha0",
               "Mode0",
               "BorderWidth0",
               "BorderColor0",
               "Type0",
               "Scissor0"
            }
         );
      } else {
         if ("downscale".equals(programName) || "upscale".equals(programName)) {
            bindAttributes(programId, new String[]{"Position"});
         }
      }
   }

   public static void unregisterShaderLibraries(صغ... shaderLibraries) {
      for (صغ shaderLibrary : shaderLibraries) {
         libraries.remove(shaderLibrary.libraryEntry().name());
      }
   }

   public static Pair<String, HashMap<String, جد<?>>> includeShaderLibraries(String content) {
      HashMap<String, جد<?>> uniforms = new HashMap<>();
      boolean writeAction = false;
      boolean writeLibName = false;
      StringBuilder s = new StringBuilder();
      int i = 0;

      while (i < content.length()) {
         char ch = content.charAt(i);
         i++;
         if (ch == '#') {
            s = new StringBuilder("#");
            writeAction = true;
         } else if (ch == '<' && writeAction) {
            writeAction = false;
            if (s.toString().equals("#include")) {
               writeLibName = true;
            }

            s = new StringBuilder();
         } else if (ch == '>' && writeLibName) {
            writeLibName = false;
            صغ library = getShaderLibrary(s.toString());
            library.uniforms().forEach((s1, uniformType) -> {
               if (uniforms.containsKey(s1)) {
                  دن.printAndExit(new بت(s1));
               }

               uniforms.put(s1, (جد<?>)uniformType);
            });
            content = content.replace("#include".concat("<").concat(s.toString()).concat(">"), library.libraryEntry().content());
            i -= "#".concat("#include").concat("<").concat(s.toString()).length();
            s = new StringBuilder();
         } else {
            s.append(ch);
         }
      }

      return new Pair<>(content, uniforms);
   }

   public static رر compileShader(خإ shaderEntry, حآ shaderType) {
      Pair<String, HashMap<String, جد<?>>> content = includeShaderLibraries(shaderEntry.content());
      int shaderId = GL20.glCreateShader(shaderType.glId);
      GL20.glShaderSource(shaderId, content.getFirst());
      GL20.glCompileShader(shaderId);
      رر shader = new رر(shaderEntry.name(), content.getFirst(), shaderId, content.getSecond(), shaderType);
      اا compileResult = shader.getCompileResult();
      if (compileResult.isFailure()) {
         دن.printAndExit(new زق(shaderEntry.name(), compileResult.message()));
      }

      return shader;
   }
}
