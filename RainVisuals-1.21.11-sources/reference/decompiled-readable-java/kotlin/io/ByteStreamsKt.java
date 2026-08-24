/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.collections.ByteIterator;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0004\u001a\u00020\u0007*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\b\u001a\u001e\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0013\u001a\u00020\u0012*\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0017\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u001a\u001a\u00020\u0012*\u00020\u0019H\u0087\b\u00a2\u0006\u0004\b\u001a\u0010\u001b\u001a$\u0010\u001a\u001a\u00020\u0012*\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0087\b\u00a2\u0006\u0004\b\u001a\u0010\u001e\u001a\u0014\u0010 \u001a\u00020\u001f*\u00020\u0003H\u0086\u0002\u00a2\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0019*\u00020\u0000H\u0007\u00a2\u0006\u0004\b\"\u0010#\u001a\u001d\u0010\"\u001a\u00020\u0019*\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\b\"\u0010%\u001a\u001e\u0010'\u001a\u00020&*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b'\u0010(\u001a\u001e\u0010*\u001a\u00020)*\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0087\b\u00a2\u0006\u0004\b*\u0010+\u00a8\u0006,"}, d2={"Ljava/io/InputStream;", "", "bufferSize", "Ljava/io/BufferedInputStream;", "buffered", "(Ljava/io/InputStream;I)Ljava/io/BufferedInputStream;", "Ljava/io/OutputStream;", "Ljava/io/BufferedOutputStream;", "(Ljava/io/OutputStream;I)Ljava/io/BufferedOutputStream;", "Ljava/nio/charset/Charset;", "charset", "Ljava/io/BufferedReader;", "bufferedReader", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/io/BufferedReader;", "Ljava/io/BufferedWriter;", "bufferedWriter", "(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)Ljava/io/BufferedWriter;", "", "Ljava/io/ByteArrayInputStream;", "byteInputStream", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/io/ByteArrayInputStream;", "out", "", "copyTo", "(Ljava/io/InputStream;Ljava/io/OutputStream;I)J", "", "inputStream", "([B)Ljava/io/ByteArrayInputStream;", "offset", "length", "([BII)Ljava/io/ByteArrayInputStream;", "Lkotlin/collections/ByteIterator;", "iterator", "(Ljava/io/BufferedInputStream;)Lkotlin/collections/ByteIterator;", "readBytes", "(Ljava/io/InputStream;)[B", "estimatedSize", "(Ljava/io/InputStream;I)[B", "Ljava/io/InputStreamReader;", "reader", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/io/InputStreamReader;", "Ljava/io/OutputStreamWriter;", "writer", "(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)Ljava/io/OutputStreamWriter;", "kotlin-stdlib"})
@JvmName(name="ByteStreamsKt")
public final class ByteStreamsKt {
    @InlineOnly
    private static final ByteArrayInputStream inputStream(byte[] $this$inputStream, int offset, int length) {
        Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
        return new ByteArrayInputStream($this$inputStream, offset, length);
    }

    @InlineOnly
    private static final OutputStreamWriter writer(OutputStream $this$writer, Charset charset) {
        Intrinsics.checkNotNullParameter($this$writer, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter($this$writer, charset);
    }

    /*
     * WARNING - void declaration
     */
    public static final long copyTo(@NotNull InputStream $this$copyTo, @NotNull OutputStream out, int bufferSize) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$copyTo, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long bytesCopied = 0L;
        byte[] buffer = new byte[bufferSize];
        int bytes = $this$copyTo.read(buffer);
        while (bytes >= 0) {
            out.write(buffer, 0, bytes);
            bytesCopied += (long)bytes;
            bytes = $this$copyTo.read(buffer);
        }
        return (long)var3_3;
    }

    @InlineOnly
    private static final ByteArrayInputStream byteInputStream(String $this$byteInputStream, Charset charset) {
        Intrinsics.checkNotNullParameter($this$byteInputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] byArray = $this$byteInputStream.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        return new ByteArrayInputStream(byArray);
    }

    static /* synthetic */ BufferedInputStream buffered$default(InputStream $this$buffered_u24default, int bufferSize, int n, Object object) {
        if ((n & 1) != 0) {
            bufferSize = 8192;
        }
        Intrinsics.checkNotNullParameter($this$buffered_u24default, "<this>");
        return $this$buffered_u24default instanceof BufferedInputStream ? (BufferedInputStream)$this$buffered_u24default : new BufferedInputStream($this$buffered_u24default, bufferSize);
    }

    public static /* synthetic */ long copyTo$default(InputStream inputStream, OutputStream outputStream, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 8192;
        }
        return ByteStreamsKt.copyTo(inputStream, outputStream, n);
    }

    @InlineOnly
    private static final BufferedInputStream buffered(InputStream $this$buffered, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$buffered, "<this>");
        return $this$buffered instanceof BufferedInputStream ? (BufferedInputStream)$this$buffered : new BufferedInputStream($this$buffered, bufferSize);
    }

    @SinceKotlin(version="1.3")
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream $this$readBytes) {
        Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(8192, $this$readBytes.available()));
        ByteStreamsKt.copyTo$default($this$readBytes, buffer, 0, 2, null);
        byte[] byArray = buffer.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byArray, "toByteArray(...)");
        return byArray;
    }

    @InlineOnly
    private static final InputStreamReader reader(InputStream $this$reader, Charset charset) {
        Intrinsics.checkNotNullParameter($this$reader, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader($this$reader, charset);
    }

    static /* synthetic */ BufferedOutputStream buffered$default(OutputStream $this$buffered_u24default, int bufferSize, int n, Object object) {
        if ((n & 1) != 0) {
            bufferSize = 8192;
        }
        Intrinsics.checkNotNullParameter($this$buffered_u24default, "<this>");
        return $this$buffered_u24default instanceof BufferedOutputStream ? (BufferedOutputStream)$this$buffered_u24default : new BufferedOutputStream($this$buffered_u24default, bufferSize);
    }

    @InlineOnly
    private static final BufferedWriter bufferedWriter(OutputStream $this$bufferedWriter, Charset charset) {
        Intrinsics.checkNotNullParameter($this$bufferedWriter, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer writer = new OutputStreamWriter($this$bufferedWriter, charset);
        int n = 8192;
        return writer instanceof BufferedWriter ? (BufferedWriter)writer : new BufferedWriter(writer, n);
    }

    @InlineOnly
    private static final BufferedReader bufferedReader(InputStream $this$bufferedReader, Charset charset) {
        Intrinsics.checkNotNullParameter($this$bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Reader reader = new InputStreamReader($this$bufferedReader, charset);
        int n = 8192;
        return reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader, n);
    }

    static /* synthetic */ BufferedWriter bufferedWriter$default(OutputStream $this$bufferedWriter_u24default, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$bufferedWriter_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Writer writer = new OutputStreamWriter($this$bufferedWriter_u24default, charset);
        int n2 = 8192;
        return writer instanceof BufferedWriter ? (BufferedWriter)writer : new BufferedWriter(writer, n2);
    }

    static /* synthetic */ OutputStreamWriter writer$default(OutputStream $this$writer_u24default, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$writer_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter($this$writer_u24default, charset);
    }

    static /* synthetic */ BufferedReader bufferedReader$default(InputStream $this$bufferedReader_u24default, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$bufferedReader_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Reader reader = new InputStreamReader($this$bufferedReader_u24default, charset);
        int n2 = 8192;
        return reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader, n2);
    }

    @InlineOnly
    private static final BufferedOutputStream buffered(OutputStream $this$buffered, int bufferSize) {
        Intrinsics.checkNotNullParameter($this$buffered, "<this>");
        return $this$buffered instanceof BufferedOutputStream ? (BufferedOutputStream)$this$buffered : new BufferedOutputStream($this$buffered, bufferSize);
    }

    public static /* synthetic */ byte[] readBytes$default(InputStream inputStream, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            n = 8192;
        }
        return ByteStreamsKt.readBytes(inputStream, n);
    }

    @NotNull
    public static final ByteIterator iterator(@NotNull BufferedInputStream $this$iterator) {
        Intrinsics.checkNotNullParameter($this$iterator, "<this>");
        return new ByteIterator($this$iterator){
            private boolean finished;
            final /* synthetic */ BufferedInputStream $this_iterator;
            private int nextByte;
            private boolean nextPrepared;

            public final void setNextByte(int n) {
                this.nextByte = n;
            }

            public boolean hasNext() {
                this.prepareNext();
                return !this.finished;
            }

            /*
             * WARNING - void declaration
             */
            public byte nextByte() {
                void var1_1;
                this.prepareNext();
                if (this.finished) {
                    throw new NoSuchElementException("Input stream is over.");
                }
                byte res = (byte)this.nextByte;
                this.nextPrepared = false;
                return (byte)var1_1;
            }

            private final void prepareNext() {
                if (!this.nextPrepared && !this.finished) {
                    this.nextByte = this.$this_iterator.read();
                    this.nextPrepared = true;
                    this.finished = this.nextByte == -1;
                }
            }

            public final boolean getFinished() {
                return this.finished;
            }

            public final void setNextPrepared(boolean bl) {
                this.nextPrepared = bl;
            }
            {
                this.$this_iterator = $receiver;
                this.nextByte = -1;
            }

            public final void setFinished(boolean bl) {
                this.finished = bl;
            }

            public final boolean getNextPrepared() {
                return this.nextPrepared;
            }

            public final int getNextByte() {
                return this.nextByte;
            }
        };
    }

    static /* synthetic */ ByteArrayInputStream byteInputStream$default(String $this$byteInputStream_u24default, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$byteInputStream_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] byArray = $this$byteInputStream_u24default.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        return new ByteArrayInputStream(byArray);
    }

    static /* synthetic */ InputStreamReader reader$default(InputStream $this$reader_u24default, Charset charset, int n, Object object) {
        if ((n & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter($this$reader_u24default, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader($this$reader_u24default, charset);
    }

    @DeprecatedSinceKotlin(warningSince="1.3", errorSince="1.5")
    @Deprecated(message="Use readBytes() overload without estimatedSize parameter", replaceWith=@ReplaceWith(expression="readBytes()", imports={}))
    @NotNull
    public static final byte[] readBytes(@NotNull InputStream $this$readBytes, int estimatedSize) {
        Intrinsics.checkNotNullParameter($this$readBytes, "<this>");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream(Math.max(estimatedSize, $this$readBytes.available()));
        ByteStreamsKt.copyTo$default($this$readBytes, buffer, 0, 2, null);
        byte[] byArray = buffer.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byArray, "toByteArray(...)");
        return byArray;
    }

    @InlineOnly
    private static final ByteArrayInputStream inputStream(byte[] $this$inputStream) {
        Intrinsics.checkNotNullParameter($this$inputStream, "<this>");
        return new ByteArrayInputStream($this$inputStream);
    }
}

