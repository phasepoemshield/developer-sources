/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.UnmodifiableIterator
 *  dev.isxander.yacl3.mixin.TabNavigationBarAccessor
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class01295
 *  minecraft.class01885
 *  minecraft.class02089
 *  minecraft.class02102
 *  minecraft.class02106
 *  minecraft.class03241
 *  minecraft.class03251
 *  minecraft.class03255
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class03434
 *  minecraft.class03457
 *  minecraft.class03567
 *  minecraft.class03669
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class04664
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class06478
 *  minecraft.class06601
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import dev.isxander.yacl3.mixin.TabNavigationBarAccessor;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class01295;
import minecraft.class01885;
import minecraft.class02089;
import minecraft.class02102;
import minecraft.class02106;
import minecraft.class03241;
import minecraft.class03251;
import minecraft.class03255;
import minecraft.class03271;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class03434;
import minecraft.class03457;
import minecraft.class03567;
import minecraft.class03669;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class04664;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class06478;
import minecraft.class06601;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class03281
extends class04664
implements class01294,
class03434,
TabNavigationBarAccessor {
    private static final int field_42489 = -1;
    private static final int field_43076 = 400;
    private static final int field_43077 = 24;
    private static final int field_43078 = 14;
    private static final class00392 field_43079 = class00392.L((String)"narration.tab_navigation.usage");
    private final class01885 field_43080 = class01885.i();
    private int field_42145;
    private final class03271 field_42146;
    private final ImmutableList<class03241> field_42147;
    private final ImmutableList<class03567> field_42148;

    public class03281(int n, class03271 class032712, Iterable<class03241> iterable) {
        this.field_42145 = n;
        this.field_42146 = class032712;
        this.field_42147 = ImmutableList.copyOf(iterable);
        this.field_43080.L().y();
        ImmutableList.Builder builder = ImmutableList.builder();
        for (class03241 class032412 : iterable) {
            builder.add((Object)((class03567)this.field_43080.N((class02102)new class03567(class032712, class032412, 0, 24))));
        }
        this.field_42148 = builder.build();
    }

    public void method_48618(int n) {
        this.field_42145 = n;
    }

    public List<class03241> method_71284() {
        return this.field_42147;
    }

    public void method_48987(int n, boolean bl) {
        if (this.method_25370()) {
            this.method_25395((class04654)this.field_42148.get(n));
        } else if (((class03567)this.field_42148.get(n)).method_37303()) {
            this.field_42146.N((class03241)this.field_42147.get(n), bl);
        }
    }

    public void method_71522(int n, boolean bl) {
        if (n >= 0 && n < this.field_42148.size()) {
            ((class03567)this.field_42148.get((int)n)).field_22763 = bl;
        }
    }

    public void method_49613() {
        int n = Math.min(400, this.field_42145) - 28;
        int n2 = class04995.i((int)(n / this.field_42147.size()), (int)2);
        UnmodifiableIterator var3 = this.field_42148.iterator();
        while (var3.hasNext()) {
            ((class03567)var3.next()).method_25358(n2);
        }
        this.field_43080.N();
        this.field_43080.method_46421(class04995.i((int)((this.field_42145 - n) / 2), (int)2));
        this.field_43080.method_46419(0);
    }

    public static class03669 method_48623(class03271 class032712, int n) {
        return new class03669(class032712, n);
    }

    public void method_71521(int n, @Nullable class04141 class041412) {
        if (n >= 0 && n < this.field_42148.size()) {
            ((class03567)this.field_42148.get(n)).method_47400(class041412);
        }
    }

    public List<? extends class04654> method_25396() {
        return this.field_42148;
    }

    public boolean method_25404(class06601 class066012) {
        int n;
        if (class066012.P() && (n = this.method_48990(class066012)) != -1) {
            this.method_48987(class04995.N((int)n, (int)0, (int)(this.field_42147.size() - 1)), true);
            return true;
        }
        return false;
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        class03567 class035672;
        if (!this.method_25370() && (class035672 = this.method_49615()) != null) {
            return class02106.N((class01295)this, (class02106)class02106.N((class04654)class035672));
        }
        if (class020892 instanceof class03251) {
            return null;
        }
        return super.method_48205(class020892);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, class05096.field_49895, 0, this.field_43080.method_46427() + this.field_43080.method_25364() - 2, 0.0f, 0.0f, ((class03567)this.field_42148.get(0)).method_46426(), 2, 32, 2);
        int n3 = ((class03567)this.field_42148.get(this.field_42148.size() - 1)).method_55442();
        class010542.N(class08394.Na, class05096.field_49895, n3, this.field_43080.method_46427() + this.field_43080.method_25364() - 2, 0.0f, 0.0f, this.field_42145, 2, 32, 2);
        UnmodifiableIterator var6 = this.field_42148.iterator();
        while (var6.hasNext()) {
            ((class03567)var6.next()).method_25394(class010542, n, n2, f);
        }
    }

    public void method_37020(class03428 class034282) {
        this.field_42148.stream().filter(class06478::method_49606).findFirst().or(() -> Optional.ofNullable(this.method_49615())).ifPresent(class035672 -> {
            this.method_49612(class034282.N(), (class03567)class035672);
            class035672.method_37020(class034282);
        });
        if (this.method_25370()) {
            class034282.N(class03457.field_33791, field_43079);
        }
    }

    public class03255 method_48202() {
        return this.field_43080.method_48202();
    }

    public class03432 method_37018() {
        return this.field_42148.stream().map(class06478::method_37018).max(Comparator.naturalOrder()).orElse(class03432.field_33784);
    }

    public boolean method_25405(double d, double d2) {
        return d >= (double)this.field_43080.method_46426() && d2 >= (double)this.field_43080.method_46427() && d < (double)(this.field_43080.method_46426() + this.field_43080.method_25368()) && d2 < (double)(this.field_43080.method_46427() + this.field_43080.method_25364());
    }

    public void method_25365(boolean bl) {
        super.method_25365(bl);
        if (this.method_25399() != null) {
            this.method_25395(null);
        }
    }

    public void method_25395(@Nullable class04654 class046542) {
        class03567 class035672;
        super.method_25395(class046542);
        if (class046542 instanceof class03567 && (class035672 = (class03567)class046542).method_37303()) {
            this.field_42146.N(class035672.y(), true);
        }
    }

    public /* synthetic */ ImmutableList yacl$getTabButtons() {
        return this.field_42148;
    }

    private int method_48990(class06601 class066012) {
        return this.method_71520(this.method_48989(), class066012);
    }

    public /* synthetic */ int yacl$getWidth() {
        return this.field_42145;
    }

    public /* synthetic */ class01885 yacl$getLayout() {
        return this.field_43080;
    }

    private int method_71520(int n, class06601 class066012) {
        int n2 = class066012.U();
        if (n2 != -1) {
            return Math.floorMod(n2 - 1, 10);
        }
        if (class066012.z() && n != -1) {
            int n3 = Math.floorMod(class066012.W() ? n - 1 : n + 1, this.field_42147.size());
            if (((class03567)this.field_42148.get((int)n3)).field_22763) {
                return n3;
            }
            return this.method_71520(n3, class066012);
        }
        return -1;
    }

    public /* synthetic */ ImmutableList yacl$getTabs() {
        return this.field_42147;
    }

    private @Nullable class03567 method_49615() {
        int n = this.method_48989();
        return n != -1 ? (class03567)this.field_42148.get(n) : null;
    }

    public /* synthetic */ class03271 yacl$getTabManager() {
        return this.field_42146;
    }

    private int method_48989() {
        class03241 class032412 = this.field_42146.N();
        int n = this.field_42147.indexOf((Object)class032412);
        return n != -1 ? n : -1;
    }

    protected void method_49612(class03428 class034282, class03567 class035672) {
        int n;
        if (this.field_42147.size() > 1 && (n = this.field_42148.indexOf((Object)class035672)) != -1) {
            class034282.N(class03457.field_33789, (class00392)class00392.N((String)"narrator.position.tab", (Object[])new Object[]{n + 1, this.field_42147.size()}));
        }
    }
}

