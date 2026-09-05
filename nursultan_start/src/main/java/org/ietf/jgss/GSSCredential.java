/*
 * Decompiled with CFR 0.152.
 */
package org.ietf.jgss;

import org.ietf.jgss.GSSException;
import org.ietf.jgss.GSSName;
import org.ietf.jgss.Oid;

public interface GSSCredential
extends Cloneable {
    public static final int INITIATE_AND_ACCEPT = 0;
    public static final int INITIATE_ONLY = 1;
    public static final int ACCEPT_ONLY = 2;
    public static final int DEFAULT_LIFETIME = 0;
    public static final int INDEFINITE_LIFETIME = Integer.MAX_VALUE;

    public void dispose() throws GSSException;

    public GSSName getName() throws GSSException;

    public GSSName getName(Oid var1) throws GSSException;

    public int getRemainingLifetime() throws GSSException;

    public int getRemainingInitLifetime(Oid var1) throws GSSException;

    public int getRemainingAcceptLifetime(Oid var1) throws GSSException;

    public int getUsage() throws GSSException;

    public int getUsage(Oid var1) throws GSSException;

    public Oid[] getMechs() throws GSSException;

    public void add(GSSName var1, int var2, int var3, Oid var4, int var5) throws GSSException;

    public boolean equals(Object var1);

    public int hashCode();
}

