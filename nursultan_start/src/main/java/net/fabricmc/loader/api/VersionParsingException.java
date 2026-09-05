/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.util.version.VersionParsingException
 */
package net.fabricmc.loader.api;

public class VersionParsingException
extends net.fabricmc.loader.util.version.VersionParsingException {
    public VersionParsingException() {
    }

    public VersionParsingException(Throwable t) {
        super(t);
    }

    public VersionParsingException(String s) {
        super(s);
    }

    public VersionParsingException(String s, Throwable t) {
        super(s, t);
    }
}

