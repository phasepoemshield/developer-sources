/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.net.URI;
import minecraft.class07533;

final class class07531
extends class07533 {
    class07531(String string, int n, String string2) {
    }

    @Override
    protected String[] y(URI uRI) {
        return new String[]{"rundll32", "url.dll,FileProtocolHandler", uRI.toString()};
    }
}

