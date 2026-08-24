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
import jnr.constants.platform.Errno;

// $VF: Compiled from ConstantSet.java
public class ConstantSet extends AbstractSet<Constant> {
   private volatile Long minValue;
   private static final ConcurrentMap<String, ConstantSet> constantSets = new ConcurrentHashMap<>();
   private final Set<Enum> constants;
   private final Class<Enum> enumClass;
   private static volatile Throwable RESOURCE_READ_ERROR;
   private static final Object lock = new Object();
   private static final ClassLoader LOADER;
   private volatile Long maxValue;
   private final Map<String, Constant> nameToConstant;
   private static final boolean CAN_LOAD_RESOURCES;
   private final Map<Long, Constant> valueToConstant;

   private ConstantSet(Class<Enum> enumClass) {
      this.enumClass = enumClass;
      this.constants = EnumSet.allOf(enumClass);
      Map<String, Constant> names = new HashMap<>();
      Map<Long, Constant> values = new HashMap<>();

      for (Enum e : this.constants) {
         if (e instanceof Constant) {
            Constant c = (Constant)e;
            names.put(e.name(), c);
            values.put(c.longValue(), c);
         }
      }

      this.nameToConstant = Collections.unmodifiableMap(names);
      this.valueToConstant = Collections.unmodifiableMap(values);
   }

   private static ConstantSet loadConstantSet(String name) {
      synchronized (lock) {
         ConstantSet constants = constantSets.get(name);
         if (constants == null) {
            Class<Enum> enumClass = getEnumClass(name);
            if (enumClass == null) {
               return null;
            }

            if (!Constant.class.isAssignableFrom(enumClass)) {
               throw new ClassCastException("class for " + name + " does not implement Constant interface");
            }

            constantSets.put(name, constants = new ConstantSet(enumClass));
         }

         return constants;
      }
   }

   private Long getLongField(String defaultValue, long name) {
      try {
         Field f = this.enumClass.getField(name);
         return (Long)f.get(this.enumClass);
      } catch (NoSuchFieldException ex) {
         return defaultValue;
      } catch (RuntimeException ex) {
         throw ex;
      } catch (Exception ex) {
         throw new RuntimeException(ex);
      }
   }

   public String getName(int value) {
      Constant c = this.getConstant(value);
      return c != null ? c.name() : "unknown";
   }

   public static void main(String[] args) {
      System.out.println(Errno.values().length);
   }

   public Constant getConstant(long value) {
      return this.valueToConstant.get(value);
   }

   private static final Class<Enum> getEnumClass(String name) {
      String[] prefixes = PlatformConstants.getPlatform().getPackagePrefixes();

      for (String prefix : prefixes) {
         String fullName = prefix + "." + name;
         boolean doClass = true;
         if (CAN_LOAD_RESOURCES) {
            String path = fullName.replace('.', '/') + ".class";
            URL resource = LOADER.getResource(path);
            if (resource == null) {
               doClass = false;
            }
         }

         if (doClass) {
            try {
               return Class.forName(fullName, true, LOADER).asSubclass(Enum.class);
            } catch (ClassNotFoundException var10) {
            }
         }
      }

      return null;
   }

   public final Constant getConstant(String name) {
      return this.nameToConstant.get(name);
   }

   public long maxValue() {
      if (this.maxValue == null) {
         this.maxValue = this.getLongField("MAX_VALUE", 2147483647L);
      }

      return this.maxValue.intValue();
   }

   public long minValue() {
      if (this.minValue == null) {
         this.minValue = this.getLongField("MIN_VALUE", -2147483648L);
      }

      return this.minValue.intValue();
   }

   @Override
   public Iterator<Constant> iterator() {
      return new ConstantSet.ConstantIterator(this.constants);
   }

   public long getValue(String name) {
      Constant c = this.getConstant(name);
      return c != null ? c.longValue() : 0L;
   }

   public static ConstantSet getConstantSet(String name) {
      ConstantSet constants = constantSets.get(name);
      return constants != null ? constants : loadConstantSet(name);
   }

   static {
      ClassLoader _loader = ConstantSet.class.getClassLoader();
      if (_loader != null) {
         LOADER = _loader;
      } else {
         LOADER = ClassLoader.getSystemClassLoader();
      }

      boolean canLoadResources = false;

      try {
         URL t = AccessController.doPrivileged(new PrivilegedAction<URL>()         // $VF: Compiled from ConstantSet.java
 {
            public URL run() {
               return ConstantSet.LOADER.getResource("jnr/constants/ConstantSet.class");
            }
         });
         InputStream stream = t.openStream();

         try {
            stream.read();
         } catch (Throwable var14) {
            RESOURCE_READ_ERROR = var14;
         } finally {
            try {
               stream.close();
            } catch (Exception var13) {
            }
         }

         canLoadResources = true;
      } catch (Throwable var16) {
         if (RESOURCE_READ_ERROR == null) {
            RESOURCE_READ_ERROR = var16;
         }
      }

      CAN_LOAD_RESOURCES = canLoadResources;
   }

   @Override
   public int size() {
      return this.constants.size();
   }

   @Override
   public boolean contains(Object o) {
      return o != null && o.getClass().equals(this.enumClass);
   }

   // $VF: Compiled from ConstantSet.java
   private final class ConstantIterator implements Iterator<Constant> {
      private final Iterator<Enum> it;
      private Constant next = null;

      @Override
      public void remove() {
         throw new UnsupportedOperationException();
      }

      public Constant next() {
         Constant prev = this.next;
         this.next = this.it.hasNext() ? (Constant)this.it.next() : null;
         return prev;
      }

      ConstantIterator(Collection<Enum> constants) {
         this.it = constants.iterator();
         this.next = this.it.hasNext() ? (Constant)this.it.next() : null;
      }

      @Override
      public boolean hasNext() {
         return this.next != null && !this.next.name().equals("__UNKNOWN_CONSTANT__");
      }
   }
}
