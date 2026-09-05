/*
 * Decompiled with CFR 0.152.
 */
package org.ietf.jgss;

import java.io.IOException;
import java.io.InputStream;
import org.ietf.jgss.GSSException;
import sun.security.util.DerOutputStream;
import sun.security.util.DerValue;
import sun.security.util.ObjectIdentifier;

public class Oid {
    private final ObjectIdentifier oid;
    private byte[] derEncoding;

    public Oid(String string) throws GSSException {
        try {
            this.oid = ObjectIdentifier.of(string);
            this.derEncoding = null;
        }
        catch (Exception exception) {
            throw new GSSException(11, "Improperly formatted Object Identifier String - " + string);
        }
    }

    public Oid(InputStream inputStream) throws GSSException {
        try {
            DerValue derValue = new DerValue(inputStream);
            this.derEncoding = derValue.toByteArray();
            this.oid = derValue.getOID();
        }
        catch (IOException iOException) {
            throw new GSSException(11, "Improperly formatted ASN.1 DER encoding for Oid");
        }
    }

    public Oid(byte[] byArray) throws GSSException {
        try {
            DerValue derValue = new DerValue(byArray);
            this.derEncoding = derValue.toByteArray();
            this.oid = derValue.getOID();
        }
        catch (IOException iOException) {
            throw new GSSException(11, "Improperly formatted ASN.1 DER encoding for Oid");
        }
    }

    static Oid getInstance(String string) {
        Oid oid = null;
        try {
            oid = new Oid(string);
        }
        catch (GSSException gSSException) {
            // empty catch block
        }
        return oid;
    }

    public String toString() {
        return this.oid.toString();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Oid) {
            return this.oid.equals(((Oid)object).oid);
        }
        if (object instanceof ObjectIdentifier) {
            return this.oid.equals(object);
        }
        return false;
    }

    public byte[] getDER() throws GSSException {
        if (this.derEncoding == null) {
            DerOutputStream derOutputStream = new DerOutputStream();
            derOutputStream.putOID(this.oid);
            this.derEncoding = derOutputStream.toByteArray();
        }
        return (byte[])this.derEncoding.clone();
    }

    public boolean containedIn(Oid[] oidArray) {
        for (int i = 0; i < oidArray.length; ++i) {
            if (!oidArray[i].equals(this)) continue;
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.oid.hashCode();
    }
}

