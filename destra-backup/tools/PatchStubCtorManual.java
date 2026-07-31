import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class PatchStubCtorManual {
    // Map: className -> {constructorDesc, [field names in param order]}
    static final Map<String, Map<String, String[]>> PATCHES = new LinkedHashMap<>();

    static {
        // N0049 (с4$3): (ZZ)V -> depthTest, additiveBlend
        PATCHES.put("sg/ec/N0049", Map.of(
            "(ZZ)V", new String[]{"depthTest", "additiveBlend"}
        ));
        // N0050 (с4$в): (Lorg/joml/Matrix4f;FFFFFFIZZ)V -> matrix, minX, minY, minZ, maxX, maxY, maxZ, color, depthTest, additiveBlend
        PATCHES.put("sg/ec/N0050", Map.of(
            "(Lorg/joml/Matrix4f;FFFFFFIZZ)V",
            new String[]{"matrix", "minX", "minY", "minZ", "maxX", "maxY", "maxZ", "color", "depthTest", "additiveBlend"}
        ));
    }

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path ecDir = Path.of(".precompiled/sg/ec");

        for (Map.Entry<String, Map<String, String[]>> entry : PATCHES.entrySet()) {
            String className = entry.getKey();
            String fileName = className.substring(className.lastIndexOf('/') + 1) + ".class";
            Path classFile = ecDir.resolve(fileName);
            if (!Files.exists(classFile)) {
                System.out.println("NOT FOUND: " + classFile);
                continue;
            }

            byte[] data = Files.readAllBytes(classFile);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);

            // Build field map: name -> FieldNode
            Map<String, FieldNode> fieldMap = new HashMap<>();
            for (FieldNode f : cn.fields) fieldMap.put(f.name, f);

            for (Map.Entry<String, String[]> ctor : entry.getValue().entrySet()) {
                String ctorDesc = ctor.getKey();
                String[] fieldNames = ctor.getValue();

                // Parse param types from descriptor
                List<String> paramTypes = parseParamTypes(ctorDesc);

                // Find and replace the stub constructor
                boolean found = false;
                for (MethodNode m : cn.methods) {
                    if (m.name.equals("<init>") && m.desc.equals(ctorDesc)) {
                        // Rebuild constructor
                        m.instructions.clear();
                        m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                        m.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, cn.superName, "<init>", "()V", false));

                        int varIdx = 1;
                        for (int i = 0; i < paramTypes.size() && i < fieldNames.length; i++) {
                            String ptype = paramTypes.get(i);
                            String fname = fieldNames[i];
                            FieldNode fld = fieldMap.get(fname);
                            if (fld == null) {
                                System.out.println("  WARNING: field " + fname + " not found in " + className);
                                varIdx += ptype.equals("J") || ptype.equals("D") ? 2 : 1;
                                continue;
                            }
                            m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                            m.instructions.add(new VarInsnNode(getLoadOp(ptype), varIdx));
                            m.instructions.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, fld.name, fld.desc));
                            varIdx += ptype.equals("J") || ptype.equals("D") ? 2 : 1;
                        }
                        m.instructions.add(new InsnNode(Opcodes.RETURN));
                        found = true;
                        System.out.println("  Patched " + className + ".<init>" + ctorDesc + " with " + fieldNames.length + " field stores");
                    }
                }
                if (!found) System.out.println("  Constructor " + ctorDesc + " not found in " + className);
            }

            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
                @Override
                protected String getCommonSuperClass(String t1, String t2) { return "java/lang/Object"; }
            };
            cn.accept(cw);
            Files.write(classFile, cw.toByteArray());
            System.out.println("  Written " + classFile);
        }
    }

    static List<String> parseParamTypes(String desc) {
        List<String> types = new ArrayList<>();
        int idx = 1;
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
