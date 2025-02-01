
package com.stockanalysis;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBot extends TelegramLongPollingBot {

    static {
        ApiContextInitializer.init();  // Initializes the API context for Telegram API
    }

    // Telegram Bot Token (Store this securely, e.g., using environment variables)
    private static final String BOT_TOKEN = System.getenv("TELEGRAM_BOT_TOKEN");
    private static final String CHAT_ID = System.getenv("CHAT_ID");

    @Override
    public void onUpdateReceived(Update update) {
        // Handle updates from Telegram (optional for bot interaction)
    }

    @Override
    public String getBotUsername() {
        return "YourBotUsername";  // Set your bot username
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    // Send stock analysis to Telegram
    public void sendStockAnalysis(String stockAnalysis) {
        SendMessage message = new SendMessage();
        message.setChatId(CHAT_ID);
        message.setText(stockAnalysis);
        try {
            execute(message); // Send message to Telegram
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    