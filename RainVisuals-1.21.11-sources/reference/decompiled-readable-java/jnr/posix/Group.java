/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

public interface Group {
    public String getPassword();

    public String[] getMembers();

    public long getGID();

    public String getName();
}

