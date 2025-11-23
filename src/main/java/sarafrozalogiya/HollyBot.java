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

            if (text.equals("\uD83E\uDD58 Milliy taom")){
                try {
                    execute(hollyBotService.milliytaommenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF54 Fast-food")){
                try {
                    execute(hollyBotService.fastfoodmenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF70 Desert")){
                try {
                    execute(hollyBotService.desetmenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F Qaytish")){
                try {
                    execute(hollyBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83E\uDD58 Национальные блюда")){
                try {
                    execute(hollyBotService.rusmilytaommenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF54 Фаст-фуд")){
                try {
                    execute(hollyBotService.rusfastfood(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF70 Десерт")){
                try {
                    execute(hollyBotService.rusdesert(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F Назад")){
                try {
                    execute(hollyBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if (text.equals("\uD83E\uDD58 National dish")){
                try {
                    execute(hollyBotService.inglsmilytaommenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF54 Fast-food")){
                try {
                    execute(hollyBotService.inglizfastfood(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF70 Dessert")){
                try {
                    execute(hollyBotService.inglsdesert(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅\uFE0F Go back")){
                try {
                    execute(hollyBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("\uD83E\uDD58 传统菜肴")){
                try {
                    execute(hollyBotService.xitoymilliytaom(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF54 快餐")){
                try {
                    execute(hollyBotService.xitoyfastfood(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF70 甜点")){
                try {
                    execute(hollyBotService.xitoydesert(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⬅️ 返回")){
                try {
                    execute(hollyBotService.language(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }


            if (text.equals("\uD83C\uDF5B Palov va Guruchli taomlar")) {
                try {
                    execute(hollyBotService.Palovvaguruchlitaom(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF5E Non va Xamirli taomlar")){
                try {
                    execute(hollyBotService.nonvaxamr(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83E\uDD69 Go'shtli taomlar")){
                try {
                    execute(hollyBotService.goshtlitaom(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else if (update.hasCallbackQuery()) {
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

//            palov va guruchli taomlar
            if (data.equals("palovId")){
                try {
                    execute(hollyBotService.palov(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("lagmonId")){
                try {
                    execute(hollyBotService.lagmon(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("shorvaId")){
                try {
                    execute(hollyBotService.shorva(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

//            non va xamirli taomlar
            if (data.equals("mantiId")){
                try {
                    execute(hollyBotService.manti(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("chuchvaraId")){
                try {
                    execute(hollyBotService.chuchvara(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("lepeshkaId")){
                try {
                    execute(hollyBotService.lepeshka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("norinId")){
                try {
                    execute(hollyBotService.norin(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("somsaId")){
                try {
                    execute(hollyBotService.somsa(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



//            tillar data ichida deleta ham bor
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
            if (data.equals("xitoyId")){
                try {
                    execute(hollyBotService.xitoymenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);

                    execute(deleteMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytId")){
                try {
                    execute(hollyBotService.milliytaommenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
                    execute(deleteMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qayturId")){
                try {
                    execute(hollyBotService.milliytaommenu(chatId));
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
