/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

public interface Passwd {
    public String getAccessClass();

    public int getPasswdChangeTime();

    public long getGID();

    public int getExpire();

    public String getShell();

    public String getGECOS();

    public String getPassword();

    public String getLoginName();

    public String getHome();

    public long getUID();
}

