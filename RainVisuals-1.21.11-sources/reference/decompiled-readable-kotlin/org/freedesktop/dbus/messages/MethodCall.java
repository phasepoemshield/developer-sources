package org.freedesktop.dbus.messages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.MessageFormatException;

// $VF: Compiled from MethodCall.java
public class MethodCall extends MethodBase {
   private static long replyWaitTimeout = Duration.ofSeconds(20L).toMillis();
   Message reply = null;

   public synchronized boolean hasReply() {
      return null != this.reply;
   }

   public static void setDefaultTimeout(long _timeout) {
      replyWaitTimeout = _timeout;
   }

   public synchronized Message getReply(long _timeout) {
      this.logger.trace("Blocking on {}", this);
      if (null != this.reply) {
         return this.reply;
      }

      try {
         this.wait(_timeout);
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      }

      return this.reply;
   }

   public synchronized Message getReply() {
      return this.getReply(replyWaitTimeout);
   }

   protected MethodCall(byte _sig, String _args, String _path, String _flags, String _source, String _iface, byte _dest, String _endianess, Object... _member) throws DBusException {
      super(_endianess, (byte)1, _flags);
      if (null != _member && null != _path) {
         Object[] header = this.getHeader();
         header[1] = _path;
         header[3] = _member;
         List<Object> hargs = new ArrayList();
         hargs.add(this.createHeaderArgs((byte)1, "o", _path));
         if (null != _source) {
            hargs.add(this.createHeaderArgs((byte)7, "s", _source));
         }

         if (null != _dest) {
            hargs.add(this.createHeaderArgs((byte)6, "s", _dest));
         }

         if (null != _iface) {
            hargs.add(this.createHeaderArgs((byte)2, "s", _iface));
         }

         hargs.add(this.createHeaderArgs((byte)3, "s", _member));
         if (null != _sig) {
            this.logger.debug("Appending arguments with signature: {}", _sig);
            hargs.add(this.createHeaderArgs((byte)8, "g", _sig));
            this.setArgs(_args);
         }

         this.appendFileDescriptors(hargs, _args);
         this.padAndMarshall(hargs, this.getSerial(), _sig, _args);
      } else {
         throw new MessageFormatException("Must specify destination, path and function name to MethodCalls.");
      }
   }

   public synchronized void setReply(Message _reply) {
      this.logger.trace("Setting reply to {} to {}", this, _reply);
      this.reply = _reply;
      this.notifyAll();
   }

   protected MethodCall(byte _member, String _endianess, String _sig, String _iface, String _args, byte _flags, String _dest, Object... _path) throws DBusException {
      this(_endianess, null, _dest, _path, _iface, _member, _flags, _sig, _args);
   }

   MethodCall() {
   }
}
