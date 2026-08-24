package org.freedesktop.dbus;

import java.lang.reflect.Method;
import org.freedesktop.dbus.connections.AbstractConnection;
import org.freedesktop.dbus.errors.NoReply;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.messages.Error;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.messages.MethodCall;
import org.freedesktop.dbus.messages.MethodReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from DBusAsyncReply.java
public class DBusAsyncReply<T> {
   private final Method me;
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private DBusExecutionException error;
   private final AbstractConnection conn;
   private T rval = (T)null;
   private final MethodCall mc;

   public T getReply() throws DBusException {
      if (null != this.rval) {
         return this.rval;
      } else if (null != this.error) {
         throw this.error;
      } else {
         this.checkReply();
         if (null != this.rval) {
            return this.rval;
         } else if (null != this.error) {
            throw this.error;
         } else {
            throw new NoReply("Async call has not had a reply");
         }
      }
   }

   public Method getMethod() {
      return this.me;
   }

   private synchronized void checkReply() {
      if (this.mc.hasReply()) {
         Message m = this.mc.getReply();
         if (m instanceof Error err) {
            this.error = err.getException();
         } else if (m instanceof MethodReturn) {
            try {
               Object _ex = RemoteInvocationHandler.convertRV(m.getParameters(), this.me, this.conn);
               this.rval = (T)_ex;
            } catch (DBusExecutionException var4) {
               this.error = var4;
            } catch (DBusException var5) {
               this.logger.debug("", var5);
               this.error = new DBusExecutionException(var5.getMessage());
            }
         }
      }
   }

   public MethodCall getCall() {
      return this.mc;
   }

   public boolean hasReply() {
      if (null == this.rval && null == this.error) {
         this.checkReply();
         return null != this.rval || null != this.error;
      } else {
         return true;
      }
   }

   @Override
   public String toString() {
      return "Waiting for: " + this.mc;
   }

   public AbstractConnection getConnection() {
      return this.conn;
   }

   public DBusAsyncReply(MethodCall _mc, Method _me, AbstractConnection _conn) {
      this.error = null;
      this.mc = _mc;
      this.me = _me;
      this.conn = _conn;
   }
}
