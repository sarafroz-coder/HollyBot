package sarafrozalogiya;

import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.Serializable;
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

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("\uD83C\uDDE8\uD83C\uDDF3 Xitoy tili");
        button.setCallbackData("xitoyId");
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

    public SendMessage milliytaommenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menu dan ozingizga kerakli bo'limni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList =  new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF5B Palov va Guruchli taomlar");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF5E Non va Xamirli taomlar");
        row1.add(button1);
        rowList.add(row1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83E\uDD69 Go'shtli taomlar");
        row1.add(button2);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF5C Sabzavotli va Sho'rva taomlari");
        row2.add(button3);
        rowList.add(row2);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83E\uDD42 Ichimliklar");
        row2.add(button4);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("◀\uFE0F Qaytish");
        row3.add(button5);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage Palovvaguruchlitaom(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>rowList = new ArrayList<>();

        List<InlineKeyboardButton>row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Palov");
        button.setCallbackData("palovId");
        row.add(button);
        rowList.add(row);


        button =  new InlineKeyboardButton();
        button.setText("Lag'mon");
        button.setCallbackData("lagmonId");
        row.add(button);


        row = new ArrayList<>();
        button =  new InlineKeyboardButton();
        button.setText("Sho'rva");
        button.setCallbackData("shorvaId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("");

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendPhoto palov(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/2"));
        sendPhoto.setCaption("Palov \nNarxi:50.000");
        return sendPhoto;
    }
    public SendPhoto lagmon(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/3"));
        sendPhoto.setCaption("Lag'mon \nNarxi:54.000");
        return sendPhoto;
    }
    public SendPhoto shorva(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/11"));
        sendPhoto.setCaption("Sho'rva \nNarxi:35.000");
        return sendPhoto;
    }


//    mubini non va xamirlisi shotga bo'ladi

    public SendMessage nonvaxamr(Long chatId){
    SendMessage sendMessage = new SendMessage();
    sendMessage.setChatId(chatId);
    sendMessage.setText("O'zingizga yoqqan taomni tanlang:");

    InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
    List<List<InlineKeyboardButton>>rowList = new  ArrayList<>();
    List<InlineKeyboardButton>row = new ArrayList<>();
    InlineKeyboardButton button = new InlineKeyboardButton();
    button.setText("Somsa");
    button.setCallbackData("somsaId");
    row.add(button);
    rowList.add(row);


    button = new InlineKeyboardButton();
    button.setText("Manti");
    button.setCallbackData("mantiId");


    row = new ArrayList<>();
    button = new InlineKeyboardButton();
    button.setText("Chuchvara");
    button.setCallbackData("chuchvaraId");
    row.add(button);
    rowList.add(row);

    button = new InlineKeyboardButton();
    button.setText("Lepeshka");
    button.setCallbackData("lepeshkaId");
    row.add(button);

    row = new ArrayList<>();
    button =  new InlineKeyboardButton();
    button.setText("Norin");
    button.setCallbackData("norinId");
    row.add(button);
    rowList.add(row);

    button = new InlineKeyboardButton();
    button.setText("\uD83D\uDC48\uD83C\uDFFB Qaytish");
    button.setCallbackData("qaytId");
    row.add(button);

    inlineKeyboardMarkup.setKeyboard(rowList);
    sendMessage.setReplyMarkup(inlineKeyboardMarkup);
    return sendMessage;
}
    public SendPhoto somsa (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/4"));
        sendPhoto.setCaption("Somsa \nNarxi:donasi - 8.000");
        return sendPhoto;
    }
    public SendPhoto manti (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/5"));
        sendPhoto.setCaption("Manti \nNarxi:donasi 8.000");
        return sendPhoto;
    }
    public SendPhoto chuchvara (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/8"));
        sendPhoto.setCaption("Chuchvara \nNarxi:donasi 35.000");
        return sendPhoto;
    }
    public SendPhoto lepeshka (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/8"));
        sendPhoto.setCaption("Lepeshka \nNarxi:donasi 6.000");
        return sendPhoto;
    }
    public SendPhoto norin(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/23"));
        sendPhoto.setCaption("Norin \nNarxi:47.000");
        return sendPhoto;
    }



//    Go'shtli taomlar
    public SendMessage goshtlitaom(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>rowList =  new ArrayList<>();

        List<InlineKeyboardButton>row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Shashlik");
        button.setCallbackData("shashluId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Dimlama");
    }






    public SendMessage fastfoodmenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menu dan o'zingizga kerakli bo'limni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF54\uD83E\uDD6A Burgerlar va sendvichlar");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55 Pizza va pechtaomlar");
        row1.add(button1);
        rowList.add(row1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF5F Tuzli snacklar");
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF2D Tez tayyorlanadigan xalqaro taomlar");
        row2.add(button3);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("⏪ Qaytish");
        row3.add(button4);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage desetmenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menu dan o'zingizga kerakli bo'limni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83E\uDD67 Keks va pechenye");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF6C Shirinliklar va konfetlar");
        row1.add(button1);
        rowList.add(row1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF67 Muzqaymoq va sovuq desertlar");
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF30 Milliy shirinliklar");
        row2.add(button3);
        rowList.add(row2);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83E\uDD6E Pirog va tortlar");
        row2.add(button4);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("↩\uFE0F Qaytish");
        row3.add(button5);
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

    public SendMessage rusmilytaommenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите из меню вам нужное");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF5B Плов и рисовые блюда");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF5E Хлеб и блюдо из теста");
        row1.add(button1);
        rowList.add(row1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83E\uDD69 Мясные блюда");
        row1.add(button2);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83E\uDD57 Овощные блюда и супы");
        row2.add(button3);
        rowList.add(row2);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83E\uDD42 Напитки");
        row2.add(button4);


        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("◀\uFE0F Назад");
        row3.add(button5);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage rusfastfood(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите из меню вам нужное");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList =  new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF54\uD83E\uDD6A Бургеры и сендвичи");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55 Блюда из печи и пицца");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF5F Соленные снеки");
        row2.add(button2);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF2D Быстро питание национальные блюда");
        row3.add(button3);
        rowList.add(row3);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("⏪ Назад");
        row5.add(button5);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage rusdesert(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите из меню вам нужное");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow>rowList =  new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83E\uDD67 Кексы и печенье");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF6C Конфеты и сладости");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF66 Морожное и холодные десерты");
        row2.add(button2);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83E\uDD6E Нациальные сладости");
        row3.add(button3);
        rowList.add(row3);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("↩\uFE0F Назад");
        row5.add(button5);
        rowList.add(row5);

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

    public SendMessage inglsmilytaommenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose what you need from the menu");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF5B Pilaf and Rice Dishes");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF5E Bread and Dough Dishes");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83E\uDD69 Meat Dishes");
        row1.add(button2);

        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83E\uDD57 Vegetable Dishes and Soups");
        row2.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83E\uDD42 Drinks");
        row2.add(button4);

        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("◀\uFE0F Back");
        row3.add(button5);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage inglizfastfood(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose what you need from the menu");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF54\uD83E\uDD6A Burgers and Sandwiches");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55 Oven Dishes and Pizza");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF5F Salty Snacks");
        row2.add(button2);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF2D Fast Food National Dishes");
        row3.add(button3);
        rowList.add(row3);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("⏪ Back");
        row5.add(button5);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage inglsdesert(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose what you need from the menu");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83E\uDD67 Muffins and Cookies");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF6C Candies and Sweets");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF66 Ice Cream and Cold Desserts");
        row2.add(button2);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83E\uDD6E National Sweets");
        row3.add(button3);
        rowList.add(row3);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("↩\uFE0F Back");
        row5.add(button5);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }




    public SendMessage xitoymenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("欢迎来到 Holly 的美味菜单 \uD83C\uDF65");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83E\uDD58 传统菜肴");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF54 快餐");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF70 甜点");
        row1.add(button2);
        rowList.add(row1);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅️ 返回");
        row3.add(button3);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage xitoymilliytaom(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("请从菜单中选择您需要的内容");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF5B 抓饭和米饭菜肴");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF5E 面包和面食");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83E\uDD69 肉类菜肴");
        row1.add(button2);

        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83E\uDD57 蔬菜菜肴和汤类");
        row2.add(button3);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83E\uDD42 饮品");
        row2.add(button4);

        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("◀\uFE0F 返回");
        row3.add(button5);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage xitoyfastfood(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("请从菜单中选择您需要的内容");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF54\uD83E\uDD6A 汉堡和三明治");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55 烤制菜肴和披萨");
        row1.add(button1);
        rowList.add(row1);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF5F 咸味小吃");
        row2.add(button2);
        rowList.add(row2);

        KeyboardRow row3 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF2D 快餐式民族菜肴");
        row3.add(button3);
        rowList.add(row3);

        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("⏪ 返回");
        row5.add(button5);
        rowList.add(row5);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage xitoydesert(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("请从菜单中选择您需要的内容");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83E\uDD67 纸杯蛋糕和饼干");
        row.add(button);
        rowList.add(row);


        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF6C 糖果和甜品");
        row.add(button1);


        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF66 冰淇淋和冷甜点");
        row1.add(button2);
        rowList.add(row1);


        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83E\uDD6E 传统甜食");
        row1.add(button3);


        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("↩\uFE0F 返回");
        row2.add(button5);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }


}


