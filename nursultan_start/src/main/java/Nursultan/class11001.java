/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11001
extends RuntimeException {
    public Object N_0;

    public class11001(String string, String string2) {
        super(string2);
        this.u();
        this.N_0 = string;
    }

    public class11001(String string, String string2, Throwable throwable) {
        super(string2, throwable);
        this.u();
        this.N_0 = string;
    }

    private void u() {
    }

    public String N() {
        return (String)this.N_0;
    }
}

