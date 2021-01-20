package MyList;


import com.MyCompany.homeWork1.Circle;
import java.util.*;


public class Main {
   public static void main(String[] args)  {

       //Test my List
       myTest();


        //Test List
       System.out.println("Test List------------------------------------------------------------------------------>");
        perfomanceTestList(new ArrayList<>(),new LinkedList<>(),10000,"Hello");
        //Test Set
       System.out.println("Test SET------------------------------------------------------------------------------>");
        perfomanceTestSet(new HashSet<String>(),new LinkedHashSet<String>(),10000,"Hello");
        perfomanceTestSet(new TreeSet(),new LinkedHashSet<String>(),10000,"Hello");
        perfomanceTestSet(new TreeSet(),new HashSet<String>(),10000,"Hello");
        //Test Map
       System.out.println("Test Map------------------------------------------------------------------------------->");
        perfomanceTestMap(new HashMap(),new LinkedHashMap(),10000,"Hello");
        perfomanceTestMap(new HashMap(),new TreeMap(),10000,"Hello");
        perfomanceTestMap(new TreeMap(),new LinkedHashMap(),10000,"Hello");

   }

   public static void myTest(){
       Long time1,time2;

       MyLinkedList<Circle> in=new MyLinkedList<>();
       time1=System.nanoTime();
       for(int i=0; i<10000;i++){
           in.add(new Circle(i));
       }
       time2=System.nanoTime();
       System.out.println("MyLinkedList time:-->"+(time2-time1));

       LinkedList list=new LinkedList();
       time1=System.nanoTime();
       for(int i=0; i<10000;i++){
           list.add(i);
       }
       time2=System.nanoTime();
       System.out.println("LinkedList time:-->"+(time2-time1));
   }

   public static void perfomanceTestList(List coll1, List coll2,int size, Object object){

       Long time1,time2,time3,time4;
       time1=System.nanoTime();
       for(int i=0; i<size;i++){
           coll1.add(object);
       }
       time2=System.nanoTime();

       time3=System.nanoTime();
       for(int i=0; i<size;i++){
           coll2.add(object);
       }
       time4=System.nanoTime();

       System.out.println("Operation Add");
       System.out.println(coll1.getClass()+"---> time= "+(time2-time1)+" size="+coll1.size());
       System.out.println(coll2.getClass()+"---> time= "+(time4-time3)+" size="+coll2.size());
    //..............................................................................................
       System.out.println("Operation GET");
       Random random=new Random();
       int get=random.nextInt(size);

       time1=System.nanoTime();
       coll1.get(get);
       time2=System.nanoTime();
       System.out.println(coll1.getClass()+"---> Search index of "+get+": time="+(time2-time1));

       time3=System.nanoTime();
       coll1.get(get);
       time4=System.nanoTime();
       System.out.println(coll2.getClass()+"---> Search index of "+get+": time="+(time4-time3));
    //..............................................................................................
       System.out.println("Operation remove");

       Object ob=coll1.get(get);
       time1=System.nanoTime();
       coll1.remove(ob);
       time2=System.nanoTime();
       System.out.println(coll1.getClass()+"---> Remove object of "+ob+": time="+(time2-time1));

       time1=System.nanoTime();
       coll2.remove(ob);
       time2=System.nanoTime();
       System.out.println(coll2.getClass()+"---> Remove object of "+ob+": time="+(time2-time1));
   //..............................................................................................
       System.out.println("Operation set");
       time1=System.nanoTime();
       coll1.set(get,object);
       time2=System.nanoTime();
       System.out.println(coll1.getClass()+"---> Set object of "+object+": time="+(time2-time1));

       time1=System.nanoTime();
       coll2.set(get,object);
       time2=System.nanoTime();
       System.out.println(coll2.getClass()+"---> Set object of "+object+": time="+(time2-time1));


   }

   public static void perfomanceTestSet(Set coll1, Set coll2,int size, Object object){
       System.out.println("Operation add");
       Long time1,time2,time3,time4;
       time1=System.nanoTime();
       for(int i=0; i<size;i++){
           coll1.add(object+":"+i);
       }
       time2=System.nanoTime();

       time3=System.nanoTime();
       for(int i=0; i<size;i++){
           coll2.add(object+":"+i);
       }
       time4=System.nanoTime();
       System.out.println(coll1.getClass()+"--->time= "+(time2-time1)+" size="+coll1.size());
       System.out.println(coll2.getClass()+"--->time= "+(time4-time3)+" size="+coll2.size());
    //..............................................................................................
       System.out.println("Operation remove");
       Random random=new Random();
       int get=random.nextInt(size);
       time1=System.nanoTime();
       coll1.remove(object+""+get);
       time2=System.nanoTime();
       System.out.println(coll1.getClass()+"--->Remove object of "+object+""+get+": time="+(time2-time1));

       time3=System.nanoTime();
       coll2.remove(object+""+get);
       time4=System.nanoTime();
       System.out.println(coll2.getClass()+"---> Remove object of "+object+""+get+": time="+(time4-time3));

   }

   public static void perfomanceTestMap(Map map1,Map map2,int size,Object object){
       System.out.println("Operation put");
       Long time1,time2;
       time1=System.nanoTime();
       for(int i=0; i<size;i++){
           map1.put(i,object);
       }
       time2=System.nanoTime();
       System.out.println(map1.getClass()+"---> time= "+(time2-time1)+" size="+map1.size());

       time1=System.nanoTime();
       for(int i=0; i<size;i++){
           map2.put(i,object);
       }
       time2=System.nanoTime();
       System.out.println(map2.getClass()+"---> time= "+(time2-time1)+" size="+map2.size());

       System.out.println("Operation get");
       Random random=new Random();
       int get=random.nextInt(size);

       time1=System.nanoTime();
       for(int i=0; i<size;i++){
           map1.get(get);
       }
       time2=System.nanoTime();
       System.out.println(map1.getClass()+"---> Search key of "+get+": time="+(time2-time1));

       time1=System.nanoTime();
       for(int i=0; i<size;i++){
           map2.get(get);
       }
       time2=System.nanoTime();
       System.out.println(map2.getClass()+"---> Search key of "+get+": time="+(time2-time1));

       System.out.println("Operation remove");
       Object ob=map1.get(get);

       time1=System.nanoTime();
       map1.remove(get);
       time2=System.nanoTime();
       System.out.println(map1.getClass()+"---> Remove object of "+ob+": time="+(time2-time1));

       time1=System.nanoTime();
       map2.remove(get);
       time2=System.nanoTime();
       System.out.println(map2.getClass()+"---> Remove object of "+ob+": time="+(time2-time1));


   }

}
