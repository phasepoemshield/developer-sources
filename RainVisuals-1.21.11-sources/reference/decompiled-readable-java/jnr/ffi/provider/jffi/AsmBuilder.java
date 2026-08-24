/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassVisitor
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Function;
import com.kenai.jffi.ObjectParameterInfo;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jnr.ffi.Runtime;
import jnr.ffi.Variable;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.AsmUtil;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.SkinnyMethodAdapter;
import org.objectweb.asm.ClassVisitor;

class AsmBuilder {
    private final ObjectNameGenerator fromNativeConverterId;
    private final ObjectNameGenerator variableAccessorId;
    private final Map<CallContext, ObjectField> callContextMap;
    private final ObjectNameGenerator contextId;
    private final AsmClassLoader classLoader;
    private final Map<FromNativeConverter, ObjectField> fromNativeConverters;
    private final Map<FromNativeContext, ObjectField> fromNativeContexts;
    private final Map<Variable, ObjectField> variableAccessors;
    private final ObjectNameGenerator genericObjectId;
    private final ObjectNameGenerator objectParameterInfoId;
    private final Map<ToNativeConverter, ObjectField> toNativeConverters;
    private final String classNamePath;
    private final ObjectNameGenerator toNativeContextId;
    private final ObjectNameGenerator functionId = new ObjectNameGenerator("functionAddress");
    private final Map<Long, ObjectField> functionAddresses;
    private final Map<ObjectParameterInfo, ObjectField> objectParameterInfo;
    private final Runtime runtime;
    private final Map<Object, ObjectField> genericObjects;
    private final ObjectNameGenerator toNativeConverterId;
    private final ObjectNameGenerator fromNativeContextId;
    private final ClassVisitor classVisitor;
    private final Map<ToNativeContext, ObjectField> toNativeContexts;
    private final List<ObjectField> objectFields;

    <T> ObjectField getField(Map<T, ObjectField> map, T value, Class klass, ObjectNameGenerator objectNameGenerator) {
        ObjectField field = map.get(value);
        return field != null ? field : this.addField(map, value, klass, objectNameGenerator);
    }

    String getFunctionAddressFieldName(Function function) {
        return this.getField(this.functionAddresses, Long.valueOf((long)function.getFunctionAddress()), Long.TYPE, (ObjectNameGenerator)this.functionId).name;
    }

    ObjectField getFromNativeContextField(FromNativeContext context) {
        return this.getField(this.fromNativeContexts, context, AsmBuilder.nearestClass(context, FromNativeContext.class), this.fromNativeContextId);
    }

    String getObjectParameterInfoName(ObjectParameterInfo info) {
        return this.getField(this.objectParameterInfo, info, ObjectParameterInfo.class, (ObjectNameGenerator)this.objectParameterInfoId).name;
    }

    ObjectField getToNativeContextField(ToNativeContext context) {
        return this.getField(this.toNativeContexts, context, AsmBuilder.nearestClass(context, ToNativeContext.class), this.toNativeContextId);
    }

    AsmBuilder(Runtime runtime, String classNamePath, ClassVisitor classVisitor, AsmClassLoader classLoader) {
        this.contextId = new ObjectNameGenerator("callContext");
        this.toNativeConverterId = new ObjectNameGenerator("toNativeConverter");
        this.toNativeContextId = new ObjectNameGenerator("toNativeContext");
        this.fromNativeConverterId = new ObjectNameGenerator("fromNativeConverter");
        this.fromNativeContextId = new ObjectNameGenerator("fromNativeContext");
        this.objectParameterInfoId = new ObjectNameGenerator("objectParameterInfo");
        this.variableAccessorId = new ObjectNameGenerator("variableAccessor");
        this.genericObjectId = new ObjectNameGenerator("objectField");
        this.toNativeConverters = new IdentityHashMap<ToNativeConverter, ObjectField>();
        this.toNativeContexts = new IdentityHashMap<ToNativeContext, ObjectField>();
        this.fromNativeConverters = new IdentityHashMap<FromNativeConverter, ObjectField>();
        this.fromNativeContexts = new IdentityHashMap<FromNativeContext, ObjectField>();
        this.objectParameterInfo = new HashMap<ObjectParameterInfo, ObjectField>();
        this.variableAccessors = new HashMap<Variable, ObjectField>();
        this.callContextMap = new HashMap<CallContext, ObjectField>();
        this.functionAddresses = new HashMap<Long, ObjectField>();
        this.genericObjects = new IdentityHashMap<Object, ObjectField>();
        this.objectFields = new ArrayList<ObjectField>();
        this.runtime = runtime;
        this.classNamePath = classNamePath;
        this.classVisitor = classVisitor;
        this.classLoader = classLoader;
    }

