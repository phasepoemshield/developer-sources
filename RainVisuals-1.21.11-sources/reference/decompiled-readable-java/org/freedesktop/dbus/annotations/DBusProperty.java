/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.freedesktop.dbus.annotations.DBusProperties;
import org.freedesktop.dbus.types.Variant;

@Repeatable(value=DBusProperties.class)
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface DBusProperty {
    public String name();

    public Access access() default Access.READ_WRITE;

    public Class<?> type() default Variant.class;

    public static final class Access
    extends Enum<Access> {
        public static final /* enum */ Access READ = new Access("read");
        private final String accessName;
        public static final /* enum */ Access READ_WRITE = new Access("readwrite");
        private static final /* synthetic */ Access[] $VALUES;
        public static final /* enum */ Access WRITE = new Access("write");

        public static Access valueOf(String name) {
            return Enum.valueOf(Access.class, name);
        }

        private Access(String _accessName) {
            this.accessName = _accessName;
        }

        private static /* synthetic */ Access[] $values() {
            Access[] accessArray = new Access[3];
            accessArray[0] = READ;
            accessArray[1] = READ_WRITE;
            accessArray[2] = WRITE;
            return accessArray;
        }

        public String getAccessName() {
            return this.accessName;
        }

        public static Access[] values() {
            return (Access[])$VALUES.clone();
        }

        static {
            $VALUES = Access.$values();
        }
    }
}

