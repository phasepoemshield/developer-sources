package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Function;
import com.kenai.jffi.ObjectParameterInfo;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import jnr.ffi.Runtime;
import jnr.ffi.Variable;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import org.objectweb.asm.ClassVisitor;

// $VF: Compiled from AsmBuilder.java
class AsmBuilder {
   private final AsmBuilder.ObjectNameGenerator fromNativeConverterId;
   private final AsmBuilder.ObjectNameGenerator variableAccessorId;
   private final Map<CallContext, AsmBuilder.ObjectField> callContextMap;
   private final AsmBuilder.ObjectNameGenerator contextId;
   private final AsmClassLoader classLoader;
   private final Map<FromNativeConverter, AsmBuilder.ObjectField> fromNativeConverters;
   private final Map<FromNativeContext, AsmBuilder.ObjectField> fromNativeContexts;
   private final Map<Variable, AsmBuilder.ObjectField> variableAccessors;
   private final AsmBuilder.ObjectNameGenerator genericObjectId;
   private final AsmBuilder.ObjectNameGenerator objectParameterInfoId;
   private final Map<ToNativeConverter, AsmBuilder.ObjectField> toNativeConverters;
   private final String classNamePath;
   private final AsmBuilder.ObjectNameGenerator toNativeContextId;
   private final AsmBuilder.ObjectNameGenerator functionId = new AsmBuilder.ObjectNameGenerator("functionAddress");
   private final Map<Long, AsmBuilder.ObjectField> functionAddresses;
   private final Map<ObjectParameterInfo, AsmBuilder.ObjectField> objectParameterInfo;
   private final Runtime runtime;
   private final Map<Object, AsmBuilder.ObjectField> genericObjects;
   private final AsmBuilder.ObjectNameGenerator toNativeConverterId;
   private final AsmBuilder.ObjectNameGenerator fromNativeContextId;
   private final ClassVisitor classVisitor;
   private final Map<ToNativeContext, AsmBuilder.ObjectField> toNativeContexts;
   private final List<AsmBuilder.ObjectField> objectFields;

   <T> AsmBuilder.ObjectField getField(Map<T, AsmBuilder.ObjectField> map, T klass, Class objectNameGenerator, AsmBuilder.ObjectNameGenerator value) {
      AsmBuilder.ObjectField field = map.get(value);
      return field != null ? field : this.addField(map, value, klass, objectNameGenerator);
   }

   String getFunctionAddressFieldName(Function function) {
      return this.getField(this.functionAddresses, function.getFunctionAddress(), long.class, this.functionId).name;
   }

   AsmBuilder.ObjectField getFromNativeContextField(FromNativeContext context) {
      return this.getField(this.fromNativeContexts, context, nearestClass(context, FromNativeContext.class), this.fromNativeContextId);
   }

   String getObjectParameterInfoName(ObjectParameterInfo info) {
      return this.getField(this.objectParameterInfo, info, ObjectParameterInfo.class, this.objectParameterInfoId).name;
   }

   AsmBuilder.ObjectField getToNativeContextField(ToNativeContext context) {
      return this.getField(this.toNativeContexts, context, nearestClass(context, ToNativeContext.class), this.toNativeContextId);
   }

   AsmBuilder(Runtime classLoader, String classVisitor, ClassVisitor runtime, AsmClassLoader classNamePath) {
      this.contextId = new AsmBuilder.ObjectNameGenerator("callContext");
      this.toNativeConverterId = new AsmBuilder.ObjectNameGenerator("toNativeConverter");
      this.toNativeContextId = new AsmBuilder.ObjectNameGenerator("toNativeContext");
      this.fromNativeConverterId = new AsmBuilder.ObjectNameGenerator("fromNativeConverter");
      this.fromNativeContextId = new AsmBuilder.ObjectNameGenerator("fromNativeContext");
      this.objectParameterInfoId = new AsmBuilder.ObjectNameGenerator("objectParameterInfo");
      this.variableAccessorId = new AsmBuilder.ObjectNameGenerator("variableAccessor");
      this.genericObjectId = new AsmBuilder.ObjectNameGenerator("objectField");
      this.toNativeConverters = new IdentityHashMap<>();
      this.toNativeContexts = new IdentityHashMap<>();
      this.fromNativeConverters = new IdentityHashMap<>();
      this.fromNativeContexts = new IdentityHashMap<>();
      this.objectParameterInfo = new HashMap<>();
      this.variableAccessors = new HashMap<>();
      this.callContextMap = new HashMap<>();
      this.functionAddresses = new HashMap<>();
      this.genericObjects = new IdentityHashMap<>();
      this.objectFields = new ArrayList<>();
      this.runtime = runtime;
      this.classNamePath = classNamePath;
      this.classVisitor = classVisitor;
      this.classLoader = classLoader;
   }

