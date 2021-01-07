/**
 * The CellPhone Class holds data about a Cell Phone.
 */

 public class CellPhone
 {
     //Fields
     private String manufact;       //Manufacturer
     private String model;          //Model
     private double retailPrice;    //Retail Price

   	/**
      * Construcor
      * @param man The phone's manufacturer.
      * @param mod The phone's model number.
      * @param price The phone's retail price.
      */

      public CellPone(String man, String mod, double price)
      {
          manufact = man;
          model = mod;
          retailPrice = price;
      }

      /**
       * The setManufact method sets the phone's
       * manufacturer name.
       * @param man The phone's manufacturer.
       */

       public void setManufact(String man)
       {
           manufact = man;
       }

       /**
       * The setModel method sets the phone's
       * model name.
       * @param mod The phone's model number.
       */

       public void setMod(String mod)
       {
           model = mod;
       }

       /**
       * The setRetailPrice method sets the phone's
       * Retail Price.
       * @param price The phone's Retail Price.
       */

       public void setRetailPrice(double price)
       {
           retailPrice = price;
       }

       /**
        * getManufacturer method
        * @return The name of the phone's manufacturer.
        */

        public String getManufact()
        {
            return manufact;
        }

        /**
         * getModel method
         * @return The model number of the phone.
         */
     
         public String getModel()
         {
             return model;
         }

         /**
          * getretailPrice method
          * @return the phone's retail price.
          */

          public double getRetailPrice()
          {
              return retailPrice;
          }

        }
    
 