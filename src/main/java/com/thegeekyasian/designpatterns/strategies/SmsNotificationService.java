package com.thegeekyasian.designpatterns.strategies;

import org.springframework.stereotype.Service;

/**
 * @author thegeekyasian
 */
@Service(NotificationType.SMS)
public class SmsNotificationService implements NotificationService {

  @Override
  public void sendNotification() {
    System.out.println("Sending SMS");
  }
}
