package org.example.blocks;

import org.example.models.Model;
import org.example.paids.PaidType;

/*
 * Блок Трансляции содержит ссылку на Модель и ссылку на Тип Оплаты, позволяя в дальнейшем перетасовывать эти Объекты
 * и создавать новые виды блоков трансляции (к примеру песни на заказ, за которые можно получать оплату, или социальную
 * рекламу, за которую оплата может не поступать). Использование ссылок, позволяет не плодить лишние объекты
 * а переиспользовать уже существующие (одна и та же песня или реклама могут появится много раз в пределах даже одной
 * трансляции)
 * определение типа облаты в конструкторах наследников данного класа происходит с помощью фабричного метода
 */
public abstract class BroadcastBlock {
    protected Model blockInfo;

    protected PaidType paidType;

    public Model getBlockInfo() {
        return blockInfo;
    }

    public float total() {
        return paidType == null ? 0 : paidType.total(blockInfo);
    }

    public void run() {
        System.out.println("-- " + blockInfo.toString());
    }

    public boolean isPaid() {
        return paidType == null;
    }
}
