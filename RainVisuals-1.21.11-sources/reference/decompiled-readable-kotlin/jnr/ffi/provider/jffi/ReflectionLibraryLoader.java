package jnr.ffi.provider.jffi;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import jnr.ffi.CallingConvention;
import jnr.ffi.LibraryOption;
import jnr.ffi.Runtime;
import jnr.ffi.Variable;
import jnr.ffi.annotations.Synchronized;
import jnr.ffi.mapper.CompositeTypeMapper;
import jnr.ffi.mapper.FunctionMapper;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.provider.IdentityFunctionMapper;
import jnr.ffi.provider.InterfaceScanner;
import jnr.ffi.provider.Invoker;
import jnr.ffi.provider.LoadedLibrary;
import jnr.ffi.provider.NativeFunction;
import jnr.ffi.provider.NativeInvocationHandler;
import jnr.ffi.provider.NativeVariable;
import jnr.ffi.util.Annotations;

// $VF: Compiled from ReflectionLibraryLoader.java
class ReflectionLibraryLoader extends LibraryLoader {
   @Override
   <T> T loadLibrary(NativeLibrary interfaceClass, Class<T> library, Map<LibraryOption, ?> failImmediately, boolean libraryOptions) {
      Map<Method, Invoker> invokers = new ReflectionLibraryLoader.LazyLoader(library, interfaceClass, libraryOptions);
      if (failImmediately) {
         SignatureTypeMapper typeMapper = getSignatureTypeMapper(libraryOptions);
         CallingConvention libraryCallingConvention = InvokerUtil.getCallingConvention(interfaceClass, libraryOptions);
         InterfaceScanner scanner = new InterfaceScanner(interfaceClass, typeMapper, libraryCallingConvention);

         for (NativeFunction variable : scanner.functions()) {
            invokers.get(variable.getMethod());
         }

         for (NativeVariable var12 : scanner.variables()) {
            invokers.get(var12.getMethod());
         }
      }

      return interfaceClass.cast(
         Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[]{interfaceClass, LoadedLibrary.class}, new NativeInvocationHandler(invokers))
      );
   }

   // $VF: Compiled from ReflectionLibraryLoader.java
   private static final class FunctionNotFoundInvoker implements Invoker {
      private final Method method;
      private final String functionName;

      private FunctionNotFoundInvoker(Method method, String functionName) {
         this.method = method;
         this.functionName = functionName;
      }

      @Override
      public Object invoke(Object parameters, Object[] self) {
         throw new UnsatisfiedLinkError(String.format("native method '%s' not found for method %s", this.functionName, this.method));
      }
   }

   // $VF: Compiled from ReflectionLibraryLoader.java
   private static final class GetRuntimeInvoker implements Invoker {
      private final Runtime runtime;

      @Override
      public Object invoke(Object self, Object[] parameters) {
         return this.runtime;
      }

      private GetRuntimeInvoker(Runtime runtime) {
         this.runtime = runtime;
      }
   }

   // $VF: Compiled from ReflectionLibraryLoader.java
   private static final class LazyLoader<T> extends AbstractMap<Method, Invoker> {
      private final Runtime runtime = NativeRuntime.getInstance();
      private final Class<T> interfaceClass;
      private final FunctionMapper functionMapper;
      private final boolean libraryIsSynchronized;
      private final Map<LibraryOption, ?> libraryOptions;
      private final SignatureTypeMapper typeMapper;
      private final AsmClassLoader classLoader = new AsmClassLoader();
      private final DefaultInvokerFactory invokerFactory;
      private final CallingConvention libraryCallingConvention;
      private final NativeLibrary library;

      @Override
      public Set<Entry<Method, Invoker>> entrySet() {
         throw new UnsupportedOperationException("not implemented");
      }

      public synchronized Invoker get(Object key) {
         if (!(key instanceof Method)) {
            throw new IllegalArgumentException("key not instance of Method");
         } else {
            Method method = (Method)key;
            if (Variable.class.isAssignableFrom(method.getReturnType())) {
               return this.getVariableAccessor(method);
            } else {
               return method.getName().equals("getRuntime") && method.getReturnType().isAssignableFrom(NativeRuntime.class)
                  ? new ReflectionLibraryLoader.GetRuntimeInvoker(this.runtime)
                  : this.invokerFactory.createInvoker(method);
            }
         }
      }

      private Invoker getVariableAccessor(Method method) {
         Collection<Annotation> annotations = Annotations.sortedAnnotationCollection(method.getAnnotations());
         String functionName = this.functionMapper.mapFunctionName(method.getName(), new NativeFunctionMapperContext(this.library, annotations));
         long symbolAddress = this.library.getSymbolAddress(functionName);
         if (symbolAddress == 0L) {
            return new ReflectionLibraryLoader.FunctionNotFoundInvoker(method, functionName);
         }

         Variable variable = ReflectionVariableAccessorGenerator.createVariableAccessor(this.runtime, method, symbolAddress, this.typeMapper, annotations);
         return new ReflectionLibraryLoader.LazyLoader.VariableAcccessorInvoker(variable);
      }

      private LazyLoader(NativeLibrary library, Class<T> libraryOptions, Map<LibraryOption, ?> interfaceClass) {
         this.library = library;
         this.interfaceClass = interfaceClass;
         this.libraryOptions = libraryOptions;
         this.functionMapper = libraryOptions.containsKey(LibraryOption.FunctionMapper)
            ? (FunctionMapper)libraryOptions.get(LibraryOption.FunctionMapper)
            : IdentityFunctionMapper.getInstance();
         SignatureTypeMapper typeMapper = LibraryLoader.getSignatureTypeMapper(libraryOptions);
         CompositeTypeMapper closureTypeMapper = LibraryLoader.newClosureTypeMapper(this.classLoader, typeMapper);
         this.typeMapper = LibraryLoader.newCompositeTypeMapper(this.runtime, this.classLoader, typeMapper, closureTypeMapper);
         this.libraryCallingConvention = InvokerUtil.getCallingConvention(interfaceClass, libraryOptions);
         this.libraryIsSynchronized = interfaceClass.isAnnotationPresent(Synchronized.class);
         this.invokerFactory = new DefaultInvokerFactory(
            this.runtime, library, this.typeMapper, this.functionMapper, this.libraryCallingConvention, libraryOptions, this.libraryIsSynchronized
         );
      }

      // $VF: Compiled from ReflectionLibraryLoader.java
      private static final class VariableAcccessorInvoker implements Invoker {
         private final Variable variable;

         private VariableAcccessorInvoker(Variable variable) {
            this.variable = variable;
         }

         @Override
         public Object invoke(Object self, Object[] parameters) {
            return this.variable;
         }
      }
   }
}
