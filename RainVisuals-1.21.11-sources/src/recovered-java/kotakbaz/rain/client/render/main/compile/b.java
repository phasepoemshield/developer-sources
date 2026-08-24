/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.compile;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotakbaz.rain.client.render.main.compile.GlShaderLibrary;
import kotakbaz.rain.client.render.main.compile.a;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.compile.A;
import kotlin.Pair;
import org.lwjgl.opengl.GL20;
import oxxxde.\u0628\u062a;
import oxxxde.\u062d\u0622;
import oxxxde.\u062f\u0646;
import oxxxde.\u0631\u0631;
import oxxxde.\u0632\u0638;
import oxxxde.\u0632\u0642;
import oxxxde.\u0635\u062a;

public class b {
    private static final HashMap<String, GlShaderLibrary> libraries = new HashMap();
    private static final String includeLibOperator = "#include";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static GlProgram compileProgram(String name, List<\u0631\u0631> shaders, kotakbaz.rain.client.render.main.program.a[] snippets, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>> uniforms) {
        int programId = GL20.glCreateProgram();
        HashMap allUniforms = new HashMap(uniforms);
        try {
            for (\u0631\u0631 shader : shaders) {
                GL20.glAttachShader((int)programId, (int)shader.getId());
                shader.getExtraUniforms().forEach((s, uniformType) -> {
                    if (allUniforms.containsKey(s)) {
                        \u062f\u0646.printAndExit(new \u0628\u062a((String)s));
                    }
                    allUniforms.put((String)s, (kotakbaz.rain.client.render.main.program.uniform.a<?>)uniformType);
                });
            }
            b.bindKnownAttributeLocations(programId, name);
            GL20.glLinkProgram((int)programId);
            GlProgram program = new GlProgram(name, programId, new HashSet<kotakbaz.rain.client.render.main.program.a>(Arrays.asList(snippets)), allUniforms);
            A compileResult = program.getCompileResult();
            if (compileResult.isFailure()) {
                program.close();
                \u062f\u0646.printAndExit(new \u0632\u0638(name, compileResult.message()));
            }
            GlProgram glProgram = program;
            return glProgram;
        }
        finally {
            shaders.forEach(\u0631\u0631::close);
        }
    }

    public static GlShaderLibrary getShaderLibrary(String name) {
        GlShaderLibrary library = libraries.get(name);
        if (library == null) {
            \u062f\u0646.printAndExit(new \u0635\u062a(name));
        }
        return library;
    }

    public static void registerShaderLibraries(GlShaderLibrary ... shaderLibraries) {
        GlShaderLibrary[] glShaderLibraryArray = shaderLibraries;
        int n = glShaderLibraryArray.length;
        for (int i = 0; i < n; ++i) {
            GlShaderLibrary shaderLibrary = glShaderLibraryArray[i];
            libraries.put(shaderLibrary.libraryEntry().name(), shaderLibrary);
        }
    }

    private static void bindAttributes(int programId, String[] attributes) {
        for (int i = 0; i < attributes.length; ++i) {
            GL20.glBindAttribLocation((int)programId, (int)i, (CharSequence)attributes[i]);
        }
    }

    public static void unregisterShaderLibraries(String ... names) {
        String[] stringArray = names;
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String name = stringArray[i];
            libraries.remove(name);
        }
    }

    private static void bindKnownAttributeLocations(int programId, String programName) {
        block6: {
            block5: {
                if ("font".equals(programName)) {
                    String[] stringArray = new String[7];
                    stringArray[0] = "Position";
                    stringArray[1] = "UV0";
                    stringArray[2] = "Color";
                    stringArray[3] = "Style0";
                    stringArray[4] = "OutlineColor0";
                    stringArray[5] = "Fade0";
                    stringArray[6] = "Scissor0";
                    b.bindAttributes(programId, stringArray);
                    return;
                }
                if ("advanced-rect".equals(programName)) {
                    String[] stringArray = new String[15];
                    stringArray[0] = "Position";
                    stringArray[1] = "TopRightColor0";
                    stringArray[2] = "TopLeftColor0";
                    stringArray[3] = "BottomRightColor0";
                    stringArray[4] = "BottomLeftColor0";
                    stringArray[5] = "UV0";
                    stringArray[6] = "Size0";
                    stringArray[7] = "Radius0";
                    stringArray[8] = "Mix0";
                    stringArray[9] = "Alpha0";
                    stringArray[10] = "Mode0";
                    stringArray[11] = "BorderWidth0";
                    stringArray[12] = "BorderColor0";
                    stringArray[13] = "Type0";
                    stringArray[14] = "Scissor0";
                    b.bindAttributes(programId, stringArray);
                    return;
                }
                if ("downscale".equals(programName)) break block5;
                if (!"upscale".equals(programName)) break block6;
            }
            String[] stringArray = new String[1];
            stringArray[0] = "Position";
            b.bindAttributes(programId, stringArray);
        }
    }

    public static void unregisterShaderLibraries(GlShaderLibrary ... shaderLibraries) {
        GlShaderLibrary[] glShaderLibraryArray = shaderLibraries;
        int n = glShaderLibraryArray.length;
        for (int i = 0; i < n; ++i) {
            GlShaderLibrary shaderLibrary = glShaderLibraryArray[i];
            libraries.remove(shaderLibrary.libraryEntry().name());
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Pair<String, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>>> includeShaderLibraries(String content) {
        void var1_1;
        String string;
        HashMap uniforms = new HashMap();
        boolean writeAction = false;
        boolean writeLibName = false;
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (i < content.length()) {
            void var6_6;
            char ch = content.charAt(i);
            ++i;
            if (ch == '#') {
                s = new StringBuilder("#");
                writeAction = true;
                continue;
            }
            if (ch == '<') {
                if (writeAction) {
                    writeAction = false;
                    if (s.toString().equals(includeLibOperator)) {
                        writeLibName = true;
                    }
                    s = new StringBuilder();
                    continue;
                }
            }
            if (ch == '>') {
                if (writeLibName) {
                    writeLibName = false;
                    GlShaderLibrary library = b.getShaderLibrary(s.toString());
                    library.uniforms().forEach((s1, uniformType) -> {
                        if (uniforms.containsKey(s1)) {
                            \u062f\u0646.printAndExit(new \u0628\u062a((String)s1));
                        }
                        uniforms.put(s1, uniformType);
                    });
                    content = content.replace(includeLibOperator.concat("<").concat(s.toString()).concat(">"), library.libraryEntry().content());
                    i -= "#".concat(includeLibOperator).concat("<").concat(s.toString()).length();
                    s = new StringBuilder();
                    continue;
                }
            }
            s.append((char)var6_6);
        }
        return new Pair<String, void>(string, var1_1);
    }

    /*
     * WARNING - void declaration
     */
    public static \u0631\u0631 compileShader(a shaderEntry, \u062d\u0622 shaderType) {
        void var4_4;
        Pair<String, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a<?>>> content = b.includeShaderLibraries(shaderEntry.content());
        int shaderId = GL20.glCreateShader((int)shaderType.glId);
        GL20.glShaderSource((int)shaderId, (CharSequence)content.getFirst());
        GL20.glCompileShader((int)shaderId);
        \u0631\u0631 shader = new \u0631\u0631(shaderEntry.name(), content.getFirst(), shaderId, content.getSecond(), shaderType);
        A compileResult = shader.getCompileResult();
        if (compileResult.isFailure()) {
            \u062f\u0646.printAndExit(new \u0632\u0642(shaderEntry.name(), compileResult.message()));
        }
        return var4_4;
    }
}

