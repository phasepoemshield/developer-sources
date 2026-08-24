/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.freedesktop.dbus.annotations.DBusInterfaceName;

@DBusInterfaceName(value="org.freedesktop.DBus.Property.EmitsChangedSignal")
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
public @interface PropertiesEmitsChangedSignal {
    public EmitChangeSignal value();

    public static final class EmitChangeSignal
    extends Enum<EmitChangeSignal> {
        public static final /* enum */ EmitChangeSignal FALSE;
        public static final /* enum */ EmitChangeSignal CONST;
        public static final /* enum */ EmitChangeSignal INVALIDATES;
        public static final /* enum */ EmitChangeSignal TRUE;
        private static final /* synthetic */ EmitChangeSignal[] $VALUES;

        public static EmitChangeSignal[] values() {
            return (EmitChangeSignal[])$VALUES.clone();
        }

        private static /* synthetic */ EmitChangeSignal[] $values() {
            EmitChangeSignal[] emitChangeSignalArray = new EmitChangeSignal[4];
            emitChangeSignalArray[0] = TRUE;
            emitChangeSignalArray[1] = INVALIDATES;
            emitChangeSignalArray[2] = CONST;
            emitChangeSignalArray[3] = FALSE;
            return emitChangeSignalArray;
        }

        static {
            TRUE = new EmitChangeSignal();
            INVALIDATES = new EmitChangeSignal();
            CONST = new EmitChangeSignal();
            FALSE = new EmitChangeSignal();
            $VALUES = EmitChangeSignal.$values();
        }

        public String toString() {
            return this.name().toLowerCase();
        }

        public static EmitChangeSignal valueOf(String name) {
            return Enum.valueOf(EmitChangeSignal.class, name);
        }
    }
}

