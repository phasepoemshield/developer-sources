/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.messages.Error;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.messages.MethodCall;
import org.freedesktop.dbus.messages.MethodReturn;
import org.freedesktop.dbus.utils.DBusNamingUtil;
import org.freedesktop.dbus.utils.Util;

public class DBusMatchRule {
    private final String object;
    private final String iface;
    private final String member;
    private final String type;
    private static final List<Function<DBusMatchRule, String>> MATCHRULE_EQUALS_OPERATIONS;
    private static final String MSG_TYPE_ERROR = "error";
    private static final String MSG_TYPE_METHOD_CALL = "method_call";
    private static final String MSG_TYPE_METHOD_REPLY = "method_reply";
    private static final Map<String, Class<? extends DBusSignal>> SIGNALTYPEMAP;
    private static final List<Function<DBusSignal, String>> SIGNAL_EQUALS_OPERATIONS;
    private final String source;
    private static final String MSG_TYPE_SIGNAL = "signal";

    static {
        SIGNALTYPEMAP = new ConcurrentHashMap<String, Class<? extends DBusSignal>>();
        MATCHRULE_EQUALS_OPERATIONS = List.of(DBusMatchRule::getInterface, DBusMatchRule::getMember, DBusMatchRule::getObject, DBusMatchRule::getSource);
        SIGNAL_EQUALS_OPERATIONS = List.of(Message::getInterface, Message::getName, Message::getPath, Message::getSource);
    }

    /*
     * WARNING - void declaration
     */
    public boolean matches(DBusSignal _signal, boolean _strict) {
        if (_signal == null) {
            return false;
        }
        if (_strict) {
            return Util.strEquals(_signal.getInterface(), this.getInterface()) && Util.strEquals(_signal.getName(), this.getMember()) && Util.strEquals(_signal.getPath(), this.getObject()) && Util.strEquals(_signal.getSource(), this.getSource());
        }
        String[] stringArray = new String[4];
        stringArray[0] = this.getInterface();
        stringArray[1] = this.getMember();
        stringArray[2] = this.getObject();
        stringArray[3] = this.getSource();
        String[] compareVals = stringArray;
        int i = 0;
        while (i < compareVals.length) {
            void var4_4;
            if (compareVals[i] != null) {
                Function<DBusSignal, String> function = SIGNAL_EQUALS_OPERATIONS.get(i);
                if (!Util.strEquals(compareVals[i], function.apply(_signal))) {
                    return false;
                }
            }
            ++var4_4;
        }
        return true;
    }

    public String getMember() {
        return this.member;
    }

    public String getInterface() {
        return this.iface;
    }

    public DBusMatchRule(Class<? extends Object> _c, String _source, String _object) throws DBusException {
        this(_c, _source, _object, null, null);
    }

    public DBusMatchRule(Class<? extends Object> _c) throws DBusException {
        this(_c, null, null);
    }

    public int hashCode() {
        Object[] objectArray = new Object[5];
        objectArray[0] = this.iface;
        objectArray[1] = this.member;
        objectArray[2] = this.object;
        objectArray[3] = this.source;
        objectArray[4] = this.type;
        return Objects.hash(objectArray);
    }

    public String toString() {
        String string;
        String s = null;
        if (null != this.type) {
            s = "type='" + this.type + "'";
        }
        if (null != this.member) {
            s = null == s ? "member='" + this.member + "'" : s + ",member='" + this.member + "'";
        }
        if (null != this.iface) {
            s = null == s ? "interface='" + this.iface + "'" : s + ",interface='" + this.iface + "'";
        }
        if (null != this.source) {
            s = null == s ? "sender='" + this.source + "'" : s + ",sender='" + this.source + "'";
        }
        if (null != this.object) {
            string = null == s ? "path='" + this.object + "'" : s + ",path='" + this.object + "'";
        }
        return string;
    }

    public DBusMatchRule(String _type, String _iface, String _member, String _object) {
        this.type = _type;
        this.iface = _iface;
        this.member = _member;
        this.object = _object;
        this.source = null;
    }

    void assertDBusInterface(String _str) throws DBusException {
        if (_str == null || _str.isEmpty() || _str.startsWith(".") || !_str.contains(".")) {
            throw new DBusException("DBusInterfaces must be defined in a package.");
        }
    }

    public String getSource() {
        return this.source;
    }

