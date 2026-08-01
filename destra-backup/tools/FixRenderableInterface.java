import org.objectweb.asm.*;
import org.objectweb.asm.Opcodes;
import java.nio.file.*;
import java.io.*;

public class FixRenderableInterface {
    public static void main(String[] args) throws Exception {
        // Renderable: decompiler turned the interface into an abstract class -> convert back.
        // TextRenderCallback: same artifact — .precompiled is an abstract class but lambdas
        // (LambdaMetafactory) require a real interface. Without this, ScoreboardHudModule's
        // invokedynamic-generated lambda throws AbstractMethodError: $$Lambda does not define
        // render(String,int,boolean). The source TextRenderCallback.java is already an interface,
        // but .precompiled is on the runtime classpath in dev and can shadow it, so fix both.
        String[][] targetGroups = {
            { ".precompiled/ru/destra/render/Renderable.class",
              "build/classes/java/main/ru/destra/render/Renderable.class" },
            { ".precompiled/ru/destra/font/TextRenderCallback.class",
              "build/classes/java/main/ru/destra/font/TextRenderCallback.class" },
            // Account: source is an interface but .precompiled is an abstract class (decompiler
            // artifact). 6 classes implement Account (NamedColor, Theme2DManager, ThemeManager,
            // AccountManager, Friend, OfflineAccount) and 0 extend it, so interface is correct.
            // Without this, DestraClient.initThemes -> NamedColor loading throws
            // IncompatibleClassChangeError: NamedColor can not implement Account (not an interface).
            { ".precompiled/ru/destra/social/Account.class",
              "build/classes/java/main/ru/destra/social/Account.class" },
            // Easing: 10 classes implement it (lambdas via LambdaMetafactory), 0 extend it.
            // Same artifact -> AbstractMethodError: Easing$$Lambda does not define ease(...).
            { ".precompiled/ru/destra/animation/Easing.class",
              "build/classes/java/main/ru/destra/animation/Easing.class" },
            // MolangMathFunctions: 1 implementer, 0 extenders, no instance fields.
            { ".precompiled/ru/destra/util/MolangMathFunctions.class",
              "build/classes/java/main/ru/destra/util/MolangMathFunctions.class" }
        };
        for (String[] targets : targetGroups) {
        for (String path : targets) {
            Path p = Path.of(path);
            if (!Files.exists(p)) { System.out.println("SKIP " + path); continue; }
            byte[] raw = Files.readAllBytes(p);
            ClassReader cr = new ClassReader(raw);
            ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
            ClassVisitor cv = new ClassVisitor(Opcodes.ASM9, cw) {
                @Override
                public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                    // Convert abstract class to interface: add ACC_INTERFACE, keep ACC_ABSTRACT, remove ACC_SUPER
                    int newAccess = (access | Opcodes.ACC_INTERFACE | Opcodes.ACC_ABSTRACT) & ~Opcodes.ACC_SUPER;
                    super.visit(version, newAccess, name, signature, superName, interfaces);
                }
                @Override
                public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
                    // Interface fields must be public static final per JVM spec
                    access = Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL;
                    return super.visitField(access, name, descriptor, signature, value);
                }
            };
            cr.accept(cv, 0);
            byte[] out = cw.toByteArray();
            Files.write(p, out);
            System.out.println("Fixed: " + path + " (" + out.length + " bytes)");
        }
        }
    }
}
