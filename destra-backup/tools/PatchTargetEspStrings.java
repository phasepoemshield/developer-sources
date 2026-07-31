import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class PatchTargetEspStrings {
    static final String CLASS = "ru/destra/module/TargetEspModule";
    static final String SUBSCRIBE_DESC = "Lcom/google/common/eventbus/Subscribe;";

    static final Map<String, String> STRING_FIELDS = new LinkedHashMap<>();
    static {
        STRING_FIELDS.put("шя3", "Маркер");
        STRING_FIELDS.put("шяА", "Призраки");
        STRING_FIELDS.put("шяп", "Трейл");
        STRING_FIELDS.put("шяЕ", "Скан");
        STRING_FIELDS.put("шяl", "Сфера");
        STRING_FIELDS.put("шяГ", "Треугольник");
        STRING_FIELDS.put("шя7", "Круг");
        STRING_FIELDS.put("шяя", "Круг");
        STRING_FIELDS.put("шЦ7", "images/particles/particle1.png");
        STRING_FIELDS.put("шЦя", "images/particles/glow.png");
        STRING_FIELDS.put("шЦ6", "images/particles/particle1.png");
        STRING_FIELDS.put("шЦх", "images/particles/particle1.png");
    }

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/TargetEspModule.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        Map<String, String> toInit = new LinkedHashMap<>();
        for (FieldNode f : cn.fields) {
            if ((f.access & Opcodes.ACC_STATIC) == 0) continue;
            if (!"Ljava/lang/String;".equals(f.desc)) continue;
            if (STRING_FIELDS.containsKey(f.name) && f.value == null) {
                toInit.put(f.name, STRING_FIELDS.get(f.name));
            }
        }

        MethodNode clinit = null;
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name) && "()V".equals(m.desc)) {
                clinit = m;
                break;
            }
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
                if (fin.getOpcode() == Opcodes.PUTSTATIC && "Ljava/lang/String;".equals(fin.desc)) {
                    alreadyInit.add(fin.name);
                }
            }
        }

        AbstractInsnNode insertBefore = null;
        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn.getOpcode() == Opcodes.RETURN) {
                insertBefore = insn;
                break;
            }
        }

        int added = 0;
        for (Map.Entry<String, String> e : toInit.entrySet()) {
            String field = e.getKey();
            String value = e.getValue();
            if (alreadyInit.contains(field)) {
                System.out.println("  " + field + " already initialized, skipping");
                continue;
            }
            InsnList list = new InsnList();
            list.add(new LdcInsnNode(value));
            list.add(new FieldInsnNode(Opcodes.PUTSTATIC, CLASS, field, "Ljava/lang/String;"));
            if (insertBefore != null) {
                clinit.instructions.insertBefore(insertBefore, list);
            } else {
                clinit.instructions.add(list);
            }
            added++;
            System.out.println("  Added init: " + field + " = \"" + value + "\"");
        }

        boolean patchedSubscribe = false;
        for (MethodNode m : cn.methods) {
            if ("onRender2D".equals(m.name) && "(Lru/destra/event/Render2DEvent;)V".equals(m.desc)) {
                boolean hasSub = false;
                if (m.visibleAnnotations != null) {
                    for (AnnotationNode an : m.visibleAnnotations) {
                        if (SUBSCRIBE_DESC.equals(an.desc)) { hasSub = true; break; }
                    }
                }
                if (!hasSub) {
                    if (m.visibleAnnotations == null) m.visibleAnnotations = new ArrayList<>();
                    AnnotationNode sub = new AnnotationNode(SUBSCRIBE_DESC);
                    m.visibleAnnotations.add(0, sub);
                    patchedSubscribe = true;
                    System.out.println("  Added @Subscribe to onRender2D");
                } else {
                    System.out.println("  onRender2D already has @Subscribe");
                }
            }
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
            @Override
            protected String getCommonSuperClass(String t1, String t2) {
                if (t1.startsWith("net/minecraft/") || t2.startsWith("net/minecraft/")) return "java/lang/Object";
                try { return super.getCommonSuperClass(t1, t2); }
                catch (Throwable e) { return "java/lang/Object"; }
            }
        };
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Files.write(classFile, result);
        System.out.println("Patched TargetEspModule: added " + added + " field init(s), @Subscribe=" + patchedSubscribe
            + " (" + data.length + " -> " + result.length + " bytes)");
    }
}
