/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.value.Value
 */
package org.msgpack.core;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.time.Instant;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.value.Value;

public class MessagePacker
implements Closeable,
Flushable {
    private static final boolean CORRUPTED_CHARSET_ENCODER;
    private final int smallStringOptimizationThreshold;
    private final int bufferFlushThreshold;
    private final boolean str8FormatSupport;
    protected MessageBufferOutput out;
    private MessageBuffer buffer;
    private int position;
    private long totalFlushBytes;
    private CharsetEncoder encoder;
    private static final int UTF_8_MAX_CHAR_SIZE = 6;
    private static final long NANOS_PER_SECOND = 1000000000L;

    protected MessagePacker(MessageBufferOutput messageBufferOutput, MessagePack.PackerConfig packerConfig) {
        this.out = Preconditions.checkNotNull(messageBufferOutput, "MessageBufferOutput is null");
        this.smallStringOptimizationThreshold = packerConfig.getSmallStringOptimizationThreshold();
        this.bufferFlushThreshold = packerConfig.getBufferFlushThreshold();
        this.str8FormatSupport = packerConfig.isStr8FormatSupport();
        this.position = 0;
        this.totalFlushBytes = 0L;
    }

    public MessageBufferOutput reset(MessageBufferOutput messageBufferOutput) throws IOException {
        MessageBufferOutput messageBufferOutput2 = Preconditions.checkNotNull(messageBufferOutput, "MessageBufferOutput is null");
        this.flush();
        MessageBufferOutput messageBufferOutput3 = this.out;
        this.out = messageBufferOutput2;
        this.totalFlushBytes = 0L;
        return messageBufferOutput3;
    }

    public long getTotalWrittenBytes() {
        return this.totalFlushBytes + (long)this.position;
    }

    public void clear() {
        this.position = 0;
    }

    @Override
    public void flush() throws IOException {
        if (this.position > 0) {
            this.flushBuffer();
        }
        this.out.flush();
    }

    @Override
    public void close() throws IOException {
        try {
            this.flush();
        }
        finally {
            this.out.close();
        }
    }

    private void flushBuffer() throws IOException {
        this.out.writeBuffer(this.position);
        this.buffer = null;
        this.totalFlushBytes += (long)this.position;
        this.position = 0;
    }

    private void ensureCapacity(int n) throws IOException {
        if (this.buffer == null) {
            this.buffer = this.out.next(n);
        } else if (this.position + n >= this.buffer.size()) {
            this.flushBuffer();
            this.buffer = this.out.next(n);
        }
    }

    private void writeByte(byte by) throws IOException {
        this.ensureCapacity(1);
        this.buffer.putByte(this.position++, by);
    }

    private void writeByteAndByte(byte by, byte by2) throws IOException {
        this.ensureCapacity(2);
        this.buffer.putByte(this.position++, by);
        this.buffer.putByte(this.position++, by2);
    }

    private void writeByteAndShort(byte by, short s) throws IOException {
        this.ensureCapacity(3);
        this.buffer.putByte(this.position++, by);
        this.buffer.putShort(this.position, s);
        this.position += 2;
    }

    private void writeByteAndInt(byte by, int n) throws IOException {
        this.ensureCapacity(5);
        this.buffer.putByte(this.position++, by);
        this.buffer.putInt(this.position, n);
        this.position += 4;
    }

    private void writeByteAndFloat(byte by, float f) throws IOException {
        this.ensureCapacity(5);
        this.buffer.putByte(this.position++, by);
        this.buffer.putFloat(this.position, f);
        this.position += 4;
    }

    private void writeByteAndDouble(byte by, double d) throws IOException {
        this.ensureCapacity(9);
        this.buffer.putByte(this.position++, by);
        this.buffer.putDouble(this.position, d);
        this.position += 8;
    }

    private void writeByteAndLong(byte by, long l) throws IOException {
        this.ensureCapacity(9);
        this.buffer.putByte(this.position++, by);
        this.buffer.putLong(this.position, l);
        this.position += 8;
    }

    private void writeShort(short s) throws IOException {
        this.ensureCapacity(2);
        this.buffer.putShort(this.position, s);
        this.position += 2;
    }

    private void writeInt(int n) throws IOException {
        this.ensureCapacity(4);
        this.buffer.putInt(this.position, n);
        this.position += 4;
    }

    private void writeLong(long l) throws IOException {
        this.ensureCapacity(8);
        this.buffer.putLong(this.position, l);
        this.position += 8;
    }

    public MessagePacker packNil() throws IOException {
        this.writeByte((byte)-64);
        return this;
    }

    public MessagePacker packBoolean(boolean bl) throws IOException {
        this.writeByte(bl ? (byte)-61 : -62);
        return this;
    }

    public MessagePacker packByte(byte by) throws IOException {
        if (by < -32) {
            this.writeByteAndByte((byte)-48, by);
        } else {
            this.writeByte(by);
        }
        return this;
    }

    public MessagePacker packShort(short s) throws IOException {
        if (s < -32) {
            if (s < -128) {
                this.writeByteAndShort((byte)-47, s);
            } else {
                this.writeByteAndByte((byte)-48, (byte)s);
            }
        } else if (s < 128) {
            this.writeByte((byte)s);
        } else if (s < 256) {
            this.writeByteAndByte((byte)-52, (byte)s);
        } else {
            this.writeByteAndShort((byte)-51, s);
        }
        return this;
    }

    public MessagePacker packInt(int n) throws IOException {
        if (n < -32) {
            if (n < Short.MIN_VALUE) {
                this.writeByteAndInt((byte)-46, n);
            } else if (n < -128) {
                this.writeByteAndShort((byte)-47, (short)n);
            } else {
                this.writeByteAndByte((byte)-48, (byte)n);
            }
        } else if (n < 128) {
            this.writeByte((byte)n);
        } else if (n < 256) {
            this.writeByteAndByte((byte)-52, (byte)n);
        } else if (n < 65536) {
            this.writeByteAndShort((byte)-51, (short)n);
        } else {
            this.writeByteAndInt((byte)-50, n);
        }
        return this;
    }

    public MessagePacker packLong(long l) throws IOException {
        if (l < -32L) {
            if (l < -32768L) {
                if (l < Integer.MIN_VALUE) {
                    this.writeByteAndLong((byte)-45, l);
                } else {
                    this.writeByteAndInt((byte)-46, (int)l);
                }
            } else if (l < -128L) {
                this.writeByteAndShort((byte)-47, (short)l);
            } else {
                this.writeByteAndByte((byte)-48, (byte)l);
            }
        } else if (l < 128L) {
            this.writeByte((byte)l);
        } else if (l < 65536L) {
            if (l < 256L) {
                this.writeByteAndByte((byte)-52, (byte)l);
            } else {
                this.writeByteAndShort((byte)-51, (short)l);
            }
        } else if (l < 0x100000000L) {
            this.writeByteAndInt((byte)-50, (int)l);
        } else {
            this.writeByteAndLong((byte)-49, l);
        }
        return this;
    }

    public MessagePacker packBigInteger(BigInteger bigInteger) throws IOException {
        if (bigInteger.bitLength() <= 63) {
            this.packLong(bigInteger.longValue());
        } else if (bigInteger.bitLength() == 64 && bigInteger.signum() == 1) {
            this.writeByteAndLong((byte)-49, bigInteger.longValue());
        } else {
            throw new IllegalArgumentException("MessagePack cannot serialize BigInteger larger than 2^64-1");
        }
        return this;
    }

    public MessagePacker packFloat(float f) throws IOException {
        this.writeByteAndFloat((byte)-54, f);
        return this;
    }

    public MessagePacker packDouble(double d) throws IOException {
        this.writeByteAndDouble((byte)-53, d);
        return this;
    }

    private void packStringWithGetBytes(String string) throws IOException {
        byte[] byArray = string.getBytes(MessagePack.UTF8);
        this.packRawStringHeader(byArray.length);
        this.addPayload(byArray);
    }

    private void prepareEncoder() {
        if (this.encoder == null) {
            this.encoder = MessagePack.UTF8.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        }
        this.encoder.reset();
    }

    private int encodeStringToBufferAt(int n, String string) {
        this.prepareEncoder();
        ByteBuffer byteBuffer = this.buffer.sliceAsByteBuffer(n, this.buffer.size() - n);
        int n2 = byteBuffer.position();
        CharBuffer charBuffer = CharBuffer.wrap(string);
        CoderResult coderResult = this.encoder.encode(charBuffer, byteBuffer, true);
        if (coderResult.isError()) {
            try {
                coderResult.throwException();
            }
            catch (CharacterCodingException characterCodingException) {
                throw new MessageStringCodingException(characterCodingException);
            }
        }
        if (!coderResult.isUnderflow() || coderResult.isOverflow()) {
            return -1;
        }
        coderResult = this.encoder.flush(byteBuffer);
        if (!coderResult.isUnderflow()) {
            return -1;
        }
        return byteBuffer.position() - n2;
    }

    public MessagePacker packString(String string) throws IOException {
        if (string.length() <= 0) {
            this.packRawStringHeader(0);
            return this;
        }
        if (CORRUPTED_CHARSET_ENCODER || string.length() < this.smallStringOptimizationThreshold) {
            this.packStringWithGetBytes(string);
            return this;
        }
        if (string.length() < 256) {
            this.ensureCapacity(2 + string.length() * 6 + 1);
            int n = this.encodeStringToBufferAt(this.position + 2, string);
            if (n >= 0) {
                if (this.str8FormatSupport && n < 256) {
                    this.buffer.putByte(this.position++, (byte)-39);
                    this.buffer.putByte(this.position++, (byte)n);
                    this.position += n;
                } else {
                    if (n >= 65536) {
                        throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                    }
                    this.buffer.putMessageBuffer(this.position + 3, this.buffer, this.position + 2, n);
                    this.buffer.putByte(this.position++, (byte)-38);
                    this.buffer.putShort(this.position, (short)n);
                    this.position += 2;
                    this.position += n;
                }
                return this;
            }
        } else if (string.length() < 65536) {
            this.ensureCapacity(3 + string.length() * 6 + 2);
            int n = this.encodeStringToBufferAt(this.position + 3, string);
            if (n >= 0) {
                if (n < 65536) {
                    this.buffer.putByte(this.position++, (byte)-38);
                    this.buffer.putShort(this.position, (short)n);
                    this.position += 2;
                    this.position += n;
                } else {
                    this.buffer.putMessageBuffer(this.position + 5, this.buffer, this.position + 3, n);
                    this.buffer.putByte(this.position++, (byte)-37);
                    this.buffer.putInt(this.position, n);
                    this.position += 4;
                    this.position += n;
                }
                return this;
            }
        }
        this.packStringWithGetBytes(string);
        return this;
    }

    public MessagePacker packTimestamp(Instant instant) throws IOException {
        return this.packTimestamp(instant.getEpochSecond(), instant.getNano());
    }

    public MessagePacker packTimestamp(long l) throws IOException {
        return this.packTimestamp(Instant.ofEpochMilli(l));
    }

    public MessagePacker packTimestamp(long l, int n) throws IOException, ArithmeticException {
        long l2 = Math.addExact(l, Math.floorDiv((long)n, 1000000000L));
        long l3 = Math.floorMod((long)n, 1000000000L);
        if (l2 >>> 34 == 0L) {
            long l4 = l3 << 34 | l2;
            if ((l4 & 0xFFFFFFFF00000000L) == 0L) {
                this.writeTimestamp32((int)l2);
            } else {
                this.writeTimestamp64(l4);
            }
        } else {
            this.writeTimestamp96(l2, (int)l3);
        }
        return this;
    }

    private void writeTimestamp32(int n) throws IOException {
        this.ensureCapacity(6);
        this.buffer.putByte(this.position++, (byte)-42);
        this.buffer.putByte(this.position++, (byte)-1);
        this.buffer.putInt(this.position, n);
        this.position += 4;
    }

    private void writeTimestamp64(long l) throws IOException {
        this.ensureCapacity(10);
        this.buffer.putByte(this.position++, (byte)-41);
        this.buffer.putByte(this.position++, (byte)-1);
        this.buffer.putLong(this.position, l);
        this.position += 8;
    }

    private void writeTimestamp96(long l, int n) throws IOException {
        this.ensureCapacity(15);
        this.buffer.putByte(this.position++, (byte)-57);
        this.buffer.putByte(this.position++, (byte)12);
        this.buffer.putByte(this.position++, (byte)-1);
        this.buffer.putInt(this.position, n);
        this.position += 4;
        this.buffer.putLong(this.position, l);
        this.position += 8;
    }

    public MessagePacker packArrayHeader(int n) throws IOException {
        if (n < 0) {
            throw new IllegalArgumentException("array size must be >= 0");
        }
        if (n < 16) {
            this.writeByte((byte)(0xFFFFFF90 | n));
        } else if (n < 65536) {
            this.writeByteAndShort((byte)-36, (short)n);
        } else {
            this.writeByteAndInt((byte)-35, n);
        }
        return this;
    }

    public MessagePacker packMapHeader(int n) throws IOException {
        if (n < 0) {
            throw new IllegalArgumentException("map size must be >= 0");
        }
        if (n < 16) {
            this.writeByte((byte)(0xFFFFFF80 | n));
        } else if (n < 65536) {
            this.writeByteAndShort((byte)-34, (short)n);
        } else {
            this.writeByteAndInt((byte)-33, n);
        }
        return this;
    }

    public MessagePacker packValue(Value value) throws IOException {
        value.writeTo(this);
        return this;
    }

    public MessagePacker packExtensionTypeHeader(byte by, int n) throws IOException {
        if (n < 256) {
            if (n > 0 && (n & n - 1) == 0) {
                if (n == 1) {
                    this.writeByteAndByte((byte)-44, by);
                } else if (n == 2) {
                    this.writeByteAndByte((byte)-43, by);
                } else if (n == 4) {
                    this.writeByteAndByte((byte)-42, by);
                } else if (n == 8) {
                    this.writeByteAndByte((byte)-41, by);
                } else if (n == 16) {
                    this.writeByteAndByte((byte)-40, by);
                } else {
                    this.writeByteAndByte((byte)-57, (byte)n);
                    this.writeByte(by);
                }
            } else {
                this.writeByteAndByte((byte)-57, (byte)n);
                this.writeByte(by);
            }
        } else if (n < 65536) {
            this.writeByteAndShort((byte)-56, (short)n);
            this.writeByte(by);
        } else {
            this.writeByteAndInt((byte)-55, n);
            this.writeByte(by);
        }
        return this;
    }

    public MessagePacker packBinaryHeader(int n) throws IOException {
        if (n < 256) {
            this.writeByteAndByte((byte)-60, (byte)n);
        } else if (n < 65536) {
            this.writeByteAndShort((byte)-59, (short)n);
        } else {
            this.writeByteAndInt((byte)-58, n);
        }
        return this;
    }

    public MessagePacker packRawStringHeader(int n) throws IOException {
        if (n < 32) {
            this.writeByte((byte)(0xFFFFFFA0 | n));
        } else if (this.str8FormatSupport && n < 256) {
            this.writeByteAndByte((byte)-39, (byte)n);
        } else if (n < 65536) {
            this.writeByteAndShort((byte)-38, (short)n);
        } else {
            this.writeByteAndInt((byte)-37, n);
        }
        return this;
    }

    public MessagePacker writePayload(byte[] byArray) throws IOException {
        return this.writePayload(byArray, 0, byArray.length);
    }

    public MessagePacker writePayload(byte[] byArray, int n, int n2) throws IOException {
        if (this.buffer == null || this.buffer.size() - this.position < n2 || n2 > this.bufferFlushThreshold) {
            this.flush();
            this.out.write(byArray, n, n2);
            this.totalFlushBytes += (long)n2;
        } else {
            this.buffer.putBytes(this.position, byArray, n, n2);
            this.position += n2;
        }
        return this;
    }

    public MessagePacker addPayload(byte[] byArray) throws IOException {
        return this.addPayload(byArray, 0, byArray.length);
    }

    public MessagePacker addPayload(byte[] byArray, int n, int n2) throws IOException {
        if (this.buffer == null || this.buffer.size() - this.position < n2 || n2 > this.bufferFlushThreshold) {
            this.flush();
            this.out.add(byArray, n, n2);
            this.totalFlushBytes += (long)n2;
        } else {
            this.buffer.putBytes(this.position, byArray, n, n2);
            this.position += n2;
        }
        return this;
    }

    static {
        boolean bl = false;
        try {
            Class<?> clazz = Class.forName("android.os.Build$VERSION");
            Constructor<?> constructor = clazz.getConstructor(new Class[0]);
            Object obj = constructor.newInstance(new Object[0]);
            Field field = clazz.getField("SDK_INT");
            int n = field.getInt(obj);
            if (n >= 14 && n < 21) {
                bl = true;
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
        }
        catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
        }
        catch (InstantiationException instantiationException) {
            instantiationException.printStackTrace();
        }
        catch (InvocationTargetException invocationTargetException) {
            invocationTargetException.printStackTrace();
        }
        catch (NoSuchFieldException noSuchFieldException) {
            noSuchFieldException.printStackTrace();
        }
        CORRUPTED_CHARSET_ENCODER = bl;
    }
}

