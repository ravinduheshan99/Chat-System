package chat.system;

public class ChatSystem {

    public static void main(String[] args) {

        Observerble observerble = Observerble.getinstace();

        Saman saman = new Saman();
        Sunil sunil = new Sunil();
        Kamal kamal = new Kamal();
        Nimal nimal = new Nimal();

        saman.setVisible(true);
        sunil.setVisible(true);
        kamal.setVisible(true);
        nimal.setVisible(true);

        observerble.addComp(saman);
        observerble.addComp(sunil);
        observerble.addComp(kamal);
        observerble.addComp(nimal);
    }
}
