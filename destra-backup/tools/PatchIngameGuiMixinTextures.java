import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchIngameGuiMixinTextures {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/sg/mx/IngameGuiMixin.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        MethodNode clinit = null;
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                clinit = m;
                break;
            }
        }
        if (clinit == null) {
            System.out.println("No <clinit> found");
            return;
        }

        Map<String, String> texturePaths = new LinkedHashMap<>();
        texturePaths.put("CROSSHAIR_TEXTURE", "hud/crosshair");
        texturePaths.put("CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE", "hud/crosshair_attack_indicator_full");
        texturePaths.put("CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE", "hud/crosshair_attack_indicator_background");
        texturePaths.put("CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE", "hud/crosshair_attack_indicator_progress");
        texturePaths.put("FOOD_EMPTY_TEXTURE", "hud/food_empty");
        texturePaths.put("FOOD_HALF_TEXTURE", "hud/food_half");
        texturePaths.put("FOOD_FULL_TEXTURE", "hud/food_full");

        Map<String, String> fieldToPath = new LinkedHashMap<>();

        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn instanceof FieldInsnNode && insn.getOpcode() == Opcodes.PUTSTATIC) {
                FieldInsnNode put = (FieldInsnNode) insn;
                if ("Lnet/minecraft/util/Identifier;".equals(put.desc) && texturePaths.containsKey(put.name)) {
                    String texturePath = texturePaths.get(put.name);
                    AbstractInsnNode prev = insn.getPrevious();
                    AbstractInsnNode prevPrev = (prev != null) ? prev.getPrevious() : null;
                    if (prev != null && prev.getOpcode() == Opcodes.INVOKESTATIC
                        && prevPrev != null && prevPrev.getOpcode() == Opcodes.GETSTATIC
                        && ((FieldInsnNode)prevPrev).desc.equals("Ljava/lang/String;")) {
                        FieldInsnNode getString = (FieldInsnNode) prevPrev;
                        fieldToPath.put(getString.name, texturePath);
                        System.out.println("  Mapped String field '" + escape(getString.name) + "' -> '" + texturePath + "' (for " + put.name + ")");
                    }
                }
            }
        }

        if (fieldToPath.isEmpty()) {
            System.out.println("No texture String fields found, checking if already patched...");
            boolean hasLdcForHud = false;
            for (AbstractInsnNode insn : clinit.instructions) {
                if (insn instanceof LdcInsnNode) {
                    Object v = ((LdcInsnNode) insn).cst;
                    if (v instanceof String && ((String)v).startsWith("hud/")) {
                        hasLdcForHud = true;
                        break;
                    }
                }
            }
            if (hasLdcForHud) {
                System.out.println("Already patched, skipping");
                return;
            }
            System.out.println("ERROR: Could not find texture String fields");
            return;
        }

        AbstractInsnNode insertAfter = null;
        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn instanceof MethodInsnNode && insn.getOpcode() == Opcodes.INVOKESTATIC) {
                MethodInsnNode min = (MethodInsnNode) insn;
                if (min.owner.equals("ru/dreamix/fabricloader/VMBridge") && min.name.equals("identifyClass")) {
                    insertAfter = insn;
                    break;
                }
            }
        }

        if (insertAfter == null) {
            System.out.println("No VMBridge.identifyClass call found, inserting at start");
            insertAfter = clinit.instructions.getFirst();
        }

        InsnList inject = new InsnList();
        for (Map.Entry<String, String> e : fieldToPath.entrySet()) {
            inject.add(new LdcInsnNode(e.getValue()));
            inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, e.getKey(), "Ljava/lang/String;"));
            System.out.println("  Injected: " + escape(e.getKey()) + " = \"" + e.getValue() + "\"");
        }

        clinit.instructions.insert(insertAfter, inject);

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Path tmp = Path.of(path + ".tmp");
        Files.write(tmp, result);
        Files.delete(Path.of(path));
        Files.move(tmp, Path.of(pathPath(path)));
        System.out.println("Written " + result.length + " bytes to " + path);
    }

    static String pathPath(String p) { return p; }

    static String escape(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 32 && c < 127) sb.append(c);
            else sb.append("U+").append(String.format("%04X", (int) c));
        }
        return sb.toString();
    }
}
