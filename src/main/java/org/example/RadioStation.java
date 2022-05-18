package org.example;

import java.util.ArrayList;

/*
 * Станция в данном задании может быть только одна, поэтому используем станицию как синглтон
 */
public class RadioStation {
    private static RadioStation radioStation;
    private ArrayList<Broadcast> broadcasts;

    private RadioStation() {
        this.broadcasts = new ArrayList<>();
    }

    public static RadioStation getInstance() {
        if(radioStation == null) {
            radioStation = new RadioStation();
        }
        return radioStation;
    }

    public ArrayList<Broadcast> getBroadcasts(){
        return this.broadcasts;
    }

    public void addBroadcast(Broadcast broadcast) {
        broadcasts.add(broadcast);
    }

    /*
    * Что бы посчитать прибыльность радиостанции или запустить вещание используем цепочки обязоностей, запуская
    * команды по следующей цепи объектов Станция-Трансляция-БлокТрансляции
    * В случае подсчета прибыльности, результат возвращается по той же цепочке обратно на уровни выше
    * С помошью этих цепочек можно легко запускать как сразу все вещание, так и отдельные трансляции или отдельные блоки
    * не привязываясь к реализации. Такая же ситуация с расчетом прибыльности, можно легко расчитывать прибыльность
    * каждого слоя
    * */
    public float total() {
        float total = 0;
        for(Broadcast broadcast: broadcasts){
            total += broadcast.total();
        }
        return total;
    }

    public void run() {
        for(Broadcast broadcast: broadcasts){
            System.out.println("Радиостанция начинает вещание");
            broadcast.run();
        }
    }
}
