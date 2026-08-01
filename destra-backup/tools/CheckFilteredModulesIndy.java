import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckFilteredModulesIndy {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        // Check all INVOKEDYNAMIC in the entire class
        for (MethodNode m : cn.methods) {
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof InvokeDynamicInsnNode) {
                    InvokeDynamicInsnNode idn = (InvokeDynamicInsnNode) insn;
                    String bsmOwner = idn.bsm.getOwner();
                    boolean isLambdaMF = bsmOwner.equals("java/lang/invoke/LambdaMetafactory");
                    System.out.printf("  %s: indy name=%s desc=%s bsm=%s.%s isLMF=%b%n",
                        m.name, idn.name, idn.desc, bsmOwner, idn.bsm.getName(), isLambdaMF);
                }
            }
        }
    }
}
