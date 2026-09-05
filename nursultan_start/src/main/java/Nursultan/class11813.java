/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11517
 *  Nursultan.class11523
 *  Nursultan.class11533
 *  Nursultan.class11535
 *  Nursultan.class11536
 *  Nursultan.class11938
 *  Nursultan.class11999
 *  Nursultan.class12018
 *  Nursultan.class12020
 *  java.lang.runtime.SwitchBootstraps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11517;
import Nursultan.class11523;
import Nursultan.class11533;
import Nursultan.class11535;
import Nursultan.class11536;
import Nursultan.class11938;
import Nursultan.class11999;
import Nursultan.class12018;
import Nursultan.class12020;
import java.lang.runtime.SwitchBootstraps;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11813 {
    public static Object N_0;

    private static void L() {
        N_0 = null;
    }

    private class11813() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11813.y();
        class11813.i();
        class11813.L();
        N_0 = LogManager.getLogger(String.class);
    }

    private static void i() {
    }

    private static void y() {
    }

    private static void N(List<class11535> list, Consumer<String> consumer) {
        for (class11535 class115352 : list) {
            class11813.N(consumer, () -> class115352.E().N());
        }
    }

    private static void N(Consumer<String> consumer, Supplier<String> supplier) {
        try {
            String string = supplier.get();
            if (string != null && !string.isEmpty()) {
                consumer.accept(string);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static void N(Collection<class11536<?>> collection, Consumer<String> consumer, Consumer<String> consumer2) {
        for (class11536<?> class115362 : collection) {
            class11536<?> class115363;
            class11813.N(consumer, () -> ((class12018)class115362.P()).N());
            Objects.requireNonNull(class115362);
            int n = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class11523.class, class11517.class, class11533.class}, class115363, (int)n)) {
                case 0: {
                    class11813.N(((class11523)class115363).L(), consumer2);
                    break;
                }
                case 1: {
                    class11813.N(((class11517)class115363).L(), consumer2);
                    break;
                }
                case 2: {
                    class11533 class115332 = (class11533)class115363;
                    class11813.N(consumer, () -> ((class11533)class115332).L());
                    break;
                }
            }
        }
    }

    public static void N() {
        if (!((Boolean)class11938.L_4).booleanValue()) {
            return;
        }
        System.out.println();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Consumer<String> consumer = string -> {
            if (string != null && !string.isEmpty()) {
                linkedHashSet.add(string);
            }
        };
        Consumer<String> consumer2 = string -> {
            if (string != null && !string.isEmpty()) {
                linkedHashSet2.add(string);
            }
        };
        for (class11067 class110672 : class11938.u().NN()) {
            class11813.N(consumer, () -> ((class12018)class110672.B()).N());
            class11813.N(class110672.w().values(), consumer, consumer2);
        }
        for (class11999 class119992 : class11999.values()) {
            Set var9 = new class12020(class119992, class119992).y().keySet();
            TreeSet treeSet = new TreeSet(linkedHashSet);
            treeSet.removeAll(var9);
            TreeSet treeSet2 = new TreeSet(var9);
            treeSet2.removeAll(linkedHashSet);
            treeSet2.removeAll(linkedHashSet2);
            treeSet2.removeIf(string -> !string.startsWith("module."));
            ((Logger)N_0).error("==== Locale: {} ====", (Object)class119992.N());
            if (treeSet.isEmpty()) {
                ((Logger)N_0).error("[MISSING] \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u0435\u0442: 0");
            } else {
                ((Logger)N_0).error("[MISSING] \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u044e\u0442 \u043a\u043b\u044e\u0447\u0438 ({}):", (Object)treeSet.size());
                for (String string2 : treeSet) {
                    ((Logger)N_0).error(" - {}", (Object)string2);
                }
            }
            if (treeSet2.isEmpty()) {
                ((Logger)N_0).error("[UNUSED] \u043d\u0435\u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u043c\u044b\u0445 \u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0439/\u043d\u0430\u0441\u0442\u0440\u043e\u0435\u043a: 0");
            } else {
                ((Logger)N_0).error("[UNUSED] \u043a\u043b\u044e\u0447\u0438 \u043f\u0440\u0438\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u044e\u0442, \u043d\u043e \u043d\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044e\u0442\u0441\u044f ({}):", (Object)treeSet2.size());
                for (String string2 : treeSet2) {
                    ((Logger)N_0).error(" - {}", (Object)string2);
                }
            }
            System.out.println();
        }
    }
}

