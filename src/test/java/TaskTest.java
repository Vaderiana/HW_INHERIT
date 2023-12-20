//package Task;

import org.example.Epic;
import org.example.Meeting;
import org.example.SimpleTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {

    @Test
    public void testSimpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSimpleTaskNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testEpicMatches(){
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Хлеб");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testEpicNotMatches() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Бананы");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingMatches() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Приложение НетоБанка");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingMatches1() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Выкатка 3й версии приложения");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingNotMatches() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Изменение интерфейса");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
}