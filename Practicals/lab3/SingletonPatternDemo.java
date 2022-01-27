public class SingletonPatternDemo {
   public static void main(String[] args) {

      //Get the only object available
      LazySingleObject object = LazySingleObject.getInstance();
      SingleObject object1 = SingleObject.getInstance();

      //show the message
      object.showMessage();
      object1.showMessage();
   }
}