import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckPartyMarker {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/module/PartyMarkerModule.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        // Check markerQueue field
        for (FieldNode fn : cn.fields) {
            if (fn.name.equals("markerQueue")) {
                System.out.printf("field markerQueue %s access=0x%X%n", fn.desc, fn.access);
            }
        }

        // Check <clinit> for markerQueue init
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                System.out.println("<clinit> insns=" + m.instructions.size());
                boolean found = false;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fin = (FieldInsnNode) insn;
                        if (fin.name.equals("markerQueue")) {
                            System.out.println("  markerQueue " + (insn.getOpcode()==Opcodes.PUTSTATIC?"PUTSTATIC":"GETSTATIC"));
                            found = true;
                        }
                    }
                }
                if (!found) System.out.println("  markerQueue NOT initialized in <clinit>!");
            }
        }
    }
}
