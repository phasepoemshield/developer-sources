/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import jnr.ffi.CallingConvention;
import jnr.ffi.LibraryOption;
import jnr.ffi.Platform;
import jnr.ffi.mapper.CompositeFunctionMapper;
import jnr.ffi.mapper.CompositeTypeMapper;
import jnr.ffi.mapper.DataConverter;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.FunctionMapper;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.SignatureTypeMapperAdapter;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.mapper.TypeMapper;
import jnr.ffi.provider.FFIProvider;
import jnr.ffi.provider.LoadedLibrary;

public abstract class LibraryLoader<T> {
    public static final String DEFAULT_LIBRARY = "RTLD_DEFAULT";
    private boolean failImmediately = false;
    private final TypeMapper.Builder typeMapperBuilder;
    private final FunctionMapper.Builder functionMapperBuilder;
    private final List<SignatureTypeMapper> typeMappers;
    private final List<String> libraryNames;
    private final Map<LibraryOption, Object> optionMap;
    private final List<FunctionMapper> functionMappers;
    private final List<String> searchPaths = new ArrayList<String>();
    private final Class<T> interfaceClass;

    public <J> LibraryLoader<T> map(Class<? extends J> javaType, ToNativeConverter<? extends J, ?> toNativeConverter) {
        this.typeMapperBuilder.map(javaType, toNativeConverter);
        return this;
    }

    public static <T> T loadLibrary(Class<T> interfaceClass, Map<LibraryOption, ?> libraryOptions, String ... libraryNames) {
        return LibraryLoader.loadLibrary(interfaceClass, libraryOptions, Collections.EMPTY_MAP, libraryNames);
    }

    public LibraryLoader<T> mapper(TypeMapper typeMapper) {
        this.typeMappers.add(new SignatureTypeMapperAdapter(typeMapper));
        return this;
    }

    public static <T> T loadLibrary(Class<T> interfaceClass, Map<LibraryOption, ?> libraryOptions, Map<String, List<String>> searchPaths, String ... libraryNames) {
        LibraryLoader<T> loader = FFIProvider.getSystemProvider().createLibraryLoader(interfaceClass);
        String[] stringArray = libraryNames;
        int n = stringArray.length;
        for (int i = 0; i < n; ++i) {
            String libraryName = stringArray[i];
            if (libraryName.equals(DEFAULT_LIBRARY)) {
                loader.searchDefault();
                continue;
            }
            loader.library(libraryName);
            List<String> paths = searchPaths.get(libraryName);
            if (paths == null) continue;
            for (String path : paths) {
                loader.search(path);
            }
        }
        if (libraryOptions != null) {
            for (Map.Entry entry : libraryOptions.entrySet()) {
                loader.option((LibraryOption)((Object)entry.getKey()), entry.getValue());
            }
        }
        return loader.failImmediately().load();
    }

    public LibraryLoader<T> map(String javaName, String nativeFunction) {
        this.functionMapperBuilder.map(javaName, nativeFunction);
        return this;
    }

    protected abstract T loadLibrary(Class<T> var1, Collection<String> var2, Collection<String> var3, Map<LibraryOption, Object> var4, boolean var5);

    public <J> LibraryLoader<T> map(Class<? extends J> javaType, DataConverter<? extends J, ?> dataConverter) {
        this.typeMapperBuilder.map(javaType, dataConverter);
        return this;
    }

    private T createErrorProxy(final Throwable ex) {
        Class[] classArray = new Class[2];
        classArray[0] = this.interfaceClass;
        classArray[1] = LoadedLibrary.class;
        return this.interfaceClass.cast(Proxy.newProxyInstance(this.interfaceClass.getClassLoader(), classArray, new InvocationHandler(){

            @Override
            public Object invoke(Object proxy, Method method, Object[] args2) throws Throwable {
                throw ex;
            }
        }));
    }

    public static <T> LibraryLoader<T> create(Class<T> interfaceClass) {
        return FFIProvider.getSystemProvider().createLibraryLoader(interfaceClass);
    }

    public static boolean saveError(Map<LibraryOption, ?> options, boolean methodHasSave, boolean methodHasIgnore) {
        boolean bl;
        boolean saveError = options.containsKey((Object)LibraryOption.SaveError) || !options.containsKey((Object)LibraryOption.IgnoreError);
        if (saveError) {
            if (methodHasIgnore && !methodHasSave) {
                saveError = false;
            }
        } else if (methodHasSave) {
            bl = true;
        }
        return bl;
    }

    public final LibraryLoader<T> failImmediately() {
        this.failImmediately = true;
        return this;
    }

