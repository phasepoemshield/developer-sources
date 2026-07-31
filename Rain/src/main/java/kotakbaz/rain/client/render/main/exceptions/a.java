/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.exceptions;

import lombok.Generated;

public class a
extends RuntimeException {
    protected final String A;
    protected final String b;
    protected final String[] B;
    protected final String[] c;

    public a(String description, String details, String[] reasons, String[] solutions) {
        this.A = description;
        this.b = details;
        this.B = reasons;
        this.c = solutions;
    }

    @Generated
    public String getDescription() {
        return this.A;
    }

    @Generated
    public String getDetails() {
        return this.b;
    }

    @Generated
    public String[] getReasons() {
        return this.B;
    }

    @Generated
    public String[] getSolutions() {
        return this.c;
    }
}

