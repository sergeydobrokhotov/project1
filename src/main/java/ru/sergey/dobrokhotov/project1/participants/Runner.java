package ru.sergey.dobrokhotov.project1.participants;

public interface Runner {
    String getName();

    int getMaxLenght();


    int getMaxWeight();

     boolean getSuccess();

     void  setSuccess(boolean success);

     void run();

     void jamp();


}
