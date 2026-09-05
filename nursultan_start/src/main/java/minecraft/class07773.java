/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import minecraft.class07709;

interface class07773 {
    public int N(class07709 var1);

    default public List<class07709> N(List<class07709> list) {
        return this.N(list, this::N);
    }

    default public List<class07709> N_84(List<class07709> list2, Supplier<class07709> supplier) {
        return this.N(list2, (class07709 class077092, List<class07709> list) -> this.N((class07709)class077092, supplier, (List<class07709>)list));
    }

    default public List<class07709> N(List<class07709> list, BiConsumer<class07709, List<class07709>> biConsumer) {
        ArrayList arrayList = Lists.newArrayList();
        for (class07709 class077092 : list) {
            biConsumer.accept(class077092, arrayList);
        }
        return arrayList;
    }

    public void N(class07709 var1, List<class07709> var2);

    public void N(class07709 var1, Supplier<class07709> var2, List<class07709> var3);

    public class07709 N();

    public int N(class07709 var1, Supplier<class07709> var2);
}

