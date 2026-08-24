/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.LastError;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
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
import jnr.ffi.provider.jffi.NativeClosureManager;
import jnr.ffi.provider.jffi.NativeLibrary;
import jnr.ffi.provider.jffi.NativeMemoryManager;

public final class NativeRuntime
extends AbstractRuntime {
    private final NativeMemoryManager mm = new NativeMemoryManager(this);
    private final Type[] aliases;
    final WeakHashMap<NativeLibrary, NativeLibrary.LoadedLibraryData> loadedLibraries;
    private final NativeClosureManager closureManager = new NativeClosureManager(this, new SignatureTypeMapperAdapter(new DefaultTypeMapper()));

    public static List<NativeLibrary.LoadedLibraryData> getLoadedLibraries() {
        if (NativeRuntime.getSystemRuntime() instanceof NativeRuntime) {
            return new ArrayList<NativeLibrary.LoadedLibraryData>(((NativeRuntime)NativeRuntime.getSystemRuntime()).loadedLibraries.values());
        }
        return Collections.emptyList();
    }

    public static NativeRuntime getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override
    public final NativeMemoryManager getMemoryManager() {
        return this.mm;
    }

    private NativeRuntime() {
        super(ByteOrder.nativeOrder(), NativeRuntime.buildTypeMap());
        this.loadedLibraries = new WeakHashMap();
        NativeType[] nativeAliases = NativeRuntime.buildNativeTypeAliases();
        EnumSet<TypeAlias> typeAliasSet = EnumSet.allOf(TypeAlias.class);
        this.aliases = new Type[typeAliasSet.size()];
        Iterator iterator2 = typeAliasSet.iterator();
        while (iterator2.hasNext()) {
            TypeAlias alias = (TypeAlias)((Object)iterator2.next());
            if (nativeAliases.length > alias.ordinal() && nativeAliases[alias.ordinal()] != NativeType.VOID) {
                this.aliases[alias.ordinal()] = this.findType(nativeAliases[alias.ordinal()]);
                continue;
            }
            this.aliases[alias.ordinal()] = new BadType(alias.name());
        }
    }

    @Override
    public void setLastError(int error) {
        LastError.getInstance().set(error);
    }

    public int hashCode() {
        int result = this.mm.hashCode();
        result = 31 * result + this.closureManager.hashCode();
        result = 31 * result + Arrays.hashCode(this.aliases);
        return result;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) return false;
        if (this.getClass() != o.getClass()) {
            return false;
        }
        NativeRuntime that = (NativeRuntime)o;
        if (!Arrays.equals(this.aliases, that.aliases)) return false;
        if (!this.closureManager.equals(that.closureManager)) return false;
        if (!this.mm.equals(that.mm)) return false;
        return true;
    }

    @Override
    public int getLastError() {
        return LastError.getInstance().get();
    }

    private static Type jafflType(NativeType type) {
        switch (type) {
            case VOID: {
                return new TypeDelegate(com.kenai.jffi.Type.VOID, NativeType.VOID);
            }
            case SCHAR: {
                return new TypeDelegate(com.kenai.jffi.Type.SCHAR, NativeType.SCHAR);
            }
            case UCHAR: {
                return new TypeDelegate(com.kenai.jffi.Type.UCHAR, NativeType.UCHAR);
            }
            case SSHORT: {
                return new TypeDelegate(com.kenai.jffi.Type.SSHORT, NativeType.SSHORT);
            }
            case USHORT: {
                return new TypeDelegate(com.kenai.jffi.Type.USHORT, NativeType.USHORT);
            }
            case SINT: {
                return new TypeDelegate(com.kenai.jffi.Type.SINT, NativeType.SINT);
            }
            case UINT: {
                return new TypeDelegate(com.kenai.jffi.Type.UINT, NativeType.UINT);
            }
            case SLONG: {
                return new TypeDelegate(com.kenai.jffi.Type.SLONG, NativeType.SLONG);
            }
            case ULONG: {
                return new TypeDelegate(com.kenai.jffi.Type.ULONG, NativeType.ULONG);
            }
            case SLONGLONG: {
                return new TypeDelegate(com.kenai.jffi.Type.SINT64, NativeType.SLONGLONG);
            }
            case ULONGLONG: {
                return new TypeDelegate(com.kenai.jffi.Type.UINT64, NativeType.ULONGLONG);
            }
            case FLOAT: {
                return new TypeDelegate(com.kenai.jffi.Type.FLOAT, NativeType.FLOAT);
            }
            case DOUBLE: {
                return new TypeDelegate(com.kenai.jffi.Type.DOUBLE, NativeType.DOUBLE);
            }
            case ADDRESS: {
                return new TypeDelegate(com.kenai.jffi.Type.POINTER, NativeType.ADDRESS);
            }
        }
        return new BadType(type.toString());
    }

    public ObjectReferenceManager newObjectReferenceManager() {
        return new DefaultObjectReferenceManager(this);
    }

    @Override
    public NativeClosureManager getClosureManager() {
        return this.closureManager;
    }

    @Override
    public boolean isCompatible(Runtime other) {
        return other instanceof NativeRuntime;
    }

    /*
     * WARNING - void declaration
     */
    private static EnumMap<NativeType, Type> buildTypeMap() {
        void var0;
        EnumMap<NativeType, Type> typeMap = new EnumMap<NativeType, Type>(NativeType.class);
        EnumSet<NativeType> nativeTypes = EnumSet.allOf(NativeType.class);
        Iterator iterator2 = nativeTypes.iterator();
        while (iterator2.hasNext()) {
            NativeType t = (NativeType)((Object)iterator2.next());
            typeMap.put(t, NativeRuntime.jafflType(t));
        }
        return var0;
    }

    /*
     * WARNING - void declaration
     */
    private static NativeType[] buildNativeTypeAliases() {
        void var5_5;
        Platform platform = Platform.getNativePlatform();
        Package pkg = NativeRuntime.class.getPackage();
        String cpu = platform.getCPU().toString();
        String os = platform.getOS().toString();
        EnumSet<TypeAlias> typeAliases = EnumSet.allOf(TypeAlias.class);
        NativeType[] aliases = new NativeType[]{};
        try {
            Class<?> cls = Class.forName(pkg.getName() + ".platform." + cpu + "." + os + ".TypeAliases");
            Field aliasesField = cls.getField("ALIASES");
            Map aliasMap = (Map)Map.class.cast(aliasesField.get(cls));
            aliases = new NativeType[typeAliases.size()];
            for (TypeAlias t : typeAliases) {
                aliases[t.ordinal()] = (NativeType)((Object)aliasMap.get((Object)t));
                if (aliases[t.ordinal()] != null) continue;
                aliases[t.ordinal()] = NativeType.VOID;
            }
        }
        catch (ClassNotFoundException cne) {
            Logger.getLogger(NativeRuntime.class.getName()).log(Level.SEVERE, "failed to load type aliases: " + cne);
        }
        catch (NoSuchFieldException nsfe) {
            Logger.getLogger(NativeRuntime.class.getName()).log(Level.SEVERE, "failed to load type aliases: " + nsfe);
        }
        catch (IllegalAccessException iae) {
            Logger.getLogger(NativeRuntime.class.getName()).log(Level.SEVERE, "failed to load type aliases: " + iae);
        }
        return var5_5;
    }

    @Override
    public Type findType(TypeAlias type) {
        return this.aliases[type.ordinal()];
    }

    private static final class TypeDelegate
    extends Type {
        private final NativeType nativeType;
        private final com.kenai.jffi.Type type;

        public String toString() {
            return this.type.toString();
        }

        public TypeDelegate(com.kenai.jffi.Type type, NativeType nativeType) {
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

    private static final class SingletonHolder {
        public static final NativeRuntime INSTANCE = new NativeRuntime();

        private SingletonHolder() {
        }
    }
}

