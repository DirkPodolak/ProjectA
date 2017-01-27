package de.podolak.test.util;

import com.google.common.base.Strings;

import java.util.regex.Pattern;

public final class StringUtil {

    private static final Pattern TWO_OR_MORE_CHARACTERS_PATTERN = Pattern.compile(".*[A-Za-z].*[A-Za-z].*");

    private StringUtil() {
        // mit Absicht leer
    }

    public static boolean isBlank(final String text) {
        return Strings.isNullOrEmpty(text) || text.trim().isEmpty();
    }

    public static boolean isNotBlank(final String text) {
        return !Strings.isNullOrEmpty(text) && !text.trim().isEmpty();
    }

    public static boolean containsTwoOrMoreCharacters(final String s) {
        return s != null
                && !s.isEmpty()
                && TWO_OR_MORE_CHARACTERS_PATTERN.matcher(s).find();
    }

}
