import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class GenStubClasses {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path ecDir = Path.of(".precompiled/sg/ec");

        // N0049 (с4$3): batch key for fill boxes
        genClass(ecDir, "sg/ec/N0049", "java/lang/Object",
            new String[]{"depthTest", "additiveBlend"},
            new String[]{"Z", "Z"},
            "(ZZ)V", new String[]{"depthTest", "additiveBlend"});

        // N0050 (с4$в): fill box command
        genClass(ecDir, "sg/ec/N0050", "java/lang/Object",
            new String[]{"color", "matrix", "maxZ", "maxY", "minZ", "maxX", "depthTest", "minY", "additiveBlend", "minX"},
            new String[]{"I", "Lorg/joml/Matrix4f;", "F", "F", "F", "F", "Z", "F", "Z", "F"},
            "(Lorg/joml/Matrix4f;FFFFFFIZZ)V",
            new String[]{"matrix", "minX", "minY", "minZ", "maxX", "maxY", "maxZ", "color", "depthTest", "additiveBlend"});
    }

    static void genClass(Path dir, String className, String superName,
                         String[] fieldNames, String[] fieldDescs,
                         String ctorDesc, String[] ctorFieldNames) throws Exception {
        String fileName = className.substring(className.lastIndexOf('/') + 1) + ".class";
        Path classFile = dir.resolve(fileName);

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        cw.visit(Opcodes.V21, Opcodes.ACC_PUBLIC, className, null, superName, null);

        // Fields
        for (int i = 0; i < fieldNames.length; i++) {
            cw.visitField(Opcodes.ACC_PUBLIC, fieldNames[i], fieldDescs[i], null, null).visitEnd();
        }

        // Default constructor
        {
            MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitCode();
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitMethodInsn(Opcodes.INVOKESPECIAL, superName, "<init>", "()V", false);
            mv.visitInsn(Opcodes.RETURN);
            mv.visitMaxs(0, 0);
            mv.visitEnd();
        }

        // Parameterized constructor with field stores
        {
            MethodVisitor mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", ctorDesc, null, null);
            mv.visitCode();
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitMethodInsn(Opcodes.INVOKESPECIAL, superName, "<init>", "()V", false);

            java.util.List<String> paramTypes = parseParamTypes(ctorDesc);
            // Build field map
            java.util.Map<String, String> fieldMap = new java.util.HashMap<>();
            for (int i = 0; i < fieldNames.length; i++) fieldMap.put(fieldNames[i], fieldDescs[i]);

            int varIdx = 1;
            for (int i = 0; i < paramTypes.size() && i < ctorFieldNames.length; i++) {
                String ptype = paramTypes.get(i);
                String fname = ctorFieldNames[i];
                String fdesc = fieldMap.get(fname);
                mv.visitVarInsn(Opcodes.ALOAD, 0);
                mv.visitVarInsn(getLoadOp(ptype), varIdx);
                mv.visitFieldInsn(Opcodes.PUTFIELD, className, fname, fdesc);
                varIdx += ptype.equals("J") || ptype.equals("D") ? 2 : 1;
            }
            mv.visitInsn(Opcodes.RETURN);
            mv.visitMaxs(0, 0);
            mv.visitEnd();
        }

        cw.visitEnd();
        Files.write(classFile, cw.toByteArray());
        System.out.println("Generated " + classFile + " (" + cw.toByteArray().length + " bytes)");
    }

    static java.util.List<String> parseParamTypes(String desc) {
        java.util.List<String> types = new java.util.ArrayList<>();
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
