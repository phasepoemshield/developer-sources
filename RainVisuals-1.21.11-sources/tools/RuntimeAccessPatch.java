import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;

/**
 * Repairs access damage introduced by the leaked Rain obfuscation pass.
 *
 * Rain directly invokes implementation classes such as
 * kotlin.text.StringsKt__StringsJVMKt even though those classes are normally
 * package-private.  The original bytecode therefore fails verification as soon
 * as affected UI/config paths execute.  Promoting the bundled Kotlin
 * implementation classes to public restores linkage without altering methods.
 */
public final class RuntimeAccessPatch {
    public static void main(String[] args) throws Exception {
        if (args.length != 2 && args.length != 3) {
            System.err.println("Usage: RuntimeAccessPatch <input.jar> <output.jar> [ias.jar]");
            System.exit(2);
        }
        Path input = Path.of(args[0]);
        Path output = Path.of(args[1]);
        Path iasJar = args.length == 3 ? Path.of(args[2]) : null;
        Files.createDirectories(output.toAbsolutePath().getParent());
        int patchedClasses = 0;
        int patchedConstructors = 0;
        int patchedAnimationLookups = 0;
        int patchedEntrypointMethods = 0;
        int patchedModelsCatalogMethods = 0;
        int patchedModelsInstallerMethods = 0;
        Set<String> outputNames = new HashSet<>();

        try (JarFile jar = new JarFile(input.toFile());
             JarOutputStream out = new JarOutputStream(Files.newOutputStream(output))) {
            Enumeration<JarEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                if (entry.isDirectory()) continue;
                String name = entry.getName();
                String upper = name.toUpperCase(Locale.ROOT);
                if (upper.startsWith("META-INF/") && (upper.endsWith(".SF") || upper.endsWith(".RSA") || upper.endsWith(".DSA"))) {
                    continue;
                }
                byte[] data;
                try (InputStream in = jar.getInputStream(entry)) {
                    data = in.readAllBytes();
                }
                if (name.equals("fabric.mod.json") && iasJar != null) {
                    String json = new String(data, StandardCharsets.UTF_8);
                    String existing = "\"jars\":[{\"file\":\"META-INF/jars/figura-1.0.3.jar\"}]";
                    String bundled = "\"jars\":[{\"file\":\"META-INF/jars/figura-1.0.3.jar\"},"
                            + "{\"file\":\"META-INF/jars/IAS-9.0.7+1.21.11-fabric.jar\"}]";
                    if (!json.contains(existing)) {
                        throw new IllegalStateException("unexpected fabric.mod.json jars declaration");
                    }
                    data = json.replace(existing, bundled).getBytes(StandardCharsets.UTF_8);
                }
                if (name.endsWith(".class")) {
                    ClassReader reader = new ClassReader(data);
                    String className = reader.getClassName();
                    boolean patchKotlinClass = className.startsWith("kotlin/");
                    boolean patchUnixConstructors = className.startsWith("org/newsclub/net/unix/AFSocketImpl$");
                    boolean patchModeAnimations = className.equals("oxxxde/حق");
                    boolean patchRainEntrypoint = className.equals("rainpatch/RainPatchEntryPoint");
                    boolean patchModelsCatalog = className.equals("oxxxde/صل");
                    boolean patchModelsInstaller = className.equals("oxxxde/دس");
                    if (patchKotlinClass || patchUnixConstructors || patchModeAnimations || patchRainEntrypoint || patchModelsCatalog || patchModelsInstaller) {
                        ClassWriter writer = new ClassWriter(0);
                        int[] constructorCount = {0};
                        int[] animationLookupCount = {0};
                        int[] entrypointMethodCount = {0};
                        int[] modelsCatalogMethodCount = {0};
                        int[] modelsInstallerMethodCount = {0};
                        ClassVisitor visitor = new ClassVisitor(Opcodes.ASM8, writer) {
                            @Override
                            public void visit(int version, int access, String internalName, String signature, String superName, String[] interfaces) {
                                if (patchKotlinClass && (access & Opcodes.ACC_PUBLIC) == 0) {
                                    access = (access & ~(Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED)) | Opcodes.ACC_PUBLIC;
                                }
                                super.visit(version, access, internalName, signature, superName, interfaces);
                            }

                            @Override
                            public MethodVisitor visitMethod(int access, String methodName, String descriptor, String signature, String[] exceptions) {
                                if (patchModelsInstaller && methodName.equals("initializeRemoteCatalog") && descriptor.equals("()V")) {
                                    MethodVisitor replacement = super.visitMethod(access, methodName, descriptor, signature, exceptions);
                                    replacement.visitCode();
                                    replacement.visitMethodInsn(
                                            Opcodes.INVOKESTATIC,
                                            "rainpatch/ModelsNetworkBridge",
                                            "initialize",
                                            "()V",
                                            false
                                    );
                                    replacement.visitInsn(Opcodes.RETURN);
                                    replacement.visitMaxs(0, 0);
                                    replacement.visitEnd();
                                    modelsInstallerMethodCount[0]++;
                                    return null;
                                }
                                if (patchModelsCatalog) {
                                    String bridgeDescriptor = descriptor;
                                    int returnOpcode = Opcodes.RETURN;
                                    boolean replace = false;
                                    switch (methodName + descriptor) {
                                        case "downloadAsset(Ljava/lang/String;JI)[B" -> {
                                            replace = true;
                                            returnOpcode = Opcodes.ARETURN;
                                        }
                                        case "loadPreview(Ljava/lang/String;)[B" -> {
                                            replace = true;
                                            returnOpcode = Opcodes.ARETURN;
                                        }
                                        case "startRefresh()Ljava/util/concurrent/CompletableFuture;" -> {
                                            replace = true;
                                            returnOpcode = Opcodes.ARETURN;
                                        }
                                        case "refreshBlocking()V", "refreshNow()V", "refreshAsync()V", "refreshIfStale()V", "initialize()V" -> replace = true;
                                        case "downloadArchive(Loxxxde/سد;)[B" -> {
                                            replace = true;
                                            bridgeDescriptor = "(Ljava/lang/Object;)[B";
                                            returnOpcode = Opcodes.ARETURN;
                                        }
                                        default -> {
                                        }
                                    }
                                    if (replace) {
                                        MethodVisitor replacement = super.visitMethod(access, methodName, descriptor, signature, exceptions);
                                        replacement.visitCode();
                                        if (descriptor.equals("(Ljava/lang/String;JI)[B")) {
                                            replacement.visitVarInsn(Opcodes.ALOAD, 0);
                                            replacement.visitVarInsn(Opcodes.LLOAD, 1);
                                            replacement.visitVarInsn(Opcodes.ILOAD, 3);
                                        } else if (descriptor.equals("(Ljava/lang/String;)[B") || descriptor.equals("(Loxxxde/سد;)[B")) {
                                            replacement.visitVarInsn(Opcodes.ALOAD, 0);
                                        }
                                        replacement.visitMethodInsn(
                                                Opcodes.INVOKESTATIC,
                                                "rainpatch/ModelsNetworkBridge",
                                                methodName,
                                                bridgeDescriptor,
                                                false
                                        );
                                        replacement.visitInsn(returnOpcode);
                                        replacement.visitMaxs(4, 4);
                                        replacement.visitEnd();
                                        modelsCatalogMethodCount[0]++;
                                        return null;
                                    }
                                }
                                if (patchRainEntrypoint
                                        && descriptor.equals("()V")
                                        && (methodName.equals("onInitializeClient") || methodName.equals("openLink"))) {
                                    MethodVisitor replacement = super.visitMethod(access, methodName, descriptor, signature, exceptions);
                                    replacement.visitCode();
                                    if (methodName.equals("onInitializeClient")) {
                                        replacement.visitMethodInsn(
                                                Opcodes.INVOKESTATIC,
                                                "rainpatch/RuntimeFixes",
                                                "initializeRain",
                                                "()V",
                                                false
                                        );
                                    }
                                    replacement.visitInsn(Opcodes.RETURN);
                                    replacement.visitMaxs(0, (access & Opcodes.ACC_STATIC) == 0 ? 1 : 0);
                                    replacement.visitEnd();
                                    entrypointMethodCount[0]++;
                                    return null;
                                }
                                if (patchUnixConstructors && methodName.equals("<init>") && (access & Opcodes.ACC_PUBLIC) == 0) {
                                    access = (access & ~(Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED)) | Opcodes.ACC_PUBLIC;
                                    constructorCount[0]++;
                                }
                                MethodVisitor delegate = super.visitMethod(access, methodName, descriptor, signature, exceptions);
                                if (!patchModeAnimations || !methodName.equals("render") || !descriptor.equals("(IIF)V")) {
                                    return delegate;
                                }
                                return new MethodVisitor(Opcodes.ASM8, delegate) {
                                    @Override
                                    public void visitMethodInsn(int opcode, String owner, String invokedName, String invokedDescriptor, boolean isInterface) {
                                        if (opcode == Opcodes.INVOKEINTERFACE
                                                && owner.equals("java/util/Map")
                                                && invokedName.equals("get")
                                                && invokedDescriptor.equals("(Ljava/lang/Object;)Ljava/lang/Object;")) {
                                            super.visitMethodInsn(
                                                    Opcodes.INVOKESTATIC,
                                                    "rainpatch/RuntimeFixes",
                                                    "animation",
                                                    "(Ljava/util/Map;Ljava/lang/String;)Loxxxde/ري;",
                                                    false
                                            );
                                            animationLookupCount[0]++;
                                            return;
                                        }
                                        super.visitMethodInsn(opcode, owner, invokedName, invokedDescriptor, isInterface);
                                    }
                                };
                            }
                        };
                        reader.accept(visitor, 0);
                        data = writer.toByteArray();
                        patchedClasses++;
                        patchedConstructors += constructorCount[0];
                        patchedAnimationLookups += animationLookupCount[0];
                        patchedEntrypointMethods += entrypointMethodCount[0];
                        patchedModelsCatalogMethods += modelsCatalogMethodCount[0];
                        patchedModelsInstallerMethods += modelsInstallerMethodCount[0];
                    }
                }
                if (!outputNames.add(name)) throw new IllegalStateException("duplicate output entry: " + name);
                JarEntry destination = new JarEntry(name);
                destination.setTime(entry.getTime());
                out.putNextEntry(destination);
                out.write(data);
                out.closeEntry();
            }
            if (iasJar != null) {
                String nestedName = "META-INF/jars/IAS-9.0.7+1.21.11-fabric.jar";
                if (!outputNames.add(nestedName)) {
                    throw new IllegalStateException("duplicate output entry: " + nestedName);
                }
                JarEntry nested = new JarEntry(nestedName);
                nested.setTime(Files.getLastModifiedTime(iasJar).toMillis());
                out.putNextEntry(nested);
                Files.copy(iasJar, out);
                out.closeEntry();
            }
        }
        if (patchedAnimationLookups != 2) {
            throw new IllegalStateException("expected 2 ModeSetting animation lookups, patched " + patchedAnimationLookups);
        }
        if (patchedEntrypointMethods != 2) {
            throw new IllegalStateException("expected 2 leak-entrypoint methods, patched " + patchedEntrypointMethods);
        }
        if (patchedModelsCatalogMethods != 9) {
            throw new IllegalStateException("expected 9 Models catalog methods, patched " + patchedModelsCatalogMethods);
        }
        if (patchedModelsInstallerMethods != 1) {
            throw new IllegalStateException("expected 1 Models installer method, patched " + patchedModelsInstallerMethods);
        }
        System.out.printf("patchedClasses=%d patchedConstructors=%d patchedAnimationLookups=%d patchedEntrypointMethods=%d patchedModelsCatalogMethods=%d patchedModelsInstallerMethods=%d%n",
                patchedClasses, patchedConstructors, patchedAnimationLookups, patchedEntrypointMethods, patchedModelsCatalogMethods, patchedModelsInstallerMethods);
    }
}
