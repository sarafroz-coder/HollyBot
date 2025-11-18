package sarafrozalogiya;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class HollyBot extends TelegramLongPollingBot {
    HollyBotService hollyBotService = new HollyBotService();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()&& update.getMessage().hasText()){
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();

            if (text.equals("/start")){
                try {
                    execute(hollyBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        } else if (update.hasCallbackQuery()) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            String data = callbackQuery.getData();
            Long chatId = callbackQuery.getMessage().getChatId();

            Integer messageId = callbackQuery.getMessage().getMessageId();

            System.out.println(data);
//            if (data.equals("ozId")) {
//                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
//                editMessageReplyMarkup.setChatId(chatId);
//                editMessageReplyMarkup.setMessageId(messageId);
//
////
//                editMessageReplyMarkup.setReplyMarkup(hollyBotService.ozbektilimenu(chatId));
//                try {
//                    execute(editMessageReplyMarkup);
//                } catch (TelegramApiException e) {
//                    throw new RuntimeException(e);
//                }
            if (data.equals("ozId")){
                try {
                    execute(hollyBotService.ozbektilimenu(chatId));

                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);

                    execute(deleteMessage);

                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("rusId")){
                try {
                    execute(hollyBotService.rustilimenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
                    execute(deleteMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("ingId")){
                try {
                    execute(hollyBotService.ingliztilimenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);

                    execute(deleteMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "hollymsbot";
    }

    @Override
    public String getBotToken() {
        return "8508842153:AAHZgUCSBg6IBxnWVe4sa2whfx5yrwBatuM";
    }
}
