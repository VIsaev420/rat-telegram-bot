package org.example.rat.bot.longpolling;

import org.example.rat.bot.longpolling.service.RatBotService;
import org.example.rat.bot.properties.RatConfigurationProperties;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class RatBot extends TelegramLongPollingBot {
    private final RatConfigurationProperties properties;
    private final RatBotService service;

    public RatBot(RatConfigurationProperties properties, RatBotService service) {
        super(properties.getBot().getToken());
        this.properties = properties;
        this.service = service;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            var message = service.proceedUpdate(update);
            try {
                this.execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return properties.getBot().getName();
    }
}
