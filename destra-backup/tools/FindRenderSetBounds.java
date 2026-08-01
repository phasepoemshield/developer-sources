import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class FindRenderSetBounds {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if (!"render".equals(m.name)) continue;
            int offset = 0;
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof MethodInsnNode) {
                    MethodInsnNode mn = (MethodInsnNode) insn;
                    if (mn.name.equals("setBounds") || mn.name.equals("render") || mn.name.equals("setAlpha")
                        || mn.owner.contains("KeybindSettingElement")) {
                        System.out.printf("  offset %d: %s %s.%s%s%n",
                            offset, mn.getOpcode()==Opcodes.INVOKEVIRTUAL?"INVOKEVIRTUAL":"INVOKESPECIAL",
                            sn(mn.owner), mn.name, mn.desc);
                    }
                }
                offset++;
            }
        }
    }
    static String sn(String s) { int i = s.lastIndexOf('/'); return i >= 0 ? s.substring(i + 1) : s; }
}
