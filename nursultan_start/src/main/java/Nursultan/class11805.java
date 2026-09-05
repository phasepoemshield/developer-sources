/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11777
 *  Nursultan.class11779
 *  Nursultan.class11780
 *  Nursultan.class11782
 *  Nursultan.class11784
 *  Nursultan.class11795
 *  Nursultan.class11800
 *  Nursultan.class11803
 *  Nursultan.class11938
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11777;
import Nursultan.class11779;
import Nursultan.class11780;
import Nursultan.class11782;
import Nursultan.class11784;
import Nursultan.class11795;
import Nursultan.class11800;
import Nursultan.class11803;
import Nursultan.class11808;
import Nursultan.class11818;
import Nursultan.class11826;
import Nursultan.class11938;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11805 {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;

    private static void L() {
    }

    private String L(class11808 class118082) {
        Class<?> var2 = class118082.M();
        return var2 == null ? "" : var2.getName();
    }

    /*
     * WARNING - void declaration
     */
    private List<class11808> L(List<class11808> list) {
        Object object;
        int n2 = list.size();
        if (n2 < 2) {
            return list;
        }
        HashMap<Class, Object> hashMap = new HashMap<Class, Object>();
        for (int i = 0; i < n2; ++i) {
            Class<?> var5 = list.get(i).M();
            if (var5 == null) continue;
            ((List)hashMap.computeIfAbsent(var5, clazz -> new ArrayList())).add(i);
        }
        ArrayList arrayList = new ArrayList(n2);
        for (int i = 0; i < n2; ++i) {
            arrayList.add(new HashSet());
        }
        int[] nArray = new int[n2];
        for (int i = 0; i < n2; ++i) {
            int n3;
            Iterator iterator;
            object = list.get(i);
            for (Class<?> i2 : object.y()) {
                iterator = hashMap.getOrDefault(i2, List.of()).iterator();
                while (iterator.hasNext()) {
                    n3 = (Integer)iterator.next();
                    if (n3 == i || !((Set)arrayList.get(n3)).add(i)) continue;
                    int n4 = i;
                    nArray[n4] = nArray[n4] + 1;
                }
            }
            for (Class<?> string : object.R()) {
                iterator = hashMap.getOrDefault(string, List.of()).iterator();
                while (iterator.hasNext()) {
                    n3 = (Integer)iterator.next();
                    if (n3 == i || !((Set)arrayList.get(i)).add(n3)) continue;
                    int n5 = n3;
                    nArray[n5] = nArray[n5] + 1;
                }
            }
        }
        Comparator<Integer> comparator = Comparator.comparing(n -> this.L((class11808)list.get((int)n))).thenComparingInt(n -> n);
        object = new PriorityQueue<Integer>(comparator);
        for (int i = 0; i < n2; ++i) {
            if (nArray[i] != 0) continue;
            ((PriorityQueue)object).add(i);
        }
        ArrayList<class11808> arrayList2 = new ArrayList<class11808>(n2);
        boolean[] blArray = new boolean[n2];
        while (!((AbstractCollection)object).isEmpty()) {
            int n6 = (Integer)((PriorityQueue)object).poll();
            arrayList2.add(list.get(n6));
            blArray[n6] = true;
            Iterator iterator = ((Set)arrayList.get(n6)).iterator();
            while (iterator.hasNext()) {
                int n7;
                int n8 = n7 = ((Integer)iterator.next()).intValue();
                nArray[n8] = nArray[n8] - 1;
                if (nArray[n8] != 0) continue;
                ((PriorityQueue)object).add(n7);
            }
        }
        if (arrayList2.size() < n2) {
            void var11_25;
            ArrayList<class11808> arrayList3 = new ArrayList<class11808>();
            boolean bl = false;
            while (var11_25 < n2) {
                if (!blArray[var11_25]) {
                    arrayList3.add(list.get((int)var11_25));
                }
                ++var11_25;
            }
            String string = list.get(0).u().getName();
            List list2 = arrayList3.stream().map(this::L).toList();
            if (((Boolean)class11938.L_3).booleanValue()) {
                throw new IllegalStateException("Cyclic before/after for event " + string + ": " + String.valueOf(list2));
            }
            ((Logger)N_0).warn("Cyclic before/after for event {}; ignoring ordering for: {}", (Object)string, (Object)list2);
            arrayList3.sort(Comparator.comparing(this::L));
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }

    public <T> void L(T t) {
        class11784 class117842;
        Object object;
        if (t instanceof class11784) {
            object = (class11784)t;
            v0 = object;
        } else {
            v0 = class117842 = null;
        }
        if (class117842 != null) {
            class117842.N(false);
        }
        if ((object = (class11818)((Object)((ClassValue)this.y_2).get(t.getClass()))) == null) {
            return;
        }
        class11808[] class11808Array = ((class11818)((Object)object)).y();
        Consumer<Object>[] var5 = ((class11818)((Object)object)).N();
        for (int i = 0; i < var5.length; ++i) {
            if (class117842 != null && class117842.y() && class11808Array[i].i()) continue;
            try {
                var5[i].accept(t);
                continue;
            }
            catch (Exception exception) {
                ((Logger)N_0).error("Event handler failed: {}", (Object)t.getClass().getName(), (Object)exception);
            }
        }
    }

    public class11805(Object object) {
        this.i();
        this.y_0 = new ConcurrentHashMap();
        this.y_1 = new ConcurrentHashMap();
        this.y_2 = new class11800(this);
        this.y_3 = new ArrayList();
        ((List)this.y_3).add(new class11803(object.getClass().getPackageName(), (method, clazz) -> (MethodHandles.Lookup)method.invoke(null, clazz, MethodHandles.lookup())));
        this.y(object);
    }

    static {
        class11805.L();
        class11805.N();
        class11805.y();
        class11805.u();
        N_0 = LogManager.getLogger(String.class);
    }

    private void i() {
    }

    private static void u() {
        N_0 = null;
    }

    private void y(class11808 class118082) {
        Class<?> var2 = class118082.u();
        ((Map)this.y_1).compute(var2, (clazz, class118182) -> {
            ArrayList<class11808> arrayList = class118182 == null ? new ArrayList<class11808>() : new ArrayList<class11808>(Arrays.asList(class118182.y()));
            arrayList.add(class118082);
            return this.N(arrayList);
        });
        ((ClassValue)this.y_2).remove(var2);
    }

    private static void y() {
    }

    public void y(Object object) {
        this.N(object.getClass(), object).forEach(this::y);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private class11795 y(Class<?> clazz) {
        List list = (List)this.y_3;
        synchronized (list) {
            for (class11803 class118032 : (List)this.y_3) {
                if (!clazz.getName().startsWith(class118032.y())) continue;
                return class118032.N();
            }
        }
        throw new RuntimeException("No registered lambda factory for '" + clazz.getName() + "'.");
    }

    private List<class11808> y(List<class11808> list) {
        EnumMap<class11777, Object> enumMap = new EnumMap<class11777, Object>(class11777.class);
        for (class11808 class11777Array : list) {
            ((List)enumMap.computeIfAbsent(class11777Array.L(), class117772 -> new ArrayList())).add(class11777Array);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (class11777 class117773 : class11777.values()) {
            List list2 = (List)enumMap.get(class117773);
            if (list2 == null) continue;
            arrayList.addAll(this.L(list2));
        }
        return arrayList;
    }

    public <T> void N(class11777 class117772, boolean bl, Class<T> clazz, class11826<T> class118262) {
        this.y((class11808)new class11780(clazz, class117772, bl, class118262));
    }

    private void N(class11808 class118082) {
        Class<?> var2 = class118082.u();
        ((Map)this.y_1).computeIfPresent(var2, (clazz, class118182) -> {
            ArrayList<class11808> arrayList = new ArrayList<class11808>(Arrays.asList(class118182.y()));
            arrayList.remove(class118082);
            return arrayList.isEmpty() ? null : this.N(arrayList);
        });
        ((ClassValue)this.y_2).remove(var2);
    }

    private void N(List<class11808> list, Class<?> clazz, Object object) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (!this.N(method)) continue;
            list.add((class11808)new class11779(this.y(clazz), clazz, object, method));
        }
        if (clazz.getSuperclass() != null) {
            this.N(list, clazz.getSuperclass(), object);
        }
    }

    private List<class11808> N(Class<?> clazz, Object object2) {
        return (List)((Map)this.y_0).computeIfAbsent(object2, object -> {
            ArrayList<class11808> arrayList = new ArrayList<class11808>();
            this.N(arrayList, clazz, object);
            return arrayList;
        });
    }

    public <T> void N(Class<T> clazz, class11826<T> class118262) {
        this.N(class11777.NOW, false, clazz, class118262);
    }

    private boolean N(Method method) {
        return method.isAnnotationPresent(class11782.class) && method.getReturnType() == Void.TYPE && method.getParameterCount() == 1 && !method.getParameters()[0].getType().isPrimitive();
    }

    private class11818 N(List<class11808> list) {
        class11808[] class11808Array = (class11808[])this.y(list).toArray(class11808[]::new);
        Consumer[] consumerArray = new Consumer[class11808Array.length];
        for (int i = 0; i < class11808Array.length; ++i) {
            consumerArray[i] = class11808Array[i].N();
        }
        return new class11818(class11808Array, consumerArray);
    }

    public void N(Object object) {
        this.N(object.getClass(), object).forEach(this::N);
    }

    private static void N() {
    }

    public <T> void N(class11777 class117772, Class<T> clazz, class11826<T> class118262) {
        this.N(class117772, false, clazz, class118262);
    }
}

