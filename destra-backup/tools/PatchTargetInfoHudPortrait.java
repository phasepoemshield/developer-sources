import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchTargetInfoHudPortrait {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/hud/TargetInfoHud.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean patched = false;
        for (MethodNode m : cn.methods) {
            if (!m.desc.equals("(Lru/destra/event/Render2DEvent;)V")) continue;
            InsnList ins = m.instructions;
            for (AbstractInsnNode n = ins.getFirst(); n != null; n = n.getNext()) {
                if (!(n instanceof VarInsnNode)) continue;
                VarInsnNode aload0 = (VarInsnNode) n;
                if (aload0.getOpcode() != Opcodes.ALOAD || aload0.var != 0) continue;
                AbstractInsnNode i1 = aload0.getNext();
                if (!(i1 instanceof IntInsnNode)) continue;
                IntInsnNode sipush = (IntInsnNode) i1;
                if (sipush.getOpcode() != Opcodes.SIPUSH || sipush.operand != 255) continue;
                AbstractInsnNode i2 = sipush.getNext();
                if (!(i2 instanceof VarInsnNode)) continue;
                VarInsnNode fload7 = (VarInsnNode) i2;
                if (fload7.getOpcode() != Opcodes.FLOAD || fload7.var != 7) continue;
                AbstractInsnNode i3 = fload7.getNext();
                if (!(i3 instanceof MethodInsnNode)) continue;
                MethodInsnNode inv = (MethodInsnNode) i3;
                if (inv.getOpcode() != Opcodes.INVOKEVIRTUAL || !inv.desc.equals("(IF)I")) continue;
                AbstractInsnNode i4 = inv.getNext();
                if (i4 == null || i4.getOpcode() != Opcodes.I2F) continue;
                AbstractInsnNode i5 = i4.getNext();
                if (!(i5 instanceof FieldInsnNode)) continue;
                FieldInsnNode gs = (FieldInsnNode) i5;
                if (gs.getOpcode() != Opcodes.GETSTATIC || !gs.desc.equals("F")) continue;
                AbstractInsnNode i6 = i5.getNext();
                if (i6 == null || i6.getOpcode() != Opcodes.FDIV) continue;
                AbstractInsnNode i7 = i6.getNext();
                if (!(i7 instanceof VarInsnNode)) continue;
                VarInsnNode fstore = (VarInsnNode) i7;
                if (fstore.getOpcode() != Opcodes.FSTORE) continue;

                InsnList repl = new InsnList();
                repl.add(new VarInsnNode(Opcodes.FLOAD, 7));
                repl.add(new VarInsnNode(Opcodes.FSTORE, fstore.var));
                ins.insert(aload0, repl);
                ins.remove(aload0);
                ins.remove(sipush);
                ins.remove(fload7);
                ins.remove(inv);
                ins.remove(i4);
                ins.remove(gs);
                ins.remove(i6);
                ins.remove(i7);
                patched = true;
                System.out.println("  Patched TargetInfoHud portrait alpha: fstore " + fstore.var + " = fload 7 (currentScale 0-1)");
                break;
            }
            if (patched) break;
        }

        if (!patched) {
            System.out.println("  ERROR: portrait alpha sequence not found in TargetInfoHud.onRender2D");
            return;
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        Files.write(Path.of(path), cw.toByteArray());
        Path buildCopy = Path.of("build/classes/java/main/ru/destra/hud/TargetInfoHud.class");
        if (buildCopy.toFile().exists()) {
            buildCopy.getParent().toFile().mkdirs();
            Files.write(buildCopy, cw.toByteArray());
            System.out.println("  Also wrote patched TargetInfoHud to build/classes");
        }
        System.out.println("  PatchTargetInfoHudPortrait: done");
    }
}
