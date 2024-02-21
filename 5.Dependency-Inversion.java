Dependency Inversion :
It states that high level modules should not depend on low-level modules but both should be depend on abstraction 

DIP promotes loose coupling between components, making software more flexible and maintainable

  By following Dependency Inversion, the Notification Service is no longer toghtly coupled to any of the specific sender implementations.

interface MessageSender{
  void send();
}

class EmailSender implements MessageSender{

@Override
  public void send(){
  }
}

class smsSender implements MessageSender{

  @Override
  public void send(){
  }
}


class pushNotificationSender implements MessageSender{

  @Override
  public void send(){
  }
}


public class NotificationService {

  MessageSender messageSender;

  public NotificationService(MessageSender messageSender){
    this.messageSender= messageSender;
  }

  public void send(){
    messageSender.send();
  }
}

