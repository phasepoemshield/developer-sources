/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class class09945
extends Authenticator {
    final /* synthetic */ String N;
    final /* synthetic */ String y;

    public class09945(String string, String string2) {
        this.N = string;
        this.y = string2;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(this.N, this.y.toCharArray());
    }
}

