/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePack
 *  org.msgpack.core.MessageStringCodingException
 *  org.msgpack.value.ImmutableRawValue
 */
package org.msgpack.value.impl;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.value.ImmutableRawValue;
import org.msgpack.value.impl.AbstractImmutableValue;

public abstract class AbstractImmutableRawValue
extends AbstractImmutableValue
implements ImmutableRawValue {
    protected final byte[] data;
    private volatile String decodedStringCache;
    private volatile CharacterCodingException codingException;
    private static final char[] HEX_TABLE = "0123456789ABCDEF".toCharArray();

    public AbstractImmutableRawValue(byte[] byArray) {
        this.data = byArray;
    }

    public AbstractImmutableRawValue(String string) {
        this.decodedStringCache = string;
        this.data = string.getBytes(MessagePack.UTF8);
    }

    public String toString() {
        if (this.decodedStringCache == null) {
            this.decodeString();
        }
        return this.decodedStringCache;
    }

    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(this.data).asReadOnlyBuffer();
    }

    public String toJson() {
        StringBuilder stringBuilder = new StringBuilder();
        AbstractImmutableRawValue.appendJsonString(stringBuilder, this.toString());
        return stringBuilder.toString();
    }

    public byte[] asByteArray() {
        return Arrays.copyOf(this.data, this.data.length);
    }

    private static void escapeChar(StringBuilder stringBuilder, int n) {
        stringBuilder.append("\\u");
        stringBuilder.append(HEX_TABLE[n >> 12 & 0xF]);
        stringBuilder.append(HEX_TABLE[n >> 8 & 0xF]);
        stringBuilder.append(HEX_TABLE[n >> 4 & 0xF]);
        stringBuilder.append(HEX_TABLE[n & 0xF]);
    }

    public String asString() {
        if (this.decodedStringCache == null) {
            this.decodeString();
        }
        if (this.codingException != null) {
            throw new MessageStringCodingException(this.codingException);
        }
        return this.decodedStringCache;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void decodeString() {
        byte[] byArray = this.data;
        synchronized (this.data) {
            if (this.decodedStringCache != null) {
                // ** MonitorExit[var1_1] (shouldn't be in output)
                return;
            }
            try {
                CharsetDecoder charsetDecoder = MessagePack.UTF8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
                this.decodedStringCache = charsetDecoder.decode(this.asByteBuffer()).toString();
            }
            catch (CharacterCodingException characterCodingException) {
                try {
                    CharsetDecoder charsetDecoder = MessagePack.UTF8.newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
                    this.decodedStringCache = charsetDecoder.decode(this.asByteBuffer()).toString();
                }
                catch (CharacterCodingException characterCodingException2) {
                    throw new MessageStringCodingException(characterCodingException2);
                }
                this.codingException = characterCodingException;
            }
            return;
        }
    }

    @Override
    public ImmutableRawValue asRawValue() {
        return this;
    }

    static void appendJsonString(StringBuilder stringBuilder, String string) {
        stringBuilder.append("\"");
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c < ' ') {
                switch (c) {
                    case '\n': {
                        stringBuilder.append("\\n");
                        break;
                    }
                    case '\r': {
                        stringBuilder.append("\\r");
                        break;
                    }
                    case '\t': {
                        stringBuilder.append("\\t");
                        break;
                    }
                    case '\f': {
                        stringBuilder.append("\\f");
                        break;
                    }
                    case '\b': {
                        stringBuilder.append("\\b");
                        break;
                    }
                    default: {
                        AbstractImmutableRawValue.escapeChar(stringBuilder, c);
                        break;
                    }
                }
                continue;
            }
            if (c <= '\u007f') {
                switch (c) {
                    case '\\': {
                        stringBuilder.append("\\\\");
                        break;
                    }
                    case '\"': {
                        stringBuilder.append("\\\"");
                        break;
                    }
                    default: {
                        stringBuilder.append(c);
                        break;
                    }
                }
                continue;
            }
            if (c >= '\ud800' && c <= '\udfff') {
                AbstractImmutableRawValue.escapeChar(stringBuilder, c);
                continue;
            }
            stringBuilder.append(c);
        }
        stringBuilder.append("\"");
    }
}

