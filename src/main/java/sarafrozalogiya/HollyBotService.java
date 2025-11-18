package sarafrozalogiya;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class HollyBotService {
    public SendMessage language(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Holly bot ga xush kelibsiz \nTilni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>rowList =  new ArrayList<>();

        List<InlineKeyboardButton>row =  new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDFA\uD83C\uDDFF O'zbek tili");
        button.setCallbackData("ozId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDF7\uD83C\uDDFA Русский язык");
        button.setCallbackData("rusId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDEC\uD83C\uDDE7 English");
        button.setCallbackData("ingId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage ozbektilimenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Holly mazali taomlar menusiga xush kelibsiz! \nTaom turini tanlang\uD83C\uDF65");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList =  new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83E\uDD58 Milliy taom");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF54 Fast-food");
        row1.add(button1);
        rowList.add(row1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF70 Desert");
        row1.add(button2);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅\uFE0F Qaytish");
        row3.add(button3);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage rustilimenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Добро пожаловать в меню вкусных блюд Holly \uD83C\uDF65");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83E\uDD58 Национальные блюда");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF54 Фаст-фуд");
        row1.add(button1);
        rowList.add(row1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF70 Десерт");
        row1.add(button2);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅\uFE0F Назад");
        row3.add(button3);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage ingliztilimenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Welcome to Holly’s delicious food menu! \uD83C\uDF65");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList =  new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83E\uDD58 National dish");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF54 Fast-food");
        row1.add(button1);
        rowList.add(row1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF70 Dessert");
        row1.add(button2);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅\uFE0F Go back");
        row3.add(button3);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage milliytaommenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menu dan ozingizga kerakli bo'limni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList =  new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("Palov va Guruchli taomlar");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("Non va Xamirli taomlar");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Go'shtli taomlar");
        row2.add(button2);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Sabzavotli va Sho'rva taomlari");
        row3.add(button3);
        rowList.add(row3);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Ichimliklar");
        row4.add(button4);
        rowList.add(row4);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("⬅\uFE0F Qaytish");
        row5.add(button5);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }


}
