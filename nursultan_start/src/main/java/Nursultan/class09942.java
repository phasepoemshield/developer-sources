/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.impl.mapping.RuntimeMappingRegistry
 */
package Nursultan;

import Nursultan.class09939;
import Nursultan.class09948;
import Nursultan.class09951;
import Nursultan.class09956;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.loader.impl.mapping.RuntimeMappingRegistry;

public class class09942 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;

    private static void L(String string, String string2, String string3) {
        try {
            RuntimeMappingRegistry.registerMethodMapping((String)"intermediary", (String)string, (String)string2, null, (String)string3);
            RuntimeMappingRegistry.registerMethodMapping((String)"mappingfinder", (String)string, (String)string2, null, (String)string3);
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            // empty catch block
        }
    }

    private class09942() {
        this.u();
        this.N_0 = new HashMap();
        this.N_1 = new HashMap();
        this.N_2 = new HashMap();
    }

    static {
        class09942.i();
        y_0 = new class09942();
    }

    private static void i() {
        y_0 = null;
        y_1 = "mappingfinder";
        y_2 = "intermediary";
    }

    private static void u(String string, String string2, String string3) {
        try {
            RuntimeMappingRegistry.registerFieldMapping((String)"intermediary", (String)string, (String)string2, null, (String)string3);
            RuntimeMappingRegistry.registerFieldMapping((String)"mappingfinder", (String)string, (String)string2, null, (String)string3);
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            // empty catch block
        }
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_3 = false;
            this.N_4 = false;
        }
    }

    private static void y(String string, Class<?> clazz) {
        try {
            RuntimeMappingRegistry.registerClassMapping((String)"intermediary", (String)string, (String)clazz.getName());
            RuntimeMappingRegistry.registerClassMapping((String)"mappingfinder", (String)string, (String)clazz.getName());
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            // empty catch block
        }
    }

    private void y(String string, String string2, String string3) {
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        ((Map)this.N_2).put(new class09939(string, string2), string3);
        class09942.u(string, string2, string3);
    }

    private void N(String string, String string2, String string3) {
        if (string2 == null || string2.isEmpty()) {
            return;
        }
        ((Map)this.N_1).put(new class09939(string, string2), string3);
        class09942.L(string, string2, string3);
    }

    public synchronized class09942 N(String string, Class<?> clazz) {
        class09956 class099562;
        ((Map)this.N_0).put(string, clazz);
        class09942.y(string, clazz);
        for (Method accessibleObject : clazz.getDeclaredMethods()) {
            class099562 = accessibleObject.getAnnotation(class09956.class);
            if (class099562 == null) continue;
            this.N(string, class099562.N(), accessibleObject.getName());
            this.N(string, class099562.y(), accessibleObject.getName());
            this.N(string, accessibleObject.getName(), accessibleObject.getName());
        }
        for (AccessibleObject accessibleObject : clazz.getDeclaredFields()) {
            class099562 = ((Field)accessibleObject).getAnnotation(class09956.class);
            if (class099562 == null) continue;
            this.y(string, class099562.N(), ((Field)accessibleObject).getName());
            this.y(string, class099562.y(), ((Field)accessibleObject).getName());
            this.y(string, ((Field)accessibleObject).getName(), ((Field)accessibleObject).getName());
        }
        return this;
    }

    public synchronized String N(String string, String string2, String string3, String string4, String string5) {
        this.N();
        String string6 = (String)((Map)this.N_1).get((Object)new class09939(string2, string3));
        if (string6 != null) {
            return string6;
        }
        string6 = (String)((Map)this.N_1).get((Object)new class09939(string2, string5));
        if (string6 != null) {
            return string6;
        }
        Class clazz = (Class)((Map)this.N_0).get(string2);
        if (clazz != null) {
            return class09951.N(clazz, string5);
        }
        return string3;
    }

    public synchronized String N(String string, String string2) {
        this.N();
        String string3 = (String)((Map)this.N_2).get((Object)new class09939(string, string2));
        return string3 != null ? string3 : string2;
    }

    public synchronized void N() {
        if (((Boolean)this.N_3).booleanValue()) {
            return;
        }
        if (((Boolean)this.N_4).booleanValue()) {
            throw new IllegalStateException("Recursive mapping bootstrap");
        }
        this.N_4 = true;
        try {
            class09948.N(this);
            this.N_3 = true;
        }
        finally {
            this.N_4 = false;
        }
    }
}

