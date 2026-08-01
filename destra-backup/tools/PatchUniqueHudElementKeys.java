import java.nio.file.Files;
import java.nio.file.Path;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TypeInsnNode;
import org.objectweb.asm.tree.VarInsnNode;

/**
 * HUD modules were recovered with collapsed name LDC "Module" and shared element
 * key "Hud Element". Keying the draggable map by Module.name still collided.
 * Use the module's Class.getName() so Target/Armor/Binds/Potions/Inventory/PlayerInfo
 * each keep their own DraggableHudElement.
 */
public final class PatchUniqueHudElementKeys implements Opcodes {
    public static void main(String[] args) throws Exception {
        Path p = Path.of(".precompiled/ru/destra/hud/DraggableHudManager.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);

        boolean changed = false;
        for (MethodNode mn : cn.methods) {
            if (!"4".equals(mn.name)) continue;
            if (!"(Lru/destra/core/Module;Ljava/lang/String;FF)Lru/destra/hud/DraggableHudElement;".equals(mn.desc)) {
                continue;
            }

            // String key = module.getClass().getName();
            // elements.put(key, new DraggableHudElement(module, key, x, y));
            // return (DraggableHudElement) elements.get(key);
            InsnList ins = new InsnList();
            ins.add(new VarInsnNode(ALOAD, 0));
            ins.add(new MethodInsnNode(INVOKEVIRTUAL, "java/lang/Object", "getClass",
                    "()Ljava/lang/Class;", false));
            ins.add(new MethodInsnNode(INVOKEVIRTUAL, "java/lang/Class", "getName",
                    "()Ljava/lang/String;", false));
            ins.add(new VarInsnNode(ASTORE, 4));

            ins.add(new FieldInsnNode(GETSTATIC, "ru/destra/hud/DraggableHudManager", "elements",
                    "Ljava/util/HashMap;"));
            ins.add(new VarInsnNode(ALOAD, 4));
            ins.add(new TypeInsnNode(NEW, "ru/destra/hud/DraggableHudElement"));
            ins.add(new InsnNode(DUP));
            ins.add(new VarInsnNode(ALOAD, 0));
            ins.add(new VarInsnNode(ALOAD, 4));
            ins.add(new VarInsnNode(FLOAD, 2));
            ins.add(new VarInsnNode(FLOAD, 3));
            ins.add(new MethodInsnNode(INVOKESPECIAL, "ru/destra/hud/DraggableHudElement", "<init>",
                    "(Lru/destra/core/Module;Ljava/lang/String;FF)V", false));
            ins.add(new MethodInsnNode(INVOKEVIRTUAL, "java/util/HashMap", "put",
                    "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false));
            ins.add(new InsnNode(POP));

            ins.add(new FieldInsnNode(GETSTATIC, "ru/destra/hud/DraggableHudManager", "elements",
                    "Ljava/util/HashMap;"));
            ins.add(new VarInsnNode(ALOAD, 4));
            ins.add(new MethodInsnNode(INVOKEVIRTUAL, "java/util/HashMap", "get",
                    "(Ljava/lang/Object;)Ljava/lang/Object;", false));
            ins.add(new TypeInsnNode(CHECKCAST, "ru/destra/hud/DraggableHudElement"));
            ins.add(new InsnNode(ARETURN));

            mn.instructions = ins;
            mn.tryCatchBlocks = null;
            mn.localVariables = null;
            mn.maxStack = 8;
            mn.maxLocals = 5;
            changed = true;
            System.out.println("Patched DraggableHudManager.4 to key by Class.getName()");
        }

        if (!changed) {
            System.out.println("PatchUniqueHudElementKeys: method not found");
            return;
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of("build/classes/java/main/ru/destra/hud/DraggableHudManager.class");
        if (Files.exists(bc.getParent())) {
            Files.createDirectories(bc.getParent());
            Files.write(bc, out);
        }
        System.out.println("Wrote " + p + " (" + out.length + " bytes)");
    }
}
