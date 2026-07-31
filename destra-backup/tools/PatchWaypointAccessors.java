import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class PatchWaypointAccessors {
    public static void main(String[] args) throws Exception {
        String classPath = ".precompiled/ru/destra/module/WaypointEventModule.class";
        byte[] classData = Files.readAllBytes(Path.of(classPath));
        ClassReader cr = new ClassReader(classData);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        int patched = 0;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("resolveSourceLabel") && m.desc.equals("(Ljava/lang/String;I)Ljava/lang/String;")) {
                m.access = (m.access & ~Opcodes.ACC_PRIVATE) | Opcodes.ACC_PUBLIC;
                patched++;
                System.out.println("  Made WaypointEventModule.resolveSourceLabel public");
            }
        }

        if (patched > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(classPath), cw.toByteArray());
            System.out.println("  Patched " + patched + " method(s)");
        } else {
            System.out.println("  resolveSourceLabel not found — already patched or renamed");
        }
    }
}
