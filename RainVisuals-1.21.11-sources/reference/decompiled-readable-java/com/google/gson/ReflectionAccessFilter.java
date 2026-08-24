/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.internal.ReflectionAccessFilterHelper;

public interface ReflectionAccessFilter {
    public static final ReflectionAccessFilter BLOCK_ALL_ANDROID;
    public static final ReflectionAccessFilter BLOCK_ALL_PLATFORM;
    public static final ReflectionAccessFilter BLOCK_INACCESSIBLE_JAVA;
    public static final ReflectionAccessFilter BLOCK_ALL_JAVA;

    public FilterResult check(Class<?> var1);

    static {
        BLOCK_INACCESSIBLE_JAVA = new ReflectionAccessFilter(){

            @Override
            public FilterResult check(Class<?> rawClass) {
                return ReflectionAccessFilterHelper.isJavaType(rawClass) ? FilterResult.BLOCK_INACCESSIBLE : FilterResult.INDECISIVE;
            }
        };
        BLOCK_ALL_JAVA = new ReflectionAccessFilter(){

            @Override
            public FilterResult check(Class<?> rawClass) {
                return ReflectionAccessFilterHelper.isJavaType(rawClass) ? FilterResult.BLOCK_ALL : FilterResult.INDECISIVE;
            }
        };
        BLOCK_ALL_ANDROID = new ReflectionAccessFilter(){

            @Override
            public FilterResult check(Class<?> rawClass) {
                return ReflectionAccessFilterHelper.isAndroidType(rawClass) ? FilterResult.BLOCK_ALL : FilterResult.INDECISIVE;
            }
        };
        BLOCK_ALL_PLATFORM = new ReflectionAccessFilter(){

            @Override
            public FilterResult check(Class<?> rawClass) {
                return ReflectionAccessFilterHelper.isAnyPlatformType(rawClass) ? FilterResult.BLOCK_ALL : FilterResult.INDECISIVE;
            }
        };
    }

    public static final class FilterResult
    extends Enum<FilterResult> {
        public static final /* enum */ FilterResult INDECISIVE;
        public static final /* enum */ FilterResult ALLOW;
        private static final /* synthetic */ FilterResult[] $VALUES;
        public static final /* enum */ FilterResult BLOCK_INACCESSIBLE;
        public static final /* enum */ FilterResult BLOCK_ALL;

        public static FilterResult valueOf(String name) {
            return Enum.valueOf(FilterResult.class, name);
        }

        public static FilterResult[] values() {
            return (FilterResult[])$VALUES.clone();
        }

        static {
            ALLOW = new FilterResult();
            INDECISIVE = new FilterResult();
            BLOCK_INACCESSIBLE = new FilterResult();
            BLOCK_ALL = new FilterResult();
            FilterResult[] filterResultArray = new FilterResult[4];
            filterResultArray[0] = ALLOW;
            filterResultArray[1] = INDECISIVE;
            filterResultArray[2] = BLOCK_INACCESSIBLE;
            filterResultArray[3] = BLOCK_ALL;
            $VALUES = filterResultArray;
        }
    }
}

