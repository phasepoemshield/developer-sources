/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.freedesktop.dbus.annotations.DBusInterfaceName;

@DBusInterfaceName(value="org.freedesktop.DBus.Deprecated")
@Retention(value=RetentionPolicy.RUNTIME)
public @interface DeprecatedOnDBus {
    public boolean value() default true;
}

