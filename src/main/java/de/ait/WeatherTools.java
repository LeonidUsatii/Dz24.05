package de.ait;

public class WeatherTools {

    public static String getWindDescription(double speed, boolean isGusty) {
        if (speed < 1 && !isGusty) {
            speed = 0;
            return "Спокойствие, скорость ветра равна " + speed;
        } else if (speed <= 5 && !isGusty) {
            speed = 5;
            return "Лёгкий ветер, скорость ветра равна до " + speed;
        } else if (speed <= 11 && !isGusty) {
            speed = 11;
            return "Легкий бриз, скорость ветра равна до " + speed;
        } else if (speed <= 11 && isGusty) {
            speed = 11;
            return "Порывистый легкий бриз, скорость ветра равна до " + speed;
        } else if (speed <= 19 && !isGusty) {
            speed = 19;
            return "Нежный бриз, скорость ветра равна до " + speed;
        } else if (speed <= 19 && isGusty) {
            speed = 19;
            return "Порывистый нежный бриз, скорость ветра равна до " + speed;
        } else if (speed <= 28 && !isGusty) {
            speed = 28;
            return "Умеренный бриз, скорость ветра равна до " + speed;
        } else if (speed <= 28 && isGusty) {
            speed = 28;
            return "Порывистый умеренный бриз, скорость ветра равна до " + speed;
        } else if (speed <= 38 && !isGusty) {
            speed = 38;
            return "Свежий бриз, скорость ветра равна до " + speed;
        } else if (speed <= 38 && isGusty) {
            speed = 38;
            return "Порывистый свежий бриз, скорость ветра равна до " + speed;
        } else {
            speed = 40;
            return "Штормовое предупреждение, скорость ветра равна до " + speed;
        }

        }

    }

