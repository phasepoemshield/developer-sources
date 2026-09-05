/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class03927
 *  minecraft.class03949
 *  minecraft.class04227
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05369
 *  minecraft.class05946
 *  minecraft.class06570
 *  minecraft.class06581
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class00751;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class03927;
import minecraft.class03949;
import minecraft.class04227;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05369;
import minecraft.class05946;
import minecraft.class06570;
import minecraft.class06581;
import org.jspecify.annotations.Nullable;

public final class class05672
extends Record {
    private final class00392 name;
    private final Predicate<class03556<class05369>> heldJobSite;
    private final Predicate<class03556<class05369>> acquirableJobSite;
    private final ImmutableSet<class06581> requestedItems;
    private final ImmutableSet<class00891> secondaryPoi;
    private final @Nullable class04891 workSound;
    public static final Predicate<class03556<class05369>> N = class035562 -> class035562.N(class03949.N);
    public static final class05946<class05672> y = class05672.N("none");
    public static final class05946<class05672> L = class05672.N("armorer");
    public static final class05946<class05672> u = class05672.N("butcher");
    public static final class05946<class05672> i = class05672.N("cartographer");
    public static final class05946<class05672> R = class05672.N("cleric");
    public static final class05946<class05672> M = class05672.N("farmer");
    public static final class05946<class05672> B = class05672.N("fisherman");
    public static final class05946<class05672> Z = class05672.N("fletcher");
    public static final class05946<class05672> z = class05672.N("leatherworker");
    public static final class05946<class05672> U = class05672.N("librarian");
    public static final class05946<class05672> E = class05672.N("mason");
    public static final class05946<class05672> W = class05672.N("nitwit");
    public static final class05946<class05672> m = class05672.N("shepherd");
    public static final class05946<class05672> P = class05672.N("toolsmith");
    public static final class05946<class05672> s = class05672.N("weaponsmith");

    public Predicate<class03556<class05369>> L() {
        return this.acquirableJobSite;
    }

    public class05672(class00392 class003922, Predicate<class03556<class05369>> predicate, Predicate<class03556<class05369>> predicate2, ImmutableSet<class06581> immutableSet, ImmutableSet<class00891> immutableSet2, @Nullable class04891 class048912) {
        this.name = class003922;
        this.heldJobSite = predicate;
        this.acquirableJobSite = predicate2;
        this.requestedItems = immutableSet;
        this.secondaryPoi = immutableSet2;
        this.workSound = class048912;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05672.class, "name;heldJobSite;acquirableJobSite;requestedItems;secondaryPoi;workSound", "name", "heldJobSite", "acquirableJobSite", "requestedItems", "secondaryPoi", "workSound"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05672.class, "name;heldJobSite;acquirableJobSite;requestedItems;secondaryPoi;workSound", "name", "heldJobSite", "acquirableJobSite", "requestedItems", "secondaryPoi", "workSound"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05672.class, "name;heldJobSite;acquirableJobSite;requestedItems;secondaryPoi;workSound", "name", "heldJobSite", "acquirableJobSite", "requestedItems", "secondaryPoi", "workSound"}, this);
    }

    public ImmutableSet<class00891> i() {
        return this.secondaryPoi;
    }

    public ImmutableSet<class06581> u() {
        return this.requestedItems;
    }

    public Predicate<class03556<class05369>> y() {
        return this.heldJobSite;
    }

    public static class05672 N(class00751<class05672> class007512) {
        class05672.N(class007512, y, class05369.N, N, null);
        class05672.N(class007512, L, (class05946<class05369>)class03927.N, class04909.gb);
        class05672.N(class007512, u, (class05946<class05369>)class03927.y, class04909.gj);
        class05672.N(class007512, i, (class05946<class05369>)class03927.L, class04909.gv);
        class05672.N(class007512, R, (class05946<class05369>)class03927.u, class04909.gn);
        class05672.N(class007512, M, (class05946<class05369>)class03927.i, (ImmutableSet<class06581>)ImmutableSet.of((Object)class06570.bL, (Object)class06570.by, (Object)class06570.lk, (Object)class06570.vQ), (ImmutableSet<class00891>)ImmutableSet.of((Object)class00869.Lr), class04909.gt);
        class05672.N(class007512, B, (class05946<class05369>)class03927.R, class04909.gG);
        class05672.N(class007512, Z, (class05946<class05369>)class03927.M, class04909.gl);
        class05672.N(class007512, z, (class05946<class05369>)class03927.B, class04909.gd);
        class05672.N(class007512, U, (class05946<class05369>)class03927.Z, class04909.gw);
        class05672.N(class007512, E, (class05946<class05369>)class03927.z, class04909.gk);
        class05672.N(class007512, W, class05369.N, class05369.N, null);
        class05672.N(class007512, m, (class05946<class05369>)class03927.U, class04909.gY);
        class05672.N(class007512, P, (class05946<class05369>)class03927.E, class04909.gQ);
        return class05672.N(class007512, s, (class05946<class05369>)class03927.W, class04909.gO);
    }

    private static class05946<class05672> N(String string) {
        return class05946.N((class05946)class04227.Ne, (class01894)class01894.y((String)string));
    }

    private static class05672 N(class00751<class05672> class007512, class05946<class05672> class059462, Predicate<class03556<class05369>> predicate, Predicate<class03556<class05369>> predicate2, ImmutableSet<class06581> immutableSet, ImmutableSet<class00891> immutableSet2, @Nullable class04891 class048912) {
        return (class05672)((Object)class00751.N(class007512, class059462, (Object)((Object)new class05672((class00392)class00392.L((String)("entity." + class059462.N().y() + ".villager." + class059462.N().N())), predicate, predicate2, immutableSet, immutableSet2, class048912))));
    }

    private static class05672 N(class00751<class05672> class007512, class05946<class05672> class059462, class05946<class05369> class059463, ImmutableSet<class06581> immutableSet, ImmutableSet<class00891> immutableSet2, @Nullable class04891 class048912) {
        return class05672.N(class007512, class059462, class035562 -> class035562.N(class059463), class035562 -> class035562.N(class059463), immutableSet, immutableSet2, class048912);
    }

    private static class05672 N(class00751<class05672> class007512, class05946<class05672> class059462, class05946<class05369> class059463, @Nullable class04891 class048912) {
        return class05672.N(class007512, class059462, class035562 -> class035562.N(class059463), class035562 -> class035562.N(class059463), class048912);
    }

    private static class05672 N(class00751<class05672> class007512, class05946<class05672> class059462, Predicate<class03556<class05369>> predicate, Predicate<class03556<class05369>> predicate2, @Nullable class04891 class048912) {
        return class05672.N(class007512, class059462, predicate, predicate2, (ImmutableSet<class06581>)ImmutableSet.of(), (ImmutableSet<class00891>)ImmutableSet.of(), class048912);
    }

    public class00392 N() {
        return this.name;
    }

    public @Nullable class04891 R() {
        return this.workSound;
    }
}

