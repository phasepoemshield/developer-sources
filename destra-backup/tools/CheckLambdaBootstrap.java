import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckLambdaBootstrap {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if (!"getFilteredModules".equals(m.name)) continue;
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof InvokeDynamicInsnNode) {
                    InvokeDynamicInsnNode idn = (InvokeDynamicInsnNode) insn;
                    System.out.println("=== INVOKEDYNAMIC in getFilteredModules ===");
                    System.out.printf("  name=%s desc=%s%n", idn.name, idn.desc);
                    System.out.printf("  bsm: %s.%s%s (tag=%d)%n", idn.bsm.getOwner(), idn.bsm.getName(), idn.bsm.getDesc(), idn.bsm.getTag());
                    for (int i = 0; i < idn.bsmArgs.length; i++) {
                        Object arg = idn.bsmArgs[i];
                        if (arg instanceof Type) {
                            System.out.printf("  bsmArg[%d]: Type %s%n", i, arg);
                        } else if (arg instanceof Handle) {
                            Handle h = (Handle) arg;
                            System.out.printf("  bsmArg[%d]: Handle tag=%d owner=%s name=%s desc=%s%n",
                                i, h.getTag(), h.getOwner(), h.getName(), h.getDesc());
                        } else {
                            System.out.printf("  bsmArg[%d]: %s%n", i, arg);
                        }
                    }
                }
            }
        }
    }
}
