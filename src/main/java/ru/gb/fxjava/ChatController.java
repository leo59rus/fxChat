package ru.gb.fxjava;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ChatController {
    @FXML//когда делаем приватными сверху ставим форму
    private TextArea historyArea;//верхнее окно
    @FXML
    private TextField userAnswer;//окно ввода снизу


    public void clickSend(ActionEvent actionEvent) {
        final String answer = userAnswer.getText();
        String text = answer;
        historyArea.appendText(text + "\n");
        userAnswer.clear();
        userAnswer.requestFocus();//курсор

    }

    public void clickClearChat() {//menu
        historyArea.clear();
        historyArea.appendText("\n--- Я всё удалил, можешь опять "
                                       + "про писать про Чака)" +
                                       " ---\n");
    }

    public void clickExit(ActionEvent actionEvent) {//menu
        System.exit(0);
    }

    public void clickRules() {
        historyArea.appendText("\n***********************************\n" +
                                       "Правила чата: \nПиши " +
                                       "сюда что " + "хочешь, \n" +
                                       "хоть про Чака Норриса, " +
                                       "\nвсё" + " " + "равно этого" +
                                       " никто не " + "увидит\n\n" +
                                       "***********************************\n");
    }
}