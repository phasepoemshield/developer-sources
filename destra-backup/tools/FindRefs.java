import java.util.zip.*;
import java.util.*;
import java.io.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public class FindRefs {
    public static void main(String[] args) throws Exception {
        try (ZipFile zf = new ZipFile(args[0])) {
            for (var entry : zf.stream().toList()) {
                if (!entry.getName().endsWith(".class")) continue;
                byte[] bytes;
                try (InputStream is = zf.getInputStream(entry)) {
                    bytes = is.readAllBytes();
                }
                ClassNode cn = new ClassNode();
                new ClassReader(bytes).accept(cn, 0);
                for (MethodNode mn : cn.methods) {
                    if (mn.instructions == null) continue;
                    for (AbstractInsnNode insn : mn.instructions) {
                        if (insn instanceof FieldInsnNode fin) {
                            if (fin.owner.contains("ChatCommandSender2")) {
                                System.out.println(entry.getName() + " -> " + cn.name + "." + mn.name + mn.desc + " refs " + fin.owner + "." + fin.name + " " + fin.desc);
                            }
                        }
                        if (insn instanceof MethodInsnNode min) {
                            if (min.owner.contains("ChatCommandSender2")) {
                                System.out.println(entry.getName() + " -> " + cn.name + "." + mn.name + mn.desc + " calls " + min.owner + "." + min.name + min.desc);
                            }
                        }
                    }
                }
            }
        }
    }
}
