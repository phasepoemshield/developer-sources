/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package kotakbaz.rain.client.render.main.exceptions;

import lombok.Generated;

/*
 * Renamed from kotakbaz.rain.client.render.main.exceptions.a
 */
public class a_0
extends RuntimeException {
    protected final String A;
    protected final String b;
    protected final String[] B;
    protected final String[] c;

    public a_0(String string, String string2, String[] stringArray, String[] stringArray2) {
        super();
        this.A = string;
        this.b = string2;
        this.B = stringArray;
        this.c = stringArray2;
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

