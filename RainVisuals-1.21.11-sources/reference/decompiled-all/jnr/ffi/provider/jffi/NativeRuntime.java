package jnr.ffi.provider.jffi;

import com.kenai.jffi.LastError;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import jnr.ffi.NativeType;
import jnr.ffi.ObjectReferenceManager;
import jnr.ffi.Platform;
import jnr.ffi.Runtime;
import jnr.ffi.Type;
import jnr.ffi.TypeAlias;
import jnr.ffi.mapper.DefaultTypeMapper;
import jnr.ffi.mapper.SignatureTypeMapperAdapter;
import jnr.ffi.provider.AbstractRuntime;
import jnr.ffi.provider.BadType;
import jnr.ffi.provider.DefaultObjectReferenceManager;

// $VF: Compiled from NativeRuntime.java
public final class NativeRuntime extends AbstractRuntime {
   private final NativeMemoryManager mm = new NativeMemoryManager(this);
   private final Type[] aliases;
   final WeakHashMap<NativeLibrary, NativeLibrary.LoadedLibraryData> loadedLibraries;
   private final NativeClosureManager closureManager = new NativeClosureManager(this, new SignatureTypeMapperAdapter(new DefaultTypeMapper()));

   public static List<NativeLibrary.LoadedLibraryData> getLoadedLibraries() {
      return getSystemRuntime() instanceof NativeRuntime
         ? new ArrayList<>(((NativeRuntime)getSystemRuntime()).loadedLibraries.values())
         : Collections.emptyList();
   }

   public static NativeRuntime getInstance() {
      return NativeRuntime.SingletonHolder.INSTANCE;
   }

   public final NativeMemoryManager getMemoryManager() {
      return this.mm;
   }

   private NativeRuntime() {
      super(ByteOrder.nativeOrder(), buildTypeMap());
      this.loadedLibraries = new WeakHashMap<>();
      NativeType[] nativeAliases = buildNativeTypeAliases();
      EnumSet<TypeAlias> typeAliasSet = EnumSet.allOf(TypeAlias.class);
      this.aliases = new Type[typeAliasSet.size()];

      for (TypeAlias alias : typeAliasSet) {
         if (nativeAliases.length > alias.ordinal() && nativeAliases[alias.ordinal()] != NativeType.VOID) {
            this.aliases[alias.ordinal()] = this.findType(nativeAliases[alias.ordinal()]);
         } else {
            this.aliases[alias.ordinal()] = new BadType(alias.name());
         }
      }
   }

   @Override
   public void setLastError(int error) {
      LastError.getInstance().set(error);
   }

   @Override
   public int hashCode() {
      int result = this.mm.hashCode();
      result = 31 * result + this.closureManager.hashCode();
      return 31 * result + Arrays.hashCode(this.aliases);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (o != null && this.getClass() == o.getClass()) {
         NativeRuntime that = (NativeRuntime)o;
         return Arrays.equals(this.aliases, that.aliases) && this.closureManager.equals(that.closureManager) && this.mm.equals(that.mm);
      } else {
         return false;
      }
   }

   @Override
   public int getLastError() {
      return LastError.getInstance().get();
   }

   private static Type jafflType(NativeType type) {
      switch (type) {
         case VOID:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.VOID, NativeType.VOID);
         case SCHAR:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.SCHAR, NativeType.SCHAR);
         case UCHAR:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.UCHAR, NativeType.UCHAR);
         case SSHORT:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.SSHORT, NativeType.SSHORT);
         case USHORT:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.USHORT, NativeType.USHORT);
         case SINT:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.SINT, NativeType.SINT);
         case UINT:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.UINT, NativeType.UINT);
         case SLONG:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.SLONG, NativeType.SLONG);
         case ULONG:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.ULONG, NativeType.ULONG);
         case SLONGLONG:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.SINT64, NativeType.SLONGLONG);
         case ULONGLONG:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.UINT64, NativeType.ULONGLONG);
         case FLOAT:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.FLOAT, NativeType.FLOAT);
         case DOUBLE:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.DOUBLE, NativeType.DOUBLE);
         case ADDRESS:
            return new NativeRuntime.TypeDelegate(com.kenai.jffi.Type.POINTER, NativeType.ADDRESS);
         default:
            return new BadType(type.toString());
      }
   }

   @Override
   public ObjectReferenceManager newObjectReferenceManager() {
      return new DefaultObjectReferenceManager(this);
   }

   public NativeClosureManager getClosureManager() {
      return this.closureManager;
   }

   @Override
   public boolean isCompatible(Runtime other) {
      return other instanceof NativeRuntime;
   }

   private static EnumMap<NativeType, Type> buildTypeMap() {
      EnumMap<NativeType, Type> typeMap = new EnumMap<>(NativeType.class);

      for (NativeType t : EnumSet.allOf(NativeType.class)) {
         typeMap.put(t, jafflType(t));
      }

      return typeMap;
   }

   private static NativeType[] buildNativeTypeAliases() {
      Platform platform = Platform.getNativePlatform();
      Package pkg = NativeRuntime.class.getPackage();
      String cpu = platform.getCPU().toString();
      String os = platform.getOS().toString();
      EnumSet<TypeAlias> typeAliases = EnumSet.allOf(TypeAlias.class);
      NativeType[] aliases = new NativeType[0];

      try {
         Class cls = Class.forName(pkg.getName() + ".platform." + cpu + "." + os + ".TypeAliases");
         Field iae = cls.getField("ALIASES");
         Map aliasMap = Map.class.cast(iae.get(cls));
         aliases = new NativeType[typeAliases.size()];

         for (TypeAlias t : typeAliases) {
            aliases[t.ordinal()] = (NativeType)aliasMap.get(t);
            if (aliases[t.ordinal()] == null) {
               aliases[t.ordinal()] = NativeType.VOID;
            }
         }
      } catch (ClassNotFoundException var11) {
         Logger.getLogger(NativeRuntime.class.getName()).log(Level.SEVERE, "failed to load type aliases: " + var11);
      } catch (NoSuchFieldException var12) {
         Logger.getLogger(NativeRuntime.class.getName()).log(Level.SEVERE, "failed to load type aliases: " + var12);
      } catch (IllegalAccessException var13) {
         Logger.getLogger(NativeRuntime.class.getName()).log(Level.SEVERE, "failed to load type aliases: " + var13);
      }

      return aliases;
   }

   @Override
   public Type findType(TypeAlias type) {
      return this.aliases[type.ordinal()];
   }

   // $VF: Compiled from NativeRuntime.java
   private static final class SingletonHolder {
      public static final NativeRuntime INSTANCE = new NativeRuntime();
   }

   // $VF: Compiled from NativeRuntime.java
   private static final class TypeDelegate extends Type {
      private final NativeType nativeType;
      private final com.kenai.jffi.Type type;

      @Override
      public String toString() {
         return this.type.toString();
      }

      public TypeDelegate(com.kenai.jffi.Type nativeType, NativeType type) {
         this.type = type;
         this.nativeType = nativeType;
      }

      @Override
      public int size() {
         return this.type.size();
      }

      @Override
      public NativeType getNativeType() {
         return this.nativeType;
      }

      @Override
      public int alignment() {
         return this.type.alignment();
      }
   }
}
