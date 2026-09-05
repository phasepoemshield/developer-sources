/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  minecraft.class00251
 *  minecraft.class00257
 *  minecraft.class00268
 *  minecraft.class00278
 *  minecraft.class00381
 *  minecraft.class03729
 *  minecraft.class04770
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class06912
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00251;
import minecraft.class00257;
import minecraft.class00268;
import minecraft.class00278;
import minecraft.class00381;
import minecraft.class03729;
import minecraft.class04770;
import minecraft.class04915;
import minecraft.class04919;
import minecraft.class04930;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class06912;
import org.slf4j.Logger;

public class class04912
extends class04919 {
    public static final String y = "recipeBook";
    private static final Logger i = LogUtils.getLogger();
    private final class04915 R;
    protected final Set<class05946<class06521<?>>> L = Sets.newIdentityHashSet();
    protected final Set<class05946<class06521<?>>> u = Sets.newIdentityHashSet();

    public void L(class05946<class06521<?>> class059462) {
        this.L.remove(class059462);
        this.u.remove(class059462);
    }

    public class04912(class04915 class049152) {
        this.R = class049152;
    }

    private void i(class05946<class06521<?>> class059462) {
        this.u.add(class059462);
    }

    public void u(class05946<class06521<?>> class059462) {
        this.u.remove(class059462);
    }

    public int y(Collection<class03729<?>> collection, class04770 class047702) {
        ArrayList arrayList = Lists.newArrayList();
        Iterator<class03729<?>> iterator = collection.iterator();
        while (iterator.hasNext()) {
            class05946 var6 = iterator.next().N();
            if (!this.L.contains(var6)) continue;
            this.L(var6);
            this.R.displaysForRecipe(var6, class002952 -> arrayList.add(class002952.N()));
        }
        if (!arrayList.isEmpty()) {
            class047702.field_13987.method_14364((class00381)new class00257((List)arrayList));
        }
        return arrayList.size();
    }

    public boolean y(class05946<class06521<?>> class059462) {
        return this.L.contains(class059462);
    }

    public void N(class04930 class049302, Predicate<class05946<class06521<?>>> predicate) {
        this.N.N(class049302.N());
        this.N(class049302.y(), this.L::add, predicate);
        this.N(class049302.L(), this.u::add, predicate);
    }

    private void N(class04930 class049302) {
        this.L.clear();
        this.u.clear();
        this.N.N(class049302.N());
        this.L.addAll(class049302.y());
        this.u.addAll(class049302.L());
    }

    public void N(class04770 class047702) {
        class047702.field_13987.method_14364((class00381)new class00251(this.u().N()));
        ArrayList arrayList = new ArrayList(this.L.size());
        for (class05946<class06521<?>> var4 : this.L) {
            this.R.displaysForRecipe(var4, class002952 -> arrayList.add(new class00268(class002952, false, this.u.contains(var4))));
        }
        class047702.field_13987.method_14364((class00381)new class00278(arrayList, true));
    }

    public int N(Collection<class03729<?>> collection, class04770 class047702) {
        ArrayList arrayList = new ArrayList();
        for (class03729<?> class037292 : collection) {
            class05946 var6 = class037292.N();
            if (this.L.contains(var6) || class037292.y().method_8118()) continue;
            this.N(var6);
            this.i(var6);
            this.R.displaysForRecipe(var6, class002952 -> arrayList.add(new class00268(class002952, class037292.y().L(), true)));
            class06912.M.N(class047702, class037292);
        }
        if (!arrayList.isEmpty()) {
            class047702.field_13987.method_14364((class00381)new class00278(arrayList, false));
        }
        return arrayList.size();
    }

    private void N(List<class05946<class06521<?>>> list, Consumer<class05946<class06521<?>>> consumer, Predicate<class05946<class06521<?>>> predicate) {
        for (class05946<class06521<?>> class059462 : list) {
            if (!predicate.test(class059462)) {
                i.error("Tried to load unrecognized recipe: {} removed now.", class059462);
                continue;
            }
            consumer.accept(class059462);
        }
    }

    public void N(class05946<class06521<?>> class059462) {
        this.L.add(class059462);
    }

    public void N(class04912 class049122) {
        this.N(class049122.N());
    }

    public class04930 N() {
        return new class04930(this.N.N(), List.copyOf(this.L), List.copyOf(this.u));
    }
}

