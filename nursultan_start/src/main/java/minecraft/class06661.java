/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class04770
 *  minecraft.class07280
 */
package minecraft;

import com.google.common.base.MoreObjects;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class04770;
import minecraft.class06641;
import minecraft.class06669;
import minecraft.class06680;
import minecraft.class07280;

public class class06661
implements class00381<class07280> {
    public static final class02362<class04247, class06661> N = class00381.N(class06661::N, class06661::new);
    private final EnumSet<class06680> y;
    private final List<class06669> L;

    public List<class06669> L() {
        return this.y.contains((Object)class06680.field_29136) ? this.L : List.of();
    }

    private class06661(class04247 class042472) {
        this.y = class042472.N(class06680.class);
        this.L = class042472.N_16(class006672 -> {
            class06641 class066412 = new class06641(class006672.m());
            Iterator var3 = this.y.iterator();
            while (var3.hasNext()) {
                ((class06680)((Object)((Object)var3.next()))).field_40701.read(class066412, (class04247)class006672);
            }
            return class066412.N();
        });
    }

    public class06661(EnumSet<class06680> enumSet, Collection<class04770> collection) {
        this.y = enumSet;
        this.L = collection.stream().map(class06669::new).toList();
    }

    public class06661(class06680 class066802, class04770 class047702) {
        this.y = EnumSet.of(class066802);
        this.L = List.of(new class06669(class047702));
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("actions", this.y).add("entries", this.L).toString();
    }

    public List<class06669> y() {
        return this.L;
    }

    public EnumSet<class06680> N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class04247 class042472) {
        class042472.N(this.y, class06680.class);
        class042472.N_12(this.L, (class006672, class066692) -> {
            class006672.N(class066692.N());
            Iterator var3 = this.y.iterator();
            while (var3.hasNext()) {
                ((class06680)((Object)((Object)var3.next()))).field_40702.write((class04247)class006672, (class06669)((Object)class066692));
            }
        });
    }

    public static class06661 N(Collection<class04770> collection) {
        EnumSet<class06680[]> enumSet = EnumSet.of(class06680.field_29136, new class06680[]{class06680.field_40699, class06680.field_29137, class06680.field_40700, class06680.field_29138, class06680.field_29139, class06680.field_54981, class06680.field_52324});
        return new class06661(enumSet, collection);
    }

    public class02897<class06661> method_65080() {
        return class04248.NE;
    }
}

