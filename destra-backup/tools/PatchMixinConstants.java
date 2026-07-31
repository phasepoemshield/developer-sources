import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class PatchMixinConstants {
    static final Map<String, Map<String, Object>> PATCHES = new LinkedHashMap<>();

    static {
        PATCHES.put("sg/mx/GameRendererMixin", new LinkedHashMap<>());
        PATCHES.get("sg/mx/GameRendererMixin").put("\u0448\u0421\u0420", 0.017453292F);
        PATCHES.get("sg/mx/GameRendererMixin").put("\u0448\u0421\u044a", 0.05F);

        PATCHES.put("sg/mx/OverlayTextureMixin", new LinkedHashMap<>());
        PATCHES.get("sg/mx/OverlayTextureMixin").put("I\u041e", 0.0F);
        PATCHES.get("sg/mx/OverlayTextureMixin").put("I\u042d", -255.0F);
        PATCHES.get("sg/mx/OverlayTextureMixin").put("I\u0447", 0.5F);
    }

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        for (Map.Entry<String, Map<String, Object>> entry : PATCHES.entrySet()) {
            String className = entry.getKey();
            String filePath = ".precompiled/" + className.replace('/', java.io.File.separatorChar) + ".class";
            Path classPath = Path.of(filePath);
            if (!Files.exists(classPath)) {
                System.out.println("NOT FOUND: " + filePath);
                continue;
            }

            byte[] data = Files.readAllBytes(classPath);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);

            Map<String, String> fieldTypes = new HashMap<>();
            for (FieldNode f : cn.fields) fieldTypes.put(f.name, f.desc);

            MethodNode clinit = null;
            for (MethodNode m : cn.methods) {
                if (m.name.equals("<clinit>") && m.desc.equals("()V")) { clinit = m; break; }
            }
            if (clinit == null) {
                clinit = new MethodNode(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
                clinit.instructions.add(new InsnNode(Opcodes.RETURN));
                cn.methods.add(clinit);
            }

            Set<String> alreadyInit = new HashSet<>();
            for (AbstractInsnNode insn : clinit.instructions) {
                if (insn instanceof FieldInsnNode) {
                    FieldInsnNode fin = (FieldInsnNode) insn;
                    if (fin.getOpcode() == Opcodes.PUTSTATIC) alreadyInit.add(fin.name);
                }
            }

            AbstractInsnNode ret = null;
            for (AbstractInsnNode insn : clinit.instructions) {
                if (insn.getOpcode() == Opcodes.RETURN) { ret = insn; break; }
            }

            int added = 0;
            for (Map.Entry<String, Object> fe : entry.getValue().entrySet()) {
                String fieldName = fe.getKey();
                Object value = fe.getValue();
                if (alreadyInit.contains(fieldName)) {
                    System.out.println("  " + className + "." + fieldName + " already initialized, skipping");
                    continue;
                }
                String desc = fieldTypes.get(fieldName);
                if (desc == null) {
                    System.out.println("  " + className + "." + fieldName + " field not found, skipping");
                    continue;
                }

                InsnList list = new InsnList();
                if (value instanceof Float) {
                    list.add(new LdcInsnNode((Float) value));
                } else if (value instanceof Integer) {
                    list.add(new LdcInsnNode((Integer) value));
                } else if (value instanceof String) {
                    list.add(new LdcInsnNode((String) value));
                }
                list.add(new FieldInsnNode(Opcodes.PUTSTATIC, className, fieldName, desc));

                if (ret != null) clinit.instructions.insertBefore(ret, list);
                else clinit.instructions.add(list);
                added++;
                System.out.println("  Added: " + className + "." + fieldName + " = " + value);
            }

            if (added > 0) {
                ClassWriter cw = new ClassWriter(0);
                cn.accept(cw);
                byte[] result = cw.toByteArray();
                try {
                    new ClassReader(result).accept(new ClassVisitor(Opcodes.ASM9) {}, 0);
                } catch (Exception e) {
                    System.out.println("  ERROR: verification failed, skipping: " + e.getMessage());
                    continue;
                }
                Files.write(classPath, result);
                System.out.println("  Written " + classPath + " (" + result.length + " bytes, " + added + " field(s))");
            }
        }
    }
}
