package oxxxde;

import lombok.Generated;

// $VF: Compiled from heavy
public class جأ extends RuntimeException {
   protected final String description;
   protected final String[] reasons;
   protected final String[] solutions;
   protected final String details;

   @Generated
   public String getDescription() {
      return this.description;
   }

   public جأ(String details, String reasons, String[] description, String[] solutions) {
      this.description = description;
      this.details = details;
      this.reasons = reasons;
      this.solutions = solutions;
   }

   @Generated
   public String getDetails() {
      return this.details;
   }

   @Generated
   public String[] getSolutions() {
      return this.solutions;
   }

   @Generated
   public String[] getReasons() {
      return this.reasons;
   }
}
