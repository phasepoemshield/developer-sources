/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  io.netty.handler.codec.DecoderException
 */
package com.viaversion.viaversion.exception;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.exception.CancelCodecException;
import io.netty.handler.codec.DecoderException;

public class CancelDecoderException
extends DecoderException
implements CancelCodecException {
    public static final CancelDecoderException CACHED = new /* Unavailable Anonymous Inner Class!! */;

    public CancelDecoderException() {
    }

    public CancelDecoderException(String message, Throwable cause) {
        super(message, cause);
    }

    public CancelDecoderException(String message) {
        super(message);
    }

    public CancelDecoderException(Throwable cause) {
        super(cause);
    }

    public static CancelDecoderException generate(Throwable cause) {
        return Via.getManager().debugHandler().enabled() ? new CancelDecoderException(cause) : CACHED;
    }
}

