import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class PatchIngameGuiMixinClinit {
    static final String PATH = ".precompiled/sg/mx/IngameGuiMixin.class";

    static final String[][] TEXTURES = {
        {"CROSSHAIR_TEXTURE", "hud/crosshair"},
        {"CROSSHAIR_ATTACK_INDICATOR_FULL_TEXTURE", "hud/crosshair_attack_indicator_full"},
        {"CROSSHAIR_ATTACK_INDICATOR_BACKGROUND_TEXTURE", "hud/crosshair_attack_indicator_background"},
        {"CROSSHAIR_ATTACK_INDICATOR_PROGRESS_TEXTURE", "hud/crosshair_attack_indicator_progress"},
        {"FOOD_EMPTY_TEXTURE", "hud/food_empty"},
        {"FOOD_HALF_TEXTURE", "hud/food_half"},
        {"FOOD_FULL_TEXTURE", "hud/food_full"},
    };

    public static void main(String[] args) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(PATH));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                System.out.println("Patching <clinit>: " + m.instructions.size() + " instructions");
                m.instructions.clear();

                for (String[] tex : TEXTURES) {
                    String fieldName = tex[0];
                    String path = tex[1];
                    m.instructions.add(new LdcInsnNode(path));
                    m.instructions.add(new MethodInsnNode(Opcodes.INVOKESTATIC,
                        "net/minecraft/util/Identifier", "ofVanilla",
                        "(Ljava/lang/String;)Lnet/minecraft/util/Identifier;", false));
                    m.instructions.add(new FieldInsnNode(Opcodes.PUTSTATIC,
                        cn.name, fieldName, "Lnet/minecraft/util/Identifier;"));
                    System.out.println("  " + fieldName + " = Identifier.ofVanilla(\"" + path + "\")");
                }

                m.instructions.add(new InsnNode(Opcodes.RETURN));
                break;
            }
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
            @Override
            protected String getCommonSuperClass(String type1, String type2) {
                if (type1.startsWith("net/minecraft/") || type2.startsWith("net/minecraft/")) return "java/lang/Object";
                try { return super.getCommonSuperClass(type1, type2); }
                catch (Throwable e) { return "java/lang/Object"; }
            }
        };
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        FileOutputStream fos = new FileOutputStream(PATH);
        fos.write(result);
        fos.flush();
        fos.getFD().sync();
        fos.close();
        System.out.println("Written " + result.length + " bytes");
    }
}
