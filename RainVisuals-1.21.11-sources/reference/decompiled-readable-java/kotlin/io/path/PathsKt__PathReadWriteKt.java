/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.path;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.io.path.ExperimentalPathApi;
import kotlin.io.path.PathsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a,\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b\u000b\u0010\f\u001a,\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\b\b\u0002\u0010\n\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b\u000b\u0010\u000e\u001a%\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a<\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a<\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001aD\u0010#\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u001e\u00a2\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00030\u001dH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b#\u0010$\u001a(\u0010&\u001a\u00020%*\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b&\u0010'\u001a(\u0010)\u001a\u00020(*\u00020\u00002\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b)\u0010*\u001a\u0014\u0010+\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b+\u0010,\u001a$\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001e0-*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b.\u0010/\u001a\u001d\u00100\u001a\u00020\u001e*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b0\u00101\u001a2\u00103\u001a\u000202*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b3\u00104\u001aA\u00107\u001a\u00028\u0000\"\u0004\b\u0000\u00105*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\u0018\u00106\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\r\u0012\u0004\u0012\u00028\u00000\u001dH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b7\u00108\u001a0\u00109\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b9\u0010:\u001a@\u0010;\u001a\u00020\u0000*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b;\u0010<\u001a@\u0010;\u001a\u00020\u0000*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b;\u0010=\u001a9\u0010>\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0007\u00a2\u0006\u0004\b>\u0010?\u001a2\u0010A\u001a\u00020@*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0087\b\u00a2\u0006\u0004\bA\u0010B\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006C"}, d2={"Ljava/nio/file/Path;", "", "array", "", "appendBytes", "(Ljava/nio/file/Path;[B)V", "", "", "lines", "Ljava/nio/charset/Charset;", "charset", "appendLines", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;)Ljava/nio/file/Path;", "Lkotlin/sequences/Sequence;", "(Ljava/nio/file/Path;Lkotlin/sequences/Sequence;Ljava/nio/charset/Charset;)Ljava/nio/file/Path;", "text", "appendText", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)V", "", "bufferSize", "", "Ljava/nio/file/OpenOption;", "options", "Ljava/io/BufferedReader;", "bufferedReader", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "Ljava/io/BufferedWriter;", "bufferedWriter", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "line", "action", "forEachLine", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)V", "Ljava/io/InputStream;", "inputStream", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "Ljava/io/OutputStream;", "outputStream", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "readBytes", "(Ljava/nio/file/Path;)[B", "", "readLines", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/util/List;", "readText", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;)Ljava/lang/String;", "Ljava/io/InputStreamReader;", "reader", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "T", "block", "useLines", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "writeLines", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/sequences/Sequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "writeText", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "Ljava/io/OutputStreamWriter;", "writer", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "kotlin-stdlib-jdk7"}, xs="kotlin/io/path/PathsKt")
class PathsKt__PathReadWriteKt {
    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.5")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final InputStreamReader reader(Path $this$reader, Charset charset, OpenOption ... options) throws IOException {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$reader, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new InputStreamReader(Files.newInputStream($this$reader, Arrays.copyOf(options, options.length)), (Charset)var1_1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    public static final void appendText(@NotNull Path $this$appendText, @NotNull CharSequence text, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter($this$appendText, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Object object = new OpenOption[1];
        object[0] = StandardOpenOption.APPEND;
        OutputStream outputStream = Files.newOutputStream($this$appendText, object);
        Intrinsics.checkNotNullExpressionValue(outputStream, "newOutputStream(...)");
        Closeable closeable = outputStream;
        closeable = new OutputStreamWriter((OutputStream)closeable, charset);
        object = null;
        try {
            Writer writer;
            OutputStreamWriter it = (OutputStreamWriter)closeable;
            boolean bl = false;
            writer = ((OutputStreamWriter)writer).append(text);
        }
        catch (Throwable throwable) {
            object = throwable;
            throw throwable;
        }
        finally {
            CloseableKt.closeFinally(closeable, (Throwable)object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static /* synthetic */ Object useLines$default(Path $this$useLines_u24default, Charset charset, Function1 block, int n, Object object) throws IOException {
        Object r;
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$useLines_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        Closeable closeable = Files.newBufferedReader($this$useLines_u24default, charset);
        object = null;
        try {
            BufferedReader it = (BufferedReader)closeable;
            boolean bl = false;
            Intrinsics.checkNotNull(it);
            r = block.invoke(TextStreamsKt.lineSequence(it));
        }
        catch (Throwable throwable) {
            try {
                object = throwable;
                throw throwable;
            }
            catch (Throwable throwable2) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(closeable, (Throwable)object);
                } else if (closeable != null) {
                    if (object == null) {
                        closeable.close();
                    } else {
                        try {
                            closeable.close();
                        }
                        catch (Throwable throwable3) {
                        }
                    }
                }
                InlineMarker.finallyEnd(1);
                throw throwable2;
            }
        }
        InlineMarker.finallyStart(1);
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(closeable, (Throwable)object);
        } else if (closeable != null) {
            closeable.close();
        }
        InlineMarker.finallyEnd(1);
        return r;
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ OutputStreamWriter writer$default(Path $this$writer_u24default, Charset charset, OpenOption[] options, int n, Object object) throws IOException {
        void var1_1;
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$writer_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new OutputStreamWriter(Files.newOutputStream($this$writer_u24default, Arrays.copyOf(options, options.length)), (Charset)var1_1);
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final OutputStream outputStream(Path $this$outputStream, OpenOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$outputStream, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        OutputStream outputStream = Files.newOutputStream($this$outputStream, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(outputStream, "newOutputStream(...)");
        return outputStream;
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ BufferedWriter bufferedWriter$default(Path $this$bufferedWriter_u24default, Charset charset, int bufferSize, OpenOption[] options, int n, Object object) throws IOException {
        void var2_2;
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((n & 2) != 0) {
            bufferSize = 8192;
        }
        Intrinsics.checkNotNullParameter($this$bufferedWriter_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream($this$bufferedWriter_u24default, Arrays.copyOf(options, options.length)), charset), (int)var2_2);
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final Path writeLines(Path $this$writeLines, Iterable<? extends CharSequence> lines, Charset charset, OpenOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$writeLines, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path path = Files.write($this$writeLines, lines, charset, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "write(...)");
        return path;
    }

    @SinceKotlin(version="1.5")
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final List<String> readLines(Path $this$readLines, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter($this$readLines, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        List<String> list = Files.readAllLines($this$readLines, charset);
        Intrinsics.checkNotNullExpressionValue(list, "readAllLines(...)");
        return list;
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ BufferedReader bufferedReader$default(Path $this$bufferedReader_u24default, Charset charset, int bufferSize, OpenOption[] options, int n, Object object) throws IOException {
        void var2_2;
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((n & 2) != 0) {
            bufferSize = 8192;
        }
        Intrinsics.checkNotNullParameter($this$bufferedReader_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream($this$bufferedReader_u24default, Arrays.copyOf(options, options.length)), charset), (int)var2_2);
    }

    static /* synthetic */ List readLines$default(Path $this$readLines_u24default, Charset charset, int n, Object object) throws IOException {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$readLines_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        List<String> list = Files.readAllLines($this$readLines_u24default, charset);
        Intrinsics.checkNotNullExpressionValue(list, "readAllLines(...)");
        return list;
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final BufferedReader bufferedReader(Path $this$bufferedReader, Charset charset, int bufferSize, OpenOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream($this$bufferedReader, Arrays.copyOf(options, options.length)), charset), bufferSize);
    }

    /*
     * WARNING - void declaration
     */
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final OutputStreamWriter writer(Path $this$writer, Charset charset, OpenOption ... options) throws IOException {
        void var1_1;
        Intrinsics.checkNotNullParameter($this$writer, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new OutputStreamWriter(Files.newOutputStream($this$writer, Arrays.copyOf(options, options.length)), (Charset)var1_1);
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final void appendBytes(Path $this$appendBytes, byte[] array) throws IOException {
        Intrinsics.checkNotNullParameter($this$appendBytes, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        OpenOption[] openOptionArray = new OpenOption[1];
        openOptionArray[0] = StandardOpenOption.APPEND;
        Files.write($this$appendBytes, array, openOptionArray);
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ InputStreamReader reader$default(Path $this$reader_u24default, Charset charset, OpenOption[] options, int n, Object object) throws IOException {
        void var1_1;
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$reader_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new InputStreamReader(Files.newInputStream($this$reader_u24default, Arrays.copyOf(options, options.length)), (Charset)var1_1);
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final Path appendLines(Path $this$appendLines, Sequence<? extends CharSequence> lines, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter($this$appendLines, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OpenOption[] openOptionArray = new OpenOption[1];
        openOptionArray[0] = StandardOpenOption.APPEND;
        Path path = Files.write($this$appendLines, SequencesKt.asIterable(lines), charset, openOptionArray);
        Intrinsics.checkNotNullExpressionValue(path, "write(...)");
        return path;
    }

    public static /* synthetic */ void writeText$default(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArray, int n, Object object) throws IOException {
        if ((n & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        PathsKt.writeText(path, charSequence, charset, openOptionArray);
    }

    public static /* synthetic */ void appendText$default(Path path, CharSequence charSequence, Charset charset, int n, Object object) throws IOException {
        if ((n & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        PathsKt.appendText(path, charSequence, charset);
    }

    @InlineOnly
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    private static final Path appendLines(Path $this$appendLines, Iterable<? extends CharSequence> lines, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter($this$appendLines, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OpenOption[] openOptionArray = new OpenOption[1];
        openOptionArray[0] = StandardOpenOption.APPEND;
        Path path = Files.write($this$appendLines, lines, charset, openOptionArray);
        Intrinsics.checkNotNullExpressionValue(path, "write(...)");
        return path;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    public static final void writeText(@NotNull Path $this$writeText, @NotNull CharSequence text, @NotNull Charset charset, OpenOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$writeText, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        OutputStream outputStream = Files.newOutputStream($this$writeText, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(outputStream, "newOutputStream(...)");
        Closeable closeable = outputStream;
        closeable = new OutputStreamWriter((OutputStream)closeable, charset);
        Throwable throwable = null;
        try {
            Writer writer;
            OutputStreamWriter it = (OutputStreamWriter)closeable;
            boolean bl = false;
            writer = ((OutputStreamWriter)writer).append(text);
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
     * WARNING - void declaration
     */
    static /* synthetic */ void forEachLine$default(Path $this$forEachLine_u24default, Charset charset, Function1 action, int n, Object object) throws IOException {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$forEachLine_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReader = Files.newBufferedReader($this$forEachLine_u24default, charset);
        Intrinsics.checkNotNullExpressionValue(bufferedReader, "newBufferedReader(...)");
        Reader $this$useLines$iv = bufferedReader;
        boolean $i$f$useLines = false;
        Closeable closeable = $this$useLines$iv;
        closeable = (BufferedReader)closeable;
        Throwable throwable = null;
        try {
            BufferedReader it$iv = (BufferedReader)closeable;
            boolean bl = false;
            Sequence<String> it = TextStreamsKt.lineSequence(it$iv);
            boolean bl2 = false;
            Sequence<String> $this$forEach$iv = it;
            boolean $i$f$forEach = false;
            Iterator<String> iterator2 = $this$forEach$iv.iterator();
            while (iterator2.hasNext()) {
                void var14_19;
                String element$iv = iterator2.next();
                action.invoke(var14_19);
            }
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            try {
                throwable = throwable2;
                throw throwable2;
            }
            catch (Throwable throwable3) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(closeable, throwable);
                } else if (throwable == null) {
                    closeable.close();
                } else {
                    try {
                        closeable.close();
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
            CloseableKt.closeFinally(closeable, throwable);
        } else {
            closeable.close();
        }
        InlineMarker.finallyEnd(1);
    }

    static /* synthetic */ Path writeLines$default(Path $this$writeLines_u24default, Sequence lines, Charset charset, OpenOption[] options, int n, Object object) throws IOException {
        if ((n & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$writeLines_u24default, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path path = Files.write($this$writeLines_u24default, SequencesKt.asIterable(lines), charset, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "write(...)");
        return path;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final Path writeLines(Path $this$writeLines, Sequence<? extends CharSequence> lines, Charset charset, OpenOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$writeLines, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path path = Files.write($this$writeLines, SequencesKt.asIterable(lines), charset, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "write(...)");
        return path;
    }

    static /* synthetic */ Path appendLines$default(Path $this$appendLines_u24default, Iterable lines, Charset charset, int n, Object openOptionArray) throws IOException {
        if ((n & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$appendLines_u24default, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        openOptionArray = new OpenOption[1];
        openOptionArray[0] = StandardOpenOption.APPEND;
        Path path = Files.write($this$appendLines_u24default, (Iterable<? extends CharSequence>)lines, charset, openOptionArray);
        Intrinsics.checkNotNullExpressionValue(path, "write(...)");
        return path;
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final InputStream inputStream(Path $this$inputStream, OpenOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        InputStream inputStream = Files.newInputStream($this$inputStream, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(inputStream, "newInputStream(...)");
        return inputStream;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final void forEachLine(Path $this$forEachLine, Charset charset, Function1<? super String, Unit> action) throws IOException {
        Intrinsics.checkNotNullParameter($this$forEachLine, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReader = Files.newBufferedReader($this$forEachLine, charset);
        Intrinsics.checkNotNullExpressionValue(bufferedReader, "newBufferedReader(...)");
        Reader $this$useLines$iv = bufferedReader;
        boolean $i$f$useLines = false;
        Closeable closeable = $this$useLines$iv;
        closeable = (BufferedReader)closeable;
        Throwable throwable = null;
        try {
            BufferedReader it$iv = (BufferedReader)closeable;
            boolean bl = false;
            Sequence<String> it = TextStreamsKt.lineSequence(it$iv);
            boolean bl2 = false;
            Sequence<String> $this$forEach$iv = it;
            boolean $i$f$forEach = false;
            Iterator<String> iterator2 = $this$forEach$iv.iterator();
            while (iterator2.hasNext()) {
                void var14_17;
                String element$iv = iterator2.next();
                action.invoke((String)var14_17);
            }
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            try {
                throwable = throwable2;
                throw throwable2;
            }
            catch (Throwable throwable3) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(closeable, throwable);
                } else if (throwable == null) {
                    closeable.close();
                } else {
                    try {
                        closeable.close();
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
            CloseableKt.closeFinally(closeable, throwable);
        } else {
            closeable.close();
        }
        InlineMarker.finallyEnd(1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @NotNull
    public static final String readText(@NotNull Path $this$readText, @NotNull Charset charset) throws IOException {
        String string;
        Intrinsics.checkNotNullParameter($this$readText, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Object object = $this$readText;
        Object object2 = new OpenOption[]{};
        object = new InputStreamReader(Files.newInputStream((Path)object, Arrays.copyOf(object2, ((OpenOption[])object2).length)), charset);
        object2 = null;
        try {
            InputStreamReader it = (InputStreamReader)object;
            boolean bl = false;
            string = TextStreamsKt.readText(it);
        }
        catch (Throwable throwable) {
            object2 = throwable;
            throw throwable;
        }
        finally {
            CloseableKt.closeFinally((Closeable)object, (Throwable)object2);
        }
        return string;
    }

    static /* synthetic */ Path writeLines$default(Path $this$writeLines_u24default, Iterable lines, Charset charset, OpenOption[] options, int n, Object object) throws IOException {
        if ((n & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$writeLines_u24default, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        Path path = Files.write($this$writeLines_u24default, (Iterable<? extends CharSequence>)lines, charset, Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(path, "write(...)");
        return path;
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final BufferedWriter bufferedWriter(Path $this$bufferedWriter, Charset charset, int bufferSize, OpenOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$bufferedWriter, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(options, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream($this$bufferedWriter, Arrays.copyOf(options, options.length)), charset), bufferSize);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @InlineOnly
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    private static final <T> T useLines(Path $this$useLines, Charset charset, Function1<? super Sequence<String>, ? extends T> block) throws IOException {
        T t;
        Intrinsics.checkNotNullParameter($this$useLines, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        Closeable closeable = Files.newBufferedReader($this$useLines, charset);
        Throwable throwable = null;
        try {
            BufferedReader it = (BufferedReader)closeable;
            boolean bl = false;
            Intrinsics.checkNotNull(it);
            t = block.invoke(TextStreamsKt.lineSequence(it));
        }
        catch (Throwable throwable2) {
            try {
                throwable = throwable2;
                throw throwable2;
            }
            catch (Throwable throwable3) {
                InlineMarker.finallyStart(1);
                if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
                    CloseableKt.closeFinally(closeable, throwable);
                } else if (closeable != null) {
                    if (throwable == null) {
                        closeable.close();
                    } else {
                        try {
                            closeable.close();
                        }
                        catch (Throwable throwable4) {
                        }
                    }
                }
                InlineMarker.finallyEnd(1);
                throw throwable3;
            }
        }
        InlineMarker.finallyStart(1);
        if (PlatformImplementationsKt.apiVersionIsAtLeast(1, 1, 0)) {
            CloseableKt.closeFinally(closeable, throwable);
        } else if (closeable != null) {
            closeable.close();
        }
        InlineMarker.finallyEnd(1);
        return t;
    }

    public static /* synthetic */ String readText$default(Path path, Charset charset, int n, Object object) throws IOException {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return PathsKt.readText(path, charset);
    }

    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final void writeBytes(Path $this$writeBytes, byte[] array, OpenOption ... options) throws IOException {
        Intrinsics.checkNotNullParameter($this$writeBytes, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(options, "options");
        Files.write($this$writeBytes, array, Arrays.copyOf(options, options.length));
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalPathApi.class})
    @InlineOnly
    private static final byte[] readBytes(Path $this$readBytes) throws IOException {
        Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
        byte[] byArray = Files.readAllBytes($this$readBytes);
        Intrinsics.checkNotNullExpressionValue(byArray, "readAllBytes(...)");
        return byArray;
    }

    static /* synthetic */ Path appendLines$default(Path $this$appendLines_u24default, Sequence lines, Charset charset, int n, Object openOptionArray) throws IOException {
        if ((n & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$appendLines_u24default, "<this>");
        Intrinsics.checkNotNullParameter(lines, "lines");
        Intrinsics.checkNotNullParameter(charset, "charset");
        openOptionArray = new OpenOption[1];
        openOptionArray[0] = StandardOpenOption.APPEND;
        Path path = Files.write($this$appendLines_u24default, SequencesKt.asIterable(lines), charset, openOptionArray);
        Intrinsics.checkNotNullExpressionValue(path, "write(...)");
        return path;
    }
}

