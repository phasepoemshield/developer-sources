import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class PatchStubConstructors {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path ecDir = Path.of(".precompiled/sg/ec");
        File[] files = ecDir.toFile().listFiles((d, n) -> n.endsWith(".class"));
        int patched = 0;

        for (File f : files) {
            byte[] data = Files.readAllBytes(f.toPath());
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);

            boolean changed = false;
            for (MethodNode m : cn.methods) {
                if (!m.name.equals("<init>") || m.desc.equals("()V")) continue;
                int insnCount = m.instructions == null ? 0 : m.instructions.size();
                if (insnCount > 4) continue; // Not a stub

                // This is a stub constructor with params - generate field stores
                // Parse descriptor to get param types
                List<String> paramTypes = parseParamTypes(m.desc);
                if (paramTypes.isEmpty()) continue;

                // Match params to fields by type, in field declaration order
                // For each type, use the next unmatched field of that type
                Map<String, List<FieldNode>> fieldsByType = new HashMap<>();
                for (FieldNode fld : cn.fields) {
                    String key = fld.desc.startsWith("L") || fld.desc.startsWith("[") ? "REF" : fld.desc;
                    fieldsByType.computeIfAbsent(key, k -> new ArrayList<>()).add(fld);
                }

                List<FieldNode> paramFields = new ArrayList<>();
                for (String ptype : paramTypes) {
                    String key = ptype.startsWith("L") || ptype.startsWith("[") ? "REF" : ptype;
                    List<FieldNode> candidates = fieldsByType.get(key);
                    if (candidates != null && !candidates.isEmpty()) {
                        paramFields.add(candidates.remove(0));
                    } else {
                        paramFields.add(null);
                    }
                }

                // Rebuild constructor: aload 0, invokespecial super.<init>, then field stores, return
                m.instructions.clear();
                m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, cn.superName, "<init>", "()V", false));

                int varIdx = 1; // param index (0 is this)
                for (int i = 0; i < paramTypes.size(); i++) {
                    FieldNode fld = paramFields.get(i);
                    String ptype = paramTypes.get(i);
                    if (fld == null) {
                        // Skip this param (can't match to field)
                        varIdx += ptype.equals("J") || ptype.equals("D") ? 2 : 1;
                        continue;
                    }
                    m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                    int loadOp = getLoadOp(ptype);
                    m.instructions.add(new VarInsnNode(loadOp, varIdx));
                    m.instructions.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, fld.name, fld.desc));
                    varIdx += ptype.equals("J") || ptype.equals("D") ? 2 : 1;
                }
                m.instructions.add(new InsnNode(Opcodes.RETURN));
                changed = true;
                System.out.println("  Patched <init>" + m.desc + " in " + f.getName() + " (" + paramFields.size() + " fields)");
            }

            if (changed) {
                ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
                    @Override
                    protected String getCommonSuperClass(String t1, String t2) {
                        return "java/lang/Object";
                    }
                };
                cn.accept(cw);
                Files.write(f.toPath(), cw.toByteArray());
                patched++;
            }
        }
        System.out.println("Patched " + patched + " stub classes");
    }

    static List<String> parseParamTypes(String desc) {
        List<String> types = new ArrayList<>();
        int idx = 1; // skip '('
        while (idx < desc.length() && desc.charAt(idx) != ')') {
            char c = desc.charAt(idx);
            if (c == 'L') {
                int end = desc.indexOf(';', idx);
                types.add(desc.substring(idx, end + 1));
                idx = end + 1;
            } else if (c == '[') {
                int start = idx;
                idx++;
                while (idx < desc.length() && desc.charAt(idx) == '[') idx++;
                if (idx < desc.length() && desc.charAt(idx) == 'L') {
                    int end = desc.indexOf(';', idx);
                    types.add(desc.substring(start, end + 1));
                    idx = end + 1;
                } else {
                    types.add(desc.substring(start, idx + 1));
                    idx++;
                }
            } else {
                types.add(String.valueOf(c));
                idx++;
            }
        }
        return types;
    }

    static int getLoadOp(String type) {
        return switch (type) {
            case "F" -> Opcodes.FLOAD;
            case "D" -> Opcodes.DLOAD;
            case "J" -> Opcodes.LLOAD;
            case "I", "Z", "B", "C", "S" -> Opcodes.ILOAD;
            default -> Opcodes.ALOAD;
        };
    }
}
