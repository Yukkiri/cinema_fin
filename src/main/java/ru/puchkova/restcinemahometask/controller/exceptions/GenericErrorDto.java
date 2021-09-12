package ru.puchkova.restcinemahometask.controller.exceptions;

public class GenericErrorDto {

    private String errorText;

    public GenericErrorDto() {
    }

    public GenericErrorDto(String errorText) {
        this.errorText = errorText;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }
}
