package cn.aurora_x.android.sqliteoperation.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.aurora_x.android.sqliteoperation.WordsDBHelper;

/**
 * Helper class for providing sample word for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class WordContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<WordItem> ITEMS = new ArrayList<WordItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, WordItem> ITEM_MAP = new HashMap<String, WordItem>();

    static {
        // Add some sample items.
    }

    private static void addItem(WordItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of word.
     */
    public static class WordItem {
        public final String id;
        public final String word;

        public WordItem(String id, String word) {
            this.id = id;
            this.word = word;
        }
        @Override
        public String toString() {
            return word;
        }
    }
}
