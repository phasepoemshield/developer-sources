/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet
 *  minecraft.class04306
 *  minecraft.class04309
 *  minecraft.class04325
 *  minecraft.class04327
 *  minecraft.class07209
 */
package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;
import minecraft.class04306;
import minecraft.class04309;
import minecraft.class04325;
import minecraft.class04327;
import minecraft.class07209;

public class class05688<T>
implements class04325<T>,
class04327<T> {
    private final List<class04306<T>> N = Lists.newArrayList();
    private final Set<class04306<?>> y = new ObjectOpenCustomHashSet(class04306.N);

    public List<class04306<T>> y() {
        return List.copyOf(this.N);
    }

    public static <T> class05688<T> N(List<class04306<T>> list) {
        class05688<T> class056882 = new class05688<T>();
        list.forEach(class056882::N);
        return class056882;
    }

    public List<class04306<T>> N(long l) {
        return this.N;
    }

    public int N() {
        return this.N.size();
    }

    public boolean N(class07209 class072092, T t) {
        return this.y.contains(class04306.N(t, (class07209)class072092));
    }

    private void N(class04306<T> class043062) {
        if (this.y.add(class043062)) {
            this.N.add(class043062);
        }
    }

    public void N(class04309<T> class043092) {
        class04306 class043062 = new class04306(class043092.N(), class043092.y(), 0, class043092.u());
        this.N(class043062);
    }
}

