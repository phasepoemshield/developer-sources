/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package Nursultan;

import Nursultan.class09057;
import Nursultan.class09060;
import Nursultan.class09062;
import Nursultan.class09064;
import Nursultan.class09083;
import Nursultan.class09086;
import Nursultan.class09096;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class class09085 {
    public Object N_0;
    public Object N_1;
    public Object N_2;

    public class09086 L() {
        this.i();
        return ((class09083)this.N_2).y();
    }

    public boolean L(class09083 class090832) {
        return class090832 != null && ((Integer)class090832.N_0).intValue() == ((class09064)this.N_0).m() && ((Integer)class090832.N_1).intValue() == ((class09064)this.N_0).B() && ((class09096)((Object)class090832.N_2)).equals((Object)((class09064)this.N_0).i((Integer)class090832.N_0, (Integer)class090832.N_1)) && (class09057)class090832.N_3 != null && ((class09057)class090832.N_3).y() && (Boolean)class090832.N_6 == false;
    }

    private class09083 L(int n, int n2) {
        class09096 class090962 = ((class09064)this.N_0).i(n, n2);
        class09060 class090602 = class09060.N();
        class09057 class090572 = class090602.N(class090962.y());
        class09057 class090573 = class090962.L() == null ? null : class090602.N(class090962.L());
        return new class09083(n, n2, class090962, class090572, class090573);
    }

    public void M(class09083 class090832) {
        if (class090832 != null) {
            class090832.N_6 = false;
            class090832.N_7 = System.currentTimeMillis();
        }
    }

    public class09057 M() {
        if (!((class09064)this.N_0).v()) {
            return null;
        }
        this.i();
        this.u();
        return (class09057)((class09083)this.N_2).N_4;
    }

    public class09085(class09064 class090642) {
        this.U();
        this.N_1 = new Object2ObjectOpenHashMap();
        this.N_0 = class090642;
    }

    public void B() {
        ObjectIterator objectIterator = ((Object2ObjectOpenHashMap)this.N_1).values().iterator();
        while (objectIterator.hasNext()) {
            Iterator iterator = ((ArrayList)objectIterator.next()).iterator();
            while (iterator.hasNext()) {
                ((class09083)iterator.next()).N();
            }
        }
        ((Object2ObjectOpenHashMap)this.N_1).clear();
        this.N_2 = null;
    }

    public class09086 B(class09083 class090832) {
        return class090832 == null ? null : class090832.y();
    }

    private class09083 Z(class09083 class090832) {
        class09062 class090622 = new class09062((Integer)class090832.N_0, (Integer)class090832.N_1);
        ((ArrayList)((Object2ObjectOpenHashMap)this.N_1).computeIfAbsent((Object)class090622, object -> new ArrayList(1))).add(class090832);
        return class090832;
    }

    public boolean Z() {
        ObjectIterator objectIterator = ((Object2ObjectOpenHashMap)this.N_1).values().iterator();
        while (objectIterator.hasNext()) {
            for (class09083 class090832 : (ArrayList)objectIterator.next()) {
                if ((class09057)class090832.N_3 == null || !((class09057)class090832.N_3).y()) continue;
                return true;
            }
        }
        return false;
    }

    public void i() {
        int n = ((class09064)this.N_0).m();
        int n2 = ((class09064)this.N_0).B();
        if ((class09083)this.N_2 != null && (Integer)((class09083)this.N_2).N_0 == n && (Integer)((class09083)this.N_2).N_1 == n2 && (class09057)((class09083)this.N_2).N_3 != null && ((class09057)((class09083)this.N_2).N_3).y()) {
            ((class09064)this.N_0).L(n, n2);
            return;
        }
        this.N_2 = this.N(n, n2, false);
        ((class09064)this.N_0).L((Integer)((class09083)this.N_2).N_0, (Integer)((class09083)this.N_2).N_1);
        this.u();
    }

    public class09057 i(class09083 class090832) {
        return class090832 == null ? null : (class09057)class090832.N_3;
    }

    private void U() {
    }

    public class09057 u(class09083 class090832) {
        return class090832 == null ? null : (class09057)class090832.N_4;
    }

    public void u() {
        if ((class09083)this.N_2 != null) {
            ((class09083)this.N_2).N_7 = System.currentTimeMillis();
        }
    }

    public void y(class09083 class090832) {
        if (class090832 != null) {
            this.Z(class090832);
            this.M(class090832);
        }
    }

    public void y(int n, int n2) {
        if ((class09083)this.N_2 == null || (Integer)((class09083)this.N_2).N_0 != n || (Integer)((class09083)this.N_2).N_1 != n2) {
            this.N_2 = this.N(new class09062(n, n2));
        }
    }

    public boolean y() {
        return (class09083)this.N_2 != null && (class09057)((class09083)this.N_2).N_4 != null && ((class09057)((class09083)this.N_2).N_4).y();
    }

    public class09083 N(int n, int n2) {
        return this.L(n, n2);
    }

    private class09083 N(class09062 class090622) {
        ArrayList arrayList = (ArrayList)((Object2ObjectOpenHashMap)this.N_1).get((Object)class090622);
        return arrayList == null || arrayList.isEmpty() ? null : (class09083)arrayList.getFirst();
    }

    public class09083 N() {
        class09083 class090832 = this.N(((class09064)this.N_0).m(), ((class09064)this.N_0).B(), true);
        class090832.N_6 = true;
        this.N_2 = class090832;
        ((class09064)this.N_0).L((Integer)class090832.N_0, (Integer)class090832.N_1);
        class090832.N_7 = System.currentTimeMillis();
        return class090832;
    }

    private class09083 N(int n, int n2, boolean bl) {
        class09062 class090622 = new class09062(n, n2);
        ArrayList<Object> arrayList = (ArrayList<Object>)((Object2ObjectOpenHashMap)this.N_1).get((Object)class090622);
        if (arrayList != null) {
            for (class09083 class090832 : arrayList) {
                if (bl && ((Boolean)class090832.N_6).booleanValue()) continue;
                return class090832;
            }
        } else {
            arrayList = new ArrayList<Object>(1);
            ((Object2ObjectOpenHashMap)this.N_1).put((Object)class090622, arrayList);
        }
        class09083 class090833 = this.L(n, n2);
        arrayList.add(class090833);
        return class090833;
    }

    public class09083 N(class09083 class090832) {
        class09083 class090833 = class090832 == null ? this.N() : this.Z(class090832);
        class090833.N_6 = true;
        this.N_2 = class090833;
        ((class09064)this.N_0).L((Integer)class090833.N_0, (Integer)class090833.N_1);
        class090833.N_7 = System.currentTimeMillis();
        return class090833;
    }

    public void N(long l, long l2) {
        ArrayList<class09062> arrayList = new ArrayList<class09062>();
        for (Object2ObjectMap.Entry object : ((Object2ObjectOpenHashMap)this.N_1).object2ObjectEntrySet()) {
            ArrayList arrayList2 = (ArrayList)object.getValue();
            arrayList2.removeIf(class090832 -> {
                if (!class090832.N(l, l2, ((class09064)this.N_0).Z())) {
                    return false;
                }
                if (class090832 == (class09083)this.N_2) {
                    this.N_2 = null;
                }
                class090832.N();
                return true;
            });
            if (!arrayList2.isEmpty()) continue;
            arrayList.add((class09062)((Object)object.getKey()));
        }
        for (class09062 class090622 : arrayList) {
            ((Object2ObjectOpenHashMap)this.N_1).remove((Object)class090622);
        }
    }

    public class09057 R() {
        this.i();
        this.u();
        return (class09057)((class09083)this.N_2).N_3;
    }

    public class09083 R(class09083 class090832) {
        if (class090832 == null) {
            return null;
        }
        class09062 class090622 = new class09062((Integer)class090832.N_0, (Integer)class090832.N_1);
        ArrayList arrayList = (ArrayList)((Object2ObjectOpenHashMap)this.N_1).get((Object)class090622);
        if (arrayList != null) {
            arrayList.remove(class090832);
            if (arrayList.isEmpty()) {
                ((Object2ObjectOpenHashMap)this.N_1).remove((Object)class090622);
            }
        }
        if ((class09083)this.N_2 == class090832) {
            this.N_2 = this.N(class090622);
        }
        class090832.N_6 = false;
        class090832.N_7 = System.currentTimeMillis();
        return class090832;
    }
}

