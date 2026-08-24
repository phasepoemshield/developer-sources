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
import java.util.Map.Entry;
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

// $VF: Compiled from LibraryLoader.java
public abstract class LibraryLoader<T> {
   public static final String DEFAULT_LIBRARY = "RTLD_DEFAULT";
   private boolean failImmediately;
   private final TypeMapper.Builder typeMapperBuilder;
   private final FunctionMapper.Builder functionMapperBuilder;
   private final List<SignatureTypeMapper> typeMappers;
   private final List<String> libraryNames;
   private final Map<LibraryOption, Object> optionMap;
   private final List<FunctionMapper> functionMappers;
   private final List<String> searchPaths = new ArrayList<>();
   private final Class<T> interfaceClass;

   public <J> LibraryLoader<T> map(Class<? extends J> javaType, ToNativeConverter<? extends J, ?> toNativeConverter) {
      this.typeMapperBuilder.map(javaType, toNativeConverter);
      return this;
   }

   public static <T> T loadLibrary(Class<T> interfaceClass, Map<LibraryOption, ?> libraryNames, String... libraryOptions) {
      return loadLibrary(interfaceClass, libraryOptions, Collections.EMPTY_MAP, libraryNames);
   }

   public LibraryLoader<T> mapper(TypeMapper typeMapper) {
      this.typeMappers.add(new SignatureTypeMapperAdapter(typeMapper));
      return this;
   }

   public static <T> T loadLibrary(Class<T> searchPaths, Map<LibraryOption, ?> interfaceClass, Map<String, List<String>> libraryOptions, String... libraryNames) {
      LibraryLoader<T> loader = FFIProvider.getSystemProvider().createLibraryLoader(interfaceClass);

      for (String libraryName : libraryNames) {
         if (libraryName.equals("RTLD_DEFAULT")) {
            loader.searchDefault();
         } else {
            loader.library(libraryName);
            List<String> paths = searchPaths.get(libraryName);
            if (paths != null) {
               for (String path : paths) {
                  loader.search(path);
               }
            }
         }
      }

      if (libraryOptions != null) {
         for (Entry<LibraryOption, ?> var13 : libraryOptions.entrySet()) {
            loader.option((LibraryOption)var13.getKey(), var13.getValue());
         }
      }

      return loader.failImmediately().load();
   }

   public LibraryLoader<T> map(String nativeFunction, String javaName) {
      this.functionMapperBuilder.map(javaName, nativeFunction);
      return this;
   }

   protected abstract T loadLibrary(Class<T> var1, Collection<String> var2, Collection<String> var3, Map<LibraryOption, Object> var4, boolean var5);

   public <J> LibraryLoader<T> map(Class<? extends J> dataConverter, DataConverter<? extends J, ?> javaType) {
      this.typeMapperBuilder.map(javaType, dataConverter);
      return this;
   }

   private T createErrorProxy(Throwable ex) {
      return this.interfaceClass
         .cast(
            Proxy.newProxyInstance(
               this.interfaceClass.getClassLoader(),
               new Class[]{this.interfaceClass, LoadedLibrary.class},
               new InvocationHandler()      // $VF: Compiled from LibraryLoader.java
          {
                  @Override
                  public Object invoke(Object method, Method args, Object[] proxy) throws Throwable {
                     throw ex;
                  }
               }
            )
         );
   }

   public static <T> LibraryLoader<T> create(Class<T> interfaceClass) {
      return FFIProvider.getSystemProvider().createLibraryLoader(interfaceClass);
   }

   public static boolean saveError(Map<LibraryOption, ?> options, boolean methodHasSave, boolean methodHasIgnore) {
      boolean saveError = options.containsKey(LibraryOption.SaveError) || !options.containsKey(LibraryOption.IgnoreError);
      if (saveError) {
         if (methodHasIgnore && !methodHasSave) {
            saveError = false;
         }
      } else if (methodHasSave) {
         saveError = true;
      }

      return saveError;
   }

   public final LibraryLoader<T> failImmediately() {
      this.failImmediately = true;
      return this;
   }

   public LibraryLoader<T> searchDefault() {
      this.libraryNames.add("RTLD_DEFAULT");
      return this;
   }

