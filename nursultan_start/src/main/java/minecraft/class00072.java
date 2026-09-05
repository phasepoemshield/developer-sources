/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  minecraft.class04942
 *  minecraft.class04980
 */
package minecraft;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00052;
import minecraft.class00064;
import minecraft.class04942;
import minecraft.class04980;

public final class class00072
implements class04942 {
    @SerializedName(value="slotId")
    public int N;
    @SerializedName(value="options")
    @JsonAdapter(value=class00052.class)
    public class04980 y;
    @SerializedName(value="settings")
    public List<class00064> L;

    public class00072(int n, class04980 class049802, List<class00064> list) {
        this.N = n;
        this.y = class049802;
        this.L = list;
    }

    public boolean y() {
        return class00064.N(this.L);
    }

    public static class00072 N(int n) {
        return new class00072(n, class04980.y(), List.of(class00064.N(false)));
    }

    public class00072 N() {
        return new class00072(this.N, this.y.L(), new ArrayList<class00064>(this.L));
    }
}