    /*
     * WARNING - void declaration
     */
    DBusMatchRule(Class<? extends Object> _c, String _source, String _object, String _type, String _member) throws DBusException {
        void var3_3;
        if (DBusInterface.class.isAssignableFrom(_c)) {
            this.iface = DBusNamingUtil.getInterfaceName(_c);
            this.assertDBusInterface(this.iface);
            this.member = _member != null ? _member : null;
            this.type = _type != null ? _type : null;
        } else if (DBusSignal.class.isAssignableFrom(_c)) {
            if (null == _c.getEnclosingClass()) {
                throw new DBusException("Signals must be declared as a member of a class implementing DBusInterface which is the member of a package.");
            }
            this.iface = DBusNamingUtil.getInterfaceName(_c.getEnclosingClass());
            this.assertDBusInterface(this.iface);
            this.member = _member != null ? _member : DBusNamingUtil.getSignalName(_c);
            SIGNALTYPEMAP.put(this.iface + "$" + this.member, _c);
            this.type = _type != null ? _type : MSG_TYPE_SIGNAL;
        } else if (Error.class.isAssignableFrom(_c) || DBusExecutionException.class.isAssignableFrom(_c)) {
            this.iface = DBusNamingUtil.getInterfaceName(_c);
            this.assertDBusInterface(this.iface);
            this.member = _member != null ? _member : null;
            this.type = _type != null ? _type : MSG_TYPE_ERROR;
        } else {
            throw new DBusException("Invalid type for match rule: " + String.valueOf(_c));
        }
        this.source = _source;
        this.object = var3_3;
    }

    public static Class<? extends DBusSignal> getCachedSignalType(String _type) {
        return SIGNALTYPEMAP.get(_type);
    }

    public String getObject() {
        return this.object;
    }

    public String getType() {
        return this.type;
    }

    public DBusMatchRule(String _type, String _iface, String _member) {
        this(_type, _iface, _member, null);
    }

    public DBusMatchRule(Message _m) {
        this.iface = _m.getInterface();
        this.source = null;
        this.object = null;
        String string = _m instanceof Error ? null : (this.member = _m.getName());
        this.type = _m instanceof DBusSignal ? MSG_TYPE_SIGNAL : (_m instanceof Error ? MSG_TYPE_ERROR : (_m instanceof MethodCall ? MSG_TYPE_METHOD_CALL : (_m instanceof MethodReturn ? MSG_TYPE_METHOD_REPLY : null)));
    }

    public DBusMatchRule(Class<? extends DBusInterface> _c, String _method) throws DBusException {
        this(_c, null, null, MSG_TYPE_METHOD_CALL, _method);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object _obj) {
        if (this == _obj) {
            return true;
        }
        if (!(_obj instanceof DBusMatchRule)) {
            return false;
        }
        DBusMatchRule other = (DBusMatchRule)_obj;
        if (!Objects.equals(this.iface, other.iface)) return false;
        if (!Objects.equals(this.member, other.member)) return false;
        if (!Objects.equals(this.object, other.object)) return false;
        if (!Objects.equals(this.source, other.source)) return false;
        if (!Objects.equals(this.type, other.type)) return false;
        return true;
    }

    public DBusMatchRule(DBusExecutionException _e) throws DBusException {
        this(_e.getClass());
    }

    /*
     * WARNING - void declaration
     */
    public boolean matches(DBusMatchRule _rule, boolean _strict) {
        if (_rule == null) {
            return false;
        }
        if (_strict) {
            return Util.strEquals(_rule.getInterface(), this.getInterface()) && Util.strEquals(_rule.getMember(), this.getMember()) && Util.strEquals(_rule.getObject(), this.getObject()) && Util.strEquals(_rule.getSource(), this.getSource());
        }
        String[] stringArray = new String[4];
        stringArray[0] = this.getInterface();
        stringArray[1] = this.getMember();
        stringArray[2] = this.getObject();
        stringArray[3] = this.getSource();
        String[] compareVals = stringArray;
        int i = 0;
        while (i < compareVals.length) {
            void var4_4;
            if (compareVals[i] != null) {
                Function<DBusMatchRule, String> function = MATCHRULE_EQUALS_OPERATIONS.get(i);
                if (!Util.strEquals(compareVals[i], function.apply(_rule))) {
                    return false;
                }
            }
            ++var4_4;
        }
        return true;
    }
}

