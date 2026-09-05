/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04568
 *  minecraft.class04585
 */
package Nursultan;

import java.util.Objects;
import minecraft.class04568;
import minecraft.class04585;

public class class11930
extends class04568 {
    public class11930(String string, String string2, class04585 class045852) {
        super(string, string2, class045852);
    }

    public boolean equals(Object object) {
        if (!(object instanceof class11930)) {
            return false;
        }
        class11930 class119302 = (class11930)((Object)object);
        return Objects.equals(this.y, class119302.y) && Objects.equals(this.N, class119302.N);
    }

    public int hashCode() {
        return Objects.hash(this.y, this.N);
    }
}

