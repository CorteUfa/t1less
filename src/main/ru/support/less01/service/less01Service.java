package ru.support.less01.service;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import ru.support.less01.endPoint.OnLoadConf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Sitdikov I.F.
 * @version 1
 * @year 2024
 * @apiNote
 */


public class less01Service {

    @Contract(pure = true)
    @NotNull
    public static String getRandomVerbs()
    {
        Random randomizer = new Random();
        List list = OnLoadConf.list;
        String random = list.get(randomizer.nextInt(list.size())).toString();
     return random;
    }

    public static boolean setNewVerbs(String newVerbs)
    {

        OnLoadConf.add(newVerbs);
        return true;
    }


    public static List getList()
    {
        List<String> list = new ArrayList<>();
        try
        {
            // В условиях задачи не указано как и кам образом заполнять
            list.add("Секрет в том, чтобы начать.");
            list.add("Чем больше вы делаете, тем больше вы можете.");
            list.add("Будьте вдохновением для себя и других.");
            list.add("Ваше ограничение — это только ваш разум.");
            list.add("Сделайте каждый день своим шедевром.");
            list.add("Усердие — это мать удачи.");
            list.add("Нельзя попасть в цель, не попытавшись.");
            list.add("Рост начинается там, где заканчивается комфорт.");
            list.add("Никто не может помешать вам мечтать больше, чем вы сами.");

        } catch (Exception e)
        {

        }
        return list;
    }

}
