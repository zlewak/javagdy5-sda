package pl.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ChatRoom room = new CensoredChat();

        User jan = new User("Jan", room);
        User piotr = new User("Piotr", room);
        User nextUser = new User("nieznany", room);

        room.showMessage(jan, "Hejka wszystkim!");
        room.showMessage(piotr, "Witam serdecznie!");

        room.showMessage(jan, "Zjadlbym pizza");
        room.showMessage(piotr, "Zjadlbym hamburgera");

        room.showMessage(nextUser, "error");
    }
}
