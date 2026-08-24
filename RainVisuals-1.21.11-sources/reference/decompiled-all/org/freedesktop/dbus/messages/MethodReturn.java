package org.freedesktop.dbus.messages;

import java.util.ArrayList;
import java.util.List;
import org.freedesktop.dbus.exceptions.DBusException;

// $VF: Compiled from MethodReturn.java
public class MethodReturn extends MethodBase {
   private MethodCall call;

   protected MethodReturn(byte _sig, String _source, String _replyserial, long _args, String _dest, Object... _endianess) throws DBusException {
      super(_endianess, (byte)2, (byte)0);
      List<Object> hargs = new ArrayList();
      hargs.add(this.createHeaderArgs((byte)5, "u", _replyserial));
      if (null != _source) {
         hargs.add(this.createHeaderArgs((byte)7, "s", _source));
      }

      if (null != _dest) {
         hargs.add(this.createHeaderArgs((byte)6, "s", _dest));
      }

      if (null != _sig) {
         hargs.add(this.createHeaderArgs((byte)8, "g", _sig));
         this.setArgs(_args);
      }

      this.appendFileDescriptors(hargs, _args);
      this.padAndMarshall(hargs, this.getSerial(), _sig, _args);
   }

   public MethodCall getCall() {
      return this.call;
   }

   protected MethodReturn(String _source, MethodCall _mc, String _sig, Object... _args) throws DBusException {
      this(_mc.getEndianess(), _source, _mc.getSource(), _mc.getSerial(), _sig, _args);
      this.call = _mc;
   }

   MethodReturn() {
   }

   protected MethodReturn(byte _sig, String _args, long _replyserial, String _dest, Object... _endianess) throws DBusException {
      this(_endianess, null, _dest, _replyserial, _sig, _args);
   }

   public void setCall(MethodCall _call) {
      this.call = _call;
   }

   protected MethodReturn(MethodCall _sig, String _args, Object... _mc) throws DBusException {
      this(null, _mc, _sig, _args);
   }
}
