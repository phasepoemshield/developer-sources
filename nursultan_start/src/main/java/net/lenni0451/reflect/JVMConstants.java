/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.ApiStatus$Internal
 */
package net.lenni0451.reflect;

import net.lenni0451.reflect.utils.FieldInitializer;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public class JVMConstants {
    public static final boolean OPENJ9_RUNTIME = System.getProperty("java.vm.name").toLowerCase().contains("openj9");
    public static final int JAVA_VERSION = (Integer)FieldInitializer.reqInit(FieldInitializer.ThrowingSupplier.getFirst(() -> {
        Class<?> versionClass = Class.forName("java.lang.Runtime$Version");
        Object version = Runtime.class.getDeclaredMethod("version", new Class[0]).invoke(null, new Object[0]);
        return (int)((Integer)versionClass.getDeclaredMethod("major", new Class[0]).invoke(version, new Object[0]));
    }, () -> {
        String[] specificationVersion = System.getProperty("java.specification.version").split("\\.");
        if (specificationVersion[0].equals("1")) {
            return Integer.parseInt(specificationVersion[1]);
        }
        return Integer.parseInt(specificationVersion[0]);
    }), () -> new IllegalStateException("Could not determine Java version"));
    public static final String CLASS_InstrumentationImpl = JVMConstants.calc("sun.instrument.InstrumentationImpl", new Object[0]);
    public static final String CLASS_MethodHandles_Lookup_ClassOption = JVMConstants.calc("java.lang.invoke.MethodHandles$Lookup$ClassOption", new Object[0]);
    public static final String CLASS_INTERNAL_Unsafe = JVMConstants.calc("jdk.internal.misc.Unsafe", new Object[0]);
    public static final String CLASS_INTERNAL_Reflection = JVMConstants.calc("jdk.internal.reflect.Reflection", new Object[0]);
    public static final String CLASS_SUN_Reflection = JVMConstants.calc("sun.reflect.Reflection", new Object[0]);
    public static final String CLASS_DirectMethodHandle_Constructor = JVMConstants.calc("java.lang.invoke.DirectMethodHandle$Constructor", new Object[0]);
    public static final String CLASS_MethodHandleNatives_Constants = JVMConstants.calc("java.lang.invoke.MethodHandleNatives$Constants", new Object[0]);
    public static final String CLASS_MemberName = JVMConstants.calc("java.lang.invoke.MemberName", new Object[0]);
    public static final String CLASS_LiveStackFrame = JVMConstants.calc("java.lang.LiveStackFrame", new Object[0]);
    public static final String CLASS_LiveStackFrameInfo = JVMConstants.calc("java.lang.LiveStackFrameInfo", new Object[0]);
    public static final String CLASS_LiveStackFrameInfo_PrimitiveSlot32 = JVMConstants.calc("java.lang.LiveStackFrameInfo$PrimitiveSlot32", new Object[0]);
    public static final String CLASS_LiveStackFrameInfo_PrimitiveSlot64 = JVMConstants.calc("java.lang.LiveStackFrameInfo$PrimitiveSlot64", new Object[0]);
    public static final String FIELD_MethodHandles_Lookup_IMPL_LOOKUP = JVMConstants.calc("IMPL_LOOKUP", new Object[0]);
    public static final String FIELD_URLClassLoader_ucp = JVMConstants.calc("ucp", new Object[0]);
    public static final String FIELD_URLClassPath_path = JVMConstants.calc("path", new Object[0]);
    public static final String FIELD_URLClassPath_loaders = JVMConstants.calc("loaders", new Object[0]);
    public static final String FIELD_Enum_$VALUES = JVMConstants.calc("$VALUES", new Object[0]);
    public static final String FIELD_Class_enumConstants = JVMConstants.calc("enumConstants", new Object[0]);
    public static final String FIELD_Class_enumConstantDirectory = JVMConstants.calc("enumConstantDirectory", new Object[0]);
    public static final String FIELD_Class_EnumVars = JVMConstants.calc("enumVars", new Object[0]);
    public static final String FIELD_Reflection_fieldFilterMap = JVMConstants.calc("fieldFilterMap", new Object[0]);
    public static final String FIELD_Reflection_methodFilterMap = JVMConstants.calc("methodFilterMap", new Object[0]);
    public static final String FIELD_Class_module = JVMConstants.calc("module", new Object[0]);
    public static final String FIELD_Module_EVERYONE_MODULE = JVMConstants.calc("EVERYONE_MODULE", new Object[0]);
    public static final String FIELD_MemberName_flags = JVMConstants.calc("flags", new Object[0]);
    public static final String FIELD_MethodHandleNatives_Constants_MN_IS_METHOD = JVMConstants.calc("MN_IS_METHOD", new Object[0]);
    public static final String FIELD_MethodHandleNatives_Constants_MN_IS_CONSTRUCTOR = JVMConstants.calc("MN_IS_CONSTRUCTOR", new Object[0]);
    public static final String METHOD_Class_getDeclaredClasses0 = JVMConstants.calc("getDeclaredClasses0", OPENJ9_RUNTIME, "getDeclaredClassesImpl");
    public static final String METHOD_Class_getDeclaredFields0 = JVMConstants.calc("getDeclaredFields0", OPENJ9_RUNTIME, "getDeclaredFieldsImpl");
    public static final String METHOD_Class_getDeclaredConstructors0 = JVMConstants.calc("getDeclaredConstructors0", OPENJ9_RUNTIME, "getDeclaredConstructorsImpl");
    public static final String METHOD_Class_getDeclaredMethods0 = JVMConstants.calc("getDeclaredMethods0", OPENJ9_RUNTIME, "getDeclaredMethodsImpl");
    public static final String METHOD_InstrumentationImpl_loadAgent = JVMConstants.calc("loadAgent", new Object[0]);
    public static final String METHOD_INTERNAL_Unsafe_defineClass = JVMConstants.calc("defineClass", new Object[0]);
    public static final String METHOD_Unsafe_defineAnonymousClass = JVMConstants.calc("defineAnonymousClass", new Object[0]);
    public static final String METHOD_Unsafe_defineClass = JVMConstants.calc("defineClass", new Object[0]);
    public static final String METHOD_MethodHandles_Lookup_defineHiddenClass = JVMConstants.calc("defineHiddenClass", new Object[0]);
    public static final String METHOD_MethodHandles_Lookup_getDirectMethod = JVMConstants.calc("getDirectMethod", new Object[0]);
    public static final String METHOD_MethodHandles_Lookup_ensureInitialized = JVMConstants.calc("ensureInitialized", new Object[0]);
    public static final String METHOD_URLClassPath_addURL = JVMConstants.calc("addURL", new Object[0]);
    public static final String METHOD_URLClassPath_getURLs = JVMConstants.calc("getURLs", new Object[0]);
    public static final String METHOD_ClassLoader_defineClass = JVMConstants.calc("defineClass", new Object[0]);
    public static final String METHOD_Module_implAddExportsOrOpens = JVMConstants.calc("implAddExportsOrOpens", new Object[0]);
    public static final String METHOD_Module_implAddEnableNativeAccess = JVMConstants.calc("implAddEnableNativeAccess", new Object[0]);
    public static final String METHOD_Module_implAddEnableNativeAccessToAllUnnamed = JVMConstants.calc("implAddEnableNativeAccessToAllUnnamed", new Object[0]);
    public static final String METHOD_SecurityManager_getClassContext = JVMConstants.calc("getClassContext", new Object[0]);
    public static final String METHOD_LiveStackFrame_getStackWalker = JVMConstants.calc("getStackWalker", new Object[0]);
    public static final String METHOD_LiveStackFrameInfo_getMonitors = JVMConstants.calc("getMonitors", new Object[0]);
    public static final String METHOD_LiveStackFrameInfo_getLocals = JVMConstants.calc("getLocals", new Object[0]);
    public static final String METHOD_LiveStackFrameInfo_getStack = JVMConstants.calc("getStack", new Object[0]);
    public static final String METHOD_LiveStackFrameInfo_mode = JVMConstants.calc("mode", new Object[0]);
    public static final String METHOD_LiveStackFrameInfo_PrimitiveSlot32_value = JVMConstants.calc("value", new Object[0]);
    public static final String METHOD_LiveStackFrameInfo_PrimitiveSlot64_value = JVMConstants.calc("value", new Object[0]);
    public static final String VM_OPTION_ObjectAlignmentInBytes = JVMConstants.calc("ObjectAlignmentInBytes", new Object[0]);

    private static String calc(String s, Object ... args) {
        if (args.length % 2 != 0) {
            throw new IllegalArgumentException("Arguments must be in pairs");
        }
        for (int i = 0; i < args.length; i += 2) {
            if (!(args[i] instanceof Boolean)) {
                throw new IllegalArgumentException("Argument " + i + " must be a boolean");
            }
            if (!Boolean.TRUE.equals(args[i])) continue;
            return args[i + 1].toString();
        }
        return s;
    }
}

