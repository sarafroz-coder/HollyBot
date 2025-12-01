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
    public SendMessage language(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Holly bot ga xush kelibsiz \nTilni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
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


    //    ozbe tili menusini qaytish stikeri "⬅️ Qaytish"
    public SendMessage ozbektilimenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Holly mazali taomlar menusiga xush kelibsiz! \nTaom turini tanlang\uD83C\uDF65");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83E\uDD58 Milliy taom");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF54 Fast-foood");
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


    //    milliytaommenusi qaytish stikeri "◀️ Qaytish"
    public SendMessage milliytaommenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menu dan ozingizga kerakli bo'limni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

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

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83C\uDF6E Shirin va desertlar");
        row4.add(button6);
        rowList.add(row4);

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

    //    palov va guruchli taomlar menu
    public SendMessage Palovvaguruchlitaom(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Palov");
        button.setCallbackData("palovId");
        row.add(button);
        rowList.add(row);


        button = new InlineKeyboardButton();
        button.setText("Lag'mon");
        button.setCallbackData("lagmonId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sho'rva");
        button.setCallbackData("shorvaId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("qayturId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    int palov = 0;

    public SendPhoto palov(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/2"));
        sendPhoto.setCaption("Palov \nSersuv go‘shti, yumshoq guruchi va xushbo‘y ziravorlari bilan to‘yimli ta’m beradi✨ \nNarxi:50.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuspalovId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(palov));
        button.setCallbackData("countid");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuspalovId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }

    public InlineKeyboardMarkup palovPlyus(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/2"));
        sendPhoto.setCaption("Palov \nSersuv go‘shti, yumshoq guruchi va xushbo‘y ziravorlari bilan to‘yimli ta’m beradi✨ \nNarxi:50.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuspalovId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(++palov));
        button.setCallbackData("countid");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuspalovId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup palovMinus(Long chatId) {

        if (palov > 0) {
            palov--;
        }

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/2"));
        sendPhoto.setCaption("Palov \nSersuv go‘shti, yumshoq guruchi va xushbo‘y ziravorlari bilan to‘yimli ta’m beradi✨ \nNarxi:50.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuspalovId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(palov));
        button.setCallbackData("countid");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuspalovId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    int lagmon = 0;

    public SendPhoto lagmon(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/3"));
        sendPhoto.setCaption("Lag'mon \nQizil yog‘da qovurilgan xamir, shirali sabzavotlar va mazali ta’mi bilan juda to‘yimli✨ \nNarxi:54.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuslagmonId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(lagmon));
        button.setCallbackData("lagmoncountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuslagmonId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }

    public InlineKeyboardMarkup lagmonplyus(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/3"));
        sendPhoto.setCaption("Lag'mon \nQizil yog‘da qovurilgan xamir, shirali sabzavotlar va mazali ta’mi bilan juda to‘yimli✨ \nNarxi:54.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuslagmonId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(++lagmon));
        button.setCallbackData("lagmoncountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuslagmonId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup lagmonminus(Long chatId) {

        if (lagmon > 0) {
            lagmon--;
        }

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/3"));
        sendPhoto.setCaption("Lag'mon \nQizil yog‘da qovurilgan xamir, shirali sabzavotlar va mazali ta’mi bilan juda to‘yimli✨ \nNarxi:54.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuslagmonId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(lagmon));
        button.setCallbackData("lagmoncountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuslagmonId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    int shorva = 0;

    public SendPhoto shorva(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/11"));
        sendPhoto.setCaption("Sho'rva \nYengil va mazali bulon, yumshoq go‘sht hamda sabzavotlar bilan iliq ta’m beradi✨ \nNarxi:35.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusshorvaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(shorva));
        button.setCallbackData("shorvacountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusshorvaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }

    public InlineKeyboardMarkup shorvaminus(Long chatId) {

        if (shorva > 0) {
            shorva--;
        }

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/11"));
        sendPhoto.setCaption("Sho'rva \nYengil va mazali bulon, yumshoq go‘sht hamda sabzavotlar bilan iliq ta’m beradi✨ \nNarxi:35.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusshorvaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(shorva));
        button.setCallbackData("shorvacountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusshorvaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup shorvaplyus(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/11"));
        sendPhoto.setCaption("Sho'rva \nYengil va mazali bulon, yumshoq go‘sht hamda sabzavotlar bilan iliq ta’m beradi✨ \nNarxi:35.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusshorvaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(++shorva));
        button.setCallbackData("shorvacountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusshorvaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    //    mubini non va xamirlisi shotga bo'ladi
//    non va xamirli menu
    public SendMessage nonvaxamr(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Somsa");
        button.setCallbackData("somsaId");
        row.add(button);
        rowList.add(row);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Chuchvara");
        button.setCallbackData("chuchvaraId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Manti");
        button.setCallbackData("mantiId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Lepeshka");
        button.setCallbackData("lepeshkaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Norin");
        button.setCallbackData("norinId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("qaytId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    int somsa = 0;

    public SendPhoto somsa(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/4"));
        sendPhoto.setCaption("Somsa \nGo‘shtli somsa o‘zining yumshoq ta’mi va xushbo‘y pishig‘i bilan ajralib turadi✨ \nNarxi:donasi - 8.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minussomsaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(shorva));
        button.setCallbackData("somsacountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("somsashorvaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;

    }

    public InlineKeyboardMarkup somsaplyus(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/4"));
        sendPhoto.setCaption("Somsa \nGo‘shtli somsa o‘zining yumshoq ta’mi va xushbo‘y pishig‘i bilan ajralib turadi✨ \nNarxi:donasi - 8.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minussomsaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(++shorva));
        button.setCallbackData("somsacountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("somsashorvaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;

    }

    public InlineKeyboardMarkup somsaminus(Long chatId) {

        if (somsa > 0) {
            somsa--;
        }

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/4"));
        sendPhoto.setCaption("Somsa \nGo‘shtli somsa o‘zining yumshoq ta’mi va xushbo‘y pishig‘i bilan ajralib turadi✨ \nNarxi:donasi - 8.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minussomsaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(shorva));
        button.setCallbackData("somsacountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("somsashorvaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;

    }


    int manti = 0;
    public SendPhoto manti(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/5"));
        sendPhoto.setCaption("Manti \nMol go'shti bilan manti\uD83C\uDF1F \nNarxi:donasi 8.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusmantiId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(manti));
        button.setCallbackData("manticountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusmantiId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup mantiplyus(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/5"));
        sendPhoto.setCaption("Manti \nMol go'shti bilan manti\uD83C\uDF1F \nNarxi:donasi 8.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusmantiId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(++manti));
        button.setCallbackData("manticountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusmantiId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup mantiminus(Long chatId) {

        if (manti >0){
            manti--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/5"));
        sendPhoto.setCaption("Manti \nMol go'shti bilan manti\uD83C\uDF1F \nNarxi:donasi 8.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusmantiId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(manti));
        button.setCallbackData("manticountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusmantiId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }





    int chuchvara = 0;
    public SendPhoto chuchvara(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/6"));
        sendPhoto.setCaption("Chuchvara \nMol go'shti, sabzi, piyoz, o'simlik yog'i, sarimsoq, pomidor, maydanoz\uD83C\uDF1F \nNarxi:donasi 35.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuschuchvaraId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(chuchvara));
        button.setCallbackData("chuchvaracountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuschuchvaraId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup chuchvaraplyus(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/6"));
        sendPhoto.setCaption("Chuchvara \nMol go'shti, sabzi, piyoz, o'simlik yog'i, sarimsoq, pomidor, maydanoz\uD83C\uDF1F \nNarxi:donasi 35.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuschuchvaraId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(++chuchvara));
        button.setCallbackData("chuchvaracountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuschuchvaraId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup chuchvaraminus(Long chatId) {

        if (chuchvara >0) {
            chuchvara--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/6"));
        sendPhoto.setCaption("Chuchvara \nMol go'shti, sabzi, piyoz, o'simlik yog'i, sarimsoq, pomidor, maydanoz\uD83C\uDF1F \nNarxi:donasi 35.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuschuchvaraId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(chuchvara));
        button.setCallbackData("chuchvaracountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuschuchvaraId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    int lepeshka = 0;
    public SendPhoto lepeshka(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/8"));
        sendPhoto.setCaption("Lepeshka \nU o'ziga xos hid va yumshoq tuzilishga ega\uD83C\uDF1F \nNarxi:donasi 6.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuslepeshkaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(lepeshka));
        button.setCallbackData("lepeshkacountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuslepeshkaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup plyuslepeshka(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/8"));
        sendPhoto.setCaption("Lepeshka \nU o'ziga xos hid va yumshoq tuzilishga ega\uD83C\uDF1F \nNarxi:donasi 6.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuslepeshkaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(++chuchvara));
        button.setCallbackData("lepeshkacountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuslepeshkaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup minuslepeshka(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/8"));
        sendPhoto.setCaption("Lepeshka \nU o'ziga xos hid va yumshoq tuzilishga ega\uD83C\uDF1F \nNarxi:donasi 6.000\uD83D\uDCB8");

        if (lepeshka >0) {
            lepeshka--;
        }
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minuslepeshkaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(chuchvara));
        button.setCallbackData("lepeshkacountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyuslepeshkaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    int norin = 0;
    public SendPhoto norin(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/23"));
        sendPhoto.setCaption("Norin \nOt go'shti taomga boy ta'm va xushbo'y hid beradi. Dimlangan xamir va o'simlik moyi bir tekis qovurishini ta'minlaydi. Bulyon ta'mga sharbat va chuqurlik qo'shadi\uD83C\uDF1F \nNarxi:47.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusnorinId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(++norin));
        button.setCallbackData("norincountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusnorinId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup plyusnorin(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/23"));
        sendPhoto.setCaption("Norin \nOt go'shti taomga boy ta'm va xushbo'y hid beradi. Dimlangan xamir va o'simlik moyi bir tekis qovurishini ta'minlaydi. Bulyon ta'mga sharbat va chuqurlik qo'shadi\uD83C\uDF1F \nNarxi:47.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusnorinId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(norin));
        button.setCallbackData("norincountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusnorinId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup minusnorin(Long chatId) {
        if (norin >0) {
            norin--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/23"));
        sendPhoto.setCaption("Norin \nOt go'shti taomga boy ta'm va xushbo'y hid beradi. Dimlangan xamir va o'simlik moyi bir tekis qovurishini ta'minlaydi. Bulyon ta'mga sharbat va chuqurlik qo'shadi\uD83C\uDF1F \nNarxi:47.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusnorinId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(norin));
        button.setCallbackData("norincountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusnorinId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }

    //    Go'shtli taomlar menu
    public SendMessage goshtlitaom(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Shashlik");
        button.setCallbackData("shashluId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Dimlama");
        button.setCallbackData("dimlamaId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("qaytishqaytishId");
        row.add(button);
        rowList.add(row);


        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;


    }

    int shashli = 0;
    public SendPhoto shashli(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/9"));
        sendPhoto.setCaption("Shashlik \nKo‘mirda qizarib pishgan, shirali va xushbo‘y ta’mi bilan ishtahani ochadi✨ \nNarxi:18.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusshashliId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(shashli));
        button.setCallbackData("shashlicountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusshashliId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return sendPhoto;
    }
    public InlineKeyboardMarkup plyusshashli(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/9"));
        sendPhoto.setCaption("Shashlik \nKo‘mirda qizarib pishgan, shirali va xushbo‘y ta’mi bilan ishtahani ochadi✨ \nNarxi:18.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusshashliId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(++shashli));
        button.setCallbackData("shashlicountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusshashliId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }
    public InlineKeyboardMarkup minusshashli(Long chatId) {
        if (shashli >0) {
            shashli--;
        }
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/9"));
        sendPhoto.setCaption("Shashlik \nKo‘mirda qizarib pishgan, shirali va xushbo‘y ta’mi bilan ishtahani ochadi✨ \nNarxi:18.000\uD83D\uDCB8");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(" - ");
        button.setCallbackData("minusshashliId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText(String.valueOf(shashli));
        button.setCallbackData("shashlicountId");
        row.add(button);

        button = new InlineKeyboardButton();
        button.setText(" + ");
        button.setCallbackData("plyusshashliId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Savat");
        button.setCallbackData("savatId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendPhoto.setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
    }


    public SendPhoto dimlama(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/7"));
        sendPhoto.setCaption("Dimlama \nGo‘sht, kartoshka va sabzavotlar o‘z sharbatida yumshoq pishib, ta’omga boy va iliq ta’m beradi✨\n" +
                "Narxi:28.000\uD83D\uDCB8");
        return sendPhoto;
    }


    //    sabzovotli va shorva taomlar menu
    public SendMessage sabzovotlitaommenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Mastava");
        button.setCallbackData("mastavaId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sabzavotli qovurilgan taomlar");
        button.setCallbackData("sabzavotliqovurilgantaomId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Tabaka");
        button.setCallbackData("tabakaId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("oldorqaqaytishId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendPhoto mastava(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/32"));
        sendPhoto.setCaption("Mastava \nYengil sho‘rva, yumshoq guruch va sabzavotlar aralashuvi bilan iliq va mazali ta’m beradi✨\n" +
                "Narxi: 18.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto sabzavotliqovurilgantaom(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/12"));
        sendPhoto.setCaption("Sabzavotli qovurilgan taom \nYengil qovurilgan sabzavotlar o‘zining tabiiy shirinligi va xushbo‘y ta’mi bilan ishtahani ochadi✨\n" +
                "Narxi: 15.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto tabaka(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/29"));
        sendPhoto.setCaption("Tabaka \nYupqa qilib qovurilgan tovuq go‘shti tashqarisi qizarib, ichi esa yumshoq va shirali ta’m beradi ✨\n" +
                "Narxi: 32.000\uD83D\uDCB8");
        return sendPhoto;
    }


    //    ichimlik menu
    public SendMessage ichimli(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Choy qora");
        button.setCallbackData("qchoyId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Yashil qora");
        button.setCallbackData("ychoyId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Limonli choy");
        button.setCallbackData("lchoyId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qatiq");
        button.setCallbackData("qatiqId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Ayron");
        button.setCallbackData("ayronId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Suzma");
        button.setCallbackData("suzmaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Anor sharbati");
        button.setCallbackData("anorsharbatiId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("qaytishIdgfdg");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendPhoto choyqora(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/19"));
        sendPhoto.setCaption("Qora choy \nYengil va xushbo‘y issiq ichimlik, har qanday taomga mos ✨\n" +
                "Narxi: 3.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto yashilchoy(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/17"));
        sendPhoto.setCaption("Yashil choy \nYengil va yoqimli ta’mga ega, tanani tetiklashtiradi ✨\n" +
                "Narxi: 3.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto limonchoy(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/18"));
        sendPhoto.setCaption("Limon choy \nYengil nordon ta’mi bilan tetiklashtiruvchi issiq ichimlik ✨\n" +
                "Narxi: 6.000\uD83D\uDCB8\n" +
                "\n");
        return sendPhoto;
    }

    public SendPhoto qatiq(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/28"));
        sendPhoto.setCaption("Qatiq \nSovuq va foydali sut mahsuloti, taomlarga a’lo qo‘shimcha ✨\n" +
                "Narxi: 7.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto ayron(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/34"));
        sendPhoto.setCaption("Ayron \nSovuq va yengil ichimlik, chanqoqni tezda qoldiradi ✨\n" +
                "Narxi: 5.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto suzma(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/26"));
        sendPhoto.setCaption("Suzma \nQalin, mazali va tabiiy sut mahsuloti. Taomlar bilan a’lo ketadi, ayniqsa issiq ovqatlarga yanada mazalik qo‘shimcha ✨\n" +
                "Narxi: 8.000 \uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto anorsharbat(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/27"));
        sendPhoto.setCaption("Anor sharbati \nTabiiy va vitaminlarga boy, chanqoqni zo‘r qoldiradi ✨\n" +
                "Narxi: 11.000\uD83D\uDCB8");
        return sendPhoto;
    }

    //    desert menu
    public SendMessage desert(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan desertni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();
        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Holva");
        button.setCallbackData("holvaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Chak-chak");
        button.setCallbackData("chakchakId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Sumalak");
        button.setCallbackData("sumalakId");
        row.add(button);
        rowList.add(row);


        button = new InlineKeyboardButton();
        button.setText("Qand");
        button.setCallbackData("qandId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Yongoqchala");
        button.setCallbackData("yongoqId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Jemli pirog");
        button.setCallbackData("pirogId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("orqastkrqaytId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    //    desert ichidigi
    public SendPhoto halva(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/15"));
        sendPhoto.setCaption("Halva \nShirin, yumshoq va og‘izda erib ketadigan mazali desert ✨\n" +
                "Choy bilan birga juda zo‘r ketadi!\n" +
                "Narxi: 14.000 \uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto sumalak(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/13"));
        sendPhoto.setCaption("Sumalak \nBahor ramzi bo‘lgan, tabiiy don va unning ko‘p soat qaynatilib tayyorlangan shirin taomi. Juda foydali va to‘yimli ✨\n" +
                "Narxi: 16.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto chakchak(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/14"));
        sendPhoto.setCaption(" Chak-chak \nShirin, mayin va asal aralashmasida qovurilgan xamirdan tayyorlanadigan mazali desert ✨\n" +
                "Narxi: 21.000 \uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto qand(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/16"));
        sendPhoto.setCaption("Qand \nShirin ta’m beruvchi oddiy mahsulot, choy va shirinliklar uchun a’lo qo‘shimcha ✨\n" +
                "Narxi: 4.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto pirog(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/30"));
        sendPhoto.setCaption("Suzma \nMayin xamir va mazali ichlikdan tayyorlangan shirin pishiriq, choy yoniga juda mos ✨\n" +
                "Narxi: 30.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto yongoqchala(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/31"));
        sendPhoto.setCaption("Yongoqchala \nXushbo‘y, qarsildoq va shirin-ta’mli yengil tamaddi ✨\n" +
                "Narxi: 2.000\uD83D\uDCB8");
        return sendPhoto;
    }


    //   FAST FOOD UZB
//  fast food uzb ni menusini qaytishini stikeri ⏪
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

    //    1-si
    public SendMessage Burgersendvich(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga burgerni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Double burger");
        button.setCallbackData("doublburgId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Gamburger");
        button.setCallbackData("gamburgId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Chicken burger");
        button.setCallbackData("chiknburgId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Club sandwich");
        button.setCallbackData("clubsandwichId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("qaytishboshidaikitafastfooduzbbrinchisiId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendPhoto doubleburg(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/33"));
        sendPhoto.setCaption("Double burger \nIkki qavat shirali kotlet, eritilgan pishloq va yangi sabzavotlar bilan to‘yimli ta’m ✨\n" +
                "Narxi: 28.000");
        return sendPhoto;
    }

    public SendPhoto gamburg(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/38"));
        sendPhoto.setCaption("Gamburger \nhirali kotlet, yangi sabzavotlar va mazali sous bilan to‘yimli ta’m ✨\n" +
                "Narxi: 20.000");
        return sendPhoto;
    }

    public SendPhoto cheeknburg(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/39"));
        sendPhoto.setCaption("Chicken burger \nShirali kotlet, eritilgan pishloq va yangi sabzavotlar bilan mazali ta’m ✨\n" +
                "Narxi: 34.000");
        return sendPhoto;
    }

    public SendPhoto clabsandwich(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/37"));
        sendPhoto.setCaption("Club sandwich \nQatlam-qatlam qovurilgan non, tovuq go‘shti, pishloq va yangi sabzavotlar bilan mazali ta’m ✨\n" +
                "Narxi: 32.000");
        return sendPhoto;
    }

    //    2-si
    public SendMessage Pizzapechtaomlar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Margaritta");
        button.setCallbackData("margaritaId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Pepperoni");
        button.setCallbackData("pepperoniId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("BBQ chicken");
        button.setCallbackData("bbqburgId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Vegan pizza");
        button.setCallbackData("veganoizzaId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("qaytishoxiridaikitalifastfooduzbikinchisiId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendPhoto margarit(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/57"));
        sendPhoto.setCaption("Margaritta pizza \nYumshoq xamir, eritilgan pishloq va mazali pomidor sousi bilan tayyorlanadi ✨\n" +
                "Narxi: 65.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto pepperoni(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/56"));
        sendPhoto.setCaption("Pepperoni pizza \nMazali pomidor sousi, ko‘p pishloq va achchiq-pepperoni kolbasalari bilan tayyorlanadi ✨\n" +
                "Narxi: 80.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto bbqpizza(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/111"));
        sendPhoto.setCaption("BBQ pizza \nYumshoq xamir, barbekyu sousi, eritilgan pishloq va mazali go‘sht bilan tayyorlanadi ✨\n" +
                "Narxi: 120.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto veganpizza(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/58"));
        sendPhoto.setCaption("Vegan pizza \nYangi sabzavotlar, pomidor sousi va o‘simlik asosidagi pishloq bilan tayyorlanadi ✨\n" +
                "Narxi: 88.000\uD83D\uDCB8");
        return sendPhoto;
    }

    //    3-si
    public SendMessage tuzlisnack(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Fries");
        button.setCallbackData("friesId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Mozzarella sticks");
        button.setCallbackData("mozzarellasticksId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Onion rings");
        button.setCallbackData("onionringsId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Nachos");
        button.setCallbackData("nachosId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("oldidaoxiridaqaytishfastfooduchnchisiId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendPhoto fries(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/116"));
        sendPhoto.setCaption(" Fries\uD83C\uDF5F \n Oltinrang qovurilgan kartoshka bo‘laklari, tashqarisi qarsildoq, ichi yumshoq ✨\n" +
                "Narxi: 15.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto mozzarellasticks(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/115"));
        sendPhoto.setCaption("Mozzarella sticks \nchida cho‘ziluvchan mozzarella pishlog‘i, usti qarsildoq qobiq bilan qovuriladi ✨\n" +
                "Narxi: 22.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto onionrings(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/114"));
        sendPhoto.setCaption("Onion rings \nQarsildoq qobiqda qovurilgan mazali piyoz halqalari, yengil va mazali gazak ✨\n" +
                "Narxi: 23.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto Nachos(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/113"));
        sendPhoto.setCaption("Nachos \nQarsildoq makkajo‘xori chipslari, ustiga eritilgan pishloq va sous bilan ✨\n" +
                "Narxi: 20.000\uD83D\uDCB8");
        return sendPhoto;
    }

    //    4-si
    public SendMessage teztayyorlanadiganxalqarotaomlar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Hot dog");
        button.setCallbackData("hotdogId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Tacos");
        button.setCallbackData("tacosId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Shawarma");
        button.setCallbackData("shawarmaId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Burrito");
        button.setCallbackData("burritoId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("qaytishfastfooduzb4cisiId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendPhoto hotdog(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/59"));
        sendPhoto.setCaption(" Hot dog \nMazali sosiska, yumshoq bulochka va maxsus sous bilan ✨\n" +
                "Narxi: 17.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto tacos(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/54"));
        sendPhoto.setCaption("Tacos  \nYumshoq tortilla ichiga mazali go‘sht, sabzavotlar va sous solib tayyorlanadi ✨\n" +
                "Narxi: 19.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto burrito(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/52"));
        sendPhoto.setCaption("Burrito  \nYumshoq lavash ichiga go‘sht, guruch, loviya va sabzavotlar solib tayyorlanadi ✨\n" +
                "Narxi: 21.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto shawarma(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/53"));
        sendPhoto.setCaption("Shawarma \nYumshoq lavash ichiga mazali go‘sht, sabzavotlar va maxsus sous solib o‘raladi ✨\n" +
                "Narxi: 20.000\uD83D\uDCB8");
        return sendPhoto;
    }


    //  desert qaytishi "↩️ Qaytish"
    public SendMessage desetmenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Menu dan o'zingizga kerakli bo'limni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

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
        button3.setText("\uD83E\uDD6E Pirog va tortlar");
        row2.add(button3);
        rowList.add(row2);

        KeyboardRow row4 = new KeyboardRow();
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83E\uDED0 Mevali desertlar");
        row4.add(button4);


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

    //    1 qaytishi
    public SendMessage keksvapechenya(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Muffin");
        button.setCallbackData("muffinId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Cupcake");
        button.setCallbackData("cupcakeId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Cookie");
        button.setCallbackData("cookieId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Biscuit");
        button.setCallbackData("biscuitId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Brownie");
        button.setCallbackData("brownieId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("qaytishqaytishstikerlioxirida");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;

    }

    public SendPhoto muffin(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/67"));
        sendPhoto.setCaption("Muffin \nYumshoq, hidi yoqimli va shirin ta’mga ega pishiriq. Choy‑nonushta uchun a’lo tanlov ✨\n" +
                "Narxi: 11.000 \uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto cupcake(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/69"));
        sendPhoto.setCaption("Cupcake \nYumshoq, mayin va juda mazali desert ✨ Har bir luqmasi bayramdek!\n" +
                "Narxi: 10.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto cookie(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/72"));
        sendPhoto.setCaption("Cookie \nTashqi tomoni yumshoq, ichi esa shirin va xushbo‘y ta’mga ega pechenye \uD83C\uDF6A\n" +
                "Choy yoki qahvaga ajoyib qo‘shimcha ✨\n" +
                "Narxi: 5.000 \uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto biscuit(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/74"));
        sendPhoto.setCaption("Biscuit \nYengil, mazali va choy yoniga juda mos\uD83D\uDCCD\n" +
                "Har bir luqmasi mayin va yoqimli ta’m bilan to‘ldirilgan✨\n" +
                "Narxi: 13.000\uD83D\uDCB8");
        return sendPhoto;

    }

    public SendPhoto brownie(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/92"));
        sendPhoto.setCaption("Brownie" +
                "Har bir luqmada boy shokolad ta’mi! ✨\n" +
                "Narxi: 9.000\uD83D\uDCB8");
        return sendPhoto;
    }

    //    2 qaytishi
    public SendMessage shirinlilarvakanfetlar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan taomni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Shokolad");
        button.setCallbackData("shokoladId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Truff");
        button.setCallbackData("truffId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Karamel");
        button.setCallbackData("karamelId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Marshmellow");
        button.setCallbackData("marshmellowId");
        row.add(button);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Praline");
        button.setCallbackData("pralineId");
        row.add(button);
        rowList.add(row);


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("oldidaborqaytishshrinlinikiId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;
    }

    public SendPhoto chocolate(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/78"));
        sendPhoto.setCaption("Chocolate \nShirin va kayfiyatni ko‘targan mazali shokolad \uD83C\uDF6B\n" +
                "Narxi: 11.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto truff(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/80"));
        sendPhoto.setCaption("Truff \nNozik shokoladli lazzat, yumshoq va eritiluvchi desert ✨\n" +
                "Narxi: 18.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto karamel(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/82"));
        sendPhoto.setCaption("Karamel \nShirin va yumshoq karamel – og’izda eriydigan mazasi bilan choy yoki qahvaga a’lo qo‘shimcha! ✨ \nNarxi:5.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto marshmellow(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/84"));
        sendPhoto.setCaption("Marshmellow \nYengil, yumshoq, shakarli va havo kabi mayin shirinlik. Ko‘pincha issiq shokoladga solib ichiladi yoki olovda qizdirib yeyiladi ✨ \nNarxi:8.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto praline(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/86"));
        sendPhoto.setCaption("Praline \nYong'oqli shkolodli praline, shiringina shirinlik✨ \nNarxi:8.000\uD83D\uDCB8");
        return sendPhoto;
    }

    //    3qaytishi
    public SendMessage Muzqaymoqvasovuqdesertlar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan desrtni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Ice cream");
        button.setCallbackData("icecreamId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Gelato");
        button.setCallbackData("gelatoId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Sorbet");
        button.setCallbackData("sorbetId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Frozen yogurt");
        button.setCallbackData("frozenyogurtId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Milkshake");
        button.setCallbackData("milkshakeId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("oldiorqaqaytishIdmuzqaymoq");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;


    }

    public SendPhoto icecream(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/88"));
        sendPhoto.setCaption("Ice cream \nSovuq va mazali, haqiqiy rohat bag‘ishlaydigan shirinlik ✨\n" +
                "Narxi: 20.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto gelato(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/90"));
        sendPhoto.setCaption("Gelato \nGelato — Yumshoq va qaymoqli italyan muzqaymog‘i, tabiiy ta’mi juda yoqimli ✨\n" +
                "Narxi: 32.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto sorbet(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/94"));
        sendPhoto.setCaption("Sorbet \nMevali, sut qo‘shilmagan, yengil va muzdek desert \uD83C\uDF67\n" +
                "Narxi: 24.000 so‘m \uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto frozenyogurt(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/96"));
        sendPhoto.setCaption("Frozen yogurt \nYengil,sutli va foydali desert \uD83C\uDF66✨\n" +
                "Narxi: 38.000 so‘m \uD83D\uDCB8");
        return sendPhoto;

    }

    public SendPhoto milkshake(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/99"));
        sendPhoto.setCaption("Milkshake \nSovuq, quyuq va mazali ichimlik. Jazirama kunlar uchun a’lo tanlov ✨\n" +
                "Narxi: 42.000 \uD83D\uDCB8");
        return sendPhoto;
    }

    //    4qaytishi
    public SendMessage Pirogvatortlar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan desrtni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Cheesecake");
        button.setCallbackData("cheesecakeId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Apple pie");
        button.setCallbackData("applepieId");
        row.add(button);
        rowList.add(row);

        button = new InlineKeyboardButton();
        button.setText("Chocolate cake");
        button.setCallbackData("chocolatecakeId");
        row.add(button);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Fruit tart");
        button.setCallbackData("fruittartId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("oldidaikitaqaytishpirogId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;


    }

    public SendPhoto cheesecake(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/107"));
        sendPhoto.setCaption("Cheesecake \nShirin va mazali, haqiqiy mevalar bn shirinlik🍰\n" +
                "Narxi: 54.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto applepie(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/108"));
        sendPhoto.setCaption("Apple tie \n Yumshoq va olmali  pirog tabiiy ta’mi juda yoqimli ✨\n" +
                "Narxi: 28.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto chocolatecake(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/110"));
        sendPhoto.setCaption("Chocolate cake \nshokoladli, sut qo‘shilmagan, svejy va muzdek desert \uD83C\uDF67\n" +
                "Narxi: 46.000 so‘m \uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto fruittart(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/109"));
        sendPhoto.setCaption("Fruit tart \nMalina,pistali qimmat desert \uD83C\uDF66✨\n" +
                "Narxi: 38.000 so‘m \uD83D\uDCB8");
        return sendPhoto;

    }

    //    5qaytishi
    public SendMessage Mevalidesertlar(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga yoqqan desrtni tanlang!:");

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>();

        List<InlineKeyboardButton> row = new ArrayList<>();
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Fruit salad");
        button.setCallbackData("fruitsaladId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Compote");
        button.setCallbackData("compoteId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Jelly");
        button.setCallbackData("jellyId");
        row.add(button);
        rowList.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText("Qaytish ⬅\uFE0F");
        button.setCallbackData("qaytishoxiridaikitamevaliId");
        row.add(button);
        rowList.add(row);

        inlineKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        return sendMessage;


    }

    public SendPhoto fruitsalad(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/101"));
        sendPhoto.setCaption("Fruit salad \nShirin va mazali, haqiqiy mevalar bn shirinlik🍰\n" +
                "Narxi: 54.000\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto compote(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/117"));
        sendPhoto.setCaption("Compote \n Muzzdek va limonli tabiiy meva ta’mi juda sovuq ✨\n" +
                "Narxi: 58.000(1l.)\uD83D\uDCB8");
        return sendPhoto;
    }

    public SendPhoto jelly(Long chatId) {
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://t.me/hollyBotphoto/105"));
        sendPhoto.setCaption("Jelly \nMalinali jele desert \uD83C\uDF66✨\n" +
                "Narxi: 18.000 so‘m \uD83D\uDCB8");
        return sendPhoto;

    }


    public SendMessage savat(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Savatga qoshilmoqda...");
        return sendMessage;
    }


    public SendMessage rustilimenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Добро пожаловать в меню вкусных блюд Holly \uD83C\uDF65");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

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

    public SendMessage rusmilytaommenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите из меню вам нужное");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

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

    public SendMessage rusfastfoodmenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите нужный раздел из меню");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF54\uD83E\uDD6A Бургеры и сэндвичи");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55 Пицца и блюда из печи");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF5F Солёные снеки");
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF2D Быстрое приготовление международных блюд");
        row2.add(button3);
        rowList.add(row2);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("⏪ Назад");
        row2.add(button4);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage rusdesert(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите из меню вам нужное");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

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


    public SendMessage ingliztilimenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Welcome to Holly’s delicious food menu! \uD83C\uDF65");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

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

    public SendMessage inglsmilytaommenu(Long chatId) {
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

    public SendMessage inglisfastfoodmenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Please choose the section you need from the menu");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF54\uD83E\uDD6A Burgers and Sandwiches");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55 Pizza and Oven-Baked Dishes");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF5F Salty Snacks");
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF2D Quick International Dishes");
        row2.add(button3);
        rowList.add(row2);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("⏪ Back");
        row2.add(button4);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage inglsdesert(Long chatId) {
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


    public SendMessage xitoymenu(Long chatId) {
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

    public SendMessage xitoymilliytaom(Long chatId) {
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

    public SendMessage xitoyfastfoodmenu(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("请选择您需要的菜单分类");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF54\uD83E\uDD6A 汉堡和三明治");
        row.add(button);
        rowList.add(row);

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83C\uDF55 披萨和烤箱料理");
        row1.add(button1);

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF5F 咸味小吃");
        row1.add(button2);

        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF2D 快速制作的国际美食");
        row2.add(button3);
        rowList.add(row2);

        KeyboardButton button4 = new KeyboardButton();
        button4.setText("⏪ 返回");
        row2.add(button4);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage xitoydesert(Long chatId) {
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


