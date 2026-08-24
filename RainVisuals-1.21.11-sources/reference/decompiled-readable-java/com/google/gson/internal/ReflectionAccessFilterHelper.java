/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.JavaVersion;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

public class ReflectionAccessFilterHelper {
    /*
     * WARNING - void declaration
     */
    public static ReflectionAccessFilter.FilterResult getFilterResult(List<ReflectionAccessFilter> reflectionFilters, Class<?> c) {
        Iterator<ReflectionAccessFilter> iterator2 = reflectionFilters.iterator();
        while (iterator2.hasNext()) {
            void var4_4;
            ReflectionAccessFilter filter = iterator2.next();
            ReflectionAccessFilter.FilterResult result = filter.check(c);
            if (result == ReflectionAccessFilter.FilterResult.INDECISIVE) continue;
            return var4_4;
        }
        return ReflectionAccessFilter.FilterResult.ALLOW;
    }

    private static boolean isJavaType(String className) {
        return className.startsWith("java.") || className.startsWith("javax.");
    }

    private static boolean isAndroidType(String className) {
        return className.startsWith("android.") || className.startsWith("androidx.") || ReflectionAccessFilterHelper.isJavaType(className);
    }

    private ReflectionAccessFilterHelper() {
    }

    public static boolean isAndroidType(Class<?> c) {
        return ReflectionAccessFilterHelper.isAndroidType(c.getName());
    }

    public static boolean isJavaType(Class<?> c) {
        return ReflectionAccessFilterHelper.isJavaType(c.getName());
    }

    public static boolean canAccess(AccessibleObject accessibleObject, Object object) {
        return AccessChecker.INSTANCE.canAccess(accessibleObject, object);
    }

    public static boolean isAnyPlatformType(Class<?> c) {
        String className = c.getName();
        return ReflectionAccessFilterHelper.isAndroidType(className) || className.startsWith("kotlin.") || className.startsWith("kotlinx.") || className.startsWith("scala.");
    }

    private static abstract class AccessChecker {
        public static final AccessChecker INSTANCE;

        public abstract boolean canAccess(AccessibleObject var1, Object var2);

        private AccessChecker() {
        }

        /*
         * WARNING - void declaration
         */
        static {
            void var0;
            AccessChecker accessChecker = null;
            if (JavaVersion.isJava9OrLater()) {
                try {
                    void var1_1;
                    Class[] classArray = new Class[1];
                    classArray[0] = Object.class;
                    Method canAccessMethod = AccessibleObject.class.getDeclaredMethod("canAccess", classArray);
                    accessChecker = new AccessChecker((Method)var1_1){
                        final /* synthetic */ Method val$canAccessMethod;
                        {
                            this.val$canAccessMethod = method;
                        }

                        @Override
                        public boolean canAccess(AccessibleObject accessibleObject, Object object) {
                            try {
                                Object[] objectArray = new Object[1];
                                objectArray[0] = object;
                                return (Boolean)this.val$canAccessMethod.invoke((Object)accessibleObject, objectArray);
                            }
                            catch (Exception e) {
                                throw new RuntimeException("Failed invoking canAccess", e);
                            }
                        }
                    };
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    // empty catch block
                }
            }
            if (accessChecker == null) {
                accessChecker = new AccessChecker(){

                    @Override
                    public boolean canAccess(AccessibleObject accessibleObject, Object object) {
                        return true;
                    }
                };
            }
            INSTANCE = var0;
        }
    }
}

