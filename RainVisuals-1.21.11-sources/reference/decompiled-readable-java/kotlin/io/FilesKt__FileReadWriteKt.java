/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.ExposingBufferByteArrayOutputStream;
import kotlin.io.FilesKt;
import kotlin.io.FilesKt__FilePathComponentsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000b\u001a(\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a(\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0087\b\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001aI\u0010\u001a\u001a\u00020\u0003*\u00020\u000026\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00030\u0014\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010\u001a\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\f26\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00030\u0014\u00a2\u0006\u0004\b\u001a\u0010\u001d\u001a>\u0010 \u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00030\u001e\u00a2\u0006\u0004\b \u0010!\u001a\u0014\u0010#\u001a\u00020\"*\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b#\u0010$\u001a\u0014\u0010&\u001a\u00020%*\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b&\u0010'\u001a\u001e\u0010)\u001a\u00020(*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b)\u0010*\u001a\u0011\u0010+\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\b+\u0010,\u001a!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060-*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b.\u0010/\u001a\u001b\u00100\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b0\u00101\u001a\u001e\u00103\u001a\u000202*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b3\u00104\u001aA\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u00105*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0018\u00107\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000606\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b8\u00109\u001a\u0019\u0010:\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b:\u0010\u0005\u001a#\u0010;\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b;\u0010\u000b\u001a\u001e\u0010=\u001a\u00020<*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0087\b\u00a2\u0006\u0004\b=\u0010>\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006?"}, d2={"Ljava/io/File;", "", "array", "", "appendBytes", "(Ljava/io/File;[B)V", "", "text", "Ljava/nio/charset/Charset;", "charset", "appendText", "(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;)V", "", "bufferSize", "Ljava/io/BufferedReader;", "bufferedReader", "(Ljava/io/File;Ljava/nio/charset/Charset;I)Ljava/io/BufferedReader;", "Ljava/io/BufferedWriter;", "bufferedWriter", "(Ljava/io/File;Ljava/nio/charset/Charset;I)Ljava/io/BufferedWriter;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "action", "forEachBlock", "(Ljava/io/File;Lkotlin/jvm/functions/Function2;)V", "blockSize", "(Ljava/io/File;ILkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "line", "forEachLine", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)V", "Ljava/io/FileInputStream;", "inputStream", "(Ljava/io/File;)Ljava/io/FileInputStream;", "Ljava/io/FileOutputStream;", "outputStream", "(Ljava/io/File;)Ljava/io/FileOutputStream;", "Ljava/io/PrintWriter;", "printWriter", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/io/PrintWriter;", "readBytes", "(Ljava/io/File;)[B", "", "readLines", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/util/List;", "readText", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;", "Ljava/io/InputStreamReader;", "reader", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/io/InputStreamReader;", "T", "Lkotlin/sequences/Sequence;", "block", "useLines", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "Ljava/io/OutputStreamWriter;", "writer", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, xs="kotlin/io/FilesKt")
class FilesKt__FileReadWriteKt
extends FilesKt__FilePathComponentsKt {
    @InlineOnly
    private static final OutputStreamWriter writer(File $this$writer, Charset charset) {
        Intrinsics.checkNotNullParameter($this$writer, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter((OutputStream)new FileOutputStream($this$writer), charset);
    }

    /*
     * WARNING - void declaration
     */
    @InlineOnly
    private static final BufferedReader bufferedReader(File $this$bufferedReader, Charset charset, int bufferSize) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Object object = $this$bufferedReader;
        object = new InputStreamReader((InputStream)new FileInputStream((File)object), charset);
        return object instanceof BufferedReader ? (BufferedReader)object : new BufferedReader((Reader)object, (int)var2_2);
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ BufferedReader bufferedReader$default(File $this$bufferedReader_u24default, Charset charset, int bufferSize, int n, Object object) {
        void var2_2;
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((n & 2) != 0) {
            bufferSize = 8192;
        }
        Intrinsics.checkNotNullParameter($this$bufferedReader_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Object object2 = $this$bufferedReader_u24default;
        object2 = new InputStreamReader((InputStream)new FileInputStream((File)object2), charset);
        return object2 instanceof BufferedReader ? (BufferedReader)object2 : new BufferedReader((Reader)object2, (int)var2_2);
    }

    @NotNull
    public static final List<String> readLines(@NotNull File $this$readLines, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter($this$readLines, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        ArrayList<String> result = new ArrayList<String>();
        FilesKt.forEachLine($this$readLines, charset, (Function1<? super String, Unit>)new Function1<String, Unit>(result){
            final /* synthetic */ ArrayList<String> $result;
            {
                this.$result = $result;
                super(1);
            }

            public final void invoke(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.$result.add(it);
            }
        });
        return result;
    }

    static /* synthetic */ PrintWriter printWriter$default(File $this$printWriter_u24default, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$printWriter_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        File file = $this$printWriter_u24default;
        int n2 = 8192;
        Object object2 = file;
        object2 = new OutputStreamWriter((OutputStream)new FileOutputStream((File)object2), charset);
        return new PrintWriter(object2 instanceof BufferedWriter ? (BufferedWriter)object2 : new BufferedWriter((Writer)object2, n2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void writeBytes(@NotNull File $this$writeBytes, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter($this$writeBytes, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        Closeable closeable = new FileOutputStream($this$writeBytes);
        Throwable throwable = null;
        try {
            FileOutputStream it = (FileOutputStream)closeable;
            boolean bl = false;
            it.write(array);
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final <T> T useLines(@NotNull File $this$useLines, @NotNull Charset charset, @NotNull Function1<? super Sequence<String>, ? extends T> block) {
        Intrinsics.checkNotNullParameter($this$useLines, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$useLines = false;
        Object object = $this$useLines;
        int n = 8192;
        Object object2 = object;
        object2 = new InputStreamReader((InputStream)new FileInputStream((File)object2), charset);
        object = object2 instanceof BufferedReader ? (BufferedReader)object2 : new BufferedReader((Reader)object2, n);
        Throwable throwable = null;
        try {
            BufferedReader it = (BufferedReader)object;
            boolean bl = false;
            object2 = block.invoke(TextStreamsKt.lineSequence(it));
        }
        catch (Throwable throwable2) {
            try {
                throwable = throwable2;
                throw throwable2;
            }
            catch (Throwable throwable3) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally((Closeable)object, throwable);
                } else if (throwable == null) {
                    object.close();
                } else {
                    try {
                        object.close();
                    }
                    catch (Throwable throwable4) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw throwable3;
            }
        }
        InlineMarker.finallyStart(1);
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally((Closeable)object, throwable);
        } else {
            object.close();
        }
        InlineMarker.finallyEnd(1);
        return (T)object2;
    }

    @InlineOnly
    private static final InputStreamReader reader(File $this$reader, Charset charset) {
        Intrinsics.checkNotNullParameter($this$reader, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader((InputStream)new FileInputStream($this$reader), charset);
    }

    public static /* synthetic */ void forEachLine$default(File file, Charset charset, Function1 function1, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        FilesKt.forEachLine(file, charset, function1);
    }

    @InlineOnly
    private static final FileInputStream inputStream(File $this$inputStream) {
        Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
        return new FileInputStream($this$inputStream);
    }

    public static /* synthetic */ String readText$default(File file, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return FilesKt.readText(file, charset);
    }

    public static /* synthetic */ void appendText$default(File file, String string, Charset charset, int n, Object object) {
        if ((n & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        FilesKt.appendText(file, string, charset);
    }

    static /* synthetic */ OutputStreamWriter writer$default(File $this$writer_u24default, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$writer_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter((OutputStream)new FileOutputStream($this$writer_u24default), charset);
    }

    public static /* synthetic */ List readLines$default(File file, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return FilesKt.readLines(file, charset);
    }

    public static final void writeText(@NotNull File $this$writeText, @NotNull String text, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter($this$writeText, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] byArray = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        FilesKt.writeBytes($this$writeText, byArray);
    }

    public static /* synthetic */ void writeText$default(File file, String string, Charset charset, int n, Object object) {
        if ((n & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        FilesKt.writeText(file, string, charset);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @NotNull
    public static final String readText(@NotNull File $this$readText, @NotNull Charset charset) {
        String string;
        Intrinsics.checkNotNullParameter($this$readText, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Object object = $this$readText;
        object = new InputStreamReader((InputStream)new FileInputStream((File)object), charset);
        Throwable throwable = null;
        try {
            InputStreamReader it = (InputStreamReader)object;
            boolean bl = false;
            string = TextStreamsKt.readText(it);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseableKt.closeFinally((Closeable)object, throwable);
        }
        return string;
    }

    static /* synthetic */ InputStreamReader reader$default(File $this$reader_u24default, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$reader_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader((InputStream)new FileInputStream($this$reader_u24default), charset);
    }

    public static final void forEachBlock(@NotNull File $this$forEachBlock, @NotNull Function2<? super byte[], ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEachBlock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        FilesKt.forEachBlock($this$forEachBlock, 4096, action);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static /* synthetic */ Object useLines$default(File $this$useLines_u24default, Charset charset, Function1 block, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$useLines_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$useLines = false;
        object = $this$useLines_u24default;
        int n2 = 8192;
        Object object2 = object;
        object2 = new InputStreamReader((InputStream)new FileInputStream((File)object2), charset);
        object = object2 instanceof BufferedReader ? (BufferedReader)object2 : new BufferedReader((Reader)object2, n2);
        Throwable throwable = null;
        try {
            BufferedReader it = (BufferedReader)object;
            boolean bl = false;
            object2 = block.invoke(TextStreamsKt.lineSequence(it));
        }
        catch (Throwable throwable2) {
            try {
                throwable = throwable2;
                throw throwable2;
            }
            catch (Throwable throwable3) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally((Closeable)object, throwable);
                } else if (throwable == null) {
                    object.close();
                } else {
                    try {
                        object.close();
                    }
                    catch (Throwable throwable4) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw throwable3;
            }
        }
        InlineMarker.finallyStart(1);
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally((Closeable)object, throwable);
        } else {
            object.close();
        }
        InlineMarker.finallyEnd(1);
        return object2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @NotNull
    public static final byte[] readBytes(@NotNull File $this$readBytes) {
        byte[] byArray;
        Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
        Closeable closeable = new FileInputStream($this$readBytes);
        Throwable throwable = null;
        try {
            byte[] byArray2;
            long l;
            FileInputStream input = (FileInputStream)closeable;
            boolean bl = false;
            int offset = 0;
            long length = l = $this$readBytes.length();
            boolean bl2 = false;
            if (length > Integer.MAX_VALUE) {
                throw new OutOfMemoryError("File " + $this$readBytes + " is too big (" + length + " bytes) to fit in memory.");
            }
            int remaining = (int)l;
            byte[] result = new byte[remaining];
            while (remaining > 0) {
                int read = input.read(result, offset, remaining);
                if (read < 0) break;
                remaining -= read;
                offset += read;
            }
            if (remaining > 0) {
                byte[] byArray3 = Arrays.copyOf(result, offset);
                byArray2 = byArray3;
                Intrinsics.checkNotNullExpressionValue(byArray3, "copyOf(...)");
            } else {
                int extraByte = input.read();
                if (extraByte == -1) {
                    byArray2 = result;
                } else {
                    void var13_14;
                    ExposingBufferByteArrayOutputStream extra = new ExposingBufferByteArrayOutputStream(8193);
                    extra.write(extraByte);
                    ByteStreamsKt.copyTo$default(input, extra, 0, 2, null);
                    int resultingSize = result.length + extra.size();
                    if (resultingSize < 0) {
                        throw new OutOfMemoryError("File " + $this$readBytes + " is too big to fit in memory.");
                    }
                    byte[] byArray4 = extra.getBuffer();
                    byte[] byArray5 = Arrays.copyOf(result, resultingSize);
                    Intrinsics.checkNotNullExpressionValue(byArray5, "copyOf(...)");
                    byArray2 = ArraysKt.copyInto(byArray4, byArray5, result.length, 0, var13_14.size());
                }
            }
            byArray = byArray2;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
        return byArray;
    }

    public static final void appendText(@NotNull File $this$appendText, @NotNull String text, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter($this$appendText, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] byArray = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        FilesKt.appendBytes($this$appendText, byArray);
    }

    /*
     * WARNING - void declaration
     */
    @InlineOnly
    private static final BufferedWriter bufferedWriter(File $this$bufferedWriter, Charset charset, int bufferSize) {
        void var2_2;
        Intrinsics.checkNotNullParameter($this$bufferedWriter, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Object object = $this$bufferedWriter;
        object = new OutputStreamWriter((OutputStream)new FileOutputStream((File)object), charset);
        return object instanceof BufferedWriter ? (BufferedWriter)object : new BufferedWriter((Writer)object, (int)var2_2);
    }

    public static final void forEachLine(@NotNull File $this$forEachLine, @NotNull Charset charset, @NotNull Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEachLine, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        TextStreamsKt.forEachLine(new BufferedReader(new InputStreamReader((InputStream)new FileInputStream($this$forEachLine), charset)), action);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void forEachBlock(@NotNull File $this$forEachBlock, int blockSize, @NotNull Function2<? super byte[], ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEachBlock, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        byte[] arr = new byte[RangesKt.coerceAtLeast(blockSize, 512)];
        Closeable closeable = new FileInputStream($this$forEachBlock);
        Throwable throwable = null;
        try {
            int size;
            FileInputStream input = (FileInputStream)closeable;
            boolean bl = false;
            while ((size = input.read(arr)) > 0) {
                action.invoke((byte[])arr, (Integer)size);
            }
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
    }

    @InlineOnly
    private static final FileOutputStream outputStream(File $this$outputStream) {
        Intrinsics.checkNotNullParameter($this$outputStream, "<this>");
        return new FileOutputStream($this$outputStream);
    }

    @InlineOnly
    private static final PrintWriter printWriter(File $this$printWriter, Charset charset) {
        Intrinsics.checkNotNullParameter($this$printWriter, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        File file = $this$printWriter;
        int n = 8192;
        Object object = file;
        object = new OutputStreamWriter((OutputStream)new FileOutputStream((File)object), charset);
        return new PrintWriter(object instanceof BufferedWriter ? (BufferedWriter)object : new BufferedWriter((Writer)object, n));
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ BufferedWriter bufferedWriter$default(File $this$bufferedWriter_u24default, Charset charset, int bufferSize, int n, Object object) {
        void var2_2;
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((n & 2) != 0) {
            bufferSize = 8192;
        }
        Intrinsics.checkNotNullParameter($this$bufferedWriter_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Object object2 = $this$bufferedWriter_u24default;
        object2 = new OutputStreamWriter((OutputStream)new FileOutputStream((File)object2), charset);
        return object2 instanceof BufferedWriter ? (BufferedWriter)object2 : new BufferedWriter((Writer)object2, (int)var2_2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void appendBytes(@NotNull File $this$appendBytes, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter($this$appendBytes, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        Closeable closeable = new FileOutputStream($this$appendBytes, true);
        Throwable throwable = null;
        try {
            FileOutputStream it = (FileOutputStream)closeable;
            boolean bl = false;
            it.write(array);
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
    }
}

