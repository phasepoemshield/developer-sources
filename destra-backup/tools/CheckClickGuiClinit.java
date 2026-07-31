import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckClickGuiClinit {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                int vmbCount = 0;
                int ldcCount = 0;
                int putstaticCount = 0;
                int getstaticCount = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        if (mn.owner.contains("VMBridge") || mn.owner.contains("dreamix")) {
                            vmbCount++;
                            System.out.printf("  VMBridge call: %s.%s%s%n", mn.owner, mn.name, mn.desc);
                        }
                    }
                    if (insn instanceof LdcInsnNode) ldcCount++;
                    if (insn.getOpcode() == Opcodes.PUTSTATIC) putstaticCount++;
                    if (insn.getOpcode() == Opcodes.GETSTATIC) getstaticCount++;
                }
                System.out.println("\n  Total: VMBridge=" + vmbCount + " LDC=" + ldcCount +
                    " PUTSTATIC=" + putstaticCount + " GETSTATIC=" + getstaticCount);
            }
        }
    }
}
