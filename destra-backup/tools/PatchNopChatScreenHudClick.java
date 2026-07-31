import java.nio.file.Files;
import java.nio.file.Path;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * ChatScreenMixin.click steals HUD clicks with HashMap-first-wins order and
 * fights DestraHudChatInputMixin. Empty the inject body so our named mixin
 * owns chat HUD input.
 */
public final class PatchNopChatScreenHudClick {
    public static void main(String[] args) throws Exception {
        Path[] paths = new Path[] {
            Path.of(".precompiled/sg/mx/ChatScreenMixin.class"),
            Path.of("build/classes/java/main/sg/mx/ChatScreenMixin.class")
        };
        for (Path p : paths) {
            if (!Files.exists(p)) continue;
            ClassNode cn = new ClassNode();
            new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
            boolean changed = false;
            for (MethodNode mn : cn.methods) {
                if (!"click".equals(mn.name)) continue;
                if (mn.desc == null || !mn.desc.contains("CallbackInfoReturnable")) continue;
                mn.instructions.clear();
                if (mn.tryCatchBlocks != null) mn.tryCatchBlocks.clear();
                if (mn.localVariables != null) mn.localVariables.clear();
                mn.instructions.add(new InsnNode(Opcodes.RETURN));
                mn.maxStack = 0;
                mn.maxLocals = 7;
                changed = true;
                System.out.println("Nopped ChatScreenMixin.click in " + p);
            }
            if (!changed) {
                System.out.println("No click method in " + p);
                continue;
            }
            ClassWriter cw = new ClassWriter(0);
            cn.accept(cw);
            Files.write(p, cw.toByteArray());
        }
    }
}
