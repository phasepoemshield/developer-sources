import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class PatchBabyModFields {
    public static void main(String[] args) throws Exception {
        String classPath = ".precompiled/sg/mx/PlayerEntityRendererMixin.class";
        File f = new File(classPath);
        if (!f.exists()) {
            System.out.println("  PlayerEntityRendererMixin.class not found (using source version) - skipping");
            return;
        }

        byte[] classData = Files.readAllBytes(Path.of(classPath));
        ClassReader cr = new ClassReader(classData);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean changed = false;

        changed |= patchClinitFields(cn);
        changed |= patchOnScaleAllPlayers(cn);

        if (changed) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(classPath), cw.toByteArray());
        }
    }

    private static boolean patchClinitFields(ClassNode cn) {
        List<FieldNode> floatFields = new ArrayList<>();
        FieldNode doubleField = null;
        for (FieldNode f : cn.fields) {
            if (f.desc.equals("F")) {
                floatFields.add(f);
            } else if (f.desc.equals("D")) {
                doubleField = f;
            }
        }

        if (floatFields.size() < 3 || doubleField == null) {
            System.out.println("  ERROR: Expected >=3 float fields and 1 double field");
            return false;
        }

        MethodNode clinit = null;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("<clinit>")) {
                clinit = m;
                break;
            }
        }
        if (clinit == null) return false;

        boolean alreadyPatched = false;
        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn instanceof FieldInsnNode) {
                FieldInsnNode fin = (FieldInsnNode) insn;
                if (fin.getOpcode() == Opcodes.PUTSTATIC) {
                    alreadyPatched = true;
                    break;
                }
            }
        }
        if (alreadyPatched) {
            System.out.println("  PlayerEntityRendererMixin: fields already initialized");
            return false;
        }

        AbstractInsnNode lastReturn = null;
        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn.getOpcode() == Opcodes.RETURN) {
                lastReturn = insn;
            }
        }
        if (lastReturn == null) return false;

        InsnList toInsert = new InsnList();
        toInsert.add(new LdcInsnNode(0.5f));
        toInsert.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, floatFields.get(0).name, "F"));
        toInsert.add(new LdcInsnNode(0.5f));
        toInsert.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, floatFields.get(1).name, "F"));
        toInsert.add(new LdcInsnNode(0.5f));
        toInsert.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, floatFields.get(2).name, "F"));
        toInsert.add(new LdcInsnNode(0.5d));
        toInsert.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, doubleField.name, "D"));
        clinit.instructions.insertBefore(lastReturn, toInsert);

        System.out.println("  Patched PlayerEntityRendererMixin: initialized baby mod scale fields to 0.5");
        return true;
    }

    private static boolean patchOnScaleAllPlayers(ClassNode cn) {
        MethodNode onScale = null;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("onScale") && m.desc.contains("PlayerEntityRenderState")) {
                onScale = m;
                break;
            }
        }
        if (onScale == null) {
            System.out.println("  ERROR: onScale method not found");
            return false;
        }

        AbstractInsnNode ifIcmpne = null;
        for (AbstractInsnNode insn : onScale.instructions) {
            if (insn.getOpcode() == Opcodes.IF_ICMPNE) {
                ifIcmpne = insn;
                break;
            }
        }
        if (ifIcmpne == null) {
            System.out.println("  PlayerEntityRendererMixin: onScale already patched (no IF_ICMPNE)");
            return false;
        }

        AbstractInsnNode aload1 = null;
        AbstractInsnNode prev = ifIcmpne.getPrevious();
        while (prev != null) {
            if (prev instanceof VarInsnNode) {
                VarInsnNode vin = (VarInsnNode) prev;
                if (vin.getOpcode() == Opcodes.ALOAD && vin.var == 1) {
                    aload1 = prev;
                    break;
                }
            }
            prev = prev.getPrevious();
        }

        if (aload1 == null) {
            System.out.println("  ERROR: Could not find ALOAD_1 before IF_ICMPNE");
            return false;
        }

        List<AbstractInsnNode> toRemove = new ArrayList<>();
        AbstractInsnNode cur = aload1;
        while (cur != null && cur != ifIcmpne) {
            toRemove.add(cur);
            cur = cur.getNext();
        }
        toRemove.add(ifIcmpne);

        for (AbstractInsnNode insn : toRemove) {
            onScale.instructions.remove(insn);
        }

        System.out.println("  Patched PlayerEntityRendererMixin: onScale now applies to ALL players");
        return true;
    }
}
