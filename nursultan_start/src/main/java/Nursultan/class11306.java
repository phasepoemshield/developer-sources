/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09258
 *  Nursultan.class09261
 *  Nursultan.class09272
 *  Nursultan.class09274
 *  Nursultan.class09276
 *  Nursultan.class09279
 *  Nursultan.class09281
 *  Nursultan.class09291
 *  Nursultan.class09292
 *  Nursultan.class09293
 *  Nursultan.class11521
 *  Nursultan.class11790
 *  Nursultan.class11827
 *  Nursultan.class11938
 *  Nursultan.class11951
 *  Nursultan.class11967
 *  java.lang.MatchException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09258;
import Nursultan.class09261;
import Nursultan.class09272;
import Nursultan.class09274;
import Nursultan.class09276;
import Nursultan.class09279;
import Nursultan.class09281;
import Nursultan.class09291;
import Nursultan.class09292;
import Nursultan.class09293;
import Nursultan.class11290;
import Nursultan.class11291;
import Nursultan.class11296;
import Nursultan.class11314;
import Nursultan.class11323;
import Nursultan.class11325;
import Nursultan.class11405;
import Nursultan.class11521;
import Nursultan.class11790;
import Nursultan.class11827;
import Nursultan.class11938;
import Nursultan.class11951;
import Nursultan.class11967;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11306 {
    public static Object N_0;
    public static Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public boolean y_init;

    private void L() {
        class11938.z().N((class11951<class09276>)class11967.L());
    }

    public synchronized void L(class11290 class112902) {
        ((Deque)this.y_0).add(class11323.L(class112902.u()));
        this.y();
    }

    public class11306(class11325 class113252) {
        this.Z();
        this.y_0 = new ArrayDeque();
        this.y_1 = new HashSet();
        this.y_2 = class113252;
    }

    static {
        class11306.i();
        class11306.u();
        N_0 = LogManager.getLogger(String.class);
    }

    private void Z() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_3 = false;
        }
    }

    private static void i() {
    }

    private void U() {
        if (((Boolean)this.y_3).booleanValue()) {
            return;
        }
        this.y_3 = true;
        ((Logger)N_0).warn("preset sync deferred, retrying list in {} ticks", (Object)1500);
        class11938.Z().y(1500, () -> {
            this.y_3 = false;
            if (class11938.z().R()) {
                this.L();
            }
        });
    }

    public synchronized void u(class11290 class112902) {
        ((Deque)this.y_0).add(class11323.N(class112902.u()));
        this.y();
    }

    private static void u() {
        N_0 = null;
        N_1 = 1500;
    }

    private void y(class11827 class118272) {
        ((class11325)this.y_2).N(class118272.u()).ifPresent(class112902 -> {
            class112902.N(class118272.L());
            class112902.N(class118272.N());
            class112902.L(class118272.N());
            class112902.u(class118272.i());
            if (class112902.M() == class11296.DIRTY) {
                class112902.N(class11296.SYNCED);
            }
            ((class11325)this.y_2).N((class11290)class112902);
        });
    }

    public synchronized void y(class11290 class112902) {
        ((Deque)this.y_0).add(class11323.y(class112902.u()));
        this.y();
    }

    private void y() {
        class11405 class114052 = class11938.z();
        if (!class114052.R()) {
            return;
        }
        while (!((Deque)this.y_0).isEmpty()) {
            class11323 class113232 = (class11323)((Object)((Deque)this.y_0).poll());
            class11290 class112902 = ((class11325)this.y_2).N(class113232.N()).orElse(null);
            if (class112902 == null) continue;
            switch (((int[])class11314.N_1)[class113232.y().ordinal()]) {
                case 1: {
                    if (!class112902.N() || class112902.U() == null) break;
                    class114052.N((class11951<class09276>)class11967.N((UUID)class112902.u(), (String)class112902.i(), (byte[])class112902.U(), (int)class112902.L()));
                    break;
                }
                case 2: {
                    if (class112902.E() || !class112902.N() || class112902.U() == null) break;
                    class114052.N((class11951<class09276>)class11967.N((long)class112902.Z(), (byte[])class112902.U(), (int)class112902.L()));
                    break;
                }
                case 3: {
                    if (class112902.E()) {
                        ((class11325)this.y_2).y(class112902.u());
                        break;
                    }
                    class114052.N((class11951<class09276>)class11967.N((long)class112902.Z()));
                    break;
                }
                case 4: {
                    if (class112902.E()) break;
                    class114052.N((class11951<class09276>)class11967.N((long)class112902.Z(), (String)class112902.i()));
                    break;
                }
                case 5: {
                    if (class112902.E()) {
                        ((Set)this.y_1).remove(class112902.u());
                        break;
                    }
                    class114052.N((class11951<class09276>)class11967.y((long)class112902.Z()));
                }
            }
        }
    }

    private String y(class09274 class092742) {
        class09279 class092792 = class092742.y();
        return switch (((int[])class11314.N_0)[class092742.N().ordinal()]) {
            default -> throw new MatchException(null, null);
            case 1 -> "list: " + ((class09272)class092792).N().size() + " entries";
            case 2 -> {
                class11827 var3_3 = ((class09291)class092792).N();
                yield "create: id=" + var3_3.R() + " name=" + var3_3.L();
            }
            case 3 -> {
                class09292 var3_4 = (class09292)class092792;
                class11827 var4_9 = var3_4.N();
                int var5_11 = var3_4.y() == null ? 0 : var3_4.y().length;
                yield "update: id=" + var4_9.R() + " name=" + var4_9.L() + " bytes=" + var5_11;
            }
            case 4 -> {
                class09261 var3_5 = (class09261)class092792;
                class11827 var4_10 = var3_5.N();
                int var5_12 = var3_5.L() == null ? 0 : var3_5.L().length;
                yield "get: id=" + var4_10.R() + " name=" + var4_10.L() + " bytes=" + var5_12;
            }
            case 5 -> {
                class09293 var3_6 = (class09293)class092792;
                yield "delete: id=" + var3_6.N();
            }
            case 6 -> {
                class11827 var3_7 = ((class09258)class092792).N();
                yield "rename: id=" + var3_7.R() + " name=" + var3_7.L();
            }
            case 7 -> {
                class09281 var3_8 = (class09281)class092792;
                yield "nack: id=" + var3_8.y() + " code=" + var3_8.L();
            }
        };
    }

    public synchronized void N(UUID uUID) {
        ((Set)this.y_1).add(uUID);
        ((Deque)this.y_0).add(class11323.u(uUID));
        this.y();
    }

    public synchronized void N(class09274 class092742) {
        switch (((int[])class11314.N_0)[class092742.N().ordinal()]) {
            case 1: {
                this.N(((class09272)class092742.y()).N());
                break;
            }
            case 2: {
                this.N(((class09291)class092742.y()).N());
                break;
            }
            case 3: {
                this.N((class09292)class092742.y());
                break;
            }
            case 4: {
                this.N((class09261)class092742.y());
                break;
            }
            case 5: {
                this.N((class09293)class092742.y());
                break;
            }
            case 6: {
                this.y(((class09258)class092742.y()).N());
                break;
            }
            case 7: {
                this.N((class09281)class092742.y());
            }
        }
        this.y();
    }

    private void N(class09292 class092922) {
        class11827 class118272 = class092922.N();
        ((class11325)this.y_2).N(class118272.u()).ifPresent(class112902 -> {
            class112902.N(class118272.N());
            class112902.L(class118272.N());
            class112902.u(class118272.i());
            class112902.N(class092922.L());
            class112902.N(class092922.y());
            class112902.N(class092922.y() != null && class092922.y().length > 0);
            class112902.N(class11296.SYNCED);
            ((class11325)this.y_2).N((class11290)class112902);
        });
    }

    private void N(class09293 class092932) {
        ((class11325)this.y_2).N(class092932.N()).ifPresent(class112902 -> ((class11325)this.y_2).y(class112902.u()));
    }

    private void N(List<class11827> list) {
        HashSet<UUID> hashSet = new HashSet<UUID>();
        block11: for (class11827 object : list) {
            hashSet.add(object.u());
            class11290 class112902 = ((class11325)this.y_2).N(object.u()).orElse(null);
            if (class112902 == null) {
                class11290 bl2 = new class11290(object.u(), object.R(), object.L(), object.y(), object.N(), object.N(), object.i(), class11296.SYNCED, 1, false, null);
                ((class11325)this.y_2).N(bl2);
                continue;
            }
            switch (((int[])class11314.N_2)[class112902.M().ordinal()]) {
                case 1: {
                    boolean bl = object.i() != class112902.R();
                    class112902.y(object.R());
                    class112902.u(object.i());
                    class112902.N(object.L());
                    class112902.y(object.y());
                    if (object.N() > class112902.y()) {
                        class112902.N(object.N());
                        class112902.L(object.N());
                    }
                    if (bl) {
                        class112902.N(false);
                        class112902.N((byte[])null);
                    }
                    ((class11325)this.y_2).N(class112902);
                    break;
                }
                case 2: {
                    boolean bl;
                    class112902.y(object.R());
                    class112902.u(object.i());
                    boolean bl2 = !object.L().equals(class112902.i());
                    boolean bl3 = bl = class112902.N() && class112902.U() != null;
                    if (bl2) {
                        ((Deque)this.y_0).add(class11323.i(class112902.u()));
                    }
                    if (bl) {
                        ((Deque)this.y_0).add(class11323.L(class112902.u()));
                    }
                    if (bl2 || bl) continue block11;
                    if (object.N() > class112902.y()) {
                        class112902.N(object.N());
                        class112902.L(object.N());
                    }
                    class112902.N(class11296.SYNCED);
                    ((class11325)this.y_2).N(class112902);
                    break;
                }
                case 3: {
                    class112902.y(object.R());
                    class112902.u(object.i());
                    ((class11325)this.y_2).N(class112902);
                    ((Deque)this.y_0).add(class11323.L(class112902.u()));
                    break;
                }
                case 4: {
                    class112902.y(object.R());
                    class112902.u(object.i());
                    ((Deque)this.y_0).add(class11323.N(class112902.u()));
                }
            }
        }
        for (class11290 class112903 : ((class11325)this.y_2).L()) {
            if (hashSet.contains(class112903.u())) continue;
            switch (((int[])class11314.N_2)[class112903.M().ordinal()]) {
                case 3: {
                    ((Deque)this.y_0).add(class11323.y(class112903.u()));
                    break;
                }
                case 2: {
                    if (!class112903.E()) {
                        class112903.y(0L);
                        class112903.u(0L);
                        class112903.N(class11296.LOCAL);
                        ((class11325)this.y_2).N(class112903);
                    }
                    ((Deque)this.y_0).add(class11323.y(class112903.u()));
                    break;
                }
                case 1: 
                case 4: {
                    ((class11325)this.y_2).y(class112903.u());
                }
            }
        }
        this.R();
        this.y();
    }

    public synchronized void N(class11290 class112902) {
        ((Deque)this.y_0).add(class11323.i(class112902.u()));
        this.y();
    }

    private void N(class09261 class092612) {
        class11827 class118272 = class092612.N();
        class11290 class112902 = ((class11325)this.y_2).N(class118272.u()).orElse(null);
        if (class112902 == null) {
            class112902 = new class11290(class118272.u(), class118272.R(), class118272.L(), class118272.y(), class118272.N(), class118272.N(), class118272.i(), class11296.SYNCED, class092612.y(), true, class092612.L());
        } else {
            class112902.y(class118272.R());
            class112902.N(class118272.L());
            class112902.y(class118272.y());
            class112902.N(class118272.N());
            class112902.L(class118272.N());
            class112902.u(class118272.i());
            class112902.N(class092612.y());
            class112902.N(class092612.L());
            class112902.N(class092612.L() != null && class092612.L().length > 0);
            if (class112902.M() == class11296.LOCAL || class112902.M() == class11296.DIRTY) {
                class112902.N(class11296.SYNCED);
            }
        }
        ((class11325)this.y_2).N(class112902);
        if (((Set)this.y_1).remove(class118272.u()) && class112902.N() && class112902.U() != null) {
            try {
                new class11291().N(class112902.L(), class112902.U());
            }
            catch (RuntimeException runtimeException) {
                ((Logger)N_0).error("Failed to apply preset {}", (Object)class112902.i(), (Object)runtimeException);
            }
        }
    }

    private void N(class11827 class118272) {
        ((class11325)this.y_2).N(class118272.u()).ifPresent(class112902 -> {
            class112902.y(class118272.R());
            class112902.N(class118272.L());
            class112902.y(class118272.y());
            class112902.N(class118272.N());
            class112902.L(class118272.N());
            class112902.u(class118272.i());
            class112902.N(class11296.SYNCED);
            ((class11325)this.y_2).N((class11290)class112902);
        });
    }

    private void N(class09281 class092812) {
        class11290 class112902;
        class11790 class117902 = class11790.N((int)class092812.L());
        if (class117902 == null) {
            ((Logger)N_0).warn("preset NACK with unknown error code {}", (Object)class092812.L());
            return;
        }
        if (class117902 == class11790.staticFields_1e32a81813f643834bbda8f07cef7f07f_0) {
            this.U();
            return;
        }
        class11290 class112903 = class112902 = class092812.y() > 0L ? (class11290)((class11325)this.y_2).N(class092812.y()).orElse(null) : (class11290)((class11325)this.y_2).N(class092812.N()).orElse(null);
        if (class112902 == null) {
            ((Logger)N_0).warn("preset NACK for unknown id={} clientId={}", (Object)class092812.y(), (Object)class092812.N());
            return;
        }
        ((Set)this.y_1).remove(class112902.u());
        if (class117902 == class11790.staticFields_0e32a81813f643834bbda8f07cef7f07f_1) {
            this.U();
        }
        ((Logger)N_0).warn("preset NACK id={} clientId={} code={}", (Object)class092812.y(), (Object)class092812.N(), (Object)class117902);
    }

    public synchronized void N() {
        ((Deque)this.y_0).clear();
        ((Set)this.y_1).clear();
        this.y_3 = false;
        this.L();
    }

    private void R() {
        UUID uUID = ((class11521)class11938.M().N(class11521.class)).y();
        if (uUID == null) {
            return;
        }
        class11290 class112902 = ((class11325)this.y_2).N(uUID).orElse(null);
        if (class112902 == null || class112902.E()) {
            return;
        }
        if (class112902.N() && class112902.U() != null) {
            return;
        }
        ((Set)this.y_1).add(uUID);
        ((Deque)this.y_0).add(class11323.u(uUID));
    }
}