    public LibraryLoader<T> searchDefault() {
        this.libraryNames.add(DEFAULT_LIBRARY);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public T load() {
        if (this.libraryNames.isEmpty()) {
            throw new UnsatisfiedLinkError("no library names specified");
        }
        this.typeMappers.add(0, new SignatureTypeMapperAdapter(this.typeMapperBuilder.build()));
        this.optionMap.put(LibraryOption.TypeMapper, this.typeMappers.size() > 1 ? new CompositeTypeMapper(this.typeMappers) : this.typeMappers.get(0));
        this.functionMappers.add(0, this.functionMapperBuilder.build());
        this.optionMap.put(LibraryOption.FunctionMapper, this.functionMappers.size() > 1 ? new CompositeFunctionMapper(this.functionMappers) : this.functionMappers.get(0));
        try {
            return this.loadLibrary(this.interfaceClass, Collections.unmodifiableList(this.libraryNames), this.getSearchPaths(), Collections.unmodifiableMap(this.optionMap), this.failImmediately);
        }
        catch (LinkageError error) {
            void ex;
            if (this.failImmediately) {
                throw error;
            }
            return this.createErrorProxy((Throwable)ex);
        }
        catch (Exception ex) {
            void var2_3;
            RuntimeException re;
            RuntimeException runtimeException = re = ex instanceof RuntimeException ? (RuntimeException)ex : new RuntimeException(ex);
            if (this.failImmediately) {
                throw re;
            }
            return this.createErrorProxy((Throwable)var2_3);
        }
    }

    public LibraryLoader<T> convention(CallingConvention convention) {
        this.optionMap.put(LibraryOption.CallingConvention, (Object)convention);
        return this;
    }

    public LibraryLoader<T> mapper(FunctionMapper functionMapper) {
        this.functionMappers.add(functionMapper);
        return this;
    }

    public final LibraryLoader<T> stdcall() {
        return this.convention(CallingConvention.STDCALL);
    }

    protected LibraryLoader(Class<T> interfaceClass) {
        this.libraryNames = new ArrayList<String>();
        this.typeMappers = new ArrayList<SignatureTypeMapper>();
        this.functionMappers = new ArrayList<FunctionMapper>();
        this.optionMap = new EnumMap<LibraryOption, Object>(LibraryOption.class);
        this.typeMapperBuilder = new TypeMapper.Builder();
        this.functionMapperBuilder = new FunctionMapper.Builder();
        this.interfaceClass = interfaceClass;
    }

    public LibraryLoader<T> option(LibraryOption option, Object value) {
        switch (option) {
            case TypeMapper: {
                if (value instanceof SignatureTypeMapper) {
                    this.mapper((SignatureTypeMapper)value);
                    break;
                }
                if (value instanceof TypeMapper) {
                    this.mapper((TypeMapper)value);
                    break;
                }
                if (value == null) break;
                throw new IllegalArgumentException("invalid TypeMapper: " + value.getClass());
            }
            case FunctionMapper: {
                this.mapper((FunctionMapper)value);
                break;
            }
            default: {
                this.optionMap.put(option, value);
            }
        }
        return this;
    }

    public T load(String libraryName) {
        return this.library(libraryName).load();
    }

    public LibraryLoader<T> library(String libraryName) {
        if (libraryName.equals(DEFAULT_LIBRARY)) {
            return this.searchDefault();
        }
        this.libraryNames.add(libraryName);
        return this;
    }

    public LibraryLoader<T> search(String path) {
        this.searchPaths.add(path);
        return this;
    }

    private static List<String> getPropertyPaths(String propName) {
        String value = System.getProperty(propName);
        if (value != null) {
            String[] paths = value.split(File.pathSeparator);
            return new ArrayList<String>(Arrays.asList(paths));
        }
        return Collections.emptyList();
    }

    public LibraryLoader<T> mapper(SignatureTypeMapper typeMapper) {
        this.typeMappers.add(typeMapper);
        return this;
    }

    public <J> LibraryLoader<T> map(Class<? extends J> javaType, FromNativeConverter<? extends J, ?> fromNativeConverter) {
        this.typeMapperBuilder.map(javaType, fromNativeConverter);
        return this;
    }

    private Collection<String> getSearchPaths() {
        ArrayList<String> paths = new ArrayList<String>(this.searchPaths);
        paths.addAll(DefaultLibPaths.PATHS);
        return Collections.unmodifiableList(paths);
    }

    static final class DefaultLibPaths {
        static final List<String> PATHS;

        DefaultLibPaths() {
        }

        static {
            LinkedHashSet<String> paths = new LinkedHashSet<String>();
            try {
                paths.addAll(LibraryLoader.getPropertyPaths("jnr.ffi.library.path"));
                paths.addAll(LibraryLoader.getPropertyPaths("jaffl.library.path"));
                paths.addAll(LibraryLoader.getPropertyPaths("jna.library.path"));
                paths.addAll(LibraryLoader.getPropertyPaths("java.library.path"));
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (Platform.getNativePlatform().isUnix()) {
                paths.add("/usr/local/lib");
                paths.add("/usr/lib");
                paths.add("/lib");
            }
            switch (Platform.getNativePlatform().getOS()) {
                case FREEBSD: 
                case OPENBSD: 
                case NETBSD: 
                case LINUX: 
                case ZLINUX: 
                case MIDNIGHTBSD: {
                    File ldSoConf = new File("/etc/ld.so.conf");
                    File ldSoConfD = new File("/etc/ld.so.conf.d");
                    if (ldSoConf.exists()) {
                        DefaultLibPaths.addPathsFromFile(paths, ldSoConf);
                    }
                    if (!ldSoConfD.isDirectory()) break;
                    for (File file : ldSoConfD.listFiles()) {
                        DefaultLibPaths.addPathsFromFile(paths, file);
                    }
                    break;
                }
            }
            PATHS = Collections.unmodifiableList(new ArrayList(paths));
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private static void addPathsFromFile(Collection<String> paths, File file) {
            if (!file.isFile()) return;
            if (!file.exists()) {
                return;
            }
            BufferedReader in = null;
            try {
                in = new BufferedReader(new FileReader(file));
                String line = in.readLine();
                while (line != null) {
                    if (!line.trim().isEmpty()) {
                        if (!line.startsWith("#")) {
                            if (!line.startsWith("include ")) {
                                paths.add(line);
                            }
                        }
                    }
                    String string = in.readLine();
                }
                if (in == null) return;
            }
            catch (IOException iOException) {
                if (in == null) return;
                try {
                    in.close();
                    return;
                }
                catch (IOException iOException2) {
                    return;
                }
            }
            catch (Throwable throwable) {
                if (in == null) throw throwable;
                try {
                    void var2_2;
                    var2_2.close();
                    throw throwable;
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                throw throwable;
            }
            try {
                in.close();
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }
    }
}

