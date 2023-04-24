/* /* /* /*  abstract class Mubiru{
    public void show(){
      System.out.println("showing");
    }
    public abstract void display();
    public abstract void get();
    public abstract void find();
}
abstract class Alvin extends Mubiru{
    public void display(){
        System.out.println("displaying");
    }
}
 class David extends Alvin{
    public void get(){
        System.out.println("getting");
    }
    public void find(){
        System.out.println("finding.......");
    }

 }
public class Samuelphone{
    public static void main(String[] args){
        Mubiru obj = new David();
        obj.show();
        obj.find();
        obj.display();
        obj.find();



    }

}
      


    
    

 */


 public class Samuelphone{
    public static void get(Mashera obj){
        obj.get(
        obj.show();
        obj. find();
        obj.leave();
    }
    public static void get(Rashera obj2){
        obj2.display();
    }


    public static void main(String[] args){
      sam obj1=new sam();
       Pius obj3=new Pius();
      get(obj1);
      get(obj3);

    }
 }


 /* abstract class Mashera{
    public abstract void get();
    public abstract  void show();
     public abstract  void find();
     public abstract  void leave();

 }
 abstract class Rashera {
    public abstract void display();

 }

    class sam extends Mashera{
    public void show(){
        System.out.println("showing");
    }
   
 
public void leave(){
    System.out.println(" leaving");
}
 public void find(){
        System.out.println("finding....");
       
    }
    public void get(){
        System.out.println("getting......");
    }
}
class Pius extends Rashera{
    public void display(){
        System.out.println(" displaying");
    }
}
 */

 /* public class Samuelphone{
    public static void get(phone obj2){
        obj2.getConfig();

    }
    public static void main(String[] args){
        Iphone obj =new Iphone();
        Sumsung obj1 = new Sumsung();
        get(obj1);
        get(obj);


    }
   
}
 abstract class phone{
    public abstract void getConfig();
 }
 class Iphone extends phone{
    public void getConfig(){
        System.out.println("2gb , Ios ");
    }
 }
 class Sumsung extends phone{
    public void getConfig(){
        System.out.println("2gb ,lipop");
    }
 }
 
  */ 