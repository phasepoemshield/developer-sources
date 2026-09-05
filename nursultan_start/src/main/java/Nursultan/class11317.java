/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09265
 *  Nursultan.class09267
 *  Nursultan.class09275
 *  Nursultan.class09276
 *  Nursultan.class09283
 *  Nursultan.class09287
 *  Nursultan.class09378
 *  Nursultan.class10732
 *  Nursultan.class11283
 *  Nursultan.class11488
 *  Nursultan.class11519
 *  Nursultan.class11529
 *  Nursultan.class11531
 *  Nursultan.class11790
 *  Nursultan.class11938
 *  Nursultan.class11948
 *  Nursultan.class11951
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09265;
import Nursultan.class09267;
import Nursultan.class09275;
import Nursultan.class09276;
import Nursultan.class09283;
import Nursultan.class09287;
import Nursultan.class09378;
import Nursultan.class10732;
import Nursultan.class11283;
import Nursultan.class11294;
import Nursultan.class11299;
import Nursultan.class11405;
import Nursultan.class11488;
import Nursultan.class11519;
import Nursultan.class11529;
import Nursultan.class11531;
import Nursultan.class11790;
import Nursultan.class11938;
import Nursultan.class11948;
import Nursultan.class11951;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11317 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;

    private synchronized void L(class09378 class093782) {
        if (!((Set)this.N_2).remove(class093782)) {
            return;
        }
        ((Deque)this.N_0).add(class11283.y((class09378)class093782));
        this.B();
    }

    private synchronized void M() {
        this.N_4 = false;
        if (!class11938.z().R()) {
            return;
        }
        ((Deque)this.N_0).add(class11283.N());
        this.B();
    }

    public class11317(class11519 class115192) {
        this.z();
        this.N_0 = new ArrayDeque();
        this.N_1 = new EnumMap(class09378.class);
        this.N_2 = EnumSet.noneOf(class09378.class);
        this.N_3 = class115192;
    }

    static {
        class11317.y();
        y_0 = LogManager.getLogger(String.class);
    }

    private void B() {
        class11405 class114052 = class11938.z();
        if (!class114052.R()) {
            return;
        }
        while (!((Deque)this.N_0).isEmpty()) {
            class11283 class112832 = (class11283)((Deque)this.N_0).poll();
            switch (((int[])class11294.N_1)[class112832.y().ordinal()]) {
                case 1: {
                    class114052.N((class11951<class09276>)class11948.N());
                    break;
                }
                case 2: {
                    class114052.N((class11951<class09276>)class11948.N((int)class112832.L().N()));
                    break;
                }
                case 3: {
                    class11531 class115312;
                    if (((Boolean)this.N_4).booleanValue() || (class115312 = (class11531)((class11519)this.N_3).N(class112832.L()).orElse(null)) == null || ((Map)this.N_1).containsKey(class112832.L())) break;
                    try {
                        byte[] byArray = class11529.N((class11488)((class11488)class115312));
                        ((Map)this.N_1).put(class112832.L(), byArray);
                        class114052.N((class11951<class09276>)class11948.N((int)class112832.L().N(), (byte[])byArray));
                        break;
                    }
                    catch (IOException iOException) {
                        ((Logger)y_0).error("Failed to serialize {} for push", (Object)class112832.L(), (Object)iOException);
                    }
                }
            }
        }
    }

    private void Z() {
        if (((Boolean)this.N_4).booleanValue()) {
            return;
        }
        this.N_4 = true;
        ((Logger)y_0).warn("user-config operations rate-limited, retrying in {} ticks", (Object)1500);
        class11938.Z().y(1500, this::M);
    }

    private void z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_4 = false;
        }
    }

    private static void y() {
        y_0 = null;
        y_1 = 1500;
        y_2 = 120;
    }

    private void N(class09267 class092672) {
        HashSet<class09378> hashSet = new HashSet<class09378>();
        for (class10732 class107322 : class092672.N()) {
            class09378 class093782 = class107322.N();
            if (class093782 == null) continue;
            hashSet.add(class093782);
            class11531 class115312 = ((class11519)this.N_3).N(class093782).orElse(null);
            if (class115312 == null) continue;
            if (class115312.y()) {
                ((Deque)this.N_0).add(class11283.y((class09378)class093782));
                continue;
            }
            ((Deque)this.N_0).add(class11283.N((class09378)class093782));
        }
        for (class10732 class107322 : ((class11519)this.N_3).N()) {
            if (hashSet.contains(class107322.i()) || ((class11488)class107322).d_()) continue;
            ((Deque)this.N_0).add(class11283.y((class09378)class107322.i()));
        }
    }

    public synchronized void N(class09283 class092832) {
        switch (((int[])class11294.N_0)[class092832.y().ordinal()]) {
            case 1: {
                this.N((class09267)class092832.N());
                break;
            }
            case 2: {
                this.N((class09275)class092832.N());
                break;
            }
            case 3: {
                this.N((class09287)class092832.N());
                break;
            }
            case 4: {
                this.N((class09265)class092832.N());
            }
        }
        this.B();
    }

    private void N(class09275 class092752) {
        class09378 class093782 = class09378.N((int)class092752.y());
        if (class093782 == null) {
            return;
        }
        class11531 class115312 = ((class11519)this.N_3).N(class093782).orElse(null);
        if (class115312 == null) {
            return;
        }
        if (class115312.y()) {
            ((Deque)this.N_0).add(class11283.y((class09378)class093782));
            return;
        }
        try (class11299 class112992 = class11299.N();){
            class11529.N((class11488)((class11488)class115312), (byte[])class092752.N());
            class115312.N(false);
            ((class11519)this.N_3).N(class115312);
        }
        catch (IOException iOException) {
            ((Logger)y_0).error("Failed to deserialize blob for {}", (Object)class093782, (Object)iOException);
        }
    }

    public synchronized void N(class09378 class093782) {
        if (!((Set)this.N_2).add(class093782)) {
            return;
        }
        class11938.Z().y(120, () -> this.L(class093782));
    }

    private void N(class09265 class092652) {
        class09378 class093782 = class09378.N((int)class092652.y());
        if (class093782 == null) {
            return;
        }
        ((Map)this.N_1).remove(class093782);
        if (class11790.N((int)class092652.N()) == class11790.staticFields_1e32a81813f643834bbda8f07cef7f07f_0) {
            this.Z();
            return;
        }
        class11531 class115312 = ((class11519)this.N_3).N(class093782).orElse(null);
        if (class115312 != null) {
            class115312.N(false);
            ((class11519)this.N_3).N(class115312);
        }
    }

    private void N(class09287 class092872) {
        class09378 class093782 = class09378.N((int)class092872.y());
        if (class093782 == null) {
            return;
        }
        class11531 class115312 = ((class11519)this.N_3).N(class093782).orElse(null);
        if (class115312 == null) {
            return;
        }
        byte[] byArray = (byte[])((Map)this.N_1).remove(class093782);
        if (byArray == null) {
            return;
        }
        try {
            byte[] byArray2 = class11529.N((class11488)((class11488)class115312));
            if (Arrays.equals(byArray, byArray2)) {
                class115312.N(false);
                ((class11519)this.N_3).N(class115312);
            } else {
                class115312.N(true);
                ((class11519)this.N_3).N(class115312);
                this.N(class093782);
            }
        }
        catch (IOException iOException) {
            ((Logger)y_0).error("Failed to serialize {} after ack", (Object)class093782, (Object)iOException);
        }
    }

    public synchronized void N() {
        ((Deque)this.N_0).clear();
        ((Map)this.N_1).clear();
        ((Set)this.N_2).clear();
        this.N_4 = false;
        ((Deque)this.N_0).add(class11283.N());
        this.B();
    }
}

