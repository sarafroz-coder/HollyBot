package sarafrozalogiya;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;


public class HollyBotService {
    public SendMessage desert(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan desertni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>rowList = new  ArrayList<>();
        List<InlineKeyboardButton>row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Halva");
        button.setCallbackData("halvaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Chak-chak");
        button.setCallbackData("chakchakId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Sumalak,");
        button.setCallbackData("sumalakId");

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qand");
        button.setCallbackData("qandId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Jemli pirog");
        button.setCallbackData("pirogId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Yongoqchala");
        button.setCallbackData("yongoqId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendPhoto halva (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/15"));
        sendPhoto.setCaption("Halva \nNarxi:donasi 19.390");
        return sendPhoto;
    }
    public SendPhoto sumalak (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/13"));
        sendPhoto.setCaption("Sumalak \nNarxi:donasi 17.490");
        return sendPhoto;
    }
    public SendPhoto chakchak (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/14"));
        sendPhoto.setCaption(" Chak-chak \nNarxi:donasi 69.000");
        return sendPhoto;
    }
    public SendPhoto qand (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/16"));
        sendPhoto.setCaption("Qand \nNarxi:donasi 8.000");
        return sendPhoto;
    }
    public SendPhoto pirog (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/30"));
        sendPhoto.setCaption("Suzma \nNarxi:donasi 250.000");
        return sendPhoto;
    }
    public SendPhoto yongoqchala (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/31"));
        sendPhoto.setCaption("Yongoqchala \nNarxi:donasi 130.000");
        return sendPhoto;
    }

    public SendMessage fastfoodmenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menu dan o'zingizga kerakli bo'limni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF54\uD83E\uDD6A Burgerlar va sendvichlar");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55 Pizza va pechtaomlar");
        row1.add(button1);


        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF5F Tuzli snacklar");
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF2D Tez tayyorlanadigan xalqaro taomlar");
        row2.add(button3);
        rowList.add(row2);


        KeyboardButton button4 = new KeyboardButton();
        button4.setText("⏪ Qaytish");
        row2.add(button4);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage teztayyorlanadiganxalqarotaomlar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>rowList = new  ArrayList<>();

        List<InlineKeyboardButton>row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Hot dog");
        button.setCallbackData("hotdogId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Tacos");
        button.setCallbackData("tacosId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Burrito");
        button.setCallbackData("burritoId");

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shawarma");
        button.setCallbackData("shawarmaId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }
    public SendPhoto hotdog (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/59"));
        sendPhoto.setCaption(" Hot dog \nMazali sosiska, yumshoq bulochka va maxsus sous bilan ✨\n" +
                "Narxi: 17.000\uD83D\uDCB8");
        return sendPhoto;
    }
    public SendPhoto tacos (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/54"));
        sendPhoto.setCaption("Tacos  \nYumshoq tortilla ichiga mazali go‘sht, sabzavotlar va sous solib tayyorlanadi ✨\n" +
                "Narxi: 19.000\uD83D\uDCB8");


    }
    public SendPhoto burrito (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/52"));
        sendPhoto.setCaption("Burrito  \nYumshoq lavash ichiga go‘sht, guruch, loviya va sabzavotlar solib tayyorlanadi ✨\n" +
                "Narxi: 21.000\uD83D\uDCB8");
        return sendPhoto;
    }
    public SendPhoto shawarma (Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/53"));
        sendPhoto.setCaption("Shawarma \nYumshoq lavash ichiga mazali go‘sht, sabzavotlar va maxsus sous solib o‘raladi ✨\n" +
                "Narxi: 20.000\uD83D\uDCB8");
        return sendPhoto;
    }


    public SendMessage Pirogvatortlar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan desrtni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>>rowList = new  ArrayList<>();

        List<InlineKeyboardButton>row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Cheesecake");
        button.setCallbackData("cheesecakeId");
        row.add(button);
        rowList.add(row);

        row =  new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Apple pie");
        button.setCallbackData("applepieId");
        row.add(button);
        rowList.add(row);

        button =  new InlineKeyboardButton();
        button.setText("Chocolate cake");
        button.setCallbackData("chocolatecakeId");
        row.add(button);

        row =  new ArrayList<>();
        button =  new InlineKeyboardButton();
        button.setText("Fruit tart");
        button.setCallbackData("fruittartId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("");
        button.setCallbackData("");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

//
    }
    public SendPhoto cheesecake(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/107"));
        sendPhoto.setCaption("Cheesecake \nShirin va mazali, haqiqiy mevalar bn shirinlik🍰\n" +
                "Narxi: 54.000\uD83D\uDCB8");
        return sendPhoto;
    }
    public SendPhoto applepie(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/108"));
        sendPhoto.setCaption("Apple tie \n Yumshoq va olmali  pirog tabiiy ta’mi juda yoqimli ✨\n" +
                "Narxi: 28.000\uD83D\uDCB8");
        return sendPhoto;
    }
    public SendPhoto chocolatecake(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/110"));
        sendPhoto.setCaption("Chocolate cake \nshokoladli, sut qo‘shilmagan, svejy va muzdek desert \uD83C\uDF67\n" +
                "Narxi: 46.000 so‘m \uD83D\uDCB8");
        return sendPhoto;
    }
    public SendPhoto fruittart(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/109"));
        sendPhoto.setCaption("Fruit tart \nMalina,pistali qimmat desert \uD83C\uDF66✨\n" +
                "Narxi: 38.000 so‘m \uD83D\uDCB8");
        return sendPhoto;

    }
    public SendPhoto milkshake(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/99"));
        sendPhoto.setCaption("Milkshake \nSovuq, quyuq va mazali ichimlik. Jazirama kunlar uchun a’lo tanlov ✨\n" +
                "Narxi: 42.000 \uD83D\uDCB8");
        return sendPhoto;
    }



    }



