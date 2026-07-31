import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class PatchRoundedRectClass {
    static final String OLD = "sg/ec/\u0432\u044c";
    static final String NEW = "sg/ec/RoundedRectImpl";

    public static void main(String[] args) throws Exception {
        File dir = new File(".precompiled/sg/ec");
        if (!dir.isDirectory()) { System.out.println("Directory not found: " + dir); return; }

        List<File> toRename = new ArrayList<>();
        File alreadyNew = null;
        for (File f : dir.listFiles()) {
            String name = f.getName();
            if (!name.endsWith(".class")) continue;
            String className = name.substring(0, name.length() - 6);
            if (className.equals("\u0432\u044c") || className.startsWith("\u0432\u044c$")) {
                toRename.add(f);
            }
            if (className.equals("RoundedRectImpl") || className.startsWith("RoundedRectImpl$")) {
                alreadyNew = f;
            }
        }

        if (!toRename.isEmpty()) {
            for (File f : toRename) {
                String name = f.getName();
                String className = name.substring(0, name.length() - 6);
                String newClassName = className.replace("\u0432\u044c", "RoundedRectImpl");
                String newName = newClassName + ".class";

                byte[] data = Files.readAllBytes(f.toPath());
                ClassReader cr = new ClassReader(data);

                if (className.equals("\u0432\u044c")) {
                    System.out.println("=== sg/ec/ references in " + className + " ===");
                    printSgEcRefs(cr);
                }

                ClassNode cn = new ClassNode();
                cr.accept(cn, ClassReader.EXPAND_FRAMES);
                remapClass(cn);

                ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
                    @Override
                    protected String getCommonSuperClass(String t1, String t2) {
                        if (t1.startsWith("net/minecraft/") || t2.startsWith("net/minecraft/"))
                            return "java/lang/Object";
                        if (t1.startsWith("sg/ec/") || t2.startsWith("sg/ec/"))
                            return "java/lang/Object";
                        try { return super.getCommonSuperClass(t1, t2); }
                        catch (Throwable e) { return "java/lang/Object"; }
                    }
                };
                cn.accept(cw);
                byte[] result = cw.toByteArray();

                File outFile = new File(dir, newName);
                Files.write(outFile.toPath(), result);
                f.delete();
                System.out.println("Renamed " + name + " -> " + newName + " (" + result.length + " bytes)");
            }
        } else if (alreadyNew != null) {
            System.out.println("Already renamed: " + alreadyNew.getName());
        } else {
            System.out.println("Neither old nor new class file found in " + dir);
        }

        patchFile(".precompiled/sg/ec/RoundedRectImpl.class");
        patchFile(".precompiled/ru/destra/render/RoundedRectBuilder.class");
        patchFile(".precompiled/ru/destra/render/GuiRenderUtil.class");
    }

    static void printSgEcRefs(ClassReader cr) {
        Set<String> refs = new TreeSet<>();
        cr.accept(new ClassVisitor(Opcodes.ASM9) {
            @Override
            public void visit(int version, int access, String name, String signature,
                              String superName, String[] interfaces) {
                if (superName != null && superName.startsWith("sg/ec/")) refs.add(superName);
                if (interfaces != null) for (String i : interfaces)
                    if (i.startsWith("sg/ec/")) refs.add(i);
            }
            @Override
            public FieldVisitor visitField(int access, String name, String descriptor,
                                           String signature, Object value) {
                extractSgEc(descriptor, refs);
                return null;
            }
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor,
                                             String signature, String[] exceptions) {
                extractSgEc(descriptor, refs);
                if (exceptions != null) for (String e : exceptions)
                    if (e.startsWith("sg/ec/")) refs.add(e);
                return new MethodVisitor(Opcodes.ASM9) {
                    @Override
                    public void visitTypeInsn(int opcode, String type) { extractSgEc(type, refs); }
                    @Override
                    public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
                        if (owner.startsWith("sg/ec/")) refs.add(owner);
                        extractSgEc(descriptor, refs);
                    }
                    @Override
                    public void visitMethodInsn(int opcode, String owner, String name,
                                                String descriptor, boolean isInterface) {
                        if (owner.startsWith("sg/ec/")) refs.add(owner);
                        extractSgEc(descriptor, refs);
                    }
                    @Override
                    public void visitInvokeDynamicInsn(String name, String descriptor,
                                                       Handle bsm, Object... bsmArgs) {
                        if (bsm.getOwner().startsWith("sg/ec/")) refs.add(bsm.getOwner());
                        extractSgEc(descriptor, refs);
                        for (Object arg : bsmArgs) {
                            if (arg instanceof Type) extractSgEc(((Type) arg).getDescriptor(), refs);
                            if (arg instanceof Handle) {
                                Handle h = (Handle) arg;
                                if (h.getOwner().startsWith("sg/ec/")) refs.add(h.getOwner());
                                extractSgEc(h.getDesc(), refs);
                            }
                        }
                    }
                    @Override
                    public void visitLdcInsn(Object value) {
                        if (value instanceof Type) extractSgEc(((Type) value).getDescriptor(), refs);
                    }
                };
            }
        }, 0);
        for (String ref : refs) System.out.println("  " + ref + " (non-ASCII: " + isNonAscii(ref) + ")");
    }

    static boolean isNonAscii(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 127) return true;
        }
        return false;
    }

    static void extractSgEc(String desc, Set<String> refs) {
        if (desc == null) return;
        int idx = 0;
        while ((idx = desc.indexOf("Lsg/ec/", idx)) >= 0) {
            int end = desc.indexOf(';', idx);
            if (end < 0) break;
            refs.add(desc.substring(idx + 1, end));
            idx = end + 1;
        }
    }

    static void remapClass(ClassNode cn) {
        if (cn.version > Opcodes.V21) {
            System.out.println("  Downgraded class version " + cn.version + " -> V21 (65)");
            cn.version = Opcodes.V21;
        }
        cn.name = remapInternal(cn.name);
        cn.superName = remapInternal(cn.superName);
        if (cn.interfaces != null) {
            for (int i = 0; i < cn.interfaces.size(); i++)
                cn.interfaces.set(i, remapInternal(cn.interfaces.get(i)));
        }
        if (cn.innerClasses != null) {
            for (InnerClassNode ic : cn.innerClasses) {
                ic.name = remapInternal(ic.name);
                ic.outerName = remapInternal(ic.outerName);
            }
        }
        for (FieldNode f : cn.fields) {
            f.desc = remapDesc(f.desc);
        }
        for (MethodNode m : cn.methods) {
            m.desc = remapDesc(m.desc);
            if (m.exceptions != null) {
                for (int i = 0; i < m.exceptions.size(); i++)
                    m.exceptions.set(i, remapInternal(m.exceptions.get(i)));
            }
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof TypeInsnNode) {
                    TypeInsnNode tin = (TypeInsnNode) insn;
                    String t = tin.desc;
                    if (t.startsWith("[")) tin.desc = remapDesc(t);
                    else tin.desc = remapInternal(t);
                } else if (insn instanceof FieldInsnNode) {
                    FieldInsnNode fin = (FieldInsnNode) insn;
                    fin.owner = remapInternal(fin.owner);
                    fin.desc = remapDesc(fin.desc);
                } else if (insn instanceof MethodInsnNode) {
                    MethodInsnNode min = (MethodInsnNode) insn;
                    min.owner = remapInternal(min.owner);
                    min.desc = remapDesc(min.desc);
                } else if (insn instanceof InvokeDynamicInsnNode) {
                    InvokeDynamicInsnNode indy = (InvokeDynamicInsnNode) insn;
                    indy.desc = remapDesc(indy.desc);
                    indy.bsm = remapHandle(indy.bsm);
                    for (int i = 0; i < indy.bsmArgs.length; i++) {
                        Object arg = indy.bsmArgs[i];
                        if (arg instanceof Type) indy.bsmArgs[i] = remapType((Type) arg);
                        else if (arg instanceof Handle) indy.bsmArgs[i] = remapHandle((Handle) arg);
                    }
                } else if (insn instanceof LdcInsnNode) {
                    LdcInsnNode ldc = (LdcInsnNode) insn;
                    if (ldc.cst instanceof Type) ldc.cst = remapType((Type) ldc.cst);
                }
            }
        }
    }

    static Handle remapHandle(Handle h) {
        String owner = remapInternal(h.getOwner());
        String desc = remapDesc(h.getDesc());
        if (!owner.equals(h.getOwner()) || !desc.equals(h.getDesc()))
            return new Handle(h.getTag(), owner, h.getName(), desc, h.isInterface());
        return h;
    }

    static Type remapType(Type t) {
        if (t == null) return null;
        String sort = t.getSort() == Type.ARRAY ? "array" : "" + t.getSort();
        if (t.getSort() == Type.OBJECT) {
            String internal = t.getInternalName();
            String mapped = remapInternal(internal);
            if (!internal.equals(mapped)) return Type.getObjectType(mapped);
        } else if (t.getSort() == Type.ARRAY) {
            String desc = t.getDescriptor();
            String newDesc = remapDesc(desc);
            if (!desc.equals(newDesc)) return Type.getType(newDesc);
        } else if (t.getSort() == Type.METHOD) {
            String desc = t.getDescriptor();
            String newDesc = remapDesc(desc);
            if (!desc.equals(newDesc)) return Type.getType(newDesc);
        }
        return t;
    }

    static String remapInternal(String name) {
        if (name == null) return null;
        if (name.equals(OLD)) return NEW;
        if (name.startsWith(OLD + "$")) return NEW + name.substring(OLD.length());
        return name;
    }

    static String remapDesc(String desc) {
        if (desc == null) return null;
        return desc.replace("L" + OLD + ";", "L" + NEW + ";");
    }

    static void patchFile(String path) throws Exception {
        File f = new File(path);
        if (!f.exists()) { System.out.println("Not found: " + path); return; }
        byte[] data = Files.readAllBytes(f.toPath());
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);
        remapClass(cn);
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
            @Override
            protected String getCommonSuperClass(String t1, String t2) {
                if (t1.startsWith("net/minecraft/") || t2.startsWith("net/minecraft/"))
                    return "java/lang/Object";
                if (t1.startsWith("sg/ec/") || t2.startsWith("sg/ec/"))
                    return "java/lang/Object";
                try { return super.getCommonSuperClass(t1, t2); }
                catch (Throwable e) { return "java/lang/Object"; }
            }
        };
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Files.write(f.toPath(), result);
        System.out.println("Patched " + path);
    }
}
