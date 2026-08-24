package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from FreeBSDPasswd.java
public class FreeBSDPasswd extends NativePasswd implements Passwd {
   private static final FreeBSDPasswd.Layout layout = new FreeBSDPasswd.Layout(Runtime.getSystemRuntime());

   @Override
   public String getShell() {
      return layout.pw_shell.get(this.memory);
   }

   @Override
   public String getGECOS() {
      return layout.pw_gecos.get(this.memory);
   }

   @Override
   public long getUID() {
      return layout.pw_uid.get(this.memory);
   }

   FreeBSDPasswd(Pointer memory) {
      super(memory);
   }

   @Override
   public String getPassword() {
      return layout.pw_passwd.get(this.memory);
   }

   @Override
   public String getAccessClass() {
      return layout.pw_class.get(this.memory);
   }

   @Override
   public int getExpire() {
      return layout.pw_expire.intValue(this.memory);
   }

   @Override
   public String getLoginName() {
      return layout.pw_name.get(this.memory);
   }

   @Override
   public int getPasswdChangeTime() {
      return layout.pw_change.intValue(this.memory);
   }

   @Override
   public long getGID() {
      return layout.pw_gid.get(this.memory);
   }

   @Override
   public String getHome() {
      return layout.pw_dir.get(this.memory);
   }

   // $VF: Compiled from FreeBSDPasswd.java
   private static final class Layout extends StructLayout {
      public final StructLayout.SignedLong pw_change;
      public final StructLayout.Signed32 pw_fields;
      public final StructLayout.UTF8StringRef pw_shell;
      public final StructLayout.Signed32 pw_uid;
      public final StructLayout.UTF8StringRef pw_dir;
      public final StructLayout.SignedLong pw_expire;
      public final StructLayout.UTF8StringRef pw_passwd;
      public final StructLayout.UTF8StringRef pw_name = new StructLayout.UTF8StringRef();
      public final StructLayout.UTF8StringRef pw_gecos;
      public final StructLayout.Signed32 pw_gid;
      public final StructLayout.UTF8StringRef pw_class;

      private Layout(Runtime runtime) {
         super(runtime);
         this.pw_passwd = new StructLayout.UTF8StringRef();
         this.pw_uid = new StructLayout.Signed32();
         this.pw_gid = new StructLayout.Signed32();
         this.pw_change = new StructLayout.SignedLong();
         this.pw_class = new StructLayout.UTF8StringRef();
         this.pw_gecos = new StructLayout.UTF8StringRef();
         this.pw_dir = new StructLayout.UTF8StringRef();
         this.pw_shell = new StructLayout.UTF8StringRef();
         this.pw_expire = new StructLayout.SignedLong();
         this.pw_fields = new StructLayout.Signed32();
      }
   }
}
