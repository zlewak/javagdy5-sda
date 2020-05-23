package pl.behavioral.mediator;

public class User {
    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    private String name;

    private ChatRoom chatRoom;

    public String getName() {
        return name;
    }
}
