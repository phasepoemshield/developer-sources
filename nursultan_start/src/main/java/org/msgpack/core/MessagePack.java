/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.ByteBufferInput;
import org.msgpack.core.buffer.ChannelBufferInput;
import org.msgpack.core.buffer.ChannelBufferOutput;
import org.msgpack.core.buffer.InputStreamBufferInput;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.core.buffer.MessageBufferOutput;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

public class MessagePack {
    public static final Charset UTF8 = Charset.forName("UTF-8");
    public static final PackerConfig DEFAULT_PACKER_CONFIG = new PackerConfig();
    public static final UnpackerConfig DEFAULT_UNPACKER_CONFIG = new UnpackerConfig();

    private MessagePack() {
    }

    public static MessageBufferPacker newDefaultBufferPacker() {
        return DEFAULT_PACKER_CONFIG.newBufferPacker();
    }

    public static MessagePacker newDefaultPacker(MessageBufferOutput messageBufferOutput) {
        return DEFAULT_PACKER_CONFIG.newPacker(messageBufferOutput);
    }

    public static MessagePacker newDefaultPacker(OutputStream outputStream) {
        return DEFAULT_PACKER_CONFIG.newPacker(outputStream);
    }

    public static MessagePacker newDefaultPacker(WritableByteChannel writableByteChannel) {
        return DEFAULT_PACKER_CONFIG.newPacker(writableByteChannel);
    }

