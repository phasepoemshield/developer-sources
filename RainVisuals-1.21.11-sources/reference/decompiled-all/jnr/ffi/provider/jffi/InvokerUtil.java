package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.CallContextCache;
import com.kenai.jffi.Type;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import jnr.ffi.CallingConvention;
import jnr.ffi.LibraryOption;
import jnr.ffi.NativeType;
import jnr.ffi.Runtime;
import jnr.ffi.annotations.StdCall;
import jnr.ffi.mapper.DefaultSignatureType;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.FromNativeType;
import jnr.ffi.mapper.MethodParameterContext;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.mapper.ToNativeType;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.SigType;
import jnr.ffi.util.Annotations;

// $VF: Compiled from InvokerUtil.java
final class InvokerUtil {
   static final Map<NativeType, Type> jffiTypes;

   public static CallingConvention getCallingConvention(Map<LibraryOption, ?> libraryOptions) {
      Object convention = libraryOptions.get(LibraryOption.CallingConvention);
      if (convention instanceof com.kenai.jffi.CallingConvention) {
         return com.kenai.jffi.CallingConvention.DEFAULT.equals(convention) ? CallingConvention.DEFAULT : CallingConvention.STDCALL;
      }

      if (convention instanceof CallingConvention) {
         switch ((CallingConvention)convention) {
            case DEFAULT:
               return CallingConvention.DEFAULT;
            case STDCALL:
               return CallingConvention.STDCALL;
         }
      } else if (convention != null) {
         throw new IllegalArgumentException("unknown calling convention: " + convention);
      }

      return CallingConvention.DEFAULT;
   }

   static ResultType getResultType(
      Runtime fromNativeConverter, Class annotations, Collection<Annotation> type, FromNativeConverter fromNativeContext, FromNativeContext runtime
   ) {
      Collection<Annotation> converterAnnotations = ConverterMetaData.getAnnotations(fromNativeConverter);
      Collection<Annotation> allAnnotations = Annotations.mergeAnnotations(annotations, converterAnnotations);
      NativeType nativeType = getMethodResultNativeType(runtime, fromNativeConverter != null ? fromNativeConverter.nativeType() : type, allAnnotations);
      boolean useContext = fromNativeConverter != null && !hasAnnotation(converterAnnotations, FromNativeConverter.NoContext.class);
      return new ResultType(type, nativeType, allAnnotations, fromNativeConverter, useContext ? fromNativeContext : null);
   }

   public static boolean hasAnnotation(Collection<Annotation> annotations, Class<? extends Annotation> annotationClass) {
      for (Annotation a : annotations) {
         if (annotationClass.isInstance(a)) {
            return true;
         }
      }

      return false;
   }

   static {
      Map<NativeType, Type> m = new EnumMap<>(NativeType.class);
      m.put(NativeType.VOID, Type.VOID);
      m.put(NativeType.SCHAR, Type.SCHAR);
      m.put(NativeType.UCHAR, Type.UCHAR);
      m.put(NativeType.SSHORT, Type.SSHORT);
      m.put(NativeType.USHORT, Type.USHORT);
      m.put(NativeType.SINT, Type.SINT);
      m.put(NativeType.UINT, Type.UINT);
      m.put(NativeType.SLONG, Type.SLONG);
      m.put(NativeType.ULONG, Type.ULONG);
      m.put(NativeType.SLONGLONG, Type.SLONG_LONG);
      m.put(NativeType.ULONGLONG, Type.ULONG_LONG);
      m.put(NativeType.FLOAT, Type.FLOAT);
      m.put(NativeType.DOUBLE, Type.DOUBLE);
      m.put(NativeType.ADDRESS, Type.POINTER);
      jffiTypes = Collections.unmodifiableMap(m);
   }

   static CallContext getCallContext(SigType resultType, int fixedParamCount, SigType[] parameterTypes, CallingConvention requiresErrno, boolean convention) {
      return getCallContext(resultType, fixedParamCount, parameterTypes, parameterTypes.length, convention, requiresErrno);
   }

   static NativeType getMethodResultNativeType(Runtime resultClass, Class annotations, Collection<Annotation> runtime) {
      return Types.getType(runtime, resultClass, annotations).getNativeType();
   }

   public static final com.kenai.jffi.CallingConvention jffiConvention(CallingConvention callingConvention) {
      return callingConvention == CallingConvention.DEFAULT ? com.kenai.jffi.CallingConvention.DEFAULT : com.kenai.jffi.CallingConvention.STDCALL;
   }

   static Collection<Annotation> getAnnotations(ToNativeType toNativeType) {
      return toNativeType != null ? ConverterMetaData.getAnnotations(toNativeType.getToNativeConverter()) : Annotations.EMPTY_ANNOTATIONS;
   }

   static NativeType getMethodParameterNativeType(Runtime parameterClass, Class runtime, Collection<Annotation> annotations) {
      return Types.getType(runtime, parameterClass, annotations).getNativeType();
   }

