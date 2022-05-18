package org.example.models;

/*
 * Простой класс с данными, единственный обязательный атрибут - продолжительность блока в секундах.
 * если добавить работу с ОРМ, можно добавлять эти объекты в Хранилища для кеширования и экономии памяти. В даном задании
 * Хранилища содержат уже заранее определенные хард-кор строки.
 */
public abstract class Model {
    protected int durationInSeconds;

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}