    public static MessageUnpacker newDefaultUnpacker(ByteBuffer byteBuffer) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(byteBuffer);
    }

    public static MessageUnpacker newDefaultUnpacker(byte[] byArray, int n, int n2) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(byArray, n, n2);
    }

    public static MessageUnpacker newDefaultUnpacker(InputStream inputStream) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(inputStream);
    }

    public static MessageUnpacker newDefaultUnpacker(byte[] byArray) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(byArray);
    }

    public static MessageUnpacker newDefaultUnpacker(ReadableByteChannel readableByteChannel) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(readableByteChannel);
    }

    public static MessageUnpacker newDefaultUnpacker(MessageBufferInput messageBufferInput) {
        return DEFAULT_UNPACKER_CONFIG.newUnpacker(messageBufferInput);
    }

    public static class UnpackerConfig
    implements Cloneable {
        private boolean allowReadingStringAsBinary = true;
        private boolean allowReadingBinaryAsString = true;
        private CodingErrorAction actionOnMalformedString = CodingErrorAction.REPLACE;
        private CodingErrorAction actionOnUnmappableString = CodingErrorAction.REPLACE;
        private int stringSizeLimit = Integer.MAX_VALUE;
        private int bufferSize = 8192;
        private int stringDecoderBufferSize = 8192;

        public UnpackerConfig withBufferSize(int n) {
            Object object = this.clone();
            ((UnpackerConfig)object).bufferSize = n;
            return object;
        }

        public UnpackerConfig() {
        }

        private UnpackerConfig(UnpackerConfig unpackerConfig) {
            this.allowReadingStringAsBinary = unpackerConfig.allowReadingStringAsBinary;
            this.allowReadingBinaryAsString = unpackerConfig.allowReadingBinaryAsString;
            this.actionOnMalformedString = unpackerConfig.actionOnMalformedString;
            this.actionOnUnmappableString = unpackerConfig.actionOnUnmappableString;
            this.stringSizeLimit = unpackerConfig.stringSizeLimit;
            this.bufferSize = unpackerConfig.bufferSize;
        }

        public boolean equals(Object object) {
            if (!(object instanceof UnpackerConfig)) {
                return false;
            }
            UnpackerConfig unpackerConfig = (UnpackerConfig)object;
            return this.allowReadingStringAsBinary == unpackerConfig.allowReadingStringAsBinary && this.allowReadingBinaryAsString == unpackerConfig.allowReadingBinaryAsString && this.actionOnMalformedString == unpackerConfig.actionOnMalformedString && this.actionOnUnmappableString == unpackerConfig.actionOnUnmappableString && this.stringSizeLimit == unpackerConfig.stringSizeLimit && this.stringDecoderBufferSize == unpackerConfig.stringDecoderBufferSize && this.bufferSize == unpackerConfig.bufferSize;
        }

        public int hashCode() {
            int n = this.allowReadingStringAsBinary ? 1 : 0;
            n = 31 * n + (this.allowReadingBinaryAsString ? 1 : 0);
            n = 31 * n + (this.actionOnMalformedString != null ? this.actionOnMalformedString.hashCode() : 0);
            n = 31 * n + (this.actionOnUnmappableString != null ? this.actionOnUnmappableString.hashCode() : 0);
            n = 31 * n + this.stringSizeLimit;
            n = 31 * n + this.bufferSize;
            n = 31 * n + this.stringDecoderBufferSize;
            return n;
        }

        public UnpackerConfig clone() {
            return new UnpackerConfig(this);
        }

        public int getBufferSize() {
            return this.bufferSize;
        }

        public UnpackerConfig withActionOnUnmappableString(CodingErrorAction codingErrorAction) {
            Object object = this.clone();
            ((UnpackerConfig)object).actionOnUnmappableString = codingErrorAction;
            return object;
        }

        public UnpackerConfig withActionOnMalformedString(CodingErrorAction codingErrorAction) {
            Object object = this.clone();
            ((UnpackerConfig)object).actionOnMalformedString = codingErrorAction;
            return object;
        }

        public CodingErrorAction getActionOnUnmappableString() {
            return this.actionOnUnmappableString;
        }

        public UnpackerConfig withAllowReadingStringAsBinary(boolean bl) {
            Object object = this.clone();
            ((UnpackerConfig)object).allowReadingStringAsBinary = bl;
            return object;
        }

        public boolean getAllowReadingStringAsBinary() {
            return this.allowReadingStringAsBinary;
        }

        public UnpackerConfig withAllowReadingBinaryAsString(boolean bl) {
            Object object = this.clone();
            ((UnpackerConfig)object).allowReadingBinaryAsString = bl;
            return object;
        }

        public UnpackerConfig withStringDecoderBufferSize(int n) {
            Object object = this.clone();
            ((UnpackerConfig)object).stringDecoderBufferSize = n;
            return object;
        }

        public boolean getAllowReadingBinaryAsString() {
            return this.allowReadingBinaryAsString;
        }

        public int getStringDecoderBufferSize() {
            return this.stringDecoderBufferSize;
        }

        public CodingErrorAction getActionOnMalformedString() {
            return this.actionOnMalformedString;
        }

        public UnpackerConfig withStringSizeLimit(int n) {
            Object object = this.clone();
            ((UnpackerConfig)object).stringSizeLimit = n;
            return object;
        }

        public MessageUnpacker newUnpacker(byte[] byArray, int n, int n2) {
            return this.newUnpacker(new ArrayBufferInput(byArray, n, n2));
        }

        public MessageUnpacker newUnpacker(byte[] byArray) {
            return this.newUnpacker(new ArrayBufferInput(byArray));
        }

        public MessageUnpacker newUnpacker(ReadableByteChannel readableByteChannel) {
            return this.newUnpacker(new ChannelBufferInput(readableByteChannel, this.bufferSize));
        }

        public MessageUnpacker newUnpacker(InputStream inputStream) {
            return this.newUnpacker(new InputStreamBufferInput(inputStream, this.bufferSize));
        }

        public MessageUnpacker newUnpacker(ByteBuffer byteBuffer) {
            return this.newUnpacker(new ByteBufferInput(byteBuffer));
        }

        public MessageUnpacker newUnpacker(MessageBufferInput messageBufferInput) {
            return new MessageUnpacker(messageBufferInput, this);
        }

        public int getStringSizeLimit() {
            return this.stringSizeLimit;
        }
    }

    public static class PackerConfig
    implements Cloneable {
        private int smallStringOptimizationThreshold = 512;
        private int bufferFlushThreshold = 8192;
        private int bufferSize = 8192;
        private boolean str8FormatSupport = true;

        public PackerConfig withBufferSize(int n) {
            Object object = this.clone();
            ((PackerConfig)object).bufferSize = n;
            return object;
        }

        public PackerConfig() {
        }

        private PackerConfig(PackerConfig packerConfig) {
            this.smallStringOptimizationThreshold = packerConfig.smallStringOptimizationThreshold;
            this.bufferFlushThreshold = packerConfig.bufferFlushThreshold;
            this.bufferSize = packerConfig.bufferSize;
            this.str8FormatSupport = packerConfig.str8FormatSupport;
        }

        public boolean equals(Object object) {
            if (!(object instanceof PackerConfig)) {
                return false;
            }
            PackerConfig packerConfig = (PackerConfig)object;
            return this.smallStringOptimizationThreshold == packerConfig.smallStringOptimizationThreshold && this.bufferFlushThreshold == packerConfig.bufferFlushThreshold && this.bufferSize == packerConfig.bufferSize && this.str8FormatSupport == packerConfig.str8FormatSupport;
        }

        public int hashCode() {
            int n = this.smallStringOptimizationThreshold;
            n = 31 * n + this.bufferFlushThreshold;
            n = 31 * n + this.bufferSize;
            n = 31 * n + (this.str8FormatSupport ? 1 : 0);
            return n;
        }

        public PackerConfig clone() {
            return new PackerConfig(this);
        }

        public int getBufferSize() {
            return this.bufferSize;
        }

        public int getBufferFlushThreshold() {
            return this.bufferFlushThreshold;
        }

        public PackerConfig withBufferFlushThreshold(int n) {
            Object object = this.clone();
            ((PackerConfig)object).bufferFlushThreshold = n;
            return object;
        }

        public PackerConfig withStr8FormatSupport(boolean bl) {
            Object object = this.clone();
            ((PackerConfig)object).str8FormatSupport = bl;
            return object;
        }

        public boolean isStr8FormatSupport() {
            return this.str8FormatSupport;
        }

        public MessageBufferPacker newBufferPacker() {
            return new MessageBufferPacker(this);
        }

        public MessagePacker newPacker(WritableByteChannel writableByteChannel) {
            return this.newPacker(new ChannelBufferOutput(writableByteChannel, this.bufferSize));
        }

        public MessagePacker newPacker(MessageBufferOutput messageBufferOutput) {
            return new MessagePacker(messageBufferOutput, this);
        }

        public MessagePacker newPacker(OutputStream outputStream) {
            return this.newPacker(new OutputStreamBufferOutput(outputStream, this.bufferSize));
        }

        public PackerConfig withSmallStringOptimizationThreshold(int n) {
            Object object = this.clone();
            ((PackerConfig)object).smallStringOptimizationThreshold = n;
            return object;
        }

        public int getSmallStringOptimizationThreshold() {
            return this.smallStringOptimizationThreshold;
        }
    }

    public static final class Code {
        public static final byte POSFIXINT_MASK = -128;
        public static final byte FIXMAP_PREFIX = -128;
        public static final byte FIXARRAY_PREFIX = -112;
        public static final byte FIXSTR_PREFIX = -96;
        public static final byte NIL = -64;
        public static final byte NEVER_USED = -63;
        public static final byte FALSE = -62;
        public static final byte TRUE = -61;
        public static final byte BIN8 = -60;
        public static final byte BIN16 = -59;
        public static final byte BIN32 = -58;
        public static final byte EXT8 = -57;
        public static final byte EXT16 = -56;
        public static final byte EXT32 = -55;
        public static final byte FLOAT32 = -54;
        public static final byte FLOAT64 = -53;
        public static final byte UINT8 = -52;
        public static final byte UINT16 = -51;
        public static final byte UINT32 = -50;
        public static final byte UINT64 = -49;
        public static final byte INT8 = -48;
        public static final byte INT16 = -47;
        public static final byte INT32 = -46;
        public static final byte INT64 = -45;
        public static final byte FIXEXT1 = -44;
        public static final byte FIXEXT2 = -43;
        public static final byte FIXEXT4 = -42;
        public static final byte FIXEXT8 = -41;
        public static final byte FIXEXT16 = -40;
        public static final byte STR8 = -39;
        public static final byte STR16 = -38;
        public static final byte STR32 = -37;
        public static final byte ARRAY16 = -36;
        public static final byte ARRAY32 = -35;
        public static final byte MAP16 = -34;
        public static final byte MAP32 = -33;
        public static final byte NEGFIXINT_PREFIX = -32;
        public static final byte EXT_TIMESTAMP = -1;

        public static final boolean isFixedArray(byte by) {
            return (by & 0xFFFFFFF0) == -112;
        }

        public static final boolean isNegFixInt(byte by) {
            return (by & 0xFFFFFFE0) == -32;
        }

        public static final boolean isPosFixInt(byte by) {
            return (by & 0xFFFFFF80) == 0;
        }

        public static final boolean isFixedRaw(byte by) {
            return (by & 0xFFFFFFE0) == -96;
        }

        public static final boolean isFixedMap(byte by) {
            return (by & 0xFFFFFFF0) == -128;
        }

        public static final boolean isFixInt(byte by) {
            int n = by & 0xFF;
            return n <= 127 || n >= 224;
        }

        public static final boolean isFixStr(byte by) {
            return (by & 0xFFFFFFE0) == -96;
        }
    }
}

