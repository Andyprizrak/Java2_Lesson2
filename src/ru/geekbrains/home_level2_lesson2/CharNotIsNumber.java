package ru.geekbrains.home_level2_lesson2;

public class CharNotIsNumber extends RuntimeException {


    public CharNotIsNumber (String s) {
        super (s);
    }
  public CharNotIsNumber (Throwable cause) {
        super(cause);
    }
    public CharNotIsNumber (String message, Throwable cause) {
        super(message, cause);
    }


}
