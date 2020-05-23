package pl.behavioral.mediator;

import java.time.LocalDateTime;

public class DateChatRoom extends ChatRoom {
    @Override
    public void showMessage(User user, String message) {
        System.out.println(LocalDateTime.now());
        super.showMessage(user, message);
    }
}
