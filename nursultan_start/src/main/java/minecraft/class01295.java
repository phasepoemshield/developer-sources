/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class02116
 *  minecraft.class03249
 *  minecraft.class03251
 *  minecraft.class03255
 *  minecraft.class03281
 *  minecraft.class03283
 *  minecraft.class03287
 *  minecraft.class04654
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class06626
 *  org.joml.Vector2i
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class02116;
import minecraft.class03249;
import minecraft.class03251;
import minecraft.class03255;
import minecraft.class03281;
import minecraft.class03283;
import minecraft.class03287;
import minecraft.class04654;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class06626;
import org.joml.Vector2i;
import org.jspecify.annotations.Nullable;

public interface class01295
extends class04654 {
    default public @Nullable class02106 B() {
        class04654 class046542 = this.method_25399();
        if (class046542 != null) {
            return class02106.N((class01295)this, (class02106)class046542.B());
        }
        return null;
    }

    private @Nullable class02106 y(class03255 class032552, class03249 class032492, @Nullable class04654 class046542, class02089 class020892) {
        class03255 class032553;
        class03287 class032872 = class032492.N();
        class03287 class032873 = class032872.N();
        ArrayList<Pair> arrayList = new ArrayList<Pair>();
        class03283 class032832 = class03283.N((class03287)class032872, (int)class032552.y(class032492), (int)class032552.y(class032873));
        class01295 class012952 = this;
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class032492);
        class032492 = (class03249)localRefImpl.dispose();
        for (class04654 class046543 : this.N(class012952, (LocalRef)localRefImpl)) {
            class03283 class032833;
            if (class046543 == class046542 || !class032492.N((class032833 = class03283.N((class03287)class032872, (int)(class032553 = class046543.method_48202()).y(class032492.y()), (int)class032553.y(class032873))).N(class032872), class032832.N(class032872))) continue;
            long l = Vector2i.distanceSquared((int)class032832.N(), (int)class032832.y(), (int)class032833.N(), (int)class032833.y());
            arrayList.add(Pair.of((Object)class046543, (Object)l));
        }
        arrayList.sort(Comparator.comparingDouble(Pair::getSecond));
        for (Pair pair : arrayList) {
            class032553 = ((class04654)pair.getFirst()).method_48205(class020892);
            if (class032553 == null) continue;
            return class032553;
        }
        return null;
    }

    private @Nullable class02106 N(class02116 class021162) {
        class04654 class046542 = this.method_25399();
        if (class046542 == null) {
            class03249 class032492 = class021162.y();
            class03255 class032552 = this.N_49(class032492.y());
            return class02106.N((class01295)this, (class02106)this.N(class032552, class032492, null, (class02089)class021162));
        }
        class03255 class032553 = class046542.method_48202();
        return class02106.N((class01295)this, (class02106)this.N(class032553, class021162.y(), class046542, (class02089)class021162));
    }

    private @Nullable class02106 N(class03251 class032512) {
        Supplier<class04654> supplier;
        BooleanSupplier booleanSupplier;
        boolean bl = class032512.y();
        class04654 class046543 = this.method_25399();
        ArrayList<? extends class04654> arrayList = new ArrayList<class04654>(this.method_25396());
        Collections.sort(arrayList, Comparator.comparingInt(class046542 -> class046542.method_48590()));
        int n = arrayList.indexOf(class046543);
        int n2 = class046543 != null && n >= 0 ? n + (bl ? 1 : 0) : (bl ? 0 : arrayList.size());
        ListIterator listIterator = arrayList.listIterator(n2);
        BooleanSupplier booleanSupplier2 = bl ? listIterator::hasNext : (booleanSupplier = listIterator::hasPrevious);
        Supplier<class04654> supplier2 = bl ? listIterator::next : (supplier = listIterator::previous);
        while (booleanSupplier.getAsBoolean()) {
            class02106 class021062 = supplier.get().method_48205((class02089)class032512);
            if (class021062 == null) continue;
            return class02106.N((class01295)this, (class02106)class021062);
        }
        return null;
    }

    private @Nullable class02106 N(class03255 class032552, class03249 class032492, @Nullable class04654 class046543, class02089 class020892) {
        Object object22;
        class03287 class032872 = class032492.N().N();
        class03249 class032493 = class032872.y();
        int n = class032552.y(class032492.y());
        ArrayList<Object> arrayList = new ArrayList<Object>();
        class01295 class012952 = this;
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class032492);
        class032492 = (class03249)localRefImpl.dispose();
        for (Object object22 : this.N(class012952, (LocalRef)localRefImpl)) {
            Object object3;
            if (object22 == class046543 || !(object3 = object22.method_48202()).N(class032552, class032872)) continue;
            int n2 = object3.y(class032492.y());
            if (class032492.N(n2, n)) {
                arrayList.add(object22);
                continue;
            }
            if (n2 != n || !class032492.N(object3.y(class032492), class032552.y(class032492))) continue;
            arrayList.add(object22);
        }
        Comparator<class04654> comparator = Comparator.comparing(class046542 -> class046542.method_48202().y(class032492.y()), class032492.u());
        object22 = Comparator.comparing(class046542 -> class046542.method_48202().y(class032493.y()), class032493.u());
        arrayList.sort(comparator.thenComparing((Comparator<class04654>)object22));
        for (class04654 class046544 : arrayList) {
            class02106 class021062 = class046544.method_48205(class020892);
            if (class021062 == null) continue;
            return class021062;
        }
        return this.y(class032552, class032492, class046543, class020892);
    }

    default public List N(class01295 class012952, LocalRef localRef) {
        return this.N(class012952, (class03249)localRef.get());
    }

    default public List N(class01295 class012952, class03249 class032492) {
        if (class032492.N() == class03287.field_41822) {
            return class012952.method_25396().stream().filter(class046542 -> !(class046542 instanceof class03281)).toList();
        }
        return class012952.method_25396();
    }

    public List<? extends class04654> method_25396();

    default public boolean method_25404(class06601 class066012) {
        return this.method_25399() != null && this.method_25399().method_25404(class066012);
    }

    public @Nullable class04654 method_25399();

    default public @Nullable class02106 method_48205(class02089 class020892) {
        class02106 class021062;
        class04654 class046542 = this.method_25399();
        if (class046542 != null && (class021062 = class046542.method_48205(class020892)) != null) {
            return class02106.N((class01295)this, (class02106)class021062);
        }
        if (class020892 instanceof class03251) {
            class021062 = (class03251)class020892;
            return this.N((class03251)class021062);
        }
        if (class020892 instanceof class02116) {
            class021062 = (class02116)class020892;
            return this.N((class02116)class021062);
        }
        return null;
    }

    default public boolean method_25403(class06613 class066132, double d, double d2) {
        if (this.method_25399() != null && this.method_25397() && class066132.v() == 0) {
            return this.method_25399().method_25403(class066132, d, d2);
        }
        return false;
    }

    default public boolean method_25401(double d, double d2, double d3, double d4) {
        return this.method_19355(d, d2).filter(class046542 -> class046542.method_25401(d, d2, d3, d4)).isPresent();
    }

    default public boolean method_25400(class06626 class066262) {
        return this.method_25399() != null && this.method_25399().method_25400(class066262);
    }

    default public void method_25365(boolean bl) {
    }

    public void method_25395(@Nullable class04654 var1);

    public void method_25398(boolean var1);

    default public boolean method_25370() {
        return this.method_25399() != null;
    }

    default public boolean method_25406(class06613 class066132) {
        if (class066132.v() == 0 && this.method_25397()) {
            this.method_25398(false);
            if (this.method_25399() != null) {
                return this.method_25399().method_25406(class066132);
            }
        }
        return false;
    }

    default public Optional<class04654> method_19355(double d, double d2) {
        for (class04654 class046542 : this.method_25396()) {
            if (!class046542.method_25405(d, d2)) continue;
            return Optional.of(class046542);
        }
        return Optional.empty();
    }

    public boolean method_25397();

    default public boolean method_25402(class06613 class066132, boolean bl) {
        Optional<class04654> var3 = this.method_19355(class066132.n(), class066132.t());
        if (var3.isEmpty()) {
            return false;
        }
        class04654 class046542 = var3.get();
        if (class046542.method_25402(class066132, bl) && class046542.M()) {
            this.method_25395(class046542);
            if (class066132.v() == 0) {
                this.method_25398(true);
            }
        }
        return true;
    }

    default public boolean method_16803(class06601 class066012) {
        return this.method_25399() != null && this.method_25399().method_16803(class066012);
    }
}

