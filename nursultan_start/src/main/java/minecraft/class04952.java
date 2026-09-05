/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
package minecraft;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;
import java.util.Objects;
import minecraft.class04961;
import minecraft.class04981;

public class class04952
implements Comparator<class04981> {
    private final String N;

    public class04952(String string) {
        this.N = string;
    }

    @Override
    public int compare(class04981 class049812, class04981 class049813) {
        return ComparisonChain.start().compareTrueFirst(class049812.Z(), class049813.Z()).compareTrueFirst(class049812.R == class04961.field_19435, class049813.R == class04961.field_19435).compareTrueFirst(class049812.E, class049813.E).compareTrueFirst(Objects.equals(class049812.M, this.N), Objects.equals(class049813.M, this.N)).compareFalseFirst(class049812.U, class049813.U).compareTrueFirst(class049812.R == class04961.field_19434, class049813.R == class04961.field_19434).compare(class049812.y, class049813.y).result();
    }
}

