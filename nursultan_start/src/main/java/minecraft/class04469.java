/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  java.lang.Record
 *  minecraft.class00667
 *  minecraft.class03397
 *  minecraft.class03928
 *  minecraft.class03959
 *  minecraft.class03962
 *  minecraft.class06338
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Function;
import minecraft.class00667;
import minecraft.class03397;
import minecraft.class03928;
import minecraft.class03959;
import minecraft.class03962;
import minecraft.class06338;
import org.jspecify.annotations.Nullable;

public class class04469
extends Record {
    public byte[] N;
    private static String[] L;
    public static Object y_0;
    public static Object y_1;

    public ByteBuffer L() {
        return ByteBuffer.wrap(this.N);
    }

    private static void M() {
        L = new String[2];
        class04469.L[0] = "Invalid message signature size";
        class04469.L[1] = "<no signature>";
    }

    public class04469(byte[] byArray) {
        Preconditions.checkState((byArray.length == 256 ? 1 : 0) != 0, (Object)L[0]);
        this.N = byArray;
    }

    static {
        class04469.M();
        class04469.u();
        Function<byte[], class04469> function = class04469::new;
        y_0 = class06338.d.xmap(function, class04469::y);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof class04469)) return false;
        class04469 class044692 = (class04469)((Object)object);
        if (!Arrays.equals(this.N, class044692.N)) return false;
        return true;
    }

    public String toString() {
        return Base64.getEncoder().encodeToString(this.N);
    }

    public int hashCode() {
        return Arrays.hashCode(this.N);
    }

    private static void u() {
        y_1 = 256;
    }

    public byte[] y() {
        return this.N;
    }

    public class03928 N(class03397 class033972) {
        int n = class033972.N(this);
        return n != -1 ? new class03928(n) : new class03928(this);
    }

    public static String N(@Nullable class04469 class044692) {
        if (class044692 == null) {
            return L[1];
        }
        return class044692.toString();
    }

    public static void N(class00667 class006672, class04469 class044692) {
        class006672.writeBytes(class044692.N);
    }

    public int N() {
        return Arrays.hashCode(this.N);
    }

    public boolean N(class03962 class039622, class03959 class039592) {
        return class039622.validate(class039592, this.N);
    }

    public static class04469 N(class00667 class006672) {
        byte[] byArray = new byte[256];
        class006672.readBytes(byArray);
        return new class04469(byArray);
    }
}

