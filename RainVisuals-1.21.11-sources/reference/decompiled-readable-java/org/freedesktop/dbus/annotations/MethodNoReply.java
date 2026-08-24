/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.freedesktop.dbus.annotations.DBusInterfaceName;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
@DBusInterfaceName(value="org.freedesktop.DBus.Method.NoReply")
public @interface MethodNoReply {
    public boolean value() default true;
}

