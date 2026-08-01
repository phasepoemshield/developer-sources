import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchPublicFields {
    static final String COOLDOWN_TIMER_DESC = "Lru/destra/util/CooldownTimer;";

    static final String[][] TARGETS = {
        {".precompiled/ru/destra/gui/DummyScreen.class", "notificationTypeSwitchTable"},
        {".precompiled/ru/destra/animation/DirectionalAnimation.class", "timer"},
        {".precompiled/ru/destra/animation/TimedAnimation.class", "timer"},
    };

    static final String[] ALL_FIELDS_PUBLIC = {
        ".precompiled/ru/destra/render/BoxRenderCommand.class",
        ".precompiled/ru/destra/render/LineRenderSettings.class",
    };

    static final String[] COOLDOWN_TIMER_CLASSES = {
        ".precompiled/ru/destra/animation/AccelerateAnimation.class",
    };

    public static void main(String[] args) throws Exception {
        for (String[] target : TARGETS) {
            patchFile(target[0], target[1]);
        }
        for (String classPath : COOLDOWN_TIMER_CLASSES) {
            patchFirstCooldownTimer(classPath);
        }
        for (String classPath : ALL_FIELDS_PUBLIC) {
            makeAllFieldsPublic(classPath);
        }
    }

    static void patchFirstCooldownTimer(String classPath) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(classPath));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean changed = false;
        for (FieldNode f : cn.fields) {
            if (COOLDOWN_TIMER_DESC.equals(f.desc) && (f.access & Opcodes.ACC_STATIC) == 0) {
                int oldAccess = f.access;
                if ((f.access & Opcodes.ACC_PUBLIC) == 0) {
                    f.access = (f.access & ~(Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED)) | Opcodes.ACC_PUBLIC;
                    System.out.println("  " + cn.name + ": made timer '" + f.name + "' public: 0x" + Integer.toHexString(oldAccess) + " -> 0x" + Integer.toHexString(f.access));
                    changed = true;
                }
            }
        }

        if (!changed) {
            System.out.println("  " + cn.name + ": no CooldownTimer change");
            return;
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Path tmp = Path.of(classPath + ".tmp");
        Files.write(tmp, result);
        Files.delete(Path.of(classPath));
        Files.move(tmp, Path.of(classPath));
        System.out.println("Written " + result.length + " bytes to " + classPath);
    }

    static void patchFile(String classPath, String fieldName) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(classPath));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean changed = false;
        for (FieldNode f : cn.fields) {
            if (f.name.equals(fieldName)) {
                int oldAccess = f.access;
                if ((f.access & Opcodes.ACC_PUBLIC) == 0) {
                    f.access = (f.access & ~(Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED)) | Opcodes.ACC_PUBLIC;
                    System.out.println("  " + cn.name + ": made '" + fieldName + "' public: 0x" + Integer.toHexString(oldAccess) + " -> 0x" + Integer.toHexString(f.access));
                    changed = true;
                } else {
                    System.out.println("  " + cn.name + ": '" + fieldName + "' already public");
                }
            }
        }

        if (!changed) {
            System.out.println("  " + cn.name + ": no change for '" + fieldName + "'");
            return;
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Path tmp = Path.of(classPath + ".tmp");
        Files.write(tmp, result);
        Files.delete(Path.of(classPath));
        Files.move(tmp, Path.of(classPath));
        System.out.println("Written " + result.length + " bytes to " + classPath);
    }

    static void makeAllFieldsPublic(String classPath) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(classPath));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        int changed = 0;
        for (FieldNode f : cn.fields) {
            if ((f.access & Opcodes.ACC_PUBLIC) == 0) {
                int oldAccess = f.access;
                f.access = (f.access & ~(Opcodes.ACC_PRIVATE | Opcodes.ACC_PROTECTED)) | Opcodes.ACC_PUBLIC;
                System.out.println("  " + cn.name + ": made '" + f.name + "' public: 0x" + Integer.toHexString(oldAccess) + " -> 0x" + Integer.toHexString(f.access));
                changed++;
            }
        }

        if (changed == 0) {
            System.out.println("  " + cn.name + ": all fields already public");
            return;
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Path tmp = Path.of(classPath + ".tmp");
        Files.write(tmp, result);
        Files.delete(Path.of(classPath));
        Files.move(tmp, Path.of(classPath));
        System.out.println("  " + cn.name + ": " + changed + " fields made public, written " + result.length + " bytes");
    }
}