    ObjectField getToNativeConverterField(ToNativeConverter converter) {
        return this.getField(this.toNativeConverters, converter, AsmBuilder.nearestClass(converter, ToNativeConverter.class), this.toNativeConverterId);
    }

    ObjectField getRuntimeField() {
        return this.getObjectField(this.runtime, this.runtime.getClass());
    }

    /*
     * WARNING - void declaration
     */
    Object[] getObjectFieldValues() {
        void var1_1;
        Object[] fieldObjects = new Object[this.objectFields.size()];
        int i = 0;
        Iterator<ObjectField> iterator2 = this.objectFields.iterator();
        while (iterator2.hasNext()) {
            ObjectField f = iterator2.next();
            fieldObjects[i++] = f.value;
        }
        return var1_1;
    }

    String getToNativeConverterName(ToNativeConverter converter) {
        return this.getToNativeConverterField((ToNativeConverter)converter).name;
    }

    String getFromNativeConverterName(FromNativeConverter converter) {
        return this.getFromNativeConverterField((FromNativeConverter)converter).name;
    }

    String getObjectFieldName(Object obj, Class klass) {
        return this.getField(this.genericObjects, obj, (Class)klass, (ObjectNameGenerator)this.genericObjectId).name;
    }

    public AsmClassLoader getClassLoader() {
        return this.classLoader;
    }

    ObjectField getObjectField(Object obj, Class klass) {
        return this.getField(this.genericObjects, obj, klass, this.genericObjectId);
    }

    ObjectField[] getObjectFieldArray() {
        return this.objectFields.toArray(new ObjectField[this.objectFields.size()]);
    }

    ClassVisitor getClassVisitor() {
        return this.classVisitor;
    }

    public String getClassNamePath() {
        return this.classNamePath;
    }

    ObjectField getFromNativeConverterField(FromNativeConverter converter) {
        return this.getField(this.fromNativeConverters, converter, AsmBuilder.nearestClass(converter, FromNativeConverter.class), this.fromNativeConverterId);
    }

    String getCallContextFieldName(Function function) {
        return this.getField(this.callContextMap, function.getCallContext(), CallContext.class, (ObjectNameGenerator)this.contextId).name;
    }

    String getCallContextFieldName(CallContext callContext) {
        return this.getField(this.callContextMap, callContext, CallContext.class, (ObjectNameGenerator)this.contextId).name;
    }

    public Runtime getRuntime() {
        return this.runtime;
    }

    private static Class nearestClass(Object obj, Class defaultClass) {
        return Modifier.isPublic(obj.getClass().getModifiers()) ? obj.getClass() : defaultClass;
    }

    /*
     * WARNING - void declaration
     */
    <T> ObjectField addField(Map<T, ObjectField> map, T value, Class klass, ObjectNameGenerator objectNameGenerator) {
        void var5_5;
        ObjectField field = new ObjectField(objectNameGenerator.generateName(), value, klass);
        this.objectFields.add(field);
        map.put(value, field);
        return var5_5;
    }

    String getVariableName(Variable variableAccessor) {
        return this.getField(this.variableAccessors, variableAccessor, Variable.class, (ObjectNameGenerator)this.variableAccessorId).name;
    }

    void emitFieldInitialization(SkinnyMethodAdapter init, int objectsParameterIndex) {
        int i = 0;
        for (ObjectField f : this.objectFields) {
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

    public static final class ObjectField {
        public final Class klass;
        public final Object value;
        public final String name;

        public ObjectField(String fieldName, Object fieldValue, Class fieldClass) {
            this.name = fieldName;
            this.value = fieldValue;
            this.klass = fieldClass;
        }
    }
}

