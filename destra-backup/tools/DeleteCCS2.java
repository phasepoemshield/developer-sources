import java.util.zip.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public class DeleteCCS2 {
    static final String CCS2 = "ru/destra/misc/ChatCommandSender2";
    static final String CCS2_DESC = "Lru/destra/misc/ChatCommandSender2;";

    public static void main(String[] args) throws Exception {
        Path path = Path.of(args[0]);
        Path tmpJar = Path.of(path + ".patched.jar");
        int deleted = 0;
        int fixed = 0;

        try (ZipFile zf = new ZipFile(path.toFile())) {
            try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(tmpJar.toFile()))) {
                for (var entry : zf.stream().toList()) {
                    String name = entry.getName();

                    if (name.equals(CCS2 + ".class")) {
                        System.out.println("DELETED: " + name);
                        deleted++;
                        continue;
                    }

                    byte[] bytes;
                    try (InputStream is = zf.getInputStream(entry)) { bytes = is.readAllBytes(); }

                    if (name.endsWith(".class")) {
                        ClassNode cn = new ClassNode();
                        new ClassReader(bytes).accept(cn, ClassReader.EXPAND_FRAMES);

                        boolean modified = false;

                        if (cn.name.equals(CCS2)) continue;

                        if (cn.interfaces != null && cn.interfaces.remove(CCS2)) {
                            modified = true;
                            fixed++;
                            System.out.println("Removed implements CCS2 from: " + cn.name);
                        }

                        if (cn.methods != null) {
                            for (MethodNode mn : cn.methods) {
                                if (mn.instructions == null) continue;
                                for (AbstractInsnNode insn : mn.instructions) {
                                    if (insn instanceof TypeInsnNode tin) {
                                        if (tin.desc != null && tin.desc.equals(CCS2_DESC)) {
                                            System.out.println("WARNING type ref in " + cn.name + "." + mn.name + ": " + tin.desc);
                                        }
                                    }
                                    if (insn instanceof FieldInsnNode fin) {
                                        if (fin.owner.equals(CCS2)) {
                                            fin.owner = "ru/destra/misc/ChatCommandSender2Fields";
                                            modified = true;
                                            System.out.println("Fixed field ref in " + cn.name + ": " + fin.name);
                                        }
                                    }
                                    if (insn instanceof MethodInsnNode min) {
                                        if (min.owner.equals(CCS2)) {
                                            System.out.println("WARNING method call in " + cn.name + "." + mn.name + ": " + min.name + min.desc);
                                        }
                                    }
                                }
                            }
                        }

                        if (modified) {
                            ClassWriter cw = new ClassWriter(0);
                            cn.accept(cw);
                            bytes = cw.toByteArray();
                        }
                    }

                    zos.putNextEntry(new ZipEntry(name));
                    zos.write(bytes);
                    zos.closeEntry();
                }
            }
        }

        Files.copy(tmpJar, path, StandardCopyOption.REPLACE_EXISTING);
        Files.delete(tmpJar);
        System.out.println("Done. Deleted=" + deleted + " Fixed=" + fixed);
    }
}