   public T load() {
      if (this.libraryNames.isEmpty()) {
         throw new UnsatisfiedLinkError("no library names specified");
      }

      this.typeMappers.add(0, new SignatureTypeMapperAdapter(this.typeMapperBuilder.build()));
      this.optionMap.put(LibraryOption.TypeMapper, this.typeMappers.size() > 1 ? new CompositeTypeMapper(this.typeMappers) : this.typeMappers.get(0));
      this.functionMappers.add(0, this.functionMapperBuilder.build());
      this.optionMap
         .put(LibraryOption.FunctionMapper, this.functionMappers.size() > 1 ? new CompositeFunctionMapper(this.functionMappers) : this.functionMappers.get(0));

      try {
         return this.loadLibrary(
            this.interfaceClass,
            Collections.unmodifiableList(this.libraryNames),
            this.getSearchPaths(),
            Collections.unmodifiableMap(this.optionMap),
            this.failImmediately
         );
      } catch (LinkageError var3) {
         if (this.failImmediately) {
            throw var3;
         } else {
            return this.createErrorProxy(var3);
         }
      } catch (Exception var4) {
         RuntimeException re = var4 instanceof RuntimeException ? (RuntimeException)var4 : new RuntimeException(var4);
         if (this.failImmediately) {
            throw re;
         } else {
            return this.createErrorProxy(re);
         }
      }
   }

   public LibraryLoader<T> convention(CallingConvention convention) {
      this.optionMap.put(LibraryOption.CallingConvention, convention);
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
      this.libraryNames = new ArrayList<>();
      this.typeMappers = new ArrayList<>();
      this.functionMappers = new ArrayList<>();
      this.optionMap = new EnumMap<>(LibraryOption.class);
      this.typeMapperBuilder = new TypeMapper.Builder();
      this.functionMapperBuilder = new FunctionMapper.Builder();
      this.failImmediately = false;
      this.interfaceClass = interfaceClass;
   }

   public LibraryLoader<T> option(LibraryOption value, Object option) {
      switch (option) {
         case TypeMapper:
            if (value instanceof SignatureTypeMapper) {
               this.mapper((SignatureTypeMapper)value);
            } else if (value instanceof TypeMapper) {
               this.mapper((TypeMapper)value);
            } else if (value != null) {
               throw new IllegalArgumentException("invalid TypeMapper: " + value.getClass());
            }
            break;
         case FunctionMapper:
            this.mapper((FunctionMapper)value);
            break;
         default:
            this.optionMap.put(option, value);
      }

      return this;
   }

   public T load(String libraryName) {
      return this.library(libraryName).load();
   }

   public LibraryLoader<T> library(String libraryName) {
      if (libraryName.equals("RTLD_DEFAULT")) {
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
         return new ArrayList<>(Arrays.asList(paths));
      } else {
         return Collections.emptyList();
      }
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
      List<String> paths = new ArrayList<>(this.searchPaths);
      paths.addAll(LibraryLoader.DefaultLibPaths.PATHS);
      return Collections.unmodifiableList(paths);
   }

   // $VF: Compiled from LibraryLoader.java
   static final class DefaultLibPaths {
      static final List<String> PATHS;

      static {
         LinkedHashSet<String> paths = new LinkedHashSet<>();

         try {
            paths.addAll(LibraryLoader.getPropertyPaths("jnr.ffi.library.path"));
            paths.addAll(LibraryLoader.getPropertyPaths("jaffl.library.path"));
            paths.addAll(LibraryLoader.getPropertyPaths("jna.library.path"));
            paths.addAll(LibraryLoader.getPropertyPaths("java.library.path"));
         } catch (Exception var7) {
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
            case MIDNIGHTBSD:
               File ldSoConf = new File("/etc/ld.so.conf");
               File ldSoConfD = new File("/etc/ld.so.conf.d");
               if (ldSoConf.exists()) {
                  addPathsFromFile(paths, ldSoConf);
               }

               if (ldSoConfD.isDirectory()) {
                  for (File file : ldSoConfD.listFiles()) {
                     addPathsFromFile(paths, file);
                  }
               }
            default:
               PATHS = Collections.unmodifiableList(new ArrayList<>(paths));
         }
      }

      private static void addPathsFromFile(Collection<String> paths, File file) {
         if (file.isFile() && file.exists()) {
            BufferedReader in = null;

            try {
               in = new BufferedReader(new FileReader(file));

               for (String line = in.readLine(); line != null; line = in.readLine()) {
                  if (!line.trim().isEmpty() && !line.startsWith("#") && !line.startsWith("include ")) {
                     paths.add(line);
                  }
               }
            } catch (IOException var12) {
            } finally {
               if (in != null) {
                  try {
                     in.close();
                  } catch (IOException var11) {
                  }
               }
            }
         }
      }
   }
}
