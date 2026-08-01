import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

/**
 * WorldCustomizerModule recovery:
 * 1) ModeSetting options were Mode1/Mode2/... while is() checks use Cyrillic labels
 *    — sky shader never activates because isSkyShaderVisible() requires a matching style.
 * 2) Inject ModeSetting sectionFilter ("Раздел") + WorldCustomizerSectionFilter.install for ClickGUI filtering.
 * 3) changeFog/changeSky default true dumps every child setting; flip to false for progressive disclosure.
 */
public final class PatchWorldCustomizer {
    static final String OWNER = "ru/destra/module/WorldCustomizerModule";
    static final String SECTION_FIELD = "sectionFilter";

    static final Map<String, String[]> MODE_BY_FIELD = new LinkedHashMap<>();
    static {
        MODE_BY_FIELD.put("fogMode", new String[]{"Простой", "Плавный"});
        MODE_BY_FIELD.put("skyShaderStyle", new String[]{"Небула", "Космос", "Гироид", "Фенель", "Облака", "Аврора"});
        MODE_BY_FIELD.put("weatherMode", new String[]{"Ясно", "Дождь", "Гроза"});
        MODE_BY_FIELD.put("timeMode", new String[]{"День", "Ночь", "Свое"});
    }

    static final Set<String> DEFAULT_OFF = Set.of("changeFog", "changeSky");

    public static void main(String[] args) throws Exception {
        Path pre = Path.of(".precompiled/ru/destra/module/WorldCustomizerModule.class");
        if (!Files.exists(pre)) {
            System.err.println("PatchWorldCustomizer: missing " + pre);
            return;
        }
        byte[] out = patch(Files.readAllBytes(pre));
        Files.write(pre, out);
        Path build = Path.of("build/classes/java/main/ru/destra/module/WorldCustomizerModule.class");
        if (Files.exists(build.getParent())) {
            Files.createDirectories(build.getParent());
            Files.write(build, out);
        }
        System.out.println("PatchWorldCustomizer: wrote " + pre + " (" + out.length + " bytes)");
    }

    static byte[] patch(byte[] data) {
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        ensureSectionField(cn);

        MethodNode init = null;
        for (MethodNode mn : cn.methods) {
            if ("<init>".equals(mn.name) && "()V".equals(mn.desc)) {
                init = mn;
                break;
            }
        }
        if (init == null) {
            throw new IllegalStateException("No <init>()V in WorldCustomizerModule");
        }

        int modeFixes = patchModeSettings(init);
        int defaultFixes = patchBooleanDefaults(init);
        boolean sectionInit = ensureSectionInit(init);
        boolean installCall = ensureInstallCall(init);

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        System.out.println("PatchWorldCustomizer: modeLdcFixes=" + modeFixes
                + " defaultOffFixes=" + defaultFixes
                + " sectionInit=" + sectionInit
                + " installCall=" + installCall);
        return cw.toByteArray();
    }

    static void ensureSectionField(ClassNode cn) {
        for (FieldNode fn : cn.fields) {
            if (SECTION_FIELD.equals(fn.name)) {
                return;
            }
        }
        // Insert after last setting field-ish: at end of fields is fine
        cn.fields.add(new FieldNode(
                Opcodes.ACC_PUBLIC | Opcodes.ACC_FINAL,
                SECTION_FIELD,
                "Lru/destra/setting/ModeSetting;",
                null,
                null
        ));
        System.out.println("  added field " + SECTION_FIELD);
    }

    /**
     * After Module.<init>, create sectionFilter ModeSetting as first setting (shows at top of ClickGUI).
     */
    static boolean ensureSectionInit(MethodNode init) {
        // Skip if already present
        for (AbstractInsnNode n : init.instructions) {
            if (n instanceof FieldInsnNode fin
                    && fin.getOpcode() == Opcodes.PUTFIELD
                    && SECTION_FIELD.equals(fin.name)
                    && OWNER.equals(fin.owner)) {
                return false;
            }
        }

        AbstractInsnNode afterSuper = null;
        for (AbstractInsnNode n : init.instructions) {
            if (n instanceof MethodInsnNode min
                    && min.getOpcode() == Opcodes.INVOKESPECIAL
                    && "ru/destra/core/Module".equals(min.owner)
                    && "<init>".equals(min.name)) {
                afterSuper = n;
                break;
            }
        }
        if (afterSuper == null) {
            System.err.println("PatchWorldCustomizer: Module.<init> call not found");
            return false;
        }

        InsnList inject = new InsnList();
        // this.sectionFilter = new ModeSetting("Раздел", this, "Все", "Туман", "Небо", "Погода", "Время");
        inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
        inject.add(new TypeInsnNode(Opcodes.NEW, "ru/destra/setting/ModeSetting"));
        inject.add(new InsnNode(Opcodes.DUP));
        inject.add(new LdcInsnNode("Раздел"));
        inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
        inject.add(new InsnNode(Opcodes.ICONST_5));
        inject.add(new TypeInsnNode(Opcodes.ANEWARRAY, "java/lang/String"));
        String[] modes = {"Все", "Туман", "Небо", "Погода", "Время"};
        for (int i = 0; i < modes.length; i++) {
            inject.add(new InsnNode(Opcodes.DUP));
            inject.add(new InsnNode(Opcodes.ICONST_0 + i)); // ICONST_0..4
            inject.add(new LdcInsnNode(modes[i]));
            inject.add(new InsnNode(Opcodes.AASTORE));
        }
        inject.add(new MethodInsnNode(
                Opcodes.INVOKESPECIAL,
                "ru/destra/setting/ModeSetting",
                "<init>",
                "(Ljava/lang/String;Lru/destra/core/Module;[Ljava/lang/String;)V",
                false
        ));
        inject.add(new FieldInsnNode(Opcodes.PUTFIELD, OWNER, SECTION_FIELD, "Lru/destra/setting/ModeSetting;"));

        init.instructions.insert(afterSuper, inject);
        System.out.println("  injected sectionFilter ModeSetting init");
        return true;
    }

