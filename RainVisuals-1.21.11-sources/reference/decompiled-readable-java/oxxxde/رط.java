/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import oxxxde.\u0635\u0644;

final class \u0631\u0637 {
    private static final int FORMAT_VERSION = 1;
    private static final String RENDERER_VERSION = "v1";
    private static final int HEADER_BYTES = 16;
    private static final int MAGIC = 1380992561;

    /*
     * WARNING - void declaration
     */
    private static int expectedLength(int width, int height) throws IOException {
        void var2_2;
        block3: {
            block2: {
                long length = (long)width * (long)height * 4L;
                if (width < 1) break block2;
                if (height >= 1 && length <= Integer.MAX_VALUE) break block3;
            }
            throw new IOException("Rendered preview dimensions are invalid");
        }
        return (int)var2_2;
    }

    private \u0631\u0637() {
    }

    /*
     * Exception decompiling
     */
    static byte[] load(String archiveSha256, int width, int height) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 3 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    static void save(String archiveSha256, int width, int height, byte[] pixels) throws IOException {
        int expectedLength;
        block25: {
            block24: {
                expectedLength = \u0631\u0637.expectedLength(width, height);
                if (pixels == null) break block24;
                if (pixels.length == expectedLength) break block25;
            }
            throw new IOException("Rendered preview pixel data has an invalid size");
        }
        Path target = \u0631\u0637.path(archiveSha256);
        if (target == null) {
            return;
        }
        ByteArrayOutputStream encoded = new ByteArrayOutputStream(expectedLength / 2);
        DataOutputStream header = new DataOutputStream(encoded);
        header.writeInt(1380992561);
        header.writeInt(1);
        header.writeInt(width);
        header.writeInt(height);
        header.flush();
        Deflater deflater = new Deflater(1);
        try (DeflaterOutputStream compressed = new DeflaterOutputStream((OutputStream)encoded, deflater, 16384);){
            compressed.write(pixels);
        }
        finally {
            deflater.end();
        }
        Path parent = target.getParent();
        Files.createDirectories(parent, new FileAttribute[0]);
        Path temporary = Files.createTempFile(parent, target.getFileName().toString(), ".tmp", new FileAttribute[0]);
        try {
            try (BufferedOutputStream output = new BufferedOutputStream(Files.newOutputStream(temporary, new OpenOption[0]));){
                encoded.writeTo(output);
            }
            try {
                CopyOption[] copyOptionArray = new CopyOption[2];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                copyOptionArray[1] = StandardCopyOption.ATOMIC_MOVE;
                Files.move(temporary, target, copyOptionArray);
            }
            catch (AtomicMoveNotSupportedException ignored) {
                CopyOption[] copyOptionArray = new CopyOption[1];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                Files.move(temporary, target, copyOptionArray);
            }
        }
        catch (Throwable throwable) {
            void var10_11;
            Files.deleteIfExists((Path)var10_11);
            throw throwable;
        }
        Files.deleteIfExists(temporary);
    }

    /*
     * WARNING - void declaration
     */
    private static boolean isSha256(String value) {
        block6: {
            block5: {
                if (value == null) break block5;
                if (value.length() == 64) break block6;
            }
            return false;
        }
        int index = 0;
        while (index < value.length()) {
            void var1_1;
            block8: {
                block9: {
                    char character;
                    block7: {
                        character = value.charAt(index);
                        if (character < '0') break block7;
                        if (character <= '9') break block8;
                    }
                    if (character < 'a') break block9;
                    if (character <= 'f') break block8;
                }
                return false;
            }
            ++var1_1;
        }
        return true;
    }

    private static Path path(String archiveSha256) {
        if (!\u0631\u0637.isSha256(archiveSha256)) {
            return null;
        }
        return \u0635\u0644.cacheDirectory().resolve("rendered-previews").resolve(RENDERER_VERSION).resolve(archiveSha256 + ".rpf").normalize();
    }
}

