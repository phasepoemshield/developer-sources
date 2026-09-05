/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.value.Value
 *  org.msgpack.value.ValueFactory
 *  org.msgpack.value.Variable
 */
package org.msgpack.core;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.time.Instant;
import java.util.ArrayList;
import org.msgpack.core.ExtensionTypeHeader;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageFormatException;
import org.msgpack.core.MessageInsufficientBufferException;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessageNeverUsedFormatException;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessagePackException;
import org.msgpack.core.MessageSizeException;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeException;
import org.msgpack.core.Preconditions;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueFactory;
import org.msgpack.value.Variable;

public class MessageUnpacker
implements Closeable {
    private static final MessageBuffer EMPTY_BUFFER = MessageBuffer.wrap(new byte[0]);
    private static final int GRADUAL_ALLOCATION_THRESHOLD = 0x4000000;
    private final boolean allowReadingStringAsBinary;
    private final boolean allowReadingBinaryAsString;
    private final CodingErrorAction actionOnMalformedString;
    private final CodingErrorAction actionOnUnmappableString;
    private final int stringSizeLimit;
    private final int stringDecoderBufferSize;
    private MessageBufferInput in;
    private MessageBuffer buffer = EMPTY_BUFFER;
    private int position;
    private long totalReadBytes;
    private final MessageBuffer numberBuffer = MessageBuffer.allocate(8);
    private int nextReadPosition;
    private StringBuilder decodeStringBuffer;
    private CharsetDecoder decoder;
    private CharBuffer decodeBuffer;
    private static final String EMPTY_STRING = "";

    public void skipValue() throws IOException {
        this.skipValue(1);
    }

    public void skipValue(int n) throws IOException {
        while (n > 0) {
            byte by = this.readByte();
            MessageFormat messageFormat = MessageFormat.valueOf(by);
            switch (messageFormat) {
                case POSFIXINT: 
                case NEGFIXINT: 
                case BOOLEAN: 
                case NIL: {
                    break;
                }
                case FIXMAP: {
                    int n2 = by & 0xF;
                    n += n2 * 2;
                    break;
                }
                case FIXARRAY: {
                    int n2 = by & 0xF;
                    n += n2;
                    break;
                }
                case FIXSTR: {
                    int n2 = by & 0x1F;
                    this.skipPayload(n2);
                    break;
                }
                case INT8: 
                case UINT8: {
                    this.skipPayload(1);
                    break;
                }
                case INT16: 
                case UINT16: {
                    this.skipPayload(2);
                    break;
                }
                case INT32: 
                case UINT32: 
                case FLOAT32: {
                    this.skipPayload(4);
                    break;
                }
                case INT64: 
                case UINT64: 
                case FLOAT64: {
                    this.skipPayload(8);
                    break;
                }
                case BIN8: 
                case STR8: {
                    this.skipPayload(this.readNextLength8());
                    break;
                }
                case BIN16: 
                case STR16: {
                    this.skipPayload(this.readNextLength16());
                    break;
                }
                case BIN32: 
                case STR32: {
                    this.skipPayload(this.readNextLength32());
                    break;
                }
                case FIXEXT1: {
                    this.skipPayload(2);
                    break;
                }
                case FIXEXT2: {
                    this.skipPayload(3);
                    break;
                }
                case FIXEXT4: {
                    this.skipPayload(5);
                    break;
                }
                case FIXEXT8: {
                    this.skipPayload(9);
                    break;
                }
                case FIXEXT16: {
                    this.skipPayload(17);
                    break;
                }
                case EXT8: {
                    this.skipPayload(this.readNextLength8() + 1);
                    break;
                }
                case EXT16: {
                    this.skipPayload(this.readNextLength16() + 1);
                    break;
                }
                case EXT32: {
                    int n2 = this.readNextLength32();
                    this.skipPayload(1);
                    this.skipPayload(n2);
                    break;
                }
                case ARRAY16: {
                    n += this.readNextLength16();
                    break;
                }
                case ARRAY32: {
                    n += this.readNextLength32();
                    break;
                }
                case MAP16: {
                    n += this.readNextLength16() * 2;
                    break;
                }
                case MAP32: {
                    n += this.readNextLength32() * 2;
                    break;
                }
                case NEVER_USED: {
                    throw new MessageNeverUsedFormatException("Encountered 0xC1 \"NEVER_USED\" byte");
                }
            }
            --n;
        }
    }

    protected MessageUnpacker(MessageBufferInput messageBufferInput, MessagePack.UnpackerConfig unpackerConfig) {
        this.in = Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        this.allowReadingStringAsBinary = unpackerConfig.getAllowReadingStringAsBinary();
        this.allowReadingBinaryAsString = unpackerConfig.getAllowReadingBinaryAsString();
        this.actionOnMalformedString = unpackerConfig.getActionOnMalformedString();
        this.actionOnUnmappableString = unpackerConfig.getActionOnUnmappableString();
        this.stringSizeLimit = unpackerConfig.getStringSizeLimit();
        this.stringDecoderBufferSize = unpackerConfig.getStringDecoderBufferSize();
    }

    public MessageBufferInput reset(MessageBufferInput messageBufferInput) throws IOException {
        MessageBufferInput messageBufferInput2 = Preconditions.checkNotNull(messageBufferInput, "MessageBufferInput is null");
        MessageBufferInput messageBufferInput3 = this.in;
        this.in = messageBufferInput2;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.totalReadBytes = 0L;
        return messageBufferInput3;
    }

    public boolean hasNext() throws IOException {
        return this.ensureBuffer();
    }

    @Override
    public void close() throws IOException {
        this.totalReadBytes += (long)this.position;
        this.buffer = EMPTY_BUFFER;
        this.position = 0;
        this.in.close();
    }

    private int readInt() throws IOException {
        MessageBuffer messageBuffer = this.prepareNumberBuffer(4);
        return messageBuffer.getInt(this.nextReadPosition);
    }

    private float readFloat() throws IOException {
        MessageBuffer messageBuffer = this.prepareNumberBuffer(4);
        return messageBuffer.getFloat(this.nextReadPosition);
    }

    private byte readByte() throws IOException {
        if (this.buffer.size() > this.position) {
            byte by = this.buffer.getByte(this.position);
            ++this.position;
            return by;
        }
        this.nextBuffer();
        if (this.buffer.size() > 0) {
            byte by = this.buffer.getByte(0);
            this.position = 1;
            return by;
        }
        return this.readByte();
    }

    private short readShort() throws IOException {
        MessageBuffer messageBuffer = this.prepareNumberBuffer(2);
        return messageBuffer.getShort(this.nextReadPosition);
    }

    private long readLong() throws IOException {
        MessageBuffer messageBuffer = this.prepareNumberBuffer(8);
        return messageBuffer.getLong(this.nextReadPosition);
    }

    private double readDouble() throws IOException {
        MessageBuffer messageBuffer = this.prepareNumberBuffer(8);
        return messageBuffer.getDouble(this.nextReadPosition);
    }

    private static MessagePackException unexpected(String string, byte by) {
        MessageFormat messageFormat = MessageFormat.valueOf(by);
        if (messageFormat == MessageFormat.NEVER_USED) {
            return new MessageNeverUsedFormatException(String.format("Expected %s, but encountered 0xC1 \"NEVER_USED\" byte", string));
        }
        String string2 = messageFormat.getValueType().name();
        String string3 = string2.substring(0, 1) + string2.substring(1).toLowerCase();
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", string, string3, by));
    }

    private void nextBuffer() throws IOException {
        this.buffer = this.getNextBuffer();
        this.position = 0;
    }

    public ExtensionTypeHeader unpackExtensionTypeHeader() throws IOException {
        byte by = this.readByte();
        switch (by) {
            case -44: {
                byte by2 = this.readByte();
                return new ExtensionTypeHeader(by2, 1);
            }
            case -43: {
                byte by3 = this.readByte();
                return new ExtensionTypeHeader(by3, 2);
            }
            case -42: {
                byte by4 = this.readByte();
                return new ExtensionTypeHeader(by4, 4);
            }
            case -41: {
                byte by5 = this.readByte();
                return new ExtensionTypeHeader(by5, 8);
            }
            case -40: {
                byte by6 = this.readByte();
                return new ExtensionTypeHeader(by6, 16);
            }
            case -57: {
                MessageBuffer messageBuffer = this.prepareNumberBuffer(2);
                byte by7 = messageBuffer.getByte(this.nextReadPosition);
                int n = by7 & 0xFF;
                byte by8 = messageBuffer.getByte(this.nextReadPosition + 1);
                return new ExtensionTypeHeader(by8, n);
            }
            case -56: {
                MessageBuffer messageBuffer = this.prepareNumberBuffer(3);
                short s = messageBuffer.getShort(this.nextReadPosition);
                int n = s & 0xFFFF;
                byte by9 = messageBuffer.getByte(this.nextReadPosition + 2);
                return new ExtensionTypeHeader(by9, n);
            }
            case -55: {
                MessageBuffer messageBuffer = this.prepareNumberBuffer(5);
                int n = messageBuffer.getInt(this.nextReadPosition);
                if (n < 0) {
                    throw MessageUnpacker.overflowU32Size(n);
                }
                int n2 = n;
                byte by10 = messageBuffer.getByte(this.nextReadPosition + 4);
                return new ExtensionTypeHeader(by10, n2);
            }
        }
        throw MessageUnpacker.unexpected("Ext", by);
    }

    private int tryReadBinaryHeader(byte by) throws IOException {
        switch (by) {
            case -60: {
                return this.readNextLength8();
            }
            case -59: {
                return this.readNextLength16();
            }
            case -58: {
                return this.readNextLength32();
            }
        }
        return -1;
    }

    private static int utf8MultibyteCharacterSize(byte by) {
        return Integer.numberOfLeadingZeros(~(by & 0xFF) << 24);
    }

    private static MessagePackException unexpectedExtension(String string, int n, int n2) {
        return new MessageTypeException(String.format("Expected extension type %s (%d), but got extension type %d", string, n, n2));
    }

    public MessageBuffer readPayloadAsReference(int n) throws IOException {
        int n2 = this.buffer.size() - this.position;
        if (n2 >= n) {
            MessageBuffer messageBuffer = this.buffer.slice(this.position, n);
            this.position += n;
            return messageBuffer;
        }
        MessageBuffer messageBuffer = MessageBuffer.allocate(n);
        this.readPayload(messageBuffer, 0, n);
        return messageBuffer;
    }

    private MessageBuffer prepareNumberBuffer(int n) throws IOException {
        int n2 = this.buffer.size() - this.position;
        if (n2 >= n) {
            this.nextReadPosition = this.position;
            this.position += n;
            return this.buffer;
        }
        int n3 = 0;
        if (n2 > 0) {
            this.numberBuffer.putMessageBuffer(0, this.buffer, this.position, n2);
            n -= n2;
            n3 += n2;
        }
        while (true) {
            this.nextBuffer();
            int n4 = this.buffer.size();
            if (n4 >= n) break;
            this.numberBuffer.putMessageBuffer(n3, this.buffer, 0, n4);
            n -= n4;
            n3 += n4;
        }
        this.numberBuffer.putMessageBuffer(n3, this.buffer, 0, n);
        this.position = n;
        this.nextReadPosition = 0;
        return this.numberBuffer;
    }

    private String decodeStringFastPath(int n) {
        CharBuffer charBuffer;
        if (this.actionOnMalformedString == CodingErrorAction.REPLACE && this.actionOnUnmappableString == CodingErrorAction.REPLACE && this.buffer.hasArray()) {
            String string = new String(this.buffer.array(), this.buffer.arrayOffset() + this.position, n, MessagePack.UTF8);
            this.position += n;
            return string;
        }
        ByteBuffer byteBuffer = this.buffer.sliceAsByteBuffer(this.position, n);
        try {
            charBuffer = this.decoder.decode(byteBuffer);
        }
        catch (CharacterCodingException characterCodingException) {
            throw new MessageStringCodingException(characterCodingException);
        }
        this.position += n;
        return charBuffer.toString();
    }

    private byte[] readPayloadGradually(int n) throws IOException {
        int n2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n3 = 0;
        for (int i = n; i > 0; i -= n2) {
            int n4 = this.buffer.size() - this.position;
            if (n4 == 0) {
                MessageBuffer messageBuffer = this.in.next();
                if (messageBuffer == null) {
                    throw new MessageSizeException(String.format("Payload declared %,d bytes but input ended after %,d bytes", n, n3), n);
                }
                this.totalReadBytes += (long)this.buffer.size();
                this.buffer = messageBuffer;
                this.position = 0;
                n4 = this.buffer.size();
            }
            n2 = Math.min(i, n4);
            Object object = new byte[n2];
            this.buffer.getBytes(this.position, (byte[])object, 0, n2);
            arrayList.add(object);
            n3 += n2;
            this.position += n2;
        }
        if (arrayList.size() == 1) {
            return (byte[])arrayList.get(0);
        }
        byte[] byArray = new byte[n];
        n2 = 0;
        for (byte[] byArray2 : arrayList) {
            System.arraycopy(byArray2, 0, byArray, n2, byArray2.length);
            n2 += byArray2.length;
        }
        return byArray;
    }

    private int tryReadStringHeader(byte by) throws IOException {
        switch (by) {
            case -39: {
                return this.readNextLength8();
            }
            case -38: {
                return this.readNextLength16();
            }
            case -37: {
                return this.readNextLength32();
            }
        }
        return -1;
    }

    public int unpackRawStringHeader() throws IOException {
        byte by = this.readByte();
        if (MessagePack.Code.isFixedRaw(by)) {
            return by & 0x1F;
        }
        int n = this.tryReadStringHeader(by);
        if (n >= 0) {
            return n;
        }
        if (this.allowReadingBinaryAsString && (n = this.tryReadBinaryHeader(by)) >= 0) {
            return n;
        }
        throw MessageUnpacker.unexpected("String", by);
    }

    public boolean unpackBoolean() throws IOException {
        byte by = this.readByte();
        if (by == -62) {
            return false;
        }
        if (by == -61) {
            return true;
        }
        throw MessageUnpacker.unexpected("boolean", by);
    }

    public boolean tryUnpackNil() throws IOException {
        if (!this.ensureBuffer()) {
            throw new MessageInsufficientBufferException();
        }
        byte by = this.buffer.getByte(this.position);
        if (by == -64) {
            this.readByte();
            return true;
        }
        return false;
    }

    private static MessageIntegerOverflowException overflowU64(long l) {
        BigInteger bigInteger = BigInteger.valueOf(l + Long.MAX_VALUE + 1L).setBit(63);
        return new MessageIntegerOverflowException(bigInteger);
    }

    public BigInteger unpackBigInteger() throws IOException {
        byte by = this.readByte();
        if (MessagePack.Code.isFixInt(by)) {
            return BigInteger.valueOf(by);
        }
        switch (by) {
            case -52: {
                byte by2 = this.readByte();
                return BigInteger.valueOf(by2 & 0xFF);
            }
            case -51: {
                short s = this.readShort();
                return BigInteger.valueOf(s & 0xFFFF);
            }
            case -50: {
                int n = this.readInt();
                if (n < 0) {
                    return BigInteger.valueOf((long)(n & Integer.MAX_VALUE) + 0x80000000L);
                }
                return BigInteger.valueOf(n);
            }
            case -49: {
                long l = this.readLong();
                if (l < 0L) {
                    BigInteger bigInteger = BigInteger.valueOf(l + Long.MAX_VALUE + 1L).setBit(63);
                    return bigInteger;
                }
                return BigInteger.valueOf(l);
            }
            case -48: {
                byte by3 = this.readByte();
                return BigInteger.valueOf(by3);
            }
            case -47: {
                short s = this.readShort();
                return BigInteger.valueOf(s);
            }
            case -46: {
                int n = this.readInt();
                return BigInteger.valueOf(n);
            }
            case -45: {
                long l = this.readLong();
                return BigInteger.valueOf(l);
            }
        }
        throw MessageUnpacker.unexpected("Integer", by);
    }

    private int readNextLength32() throws IOException {
        int n = this.readInt();
        if (n < 0) {
            throw MessageUnpacker.overflowU32Size(n);
        }
        return n;
    }

    public int unpackMapHeader() throws IOException {
        byte by = this.readByte();
        if (MessagePack.Code.isFixedMap(by)) {
            return by & 0xF;
        }
        switch (by) {
            case -34: {
                int n = this.readNextLength16();
                return n;
            }
            case -33: {
                int n = this.readNextLength32();
                return n;
            }
        }
        throw MessageUnpacker.unexpected("Map", by);
    }

    private static MessageIntegerOverflowException overflowI32(int n) {
        BigInteger bigInteger = BigInteger.valueOf(n);
        return new MessageIntegerOverflowException(bigInteger);
    }

    public Instant unpackTimestamp() throws IOException {
        ExtensionTypeHeader extensionTypeHeader = this.unpackExtensionTypeHeader();
        return this.unpackTimestamp(extensionTypeHeader);
    }

    public Instant unpackTimestamp(ExtensionTypeHeader extensionTypeHeader) throws IOException {
        if (extensionTypeHeader.getType() != -1) {
            throw MessageUnpacker.unexpectedExtension("Timestamp", -1, extensionTypeHeader.getType());
        }
        switch (extensionTypeHeader.getLength()) {
            case 4: {
                long l = (long)this.readInt() & 0xFFFFFFFFL;
                return Instant.ofEpochSecond(l);
            }
            case 8: {
                long l = this.readLong();
                int n = (int)(l >>> 34);
                long l2 = l & 0x3FFFFFFFFL;
                return Instant.ofEpochSecond(l2, n);
            }
            case 12: {
                long l = (long)this.readInt() & 0xFFFFFFFFL;
                long l3 = this.readLong();
                return Instant.ofEpochSecond(l3, l);
            }
        }
        throw new MessageFormatException(String.format("Timestamp extension type (%d) expects 4, 8, or 12 bytes of payload but got %d bytes", (byte)-1, extensionTypeHeader.getLength()));
    }

    public MessageFormat getNextFormat() throws IOException {
        if (!this.ensureBuffer()) {
            throw new MessageInsufficientBufferException();
        }
        byte by = this.buffer.getByte(this.position);
        return MessageFormat.valueOf(by);
    }

    private int readNextLength16() throws IOException {
        short s = this.readShort();
        return s & 0xFFFF;
    }

    public int unpackArrayHeader() throws IOException {
        byte by = this.readByte();
        if (MessagePack.Code.isFixedArray(by)) {
            return by & 0xF;
        }
        switch (by) {
            case -36: {
                int n = this.readNextLength16();
                return n;
            }
            case -35: {
                int n = this.readNextLength32();
                return n;
            }
        }
        throw MessageUnpacker.unexpected("Array", by);
    }

    private void handleCoderError(CoderResult coderResult) throws CharacterCodingException {
        if (coderResult.isMalformed() && this.actionOnMalformedString == CodingErrorAction.REPORT || coderResult.isUnmappable() && this.actionOnUnmappableString == CodingErrorAction.REPORT) {
            coderResult.throwException();
        }
    }

    public short unpackShort() throws IOException {
        byte by = this.readByte();
        if (MessagePack.Code.isFixInt(by)) {
            return by;
        }
        switch (by) {
            case -52: {
                byte by2 = this.readByte();
                return (short)(by2 & 0xFF);
            }
            case -51: {
                short s = this.readShort();
                if (s < 0) {
                    throw MessageUnpacker.overflowU16(s);
                }
                return s;
            }
            case -50: {
                int n = this.readInt();
                if (n < 0 || n > Short.MAX_VALUE) {
                    throw MessageUnpacker.overflowU32(n);
                }
                return (short)n;
            }
            case -49: {
                long l = this.readLong();
                if (l < 0L || l > 32767L) {
                    throw MessageUnpacker.overflowU64(l);
                }
                return (short)l;
            }
            case -48: {
                byte by3 = this.readByte();
                return by3;
            }
            case -47: {
                short s = this.readShort();
                return s;
            }
            case -46: {
                int n = this.readInt();
                if (n < Short.MIN_VALUE || n > Short.MAX_VALUE) {
                    throw MessageUnpacker.overflowI32(n);
                }
                return (short)n;
            }
            case -45: {
                long l = this.readLong();
                if (l < -32768L || l > 32767L) {
                    throw MessageUnpacker.overflowI64(l);
                }
                return (short)l;
            }
        }
        throw MessageUnpacker.unexpected("Integer", by);
    }

    public ImmutableValue unpackValue() throws IOException {
        MessageFormat messageFormat = this.getNextFormat();
        switch (messageFormat.getValueType()) {
            case NIL: {
                this.readByte();
                return ValueFactory.newNil();
            }
            case BOOLEAN: {
                return ValueFactory.newBoolean((boolean)this.unpackBoolean());
            }
            case INTEGER: {
                if (messageFormat == MessageFormat.UINT64) {
                    return ValueFactory.newInteger((BigInteger)this.unpackBigInteger());
                }
                return ValueFactory.newInteger((long)this.unpackLong());
            }
            case FLOAT: {
                return ValueFactory.newFloat((double)this.unpackDouble());
            }
            case STRING: {
                int n = this.unpackRawStringHeader();
                if (n > this.stringSizeLimit) {
                    throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", this.stringSizeLimit, n), n);
                }
                return ValueFactory.newString((byte[])this.readPayload(n), (boolean)true);
            }
            case BINARY: {
                int n = this.unpackBinaryHeader();
                return ValueFactory.newBinary((byte[])this.readPayload(n), (boolean)true);
            }
            case ARRAY: {
                int n = this.unpackArrayHeader();
                Value[] valueArray = new Value[n];
                for (int i = 0; i < n; ++i) {
                    valueArray[i] = this.unpackValue();
                }
                return ValueFactory.newArray((Value[])valueArray, (boolean)true);
            }
            case MAP: {
                int n = this.unpackMapHeader();
                Value[] valueArray = new Value[n * 2];
                for (int i = 0; i < n * 2; ++i) {
                    valueArray[i] = this.unpackValue();
                    valueArray[++i] = this.unpackValue();
                }
                return ValueFactory.newMap((Value[])valueArray, (boolean)true);
            }
            case EXTENSION: {
                ExtensionTypeHeader extensionTypeHeader = this.unpackExtensionTypeHeader();
                switch (extensionTypeHeader.getType()) {
                    case -1: {
                        return ValueFactory.newTimestamp((Instant)this.unpackTimestamp(extensionTypeHeader));
                    }
                }
                return ValueFactory.newExtension((byte)extensionTypeHeader.getType(), (byte[])this.readPayload(extensionTypeHeader.getLength()));
            }
        }
        throw new MessageNeverUsedFormatException("Unknown value type");
    }

    public Variable unpackValue(Variable variable) throws IOException {
        MessageFormat messageFormat = this.getNextFormat();
        switch (messageFormat.getValueType()) {
            case NIL: {
                this.readByte();
                variable.setNilValue();
                return variable;
            }
            case BOOLEAN: {
                variable.setBooleanValue(this.unpackBoolean());
                return variable;
            }
            case INTEGER: {
                switch (messageFormat) {
                    case UINT64: {
                        variable.setIntegerValue(this.unpackBigInteger());
                        return variable;
                    }
                }
                variable.setIntegerValue(this.unpackLong());
                return variable;
            }
            case FLOAT: {
                variable.setFloatValue(this.unpackDouble());
                return variable;
            }
            case STRING: {
                int n = this.unpackRawStringHeader();
                if (n > this.stringSizeLimit) {
                    throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", this.stringSizeLimit, n), n);
                }
                variable.setStringValue(this.readPayload(n));
                return variable;
            }
            case BINARY: {
                int n = this.unpackBinaryHeader();
                variable.setBinaryValue(this.readPayload(n));
                return variable;
            }
            case ARRAY: {
                int n = this.unpackArrayHeader();
                Value[] valueArray = new Value[n];
                for (int i = 0; i < n; ++i) {
                    valueArray[i] = this.unpackValue();
                }
                variable.setArrayValue(valueArray);
                return variable;
            }
            case MAP: {
                int n = this.unpackMapHeader();
                Value[] valueArray = new Value[n * 2];
                for (int i = 0; i < n * 2; ++i) {
                    valueArray[i] = this.unpackValue();
                    valueArray[++i] = this.unpackValue();
                }
                variable.setMapValue(valueArray);
                return variable;
            }
            case EXTENSION: {
                ExtensionTypeHeader extensionTypeHeader = this.unpackExtensionTypeHeader();
                switch (extensionTypeHeader.getType()) {
                    case -1: {
                        variable.setTimestampValue(this.unpackTimestamp(extensionTypeHeader));
                        break;
                    }
                    default: {
                        variable.setExtensionValue(extensionTypeHeader.getType(), this.readPayload(extensionTypeHeader.getLength()));
                    }
                }
                return variable;
            }
        }
        throw new MessageFormatException("Unknown value type");
    }

    public float unpackFloat() throws IOException {
        byte by = this.readByte();
        switch (by) {
            case -54: {
                float f = this.readFloat();
                return f;
            }
            case -53: {
                double d = this.readDouble();
                return (float)d;
            }
        }
        throw MessageUnpacker.unexpected("Float", by);
    }

    private void resetDecoder() {
        if (this.decoder == null) {
            this.decodeBuffer = CharBuffer.allocate(this.stringDecoderBufferSize);
            this.decoder = MessagePack.UTF8.newDecoder().onMalformedInput(this.actionOnMalformedString).onUnmappableCharacter(this.actionOnUnmappableString);
        } else {
            this.decoder.reset();
        }
        if (this.decodeStringBuffer == null) {
            this.decodeStringBuffer = new StringBuilder();
        } else {
            this.decodeStringBuffer.setLength(0);
        }
    }

    public int unpackBinaryHeader() throws IOException {
        byte by = this.readByte();
        if (MessagePack.Code.isFixedRaw(by)) {
            return by & 0x1F;
        }
        int n = this.tryReadBinaryHeader(by);
        if (n >= 0) {
            return n;
        }
        if (this.allowReadingStringAsBinary && (n = this.tryReadStringHeader(by)) >= 0) {
            return n;
        }
        throw MessageUnpacker.unexpected("Binary", by);
    }

    private void skipPayload(int n) throws IOException {
        if (n < 0) {
            throw new IllegalArgumentException("payload size must be >= 0: " + n);
        }
        while (true) {
            int n2;
            if ((n2 = this.buffer.size() - this.position) >= n) {
                this.position += n;
                return;
            }
            this.position += n2;
            n -= n2;
            this.nextBuffer();
        }
    }

    private static MessageIntegerOverflowException overflowU32(int n) {
        BigInteger bigInteger = BigInteger.valueOf((long)(n & Integer.MAX_VALUE) + 0x80000000L);
        return new MessageIntegerOverflowException(bigInteger);
    }

    private static MessageIntegerOverflowException overflowI16(short s) {
        BigInteger bigInteger = BigInteger.valueOf(s);
        return new MessageIntegerOverflowException(bigInteger);
    }

    private static MessageIntegerOverflowException overflowI64(long l) {
        BigInteger bigInteger = BigInteger.valueOf(l);
        return new MessageIntegerOverflowException(bigInteger);
    }

    public String unpackString() throws IOException {
        int n = this.unpackRawStringHeader();
        if (n == 0) {
            return EMPTY_STRING;
        }
        if (n > this.stringSizeLimit) {
            throw new MessageSizeException(String.format("cannot unpack a String of size larger than %,d: %,d", this.stringSizeLimit, n), n);
        }
        this.resetDecoder();
        if (this.buffer.size() - this.position >= n) {
            return this.decodeStringFastPath(n);
        }
        try {
            int n2 = n;
            while (n2 > 0) {
                int n3;
                int n4 = this.buffer.size() - this.position;
                if (n4 >= n2) {
                    this.decodeStringBuffer.append(this.decodeStringFastPath(n2));
                    break;
                }
                if (n4 == 0) {
                    this.nextBuffer();
                    continue;
                }
                ByteBuffer byteBuffer = this.buffer.sliceAsByteBuffer(this.position, n4);
                int n5 = byteBuffer.position();
                this.decodeBuffer.clear();
                CoderResult coderResult = this.decoder.decode(byteBuffer, this.decodeBuffer, false);
                int n6 = byteBuffer.position() - n5;
                this.position += n6;
                n2 -= n6;
                this.decodeStringBuffer.append(this.decodeBuffer.flip());
                if (coderResult.isError()) {
                    this.handleCoderError(coderResult);
                }
                if (!coderResult.isUnderflow() || n6 >= n4) continue;
                int n7 = MessageUnpacker.utf8MultibyteCharacterSize(this.buffer.getByte(this.position));
                ByteBuffer byteBuffer2 = ByteBuffer.allocate(n7);
                this.buffer.getBytes(this.position, this.buffer.size() - this.position, byteBuffer2);
                while (true) {
                    this.nextBuffer();
                    n3 = byteBuffer2.remaining();
                    if (this.buffer.size() >= n3) break;
                    this.buffer.getBytes(0, this.buffer.size(), byteBuffer2);
                    this.position = this.buffer.size();
                }
                this.buffer.getBytes(0, n3, byteBuffer2);
                this.position = n3;
                byteBuffer2.position(0);
                this.decodeBuffer.clear();
                coderResult = this.decoder.decode(byteBuffer2, this.decodeBuffer, false);
                if (coderResult.isError()) {
                    this.handleCoderError(coderResult);
                }
                if (coderResult.isOverflow() || coderResult.isUnderflow() && byteBuffer2.position() < byteBuffer2.limit()) {
                    try {
                        coderResult.throwException();
                        throw new MessageFormatException("Unexpected UTF-8 multibyte sequence");
                    }
                    catch (Exception exception) {
                        throw new MessageFormatException("Unexpected UTF-8 multibyte sequence", exception);
                    }
                }
                n2 -= byteBuffer2.limit();
                this.decodeStringBuffer.append(this.decodeBuffer.flip());
            }
            return this.decodeStringBuffer.toString();
        }
        catch (CharacterCodingException characterCodingException) {
            throw new MessageStringCodingException(characterCodingException);
        }
    }

    private static MessageSizeException overflowU32Size(int n) {
        long l = (long)(n & Integer.MAX_VALUE) + 0x80000000L;
        return new MessageSizeException(l);
    }

    private static MessageIntegerOverflowException overflowU16(short s) {
        BigInteger bigInteger = BigInteger.valueOf(s & 0xFFFF);
        return new MessageIntegerOverflowException(bigInteger);
    }

    private MessageBuffer getNextBuffer() throws IOException {
        MessageBuffer messageBuffer = this.in.next();
        if (messageBuffer == null) {
            throw new MessageInsufficientBufferException();
        }
        assert (this.buffer != null);
        this.totalReadBytes += (long)this.buffer.size();
        return messageBuffer;
    }

    private boolean ensureBuffer() throws IOException {
        while (this.buffer.size() <= this.position) {
            MessageBuffer messageBuffer = this.in.next();
            if (messageBuffer == null) {
                return false;
            }
            this.totalReadBytes += (long)this.buffer.size();
            this.buffer = messageBuffer;
            this.position = 0;
        }
        return true;
    }

    private int readNextLength8() throws IOException {
        byte by = this.readByte();
        return by & 0xFF;
    }

    public long getTotalReadBytes() {
        return this.totalReadBytes + (long)this.position;
    }

    public double unpackDouble() throws IOException {
        byte by = this.readByte();
        switch (by) {
            case -54: {
                float f = this.readFloat();
                return f;
            }
            case -53: {
                double d = this.readDouble();
                return d;
            }
        }
        throw MessageUnpacker.unexpected("Float", by);
    }

    public void readPayload(byte[] byArray) throws IOException {
        this.readPayload(byArray, 0, byArray.length);
    }

    public byte[] readPayload(int n) throws IOException {
        if (n <= 0x4000000) {
            byte[] byArray = new byte[n];
            this.readPayload(byArray);
            return byArray;
        }
        return this.readPayloadGradually(n);
    }

    public void readPayload(MessageBuffer messageBuffer, int n, int n2) throws IOException {
        while (true) {
            int n3;
            if ((n3 = this.buffer.size() - this.position) >= n2) {
                messageBuffer.putMessageBuffer(n, this.buffer, this.position, n2);
                this.position += n2;
                return;
            }
            messageBuffer.putMessageBuffer(n, this.buffer, this.position, n3);
            n += n3;
            n2 -= n3;
            this.position += n3;
            this.nextBuffer();
        }
    }

    public void readPayload(byte[] byArray, int n, int n2) throws IOException {
        while (true) {
            int n3;
            if ((n3 = this.buffer.size() - this.position) >= n2) {
                this.buffer.getBytes(this.position, byArray, n, n2);
                this.position += n2;
                return;
            }
            this.buffer.getBytes(this.position, byArray, n, n3);
            n += n3;
            n2 -= n3;
            this.position += n3;
            this.nextBuffer();
        }
    }

    public void readPayload(ByteBuffer byteBuffer) throws IOException {
        while (true) {
            int n = byteBuffer.remaining();
            int n2 = this.buffer.size() - this.position;
            if (n2 >= n) {
                this.buffer.getBytes(this.position, n, byteBuffer);
                this.position += n;
                return;
            }
            this.buffer.getBytes(this.position, n2, byteBuffer);
            this.position += n2;
            this.nextBuffer();
        }
    }

    public long unpackLong() throws IOException {
        byte by = this.readByte();
        if (MessagePack.Code.isFixInt(by)) {
            return by;
        }
        switch (by) {
            case -52: {
                byte by2 = this.readByte();
                return by2 & 0xFF;
            }
            case -51: {
                short s = this.readShort();
                return s & 0xFFFF;
            }
            case -50: {
                int n = this.readInt();
                if (n < 0) {
                    return (long)(n & Integer.MAX_VALUE) + 0x80000000L;
                }
                return n;
            }
            case -49: {
                long l = this.readLong();
                if (l < 0L) {
                    throw MessageUnpacker.overflowU64(l);
                }
                return l;
            }
            case -48: {
                byte by3 = this.readByte();
                return by3;
            }
            case -47: {
                short s = this.readShort();
                return s;
            }
            case -46: {
                int n = this.readInt();
                return n;
            }
            case -45: {
                long l = this.readLong();
                return l;
            }
        }
        throw MessageUnpacker.unexpected("Integer", by);
    }

    public byte unpackByte() throws IOException {
        byte by = this.readByte();
        if (MessagePack.Code.isFixInt(by)) {
            return by;
        }
        switch (by) {
            case -52: {
                byte by2 = this.readByte();
                if (by2 < 0) {
                    throw MessageUnpacker.overflowU8(by2);
                }
                return by2;
            }
            case -51: {
                short s = this.readShort();
                if (s < 0 || s > 127) {
                    throw MessageUnpacker.overflowU16(s);
                }
                return (byte)s;
            }
            case -50: {
                int n = this.readInt();
                if (n < 0 || n > 127) {
                    throw MessageUnpacker.overflowU32(n);
                }
                return (byte)n;
            }
            case -49: {
                long l = this.readLong();
                if (l < 0L || l > 127L) {
                    throw MessageUnpacker.overflowU64(l);
                }
                return (byte)l;
            }
            case -48: {
                byte by3 = this.readByte();
                return by3;
            }
            case -47: {
                short s = this.readShort();
                if (s < -128 || s > 127) {
                    throw MessageUnpacker.overflowI16(s);
                }
                return (byte)s;
            }
            case -46: {
                int n = this.readInt();
                if (n < -128 || n > 127) {
                    throw MessageUnpacker.overflowI32(n);
                }
                return (byte)n;
            }
            case -45: {
                long l = this.readLong();
                if (l < -128L || l > 127L) {
                    throw MessageUnpacker.overflowI64(l);
                }
                return (byte)l;
            }
        }
        throw MessageUnpacker.unexpected("Integer", by);
    }

    public int unpackInt() throws IOException {
        byte by = this.readByte();
        if (MessagePack.Code.isFixInt(by)) {
            return by;
        }
        switch (by) {
            case -52: {
                byte by2 = this.readByte();
                return by2 & 0xFF;
            }
            case -51: {
                short s = this.readShort();
                return s & 0xFFFF;
            }
            case -50: {
                int n = this.readInt();
                if (n < 0) {
                    throw MessageUnpacker.overflowU32(n);
                }
                return n;
            }
            case -49: {
                long l = this.readLong();
                if (l < 0L || l > Integer.MAX_VALUE) {
                    throw MessageUnpacker.overflowU64(l);
                }
                return (int)l;
            }
            case -48: {
                byte by3 = this.readByte();
                return by3;
            }
            case -47: {
                short s = this.readShort();
                return s;
            }
            case -46: {
                int n = this.readInt();
                return n;
            }
            case -45: {
                long l = this.readLong();
                if (l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {
                    throw MessageUnpacker.overflowI64(l);
                }
                return (int)l;
            }
        }
        throw MessageUnpacker.unexpected("Integer", by);
    }

    public void unpackNil() throws IOException {
        byte by = this.readByte();
        if (by == -64) {
            return;
        }
        throw MessageUnpacker.unexpected("Nil", by);
    }

    private static MessageIntegerOverflowException overflowU8(byte by) {
        BigInteger bigInteger = BigInteger.valueOf(by & 0xFF);
        return new MessageIntegerOverflowException(bigInteger);
    }
}

