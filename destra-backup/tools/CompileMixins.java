import javax.tools.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class CompileMixins {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        String cp = ".precompiled;tools_out;"
            + "C:/Users/Vlad/.gradle/caches/fabric-loom/minecraftMaven/net/minecraft/minecraft-merged/1.21.4-net.fabricmc.yarn.1_21_4.1.21.4+build.8-v2/minecraft-merged-1.21.4-net.fabricmc.yarn.1_21_4.1.21.4+build.8-v2.jar;"
            + "C:/Users/Vlad/.gradle/caches/modules-2/files-2.1/net.fabricmc/sponge-mixin/0.15.5+mixin.0.8.7/22f9eb729e216a091673a574a5906dc1b9027fb3/sponge-mixin-0.15.5+mixin.0.8.7.jar;"
            + "C:/Users/Vlad/.gradle/caches/modules-2/files-2.1/net.fabricmc/fabric-loader/0.16.14/5778d47f536bf2c63ed2abc1a56f5a1c129e34a/fabric-loader-0.16.14.jar;"
            + "C:/Users/Vlad/.gradle/caches/modules-2/files-2.1/io.github.llamalad7/mixinextras-fabric/0.5.4/5e167154bcb9942111313a5e186e16cd7265f858/mixinextras-fabric-0.5.4.jar;"
            + "C:/Users/Vlad/.gradle/caches/modules-2/files-2.1/org.joml/joml/1.10.8/fc0a71dad90a2cf41d82a76156a0e700af8e4f8d/joml-1.10.8.jar";
        
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        
        List<String> options = new ArrayList<>();
        options.add("-source");
        options.add("21");
        options.add("-target");
        options.add("21");
        options.add("-encoding");
        options.add("UTF-8");
        options.add("-proc:none");
        options.add("-cp");
        options.add(cp);
        options.add("-d");
        options.add(".precompiled");
        
        List<File> sourceFiles = new ArrayList<>();
        sourceFiles.add(new File("tools_out/mixin_src/sg/mx/GameRendererMixin.java"));
        sourceFiles.add(new File("tools_out/mixin_src/sg/mx/OverlayTextureMixin.java"));
        
        // Convert to JavaFileObjects with explicit UTF-8 reading
        List<JavaFileObject> compilationUnits = new ArrayList<>();
        for (File f : sourceFiles) {
            String content = new String(Files.readAllBytes(f.toPath()), StandardCharsets.UTF_8);
            compilationUnits.add(new SimpleJavaFileObject(f.toURI(), JavaFileObject.Kind.SOURCE) {
                @Override
                public CharSequence getCharContent(boolean ignoreEncodingErrors) {
                    return content;
                }
            });
        }
        
        boolean success = compiler.getTask(null, null, diagnostics, options, null, compilationUnits).call();
        
        for (Diagnostic<?> d : diagnostics.getDiagnostics()) {
            System.out.println(d);
        }
        
        if (success) {
            System.out.println("Compilation successful!");
            System.out.println("GameRendererMixin.class exists: " + Files.exists(Path.of(".precompiled/sg/mx/GameRendererMixin.class")));
            System.out.println("OverlayTextureMixin.class exists: " + Files.exists(Path.of(".precompiled/sg/mx/OverlayTextureMixin.class")));
        } else {
            System.out.println("Compilation failed!");
        }
    }
}
