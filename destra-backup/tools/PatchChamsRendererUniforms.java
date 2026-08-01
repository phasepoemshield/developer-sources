import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchChamsRendererUniforms {
    static final String OWNER = "ru/destra/render/ChamsRenderer";
    static final String DESC = "Ljava/lang/String;";
    static final Map<String, String> FIELD_VALUES = new LinkedHashMap<>();
    static {
        FIELD_VALUES.put("UNIFORM_DEPTH_COPY_TEX", "ColorTexture");
        FIELD_VALUES.put("UNIFORM_MAIN_COLOR_TEX", "MaskTexture");
        FIELD_VALUES.put("UNIFORM_DEPTH_TEX", "SceneDepthTexture");
        FIELD_VALUES.put("UNIFORM_SCENE_DEPTH_TEX", "BodyDepthTexture");
        FIELD_VALUES.put("UNIFORM_BLUR_TEX", "ArmorMaskTexture");
        FIELD_VALUES.put("UNIFORM_ANIM_TIME", "time");
        FIELD_VALUES.put("UNIFORM_CHAMS_COLOR", "baseColor");
        FIELD_VALUES.put("UNIFORM_CHAMS_STYLE_PARAM", "effectAlpha");
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchChamsRendererUniforms <classfile>"); System.exit(1); }
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        Set<String> patched = new HashSet<>();

        for (MethodNode mn : cn.methods) {
            if (!mn.name.equals("<clinit>")) continue;

            // First pass: try to find existing PUTSTATIC with ACONST_NULL before it
            ListIterator<AbstractInsnNode> it = mn.instructions.iterator();
            while (it.hasNext()) {
                AbstractInsnNode insn = it.next();
                if (insn.getOpcode() == Opcodes.PUTSTATIC) {
                    FieldInsnNode fin = (FieldInsnNode) insn;
                    if (fin.owner.equals(OWNER) && fin.desc.equals(DESC) && FIELD_VALUES.containsKey(fin.name)) {
                        String value = FIELD_VALUES.get(fin.name);
                        AbstractInsnNode prev = insn.getPrevious();
                        if (prev != null && prev.getOpcode() == Opcodes.ACONST_NULL) {
                            mn.instructions.set(prev, new LdcInsnNode(value));
                            patched.add(fin.name);
                            System.err.println("  Replaced ACONST_NULL -> \"" + value + "\" for " + fin.name);
                        }
                    }
                }
            }

            // Second pass: for any remaining unpatched fields, inject at end of <clinit>
            AbstractInsnNode insertBefore = mn.instructions.getLast();
            // Walk back to find the RETURN instruction
            while (insertBefore != null && insertBefore.getOpcode() != Opcodes.RETURN) {
                insertBefore = insertBefore.getPrevious();
            }
            if (insertBefore == null) {
                System.err.println("  ERROR: No RETURN found in <clinit>");
                break;
            }

            InsnList inject = new InsnList();
            for (Map.Entry<String, String> entry : FIELD_VALUES.entrySet()) {
                if (!patched.contains(entry.getKey())) {
                    inject.add(new LdcInsnNode(entry.getValue()));
                    inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, OWNER, entry.getKey(), DESC));
                    patched.add(entry.getKey());
                    System.err.println("  Injected " + entry.getKey() + " = \"" + entry.getValue() + "\" before RETURN");
                }
            }
            mn.instructions.insertBefore(insertBefore, inject);
            break;
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(args[0]), out);
        System.err.println("Written " + out.length + " bytes to " + args[0]);
    }
}
