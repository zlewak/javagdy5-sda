package pl.behavioral.mediator;

public class CensoredChat extends DateChatRoom {
    @Override
    public void showMessage(User user, String message) {
        if (canShow(message)) {
            super.showMessage(user, message);
        }
    }

    private boolean canShow(String message) {
        return !message.contains("pizza");
    }
}
