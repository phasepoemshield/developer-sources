/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

import java.nio.charset.CharacterCodingException;
import org.msgpack.core.MessagePackException;

public class MessageStringCodingException
extends MessagePackException {
    public MessageStringCodingException(String string, CharacterCodingException characterCodingException) {
        super(string, characterCodingException);
    }

    public MessageStringCodingException(CharacterCodingException characterCodingException) {
        super(characterCodingException);
    }

    @Override
    public CharacterCodingException getCause() {
        return (CharacterCodingException)super.getCause();
    }
}

