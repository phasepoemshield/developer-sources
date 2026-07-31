import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchFriendsListScreenFinals {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/FriendsListScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        Set<String> targets = new HashSet<>(Arrays.asList(
            "COLOR_DELETE_RED", "COLOR_PIN_YELLOW"
        ));

        boolean changed = false;
        for (FieldNode f : cn.fields) {
            if (targets.contains(f.name) && (f.access & Opcodes.ACC_FINAL) != 0) {
                f.access &= ~Opcodes.ACC_FINAL;
                System.out.println("  Removed FINAL from '" + f.name + "': 0x" + Integer.toHexString(f.access));
                changed = true;
            }
        }

        if (!changed) {
            System.out.println("No final fields to change");
            return;
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Path tmp = Path.of(path + ".tmp");
        Files.write(tmp, result);
        Files.delete(Path.of(path));
        Files.move(tmp, Path.of(path));
        System.out.println("Written " + result.length + " bytes to " + path);
    }
}
