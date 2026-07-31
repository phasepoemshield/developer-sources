import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckKeybindSettingIndy {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        int biVCount = 0;
        int lmfCount = 0;
        for (MethodNode m : cn.methods) {
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof InvokeDynamicInsnNode) {
                    InvokeDynamicInsnNode idn = (InvokeDynamicInsnNode) insn;
                    String bsmOwner = idn.bsm.getOwner();
                    if (bsmOwner.contains("biV")) {
                        biVCount++;
                        System.out.printf("  biV indy in %s: name=%s desc=%s bsm=%s.%s%n",
                            m.name, idn.name, idn.desc, bsmOwner, idn.bsm.getName());
                    } else if (bsmOwner.contains("LambdaMetafactory")) {
                        lmfCount++;
                    } else {
                        System.out.printf("  OTHER indy in %s: bsm=%s.%s%n", m.name, bsmOwner, idn.bsm.getName());
                    }
                }
            }
        }
        System.out.println("\nTotal: biV=" + biVCount + " LMF=" + lmfCount);
    }
}
