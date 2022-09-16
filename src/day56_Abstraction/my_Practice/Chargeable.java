package day56_Abstraction.my_Practice;

public interface Chargeable {

   boolean isChargeable = true; // by default, this attribute is public static and final.
                                // public static and final keyword is automaticlly given
    //public static final boolean isChargeable = true;   ==> like this

    void charge();    // by default, this method is public and abstract. we can add public abstract keywords
                      // to the method, if not it's implicitly given to the method.
  // public abstract void charge();  // like this

}
