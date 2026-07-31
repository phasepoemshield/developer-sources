import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

/**
 * Restores Cosmetic custom-model loading that was broken by string-recovery placeholders:
 * - CustomModelManager.extractBundledModels looked up "Bundled Index Resource Path"
 *   instead of assets/destra/custom_models/index.txt
 * - CosmeticModule ModeSetting seeds used "Default model" / "Default animation" /
 *   "No Model Option" instead of the Russian defaults used by refresh/visibility logic
 */
public final class PatchCosmeticModels {
    static final String INDEX_PATH = "assets/destra/custom_models/index.txt";
    static final String BAD_INDEX = "Bundled Index Resource Path";
    static final String BAD_MODEL = "Default model";
    static final String BAD_ANIM = "Default animation";
    static final String BAD_NO_ANIM = "No Model Option";
    static final String GOOD_MODEL = "Нет";
    static final String GOOD_ANIM = "Нет";
    static final String GOOD_NO_ANIM = "Нет анимации";

    public static void main(String[] args) throws Exception {
        int n = 0;
        n += patchManager();
        n += patchCosmeticModule();
        System.out.println("PatchCosmeticModels: total replacements=" + n);
        if (n == 0) {
            System.out.println("PatchCosmeticModels: nothing to change (already patched?)");
        }
    }

    static int patchManager() throws Exception {
        Path p = Path.of(".precompiled/ru/destra/model/CustomModelManager.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        int changed = 0;

        for (MethodNode mn : cn.methods) {
            if (!"extractBundledModels".equals(mn.name)) continue;
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof LdcInsnNode ldc && BAD_INDEX.equals(ldc.cst)) {
                    ldc.cst = INDEX_PATH;
                    changed++;
                    System.out.println("CustomModelManager.extractBundledModels: index -> " + INDEX_PATH);
                }
            }
        }

        // Ensure BUNDLED_INDEX_RESOURCE_PATH is initialized in <clinit> (field existed but was never set).
        MethodNode clinit = null;
        for (MethodNode mn : cn.methods) {
            if ("<clinit>".equals(mn.name)) { clinit = mn; break; }
        }
        if (clinit != null) {
            boolean hasInit = false;
            for (AbstractInsnNode insn : clinit.instructions) {
                if (insn instanceof FieldInsnNode fin
                        && fin.getOpcode() == Opcodes.PUTSTATIC
                        && "BUNDLED_INDEX_RESOURCE_PATH".equals(fin.name)) {
                    hasInit = true;
                    break;
                }
            }
            if (!hasInit) {
                AbstractInsnNode ret = null;
                for (AbstractInsnNode insn : clinit.instructions) {
                    if (insn.getOpcode() == Opcodes.RETURN) { ret = insn; break; }
                }
                if (ret != null) {
                    InsnList add = new InsnList();
                    add.add(new LdcInsnNode(INDEX_PATH));
                    add.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, "BUNDLED_INDEX_RESOURCE_PATH", "Ljava/lang/String;"));
                    clinit.instructions.insertBefore(ret, add);
                    changed++;
                    System.out.println("CustomModelManager.<clinit>: init BUNDLED_INDEX_RESOURCE_PATH");
                }
            }
        }

        if (changed > 0) {
            write(cn, p, "ru/destra/model/CustomModelManager.class");
        }
        return changed;
    }

    static int patchCosmeticModule() throws Exception {
        Path p = Path.of(".precompiled/ru/destra/module/CosmeticModule.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        int changed = 0;

        Map<String, String> map = Map.of(
                BAD_MODEL, GOOD_MODEL,
                BAD_ANIM, GOOD_ANIM,
                BAD_NO_ANIM, GOOD_NO_ANIM
        );

        for (MethodNode mn : cn.methods) {
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof LdcInsnNode ldc && ldc.cst instanceof String s && map.containsKey(s)) {
                    String next = map.get(s);
                    System.out.println("CosmeticModule." + mn.name + ": \"" + s + "\" -> \"" + next + "\"");
                    ldc.cst = next;
                    changed++;
                }
            }
        }

        if (changed > 0) {
            write(cn, p, "ru/destra/module/CosmeticModule.class");
        }
        return changed;
    }

    static void write(ClassNode cn, Path precompiled, String relative) throws Exception {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(precompiled, out);
        Path bc = Path.of("build/classes/java/main/" + relative);
        if (Files.exists(bc.getParent())) {
            Files.createDirectories(bc.getParent());
            Files.write(bc, out);
        }
        System.out.println("Wrote " + precompiled + " (" + out.length + " bytes)");
    }
}
