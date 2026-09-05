/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03428
 *  minecraft.class04452
 *  minecraft.class05936
 *  minecraft.class06478
 *  minecraft.class07536
 *  minecraft.class09033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03428;
import minecraft.class04452;
import minecraft.class05936;
import minecraft.class06478;
import minecraft.class07536;
import minecraft.class09033;
import org.jspecify.annotations.Nullable;

public class class01860
extends class06478 {
    private final class01590 N;

    public class01860(class01590 class015902, class00392 class003922) {
        int n = class015902.N((class05936)class003922);
        Objects.requireNonNull(class015902);
        super(0, 0, n, 27, class003922);
        this.N = class015902;
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        return null;
    }

    public boolean method_37303() {
        return false;
    }

    protected void method_47399(class03428 class034282) {
    }

    public void method_25354(class09033 class090332) {
    }

    protected void method_48579(class01054 class010542, int n, int n2, float f) {
        int n3 = this.method_46426() + this.method_25368() / 2;
        int n4 = this.method_46427() + this.method_25364() / 2;
        class00392 class003922 = this.method_25369();
        int n5 = n3 - this.N.N((class05936)class003922) / 2;
        Objects.requireNonNull(this.N);
        class010542.y(this.N, class003922, n5, n4 - 9, -1);
        String string = class04452.N((long)class07536.L());
        int n6 = n3 - this.N.y(string) / 2;
        Objects.requireNonNull(this.N);
        class010542.y(this.N, string, n6, n4 + 9, -8355712);
    }
}

