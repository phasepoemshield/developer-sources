/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  minecraft.class01029
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04336
 *  minecraft.class07829
 *  minecraft.class07852
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import minecraft.class01029;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04336;
import minecraft.class07829;
import minecraft.class07852;

public class class05448 {
    private final List<class03556<class07829<?>>> N = new ArrayList();
    private final List<List<class03556<class04336>>> y = new ArrayList<List<class03556<class04336>>>();

    public class05448 N(class03556<class07829<?>> class035562) {
        this.N.add(class035562);
        return this;
    }

    private void N(int n) {
        while (this.y.size() <= n) {
            this.y.add(Lists.newArrayList());
        }
    }

    public class01029 N() {
        return new class01029((class03543)class03543.N(this.N), (List)this.y.stream().map(class03543::N).collect(ImmutableList.toImmutableList()));
    }

    public class05448 N(int n, class03556<class04336> class035562) {
        this.N(n);
        this.y.get(n).add(class035562);
        return this;
    }

    public class05448 N(class07852 class078522, class03556<class04336> class035562) {
        return this.N(class078522.ordinal(), class035562);
    }
}

