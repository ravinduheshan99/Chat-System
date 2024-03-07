package chat.system;

public class Observerble {

    private Observer[] ob = new Observer[0];

    private static Observerble instace = null;

    private Observerble() {
    }
    
    private String massage;
    private String name;

    public void addComp(Observer comp) {
        System.out.println("add");
        extendArray();
        ob[ob.length - 1] = comp;
    }

    private void extendArray() {
        Observer[] temp = new Observer[ob.length + 1];
        for (int i = 0; i < ob.length; i++) {
            System.out.println(i);
            temp[i] = ob[i];
        }
        ob = temp;
    }

    public void getMassage(String massage, String name) {
        this.name = name;
        this.massage = massage;
        System.out.println("Controller :> " + name + " : " + massage);
        notifyMassage();
    }

    public void notifyMassage() {

        for (int i = 0; i < ob.length; i++) {
            System.out.println(i);
            ob[i].update(this.massage, this.name);
        }
    }

    public static Observerble getinstace() {
        if (instace == null) {
            instace = new Observerble();
        }
        return instace;
    }
}
