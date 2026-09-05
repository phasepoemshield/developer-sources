/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import java.math.BigInteger;
import org.msgpack.core.MessageTypeException;

public class MessageIntegerOverflowException
extends MessageTypeException {
    private final BigInteger bigInteger;

    public MessageIntegerOverflowException(BigInteger bigInteger) {
        this.bigInteger = bigInteger;
    }

    public MessageIntegerOverflowException(long l) {
        this(BigInteger.valueOf(l));
    }

    public MessageIntegerOverflowException(String string, BigInteger bigInteger) {
        super(string);
        this.bigInteger = bigInteger;
    }

    public BigInteger getBigInteger() {
        return this.bigInteger;
    }

    @Override
    public String getMessage() {
        return this.bigInteger.toString();
    }
}

