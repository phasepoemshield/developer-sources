import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Fixes HUD module subclass stubs that return 0/false/noop.
 * These obfuscated stubs shadow real HudModule methods (updateVisibilityAnimations,
 * isFullyHidden, computeAnimatedWidth, applyAlphaToChannel, etc.).
 * This patcher replaces stub bodies with proper delegations to parent methods.
 */
public final class PatchHudModuleStubs {
    static final String HUD_MODULE = "ru/destra/module/HudModule";
    static final String PRECOMPILED = ".precompiled";

    public static void main(String[] args) throws Exception {
        List<String> hudClasses = new ArrayList<>();

        // Scan for HUD module subclasses
        Files.walk(Path.of(PRECOMPILED))
            .filter(p -> p.toString().endsWith(".class"))
            .forEach(p -> {
                try {
                    byte[] data = Files.readAllBytes(p);
                    ClassReader cr = new ClassReader(data);
                    if (HUD_MODULE.equals(cr.getSuperName())) {
                        hudClasses.add(p.toString());
                    }
                } catch (Exception e) {
                    // skip
                }
            });

        System.out.println("Found " + hudClasses.size() + " HUD module subclasses");

        for (String classPath : hudClasses) {
            patchClass(classPath);
        }
    }

    static void patchClass(String classPath) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(classPath));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String className = cn.name;
        int patched = 0;

        // Track how many (IF)I stubs we've seen to map second one to modulateColorAlpha
        int ifI_count = 0;

        for (MethodNode m : cn.methods) {
            if (m.name.equals("<init>") || m.name.equals("<clinit>")) continue;
            if (!isStub(m)) continue;

            String ret = m.desc.substring(m.desc.lastIndexOf(')') + 1);
            String parentMethod = null;
            String parentDesc = null;

            if (m.desc.equals("(Z)F")) {
                parentMethod = "updateVisibilityAnimations";
                parentDesc = "(Z)F";
            } else if (m.desc.equals("(ZF)Z")) {
                parentMethod = "isFullyHidden";
                parentDesc = "(ZF)Z";
            } else if (m.desc.equals("(FF)F")) {
                parentMethod = "computeAnimatedWidth";
                parentDesc = "(FF)F";
            } else if (m.desc.equals("(IF)I")) {
                ifI_count++;
                if (ifI_count == 1) {
                    parentMethod = "applyAlphaToChannel";
                    parentDesc = "(IF)I";
                } else {
                    parentMethod = "modulateColorAlpha";
                    parentDesc = "(IF)I";
                }
            } else if (m.desc.equals("(Lnet/minecraft/client/gui/DrawContext;FFFFFII)V")) {
                parentMethod = "drawBackground";
                parentDesc = "(Lnet/minecraft/client/gui/DrawContext;FFFFFII)V";
            } else if (m.desc.equals("(Lnet/minecraft/client/gui/DrawContext;FFFFFI)V")) {
                parentMethod = "drawBackground";
                parentDesc = "(Lnet/minecraft/client/gui/DrawContext;FFFFFI)V";
            } else if (m.desc.equals("(FFFFF)V")) {
                parentMethod = "pushScissorWithGlowMargin";
                parentDesc = "(FFFFF)V";
            }

            if (parentMethod != null) {
                redirectStub(cn, m, HUD_MODULE, parentMethod, parentDesc);
                patched++;
                System.out.println("  " + shortName(className) + ": redirected " + escape(m.name) + m.desc + " -> " + parentMethod);
            }
        }

        if (patched > 0) {
            writeClass(cn, classPath);
            System.out.println("  " + shortName(className) + ": " + patched + " stubs fixed");
        }
    }

    static void redirectStub(ClassNode cn, MethodNode m, String owner, String methodName, String methodDesc) {
        m.instructions.clear();

        // Push 'this'
        m.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));

        // Push arguments
        String args = m.desc.substring(1, m.desc.lastIndexOf(')'));
        int localIndex = 1;
        for (int i = 0; i < args.length(); i++) {
            char c = args.charAt(i);
            switch (c) {
                case 'Z': case 'I': case 'B': case 'S':
                    m.instructions.add(new VarInsnNode(Opcodes.ILOAD, localIndex));
                    localIndex++;
                    break;
                case 'F':
                    m.instructions.add(new VarInsnNode(Opcodes.FLOAD, localIndex));
                    localIndex++;
                    break;
                case 'D':
                    m.instructions.add(new VarInsnNode(Opcodes.DLOAD, localIndex));
                    localIndex += 2;
                    break;
                case 'J':
                    m.instructions.add(new VarInsnNode(Opcodes.LLOAD, localIndex));
                    localIndex += 2;
                    break;
                case 'L':
                    m.instructions.add(new VarInsnNode(Opcodes.ALOAD, localIndex));
                    localIndex++;
                    // Skip the class name and the ';'
                    int semi = args.indexOf(';', i);
                    i = semi;
                    break;
                case '[':
                    m.instructions.add(new VarInsnNode(Opcodes.ALOAD, localIndex));
                    localIndex++;
                    // Skip array type descriptor
                    if (i + 1 < args.length() && args.charAt(i + 1) == 'L') {
                        int semi2 = args.indexOf(';', i + 1);
                        i = semi2;
                    } else {
                        // primitive array
                    }
                    break;
            }
        }

        // Invoke parent method
        m.instructions.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, owner, methodName, methodDesc, false));

        // Return
        String retType = m.desc.substring(m.desc.lastIndexOf(')') + 1);
        switch (retType) {
            case "V":
                m.instructions.add(new InsnNode(Opcodes.RETURN));
                break;
            case "I": case "Z": case "B": case "S":
                m.instructions.add(new InsnNode(Opcodes.IRETURN));
                break;
            case "F":
                m.instructions.add(new InsnNode(Opcodes.FRETURN));
                break;
            case "D":
                m.instructions.add(new InsnNode(Opcodes.DRETURN));
                break;
            case "J":
                m.instructions.add(new InsnNode(Opcodes.LRETURN));
                break;
            default:
                m.instructions.add(new InsnNode(Opcodes.ARETURN));
                break;
        }

        m.maxStack = 5;
        m.maxLocals = 10;
    }

    static boolean isStub(MethodNode m) {
        List<AbstractInsnNode> insns = new ArrayList<>();
        for (AbstractInsnNode insn : m.instructions) {
            if (insn.getOpcode() >= 0) {
                insns.add(insn);
            }
        }

        String ret = m.desc.substring(m.desc.lastIndexOf(')') + 1);

        if (ret.equals("V")) {
            return insns.size() == 1 && insns.get(0).getOpcode() == Opcodes.RETURN;
        } else if (ret.equals("I") || ret.equals("Z") || ret.equals("B") || ret.equals("S")) {
            if (insns.size() != 2) return false;
            return isIntDefault(insns.get(0)) && insns.get(1).getOpcode() == Opcodes.IRETURN;
        } else if (ret.equals("F")) {
            if (insns.size() != 2) return false;
            return isFloatDefault(insns.get(0)) && insns.get(1).getOpcode() == Opcodes.FRETURN;
        } else if (ret.equals("D")) {
            if (insns.size() != 2) return false;
            return isDoubleDefault(insns.get(0)) && insns.get(1).getOpcode() == Opcodes.DRETURN;
        } else if (ret.equals("J")) {
            if (insns.size() != 2) return false;
            return isLongDefault(insns.get(0)) && insns.get(1).getOpcode() == Opcodes.LRETURN;
        }

        return false;
    }

    static boolean isIntDefault(AbstractInsnNode insn) {
        int op = insn.getOpcode();
        return op == Opcodes.ICONST_0 || op == Opcodes.ICONST_1 ||
               (insn instanceof LdcInsnNode && ((LdcInsnNode) insn).cst instanceof Integer && ((Integer) ((LdcInsnNode) insn).cst) == 0);
    }

    static boolean isFloatDefault(AbstractInsnNode insn) {
        int op = insn.getOpcode();
        return op == Opcodes.FCONST_0 || op == Opcodes.FCONST_1 ||
               (insn instanceof LdcInsnNode && ((LdcInsnNode) insn).cst instanceof Float && ((Float) ((LdcInsnNode) insn).cst) == 0.0f);
    }

    static boolean isDoubleDefault(AbstractInsnNode insn) {
        int op = insn.getOpcode();
        return op == Opcodes.DCONST_0 || op == Opcodes.DCONST_1 ||
               (insn instanceof LdcInsnNode && ((LdcInsnNode) insn).cst instanceof Double && ((Double) ((LdcInsnNode) insn).cst) == 0.0);
    }

    static boolean isLongDefault(AbstractInsnNode insn) {
        int op = insn.getOpcode();
        return op == Opcodes.LCONST_0 || op == Opcodes.LCONST_1 ||
               (insn instanceof LdcInsnNode && ((LdcInsnNode) insn).cst instanceof Long && ((Long) ((LdcInsnNode) insn).cst) == 0L);
    }

    static void writeClass(ClassNode cn, String path) throws Exception {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Path tmp = Path.of(path + ".tmp");
        Files.write(tmp, result);
        Files.delete(Path.of(path));
        Files.move(tmp, Path.of(path));
        System.out.println("  Written " + result.length + " bytes to " + path);
    }

    static String shortName(String className) {
        int lastSlash = className.lastIndexOf('/');
        int lastDot = className.lastIndexOf('.');
        String name = className.substring(Math.max(lastSlash, lastDot) + 1);
        // Remove .class suffix if present
        if (name.endsWith(".class")) name = name.substring(0, name.length() - 6);
        return name;
    }

    static String escape(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 32 && c < 127) sb.append(c);
            else sb.append("U+").append(String.format("%04X", (int) c));
        }
        return sb.toString();
    }
}
