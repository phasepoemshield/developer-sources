/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ArrayListMultimap
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Multimap
 *  minecraft.class02022
 *  minecraft.class07211
 */
package minecraft;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.List;
import minecraft.class02022;
import minecraft.class07211;
import minecraft.class08496;

public class class08514 {
    private final ImmutableList.Builder<class02022> N = ImmutableList.builder();
    private final Multimap<class07211, class02022> y = ArrayListMultimap.create();

    public class08496 N() {
        ImmutableList var1 = this.N.build();
        if (this.y.isEmpty()) {
            if (var1.isEmpty()) {
                return class08496.field_57012;
            }
            return new class08496((List<class02022>)var1, (List<class02022>)var1, List.of(), List.of(), List.of(), List.of(), List.of(), List.of());
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll((Iterable)var1);
        Collection var3 = this.y.get((Object)class07211.field_11043);
        builder.addAll((Iterable)var3);
        Collection var4 = this.y.get((Object)class07211.field_11035);
        builder.addAll((Iterable)var4);
        Collection var5 = this.y.get((Object)class07211.field_11034);
        builder.addAll((Iterable)var5);
        Collection var6 = this.y.get((Object)class07211.field_11039);
        builder.addAll((Iterable)var6);
        Collection var7 = this.y.get((Object)class07211.field_11036);
        builder.addAll((Iterable)var7);
        Collection var8 = this.y.get((Object)class07211.field_11033);
        builder.addAll((Iterable)var8);
        return class08514.N((List<class02022>)builder.build(), var1.size(), var3.size(), var4.size(), var5.size(), var6.size(), var7.size(), var8.size());
    }

    private static class08496 N(List<class02022> list, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = 0;
        List<class02022> list2 = list.subList(n8, n8 += n);
        List<class02022> list3 = list.subList(n8, n8 += n2);
        List<class02022> list4 = list.subList(n8, n8 += n3);
        List<class02022> list5 = list.subList(n8, n8 += n4);
        List<class02022> list6 = list.subList(n8, n8 += n5);
        List<class02022> list7 = list.subList(n8, n8 += n6);
        List<class02022> list8 = list.subList(n8, n8 + n7);
        return new class08496(list, list2, list3, list4, list5, list6, list7, list8);
    }

    public class08514 N(class02022 class020222) {
        this.N.add((Object)class020222);
        return this;
    }

    public class08514 N(class07211 class072112, class02022 class020222) {
        this.y.put((Object)class072112, (Object)class020222);
        return this;
    }
}

