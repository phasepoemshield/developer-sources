/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class02253
 *  minecraft.class03063
 *  minecraft.class03365
 *  minecraft.class04587
 *  minecraft.class04657
 *  minecraft.class06202
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import minecraft.class02253;
import minecraft.class03063;
import minecraft.class03365;
import minecraft.class04530;
import minecraft.class04553;
import minecraft.class04555;
import minecraft.class04587;
import minecraft.class04657;
import minecraft.class06202;

public class class04578
implements class04555 {
    private final class03063 N;
    private final Set<class04530> y = new ObjectOpenHashSet();
    private final class04587 L = new class04587();

    public class04578(LongSupplier longSupplier, class03063 class030632) {
        this.N = class030632;
        this.y.add(class04553.N(longSupplier));
        this.N();
    }

    private void N() {
        this.y.addAll(class04553.N());
        this.y.add(class04530.N("totalChunks", class02253.field_33879, this.N, class03063::R));
        this.y.add(class04530.N("renderedChunks", class02253.field_33879, this.N, class03063::d));
        this.y.add(class04530.N("lastViewDistance", class02253.field_33879, this.N, class03063::M));
        class03365 class033652 = this.N.i();
        if (class033652 != null) {
            this.y.add(class04530.N("toUpload", class02253.field_33880, class033652, class03365::M));
            this.y.add(class04530.N("freeBufferCount", class02253.field_33880, class033652, class03365::B));
            this.y.add(class04530.N("compileQueueSize", class02253.field_33880, class033652, class03365::R));
        }
        this.y.add(class04530.N("gpuUtilization", class02253.field_37416, class06202.Nq(), class06202::yE));
    }

    @Override
    public Set<class04530> N(Supplier<class04657> supplier) {
        this.y.addAll(this.L.N(supplier));
        return this.y;
    }
}

