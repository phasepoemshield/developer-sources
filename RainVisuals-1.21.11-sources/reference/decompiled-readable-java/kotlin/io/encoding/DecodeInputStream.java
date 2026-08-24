/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io.encoding;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.io.encoding.Base64;
import kotlin.io.encoding.Base64Kt;
import kotlin.io.encoding.ExperimentalEncodingApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u0017\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u001e\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0018R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010#R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0002\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010!R\u0014\u0010-\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010!\u00a8\u0006."}, d2={"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "Lkotlin/io/encoding/Base64;", "base64", "<init>", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "", "close", "()V", "", "dst", "", "dstOffset", "length", "copyByteBufferInto", "([BII)V", "dstEndIndex", "symbolBufferLength", "decodeSymbolBufferInto", "([BIII)I", "handlePaddingSymbol", "(I)I", "read", "()I", "destination", "offset", "([BII)I", "readNextSymbol", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "Lkotlin/io/encoding/Base64;", "byteBuffer", "[B", "byteBufferEndIndex", "I", "getByteBufferLength", "byteBufferLength", "byteBufferStartIndex", "Ljava/io/InputStream;", "", "isClosed", "Z", "isEOF", "singleByteBuffer", "symbolBuffer", "kotlin-stdlib"})
@ExperimentalEncodingApi
final class DecodeInputStream
extends InputStream {
    private int byteBufferEndIndex;
    @NotNull
    private final Base64 base64;
    @NotNull
    private final byte[] symbolBuffer;
    @NotNull
    private final byte[] byteBuffer;
    private int byteBufferStartIndex;
    private boolean isEOF;
    @NotNull
    private final InputStream input;
    @NotNull
    private final byte[] singleByteBuffer;
    private boolean isClosed;

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final int readNextSymbol() {
        void var1_1;
        if (!this.base64.isMimeScheme$kotlin_stdlib()) {
            return this.input.read();
        }
        int read = 0;
        do {
            read = this.input.read();
        } while (read != -1 && !Base64Kt.isInMimeAlphabet(read));
        return (int)var1_1;
    }

    @Override
    public int read(@NotNull byte[] destination, int offset, int length) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (offset < 0 || length < 0 || offset + length > destination.length) {
            throw new IndexOutOfBoundsException("offset: " + offset + ", length: " + length + ", buffer size: " + destination.length);
        }
        if (this.isClosed) {
            throw new IOException("The input stream is closed.");
        }
        if (this.isEOF) {
            return -1;
        }
        if (length == 0) {
            return 0;
        }
        if (this.getByteBufferLength() >= length) {
            this.copyByteBufferInto(destination, offset, length);
            return length;
        }
        int bytesNeeded = length - this.getByteBufferLength();
        int groupsNeeded = (bytesNeeded + 3 - 1) / 3;
        int symbolsNeeded = groupsNeeded * 4;
        int dstOffset = offset;
        while (!this.isEOF && symbolsNeeded > 0) {
            boolean bl;
            int symbolBufferLength = 0;
            int symbolsToRead = Math.min(this.symbolBuffer.length, symbolsNeeded);
            block5: while (!this.isEOF && symbolBufferLength < symbolsToRead) {
                int symbol = this.readNextSymbol();
                switch (symbol) {
                    case -1: {
                        this.isEOF = true;
                        continue block5;
                    }
                    case 61: {
                        symbolBufferLength = this.handlePaddingSymbol(symbolBufferLength);
                        this.isEOF = true;
                        continue block5;
                    }
                }
                this.symbolBuffer[symbolBufferLength] = (byte)symbol;
                ++symbolBufferLength;
            }
            boolean bl2 = bl = this.isEOF || symbolBufferLength == symbolsToRead;
            if (!bl) {
                String string = "Check failed.";
                throw new IllegalStateException(string.toString());
            }
            symbolsNeeded -= symbolBufferLength;
            dstOffset += this.decodeSymbolBufferInto(destination, dstOffset, length + offset, symbolBufferLength);
        }
        return dstOffset == offset && this.isEOF ? -1 : dstOffset - offset;
    }

    @Override
    public void close() {
        if (!this.isClosed) {
            this.isClosed = true;
            this.input.close();
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        int byteBufferCapacity = this.byteBuffer.length - this.byteBufferEndIndex;
        int symbolBufferCapacity = this.symbolBuffer.length / 4 * 3;
        if (symbolBufferCapacity > byteBufferCapacity) {
            ArraysKt.copyInto(this.byteBuffer, this.byteBuffer, 0, this.byteBufferStartIndex, this.byteBufferEndIndex);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    public DecodeInputStream(@NotNull InputStream input, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(base64, "base64");
        this.input = input;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    @Override
    public int read() {
        int n;
        if (this.byteBufferStartIndex < this.byteBufferEndIndex) {
            int n2 = this.byteBuffer[this.byteBufferStartIndex] & 0xFF;
            ++this.byteBufferStartIndex;
            this.resetByteBufferIfEmpty();
            return n2;
        }
        switch (this.read(this.singleByteBuffer, 0, 1)) {
            case -1: {
                n = -1;
                break;
            }
            case 1: {
                n = this.singleByteBuffer[0] & 0xFF;
                break;
            }
            default: {
                throw new IllegalStateException("Unreachable".toString());
            }
        }
        return n;
    }

    private final int decodeSymbolBufferInto(byte[] dst, int dstOffset, int dstEndIndex, int symbolBufferLength) {
        this.byteBufferEndIndex += this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, this.byteBufferEndIndex, 0, symbolBufferLength);
        int bytesToCopy = Math.min(this.getByteBufferLength(), dstEndIndex - dstOffset);
        this.copyByteBufferInto(dst, dstOffset, bytesToCopy);
        this.shiftByteBufferToStartIfNeeded();
        return bytesToCopy;
    }

    /*
     * WARNING - void declaration
     */
    private final int handlePaddingSymbol(int symbolBufferLength) {
        int n;
        this.symbolBuffer[symbolBufferLength] = 61;
        if ((symbolBufferLength & 3) == 2) {
            int secondPad = this.readNextSymbol();
            if (secondPad >= 0) {
                this.symbolBuffer[symbolBufferLength + 1] = (byte)secondPad;
            }
            n = symbolBufferLength + 2;
        } else {
            void var1_1;
            n = var1_1 + true;
        }
        return n;
    }

    private final void copyByteBufferInto(byte[] dst, int dstOffset, int length) {
        ArraysKt.copyInto(this.byteBuffer, dst, dstOffset, this.byteBufferStartIndex, this.byteBufferStartIndex + length);
        this.byteBufferStartIndex += length;
        this.resetByteBufferIfEmpty();
    }
}

