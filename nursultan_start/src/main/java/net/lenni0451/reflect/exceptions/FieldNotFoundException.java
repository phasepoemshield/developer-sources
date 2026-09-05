/*
 * Decompiled with CFR 0.152.
 */
package net.lenni0451.reflect.exceptions;

public class FieldNotFoundException
extends RuntimeException {
    public FieldNotFoundException(String owner, String ... args) {
        super("Could not find field '" + String.join((CharSequence)", ", args) + "' in class '" + owner + "'");
    }
}

