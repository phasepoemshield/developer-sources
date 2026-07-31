import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchOptionsScreenMixin {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchOptionsScreenMixin <classfile>"); System.exit(1); }
        String classFile = args[0];
        byte[] data = Files.readAllBytes(Path.of(classFile));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        String brokenOwner = "sg/ec/3\u897F";
        String packScreenOwner = "net/minecraft/client/gui/screen/pack/PackScreen";
        String oldInitDesc = "(Lnet/minecraft/client/gui/screen/Screen;Lnet/minecraft/resource/ResourcePackManager;Ljava/util/function/Consumer;Ljava/nio/file/Path;Lnet/minecraft/text/Text;)V";
        String newInitDesc = "(Lnet/minecraft/resource/ResourcePackManager;Ljava/util/function/Consumer;Ljava/nio/file/Path;Lnet/minecraft/text/Text;)V";

        boolean patched = false;
        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("lambda$destra$replaceResourcePackButton$1")) {
                System.err.println("Patching lambda method: " + mn.name);
                List<AbstractInsnNode> toRemove = new ArrayList<>();
                ListIterator<AbstractInsnNode> it = mn.instructions.iterator();
                AbstractInsnNode pendingNew = null;
                boolean foundDup = false;

                while (it.hasNext()) {
                    AbstractInsnNode insn = it.next();
                    if (insn.getOpcode() == Opcodes.NEW) {
                        TypeInsnNode tin = (TypeInsnNode) insn;
                        if (tin.desc.equals(brokenOwner)) {
                            pendingNew = insn;
                            foundDup = false;
                            tin.desc = packScreenOwner;
                            System.err.println("  NEW sg/ec/3┐ -> NEW PackScreen");
                            patched = true;
                        }
                    } else if (insn.getOpcode() == Opcodes.DUP && pendingNew != null && !foundDup) {
                        foundDup = true;
                    } else if (foundDup && pendingNew != null) {
                        // After NEW + DUP, we expect: aload_0 + checkcast Screen (the parent Screen arg)
                        // We need to skip these 2 instructions to remove the extra Screen param
                        if (insn.getOpcode() == Opcodes.ALOAD && ((VarInsnNode) insn).var == 0) {
                            // This is the aload_0 pushing 'this' as Screen parent
                            toRemove.add(insn);
                            System.err.println("  Removed ALOAD 0 (parent Screen arg)");
                            // Next should be checkcast
                            if (it.hasNext()) {
                                AbstractInsnNode next = it.next();
                                if (next.getOpcode() == Opcodes.CHECKCAST) {
                                    toRemove.add(next);
                                    System.err.println("  Removed CHECKCAST Screen");
                                } else {
                                    // Not what we expected - put it back conceptually
                                    System.err.println("  WARNING: expected CHECKCAST but got: " + next.getOpcode());
                                }
                            }
                            pendingNew = null;
                        } else {
                            // Something else after NEW+DUP, not the Screen parent pattern
                            pendingNew = null;
                        }
                    }
                }

                // Now fix the INVOKESPECIAL for sg/ec/3┐.<init>
                for (AbstractInsnNode insn : mn.instructions) {
                    if (insn.getOpcode() == Opcodes.INVOKESPECIAL) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        if (min.owner.equals(brokenOwner) && min.name.equals("<init>")) {
                            min.owner = packScreenOwner;
                            min.desc = newInitDesc;
                            System.err.println("  INVOKESPECIAL sg/ec/3┐.<init>(Screen, RPMgr, Cons, Path, Text) -> PackScreen.<init>(RPMgr, Cons, Path, Text)");
                        }
                    }
                }

                for (AbstractInsnNode r : toRemove) {
                    mn.instructions.remove(r);
                }
            }
        }

        if (!patched) {
            System.err.println("INFO: Already patched (broken class reference not found). Skipping.");
            return;
        }

        // Write back
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        cn.accept(cw);
        Files.write(Path.of(classFile), cw.toByteArray());
        System.err.println("Patched OptionsScreenMixin.class written to " + classFile);
    }
}
