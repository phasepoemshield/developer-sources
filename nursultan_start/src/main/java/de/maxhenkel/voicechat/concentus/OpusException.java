/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.CodecHelpers
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.CodecHelpers;

public class OpusException
extends Exception {
    private String _message;
    private int _opus_error_code;

    public OpusException(String string, int n) {
        this._message = string + ": " + CodecHelpers.opus_strerror((int)n);
        this._opus_error_code = n;
    }

    public OpusException(String string) {
        this(string, 1);
    }

    public OpusException() {
        this("", 0);
    }

    @Override
    public String getMessage() {
        return this._message;
    }
}

