package cn.aurora_x.android.fragment_v2.wordList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
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

    private static int wordID=0;

    static {
        // Add some sample items.
        addItem(createWordItem("Apple"));
        addItem(createWordItem("Orange"));
        addItem(createWordItem("Banana"));
        addItem(createWordItem("Lemon"));
    }

    private static void addItem(WordItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static WordItem createWordItem(String word) {
        wordID=wordID+1;
        return new WordItem(String.valueOf(wordID), word);
    }

    /**
     * A dummy item representing a piece of content.
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
