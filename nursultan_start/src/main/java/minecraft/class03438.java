/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07074
 */
package minecraft;

import java.io.PrintWriter;
import java.io.StringWriter;
import minecraft.class07074;

class class03438 {
    private final Throwable N;

    class03438(Throwable throwable) {
        this.N = throwable;
    }

    public void N(class07074 class070742) {
        class070742.N("Recovery", (Object)"Yes");
        class070742.N("Recovery reason", () -> {
            StringWriter stringWriter = new StringWriter();
            this.N.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        });
    }
}