    static boolean ensureInstallCall(MethodNode init) {
        for (AbstractInsnNode n : init.instructions) {
            if (n instanceof MethodInsnNode min
                    && "ru/destra/module/WorldCustomizerSectionFilter".equals(min.owner)
                    && "install".equals(min.name)) {
                return false;
            }
        }
        // Before each RETURN, insert install(this, this.sectionFilter)
        List<AbstractInsnNode> returns = new ArrayList<>();
        for (AbstractInsnNode n : init.instructions) {
            if (n.getOpcode() == Opcodes.RETURN) {
                returns.add(n);
            }
        }
        if (returns.isEmpty()) {
            return false;
        }
        for (AbstractInsnNode ret : returns) {
            InsnList call = new InsnList();
            call.add(new VarInsnNode(Opcodes.ALOAD, 0));
            call.add(new VarInsnNode(Opcodes.ALOAD, 0));
            call.add(new FieldInsnNode(Opcodes.GETFIELD, OWNER, SECTION_FIELD, "Lru/destra/setting/ModeSetting;"));
            call.add(new MethodInsnNode(
                    Opcodes.INVOKESTATIC,
                    "ru/destra/module/WorldCustomizerSectionFilter",
                    "install",
                    "(Lru/destra/module/WorldCustomizerModule;Lru/destra/setting/ModeSetting;)V",
                    false
            ));
            init.instructions.insertBefore(ret, call);
        }
        System.out.println("  injected WorldCustomizerSectionFilter.install call(s): " + returns.size());
        return true;
    }

    static int patchModeSettings(MethodNode init) {
        AbstractInsnNode[] insns = init.instructions.toArray();
        int patched = 0;
        for (int i = 0; i < insns.length; i++) {
            if (!(insns[i] instanceof MethodInsnNode min)) continue;
            if (!"ru/destra/setting/ModeSetting".equals(min.owner) || !"<init>".equals(min.name)) continue;
            if (!"(Ljava/lang/String;Lru/destra/core/Module;[Ljava/lang/String;)V".equals(min.desc)) continue;

            String putField = findPutFieldAfter(insns, i);
            if (putField == null) continue;
            String[] modes = MODE_BY_FIELD.get(putField);
            if (modes == null) continue;

            int anew = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (insns[j] instanceof TypeInsnNode tin
                        && tin.getOpcode() == Opcodes.ANEWARRAY
                        && "java/lang/String".equals(tin.desc)) {
                    anew = j;
                    break;
                }
            }
            if (anew < 0) continue;

            List<LdcInsnNode> ldcs = new ArrayList<>();
            for (int j = anew + 1; j < i; j++) {
                if (insns[j] instanceof LdcInsnNode ldc && ldc.cst instanceof String) {
                    AbstractInsnNode n = insns[j].getNext();
                    int hops = 0;
                    boolean aastore = false;
                    while (n != null && hops < 4) {
                        if (n.getOpcode() == Opcodes.AASTORE) {
                            aastore = true;
                            break;
                        }
                        if (n instanceof MethodInsnNode || n instanceof TypeInsnNode) break;
                        n = n.getNext();
                        hops++;
                    }
                    if (aastore) ldcs.add(ldc);
                }
            }
            if (ldcs.size() != modes.length) {
                System.err.println("PatchWorldCustomizer: " + putField + " expected " + modes.length
                        + " mode LDCs, found " + ldcs.size());
                continue;
            }
            for (int k = 0; k < modes.length; k++) {
                if (!modes[k].equals(ldcs.get(k).cst)) {
                    ldcs.get(k).cst = modes[k];
                    patched++;
                }
            }
            System.out.println("  " + putField + " -> " + Arrays.toString(modes));
        }
        return patched;
    }

    static String findPutFieldAfter(AbstractInsnNode[] insns, int from) {
        for (int j = from + 1; j < insns.length && j < from + 16; j++) {
            if (insns[j] instanceof FieldInsnNode fin && fin.getOpcode() == Opcodes.PUTFIELD) {
                return fin.name;
            }
        }
        return null;
    }

    static int patchBooleanDefaults(MethodNode init) {
        AbstractInsnNode[] insns = init.instructions.toArray();
        int patched = 0;
        for (int i = 0; i < insns.length; i++) {
            if (!(insns[i] instanceof MethodInsnNode min)) continue;
            if (!"ru/destra/setting/BooleanSetting".equals(min.owner) || !"<init>".equals(min.name)) continue;
            if (!"(Ljava/lang/String;Lru/destra/core/Module;Z)V".equals(min.desc)) continue;

            String putField = findPutFieldAfter(insns, i);
            if (putField == null || !DEFAULT_OFF.contains(putField)) continue;

            AbstractInsnNode prev = insns[i].getPrevious();
            while (prev != null && (prev.getOpcode() == -1
                    || prev instanceof LabelNode
                    || prev instanceof LineNumberNode
                    || prev instanceof FrameNode)) {
                prev = prev.getPrevious();
            }
            if (prev != null && prev.getOpcode() == Opcodes.ICONST_1) {
                init.instructions.set(prev, new InsnNode(Opcodes.ICONST_0));
                patched++;
                System.out.println("  default off: " + putField);
            } else if (prev != null && prev.getOpcode() == Opcodes.ICONST_0) {
                System.out.println("  default already off: " + putField);
            }
        }
        return patched;
    }
}