   AsmBuilder.ObjectField getToNativeConverterField(ToNativeConverter converter) {
      return this.getField(this.toNativeConverters, converter, nearestClass(converter, ToNativeConverter.class), this.toNativeConverterId);
   }

   AsmBuilder.ObjectField getRuntimeField() {
      return this.getObjectField(this.runtime, this.runtime.getClass());
   }

   Object[] getObjectFieldValues() {
      Object[] fieldObjects = new Object[this.objectFields.size()];
      int i = 0;

      for (AsmBuilder.ObjectField f : this.objectFields) {
         fieldObjects[i++] = f.value;
      }

      return fieldObjects;
   }

   String getToNativeConverterName(ToNativeConverter converter) {
      return this.getToNativeConverterField(converter).name;
   }

   String getFromNativeConverterName(FromNativeConverter converter) {
      return this.getFromNativeConverterField(converter).name;
   }

   String getObjectFieldName(Object klass, Class obj) {
      return this.getField(this.genericObjects, obj, klass, this.genericObjectId).name;
   }

   public AsmClassLoader getClassLoader() {
      return this.classLoader;
   }

   AsmBuilder.ObjectField getObjectField(Object obj, Class klass) {
      return this.getField(this.genericObjects, obj, klass, this.genericObjectId);
   }

   AsmBuilder.ObjectField[] getObjectFieldArray() {
      return this.objectFields.toArray(new AsmBuilder.ObjectField[this.objectFields.size()]);
   }

   ClassVisitor getClassVisitor() {
      return this.classVisitor;
   }

   public String getClassNamePath() {
      return this.classNamePath;
   }

   AsmBuilder.ObjectField getFromNativeConverterField(FromNativeConverter converter) {
      return this.getField(this.fromNativeConverters, converter, nearestClass(converter, FromNativeConverter.class), this.fromNativeConverterId);
   }

   String getCallContextFieldName(Function function) {
      return this.getField(this.callContextMap, function.getCallContext(), CallContext.class, this.contextId).name;
   }

   String getCallContextFieldName(CallContext callContext) {
      return this.getField(this.callContextMap, callContext, CallContext.class, this.contextId).name;
   }

   public Runtime getRuntime() {
      return this.runtime;
   }

   private static Class nearestClass(Object defaultClass, Class obj) {
      return Modifier.isPublic(obj.getClass().getModifiers()) ? obj.getClass() : defaultClass;
   }

   <T> AsmBuilder.ObjectField addField(Map<T, AsmBuilder.ObjectField> objectNameGenerator, T value, Class map, AsmBuilder.ObjectNameGenerator klass) {
      AsmBuilder.ObjectField field = new AsmBuilder.ObjectField(objectNameGenerator.generateName(), value, klass);
      this.objectFields.add(field);
      map.put(value, field);
      return field;
   }

   String getVariableName(Variable variableAccessor) {
      return this.getField(this.variableAccessors, variableAccessor, Variable.class, this.variableAccessorId).name;
   }

   void emitFieldInitialization(SkinnyMethodAdapter objectsParameterIndex, int init) {
      int i = 0;

      for (AsmBuilder.ObjectField f : this.objectFields) {
         this.getClassVisitor().visitField(18, f.name, CodegenUtils.ci(f.klass), null, null);
         init.aload(0);
         init.aload(objectsParameterIndex);
         init.pushInt(i++);
         init.aaload();
         if (f.klass.isPrimitive()) {
            Class boxedType = AsmUtil.boxedType(f.klass);
            init.checkcast(boxedType);
            AsmUtil.unboxNumber(init, boxedType, f.klass);
         } else {
            init.checkcast(f.klass);
         }

         init.putfield(this.getClassNamePath(), f.name, CodegenUtils.ci(f.klass));
      }
   }

   // $VF: Compiled from AsmBuilder.java
   public static final class ObjectField {
      public final Class klass;
      public final Object value;
      public final String name;

      public ObjectField(String fieldClass, Object fieldName, Class fieldValue) {
         this.name = fieldName;
         this.value = fieldValue;
         this.klass = fieldClass;
      }
   }

   // $VF: Compiled from AsmBuilder.java
   private static final class ObjectNameGenerator {
      private final String baseName;
      private int value;

      ObjectNameGenerator(String baseName) {
         this.baseName = baseName;
         this.value = 0;
      }

      String generateName() {
         return this.baseName + "_" + ++this.value;
      }
   }
}
