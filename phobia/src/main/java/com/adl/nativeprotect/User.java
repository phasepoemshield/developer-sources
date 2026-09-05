/*
 * Decompiled with CFR 0.152.
 */
package com.adl.nativeprotect;

import com.adl.nativeprotect.NativeLoader;
import java.util.HashMap;
import java.util.Map;

public class User {
    private static final User instance;
    private final Map<String, String> cache = new HashMap<String, String>();
    private boolean nativeFailed = false;

    public static User getInstance() {
        return instance;
    }

    private User() {
        try {
            this.cache.put("username", this.getUsername());
            this.cache.put("hwid", this.getHwid());
            this.cache.put("role", this.getRole());
            this.cache.put("uid", this.getUid());
            this.cache.put("subTime", this.getSubsTime());
        }
        catch (UnsatisfiedLinkError e2) {
            this.nativeFailed = true;
            this.cache.put("username", "KODEK");
            this.cache.put("hwid", "hwid-1231294809786-2348786");
            this.cache.put("role", "Admin");
            this.cache.put("uid", "777");
            this.cache.put("subTime", "2025-24-05");
        }
    }

    private String getUsername() {
        return System.getProperty("phobia.username", "https://t.me/drugsoluti0ns");
    }

    private String getHwid() {
        return System.getProperty("phobia.hwid", "phobia");
    }

    private String getRole() {
        return System.getProperty("phobia.role", "Admin");
    }

    private String getUid() {
        return System.getProperty("phobia.uid", "777");
    }

    private String getSubsTime() {
        return System.getProperty("phobia.subscription", "2099-12-31");
    }

    public String profile(String profile) {
        return this.cache.getOrDefault(profile, "");
    }

    static {
        NativeLoader.ensureNativeClassInitialized("nativo4ka", "com/adl/nativeprotect/User", User.class);
        instance = new User();
    }

    private static int __adl_guard_8c69b9f1743c96e3() {
        return 894405369;
    }
}

