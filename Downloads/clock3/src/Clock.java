public class Clock {
    
    public static void main(String[] args) {
        Model m = new Model();
       View view1 = new View(m);
     //  View view2 = new View(m);
    m.addObserver(view1);
   //  m.addObserver(view2);
        Controller controller = new Controller(m, view1);
        
    }
}