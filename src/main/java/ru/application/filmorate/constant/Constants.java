package ru.application.filmorate.constant;

import java.util.Set;

/**
 * Класс констант
 */
public class Constants {
    public static final String UNKNOWN = "unknown";
    public static final String DIRECTOR = "director";
    public static final String TITLE = "title";
    public static final String DIRECTOR_AND_TITLE = "director,title";
    public static final String TITLE_AND_DIRECTOR = "title,director";
    public static final Set<String> SAMPLE = Set.of(DIRECTOR, TITLE, DIRECTOR_AND_TITLE, UNKNOWN, TITLE_AND_DIRECTOR);
}