   static CallContext getCallContext(
      SigType convention, int resultType, SigType[] requiresErrno, int paramTypesLength, CallingConvention parameterTypes, boolean fixedParamCount
   ) {
      Type[] nativeParamTypes = new Type[paramTypesLength];

      for (int i = 0; i < nativeParamTypes.length; i++) {
         nativeParamTypes[i] = jffiType(parameterTypes[i].getNativeType());
      }

      return CallContextCache.getInstance()
         .getCallContext(jffiType(resultType.getNativeType()), fixedParamCount, nativeParamTypes, jffiConvention(convention), requiresErrno);
   }

   public static CallingConvention getNativeCallingConvention(Method m) {
      return !m.isAnnotationPresent(StdCall.class) && !m.getDeclaringClass().isAnnotationPresent(StdCall.class)
         ? CallingConvention.DEFAULT
         : CallingConvention.STDCALL;
   }

   private static ParameterType getParameterType(
      Runtime type, Class toNativeContext, Collection<Annotation> annotations, ToNativeType toNativeType, ToNativeContext runtime
   ) {
      ToNativeConverter toNativeConverter = toNativeType != null ? toNativeType.getToNativeConverter() : null;
      NativeType nativeType = getMethodParameterNativeType(runtime, toNativeConverter != null ? toNativeConverter.nativeType() : type, annotations);
      return new ParameterType(type, nativeType, annotations, toNativeConverter, toNativeContext);
   }

   public static CallingConvention getCallingConvention(Class options, Map<LibraryOption, ?> interfaceClass) {
      return interfaceClass.isAnnotationPresent(StdCall.class) ? CallingConvention.STDCALL : getCallingConvention(options);
   }

   static Collection<Annotation> getAnnotations(FromNativeType fromNativeType) {
      return fromNativeType != null ? ConverterMetaData.getAnnotations(fromNativeType.getFromNativeConverter()) : Annotations.EMPTY_ANNOTATIONS;
   }

   private static ParameterType getParameterType(
      Runtime runtime, Class toNativeContext, Collection<Annotation> toNativeConverter, ToNativeConverter annotations, ToNativeContext type
   ) {
      NativeType nativeType = getMethodParameterNativeType(runtime, toNativeConverter != null ? toNativeConverter.nativeType() : type, annotations);
      return new ParameterType(type, nativeType, annotations, toNativeConverter, toNativeContext);
   }

   static CallContext getCallContext(SigType convention, SigType[] resultType, CallingConvention parameterTypes, boolean requiresErrno) {
      return getCallContext(resultType, parameterTypes.length, parameterTypes, parameterTypes.length, convention, requiresErrno);
   }

   static NativeType nativeType(jnr.ffi.Type jnrType) {
      return jnrType.getNativeType();
   }

   static Type jffiType(NativeType jnrType) {
      Type jffiType = jffiTypes.get(jnrType);
      if (jffiType != null) {
         return jffiType;
      } else {
         throw new IllegalArgumentException("unsupported parameter type: " + jnrType);
      }
   }

   static ResultType getResultType(
      Runtime fromNativeType, Class fromNativeContext, Collection<Annotation> type, FromNativeType runtime, FromNativeContext annotations
   ) {
      Collection<Annotation> converterAnnotations = getAnnotations(fromNativeType);
      Collection<Annotation> allAnnotations = Annotations.mergeAnnotations(annotations, converterAnnotations);
      FromNativeConverter fromNativeConverter = fromNativeType != null ? fromNativeType.getFromNativeConverter() : null;
      NativeType nativeType = getMethodResultNativeType(runtime, fromNativeConverter != null ? fromNativeConverter.nativeType() : type, allAnnotations);
      boolean useContext = fromNativeConverter != null && !hasAnnotation(converterAnnotations, FromNativeConverter.NoContext.class);
      return new ResultType(type, nativeType, allAnnotations, fromNativeConverter, useContext ? fromNativeContext : null);
   }

   static ParameterType[] getParameterTypes(Runtime runtime, SignatureTypeMapper m, Method typeMapper) {
      Class[] javaParameterTypes = m.getParameterTypes();
      Annotation[][] parameterAnnotations = m.getParameterAnnotations();
      ParameterType[] parameterTypes = new ParameterType[javaParameterTypes.length];

      for (int pidx = 0; pidx < javaParameterTypes.length; pidx++) {
         Collection<Annotation> annotations = Annotations.sortedAnnotationCollection(parameterAnnotations[pidx]);
         ToNativeContext toNativeContext = new MethodParameterContext(runtime, m, pidx, annotations);
         SignatureType signatureType = DefaultSignatureType.create(javaParameterTypes[pidx], toNativeContext);
         ToNativeType toNativeType = typeMapper.getToNativeType(signatureType, toNativeContext);
         ToNativeConverter toNativeConverter = toNativeType != null ? toNativeType.getToNativeConverter() : null;
         Collection<Annotation> converterAnnotations = ConverterMetaData.getAnnotations(toNativeConverter);
         Collection<Annotation> allAnnotations = Annotations.mergeAnnotations(annotations, converterAnnotations);
         boolean contextRequired = toNativeConverter != null && !hasAnnotation(converterAnnotations, ToNativeConverter.NoContext.class);
         parameterTypes[pidx] = getParameterType(runtime, javaParameterTypes[pidx], allAnnotations, toNativeConverter, contextRequired ? toNativeContext : null);
      }

      return parameterTypes;
   }
}
