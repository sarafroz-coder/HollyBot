package sarafrozalogiya;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class HollyBot extends TelegramLongPollingBot {
    private static final Logger log = LoggerFactory.getLogger(HollyBot.class);
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
            if (text.equals("\uD83C\uDF54 Fast-foood")){
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
                    execute(hollyBotService.rusfastfoodmenu(chatId));
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
            if (text.equals("\uD83C\uDF54  Fast-food")){
                try {
                    execute(hollyBotService.inglisfastfoodmenu(chatId));
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
                    execute(hollyBotService.xitoyfastfoodmenu(chatId));
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
            if (text.equals("\uD83C\uDF5B Palov va Guruchli taomlar")){
                try {
                    execute(hollyBotService.Palovvaguruchlitaom(chatId));
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
            if (text.equals("\uD83C\uDF5C Sabzavotli va Sho'rva taomlari")){
                try {
                    execute(hollyBotService.sabzovotlitaommenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83E\uDD42 Ichimliklar")){
                try {
                    execute(hollyBotService.ichimli(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF6E Shirin va desertlar")){
                try {
                    execute(hollyBotService.desert(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("◀\uFE0F Qaytish")){
                try {
                    execute(hollyBotService.ozbektilimenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83E\uDD67 Keks va pechenye")){
                try {
                    execute(hollyBotService.keksvapechenya(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("⏪ Qaytish")){
                try {
                    execute(hollyBotService.ozbektilimenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("↩\uFE0F Qaytish")){
                try {
                    execute(hollyBotService.ozbektilimenu(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF6C Shirinliklar va konfetlar")){
                try {
                    execute(hollyBotService.shirinlilarvakanfetlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF54\uD83E\uDD6A Burgerlar va sendvichlar")){
                try {
                    execute(hollyBotService.Burgersendvich(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF55 Pizza va pechtaomlar")){
                try {
                    execute(hollyBotService.Pizzapechtaomlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF5F Tuzli snacklar")){
                try {
                    execute(hollyBotService.tuzlisnack(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF67 Muzqaymoq va sovuq desertlar")){
                try {
                    execute(hollyBotService.Muzqaymoqvasovuqdesertlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83E\uDD6E Pirog va tortlar")){
                try {
                    execute(hollyBotService.Pirogvatortlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83E\uDED0 Mevali desertlar")){
                try {
                    execute(hollyBotService.Mevalidesertlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("\uD83C\uDF2D Tez tayyorlanadigan xalqaro taomlar")){
                try {
                    execute(hollyBotService.teztayyorlanadiganxalqarotaomlar(chatId));
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
            if (data.equals("shashluId")){
                try {
                    execute(hollyBotService.shashli(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("dimlamaId")){
                try {
                    execute(hollyBotService.dimlama(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("mastavaId")){
                try {
                    execute(hollyBotService.mastava(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("sabzavotliqovurilgantaomId")){
                try {
                    execute(hollyBotService.sabzavotliqovurilgantaom(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("tabakaId")){
                try {
                    execute(hollyBotService.tabaka(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qchoyId")){
                try {
                    execute(hollyBotService.choyqora(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("ychoyId")){
                try {
                    execute(hollyBotService.yashilchoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("lchoyId")){
                try {
                    execute(hollyBotService.limonchoy(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qatiqId")){
                try {
                    execute(hollyBotService.qatiq(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("ayronId")){
                try {
                    execute(hollyBotService.ayron(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("suzmaId")){
                try {
                    execute(hollyBotService.suzma(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("anorsharbatiId")){
                try {
                    execute(hollyBotService.anorsharbat(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("holvaId")){
                try {
                    execute(hollyBotService.halva(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("chakchakId")){
                try {
                    execute(hollyBotService.chakchak(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("sumalakId")){
                try {
                    execute(hollyBotService.sumalak(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qandId")){
                try {
                    execute(hollyBotService.qand(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("yongoqId")){
                try {
                    execute(hollyBotService.yongoqchala(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("pirogId")){
                try {
                    execute(hollyBotService.pirog(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("muffinId")){
                try {
                    execute(hollyBotService.muffin(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("cupcakeId")){
                try {
                    execute(hollyBotService.cupcake(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("cookieId")){
                try {
                    execute(hollyBotService.cookie(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("biscuitId")){
                try {
                    execute(hollyBotService.biscuit(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("brownieId")){
                try {
                    execute(hollyBotService.brownie(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("doublburgId")){
                try {
                    execute(hollyBotService.doubleburg(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("gamburgId")){
                try {
                    execute(hollyBotService.gamburg(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("chiknburgId")){
                try {
                    execute(hollyBotService.cheeknburg(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("clubsandwichId")){
                try {
                    execute(hollyBotService.clabsandwich(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("shokoladId")){
                try {
                    execute(hollyBotService.chocolate(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("truffId")){
                try {
                    execute(hollyBotService.truff(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("karamelId")){
                try {
                    execute(hollyBotService.karamel(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("marshmellowId")){
                try {
                    execute(hollyBotService.marshmellow(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("pralineId")){
                try {
                    execute(hollyBotService.praline(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("margaritaId")){
                try {
                    execute(hollyBotService.margarit(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("pepperoniId")){
                try {
                    execute(hollyBotService.pepperoni(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("bbqburgId")){
                try {
                    execute(hollyBotService.bbqpizza(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("veganoizzaId")){
                try {
                    execute(hollyBotService.veganpizza(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("friesId")){
                try {
                    execute(hollyBotService.fries(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("mozzarellasticksId")){
                try {
                    execute(hollyBotService.mozzarellasticks(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("onionringsId")){
                try {
                    execute(hollyBotService.onionrings(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("nachosId")){
                try {
                    execute(hollyBotService.Nachos(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("icecreamId")){
                try {
                    execute(hollyBotService.icecream(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("gelatoId")){
                try {
                    execute(hollyBotService.gelato(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("sorbetId")){
                try {
                    execute(hollyBotService.sorbet(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("frozenyogurtId")){
                try {
                    execute(hollyBotService.frozenyogurt(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("milkshakeId")){
                try {
                    execute(hollyBotService.milkshake(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("cheesecakeId")){
                try {
                    execute(hollyBotService.cheesecake(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("applepieId")){
                try {
                    execute(hollyBotService.applepie(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("chocolatecakeId")){
                try {
                    execute(hollyBotService.chocolatecake(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("fruittartId")){
                try {
                    execute(hollyBotService.fruittart(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("fruitsaladId")){
                try {
                    execute(hollyBotService.fruitsalad(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("compoteId")){
                try {
                    execute(hollyBotService.compote(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("jellyId")){
                try {
                    execute(hollyBotService.jelly(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("hotdogId")){
                try {
                    execute(hollyBotService.hotdog(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("tacosId")){
                try {
                    execute(hollyBotService.tacos(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("burritoId")){
                try {
                    execute(hollyBotService.burrito(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("shawarmaId")){
                try {
                    execute(hollyBotService.shawarma(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }



//            palov
            if (data.equals("plyuspalovId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(hollyBotService.palovPlyus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("minuspalovId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(hollyBotService.palovMinus(chatId));

                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
//            lagmon
            if (data.equals("plyuslagmonId")){
                EditMessageReplyMarkup editMessageReplyMarkup =  new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(hollyBotService.lagmonplyus(chatId));
                try {
                   execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("minuslagmonId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(hollyBotService.lagmonminus(chatId));

                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
//            shorva
            if (data.equals("minusshorvaId")){
                EditMessageReplyMarkup editMessageReplyMarkup =  new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(hollyBotService.shorvaminus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("plyusshorvaId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(hollyBotService.shorvaplyus(chatId));

                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

//            manti
            if (data.equals("minusmantiId")){
                EditMessageReplyMarkup editMessageReplyMarkup =  new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(hollyBotService.mantiminus(chatId));
                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("plyusmantiId")){
                EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
                editMessageReplyMarkup.setChatId(chatId);
                editMessageReplyMarkup.setMessageId(messageId);
                editMessageReplyMarkup.setReplyMarkup(hollyBotService.mantiplyus(chatId));

                try {
                    execute(editMessageReplyMarkup);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }




            if (data.equals("savatId")){
                try {
                    execute(hollyBotService.savat(chatId));
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
            if (data.equals("qaytishqaytishId")){
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
            if (data.equals("oldorqaqaytishId")){
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
            if (data.equals("orqastkrqaytId")){
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
            if (data.equals("qaytishIdgfdg")){
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
            if (data.equals("qaytishqaytishstikerlioxirida")){
                try {
                    execute(hollyBotService.desetmenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
                    execute(deleteMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("oldidaborqaytishshrinlinikiId")){
                try {
                    execute(hollyBotService.desetmenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
                    execute(deleteMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishboshidaikitafastfooduzbbrinchisiId")){
                try {
                    execute(hollyBotService.fastfoodmenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
                    execute(deleteMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishoxiridaikitalifastfooduzbikinchisiId")){
                try {
                    execute(hollyBotService.fastfoodmenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
                    execute(deleteMessage);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("oldidaoxiridaqaytishfastfooduchnchisiId")){
                try {
                    execute(hollyBotService.fastfoodmenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("oldiorqaqaytishIdmuzqaymoq")){
                try {
                    execute(hollyBotService.desetmenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("oldidaikitaqaytishpirogId")){
                try {
                    execute(hollyBotService.desetmenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishoxiridaikitamevaliId")){
                try {
                    execute(hollyBotService.desetmenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (data.equals("qaytishfastfooduzb4cisiId")){
                try {
                    execute(hollyBotService.fastfoodmenu(chatId));
                    DeleteMessage deleteMessage = new DeleteMessage();
                    deleteMessage.setChatId(chatId);
                    deleteMessage.setMessageId(messageId);
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
