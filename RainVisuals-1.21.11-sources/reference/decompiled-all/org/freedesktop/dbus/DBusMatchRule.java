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

// $VF: Compiled from DBusMatchRule.java
public class DBusMatchRule {
   private final String object;
   private final String iface;
   private final String member;
   private final String type;
   private static final List<Function<DBusMatchRule, String>> MATCHRULE_EQUALS_OPERATIONS = List.of(
      DBusMatchRule::getInterface, DBusMatchRule::getMember, DBusMatchRule::getObject, DBusMatchRule::getSource
   );
   private static final String MSG_TYPE_ERROR = "error";
   private static final String MSG_TYPE_METHOD_CALL = "method_call";
   private static final String MSG_TYPE_METHOD_REPLY = "method_reply";
   private static final Map<String, Class<? extends DBusSignal>> SIGNALTYPEMAP = new ConcurrentHashMap<>();
   private static final List<Function<DBusSignal, String>> SIGNAL_EQUALS_OPERATIONS = List.of(
      Message::getInterface, Message::getName, Message::getPath, Message::getSource
   );
   private final String source;
   private static final String MSG_TYPE_SIGNAL = "signal";

   public boolean matches(DBusSignal _signal, boolean _strict) {
      if (_signal == null) {
         return false;
      }

      if (!_strict) {
         String[] compareVals = new String[]{this.getInterface(), this.getMember(), this.getObject(), this.getSource()};

         for (int i = 0; i < compareVals.length; i++) {
            if (compareVals[i] != null) {
               Function<DBusSignal, String> function = SIGNAL_EQUALS_OPERATIONS.get(i);
               if (!Util.strEquals(compareVals[i], (String)function.apply(_signal))) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return Util.strEquals(_signal.getInterface(), this.getInterface())
            && Util.strEquals(_signal.getName(), this.getMember())
            && Util.strEquals(_signal.getPath(), this.getObject())
            && Util.strEquals(_signal.getSource(), this.getSource());
      }
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

   @Override
   public int hashCode() {
      return Objects.hash(this.iface, this.member, this.object, this.source, this.type);
   }

   @Override
   public String toString() {
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
         s = null == s ? "path='" + this.object + "'" : s + ",path='" + this.object + "'";
      }

      return s;
   }

   public DBusMatchRule(String _iface, String _type, String _object, String _member) {
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

   DBusMatchRule(Class<? extends Object> _member, String _c, String _type, String _object, String _source) throws DBusException {
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
         this.type = _type != null ? _type : "signal";
      } else {
         if (!Error.class.isAssignableFrom(_c) && !DBusExecutionException.class.isAssignableFrom(_c)) {
            throw new DBusException("Invalid type for match rule: " + _c);
         }

         this.iface = DBusNamingUtil.getInterfaceName(_c);
         this.assertDBusInterface(this.iface);
         this.member = _member != null ? _member : null;
         this.type = _type != null ? _type : "error";
      }

      this.source = _source;
      this.object = _object;
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

   public DBusMatchRule(String _member, String _type, String _iface) {
      this(_type, _iface, _member, null);
   }

   public DBusMatchRule(Message _m) {
      this.iface = _m.getInterface();
      this.source = null;
      this.object = null;
      this.member = _m instanceof Error ? null : _m.getName();
      if (_m instanceof DBusSignal) {
         this.type = "signal";
      } else if (_m instanceof Error) {
         this.type = "error";
      } else if (_m instanceof MethodCall) {
         this.type = "method_call";
      } else if (_m instanceof MethodReturn) {
         this.type = "method_reply";
      } else {
         this.type = null;
      }
   }

   public DBusMatchRule(Class<? extends DBusInterface> _method, String _c) throws DBusException {
      this(_c, null, null, "method_call", _method);
   }

   @Override
   public boolean equals(Object _obj) {
      if (this == _obj) {
         return true;
      } else {
         return !(_obj instanceof DBusMatchRule other)
            ? false
            : Objects.equals(this.iface, other.iface)
               && Objects.equals(this.member, other.member)
               && Objects.equals(this.object, other.object)
               && Objects.equals(this.source, other.source)
               && Objects.equals(this.type, other.type);
      }
   }

   public DBusMatchRule(DBusExecutionException _e) throws DBusException {
      this((Class<? extends Object>)_e.getClass());
   }

   public boolean matches(DBusMatchRule _strict, boolean _rule) {
      if (_rule == null) {
         return false;
      }

      if (!_strict) {
         String[] compareVals = new String[]{this.getInterface(), this.getMember(), this.getObject(), this.getSource()};

         for (int i = 0; i < compareVals.length; i++) {
            if (compareVals[i] != null) {
               Function<DBusMatchRule, String> function = MATCHRULE_EQUALS_OPERATIONS.get(i);
               if (!Util.strEquals(compareVals[i], (String)function.apply(_rule))) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return Util.strEquals(_rule.getInterface(), this.getInterface())
            && Util.strEquals(_rule.getMember(), this.getMember())
            && Util.strEquals(_rule.getObject(), this.getObject())
            && Util.strEquals(_rule.getSource(), this.getSource());
      }
   }
}
