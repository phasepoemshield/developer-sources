/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00100\u001a\u00060.j\u0002`/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101\u00a8\u00062"}, d2={"Lkotlin/io/LineReader;", "", "<init>", "()V", "", "compactBytes", "()I", "", "endOfInput", "decode", "(Z)I", "nBytes", "nChars", "decodeEndOfInput", "(II)I", "Ljava/io/InputStream;", "inputStream", "Ljava/nio/charset/Charset;", "charset", "", "readLine", "(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;", "", "resetAll", "trimStringBuilder", "updateCharset", "(Ljava/nio/charset/Charset;)V", "BUFFER_SIZE", "I", "Ljava/nio/ByteBuffer;", "byteBuf", "Ljava/nio/ByteBuffer;", "", "bytes", "[B", "Ljava/nio/CharBuffer;", "charBuf", "Ljava/nio/CharBuffer;", "", "chars", "[C", "Ljava/nio/charset/CharsetDecoder;", "decoder", "Ljava/nio/charset/CharsetDecoder;", "directEOL", "Z", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Ljava/lang/StringBuilder;", "kotlin-stdlib"})
public final class LineReader {
    @NotNull
    public static final LineReader INSTANCE = new LineReader();
    @NotNull
    private static final CharBuffer charBuf;
    private static CharsetDecoder decoder;
    @NotNull
    private static final byte[] bytes;
    private static boolean directEOL;
    @NotNull
    private static final StringBuilder sb;
    @NotNull
    private static final ByteBuffer byteBuf;
    @NotNull
    private static final char[] chars;
    private static final int BUFFER_SIZE = 32;

    private final int decodeEndOfInput(int nBytes, int nChars) {
        byteBuf.limit(nBytes);
        charBuf.position(nChars);
        int n = this.decode(true);
        int it = n;
        boolean bl = false;
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        return n;
    }

    private final int compactBytes() {
        int n;
        ByteBuffer byteBuffer;
        ByteBuffer $this$compactBytes_u24lambda_u241 = byteBuffer = byteBuf;
        boolean bl = false;
        $this$compactBytes_u24lambda_u241.compact();
        int it = n = $this$compactBytes_u24lambda_u241.position();
        boolean bl2 = false;
        $this$compactBytes_u24lambda_u241.position(0);
        return n;
    }

    /*
     * WARNING - void declaration
     */
    private final int decode(boolean endOfInput) {
        while (true) {
            void var3_3;
            CoderResult coderResult;
            CharsetDecoder charsetDecoder;
            if ((charsetDecoder = decoder) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decoder");
                charsetDecoder = null;
            }
            Intrinsics.checkNotNullExpressionValue(charsetDecoder.decode(byteBuf, charBuf, endOfInput), "decode(...)");
            if (coderResult.isError()) {
                this.resetAll();
                coderResult.throwException();
            }
            int nChars = charBuf.position();
            if (!coderResult.isOverflow()) {
                return nChars;
            }
            sb.append(chars, 0, nChars + -1);
            charBuf.position(0);
            charBuf.limit(32);
            charBuf.put(chars[var3_3 + -1]);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public final synchronized String readLine(@NotNull InputStream inputStream, @NotNull Charset charset) {
        void var5_6;
        block18: {
            block17: {
                Intrinsics.checkNotNullParameter(inputStream, "inputStream");
                Intrinsics.checkNotNullParameter(charset, "charset");
                if (decoder == null) break block17;
                CharsetDecoder charsetDecoder = decoder;
                if (charsetDecoder == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("decoder");
                    charsetDecoder = null;
                }
                if (Intrinsics.areEqual(charsetDecoder.charset(), charset)) break block18;
            }
            this.updateCharset(charset);
        }
        int nBytes = 0;
        int nChars = 0;
        while (true) {
            int readByte = inputStream.read();
            if (readByte == -1) {
                boolean bl = ((CharSequence)sb).length() == 0;
                if (bl) {
                    if (nBytes == 0 && nChars == 0) {
                        return null;
                    }
                }
                nChars = this.decodeEndOfInput(nBytes, nChars);
                break;
            }
            LineReader.bytes[nBytes++] = (byte)readByte;
            if (readByte != 10) {
                if (nBytes != 32) {
                    if (directEOL) continue;
                }
            }
            byteBuf.limit(nBytes);
            charBuf.position(nChars);
            nChars = this.decode(false);
            if (nChars > 0) {
                if (chars[nChars - 1] == '\n') {
                    byteBuf.position(0);
                    break;
                }
            }
            nBytes = this.compactBytes();
        }
        if (nChars > 0) {
            if (chars[nChars - 1] == '\n' && --nChars > 0) {
                if (chars[nChars - 1] == '\r') {
                    --nChars;
                }
            }
        }
        boolean bl = ((CharSequence)sb).length() == 0;
        if (bl) {
            return new String(chars, 0, nChars);
        }
        sb.append(chars, 0, nChars);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String result = string;
        if (sb.length() > 32) {
            this.trimStringBuilder();
        }
        sb.setLength(0);
        return var5_6;
    }

    private final void trimStringBuilder() {
        sb.setLength(32);
        sb.trimToSize();
    }

    private final void resetAll() {
        CharsetDecoder charsetDecoder = decoder;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuf.position(0);
        sb.setLength(0);
    }

    static {
        bytes = new byte[32];
        chars = new char[32];
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "wrap(...)");
        byteBuf = byteBuffer;
        CharBuffer charBuffer = CharBuffer.wrap(chars);
        Intrinsics.checkNotNullExpressionValue(charBuffer, "wrap(...)");
        charBuf = charBuffer;
        sb = new StringBuilder();
    }

    private LineReader() {
    }

    /*
     * Unable to fully structure code
     */
    private final void updateCharset(Charset charset) {
        v0 = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(v0, "newDecoder(...)");
        LineReader.decoder = v0;
        LineReader.byteBuf.clear();
        LineReader.charBuf.clear();
        LineReader.byteBuf.put((byte)10);
        LineReader.byteBuf.flip();
        v1 = LineReader.decoder;
        if (v1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            v1 = null;
        }
        v1.decode(LineReader.byteBuf, LineReader.charBuf, false);
        if (LineReader.charBuf.position() != 1) ** GOTO lbl-1000
        if (LineReader.charBuf.get(0) == '\n') {
            v2 = true;
        } else lbl-1000:
        // 2 sources

        {
            v2 = false;
        }
        LineReader.directEOL = v2;
        this.resetAll();
    }
}

