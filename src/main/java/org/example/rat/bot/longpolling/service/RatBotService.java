package org.example.rat.bot.longpolling.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class RatBotService {

    public SendMessage proceedUpdate(Update update) {
        var textMessage = "asd";
        return SendMessage.builder()
                .chatId(update.getMessage().getChatId())
                .text(textMessage)
                .build();
    }
}
