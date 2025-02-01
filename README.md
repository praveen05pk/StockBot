
# Stock Analysis Telegram Bot

This is a simple Telegram bot built in Java that performs stock analysis and sends the results to a designated Telegram chat. The bot runs daily using Jenkins and is triggered by a GitHub repository.

## Features

- Fetches stock analysis.
- Sends stock analysis results to Telegram.
- Triggered daily via Jenkins.

## Setup Instructions

1. Clone the repository:
   ```
   git clone https://github.com/your-username/StockAnalysisBot.git
   ```

2. Set up your **Telegram Bot** and **Chat ID**:
   - Create a Telegram bot using [BotFather](https://core.telegram.org/bots#botfather).
   - Get your **Bot Token** and **Chat ID**.

3. **Configure Maven**:
   - Ensure you have Maven installed.
   - Run `mvn clean install` to build the project.

4. **Run the Bot**:
   - Run the main class: `StockAnalysisBot.java`.

5. **Jenkins Integration**:
   - Set up Jenkins to pull this repository and run the bot daily using the cron expression `15 3 * * *` (8:45 AM IST).

## Dependencies

- Java 11
- Maven
- Telegram Bot API
    