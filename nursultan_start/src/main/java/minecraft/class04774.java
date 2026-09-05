/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class04995
 *  minecraft.class06685
 *  minecraft.class06687
 *  minecraft.class06702
 *  minecraft.class07254
 */
package minecraft;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class04770;
import minecraft.class04995;
import minecraft.class06685;
import minecraft.class06687;
import minecraft.class06702;
import minecraft.class07254;

public class class04774
extends class06687 {
    private final Set<class04770> B = Sets.newHashSet();
    private final Set<class04770> Z = Collections.unmodifiableSet(this.B);
    private boolean z = true;

    public class06687 L(boolean bl) {
        if (bl != this.M) {
            super.L(bl);
            this.N(class07254::i);
        }
        return this;
    }

    public boolean P() {
        return this.z;
    }

    public class04774(class00392 class003922, class06685 class066852, class06702 class067022) {
        super(class04995.N(), class003922, class066852, class067022);
    }

    public Collection<class04770> s() {
        return this.Z;
    }

    public void z() {
        if (!this.B.isEmpty()) {
            for (class04770 class047702 : Lists.newArrayList(this.B)) {
                this.y(class047702);
            }
        }
    }

    public void u(boolean bl) {
        if (bl != this.z) {
            this.z = bl;
            Iterator<class04770> var2 = this.B.iterator();
            while (var2.hasNext()) {
                var2.next().field_13987.method_14364((class00381)(bl ? class07254.N((class06687)this) : class07254.N((UUID)this.N())));
            }
        }
    }

    public class06687 y(boolean bl) {
        if (bl != this.R) {
            super.y(bl);
            this.N(class07254::i);
        }
        return this;
    }

    public void y(class04770 class047702) {
        if (this.B.remove((Object)class047702) && this.z) {
            class047702.field_13987.method_14364((class00381)class07254.N((UUID)this.N()));
        }
    }

    public void N(class00392 class003922) {
        if (!Objects.equal((Object)class003922, (Object)this.N)) {
            super.N(class003922);
            this.N(class07254::L);
        }
    }

    public void N(float f) {
        if (f != this.y) {
            super.N(f);
            this.N(class07254::y);
        }
    }

    public class06687 N(boolean bl) {
        if (bl != this.i) {
            super.N(bl);
            this.N(class07254::i);
        }
        return this;
    }

    public void N(class06702 class067022) {
        if (class067022 != this.u) {
            super.N(class067022);
            this.N(class07254::u);
        }
    }

    public void N(class06685 class066852) {
        if (class066852 != this.L) {
            super.N(class066852);
            this.N(class07254::u);
        }
    }

    private void N(Function<class06687, class07254> function) {
        if (this.z) {
            class07254 class072542 = function.apply(this);
            Iterator<class04770> var3 = this.B.iterator();
            while (var3.hasNext()) {
                var3.next().field_13987.method_14364((class00381)class072542);
            }
        }
    }

    public void N(class04770 class047702) {
        if (this.B.add(class047702) && this.z) {
            class047702.field_13987.method_14364((class00381)class07254.N((class06687)this));
        }
    }
}

