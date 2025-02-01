
package com.stockanalysis;

public class StockAnalysisBot {

    public static void main(String[] args) {
        // Perform stock analysis and send it to Telegram
        StockAnalyzer analyzer = new StockAnalyzer();
        String stockAnalysis = analyzer.getStockAnalysis();

        TelegramBot bot = new TelegramBot();
        bot.sendStockAnalysis(stockAnalysis);
    }
}
    