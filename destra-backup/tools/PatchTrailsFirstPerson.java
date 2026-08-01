import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Fixes the inverted "first person only" logic in TrailsModule.
 *
 * The setting "Только от F5" (firstPersonOnlySetting, default = true) is meant to
 * show trails ONLY in first person view. But the decompiled bytecode is inverted:
 * when the setting is enabled AND the player IS in first person, the three
 * @Subscribe handlers (onRender2D, onMotionTick, onWorldRender) clear the trail
 * and return early — so with the default perspective (first person) no trail is
 * ever sampled, spawned, or rendered.
 *
 * Each handler contains the pattern:
 *   getstatic net/minecraft/client/option/Perspective.FIRST_PERSON
 *   if_acmpne <skip>            (branch when perspective != FIRST_PERSON)
 *   <clearTrail / return>
 *
 * Flipping if_acmpne (166) to if_acmpeq (165) inverts the branch so the
 * clear/return only happens when perspective != FIRST_PERSON, i.e. trails are
 * shown in first person (the setting's intent) and hidden in other views.
 */
public final class PatchTrailsFirstPerson {
    private static final String PERSPECTIVE_OWNER = "net/minecraft/client/option/Perspective";
    private static final String PERSPECTIVE_NAME  = "FIRST_PERSON";
    private static final String PERSPECTIVE_DESC  = "Lnet/minecraft/client/option/Perspective;";

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: PatchTrailsFirstPerson <precompiled-dir>");
            return;
        }
        File dir = new File(args[0]);
        File target = new File(dir, "ru/destra/module/TrailsModule.class");
        if (!target.exists()) {
            System.err.println("TrailsModule.class not found in " + dir);
            return;
        }

        byte[] data = Files.readAllBytes(target.toPath());
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        Set<String> targetMethods = new HashSet<>(Arrays.asList(
                "onRender2D", "onMotionTick", "onWorldRender"));

        int totalPatched = 0;
        for (MethodNode mn : cn.methods) {
            if (!targetMethods.contains(mn.name)) continue;
            // onRender2D(Lru/destra/event/RenderEvent;)V
            // onMotionTick(Lru/destra/event/MotionTickEvent;)V
            // onWorldRender(Lru/destra/event/WorldRenderEvent;)V
            int patched = patchFirstPersonBranch(mn);
            if (patched > 0) {
                System.err.println("PatchTrailsFirstPerson: " + mn.name + mn.desc
                        + " — inverted " + patched + " if_acmpne -> if_acmpeq");
            }
            totalPatched += patched;
        }

        if (totalPatched > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(target.toPath(), cw.toByteArray());
            System.err.println("PatchTrailsFirstPerson: patched " + totalPatched
                    + " site(s) in " + target.getAbsolutePath());
        } else {
            System.err.println("PatchTrailsFirstPerson: no FIRST_PERSON/if_acmpne sites found");
        }
    }

    private static int patchFirstPersonBranch(MethodNode mn) {
        int count = 0;
        for (AbstractInsnNode insn = mn.instructions.getFirst(); insn != null; insn = insn.getNext()) {
            if (insn.getOpcode() != Opcodes.GETSTATIC) continue;
            FieldInsnNode fld = (FieldInsnNode) insn;
            if (!fld.owner.equals(PERSPECTIVE_OWNER)
                    || !fld.name.equals(PERSPECTIVE_NAME)
                    || !fld.desc.equals(PERSPECTIVE_DESC)) continue;
            AbstractInsnNode next = insn.getNext();
            if (next != null && next.getOpcode() == Opcodes.IF_ACMPNE) {
                JumpInsnNode jmp = (JumpInsnNode) next;
                LabelNode label = jmp.label;
                mn.instructions.set(next, new JumpInsnNode(Opcodes.IF_ACMPEQ, label));
                count++;
            }
        }
        return count;
    }
}
