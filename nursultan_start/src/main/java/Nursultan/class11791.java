/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.NoFriendDamage
 *  Nursultan.class11812
 *  Nursultan.class11938
 *  minecraft.class04453
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07542
 */
package Nursultan;

import Nursultan.NoFriendDamage;
import Nursultan.class11783;
import Nursultan.class11812;
import Nursultan.class11938;
import java.util.function.Predicate;
import minecraft.class04453;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07542;

public class class11791 {
    public static Predicate<class07049> L() {
        return class070492 -> class070492 instanceof class07079 && !class11791.U().test((class07049)class070492);
    }

    public static Predicate<class07049> M() {
        return class070492 -> class070492.method_5864() == class07078.Nt;
    }

    private class11791() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static Predicate<class07049> B() {
        return class070492 -> class070492.method_5864() == class07078.Ly;
    }

    public static Predicate<class07049> Z() {
        return class070492 -> (Boolean)((class11812)((class11783)class070492).dataManager()).M().N();
    }

    public static Predicate<class07049> i() {
        return class070492 -> class070492 instanceof class07079;
    }

    public static Predicate<class07049> U() {
        return class070492 -> class070492 instanceof class07542;
    }

    public static Predicate<class07049> z() {
        return class070492 -> (Boolean)((class11812)((class11783)class070492).dataManager()).B().N();
    }

    public static Predicate<class07049> u() {
        return class070492 -> {
            NoFriendDamage noFriendDamage = class11938.u().Ng();
            if (!noFriendDamage.U()) {
                return false;
            }
            return class11791.E().test((class07049)class070492) || class11791.z().test((class07049)class070492) || noFriendDamage.N(class070492);
        };
    }

    public static Predicate<class07049> y() {
        return class070492 -> class070492 instanceof class04453;
    }

    public static Predicate<class07049> E() {
        return class070492 -> (Boolean)((class11812)((class11783)class070492).dataManager()).i().N();
    }

    public static Predicate<class07049> N() {
        return class07049::method_5805;
    }

    public static Predicate<class07049> R() {
        return class070492 -> class070492.method_5864() == class07078.ye;
    }
}

