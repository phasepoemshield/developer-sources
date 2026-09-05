/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import minecraft.class04480;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class04497;
import minecraft.class04510;
import org.jspecify.annotations.Nullable;

public class class04482
implements class04490 {
    public static final class04489 y = () -> "";
    private final @Nullable class04482 L;
    private final class04489 u;
    private final Set<class04497> i;

    public String L() {
        ArrayList<class04489> arrayList = new ArrayList<class04489>();
        class04510 class045102 = new class04510(this.u);
        for (class04497 class044972 : this.i) {
            class04482 class044822 = class044972.N();
            while (class044822 != this) {
                arrayList.add(class044822.u);
                class044822 = class044822.L;
            }
            class04510 class045103 = class045102;
            for (int i = arrayList.size() - 1; i >= 0; --i) {
                class045103 = class045103.N((class04489)arrayList.get(i));
            }
            arrayList.clear();
            class045103.L().add(class044972.y());
        }
        return String.join((CharSequence)"\n", class045102.N());
    }

    private class04482(class04482 class044822, class04489 class044892) {
        this.i = class044822.i;
        this.L = class044822;
        this.u = class044892;
    }

    public class04482(class04489 class044892) {
        this.L = null;
        this.i = new LinkedHashSet<class04497>();
        this.u = class044892;
    }

    public class04482() {
        this(y);
    }

    public String y() {
        HashMultimap hashMultimap = HashMultimap.create();
        this.N((arg_0, arg_1) -> ((Multimap)hashMultimap).put(arg_0, arg_1));
        return hashMultimap.asMap().entrySet().stream().map(entry -> " at " + (String)entry.getKey() + ": " + ((Collection)entry.getValue()).stream().map(class04480::N).collect(Collectors.joining("; "))).collect(Collectors.joining("\n"));
    }

    public void N(BiConsumer<String, class04480> biConsumer) {
        ArrayList<class04489> arrayList = new ArrayList<class04489>();
        StringBuilder stringBuilder = new StringBuilder();
        for (class04497 class044972 : this.i) {
            class04482 class044822 = class044972.N();
            while (class044822 != null) {
                arrayList.add(class044822.u);
                class044822 = class044822.L;
            }
            for (int i = arrayList.size() - 1; i >= 0; --i) {
                stringBuilder.append(((class04489)arrayList.get(i)).get());
            }
            biConsumer.accept(stringBuilder.toString(), class044972.y());
            stringBuilder.setLength(0);
            arrayList.clear();
        }
    }

    @Override
    public class04490 N_46(class04489 class044892) {
        return new class04482(this, class044892);
    }

    @Override
    public void N_47(class04480 class044802) {
        this.i.add(new class04497(this, class044802));
    }

    public boolean N() {
        return this.i.isEmpty();
    }
}

