/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.LinesSequence;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0004\u001a\u00020\u0007*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\b\u001a#\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0011\u001a\u00020\u000f*\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a*\u00020\u0000\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001d\u001a\u00020\u000e*\u00020\u0000\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001a\u001e\u0010\u001d\u001a\u00020\u000e*\u00020\u00162\b\b\u0002\u0010 \u001a\u00020\u001fH\u0087\b\u00a2\u0006\u0004\b\u001d\u0010!\u001a\u0014\u0010#\u001a\u00020\"*\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b#\u0010$\u001a7\u0010'\u001a\u00028\u0000\"\u0004\b\u0000\u0010%*\u00020\u00002\u0018\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0013\u0012\u0004\u0012\u00028\u00000\rH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006)"}, d2={"Ljava/io/Reader;", "", "bufferSize", "Ljava/io/BufferedReader;", "buffered", "(Ljava/io/Reader;I)Ljava/io/BufferedReader;", "Ljava/io/Writer;", "Ljava/io/BufferedWriter;", "(Ljava/io/Writer;I)Ljava/io/BufferedWriter;", "out", "", "copyTo", "(Ljava/io/Reader;Ljava/io/Writer;I)J", "Lkotlin/Function1;", "", "", "action", "forEachLine", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/sequences/Sequence;", "lineSequence", "(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;", "Ljava/net/URL;", "", "readBytes", "(Ljava/net/URL;)[B", "", "readLines", "(Ljava/io/Reader;)Ljava/util/List;", "readText", "(Ljava/io/Reader;)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "(Ljava/net/URL;Ljava/nio/charset/Charset;)Ljava/lang/String;", "Ljava/io/StringReader;", "reader", "(Ljava/lang/String;)Ljava/io/StringReader;", "T", "block", "useLines", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"})
@JvmName(name="TextStreamsKt")
public final class TextStreamsKt {
    @InlineOnly
    private static final StringReader reader(String $this$reader) {
        Intrinsics.checkNotNullParameter($this$reader, "<this>");
        return new StringReader($this$reader);
    }

    static /* synthetic */ BufferedReader buffered$default(Reader $this$buffered_u24default, int bufferSize, int n, Object object) {
        if ((n & 1) != 0) {
            bufferSize = 8192;
        }
        Intrinsics.checkNotNullParameter($this$buffered_u24default, "<this>");
        return $this$buffered_u24default instanceof BufferedReader ? (BufferedReader)$this$buffered_u24default : new BufferedReader($this$buffered_u24default, bufferSize);
    }

    @InlineOnly
    private static final String readText(URL $this$readText, Charset charset) {
        Intrinsics.checkNotNullParameter($this$readText, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] byArray = TextStreamsKt.readBytes($this$readText);
        return new String(byArray, charset);
    }

    @InlineOnly
    private static final BufferedReader buffered(Reader $this$buffered, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$buffered, "<this>");
        return $this$buffered instanceof BufferedReader ? (BufferedReader)$this$buffered : new BufferedReader($this$buffered, bufferSize);
    }

    @NotNull
    public static final String readText(@NotNull Reader $this$readText) {
        Intrinsics.checkNotNullParameter($this$readText, "<this>");
        StringWriter buffer = new StringWriter();
        TextStreamsKt.copyTo$default($this$readText, buffer, 0, 2, null);
        String string = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final <T> T useLines(@NotNull Reader $this$useLines, @NotNull Function1<? super Sequence<String>, ? extends T> block) {
        T t;
        Intrinsics.checkNotNullParameter($this$useLines, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$useLines = false;
        Closeable closeable = $this$useLines;
        int n = 8192;
        closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, n);
        Throwable throwable = null;
        try {
            BufferedReader it = (BufferedReader)closeable;
            boolean bl = false;
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
        return t;
    }

    /*
     * WARNING - void declaration
     */
    public static final long copyTo(@NotNull Reader $this$copyTo, @NotNull Writer out, int bufferSize) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long charsCopied = 0L;
        char[] buffer = new char[bufferSize];
        int chars = $this$copyTo.read(buffer);
        while (chars >= 0) {
            out.write(buffer, 0, chars);
            charsCopied += (long)chars;
            chars = $this$copyTo.read(buffer);
        }
        return (long)var3_3;
    }

    static /* synthetic */ BufferedWriter buffered$default(Writer $this$buffered_u24default, int bufferSize, int n, Object object) {
        if ((n & 1) != 0) {
            bufferSize = 8192;
        }
        Intrinsics.checkNotNullParameter($this$buffered_u24default, "<this>");
        return $this$buffered_u24default instanceof BufferedWriter ? (BufferedWriter)$this$buffered_u24default : new BufferedWriter($this$buffered_u24default, bufferSize);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void forEachLine(@NotNull Reader $this$forEachLine, @NotNull Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEachLine, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Reader $this$useLines$iv = $this$forEachLine;
        boolean $i$f$useLines = false;
        Closeable closeable = $this$useLines$iv;
        int n = 8192;
        closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, n);
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
                String element$iv = iterator2.next();
                action.invoke(element$iv);
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @NotNull
    public static final byte[] readBytes(@NotNull URL $this$readBytes) {
        byte[] byArray;
        Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
        Closeable closeable = $this$readBytes.openStream();
        Throwable throwable = null;
        try {
            InputStream it = (InputStream)closeable;
            boolean bl = false;
            Intrinsics.checkNotNull(it);
            byArray = ByteStreamsKt.readBytes((InputStream)byArray);
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

    @InlineOnly
    private static final BufferedWriter buffered(Writer $this$buffered, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$buffered, "<this>");
        return $this$buffered instanceof BufferedWriter ? (BufferedWriter)$this$buffered : new BufferedWriter($this$buffered, bufferSize);
    }

    public static /* synthetic */ long copyTo$default(Reader reader, Writer writer, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 8192;
        }
        return TextStreamsKt.copyTo(reader, writer, n);
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ String readText$default(URL $this$readText_u24default, Charset charset, int n, Object object) {
        void var1_1;
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$readText_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] byArray = TextStreamsKt.readBytes($this$readText_u24default);
        return new String(byArray, (Charset)var1_1);
    }

    @NotNull
    public static final List<String> readLines(@NotNull Reader $this$readLines) {
        Intrinsics.checkNotNullParameter($this$readLines, "<this>");
        ArrayList<String> result = new ArrayList<String>();
        TextStreamsKt.forEachLine($this$readLines, (Function1<? super String, Unit>)new Function1<String, Unit>(result){
            final /* synthetic */ ArrayList<String> $result;

            public final void invoke(@NotNull String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.$result.add(it);
            }
            {
                this.$result = $result;
                super(1);
            }
        });
        return result;
    }

    @NotNull
    public static final Sequence<String> lineSequence(@NotNull BufferedReader $this$lineSequence) {
        Intrinsics.checkNotNullParameter($this$lineSequence, "<this>");
        return SequencesKt.constrainOnce(new LinesSequence($this$lineSequence));
    }
}

