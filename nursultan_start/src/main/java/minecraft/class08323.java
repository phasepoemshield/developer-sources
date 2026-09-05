/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  minecraft.class07001
 *  minecraft.class08299
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.AbstractIterator;
import java.util.ListIterator;
import minecraft.class07001;
import minecraft.class08299;
import minecraft.class08316;
import org.jspecify.annotations.Nullable;

class class08323
extends AbstractIterator<class08299> {
    final /* synthetic */ ListIterator N;
    final /* synthetic */ class08316 y;

    class08323(class08316 class083162, ListIterator listIterator) {
        this.y = class083162;
        this.N = listIterator;
    }

    protected @Nullable class08299 computeNext() {
        if (this.N.hasNext()) {
            int n = this.N.nextIndex();
            class07001 class070012 = (class07001)this.N.next();
            return this.y.N(n, class070012);
        }
        return (class08299)this.endOfData();
    }
}

