/*
 * Decompiled with CFR 0.152.
 */
package org.w3c.dom.events;

public class EventException
extends RuntimeException {
    private static final long serialVersionUID = 242753408332692061L;
    public short code;
    public static final short UNSPECIFIED_EVENT_TYPE_ERR = 0;

    public EventException(short s, String string) {
        super(string);
        this.code = s;
    }
}

