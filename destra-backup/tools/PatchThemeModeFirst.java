import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

// Fixes ThemeManager.MODE_FIRST / MODE_FIRST_STATIC mismatch.
//
// Root cause: ThemesModule.hueMode is a ModeSetting whose option strings are
// "Hue 1" / "Hue 2" (English, set in ThemesModule.<init>). But ThemeManager.<clinit>
// initialises MODE_FIRST = "Первый" (Russian) and MODE_FIRST_STATIC = "Первый".
//
// getThemeColor(int) / getGlobalThemeColor(int) do:
//   if (hueMode.is(MODE_FIRST)) return activeTheme.getPrimaryColor().getRGB();
//   else return activeTheme.getSecondaryColor().getRGB();
//
// Because "Hue 1".equals("Первый") == false, the primary branch is NEVER taken, so
// both helpers always return the SECONDARY color. Any feature that calls
// getThemeColor (Particles, Chams shader base, etc.) renders in the secondary
// colour instead of the primary theme colour.
//
// Fix: set MODE_FIRST / MODE_FIRST_STATIC = "Hue 1" so the comparison matches the
// default (first) hueMode option, making getThemeColor return the primary colour.
public final class PatchThemeModeFirst {
    static final String OWNER = "ru/destra/misc/ThemeManager";
    static final String DESC = "Ljava/lang/String;";
    static final String NEW_VALUE = "Hue 1";
    static final Set<String> TARGET_FIELDS = new LinkedHashSet<>(Arrays.asList(
            "MODE_FIRST", "MODE_FIRST_STATIC"));

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: PatchThemeModeFirst <ThemeManager.class>");
            System.exit(1);
        }
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        Set<String> patched = new HashSet<>();

        for (MethodNode mn : cn.methods) {
            if (!mn.name.equals("<clinit>")) continue;

            // Replace the LDC immediately preceding each PUTSTATIC of the target fields.
            ListIterator<AbstractInsnNode> it = mn.instructions.iterator();
            while (it.hasNext()) {
                AbstractInsnNode insn = it.next();
                if (insn.getOpcode() == Opcodes.PUTSTATIC) {
                    FieldInsnNode fin = (FieldInsnNode) insn;
                    if (fin.owner.equals(OWNER) && fin.desc.equals(DESC) && TARGET_FIELDS.contains(fin.name)) {
                        AbstractInsnNode prev = insn.getPrevious();
                        if (prev != null && prev.getOpcode() == Opcodes.LDC) {
                            mn.instructions.set(prev, new LdcInsnNode(NEW_VALUE));
                            patched.add(fin.name);
                            System.err.println("  Replaced LDC -> \"" + NEW_VALUE + "\" for " + fin.name);
                        }
                    }
                }
            }

            // Inject any still-unpatched fields right before the RETURN.
            AbstractInsnNode insertBefore = mn.instructions.getLast();
            while (insertBefore != null && insertBefore.getOpcode() != Opcodes.RETURN) {
                insertBefore = insertBefore.getPrevious();
            }
            if (insertBefore != null) {
                InsnList inject = new InsnList();
                for (String name : TARGET_FIELDS) {
                    if (!patched.contains(name)) {
                        inject.add(new LdcInsnNode(NEW_VALUE));
                        inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, OWNER, name, DESC));
                        patched.add(name);
                        System.err.println("  Injected " + name + " = \"" + NEW_VALUE + "\" before RETURN");
                    }
                }
                mn.instructions.insertBefore(insertBefore, inject);
            }
            break;
        }

        if (patched.isEmpty()) {
            System.err.println("  WARNING: no target fields found in " + OWNER + " <clinit>");
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(args[0]), out);
        System.err.println("Written " + out.length + " bytes to " + args[0]);
    }
}
