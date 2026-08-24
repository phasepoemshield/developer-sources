/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import jnr.constants.Constant;
import jnr.constants.PlatformConstants;
import jnr.constants.platform.Errno;

public class ConstantSet
extends AbstractSet<Constant> {
    private volatile Long minValue;
    private static final ConcurrentMap<String, ConstantSet> constantSets;
    private final Set<Enum> constants;
    private final Class<Enum> enumClass;
    private static volatile Throwable RESOURCE_READ_ERROR;
    private static final Object lock;
    private static final ClassLoader LOADER;
    private volatile Long maxValue;
    private final Map<String, Constant> nameToConstant;
    private static final boolean CAN_LOAD_RESOURCES;
    private final Map<Long, Constant> valueToConstant;

    private ConstantSet(Class<Enum> enumClass) {
        this.enumClass = enumClass;
        this.constants = EnumSet.allOf(enumClass);
        HashMap<String, Constant> names = new HashMap<String, Constant>();
        HashMap<Long, Constant> values2 = new HashMap<Long, Constant>();
        for (Enum e : this.constants) {
            if (!(e instanceof Constant)) continue;
            Constant c = (Constant)((Object)e);
            names.put(e.name(), c);
            values2.put(c.longValue(), c);
        }
        this.nameToConstant = Collections.unmodifiableMap(names);
        this.valueToConstant = Collections.unmodifiableMap(values2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static ConstantSet loadConstantSet(String name) {
        Object object = lock;
        synchronized (object) {
            void var2_2;
            ConstantSet constants = (ConstantSet)constantSets.get(name);
            if (constants == null) {
                Class<Enum> enumClass = ConstantSet.getEnumClass(name);
                if (enumClass == null) {
                    return null;
                }
                if (!Constant.class.isAssignableFrom(enumClass)) {
                    throw new ClassCastException("class for " + name + " does not implement Constant interface");
                }
                constants = new ConstantSet(enumClass);
                constantSets.put(name, constants);
            }
            return var2_2;
        }
    }

    private Long getLongField(String name, long defaultValue) {
        try {
            Field f = this.enumClass.getField(name);
            return (Long)f.get(this.enumClass);
        }
        catch (NoSuchFieldException ex) {
            return defaultValue;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public String getName(int value) {
        Constant c = this.getConstant(value);
        return c != null ? c.name() : "unknown";
    }

    public static void main(String[] args2) {
        System.out.println(Errno.values().length);
    }

    public Constant getConstant(long value) {
        return this.valueToConstant.get(value);
    }

    private static final Class<Enum> getEnumClass(String name) {
        String[] prefixes;
        String[] stringArray = prefixes = PlatformConstants.getPlatform().getPackagePrefixes();
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String path;
            URL resource;
            String prefix = stringArray[i];
            String fullName = prefix + "." + name;
            boolean doClass = true;
            if (CAN_LOAD_RESOURCES && (resource = LOADER.getResource(path = fullName.replace('.', '/') + ".class")) == null) {
                doClass = false;
            }
            if (!doClass) continue;
            try {
                return Class.forName(fullName, true, LOADER).asSubclass(Enum.class);
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        return null;
    }

    public final Constant getConstant(String name) {
        return this.nameToConstant.get(name);
    }

    public long maxValue() {
        if (this.maxValue == null) {
            this.maxValue = this.getLongField("MAX_VALUE", Integer.MAX_VALUE);
        }
        return this.maxValue.intValue();
    }

    public long minValue() {
        if (this.minValue == null) {
            this.minValue = this.getLongField("MIN_VALUE", Integer.MIN_VALUE);
        }
        return this.minValue.intValue();
    }

    @Override
    public Iterator<Constant> iterator() {
        return new ConstantIterator(this.constants);
    }

    public long getValue(String name) {
        Constant c = this.getConstant(name);
        return c != null ? c.longValue() : 0L;
    }

    public static ConstantSet getConstantSet(String name) {
        ConstantSet constants = (ConstantSet)constantSets.get(name);
        return constants != null ? constants : ConstantSet.loadConstantSet(name);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    static {
        void var1_1;
        block14: {
            constantSets = new ConcurrentHashMap<String, ConstantSet>();
            lock = new Object();
            ClassLoader _loader = ConstantSet.class.getClassLoader();
            LOADER = _loader != null ? _loader : ClassLoader.getSystemClassLoader();
            boolean canLoadResources = false;
            try {
                URL thisClass = AccessController.doPrivileged(new PrivilegedAction<URL>(){

                    @Override
                    public URL run() {
                        return LOADER.getResource("jnr/constants/ConstantSet.class");
                    }
                });
                InputStream stream = thisClass.openStream();
                try {
                    stream.read();
                }
                catch (Throwable t) {
                    RESOURCE_READ_ERROR = t;
                }
                finally {
                    try {
                        stream.close();
                    }
                    catch (Exception t) {}
                }
                canLoadResources = true;
            }
            catch (Throwable t) {
                void var2_3;
                if (RESOURCE_READ_ERROR != null) break block14;
                RESOURCE_READ_ERROR = var2_3;
            }
        }
        CAN_LOAD_RESOURCES = var1_1;
    }

    @Override
    public int size() {
        return this.constants.size();
    }

    @Override
    public boolean contains(Object o) {
        return o != null && o.getClass().equals(this.enumClass);
    }

    private final class ConstantIterator
    implements Iterator<Constant> {
        private final Iterator<Enum> it;
        private Constant next = null;

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public Constant next() {
            void var1_1;
            Constant prev = this.next;
            this.next = this.it.hasNext() ? (Constant)((Object)this.it.next()) : null;
            return var1_1;
        }

        ConstantIterator(Collection<Enum> constants) {
            this.it = constants.iterator();
            this.next = this.it.hasNext() ? (Constant)((Object)this.it.next()) : null;
        }

        @Override
        public boolean hasNext() {
            return this.next != null && !this.next.name().equals("__UNKNOWN_CONSTANT__");
        }
    }
}

