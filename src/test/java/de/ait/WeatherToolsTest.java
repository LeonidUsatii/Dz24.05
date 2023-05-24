package de.ait;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class WeatherToolsTest {

    @DisplayName("Спокойствие, скорость ветра равна 0.0")
    @ParameterizedTest
    @CsvSource({
            "0, false, 'Спокойствие, скорость ветра равна 0.0'"
    })


    public void WeatherTools_test1_ReturnedTrue(double speed, boolean isGusty, String message) {
        assertEquals(message,WeatherTools.getWindDescription(0, false));
    }

    @DisplayName("Спокойствие, скорость ветра равна 0.0")
    @ParameterizedTest
    @CsvSource({
            "0, false, 'Спокойствие, скорость ветра равна 0.0'"
    })


    public void WeatherTools_test1_ReturnedFalse(double speed, boolean isGusty, String message) {
        assertEquals(message,WeatherTools.getWindDescription(1, false));
    }

    @DisplayName("Лёгкий ветер, скорость ветра равна до 5.0")
    @ParameterizedTest
    @CsvSource({
            "1, false, 'Лёгкий ветер, скорость ветра равна до 5.0'",
            "2, false, 'Лёгкий ветер, скорость ветра равна до 5.0'",
            "3, false, 'Лёгкий ветер, скорость ветра равна до 5.0'",
            "4, false, 'Лёгкий ветер, скорость ветра равна до 5.0'",
            "5, false, 'Лёгкий ветер, скорость ветра равна до 5.0'"
    })


    public void WeatherTools_test2_ReturnedTrue(double speed, boolean isGusty, String message) {
        assertEquals(message,WeatherTools.getWindDescription(5, false));
    }

    @DisplayName("Лёгкий ветер, скорость ветра равна до 5.0")
    @ParameterizedTest
    @CsvSource({
            "1, false, 'Лёгкий ветер, скорость ветра равна до 5.0'",
            "2, false, 'Лёгкий ветер, скорость ветра равна до 5.0'",
            "3, false, 'Лёгкий ветер, скорость ветра равна до 5.0'",
            "4, false, 'Лёгкий ветер, скорость ветра равна до 5.0'",
            "5, false, 'Лёгкий ветер, скорость ветра равна до 5.0'"
    })


    public void WeatherTools_test2_ReturnedFalse(double speed, boolean isGusty, String message) {
        assertEquals(message,WeatherTools.getWindDescription(6, false));
    }

    @DisplayName("Порывистый легкий бриз, скорость ветра равна до ")
    @ParameterizedTest
    @CsvSource({
            "8, true, 'Порывистый нежный бриз, скорость ветра равна до 19.0'",
            "12, true, 'Порывистый нежный бриз, скорость ветра равна до 19.0'",
            "13, true, 'Порывистый нежный бриз, скорость ветра равна до 19.0'",
            "17, true, 'Порывистый нежный бриз, скорость ветра равна до 19.0'",
            "19, true, 'Порывистый нежный бриз, скорость ветра равна до 19.0'"
    })


    public void WeatherTools_test3_ReturnedTrue(double speed, boolean isGusty, String message) {
        assertEquals(message,WeatherTools.getWindDescription(19, true));
        assertEquals(message,WeatherTools.getWindDescription(16, true));
    }



}