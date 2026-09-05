/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09781
 *  Nursultan.class09842
 *  Nursultan.class09860
 *  Nursultan.class09863
 *  Nursultan.class09904
 *  Nursultan.class09980
 *  Nursultan.class09996
 *  Nursultan.class10002
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09710;
import Nursultan.class09713;
import Nursultan.class09736;
import Nursultan.class09738;
import Nursultan.class09741;
import Nursultan.class09743;
import Nursultan.class09781;
import Nursultan.class09842;
import Nursultan.class09860;
import Nursultan.class09863;
import Nursultan.class09904;
import Nursultan.class09980;
import Nursultan.class09996;
import Nursultan.class10002;
import Nursultan.class10021;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class class09715 {
    private final class09781 N;
    private final Map<class10021, class09710> y = new IdentityHashMap<class10021, class09710>();
    private final Set<class10021> L = Collections.newSetFromMap(new IdentityHashMap());

    public boolean L(class10021 class100212) {
        class09710 class097102 = this.y.get(class100212);
        if (class097102 == null || class097102.N.isEmpty()) {
            return false;
        }
        Iterator<class09738> var3 = class097102.N.values().iterator();
        while (var3.hasNext()) {
            if (!var3.next().i().y()) continue;
            return true;
        }
        return false;
    }

    private class09715(class09781 class097812) {
        this.N = Objects.requireNonNull(class097812, "context");
    }

    public void u(class10021 class100212) {
        if (class100212 == null) {
            return;
        }
        ArrayDeque<class10021> arrayDeque = new ArrayDeque<class10021>();
        arrayDeque.push(class100212);
        while (!arrayDeque.isEmpty()) {
            class10021 class100213 = (class10021)arrayDeque.pop();
            this.y.remove(class100213);
            this.L.remove(class100213);
            for (int i = 0; i < class100213.u(); ++i) {
                arrayDeque.push(class100213.N(i));
            }
        }
    }

    public class09741 y(float f) {
        if (f <= 0.0f || this.y.isEmpty()) {
            return class09741.N;
        }
        boolean bl = false;
        boolean bl2 = false;
        Iterator<Map.Entry<class10021, class09710>> var4 = this.y.entrySet().iterator();
        while (var4.hasNext()) {
            boolean bl3;
            boolean bl4;
            class09738 class097382;
            Map.Entry<class10021, class09710> entry = var4.next();
            class10021 class100212 = entry.getKey();
            class09710 class097102 = entry.getValue();
            if (class097102.N.isEmpty()) {
                var4.remove();
                continue;
            }
            if (class097102.y) {
                class097102.y = false;
                continue;
            }
            class09980 class099802 = class100212.o();
            class09996 class099962 = null;
            ArrayList<class09736> arrayList = null;
            Iterator<class09738> var11 = class097102.N.values().iterator();
            while (var11.hasNext()) {
                class097382 = var11.next();
                bl4 = class097382.N(f);
                if (!bl4 && !class097382.N()) continue;
                if (class099962 == null) {
                    class099962 = class099802.R();
                }
                class097382.i().N(class099962, class097382);
                if (!class097382.N()) continue;
                var11.remove();
                if (arrayList == null) {
                    arrayList = new ArrayList<class09736>(2);
                }
                arrayList.add(class097382.i());
            }
            class097382 = class099962 == null ? class099802 : class099962.N();
            bl4 = !class097382.N(class099802);
            boolean bl5 = !class097382.y(class099802);
            boolean bl6 = bl3 = !class097382.L(class099802);
            if (bl4 || bl5 || bl3) {
                class100212.N((class09980)class097382);
                if (bl4) {
                    class100212.i(2);
                    bl2 = true;
                } else if (bl5) {
                    class100212.i(4);
                } else {
                    class100212.i(1);
                }
                bl = true;
            }
            class09715.N(class100212, arrayList, class097102.N.isEmpty());
            if (!class097102.N.isEmpty()) continue;
            var4.remove();
        }
        return class09741.N(bl, bl2);
    }

    public boolean y(class10021 class100212) {
        class09710 class097102 = this.y.get(class100212);
        return class097102 != null && !class097102.N.isEmpty();
    }

    private static void N(class10021 class100212, class09736 class097362, boolean bl) {
        class09863.N((class09860)new class09842((class09904)class100212, class097362, bl));
    }

    private static void N(class10021 class100212, List<class09736> list, boolean bl) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (class09736 class097362 : list) {
            class09715.N(class100212, class097362, bl);
        }
    }

    public static class09715 N(class09781 class097812) {
        return (class09715)class097812.N(class09715.class).orElseGet(() -> {
            class09715 class097152 = new class09715(class097812);
            class097812.N(class09715.class, (Object)class097152);
            return class097152;
        });
    }

    public boolean N(class10021 class100212) {
        if (class100212 == null) {
            return false;
        }
        ArrayDeque<class10021> arrayDeque = new ArrayDeque<class10021>();
        arrayDeque.push(class100212);
        while (!arrayDeque.isEmpty()) {
            class10021 class100213 = (class10021)arrayDeque.pop();
            class09710 class097102 = this.y.get(class100213);
            if (class100213.T() && class097102 != null && !class097102.N.isEmpty()) {
                return true;
            }
            for (int i = 0; i < class100213.u(); ++i) {
                arrayDeque.push(class100213.N(i));
            }
        }
        return false;
    }

    private class09980 N(class10021 class100212, class09980 class099802, class10002 class100022) {
        if (class100022 == null || class100022.N()) {
            return class099802;
        }
        class09980 class099803 = class100022.N(class099802);
        class09713 class097132 = class099802.A();
        class09980 class099804 = class099802;
        class09710 class097102 = null;
        for (class09736 class097362 : class09736.values()) {
            class09743 class097432;
            if (!class097362.N(class099803, class099802) || !(class097432 = class097132.N(class097362)).u() || !class097362.y(class099803, class099802, class097432)) continue;
            if (class097102 == null) {
                class097102 = new class09710(true);
            }
            class097102.N.put(class097362, class097362.N(class099803, class099802, class097432));
            class099804 = class097362.y(class099803, class099804);
        }
        if (class097102 != null && !class097102.N.isEmpty()) {
            this.y.put(class100212, class097102);
        }
        return class099804;
    }

    public class09980 N(class10021 class100213, class09980 class099802, class09980 class099803, class10002 class100022) {
        if (class100213 == null || class099802 == null || class099803 == null) {
            return class099803;
        }
        if (!this.L.contains(class100213)) {
            this.L.add(class100213);
            this.y.remove(class100213);
            return this.N(class100213, class099803, class100022);
        }
        class09980 class099804 = class099803;
        class09710 class097102 = (class09710)this.y.computeIfAbsent(class100213, class100212 -> new class09710(false));
        class09713 class097132 = class099803.A();
        for (class09736 class097362 : class09736.values()) {
            if (!class097362.N(class099802, class099803)) {
                class097102.N.remove((Object)class097362);
                continue;
            }
            class09743 class097432 = class097132.N(class097362);
            if (!class097432.u() || !class097362.y(class099802, class099803, class097432)) {
                class097102.N.remove((Object)class097362);
                continue;
            }
            class09738 class097382 = class097102.N.get((Object)class097362);
            if (class097382 != null && class097382.N(class097432) && class097362.N(class097382, class099803)) {
                class099804 = class097362.y(class099802, class099804);
                continue;
            }
            if (class097382 != null && class097382.y(class097432) && class097382.y(class097362.N(class099803))) {
                class099804 = class097362.N(class099804, class097382.u());
                continue;
            }
            class09738 class097383 = class097362.N(class099802, class099803, class097432);
            class097102.N.put(class097362, class097383);
            class099804 = class097362.y(class099802, class099804);
        }
        if (class097102.N.isEmpty()) {
            this.y.remove(class100213);
        }
        return class099804;
    }

    public boolean N(float f) {
        return this.y(f).N();
    }
}

