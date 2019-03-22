package by.training.task3.entity;

import by.training.task3.parser.LexemeParser;
import by.training.task3.pattern.Component;
import by.training.task3.pattern.TextComposite;

//                                   / |->Word-->char
//Text->Paragraph->Sentence->Lexeme-| |->Expression-->char
//                                   \ |->Punctuation-->char

public class Lexeme extends TextComposite implements Component {

    public Lexeme(String lexemeString) {
        super(LexemeParser.getInstance().parse(lexemeString));
    }


}
