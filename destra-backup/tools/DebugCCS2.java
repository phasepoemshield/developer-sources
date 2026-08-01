import java.io.*;
import java.nio.file.*;
import java.util.zip.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class DebugCCS2 {
    public static void main(String[] args) throws Exception {
        Path path = Path.of(args[0]);
        byte[] bytes;
        if (path.toString().endsWith(".jar")) {
            try (ZipFile zf = new ZipFile(path.toFile())) {
                var entry = zf.stream().filter(e -> e.getName().equals("ru/destra/misc/ChatCommandSender2.class")).findFirst().get();
                var baos = new ByteArrayOutputStream();
                try (InputStream is = zf.getInputStream(entry)) { is.transferTo(baos); }
                bytes = baos.toByteArray();
            }
        } else {
            bytes = Files.readAllBytes(path);
        }
        ClassReader cr = new ClassReader(bytes);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);
        System.out.println("Class: " + cn.name + " access=0x" + Integer.toHexString(cn.access));
        if (cn.interfaces != null && !cn.interfaces.isEmpty()) {
            System.out.println("Interfaces: " + cn.interfaces);
        }
        System.out.println("Fields:");
        for (FieldNode fn : cn.fields) {
            System.out.println("  " + fn.name + " " + fn.desc + " access=0x" + Integer.toHexString(fn.access));
        }
        System.out.println("Methods:");
        for (MethodNode mn : cn.methods) {
            System.out.println("  " + mn.name + mn.desc + " access=0x" + Integer.toHexString(mn.access) + " insns=" + (mn.instructions == null ? "NULL" : mn.instructions.size()));
            if (mn.instructions != null) {
                for (AbstractInsnNode insn : mn.instructions) {
                    if (insn instanceof FieldInsnNode fin) {
                        System.out.println("    FieldInsn: opcode=" + insn.getOpcode() + " " + fin.owner + "." + fin.name + " " + fin.desc);
                    } else if (insn instanceof MethodInsnNode min) {
                        System.out.println("    MethodInsn: opcode=" + insn.getOpcode() + " " + min.owner + "." + min.name + min.desc);
                    } else if (insn.getOpcode() >= 0) {
                        System.out.println("    opcode=" + insn.getOpcode());
                    } else {
                        System.out.println("    [label/line/frame]");
                    }
                }
            }
        }
    }
}
