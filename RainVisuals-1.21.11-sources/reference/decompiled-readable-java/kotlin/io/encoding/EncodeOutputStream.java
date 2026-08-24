/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.Base64;
import kotlin.io.encoding.ExperimentalEncodingApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\n\u0010\tJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u0012\u0010\tJ'\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\u0014\u0010\tJ'\u0010\u0017\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0002\u0010$R\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010\u001d\u00a8\u0006&"}, d2={"Lkotlin/io/encoding/EncodeOutputStream;", "Ljava/io/OutputStream;", "output", "Lkotlin/io/encoding/Base64;", "base64", "<init>", "(Ljava/io/OutputStream;Lkotlin/io/encoding/Base64;)V", "", "checkOpen", "()V", "close", "", "source", "", "startIndex", "endIndex", "copyIntoByteBuffer", "([BII)I", "encodeByteBufferIntoOutput", "encodeIntoOutput", "flush", "offset", "length", "write", "([BII)V", "b", "(I)V", "Lkotlin/io/encoding/Base64;", "byteBuffer", "[B", "byteBufferLength", "I", "", "isClosed", "Z", "lineLength", "Ljava/io/OutputStream;", "symbolBuffer", "kotlin-stdlib"})
@ExperimentalEncodingApi
final class EncodeOutputStream
extends OutputStream {
    @NotNull
    private final byte[] symbolBuffer;
    private boolean isClosed;
    private int lineLength;
    private int byteBufferLength;
    @NotNull
    private final Base64 base64;
    @NotNull
    private final byte[] byteBuffer;
    @NotNull
    private final OutputStream output;

    public EncodeOutputStream(@NotNull OutputStream output, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.output = output;
        this.base64 = base64;
        this.lineLength = this.base64.isMimeScheme$kotlin_stdlib() ? 76 : -1;
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[3];
    }

    private final void encodeByteBufferIntoOutput() {
        int symbolsEncoded = this.encodeIntoOutput(this.byteBuffer, 0, this.byteBufferLength);
        boolean bl = symbolsEncoded == 4;
        if (!bl) {
            String string = "Check failed.";
            throw new IllegalStateException(string.toString());
        }
        this.byteBufferLength = 0;
    }

    /*
     * WARNING - void declaration
     */
    private final int copyIntoByteBuffer(byte[] source, int startIndex, int endIndex) {
        void var4_4;
        int bytesToCopy = Math.min(3 - this.byteBufferLength, endIndex - startIndex);
        ArraysKt.copyInto(source, this.byteBuffer, this.byteBufferLength, startIndex, startIndex + bytesToCopy);
        this.byteBufferLength += bytesToCopy;
        if (this.byteBufferLength == 3) {
            this.encodeByteBufferIntoOutput();
        }
        return (int)var4_4;
    }

    /*
     * WARNING - void declaration
     */
    private final int encodeIntoOutput(byte[] source, int startIndex, int endIndex) {
        void var4_4;
        int symbolsEncoded = this.base64.encodeIntoByteArray(source, this.symbolBuffer, 0, startIndex, endIndex);
        if (this.lineLength == 0) {
            this.output.write(Base64.Default.getMimeLineSeparatorSymbols$kotlin_stdlib());
            this.lineLength = 76;
            boolean bl = symbolsEncoded <= 76;
            if (!bl) {
                String string = "Check failed.";
                throw new IllegalStateException(string.toString());
            }
        }
        this.output.write(this.symbolBuffer, 0, symbolsEncoded);
        this.lineLength -= symbolsEncoded;
        return (int)var4_4;
    }

    @Override
    public void flush() {
        this.checkOpen();
        this.output.flush();
    }

    @Override
    public void write(int b2) {
        this.checkOpen();
        int n = this.byteBufferLength;
        this.byteBufferLength = n + 1;
        this.byteBuffer[n] = (byte)b2;
        if (this.byteBufferLength == 3) {
            this.encodeByteBufferIntoOutput();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void write(@NotNull byte[] source, int offset, int length) {
        void var5_6;
        block10: {
            block9: {
                Intrinsics.checkNotNullParameter(source, "source");
                this.checkOpen();
                if (offset < 0) break block9;
                if (length >= 0 && offset + length <= source.length) break block10;
            }
            throw new IndexOutOfBoundsException("offset: " + offset + ", length: " + length + ", source size: " + source.length);
        }
        if (length == 0) {
            return;
        }
        int n = this.byteBufferLength < 3 ? 1 : 0;
        if (n == 0) {
            String string = "Check failed.";
            throw new IllegalStateException(string.toString());
        }
        int startIndex = offset;
        int endIndex = startIndex + length;
        if (this.byteBufferLength != 0) {
            startIndex += this.copyIntoByteBuffer(source, startIndex, endIndex);
            if (this.byteBufferLength != 0) {
                return;
            }
        }
        while (startIndex + 3 <= endIndex) {
            void var8_9;
            int groupCapacity = (this.base64.isMimeScheme$kotlin_stdlib() ? this.lineLength : this.symbolBuffer.length) / 4;
            int groupsToEncode = Math.min(groupCapacity, (endIndex - startIndex) / 3);
            int bytesToEncode = groupsToEncode * 3;
            int symbolsEncoded = this.encodeIntoOutput(source, startIndex, startIndex + bytesToEncode);
            boolean bl = symbolsEncoded == groupsToEncode * 4;
            if (!bl) {
                String string = "Check failed.";
                throw new IllegalStateException(string.toString());
            }
            startIndex += var8_9;
        }
        ArraysKt.copyInto(source, this.byteBuffer, 0, n, (int)var5_6);
        this.byteBufferLength = var5_6 - n;
    }

    @Override
    public void close() {
        if (!this.isClosed) {
            this.isClosed = true;
            if (this.byteBufferLength != 0) {
                this.encodeByteBufferIntoOutput();
            }
            this.output.close();
        }
    }

    private final void checkOpen() {
        if (this.isClosed) {
            throw new IOException("The output stream is closed.");
        }
    }
}

