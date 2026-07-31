import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchFakePlayerFinals {
    public static void main(String[] args) throws Exception {
        String classPath = ".precompiled/ru/destra/misc/FakePlayerEntity.class";
        String sourcePath = "src/main/java/ru/destra/misc/FakePlayerEntity.java";

        byte[] classData = Files.readAllBytes(Path.of(classPath));
        ClassReader cr = new ClassReader(classData);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        Set<String> allowedMethods = new HashSet<>();
        allowedMethods.add("<init>");
        allowedMethods.add("<clinit>");
        allowedMethods.add("resetTransientUseState");
        allowedMethods.add("tick");
        allowedMethods.add("isPushable");
        allowedMethods.add("pushAwayFrom");
        allowedMethods.add("shouldRenderName");
        allowedMethods.add("isUsingRiptide");
        allowedMethods.add("isPartVisible");
        allowedMethods.add("pushAway");

        Iterator<MethodNode> it = cn.methods.iterator();
        int removed = 0;
        while (it.hasNext()) {
            MethodNode m = it.next();
            if (!allowedMethods.contains(m.name)) {
                it.remove();
                removed++;
                System.out.println("  Removed " + m.name + " " + m.desc);
            }
        }

        if (removed > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(classPath), cw.toByteArray());
            System.out.println("  Patched FakePlayerEntity: removed " + removed + " methods (kept only source-defined)");
        } else {
            System.out.println("  FakePlayerEntity: already clean");
        }
    }
}
