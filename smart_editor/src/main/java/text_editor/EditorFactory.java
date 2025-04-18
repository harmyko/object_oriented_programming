package main.java.text_editor;

import java.util.ArrayList;

public abstract class EditorFactory {
    public abstract Editor createEditor();

    protected ArrayList<String> dictionary;
    protected ArrayList<String> targetDictionary;

    public void setDictionary(ArrayList<String> dictionary) {
        this.dictionary = dictionary;
    }

    public void setTargetDictionary(ArrayList<String> targetDictionary) {
        this.targetDictionary = targetDictionary;
    }
}

